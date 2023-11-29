package com.demo.aem.anime.core.models;

import javax.inject.Inject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.ExporterOption;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, resourceType = CardModel.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = "jackson", extensions = "json", selector = "data",
options = @ExporterOption(name = "SerializationFeature.WRAP_ROOT_VALUE", value = "true"))
@JsonRootName("data")
public class CardModel {

    static final String RESOURCE_TYPE = "demo/components/card";
    @Inject
    private String title;

    @Inject
    private String description;

    @Inject
    private String fileReference;

    @Inject
    private String theme;

    @JsonIgnore
    public String getTitle() {
        return title.toUpperCase();
    }

    public String getDescription() {
        return description.toLowerCase();
    }

    public String getImage() {
        return fileReference;
    }

    public String getTheme() {
        return theme;
    }
    @JsonProperty
    public String smallTitle(){
        return title.toLowerCase();
    }
}
