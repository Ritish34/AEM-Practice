package com.demo.aem.anime.core.services.impl;

import com.demo.aem.anime.core.services.PracticeDemoService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

//import java.util.logging.Logger;

@Component(service = PracticeDemoService.class)
public class PracticeDemoServiceImpl implements PracticeDemoService {

//    java.util.logging.Logger logger = Logger.getLogger(PracticeDemoServiceImpl.class.getName());

    /**
     * @return version
     */
    @Override
    public Double getVersion() {
        return 1.1;
    }

    @Activate
    protected void activate() {
//        logger.info("PracticeDemoServiceImpl activate called");
    }

    @Deactivate
    protected void deactivate() {
//        logger.info("PracticeDemoServiceImpl deactivate called");
    }
}
