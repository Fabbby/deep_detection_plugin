README 
======
# JOSM Deep Detection Plugin

## Beschreibung
    Deep Detection-Plugin is a plugin for creating training data for a neural network (unet), which creates building outlines based on       satellite images. 
    Unet implementation:https://github.com/Machuntox/unet.
    It stores the current view of the map and the building outlines and generates training data for the Unet implementation.

   ## Building from sources
   
   ### Linux
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
    
Run JOSM jar under josm/core/dist/josm_custom.jar

Now Restart JOSM and activate the "deep_detection" plugin in your preferences. Under "More Tools" you should now see a new Tool called "deep_detection". 


### Filter in JOSM

For the correct use of the plugin fuction a filter has to be created in JOSM:
![alt text](http://url/to/img.png)

Creating filters in JOSM
https://josm.openstreetmap.de/wiki/Help/Dialog/Filter

## Get started
 
Two data levels are required. The data layer containing the building outlines (filter applied) and any satellite image layer (JOSM->Backgrounds->Satellite Images).

Bild von Satellitenbilder
![alt text](http://url/to/img.png)
Bild von Datenebenden
![alt text](http://url/to/img.png)


## Version
The deep detection extension is compatible with JOSM version 15238 (tested version) and requires the plugins "Area Selector,...,...


## License

Its a modifikation of the Area_Selector-Plugin @ https://github.com/JOSM/areaselector
Methods from aleaselctor were refractored and modifyed.
The icons are based on Area Selector Plugin.
The plugin was developed as part of the Big Data Internship at DBS Leipzig and is used exclusively for research purposes.

This software is licensed under GPL v3.

This plugin was developed by Fabian Frings und Stefan Berger

    
