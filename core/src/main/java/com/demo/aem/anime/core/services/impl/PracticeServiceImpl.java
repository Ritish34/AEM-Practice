package com.demo.aem.anime.core.services.impl;

import com.demo.aem.anime.core.services.PracticeDemoService;
import com.demo.aem.anime.core.services.PracticeService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.converter.Converters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

@Component(service = { PracticeService.class} )
public class PracticeServiceImpl implements PracticeService {

    private static final Logger log = LoggerFactory.getLogger(PracticeServiceImpl.class);

    private String[] activities;

    @Reference
    PracticeDemoService practiceDemoService;

    /**
     * @return service name
     */
    @Override
    public String getName() {
        return "john from practice service implementation version = "+ practiceDemoService.getVersion();
    }

    /**
     * @return 
     */
    @Override
    public String[] getProperties() {
        return activities;
    }

    @Activate
    protected void activate(Map<String, Object> properties) {

        this.activities = Converters.standardConverter()
                .convert(properties.get("activities"))
                .defaultValue(new String[] {
                        "Default Activity 1",
                        "Default Activity 2"
                })
                .to(String[].class);

        final Integer randomSeed = Converters.standardConverter()
                .convert(properties.get("random.seed"))
                .defaultValue(25)
                .to(Integer.class);

        log.info("Activated ActivitiesImpl with activities [ {} ]", String.join(", ", this.activities)+" , "+randomSeed);
    }

    @Deactivate
    protected void deactivate() {
        log.info("ActivitiesImpl has been deactivated!");
    }
}
