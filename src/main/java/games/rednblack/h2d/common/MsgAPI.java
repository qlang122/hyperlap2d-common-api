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

package games.rednblack.h2d.common;

/**
 * Created by azakhary on 10/23/2015.
 */
public class MsgAPI {

    public static final String GLOBAL_PREFIX = "games.rednblack.editor.HyperLap2D";

    public static final String CHECK_EDITS_ACTION = GLOBAL_PREFIX + ".APP_EXIT";

    public static final String PAUSE = GLOBAL_PREFIX + ".PAUSE";
    public static final String RESUME = GLOBAL_PREFIX + ".RESUME";
    public static final String RENDER = GLOBAL_PREFIX + ".RENDER";
    public static final String RESIZE = GLOBAL_PREFIX + ".RESIZE";
    public static final String DISPOSE = GLOBAL_PREFIX + ".DISPOSE";
    public static final String CREATE = GLOBAL_PREFIX + ".CREATE_BTN_CLICKED";

    public static final String WINDOW_MAXIMIZED = GLOBAL_PREFIX + ".WINDOW_MAXIMIZED";
    public static final String ACTION_FILES_DROPPED = GLOBAL_PREFIX + ".ACTION_DROP";

    public static final String SAVE_EDITOR_CONFIG = GLOBAL_PREFIX + ".SAVE_EDITOR_CONFIG";

    public static final String PROJECT_FILE_CREATED = GLOBAL_PREFIX + ".PROJECT_FILE_CREATED";
    public static final String PROJECT_FILE_DELETED = GLOBAL_PREFIX + ".PROJECT_FILE_DELETED";
    public static final String PROJECT_FILE_MODIFIED = GLOBAL_PREFIX + ".PROJECT_FILE_MODIFIED";

    public static final String SHOW_LOADING_DIALOG = GLOBAL_PREFIX + ".SHOW_LOADING_DIALOG";
    public static final String HIDE_LOADING_DIALOG = GLOBAL_PREFIX + ".HIDE_LOADING_DIALOG";

    public static final String SHOW_BLACK_OVERLAY = GLOBAL_PREFIX + ".SHOW_BLACK_OVERLAY";
    public static final String HIDE_BLACK_OVERLAY = GLOBAL_PREFIX + ".HIDE_BLACK_OVERLAY";

    // tmp events
    public static final String ZOOM_CHANGED = GLOBAL_PREFIX + ".ZOOM_CHANGED";
    public static final String GRID_SIZE_CHANGED = GLOBAL_PREFIX + ".GRID_SIZE_CHANGED";
    public static final String LOCK_LINES_CHANGED = GLOBAL_PREFIX + ".LOCK_LINES_CHANGED";
    public static final String ITEM_DATA_UPDATED = GLOBAL_PREFIX + ".ITEM_DATA_UPDATED";
    public static final String ITEM_PROPERTY_DATA_FINISHED_MODIFYING = GLOBAL_PREFIX + ".ITEM_PROPERTY_DATA_FINISHED_MODIFYING";

    // this should move
    public static final String HIDE_SELECTIONS = GLOBAL_PREFIX + ".HIDE_SELECTIONS";
    public static final String SHOW_SELECTIONS = GLOBAL_PREFIX + ".SHOW_SELECTIONS";
    public static final String ITEM_SELECTION_CHANGED = GLOBAL_PREFIX + ".ITEM_SELECTION_CHANGED";
    public static final String EMPTY_SPACE_CLICKED = GLOBAL_PREFIX + ".EMPTY_SPACE_CLICKED";

    public static final String SCENE_RIGHT_CLICK = GLOBAL_PREFIX + ".SCENE_RIGHT_CLICK";
    public static final String ITEM_RIGHT_CLICK = GLOBAL_PREFIX + ".ITEM_RIGHT_CLICK";

    public static final String LIBRARY_LIST_UPDATED = GLOBAL_PREFIX + ".LIBRARY_LIST_UPDATED";
    public static final String LIBRARY_ACTIONS_UPDATED = GLOBAL_PREFIX + ".LIBRARY_ACTIONS_UPDATED";

    private static final String TOOL_BOX_MEDIATOR_PREFIX = "games.rednblack.editor.view.ui.box.UIToolBoxMediator";
    public static final String TOOL_SELECTED = TOOL_BOX_MEDIATOR_PREFIX + ".TOOL_CHANGED";
    public static final String NEW_TOOL_ADDED = TOOL_BOX_MEDIATOR_PREFIX + ".NEW_TOOL_ADDED";

