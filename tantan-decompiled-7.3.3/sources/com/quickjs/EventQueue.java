package com.quickjs;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes10.dex */
public class EventQueue implements QuickJSNative {
    private final Handler handler;
    private final HandlerThread handlerThread;
    private final QuickJS quickJS;
    private final QuickJSNative quickJSNative = new QuickJSNativeImpl();
    private final Thread thread = Thread.currentThread();
    private final ThreadChecker threadChecker;

    public interface Event<T> {
        T run();
    }

    public EventQueue(QuickJS quickJS, HandlerThread handlerThread) {
        this.quickJS = quickJS;
        this.handlerThread = handlerThread;
        this.handler = Looper.myLooper() != null ? new Handler(Looper.myLooper()) : null;
        this.threadChecker = new ThreadChecker(quickJS);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m81526c(Object[] objArr, Event event, RuntimeException[] runtimeExceptionArr) {
        try {
            objArr[0] = event.run();
        } catch (RuntimeException e) {
            runtimeExceptionArr[0] = e;
        }
        synchronized (objArr) {
            objArr[1] = Boolean.TRUE;
            objArr.notifyAll();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m81531h(EventQueue eventQueue, Runnable runnable, RuntimeException[] runtimeExceptionArr, boolean z, Object[] objArr) {
        eventQueue.getClass();
        try {
            if (!eventQueue.quickJS.isReleased()) {
                runnable.run();
            }
        } catch (RuntimeException e) {
            runtimeExceptionArr[0] = e;
        }
        if (z) {
            synchronized (objArr) {
                objArr[1] = Boolean.TRUE;
                objArr.notifyAll();
            }
        }
    }

    private <T> T post(final Event<T> event) {
        HandlerThread handlerThread;
        if (this.quickJS.isReleased() || ((handlerThread = this.handlerThread) != null && handlerThread.isInterrupted())) {
            Log.e("QuickJS", "QuickJS is released");
            return null;
        }
        if (Thread.currentThread() == this.thread) {
            return event.run();
        }
        Handler handler = this.handler;
        if (handler == null) {
            this.threadChecker.checkThread();
            return event.run();
        }
        final Object[] objArr = new Object[2];
        final RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new Runnable() { // from class: com.quickjs.x
            @Override // java.lang.Runnable
            public final void run() {
                EventQueue.m81526c(objArr, event, runtimeExceptionArr);
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
        RuntimeException runtimeException = runtimeExceptionArr[0];
        if (runtimeException == null) {
            return (T) objArr[0];
        }
        throw runtimeException;
    }

    @Override // com.quickjs.QuickJSNative
    public JSValue _Undefined(final long j) {
        return (JSValue) post(new Event() { // from class: com.quickjs.f
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55702a.quickJSNative._Undefined(j);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public void _arrayAdd(final long j, final JSValue jSValue, final Object obj) {
        postVoid(new Runnable() { // from class: com.quickjs.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f55718a.quickJSNative._arrayAdd(j, jSValue, obj);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public Object _arrayGet(final long j, final int i, final JSValue jSValue, final int i2) {
        return post(new Event() { // from class: com.quickjs.q
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55751a.quickJSNative._arrayGet(j, i, jSValue, i2);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public JSValue _arrayGetValue(final long j, final JSArray jSArray, final int i) {
        return (JSValue) post(new Event() { // from class: com.quickjs.i
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55711a.quickJSNative._arrayGetValue(j, jSArray, i);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public boolean _contains(final long j, final JSValue jSValue, final String str) {
        return ((Boolean) post(new Event() { // from class: com.quickjs.l
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return Boolean.valueOf(this.f55722a.quickJSNative._contains(j, jSValue, str));
            }
        })).booleanValue();
    }

    @Override // com.quickjs.QuickJSNative
    public long _createContext(long j) {
        return this.quickJSNative._createContext(j);
    }

    @Override // com.quickjs.QuickJSNative
    public Object _executeBinaryScript(final long j, final int i, final String str, final int i2) {
        return post(new Event() { // from class: com.quickjs.d
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55691a.quickJSNative._executeBinaryScript(j, i, str, i2);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public Object _executeFunction(final long j, final int i, final JSValue jSValue, final String str, final JSValue jSValue2) {
        return post(new Event() { // from class: com.quickjs.m
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55726a.quickJSNative._executeFunction(j, i, jSValue, str, jSValue2);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public Object _executeFunction2(final long j, final int i, final JSValue jSValue, final JSValue jSValue2, final JSValue jSValue3) {
        return post(new Event() { // from class: com.quickjs.a
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55667a.quickJSNative._executeFunction2(j, i, jSValue, jSValue2, jSValue3);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public Object _executeScript(final long j, final int i, final String str, final String str2, final int i2) {
        return post(new Event() { // from class: com.quickjs.n
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55732a.quickJSNative._executeScript(j, i, str, str2, i2);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public Object _get(final long j, final int i, final JSValue jSValue, final String str) {
        return post(new Event() { // from class: com.quickjs.b
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55676a.quickJSNative._get(j, i, jSValue, str);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public String[] _getException(final long j) {
        return (String[]) post(new Event() { // from class: com.quickjs.t
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55758a.quickJSNative._getException(j);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public JSObject _getGlobalObject(final long j) {
        return (JSObject) post(new Event() { // from class: com.quickjs.s
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55756a.quickJSNative._getGlobalObject(j);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public String[] _getKeys(final long j, final JSValue jSValue) {
        return (String[]) post(new Event() { // from class: com.quickjs.j
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55715a.quickJSNative._getKeys(j, jSValue);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public int _getObjectType(final long j, final JSValue jSValue) {
        return ((Integer) post(new Event() { // from class: com.quickjs.y
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return Integer.valueOf(this.f55771a.quickJSNative._getObjectType(j, jSValue));
            }
        })).intValue();
    }

    @Override // com.quickjs.QuickJSNative
    public JSValue _getValue(final long j, final JSObject jSObject, final String str) {
        return (JSValue) post(new Event() { // from class: com.quickjs.w
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55764a.quickJSNative._getValue(j, jSObject, str);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public JSArray _initNewJSArray(final long j) {
        return (JSArray) post(new Event() { // from class: com.quickjs.z
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55774a.quickJSNative._initNewJSArray(j);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public JSFunction _initNewJSFunction(final long j, final int i, final boolean z) {
        return (JSFunction) post(new Event() { // from class: com.quickjs.g
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55704a.quickJSNative._initNewJSFunction(j, i, z);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public JSObject _initNewJSObject(final long j) {
        return (JSObject) post(new Event() { // from class: com.quickjs.v
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55762a.quickJSNative._initNewJSObject(j);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public boolean _isUndefined(final long j, final JSValue jSValue) {
        return ((Boolean) post(new Event() { // from class: com.quickjs.a0
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return Boolean.valueOf(this.f55673a.quickJSNative._isUndefined(j, jSValue));
            }
        })).booleanValue();
    }

    @Override // com.quickjs.QuickJSNative
    public JSFunction _newClass(final long j, final int i) {
        return (JSFunction) post(new Event() { // from class: com.quickjs.h
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55708a.quickJSNative._newClass(j, i);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public JSFunction _registerJavaMethod(final long j, final JSValue jSValue, final String str, final int i, final boolean z) {
        return (JSFunction) post(new Event() { // from class: com.quickjs.o
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return this.f55738a.quickJSNative._registerJavaMethod(j, jSValue, str, i, z);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public void _releaseContext(final long j) {
        postVoid(new Runnable() { // from class: com.quickjs.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f55760a.quickJSNative._releaseContext(j);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public boolean _releasePtr(final long j, final long j2, final int i, final double d, final long j3) {
        return Boolean.TRUE.equals(post(new Event() { // from class: com.quickjs.e
            @Override // com.quickjs.EventQueue.Event
            public final Object run() {
                return Boolean.valueOf(this.f55696a.quickJSNative._releasePtr(j, j2, i, d, j3));
            }
        }));
    }

    @Override // com.quickjs.QuickJSNative
    public void _releaseRuntime(final long j) {
        postVoid(new Runnable() { // from class: com.quickjs.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f55744a.quickJSNative._releaseRuntime(j);
            }
        });
    }

    @Override // com.quickjs.QuickJSNative
    public void _set(final long j, final JSValue jSValue, final String str, final Object obj) {
        postVoid(new Runnable() { // from class: com.quickjs.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f55681a.quickJSNative._set(j, jSValue, str, obj);
            }
        });
    }

    public void interrupt() {
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.interrupt();
        }
    }

    public void postVoid(final Runnable runnable, final boolean z) {
        HandlerThread handlerThread;
        if (this.quickJS.isReleased() || ((handlerThread = this.handlerThread) != null && handlerThread.isInterrupted())) {
            Log.e("QuickJS", "QuickJS is released");
            return;
        }
        if (Thread.currentThread() == this.thread) {
            runnable.run();
            return;
        }
        Handler handler = this.handler;
        if (handler == null) {
            this.threadChecker.checkThread();
            runnable.run();
            return;
        }
        final Object[] objArr = new Object[2];
        final RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new Runnable() { // from class: com.quickjs.c
            @Override // java.lang.Runnable
            public final void run() {
                EventQueue.m81531h(this.f55686a, runnable, runtimeExceptionArr, z, objArr);
            }
        });
        if (z) {
            synchronized (objArr) {
                try {
                    if (objArr[1] == null) {
                        objArr.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            RuntimeException runtimeException = runtimeExceptionArr[0];
            if (runtimeException != null) {
                throw runtimeException;
            }
        }
    }

    public void postVoid(Runnable runnable) {
        postVoid(runnable, true);
    }
}
