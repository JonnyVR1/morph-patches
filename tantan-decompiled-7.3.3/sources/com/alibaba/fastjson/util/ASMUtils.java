package com.alibaba.fastjson.util;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.asm.ClassReader;
import com.alibaba.fastjson.asm.TypeCollector;
import com.meituan.robust.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p153l.c4s;
import p153l.m5j;
import p153l.p7f;

/* JADX INFO: loaded from: classes.dex */
public class ASMUtils {
    public static final boolean IS_ANDROID;
    public static final String JAVA_VM_NAME;

    static {
        String property = System.getProperty("java.vm.name");
        JAVA_VM_NAME = property;
        IS_ANDROID = isAndroid(property);
    }

    public static boolean checkName(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 1 || cCharAt > 127 || cCharAt == '.') {
                return false;
            }
        }
        return true;
    }

    public static String desc(Class<?> cls) {
        if (cls.isPrimitive()) {
            return getPrimitiveLetter(cls);
        }
        if (cls.isArray()) {
            return "[" + desc(cls.getComponentType());
        }
        return "L" + type(cls) + Constants.PACKNAME_END;
    }

    public static Type getMethodType(Class<?> cls, String str) {
        try {
            return cls.getMethod(str, null).getGenericReturnType();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPrimitiveLetter(Class<?> cls) {
        if (Integer.TYPE == cls) {
            return "I";
        }
        if (Void.TYPE == cls) {
            return p7f.GPS_MEASUREMENT_INTERRUPTED;
        }
        if (Boolean.TYPE == cls) {
            return "Z";
        }
        if (Character.TYPE == cls) {
            return c4s.C_ZONE;
        }
        if (Byte.TYPE == cls) {
            return "B";
        }
        if (Short.TYPE == cls) {
            return p7f.LATITUDE_SOUTH;
        }
        if (Float.TYPE == cls) {
            return "F";
        }
        if (Long.TYPE == cls) {
            return "J";
        }
        if (Double.TYPE == cls) {
            return "D";
        }
        m5j.m157106a("Type: ", cls.getCanonicalName(), " is not a primitive type");
        return null;
    }

    public static boolean isAndroid(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("dalvik") || lowerCase.contains("lemur");
    }

    public static String[] lookupParameterNames(AccessibleObject accessibleObject) {
        Class<?>[] parameterTypes;
        Class<?> declaringClass;
        Annotation[][] parameterAnnotations;
        String name;
        String strName;
        if (IS_ANDROID) {
            return new String[0];
        }
        if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            parameterTypes = method.getParameterTypes();
            name = method.getName();
            declaringClass = method.getDeclaringClass();
            parameterAnnotations = TypeUtils.getParameterAnnotations(method);
        } else {
            Constructor constructor = (Constructor) accessibleObject;
            parameterTypes = constructor.getParameterTypes();
            declaringClass = constructor.getDeclaringClass();
            parameterAnnotations = TypeUtils.getParameterAnnotations(constructor);
            name = "<init>";
        }
        if (parameterTypes.length == 0) {
            return new String[0];
        }
        ClassLoader classLoader = declaringClass.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(declaringClass.getName().replace('.', '/') + ".class");
        if (resourceAsStream == null) {
            return new String[0];
        }
        try {
            ClassReader classReader = new ClassReader(resourceAsStream, false);
            TypeCollector typeCollector = new TypeCollector(name, parameterTypes);
            classReader.accept(typeCollector);
            String[] parameterNamesForMethod = typeCollector.getParameterNamesForMethod();
            for (int i = 0; i < parameterNamesForMethod.length; i++) {
                Annotation[] annotationArr = parameterAnnotations[i];
                if (annotationArr != null) {
                    for (Annotation annotation : annotationArr) {
                        if ((annotation instanceof JSONField) && (strName = ((JSONField) annotation).name()) != null && strName.length() > 0) {
                            parameterNamesForMethod[i] = strName;
                        }
                    }
                }
            }
            return parameterNamesForMethod;
        } catch (IOException unused) {
            return new String[0];
        } finally {
            IOUtils.close(resourceAsStream);
        }
    }

    public static String type(Class<?> cls) {
        if (!cls.isArray()) {
            return !cls.isPrimitive() ? cls.getName().replace('.', '/') : getPrimitiveLetter(cls);
        }
        return "[" + desc(cls.getComponentType());
    }

    public static String desc(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        StringBuilder sb = new StringBuilder((parameterTypes.length + 1) << 4);
        sb.append('(');
        for (Class<?> cls : parameterTypes) {
            sb.append(desc(cls));
        }
        sb.append(')');
        sb.append(desc(method.getReturnType()));
        return sb.toString();
    }
}