    private static final String IMAGES_TAB_MEDIATOR_PREFIX = "games.rednblack.editor.view.ui.box.resourcespanel.UIImagesTabMediator";
    public static final String ADD_TARGET = IMAGES_TAB_MEDIATOR_PREFIX + ".ADD_TARGET";
    public static final String REMOVE_TARGET = IMAGES_TAB_MEDIATOR_PREFIX + ".REMOVE_TARGET";
    
    // drop events
    private static final String RESOURCES_BOX_MEDIATOR_PREFIX = "games.rednblack.editor.view.ui.box.UIResourcesBoxMediator";
    public static final String IMAGE_BUNDLE_DROP_SINGLE       = RESOURCES_BOX_MEDIATOR_PREFIX + ".IMAGE_BUNDLE_DROP_SINGLE";
    public static final String IMAGE_BUNDLE_DROP			  = RESOURCES_BOX_MEDIATOR_PREFIX + ".IMAGE_BUNDLE_DROP";

    /**
     * Previous Sandbox class notifications
     */
    public static final String SANDBOX_PREFIX = "games.rednblack.editor.commands.Sandbox";

    public static final String ACTION_KEY_DOWN = SANDBOX_PREFIX + ".ACTION_KEY_DOWN";
    public static final String ACTION_KEY_UP = SANDBOX_PREFIX + ".ACTION_KEY_UP";

    public static final String TOOL_CLICKED = SANDBOX_PREFIX + ".TOOL_CLICKED";

    public static final String ACTION_GROUP_ITEMS = SANDBOX_PREFIX + ".ACTION_GROUP_ITEMS";
    public static final String ACTION_CAMERA_CHANGE_COMPOSITE = SANDBOX_PREFIX + ".ACTION_CAMERA_CHANGE_COMPOSITE";
    public static final String ACTION_CONVERT_TO_BUTTON = SANDBOX_PREFIX + ".ACTION_CONVERT_TO_BUTTON";
    public static final String ACTION_CUT = SANDBOX_PREFIX + ".ACTION_CUT";
    public static final String ACTION_COPY = SANDBOX_PREFIX + ".ACTION_COPY";
    public static final String ACTION_PASTE = SANDBOX_PREFIX + ".ACTION_PASTE";
    public static final String ACTION_DELETE = SANDBOX_PREFIX + ".ACTION_DELETE";
    public static final String ACTION_CREATE_ITEM = SANDBOX_PREFIX + ".ACTION_CREATE_ITEM";

    public static final String ACTION_DELETE_LAYER = SANDBOX_PREFIX + ".ACTION_DELETE_LAYER";
    public static final String ACTION_NEW_LAYER = SANDBOX_PREFIX + ".ACTION_NEW_LAYER";
    public static final String ACTION_SWAP_LAYERS = SANDBOX_PREFIX + ".ACTION_SWAP_LAYERS";
    public static final String ACTION_RENAME_LAYER = SANDBOX_PREFIX + ".ACTION_RENAME_LAYER";

    public static final String ACTION_ADD_COMPONENT = SANDBOX_PREFIX + ".ACTION_ADD_COMPONENT";
    public static final String ACTION_REMOVE_COMPONENT = SANDBOX_PREFIX + ".ACTION_REMOVE_COMPONENT";
    public static final String CUSTOM_VARIABLE_MODIFY = SANDBOX_PREFIX + ".CUSTOM_VARIABLE_MODIFY";

    public static final String SHOW_ADD_LIBRARY_DIALOG = SANDBOX_PREFIX + ".SHOW_ADD_LIBRARY_DIALOG";
    public static final String ACTION_ADD_TO_LIBRARY = SANDBOX_PREFIX + ".ACTION_ADD_TO_LIBRARY";
    public static final String ACTION_ADD_TO_LIBRARY_ACTION = SANDBOX_PREFIX + ".ACTION_ADD_TO_LIBRARY_ACTION";
    public static final String ACTION_ITEMS_MOVE_TO = SANDBOX_PREFIX + ".ACTION_ITEMS_MOVE_TO";
    public static final String ACTION_ITEM_AND_CHILDREN_TO = GLOBAL_PREFIX + ".ACTION_ITEM_AND_CHILDREN_TO";
    public static final String ACTION_ITEM_TRANSFORM_TO = SANDBOX_PREFIX + ".ACTION_ITEM_TRANSFORM_TO";

