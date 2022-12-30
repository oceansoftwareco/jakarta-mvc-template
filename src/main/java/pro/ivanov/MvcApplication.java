package pro.ivanov;

import java.util.Map;
import java.util.HashMap;

import jakarta.mvc.engine.ViewEngine;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/")
public class MvcApplication extends Application {
    @Override
    public Map<String, Object> getProperties() {
        final Map<String, Object> map = new HashMap<>();

        map.put(ViewEngine.VIEW_FOLDER, "/WEB-INF/views/");

        return map;
    }
}
