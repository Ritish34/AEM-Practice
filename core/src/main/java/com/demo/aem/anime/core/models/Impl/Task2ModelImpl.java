package com.demo.aem.anime.core.models.Impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.demo.aem.anime.core.models.ImageModel;
import com.demo.aem.anime.core.models.Task2Model;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(
        adaptables = Resource.class,
        adapters = { Task2Model.class, ComponentExporter.class },
        resourceType = Task2ModelImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
        name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
public class Task2ModelImpl implements Task2Model, ComponentExporter {
    static final String RESOURCE_TYPE = "demo/components/taskNo2";

    @ValueMapValue
    private String title;
    @ValueMapValue
    private String imageReference;
    @ChildResource
    private List<ImageModel> cards;

    @Override
    public String getExportedType() {
        return Task2ModelImpl.RESOURCE_TYPE;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getImageReference() {
        return imageReference;
    }

    @Override
    public List<ImageModel> getCards() {
        return cards;
    }
}