    public static final String ACTION_CREATE_PRIMITIVE = SANDBOX_PREFIX + ".ACTION_CREATE_PRIMITIVE";

    public static final String ACTION_CREATE_STICKY_NOTE = SANDBOX_PREFIX + ".ACTION_CREATE_STICKY_NOTE";
    public static final String ACTION_REMOVE_STICKY_NOTE = SANDBOX_PREFIX + ".ACTION_REMOVE_STICKY_NOTE";
    public static final String ACTION_MODIFY_STICKY_NOTE = SANDBOX_PREFIX + ".ACTION_MODIFY_STICKY_NOTE";

    public static final String ACTION_SET_SELECTION = SANDBOX_PREFIX + ".ACTION_SET_SELECTION";
    public static final String ACTION_ADD_SELECTION = SANDBOX_PREFIX + ".ACTION_ADD_SELECTION";
    public static final String ACTION_RELEASE_SELECTION = SANDBOX_PREFIX + ".ACTION_RELEASE_SELECTION";
    public static final String ACTION_Z_INDEX_CHANGED = SANDBOX_PREFIX + ".ACTION_Z_INDEX_CHANGED";

    public static final String ACTION_UPDATE_SCENE_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_SCENE_DATA";
    public static final String ACTION_UPDATE_IMAGE_ITEM_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_IMAGE_ITEM_DATA";
    public static final String ACTION_UPDATE_ITEM_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_ITEM_DATA";
    public static final String ACTION_UPDATE_LABEL_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_LABEL_DATA";
    public static final String ACTION_UPDATE_LIGHT_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_LIGHT_DATA";
    public static final String ACTION_UPDATE_COMPOSITE_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_COMPOSITE_DATA";
    public static final String ACTION_UPDATE_PARTICLE_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_PARTICLE_DATA";
    public static final String ACTION_UPDATE_TALOS_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_TALOS_DATA";
    public static final String ACTION_UPDATE_BODY_LIGHT_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_BODY_LIGHT_DATA";
    public static final String ACTION_UPDATE_PHYSICS_BODY_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_PHYSICS_BODY_DATA";
    public static final String ACTION_UPDATE_SENSOR_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_SENSOR_DATA";
    public static final String ACTION_UPDATE_SHADER_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_SHADER_DATA";
    public static final String ACTION_UPDATE_SPRITE_ANIMATION_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_SPRITE_ANIMATION_DATA";
    public static final String ACTION_UPDATE_SPINE_ANIMATION_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_SPINE_ANIMATION_DATA";
    public static final String ACTION_UPDATE_SPRITER_ANIMATION_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_SPRITER_ANIMATION_DATA";
    public static final String ACTION_UPDATE_MESH_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_MESH_DATA";

    public static final String ACTION_ACTIONS_SPRITER_ANIMATION_DATA = SANDBOX_PREFIX + ".ACTION_ACTIONS_SPRITER_ANIMATION_DATA";

    public static final String ACTION_REPLACE_REGION_DATA = SANDBOX_PREFIX + ".ACTION_UPDATE_REGION_DATA";
    public static final String ACTION_REPLACE_SPRITE_ANIMATION_DATA = SANDBOX_PREFIX + ".ACTION_REPLACE_SPRITE_ANIMATION_DATA";
    public static final String ACTION_REPLACE_SPINE_ANIMATION_DATA = SANDBOX_PREFIX + ".ACTION_REPLACE_SPINE_ANIMATION_DATA";

    public static final String ACTION_PLUGIN_PROXY_COMMAND = SANDBOX_PREFIX + ".ACTION_PLUGIN_PROXY_COMMAND";

    public static final String ACTION_EXPORT_PROJECT = SANDBOX_PREFIX + ".ACTION_EXPORT_PROJECT";
    public static final String ACTION_REPACK = SANDBOX_PREFIX + ".ACTION_REPACK";
    public static final String SAVE_EXPORT_PATH = SANDBOX_PREFIX + ".SAVE_EXPORT_SETTINGS";

