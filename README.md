README 
======
# JOSM Deep Detection Plugin

## Beschreibung
    Deep Detection-Plugin is a plugin to create training data for a neural network (unet), which creates building outlines based on       satellite images. 
    Unet implementation  https://github.com/Machuntox/unet.
    It stores the current view of the map, the building outlines and generates training data for the Unet implementation.

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

Restart JOSM and activate the "deep_detection" plugin in your preferences. Under "More Tools" you should see a new tool called "deep_detection". 


### Filter in JOSM

For the correct use of the plugin function a filter has to be created in JOSM:
![alt text](https://github.com/Fabbby/deep_detection_plugin/blob/master/filter.PNG)


Creating filters in JOSM
https://josm.openstreetmap.de/wiki/Help/Dialog/Filter

## Get started
 
Two data levels are required. The data layer containing the building outlines (filter applied) and any satellite image layer (JOSM->Backgrounds->Satellite Images).

data levels:
![alt text](https://github.com/Fabbby/deep_detection_plugin/blob/master/data_layer.PNG)

### Output
The storage location of the data is in the home directory of the user under deep_detection_images.

## Version
The deep detection extension is compatible with JOSM version 15238 (tested version) and requires the plugins "Area Selector, austriaadresshelper,log4j"


## License

It is a modification of the Area_Selector-Plugin https://github.com/JOSM/areaselector
Methods from Area_Selector-Plugin are refractored and modifyed.
The icons are based on Area Selector Plugin.
The plugin was developed as part of the Big Data Internship at DBS Leipzig and is used exclusively for research purposes.

This software is licensed under GPL v3.

This plugin was developed by Fabian Frings und Stefan Berger

    
