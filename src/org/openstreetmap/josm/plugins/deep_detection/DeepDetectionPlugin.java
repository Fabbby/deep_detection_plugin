
package org.openstreetmap.josm.plugins.deep_detection;

import javax.swing.JMenuItem;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.AppenderComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import org.openstreetmap.josm.gui.MainApplication;
import org.openstreetmap.josm.gui.MainMenu;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;
import org.openstreetmap.josm.gui.MapFrame;
import org.openstreetmap.josm.gui.MapView;
import org.openstreetmap.josm.plugins.deep_detection.preferences.DeepDetectionPreference;



/**
 *Übernimmt die Anmeldung des Plugins
 */
public class DeepDetectionPlugin extends Plugin{

    JMenuItem deepTag;
    DeepDetectionAction deepDetectionAction;
    public DeepDetectionPlugin(PluginInformation info){
        super(info);
        setupLogging();


        deepDetectionAction = new DeepDetectionAction(MainApplication.getMap());


        //add Toolbar
        deepTag=MainMenu.add(MainApplication.getMenu().moreToolsMenu,deepDetectionAction);


    }

    /**
            * Called when the JOSM map frame is created or destroyed.
            */
    @Override
    public void mapFrameInitialized(MapFrame oldFrame, MapFrame newFrame) {

        deepDetectionAction.updateMapFrame(oldFrame, newFrame);

        //Funktion noch überprüfen
        boolean enabled= newFrame != null;
        deepTag.setEnabled(enabled);
    }

    public DeepDetectionAction getAreaSelectorAction() {
        return deepDetectionAction;
    }

    protected LoggerContext setupLogging(){
        ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();
        builder.setStatusLevel(Level.ERROR);
        builder.setConfigurationName("BuilderTest");
        builder.add(builder.newFilter("ThresholdFilter", Filter.Result.ACCEPT, Filter.Result.NEUTRAL)
                .addAttribute("level", Level.DEBUG));
        AppenderComponentBuilder appenderBuilder = builder.newAppender("Stdout", "CONSOLE").addAttribute("target",
                ConsoleAppender.Target.SYSTEM_OUT);
        appenderBuilder.add(builder.newLayout("PatternLayout")
                .addAttribute("pattern", "%d [%t] %-5level: %msg%n%throwable"));
        appenderBuilder.add(builder.newFilter("MarkerFilter", Filter.Result.DENY, Filter.Result.NEUTRAL)
                .addAttribute("marker", "FLOW"));
        builder.add(appenderBuilder);
        //		builder.add(builder.newLogger("org.apache.logging.log4j", Level.DEBUG)
        //				.add(builder.newAppenderRef("Stdout")).addAttribute("additivity", false));
        builder.add(builder.newRootLogger(Level.INFO).add(builder.newAppenderRef("Stdout")));
        LoggerContext ctx = Configurator.initialize(builder.build());
        return ctx;
    }
}

