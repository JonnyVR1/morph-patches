package com.quickjs;

/* JADX INFO: loaded from: classes11.dex */
public class JSFunction extends JSObject {
    public JSFunction(JSContext jSContext, JavaCallback javaCallback) {
        super(jSContext, jSContext.getNative()._initNewJSFunction(jSContext.getContextPtr(), javaCallback.hashCode(), false));
        this.context._registerCallback(javaCallback, this);
    }

    public Object call(JSValue.TYPE type, JSObject jSObject, JSArray jSArray) {
        this.context.checkReleased();
        this.context.checkRuntime(jSArray);
        if (jSObject == null) {
            jSObject = JSValue.Undefined(this.context);
        }
        Object obj_executeFunction2 = getNative()._executeFunction2(this.context.getContextPtr(), type.value, jSObject, this, jSArray);
        QuickJS.checkException(this.context);
        return JSValue.checkType(obj_executeFunction2, type);
    }

    public JSFunction(JSContext jSContext, JavaVoidCallback javaVoidCallback) {
        super(jSContext, jSContext.getNative()._initNewJSFunction(jSContext.getContextPtr(), javaVoidCallback.hashCode(), true));
        this.context._registerCallback(javaVoidCallback, this);
    }

    public JSFunction(JSContext jSContext, long j, int i, double d, long j2) {
        super(jSContext, j, i, d, j2);
    }

    public Object call(JSObject jSObject, JSArray jSArray) {
        return call(JSValue.TYPE.UNKNOWN, jSObject, jSArray);
    }
}
