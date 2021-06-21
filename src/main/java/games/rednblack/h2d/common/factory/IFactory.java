package games.rednblack.h2d.common.factory;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.math.Vector2;

import games.rednblack.h2d.common.ResourcePayloadObject;

public interface IFactory {
    Entity getCreatedEntity();

    boolean createSimpleImage(String name, int index, Vector2 position);

    boolean createSimpleImage(ResourcePayloadObject payload, Vector2 position);

    boolean createAtlasImage(ResourcePayloadObject payload, Vector2 position);

    boolean createSpriteAnimation(String name, Vector2 position);

    boolean createSpriteAnimation(ResourcePayloadObject payload, Vector2 position);

    boolean createSpineAnimation(String name, Vector2 position);

    boolean createSpineAnimation(ResourcePayloadObject payload, Vector2 position);

    boolean createSpriterAnimation(ResourcePayloadObject payload, Vector2 position);

    boolean createItemFromLibrary(ResourcePayloadObject payload, Vector2 position);
}
