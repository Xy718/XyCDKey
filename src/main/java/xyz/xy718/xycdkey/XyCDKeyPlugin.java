package xyz.xy718.xycdkey;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "xycdkey",
        name = "XyCDKey",
        description = "一个简单的CDKey生成/校验插件",
        authors = {
                "Xy718"
        }
)
public class XyCDKeyPlugin {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
