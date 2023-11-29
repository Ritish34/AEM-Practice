package com.demo.aem.anime.core.models;

import com.adobe.cq.export.json.ComponentExporter;

import java.util.List;

/**
 * ComponentExporter used for creating SPA editor (Single Page Application)
 * SPA applications are like react application which change content without refreshing web page.
 * we extend the ComponentExporter class in order for our sling model to be
 * compatible with the SPA Editor framework
 * */
public interface Task2Model{
    String getTitle();
    String getImageReference();
    List<ImageModel> getCards();
}
