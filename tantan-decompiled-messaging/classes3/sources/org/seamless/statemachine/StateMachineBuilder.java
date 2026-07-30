package org.seamless.statemachine;

import java.lang.reflect.Proxy;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StateMachineBuilder {
    public static <T extends StateMachine> T build(Class<T> cls, Class cls2, Class[] clsArr, Object[] objArr) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new StateMachineInvocationHandler(Arrays.asList(((States) cls.getAnnotation(States.class)).value()), cls2, clsArr, objArr));
    }

    public static <T extends StateMachine> T build(Class<T> cls, Class cls2) {
        return (T) build(cls, cls2, null, null);
    }
}
