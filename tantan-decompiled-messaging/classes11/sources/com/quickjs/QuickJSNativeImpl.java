package com.quickjs;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class QuickJSNativeImpl implements QuickJSNative {
    public static native long _createRuntime();

    @Override // com.quickjs.QuickJSNative
    public native JSValue _Undefined(long j);

    @Override // com.quickjs.QuickJSNative
    public native void _arrayAdd(long j, JSValue jSValue, Object obj);

    @Override // com.quickjs.QuickJSNative
    public native Object _arrayGet(long j, int i, JSValue jSValue, int i2);

    @Override // com.quickjs.QuickJSNative
    public native JSValue _arrayGetValue(long j, JSArray jSArray, int i);

    @Override // com.quickjs.QuickJSNative
    public native boolean _contains(long j, JSValue jSValue, String str);

    @Override // com.quickjs.QuickJSNative
    public native long _createContext(long j);

    @Override // com.quickjs.QuickJSNative
    public native Object _executeBinaryScript(long j, int i, String str, int i2);

    @Override // com.quickjs.QuickJSNative
    public native Object _executeFunction(long j, int i, JSValue jSValue, String str, JSValue jSValue2);

    @Override // com.quickjs.QuickJSNative
    public native Object _executeFunction2(long j, int i, JSValue jSValue, JSValue jSValue2, JSValue jSValue3);

    @Override // com.quickjs.QuickJSNative
    public native Object _executeScript(long j, int i, String str, String str2, int i2);

    @Override // com.quickjs.QuickJSNative
    public native Object _get(long j, int i, JSValue jSValue, String str);

    @Override // com.quickjs.QuickJSNative
    public native String[] _getException(long j);

    @Override // com.quickjs.QuickJSNative
    public native JSObject _getGlobalObject(long j);

    @Override // com.quickjs.QuickJSNative
    public native String[] _getKeys(long j, JSValue jSValue);

    @Override // com.quickjs.QuickJSNative
    public native int _getObjectType(long j, JSValue jSValue);

    @Override // com.quickjs.QuickJSNative
    public native JSValue _getValue(long j, JSObject jSObject, String str);

    @Override // com.quickjs.QuickJSNative
    public native JSArray _initNewJSArray(long j);

    @Override // com.quickjs.QuickJSNative
    public native JSFunction _initNewJSFunction(long j, int i, boolean z);

    @Override // com.quickjs.QuickJSNative
    public native JSObject _initNewJSObject(long j);

    @Override // com.quickjs.QuickJSNative
    public native boolean _isUndefined(long j, JSValue jSValue);

    @Override // com.quickjs.QuickJSNative
    public native JSFunction _newClass(long j, int i);

    @Override // com.quickjs.QuickJSNative
    public native JSFunction _registerJavaMethod(long j, JSValue jSValue, String str, int i, boolean z);

    @Override // com.quickjs.QuickJSNative
    public native void _releaseContext(long j);

    @Override // com.quickjs.QuickJSNative
    public native boolean _releasePtr(long j, long j2, int i, double d, long j3);

    @Override // com.quickjs.QuickJSNative
    public native void _releaseRuntime(long j);

    @Override // com.quickjs.QuickJSNative
    public native void _set(long j, JSValue jSValue, String str, Object obj);
}
