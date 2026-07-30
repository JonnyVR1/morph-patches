package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p153l.mqi0;

/* JADX INFO: loaded from: classes3.dex */
public class SuiteMethod extends JUnit38ClassRunner {
    public SuiteMethod(Class<?> cls) throws Throwable {
        super(testFromSuiteMethod(cls));
    }

    public static mqi0 testFromSuiteMethod(Class<?> cls) throws Exception {
        try {
            Method method = cls.getMethod("suite", null);
            if (Modifier.isStatic(method.getModifiers())) {
                return (mqi0) method.invoke(null, null);
            }
            throw new Exception(cls.getName().concat(".suite() must be static"));
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