    // drop down resources
    public static final String ACTION_DELETE_IMAGE_RESOURCE = SANDBOX_PREFIX + ".ACTION_DELETE_IMAGE_RESOURCE";
    public static final String ACTION_DELETE_ATLAS_IMAGE_RESOURCE = SANDBOX_PREFIX + ".ACTION_DELETE_ATLAS_IMAGE_RESOURCE";
    public static final String ACTION_DELETE_SPRITE_ANIMATION_RESOURCE = SANDBOX_PREFIX + ".ACTION_DELETE_SPRITE_ANIMATION_RESOURCE";
    public static final String ACTION_DELETE_SPINE_ANIMATION_RESOURCE = SANDBOX_PREFIX + ".ACTION_DELETE_SPINE_ANIMATION_RESOURCE";
    public static final String ACTION_DELETE_SPRITER_ANIMATION_RESOURCE = SANDBOX_PREFIX + "ACTION_DELETE_SPRITER_ANIMATION_RESOURCE";
    public static final String ACTION_SPRITER_EDIT_ANIMATION_RESOURCE = SANDBOX_PREFIX + "ACTION_SPRITER_EDIT_ANIMATION_RESOURCE";
    public static final String ACTION_DELETE_LIBRARY_ITEM = SANDBOX_PREFIX + ".ACTION_DELETE_LIBRARY_ITEM";
    public static final String ACTION_DELETE_LIBRARY_ACTION = SANDBOX_PREFIX + ".ACTION_DELETE_LIBRARY_ACTION";
    public static final String ACTION_DUPLICATE_LIBRARY_ACTION = SANDBOX_PREFIX + ".ACTION_DUPLICATE_LIBRARY_ACTION";
    public static final String ACTION_EXPORT_LIBRARY_ITEM = SANDBOX_PREFIX + ".ACTION_EXPORT_LIBRARY_ITEM";
    public static final String ACTION_EXPORT_ACTION_ITEM = SANDBOX_PREFIX + ".ACTION_EXPORT_ACTION_ITEM";
    public static final String ACTION_DELETE_PARTICLE_EFFECT = SANDBOX_PREFIX + ".ACTION_DELETE_PARTICLE_EFFECT";
    public static final String ACTION_DELETE_TALOS_VFX = SANDBOX_PREFIX + ".ACTION_DELETE_TALOS_VFX";

    public static final String ACTION_UPDATE_RULER_POSITION = SANDBOX_PREFIX + ".ACTION_UPDATE_RULER_POSITION";
    public static final String ACTION_CHANGE_POLYGON_VERTEX_POSITION = SANDBOX_PREFIX + ".ACTION_UPDATE_POLYGON_VERTEX_POSITION";
    public static final String ACTION_DELETE_POLYGON_VERTEX = SANDBOX_PREFIX + ".ACTION_DELETE_POLYGON_VERTEX";
    public static final String ACTION_CHANGE_ORIGIN_POSITION = SANDBOX_PREFIX + ".ACTION_CHANGE_ORIGIN_POSITION";

    /**
     * Other
     */
    public static final String OPEN_CODE_EDITOR = GLOBAL_PREFIX + ".OPEN_CODE_EDITOR";
    public static final String OPEN_NODE_EDITOR = GLOBAL_PREFIX + ".OPEN_NODE_EDITOR";

    public static final String OPEN_CONSOLE = GLOBAL_PREFIX + ".OPEN_CONSOLE";
    public static final String WRITE_TO_CONSOLE = GLOBAL_PREFIX + ".WRITE_TO_CONSOLE";

    public static final String ITEM_FACTORY_PREFIX = "games.rednblack.editor.factory.ItemFactory";
    public static final String NEW_ITEM_ADDED = ITEM_FACTORY_PREFIX + ".NEW_ITEM_ADDED";
    public static final String SCENE_DATA_PREFIX = "games.rednblack.editor.proxy.SceneDataManager";
    public static final String SCENE_LOADED = SCENE_DATA_PREFIX + ".SCENE_LOADED";

    private static final String DELETE_ITEMS_COMMAND_CLASS_NAME = "games.rednblack.editor.controller.commands.DeleteItemsCommand";
    public static final String DELETE_ITEMS_COMMAND_DONE = DELETE_ITEMS_COMMAND_CLASS_NAME + "DONE";

    public static final String SHOW_NOTIFICATION = GLOBAL_PREFIX + ".SHOW_NOTIFICATION";

    public static final String ADD_PLUGIN_SETTINGS = GLOBAL_PREFIX + ".ADD_PLUGIN_SETTINGS";

    public static final String SPRITER_EDIT_ANIMATION = GLOBAL_PREFIX + "SPRITER_EDIT_ANIMATION";
    public static final String SPRITER_REMOVE_ANIMATION_BACKGROUND = GLOBAL_PREFIX + "SPRITER_REMOVE_ANIMATION_BACKGROUND";
}
