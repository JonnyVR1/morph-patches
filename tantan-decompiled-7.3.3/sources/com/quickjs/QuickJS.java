package com.quickjs;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Keep;
import com.quickjs.QuickJS;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class QuickJS implements Closeable {
    final EventQueue quickJSNative;
    boolean released;
    final long runtimePtr;
    static final Map<Long, JSContext> sContextMap = Collections.synchronizedMap(new HashMap());
    private static int sId = 0;
    static int JS_EVAL_TYPE_GLOBAL = 0;
    static int JS_EVAL_TYPE_MODULE = 1;
    static int JS_EVAL_TYPE_MASK = 3;
    static int JS_EVAL_FLAG_STRICT = 8;
    static int JS_EVAL_FLAG_STRIP = 16;
    static int JS_EVAL_FLAG_COMPILE_ONLY = 32;
    static int JS_EVAL_FLAG_BACKTRACE_BARRIER = 64;

    public static class MethodDescriptor {
        public JavaCallback callback;
        public JavaVoidCallback voidCallback;
    }

    static {
        System.loadLibrary("quickjs");
        System.loadLibrary("quickjs-android");
    }

    private QuickJS(long j, HandlerThread handlerThread) {
        this.runtimePtr = j;
        this.quickJSNative = new EventQueue(this, handlerThread);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m81555b(QuickJS quickJS) {
        if (quickJS.released) {
            return;
        }
        Map<Long, JSContext> map = sContextMap;
        int size = map.size();
        JSContext[] jSContextArr = new JSContext[size];
        map.values().toArray(jSContextArr);
        for (int i = 0; i < size; i++) {
            JSContext jSContext = jSContextArr[i];
            if (jSContext.getQuickJS() == quickJS) {
                jSContext.close();
            }
        }
        quickJS.getNative()._releaseRuntime(quickJS.runtimePtr);
        quickJS.released = true;
        quickJS.quickJSNative.interrupt();
    }

    @Keep
    public static Object callJavaCallback(long j, int i, JSValue jSValue, JSArray jSArray, boolean z) {
        MethodDescriptor methodDescriptor;
        JSContext jSContext = sContextMap.get(Long.valueOf(j));
        if (jSContext == null || (methodDescriptor = jSContext.functionRegistry.get(Integer.valueOf(i))) == null) {
            return null;
        }
        JSObject jSObject = jSValue instanceof JSObject ? (JSObject) jSValue : null;
        if (z) {
            try {
                methodDescriptor.voidCallback.invoke(jSObject, jSArray);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            return null;
        }
        try {
            return methodDescriptor.callback.invoke(jSObject, jSArray);
        } catch (RuntimeException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void checkException(JSContext jSContext) {
        String[] strArr_getException = jSContext.getNative()._getException(jSContext.getContextPtr());
        if (strArr_getException == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strArr_getException[1]);
        sb.append('\n');
        for (int i = 2; i < strArr_getException.length; i++) {
            sb.append(strArr_getException[i]);
        }
        throw new QuickJSException(strArr_getException[0], sb.toString());
    }

    @Keep
    public static String convertModuleName(long j, String str, String str2) {
        JSContext jSContext = sContextMap.get(Long.valueOf(j));
        if (jSContext != null && (jSContext instanceof Module)) {
            return ((Module) jSContext).convertModuleName(str, str2);
        }
        return null;
    }

    @Keep
    public static JSValue createJSValue(long j, int i, long j2, int i2, double d, long j3) {
        JSContext jSContext = sContextMap.get(Long.valueOf(j));
        if (i == 5) {
            return new JSArray(jSContext, j2, i2, d, j3);
        }
        if (i == 6) {
            return new JSObject(jSContext, j2, i2, d, j3);
        }
        if (i != 7) {
            return i != 99 ? new JSValue(jSContext, j2, i2, d, j3) : new JSObject.Undefined(jSContext, j2, i2, d, j3);
        }
        return new JSFunction(jSContext, j2, i2, d, j3);
    }

    public static QuickJS createRuntime() {
        return new QuickJS(QuickJSNativeImpl._createRuntime(), null);
    }

    public static QuickJS createRuntimeWithEventQueue() {
        final Object[] objArr = new Object[2];
        StringBuilder sb = new StringBuilder("QuickJS-");
        int i = sId;
        sId = i + 1;
        sb.append(i);
        final HandlerThread handlerThread = new HandlerThread(sb.toString());
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new Runnable() { // from class: l.q6c0
            @Override // java.lang.Runnable
            public final void run() {
                QuickJS.m81556d(objArr, handlerThread);
            }
        });
        synchronized (objArr) {
            try {
                if (objArr[1] == null) {
                    objArr.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return (QuickJS) objArr[0];
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m81556d(Object[] objArr, HandlerThread handlerThread) {
        objArr[0] = new QuickJS(QuickJSNativeImpl._createRuntime(), handlerThread);
        synchronized (objArr) {
            objArr[1] = Boolean.TRUE;
            objArr.notify();
        }
    }

    public static Object executeFunction(JSContext jSContext, JSValue jSValue, String str, Object[] objArr) {
        JSArray jSArray = new JSArray(jSContext);
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof Integer) {
                    jSArray.push(((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    jSArray.push(((Double) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    jSArray.push(((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    jSArray.push((String) obj);
                } else if (obj instanceof JSValue) {
                    jSArray.push((JSValue) obj);
                } else {
                    jSArray.push((JSValue) null);
                }
            }
        }
        return jSContext.getNative()._executeFunction(jSContext.getContextPtr(), 0, jSValue, str, jSArray);
    }

    @Keep
    public static String getModuleScript(long j, String str) {
        JSContext jSContext = sContextMap.get(Long.valueOf(j));
        if (jSContext != null && (jSContext instanceof Module)) {
            return ((Module) jSContext).getModuleScript(str);
        }
        return null;
    }

    public void checkReleased() {
        if (isReleased()) {
            throw new Error("Runtime disposed error");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        postEventQueue(new Runnable() { // from class: l.p6c0
            @Override // java.lang.Runnable
            public final void run() {
                QuickJS.m81555b(this.f150806a);
            }
        });
    }

    public JSContext createContext() {
        return new JSContext(this, getNative()._createContext(this.runtimePtr));
    }

    public QuickJSNative getNative() {
        return this.quickJSNative;
    }

    public boolean isReleased() {
        return this.released;
    }

    public void postEventQueue(Runnable runnable) {
        this.quickJSNative.postVoid(runnable, false);
    }
}
