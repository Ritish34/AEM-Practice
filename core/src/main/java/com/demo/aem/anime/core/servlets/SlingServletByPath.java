package com.demo.aem.anime.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = {Servlet.class}
//property = {
//        "sling.servlet.paths=/bin/aem-path",
//        "sling.servlet.methods=GET",
//        "sling.servlet.selectors=(one, two)",
//        "sling.servlet.extensions=txt"
//})
)
@SlingServletResourceTypes(
        resourceTypes="demo/components/page",
        methods= HttpConstants.METHOD_GET,
        selectors = "demo",
        extensions="txt")
public class SlingServletByPath extends SlingSafeMethodsServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
//        String[] selectors = req.getRequestPathInfo().getSelectors();

//        if (ArrayUtils.isNotEmpty(selectors)){
//            resp.getWriter().write("size = "+selectors.length+", "+"first name = "+selectors[0]+", "+"second name = "+selectors[1]);
//        }
        resp.getWriter().write("done");
    }
}
