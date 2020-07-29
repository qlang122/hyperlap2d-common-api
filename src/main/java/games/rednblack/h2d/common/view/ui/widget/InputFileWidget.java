/*
 * ******************************************************************************
 *  * Copyright 2015 See AUTHORS file.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *****************************************************************************
 */

package games.rednblack.h2d.common.view.ui.widget;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Cell;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Array;
import com.kotcrab.vis.ui.widget.VisTable;
import com.kotcrab.vis.ui.widget.VisTextButton;
import com.kotcrab.vis.ui.widget.VisTextField;
import com.kotcrab.vis.ui.widget.file.FileChooser;
import com.kotcrab.vis.ui.widget.file.FileChooserListener;
import games.rednblack.h2d.common.view.ui.StandardWidgetsFactory;

/**
 * Created by sargis on 4/3/15.
 */
public class InputFileWidget extends VisTable {
    private static final String TAG = "InputFileWidget";

    private VisTextField textField;
    private VisTextButton browsBtn;
    private Cell<VisTextField> textFieldCell;
    private int textFieldWidth;
    private FileChooser fileChooser;
    private FileHandle value;
    private Array<FileHandle> values;

    public InputFileWidget(FileChooser.Mode mode, FileChooser.SelectionMode selectionMode, boolean multiselectionEnabled, boolean setVisDefaults) {
        super(setVisDefaults);
        initWidget();
        initFileChooser(mode, selectionMode, multiselectionEnabled);
    }

    public InputFileWidget(FileChooser.Mode mode, FileChooser.SelectionMode selectionMode, boolean multiselectionEnabled) {
        this(mode, selectionMode, multiselectionEnabled, true);
    }

    private void initFileChooser(FileChooser.Mode mode, FileChooser.SelectionMode selectionMode, boolean multiselectionEnabled) {
        fileChooser = new HyperLapFileChooser(mode);
        fileChooser.setSelectionMode(selectionMode);
        fileChooser.setMultiSelectionEnabled(multiselectionEnabled);
        fileChooser.setListener(new InputFileWidgetFileChooserListener());
    }

    private void initWidget() {
        textField = StandardWidgetsFactory.createTextField("light");
        textFieldCell = add(textField).growX().fillX().padRight(8).height(21);
        browsBtn = new VisTextButton("Browse");
        add(browsBtn);
        addListener(new InputFileWidgetClickListener());
    }

    public FileHandle getValue() {
        if (fileChooser.isMultiSelectionEnabled()) {
            throw new IllegalStateException("Multiselection is enabled, use 'getValues' instead of 'getValue'");
        }
        return value;
    }

    public void setValue(FileHandle value) {
        this.value = value;
        textField.setText(value.path());
    }

    public Array<FileHandle> getValues() {
        if (!fileChooser.isMultiSelectionEnabled()) {
            throw new IllegalStateException("Multiselection is not enabled, use 'getValue' instead of 'getValues'");
        }
        return values;
    }

    private void setValues(Array<FileHandle> values) {
        this.values = values;
        StringBuilder path = new StringBuilder();
        for (FileHandle handle : values) {
            path.append(handle.path()).append(",");
        }

        // Remove comma in the last character.
        path.deleteCharAt(path.length() - 1);
        textField.setText(path.toString());
    }


    public void setTextFieldWidth(int textFieldWidth) {
        textFieldCell.width(textFieldWidth);
    }

    public void resetData() {
        textField.setText("");
        value = null;
        values = null;
    }

    private class InputFileWidgetClickListener extends ClickListener {
        @Override
        public void clicked(InputEvent event, float x, float y) {
            super.clicked(event, x, y);
            InputFileWidget.this.getStage().addActor(fileChooser.fadeIn());
        }
    }

    private class InputFileWidgetFileChooserListener implements FileChooserListener {

        @Override
        public void selected(Array<FileHandle> files) {
            if (files == null || files.size == 0) {
                Gdx.app.log(TAG, "Error: files array null or empty.");
                return;
            }
            if (files.size == 1) {
                setValue(files.first());
            } else {
                setValues(files);
            }
        }

        @Override
        public void canceled() {

        }
    }
}
