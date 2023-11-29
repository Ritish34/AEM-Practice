package com.demo.aem.anime.core.models.Impl;

import com.demo.aem.anime.core.models.ImageModel;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = Resource.class,
        adapters = ImageModel.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ImageModelImpl implements ImageModel {
    @ValueMapValue
    private String fileReference;
    @ValueMapValue
    private String linkURL;
    @ValueMapValue
    private String description;

    @Override
    public String getFileReference() {
        return fileReference;
    }

    @Override
    public String getLinkURL() {
        return linkURL;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
