package org.apache.ibatis.scripting.xmltags;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;

import ognl.ClassResolver;

/**
 * Custom ognl {@code ClassResolver} which behaves same like ognl's {@code DefaultClassResolver}. But uses the {@code Resources} utility class to find the target class instead of {@code Class#forName(String)}.
 *
 * @author Daniel Guggi
 *
 * @see <a href='https://github.com/mybatis/mybatis-3/issues/161'>Issue 161</a>
 */
public class OgnlClassResolver implements ClassResolver {

    private final Map<String, Class<?>> classes = new HashMap<>(101);

    @SuppressWarnings("rawtypes")
    @Override
    public Class classForName(String className, Map context) throws ClassNotFoundException {
        Class<?> result = null;
        if ((result = classes.get(className)) == null) {
            try {
                result = Resources.classForName(className);
            } catch (ClassNotFoundException e1) {
                if (className.indexOf('.') == -1) {
                    result = Resources.classForName("java.lang." + className);
                    classes.put("java.lang." + className, result);
                }
            }
            classes.put(className, result);
        }
        return result;
    }
}
