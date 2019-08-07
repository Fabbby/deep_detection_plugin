README 
======
German-Version

# JOSM Deep Detection Plugin

## Beschreibung
    Deep Detection-Plugin ist ein Plugin für die Erstellung von Traningsdaten für ein Neuronales Netz , welches Gebäudeumrisse auf Basis derer Satellitenbilder erstellt (Link zu Steffan).
    Es speichert die aktuelle Sicht der Map und die Gebäudeumrisse und generiert Trainingsdaten für die Unet Implementierung.

   ## Implementierung


    svn co http://svn.openstreetmap.org/applications/editors/josm josm
    cd josm/core
    ant clean dist
    cd ../plugins
    rm -rf deep_detection
    git clone https://github.com/Fabbby/deep_detection_plugin.git deep_detection
    cd deep_detection
    ant clean
    ant dist
    ant install


Now Restart JOSM and activate the "deep_detection" plugin in your preferences. Under Tools you should now see a new "More Tool" called "deep_detection".


## License



Its a modifikation of the Area_Selector-Plugin ->https://github.com/JOSM/areaselector
Some methods from aleaselctor were refractoring and modify.

This plugin was developed by Fabian Frings und Stefan Berger

This software is licensed under GPL v3
    * Plugin author and contact email address.
    
    * The license for your plugin source code. If you have no special preferences, 
      you can pick the license that is used for JOSM ("GPL v2 or later").
      
    * Notes for future developers, if needed.
