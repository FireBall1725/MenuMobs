package bspkrs.bspkrscore.fml;

import com.google.common.base.Throwables;
import net.minecraftforge.common.config.Configuration;

import java.io.InputStream;
import java.util.Properties;

public class Reference
{
    static
    {
        Properties prop = new Properties();

        try
        {
            InputStream stream = Reference.class.getClassLoader().getResourceAsStream("version.properties");
            prop.load(stream);
            stream.close();
        }
        catch (Exception e)
        {
            Throwables.propagate(e);
        }

        MC_VERSION = prop.getProperty("version.minecraft");
    }
    public static final String  MODID        = "MenuMobs";
    public static final String  NAME         = "Menu Mobs";
    public static final String  MC_VERSION;
    public static final String  PROXY_COMMON = "bspkrs.bspkrscore.fml.CommonProxy";
    public static final String  PROXY_CLIENT = "bspkrs.bspkrscore.fml.ClientProxy";
    public static final String  GUI_FACTORY  = "bspkrs.bspkrscore.fml.gui.ModGuiFactoryHandler";

    public static Configuration config       = null;
}