package api.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

public class Util{
    @SuppressWarnings("unchecked")
    public static<T> T getAnnotationValue(Method method,Class<? extends Annotation> annotationClass,String element) throws Exception {
        Annotation annotation = method.getAnnotation(annotationClass);
        Method _method = annotationClass.getMethod(element,(Class[])null);
        if (annotation == null)
            return((T)_method.getDefaultValue());
        return((T)_method.invoke(annotation,(Object[])null));
    }

    public static<T> Class<T>  getGenericParameterClass(Class actualClass) {
        return (Class<T>) ((ParameterizedType) actualClass.getGenericSuperclass()).getActualTypeArguments()[0];
    }
}