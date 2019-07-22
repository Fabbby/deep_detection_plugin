package org.openstreetmap.josm.plugins.deep_detection.preferences;

import static org.openstreetmap.josm.tools.I18n.tr;

import org.openstreetmap.josm.gui.preferences.DefaultTabPreferenceSetting;
import org.openstreetmap.josm.gui.preferences.PreferenceTabbedPane;
import org.openstreetmap.josm.plugins.deep_detection.DeepDetectionAction;
import org.openstreetmap.josm.plugins.deep_detection.DeepDetectionPlugin;

public class DeepDetectionPreference {

    DeepDetectionPlugin deepDetectionPlugin;
    PreferencesPanel prefPanel;



    public DeepDetectionPreference(DeepDetectionPlugin plugin){
        super();

        deepDetectionPlugin = plugin;
    }
}
