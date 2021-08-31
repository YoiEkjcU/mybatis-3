package org.apache.ibatis.scripting;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Frank D. Martinez [mnesarco]
 */
public class LanguageDriverRegistry {

    private final Map<Class<?>, LanguageDriver> LANGUAGE_DRIVER_MAP = new HashMap<Class<?>, LanguageDriver>();

    private Class<?> defaultDriverClass;

    public void register(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("null is not a valid Language Driver");
        }
        if (!LANGUAGE_DRIVER_MAP.containsKey(cls)) {
            try {
                LANGUAGE_DRIVER_MAP.put(cls, (LanguageDriver) cls.newInstance());
            } catch (Exception ex) {
                throw new ScriptingException("Failed to load language driver for " + cls.getName(), ex);
            }
        }
    }

    public void register(LanguageDriver instance) {
        if (instance == null) {
            throw new IllegalArgumentException("null is not a valid Language Driver");
        }
        Class<?> cls = instance.getClass();
        if (!LANGUAGE_DRIVER_MAP.containsKey(cls)) {
            LANGUAGE_DRIVER_MAP.put(cls, instance);
        }
    }

    public LanguageDriver getDriver(Class<?> cls) {
        return LANGUAGE_DRIVER_MAP.get(cls);
    }

    public LanguageDriver getDefaultDriver() {
        return getDriver(getDefaultDriverClass());
    }

    public Class<?> getDefaultDriverClass() {
        return defaultDriverClass;
    }

    public void setDefaultDriverClass(Class<?> defaultDriverClass) {
        register(defaultDriverClass);
        this.defaultDriverClass = defaultDriverClass;
    }
}
