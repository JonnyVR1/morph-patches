package com.effectsar.labcv.licenselibrary;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class EffectsSDKLicenseWrapper implements EffectsSDKLicenseInterface {
    static boolean mLoadLib;
    private HttpRequestProvider _provider;
    private long mNativeWrapperPtr = 0;

    public EffectsSDKLicenseWrapper(HashMap<String, String> map, HttpRequestProvider httpRequestProvider) {
        this._provider = null;
        if (!mLoadLib) {
            loadLib();
            mLoadLib = true;
        }
        this._provider = httpRequestProvider;
        nativeGetInstanceWithParam(map);
    }

    public static int checkLicense(ByteBuffer byteBuffer, EffectsSDKLicenseInterface.LICENSE_FUNCTION_NAME license_function_name, boolean z) {
        return nativeCheckLicense(byteBuffer, byteBuffer.capacity(), license_function_name.getValue(), z);
    }

    public static int checkLicenseBase(ByteBuffer byteBuffer, boolean z) {
        return nativeCheckLicenseBase(byteBuffer, byteBuffer.capacity(), z);
    }

    public static void loadLib() throws UnsatisfiedLinkError {
        try {
            System.loadLibrary("effect");
            System.err.println("licenseWrapper_jni: library load!");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("WARNING: licenseWrapper_jni Could not load library in default path!");
            System.err.print(e);
        }
    }

    private static native int nativeCheckLicense(String str, int i, boolean z);

    private static native int nativeCheckLicense(ByteBuffer byteBuffer, int i, int i2, boolean z);

    private static native int nativeCheckLicenseBase(String str, boolean z);

    private static native int nativeCheckLicenseBase(ByteBuffer byteBuffer, int i, boolean z);

    private native void nativeClearParams();

    private native int nativeGetInstanceWithParam(HashMap<String, String> map);

    private native int nativeGetLicenseWithParams(HashMap<String, String> map, boolean z, LicenseCallback licenseCallback);

    private native String nativeGetParam(String str);

    public static native void nativeSetDeviceIdType(int i);

    private native void nativeSetParam(String str, String str2);

    private native int nativeUpdateLicenseWithParams(HashMap<String, String> map, boolean z, LicenseCallback licenseCallback);

    @Override // com.effectsar.labcv.licenselibrary.EffectsSDKLicenseInterface
    public void clearParams() {
        nativeClearParams();
    }

    @Override // com.effectsar.labcv.licenselibrary.EffectsSDKLicenseInterface
    public int getLicenseWithParams(HashMap<String, String> map, boolean z, LicenseCallback licenseCallback) {
        return nativeGetLicenseWithParams(map, z, licenseCallback);
    }

    @Override // com.effectsar.labcv.licenselibrary.EffectsSDKLicenseInterface
    public String getParam(String str) {
        return nativeGetParam(str);
    }

    @Override // com.effectsar.labcv.licenselibrary.EffectsSDKLicenseInterface
    public void registerHttpProvider(HttpRequestProvider httpRequestProvider) {
        this._provider = httpRequestProvider;
    }

    @Override // com.effectsar.labcv.licenselibrary.EffectsSDKLicenseInterface
    public void setParam(String str, String str2) {
        nativeSetParam(str, str2);
    }

    @Override // com.effectsar.labcv.licenselibrary.EffectsSDKLicenseInterface
    public int updateLicenseWithParams(HashMap<String, String> map, boolean z, LicenseCallback licenseCallback) {
        return nativeUpdateLicenseWithParams(map, z, licenseCallback);
    }

    public static int checkLicenseBase(String str, boolean z) {
        return nativeCheckLicenseBase(str, z);
    }

    public static int checkLicense(String str, EffectsSDKLicenseInterface.LICENSE_FUNCTION_NAME license_function_name, boolean z) {
        return nativeCheckLicense(str, license_function_name.getValue(), z);
    }
}
