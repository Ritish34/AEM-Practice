package com.demo.aem.anime.core.models.Impl;

import com.demo.aem.anime.core.models.CustomComponent;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class, adapters = CustomComponent.class)
public class CustomComponentImpl implements CustomComponent {
//    static final String RESOURCE_TYPE = "demo/components/customcomponent";

//    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE, injectionStrategy= InjectionStrategy.OPTIONAL)
//    @Default(values="No resourceType")
//    protected String resourceType;
    @ValueMapValue
    private String title;
    @ValueMapValue
    private String text;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getText() {
        return text;
    }

//    @Override
//    public String getExportedType() {
//        return CustomComponentImpl.RESOURCE_TYPE;
//    }
}
