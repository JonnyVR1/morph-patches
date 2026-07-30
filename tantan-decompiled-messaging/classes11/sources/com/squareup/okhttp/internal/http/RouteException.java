package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class RouteException extends Exception {
    private static final Method addSuppressedExceptionMethod;
    private IOException lastException;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        addSuppressedExceptionMethod = declaredMethod;
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.lastException = iOException;
    }

    private void addSuppressedIfPossible(IOException iOException, IOException iOException2) {
        Method method = addSuppressedExceptionMethod;
        if (method != null) {
            try {
                method.invoke(iOException, iOException2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public void addConnectException(IOException iOException) {
        addSuppressedIfPossible(iOException, this.lastException);
        this.lastException = iOException;
    }

    public IOException getLastConnectException() {
        return this.lastException;
    }
}
