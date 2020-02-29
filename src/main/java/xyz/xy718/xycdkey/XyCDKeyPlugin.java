package xyz.xy718.xycdkey;

import com.google.inject.Inject;
import lombok.Getter;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@Plugin(
        id = XyCDKeyPlugin.PLUGIN_ID,
        name = XyCDKeyPlugin.NAME,
        description = XyCDKeyPlugin.DESCRIPTION,
        authors = {
                "Xy718"
        }
)
public class XyCDKeyPlugin {
    @Getter public static final String PLUGIN_ID = "@id@";
    @Getter public static final String NAME = "@name@";
    @Getter public static final String VERSION = "@version@";
    @Getter public static final String DESCRIPTION = "@description@";

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        File file = new File("./banner/welcome.txt");
        logger.info(txt2String(file));
        logger.info("{}正在启动",NAME);
    }

    /**
     * 读取txt文件的内容
     *
     * @param file 想要读取的文件对象
     * @return 返回文件内容
     */
    public static String txt2String(File file) {
        String result = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                result = result + "\n" + s;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}


