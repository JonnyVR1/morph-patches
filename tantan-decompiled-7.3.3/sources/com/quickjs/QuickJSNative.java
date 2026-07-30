package com.quickjs;

/* JADX INFO: loaded from: classes10.dex */
public interface QuickJSNative {
    JSValue _Undefined(long j);

    void _arrayAdd(long j, JSValue jSValue, Object obj);

    Object _arrayGet(long j, int i, JSValue jSValue, int i2);

    JSValue _arrayGetValue(long j, JSArray jSArray, int i);

    boolean _contains(long j, JSValue jSValue, String str);

    long _createContext(long j);

    Object _executeBinaryScript(long j, int i, String str, int i2);

    Object _executeFunction(long j, int i, JSValue jSValue, String str, JSValue jSValue2);

    Object _executeFunction2(long j, int i, JSValue jSValue, JSValue jSValue2, JSValue jSValue3);

    Object _executeScript(long j, int i, String str, String str2, int i2);

    Object _get(long j, int i, JSValue jSValue, String str);

    String[] _getException(long j);

    JSObject _getGlobalObject(long j);

    String[] _getKeys(long j, JSValue jSValue);

    int _getObjectType(long j, JSValue jSValue);

    JSValue _getValue(long j, JSObject jSObject, String str);

    JSArray _initNewJSArray(long j);

    JSFunction _initNewJSFunction(long j, int i, boolean z);

    JSObject _initNewJSObject(long j);

    boolean _isUndefined(long j, JSValue jSValue);

    JSFunction _newClass(long j, int i);

    JSFunction _registerJavaMethod(long j, JSValue jSValue, String str, int i, boolean z);

    void _releaseContext(long j);

    boolean _releasePtr(long j, long j2, int i, double d, long j3);

    void _releaseRuntime(long j);

    void _set(long j, JSValue jSValue, String str, Object obj);
}
