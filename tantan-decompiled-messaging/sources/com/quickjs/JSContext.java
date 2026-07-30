package com.quickjs;

import com.quickjs.JSContext;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class JSContext extends JSObject implements Closeable {
    final long contextPtr;
    final Map<Integer, QuickJS.MethodDescriptor> functionRegistry;
    final Set<Plugin> plugins;
    final QuickJS quickJS;
    final Map<Integer, JSValue> refs;
    final List<Object[]> releaseObjPtrPool;
    final Set<Object> skippedPtrs;

    public JSContext(QuickJS quickJS, long j) {
        super((JSContext) null, quickJS.getNative()._getGlobalObject(j));
        this.plugins = Collections.synchronizedSet(new HashSet());
        this.refs = Collections.synchronizedMap(new WeakHashMap());
        this.releaseObjPtrPool = Collections.synchronizedList(new LinkedList());
        this.functionRegistry = Collections.synchronizedMap(new HashMap());
        this.skippedPtrs = Collections.synchronizedSet(new HashSet());
        this.quickJS = quickJS;
        this.contextPtr = j;
        this.context = this;
        QuickJS.sContextMap.put(Long.valueOf(j), this);
    }

    private void checkReleaseObjPtrPool() {
        getQuickJS().postEventQueue(new Runnable() { // from class: l.niq
            @Override // java.lang.Runnable
            public final void run() {
                JSContext.m80367g(this.f139123a);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m80367g(JSContext jSContext) {
        while (!jSContext.releaseObjPtrPool.isEmpty()) {
            Object[] objArr = jSContext.releaseObjPtrPool.get(0);
            if (!jSContext.skippedPtrs.contains(objArr[3]) && jSContext.getNative()._releasePtr(jSContext.getContextPtr(), ((Long) objArr[0]).longValue(), ((Integer) objArr[1]).intValue(), ((Double) objArr[2]).doubleValue(), ((Long) objArr[3]).longValue())) {
                jSContext.skippedPtrs.add(objArr[3]);
            }
            jSContext.releaseObjPtrPool.remove(0);
        }
        if (jSContext.skippedPtrs.isEmpty()) {
            return;
        }
        jSContext.skippedPtrs.clear();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m80368h(JSContext jSContext) {
        if (jSContext.released) {
            return;
        }
        Iterator<Plugin> it = jSContext.plugins.iterator();
        while (it.hasNext()) {
            it.next().close(jSContext);
        }
        jSContext.plugins.clear();
        jSContext.functionRegistry.clear();
        for (JSValue jSValue : (JSValue[]) jSContext.refs.values().toArray(new JSValue[0])) {
            if (jSValue != null) {
                jSValue.close();
            }
        }
        jSContext.checkReleaseObjPtrPool();
        super.close();
        jSContext.getNative()._releaseContext(jSContext.contextPtr);
        QuickJS.sContextMap.remove(Long.valueOf(jSContext.getContextPtr()));
    }

    public void _registerCallback(JavaCallback javaCallback, JSFunction jSFunction) {
        QuickJS.MethodDescriptor methodDescriptor = new QuickJS.MethodDescriptor();
        methodDescriptor.callback = javaCallback;
        this.functionRegistry.put(Integer.valueOf(javaCallback.hashCode()), methodDescriptor);
    }

    public void addObjRef(JSValue jSValue) {
        if (jSValue.getClass() != JSContext.class) {
            this.refs.put(Integer.valueOf(jSValue.hashCode()), jSValue);
        }
    }

    public void addPlugin(Plugin plugin) {
        checkReleased();
        if (this.plugins.contains(plugin)) {
            return;
        }
        plugin.setup(this.context);
        this.plugins.add(plugin);
    }

    public void checkReleased() {
        checkReleaseObjPtrPool();
        if (isReleased()) {
            throw new Error("Context disposed error");
        }
    }

    public void checkRuntime(JSValue jSValue) {
        if (jSValue == null || jSValue.isUndefined()) {
            return;
        }
        JSContext jSContext = jSValue.context;
        if (jSContext == null) {
            throw new Error("Invalid target runtime");
        }
        QuickJS quickJS = jSContext.quickJS;
        if (quickJS == null || quickJS.isReleased() || quickJS != this.quickJS) {
            throw new Error("Invalid target runtime");
        }
    }

    @Override // com.quickjs.JSValue, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        postEventQueue(new Runnable() { // from class: l.miq
            @Override // java.lang.Runnable
            public final void run() {
                JSContext.m80368h(this.f134027a);
            }
        });
    }

    public JSArray executeArrayScript(String str, String str2) throws QuickJSException {
        return (JSArray) executeScript(JSValue.TYPE.JS_ARRAY, str, str2);
    }

    public Object executeBinaryScript(JSValue.TYPE type, String str, int i) throws QuickJSException {
        Object obj_executeBinaryScript = getNative()._executeBinaryScript(getContextPtr(), type.value, str, i);
        QuickJS.checkException(this.context);
        return obj_executeBinaryScript;
    }

    public boolean executeBooleanScript(String str, String str2) throws QuickJSException {
        return ((Boolean) executeScript(JSValue.TYPE.BOOLEAN, str, str2)).booleanValue();
    }

    public double executeDoubleScript(String str, String str2) throws QuickJSException {
        return ((Double) executeScript(JSValue.TYPE.DOUBLE, str, str2)).doubleValue();
    }

    public int executeIntegerScript(String str, String str2) throws QuickJSException {
        return ((Integer) executeScript(JSValue.TYPE.INTEGER, str, str2)).intValue();
    }

    public Object executeModuleScript(String str, String str2, int i) throws QuickJSException {
        Object obj_executeScript = getNative()._executeScript(getContextPtr(), JSValue.TYPE.UNKNOWN.value, str, str2, QuickJS.JS_EVAL_TYPE_MODULE);
        QuickJS.checkException(this.context);
        return obj_executeScript;
    }

    public Object executeObjectBinaryScript(String str) throws QuickJSException {
        return executeBinaryScript(JSValue.TYPE.JS_OBJECT, str, 0);
    }

    public JSObject executeObjectScript(String str, String str2) throws QuickJSException {
        return (JSObject) executeScript(JSValue.TYPE.JS_OBJECT, str, str2);
    }

    public Object executeScript(String str, String str2, int i) throws QuickJSException {
        Object obj_executeScript = getNative()._executeScript(getContextPtr(), JSValue.TYPE.UNKNOWN.value, str, str2, i);
        QuickJS.checkException(this.context);
        return obj_executeScript;
    }

    public String executeStringScript(String str, String str2) throws QuickJSException {
        return (String) executeScript(JSValue.TYPE.STRING, str, str2);
    }

    public Object executeVoidBinaryScript(String str) throws QuickJSException {
        return executeBinaryScript(JSValue.TYPE.NULL, str, 0);
    }

    public void executeVoidScript(String str, String str2) throws QuickJSException {
        executeScript(JSValue.TYPE.NULL, str, str2);
    }

    @Override // com.quickjs.JSValue
    public long getContextPtr() {
        return this.contextPtr;
    }

    @Override // com.quickjs.JSValue
    public QuickJSNative getNative() {
        return this.quickJS.getNative();
    }

    @Override // com.quickjs.JSValue
    public QuickJS getQuickJS() {
        return this.quickJS;
    }

    public boolean isReleased() {
        if (getQuickJS().isReleased()) {
            return true;
        }
        return this.released;
    }

    public void releaseObjRef(JSValue jSValue, boolean z) {
        if (z) {
            this.releaseObjPtrPool.add(new Object[]{Long.valueOf(jSValue.tag), Integer.valueOf(jSValue.u_int32), Double.valueOf(jSValue.u_float64), Long.valueOf(jSValue.u_ptr)});
        } else {
            getNative()._releasePtr(getContextPtr(), jSValue.tag, jSValue.u_int32, jSValue.u_float64, jSValue.u_ptr);
        }
        removeObjRef(jSValue);
    }

    public void removeObjRef(JSValue jSValue) {
        this.refs.remove(Integer.valueOf(jSValue.hashCode()));
    }

    public void _registerCallback(JavaVoidCallback javaVoidCallback, JSFunction jSFunction) {
        QuickJS.MethodDescriptor methodDescriptor = new QuickJS.MethodDescriptor();
        methodDescriptor.voidCallback = javaVoidCallback;
        this.functionRegistry.put(Integer.valueOf(javaVoidCallback.hashCode()), methodDescriptor);
    }

    public Object executeBinaryScript(String str) throws QuickJSException {
        return executeBinaryScript(JSValue.TYPE.UNKNOWN, str, 0);
    }

    public Object executeScript(String str, String str2) throws QuickJSException {
        return executeScript(JSValue.TYPE.UNKNOWN, str, str2);
    }

    public Object executeScript(JSValue.TYPE type, String str, String str2) throws QuickJSException {
        Object obj_executeScript = getNative()._executeScript(getContextPtr(), type.value, str, str2, QuickJS.JS_EVAL_TYPE_GLOBAL);
        QuickJS.checkException(this.context);
        return obj_executeScript;
    }
}
