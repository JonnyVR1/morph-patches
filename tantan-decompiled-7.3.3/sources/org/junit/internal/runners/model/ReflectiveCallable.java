package org.junit.internal.runners.model;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReflectiveCallable {
    public Object run() throws Throwable {
        try {
            return runReflectiveCall();
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    public abstract Object runReflectiveCall() throws Throwable;
}
