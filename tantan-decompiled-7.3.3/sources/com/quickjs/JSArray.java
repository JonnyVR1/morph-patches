package com.quickjs;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class JSArray extends JSObject {
    public JSArray(JSContext jSContext) {
        super(jSContext, jSContext.getNative()._initNewJSArray(jSContext.getContextPtr()));
    }

    public static void append(JSArray jSArray, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof String) {
                jSArray.push((String) objOpt);
            } else if (objOpt instanceof Integer) {
                jSArray.push(((Integer) objOpt).intValue());
            } else if (objOpt instanceof Boolean) {
                jSArray.push(((Boolean) objOpt).booleanValue());
            } else if (objOpt instanceof Number) {
                jSArray.push(((Number) objOpt).doubleValue());
            } else if (objOpt instanceof JSONObject) {
                jSArray.push(new JSObject(jSArray.context, (JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                jSArray.push(new JSArray(jSArray.context, (JSONArray) objOpt));
            }
        }
    }

    public Object get(JSValue.TYPE type, int i) {
        this.context.checkReleased();
        if (type == null) {
            type = JSValue.TYPE.UNKNOWN;
        }
        return JSValue.checkType(getNative()._arrayGet(getContextPtr(), type.value, this, i), type);
    }

    public JSArray getArray(int i) {
        Object obj = get(JSValue.TYPE.JS_ARRAY, i);
        if (obj instanceof JSArray) {
            return (JSArray) obj;
        }
        return null;
    }

    public boolean getBoolean(int i) {
        Object obj = get(JSValue.TYPE.BOOLEAN, i);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public double getDouble(int i) {
        Object obj = get(JSValue.TYPE.DOUBLE, i);
        return obj instanceof Double ? ((Double) obj).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public int getInteger(int i) {
        Object obj = get(JSValue.TYPE.INTEGER, i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public JSObject getObject(int i) {
        Object obj = get(JSValue.TYPE.JS_OBJECT, i);
        if (obj instanceof JSObject) {
            return (JSObject) obj;
        }
        return null;
    }

    public String getString(int i) {
        Object obj = get(JSValue.TYPE.STRING, i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public JSValue.TYPE getType(int i) {
        this.context.checkReleased();
        JSValue jSValue_arrayGetValue = getContext().getNative()._arrayGetValue(getContextPtr(), this, i);
        return jSValue_arrayGetValue == null ? JSValue.TYPE.NULL : jSValue_arrayGetValue.getType();
    }

    public int length() {
        return getInteger("length");
    }

    public JSArray push(JSValue jSValue) {
        this.context.checkRuntime(jSValue);
        return pushObject(jSValue);
    }

    public JSArray pushObject(Object obj) {
        this.context.checkReleased();
        getNative()._arrayAdd(getContextPtr(), this, obj);
        return this;
    }

    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < length(); i++) {
            Object obj = get(i);
            if (!(obj instanceof JSObject.Undefined) && !(obj instanceof JSFunction)) {
                if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
                    jSONArray.put(obj);
                } else if (obj instanceof JSArray) {
                    jSONArray.put(((JSArray) obj).toJSONArray());
                } else if (obj instanceof JSObject) {
                    jSONArray.put(((JSObject) obj).toJSONObject());
                }
            }
        }
        return jSONArray;
    }

    public JSArray push(double d) {
        return pushObject(Double.valueOf(d));
    }

    public JSArray push(String str) {
        return pushObject(str);
    }

    public JSArray push(boolean z) {
        return pushObject(Boolean.valueOf(z));
    }

    public JSArray push(int i) {
        return pushObject(Integer.valueOf(i));
    }

    public JSArray(JSContext jSContext, long j, int i, double d, long j2) {
        super(jSContext, j, i, d, j2);
    }

    public JSArray(JSContext jSContext, JSONArray jSONArray) {
        this(jSContext);
        append(this, jSONArray);
    }

    public Object get(int i) {
        return get(JSValue.TYPE.UNKNOWN, i);
    }
}
