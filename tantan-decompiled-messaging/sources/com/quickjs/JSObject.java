package com.quickjs;

import android.webkit.JavascriptInterface;
import com.quickjs.JSArray;
import com.quickjs.JSObject;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.aag0;
import p149l.upk0;

/* JADX INFO: loaded from: classes11.dex */
public class JSObject extends JSValue {
    public JSObject(JSContext jSContext, JSONObject jSONObject) {
        this(jSContext, jSContext.getNative()._initNewJSObject(jSContext.getContextPtr()));
        append(this, jSONObject);
    }

    public static void append(JSObject jSObject, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof String) {
                jSObject.set(next, (String) objOpt);
            } else if (objOpt instanceof Integer) {
                jSObject.set(next, ((Integer) objOpt).intValue());
            } else if (objOpt instanceof Boolean) {
                jSObject.set(next, ((Boolean) objOpt).booleanValue());
            } else if (objOpt instanceof Number) {
                jSObject.set(next, ((Number) objOpt).doubleValue());
            } else if (objOpt instanceof JSONObject) {
                jSObject.set(next, new JSObject(jSObject.context, (JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                jSObject.set(next, new JSArray(jSObject.context, (JSONArray) objOpt));
            }
        }
    }

    public static void appendJavascriptInterface(JSObject jSObject, final Object obj) {
        for (final Method method : obj.getClass().getMethods()) {
            if (method.getAnnotation(JavascriptInterface.class) != null) {
                String name = method.getName();
                if (method.getReturnType().equals(Void.TYPE)) {
                    jSObject.registerJavaMethod(new JavaVoidCallback() { // from class: l.yiq
                        @Override // com.quickjs.JavaVoidCallback
                        public final void invoke(JSObject jSObject2, JSArray jSArray) {
                            JSObject.m80369b(method, obj, jSObject2, jSArray);
                        }
                    }, name);
                } else {
                    jSObject.registerJavaMethod(new JavaCallback() { // from class: l.ziq
                        @Override // com.quickjs.JavaCallback
                        public final Object invoke(JSObject jSObject2, JSArray jSArray) {
                            return JSObject.m80370d(method, obj, jSObject2, jSArray);
                        }
                    }, name);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80369b(Method method, Object obj, JSObject jSObject, JSArray jSArray) {
        try {
            method.invoke(obj, getParameters(method, jSArray));
        } catch (Exception e) {
            aag0.m95543a(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m80370d(Method method, Object obj, JSObject jSObject, JSArray jSArray) {
        try {
            return method.invoke(obj, getParameters(method, jSArray));
        } catch (Exception e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m80371e(JavaConstructorCallback javaConstructorCallback, JSObject jSObject, JSArray jSArray) {
        JSObject jSObject2 = new JSObject(jSObject.context);
        javaConstructorCallback.invoke(jSObject2, jSArray);
        return jSObject2;
    }

    private static Object[] getParameters(Method method, JSArray jSArray) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        int length = genericParameterTypes.length;
        Object[] objArr = new Object[length];
        int length2 = jSArray.length();
        for (int i = 0; i < genericParameterTypes.length - length2; i++) {
            jSArray.push(JSValue.Undefined(jSArray.context));
        }
        for (int i2 = 0; i2 < length; i2++) {
            Type type = genericParameterTypes[i2];
            if (type == Integer.TYPE || type == Integer.class) {
                objArr[i2] = Integer.valueOf(jSArray.getInteger(i2));
            } else if (type == Double.TYPE || type == Double.class) {
                objArr[i2] = Double.valueOf(jSArray.getDouble(i2));
            } else if (type == Boolean.TYPE || type == Boolean.class) {
                objArr[i2] = Boolean.valueOf(jSArray.getBoolean(i2));
            } else if (type == String.class) {
                objArr[i2] = jSArray.getString(i2);
            } else if (type == JSArray.class) {
                objArr[i2] = jSArray.getArray(i2);
            } else if (type == JSObject.class || type == JSFunction.class) {
                objArr[i2] = jSArray.getObject(i2);
            } else {
                if (type != Object.class) {
                    upk0.m194883a("Type error");
                    return null;
                }
                objArr[i2] = jSArray.getObject(i2);
            }
        }
        return objArr;
    }

    public Object _executeFunction(JSValue.TYPE type, String str, JSArray jSArray) {
        this.context.checkReleased();
        this.context.checkRuntime(jSArray);
        Object obj_executeFunction = getNative()._executeFunction(this.context.getContextPtr(), type.value, this, str, jSArray);
        QuickJS.checkException(this.context);
        return JSValue.checkType(obj_executeFunction, type);
    }

    public JSObject addJavascriptInterface(Object obj, String str) {
        this.context.checkReleased();
        JSObject jSObject = new JSObject(this.context);
        appendJavascriptInterface(jSObject, obj);
        set(str, jSObject);
        return jSObject;
    }

    public boolean contains(String str) {
        this.context.checkReleased();
        return getContext().getNative()._contains(getContextPtr(), this, str);
    }

    public JSArray executeArrayFunction(String str, JSArray jSArray) {
        return (JSArray) _executeFunction(JSValue.TYPE.JS_ARRAY, str, jSArray);
    }

    public boolean executeBooleanFunction(String str, JSArray jSArray) {
        return ((Boolean) _executeFunction(JSValue.TYPE.BOOLEAN, str, jSArray)).booleanValue();
    }

    public double executeDoubleFunction(String str, JSArray jSArray) {
        return ((Double) _executeFunction(JSValue.TYPE.DOUBLE, str, jSArray)).doubleValue();
    }

    public Object executeFunction(String str, JSArray jSArray) {
        return _executeFunction(JSValue.TYPE.UNKNOWN, str, jSArray);
    }

    public Object executeFunction2(String str, Object... objArr) {
        this.context.checkReleased();
        return QuickJS.executeFunction(this.context, this, str, objArr);
    }

    public int executeIntegerFunction(String str, JSArray jSArray) {
        return ((Integer) _executeFunction(JSValue.TYPE.INTEGER, str, jSArray)).intValue();
    }

    public JSObject executeObjectFunction(String str, JSArray jSArray) {
        return (JSObject) _executeFunction(JSValue.TYPE.JS_OBJECT, str, jSArray);
    }

    public String executeStringFunction(String str, JSArray jSArray) {
        return (String) _executeFunction(JSValue.TYPE.STRING, str, jSArray);
    }

    public void executeVoidFunction(String str, JSArray jSArray) {
        _executeFunction(JSValue.TYPE.NULL, str, jSArray);
    }

    public Object get(JSValue.TYPE type, String str) {
        this.context.checkReleased();
        if (type == null) {
            type = JSValue.TYPE.UNKNOWN;
        }
        return JSValue.checkType(this.context.getNative()._get(getContextPtr(), type.value, this, str), type);
    }

    public JSArray getArray(String str) {
        return (JSArray) get(JSValue.TYPE.JS_ARRAY, str);
    }

    public boolean getBoolean(String str) {
        return ((Boolean) get(JSValue.TYPE.BOOLEAN, str)).booleanValue();
    }

    public double getDouble(String str) {
        return ((Double) get(JSValue.TYPE.DOUBLE, str)).doubleValue();
    }

    public int getInteger(String str) {
        return ((Integer) get(JSValue.TYPE.INTEGER, str)).intValue();
    }

    public String[] getKeys() {
        this.context.checkReleased();
        return getContext().getNative()._getKeys(getContextPtr(), this);
    }

    public JSObject getObject(String str) {
        return (JSObject) get(JSValue.TYPE.JS_OBJECT, str);
    }

    public String getString(String str) {
        return (String) get(JSValue.TYPE.STRING, str);
    }

    public JSValue.TYPE getType(String str) {
        JSValue jSValue_getValue = getContext().getNative()._getValue(getContextPtr(), this, str);
        return jSValue_getValue == null ? JSValue.TYPE.NULL : jSValue_getValue.getType();
    }

    public JSFunction registerClass(final JavaConstructorCallback javaConstructorCallback, String str) {
        JavaCallback javaCallback = new JavaCallback() { // from class: l.ajq
            @Override // com.quickjs.JavaCallback
            public final Object invoke(JSObject jSObject, JSArray jSArray) {
                return JSObject.m80371e(javaConstructorCallback, jSObject, jSArray);
            }
        };
        JSFunction jSFunction_newClass = this.context.getNative()._newClass(this.context.getContextPtr(), javaCallback.hashCode());
        this.context._registerCallback(javaCallback, jSFunction_newClass);
        set(str, jSFunction_newClass);
        return jSFunction_newClass;
    }

    public JSFunction registerJavaMethod(JavaCallback javaCallback, String str) {
        this.context.checkReleased();
        JSFunction jSFunction_registerJavaMethod = getNative()._registerJavaMethod(getContextPtr(), this, str, javaCallback.hashCode(), false);
        this.context._registerCallback(javaCallback, jSFunction_registerJavaMethod);
        return jSFunction_registerJavaMethod;
    }

    public JSObject set(String str, JSValue jSValue) {
        this.context.checkRuntime(jSValue);
        return setObject(str, jSValue);
    }

    public JSObject setObject(String str, Object obj) {
        this.context.checkReleased();
        this.context.getNative()._set(getContextPtr(), this, str, obj);
        return this;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        for (String str : getKeys()) {
            Object obj = get(str);
            if (!(obj instanceof Undefined) && !(obj instanceof JSFunction)) {
                if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
                    try {
                        jSONObject.put(str, obj);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (obj instanceof JSArray) {
                    try {
                        jSONObject.put(str, ((JSArray) obj).toJSONArray());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (obj instanceof JSObject) {
                    try {
                        jSONObject.put(str, ((JSObject) obj).toJSONObject());
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static class Undefined extends JSObject {
        public Undefined(JSContext jSContext, long j, int i, double d, long j2) {
            super(jSContext, j, i, d, j2);
            this.released = true;
        }

        @Override // com.quickjs.JSObject
        public Object _executeFunction(JSValue.TYPE type, String str, JSArray jSArray) {
            throw new UnsupportedOperationException();
        }

        @Override // com.quickjs.JSObject
        public Object get(JSValue.TYPE type, String str) {
            throw new UnsupportedOperationException();
        }

        public int hashCode() {
            return 99;
        }

        @Override // com.quickjs.JSObject
        public JSFunction registerJavaMethod(JavaCallback javaCallback, String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.quickjs.JSObject
        public JSObject setObject(String str, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.quickjs.JSObject
        public JSFunction registerJavaMethod(JavaVoidCallback javaVoidCallback, String str) {
            throw new UnsupportedOperationException();
        }
    }

    public JSObject set(String str, double d) {
        return setObject(str, Double.valueOf(d));
    }

    public JSObject set(String str, String str2) {
        return setObject(str, str2);
    }

    public JSObject set(String str, boolean z) {
        return setObject(str, Boolean.valueOf(z));
    }

    public JSObject set(String str, int i) {
        return setObject(str, Integer.valueOf(i));
    }

    public JSObject(JSContext jSContext) {
        super(jSContext, jSContext.getNative()._initNewJSObject(jSContext.getContextPtr()));
    }

    public JSObject(JSContext jSContext, JSValue jSValue) {
        super(jSContext, jSValue);
    }

    public JSObject(JSContext jSContext, long j, int i, double d, long j2) {
        super(jSContext, j, i, d, j2);
    }

    public JSFunction registerJavaMethod(JavaVoidCallback javaVoidCallback, String str) {
        this.context.checkReleased();
        JSFunction jSFunction_registerJavaMethod = getNative()._registerJavaMethod(getContextPtr(), this, str, javaVoidCallback.hashCode(), true);
        this.context._registerCallback(javaVoidCallback, jSFunction_registerJavaMethod);
        return jSFunction_registerJavaMethod;
    }

    public Object get(String str) {
        return get(JSValue.TYPE.UNKNOWN, str);
    }

    public void appendJavascriptInterface(Object obj) {
        appendJavascriptInterface(this, obj);
    }
}
