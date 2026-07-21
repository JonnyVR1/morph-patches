package com.p1.mobile.putong.data.extension.signature;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * Signature spoofing application that intercepts PackageManager signature queries.
 * 
 * This class hooks into the Android framework to return the original Tantan signing
 * certificate when any code queries the app's signature. This allows Google Maps
 * and other signature-dependent services to work correctly after the APK is re-signed.
 * 
 * Implementation based on:
 * - https://github.com/L-JINBIN/ApkSignatureKiller
 * - https://github.com/hoo-dles/morphe-patches
 * - https://github.com/rushiranpise/morphe-patches
 */
public class SignatureSpoofApplication extends Application {
    private static final String TAG = "SignatureSpoof";
    private static final int GET_SIGNATURES = 0x00000040;
    
    // Original Tantan certificate (SHA-1: 71:5B:AB:0F:36:33:95:FE:34:D1:87:68:4B:0E:F7:71:A9:D4:00:F0)
    // Extracted from: tantan+-+Global+Dating+App_7.2.7_APKPure.xapk
    private static final String ORIGINAL_SIGNATURE_BASE64 = 
        "MIIDazCCAlOgAwIBAgIEXrmQTjANBgkqhkiG9w0BAQsFADBlMQswCQYDVQQGEwJjbjEQMA4GA1UECBMH" +
        "YmVpamluZzEQMA4GA1UEBxMHYmVpamluZzEPMA0GA1UEChMGemhpd2VuMQ8wDQYDVQQLEwZ6aGl3ZW4x" +
        "EDAOBgNVBAMTB3R0dHJpYmUwIBcNMjQwODE1MDgzNTI1WhgPMjA1MjAxMDEwODM1MjVaMGUxCzAJBgNV" +
        "BAYTAmNuMRAwDgYDVQQIEwdiZWlqaW5nMRAwDgYDVQQHEwdiZWlqaW5nMQ8wDQYDVQQKEwZ6aGl3ZW4x" +
        "DzANBgNVBAsTBnpoaXdlbjEQMA4GA1UEAxMHdHR0cmliZTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCC" +
        "AQoCggEBAJ6EeV5CPv7COn6Gm2HUnBi+8WZShy7FrIV3vJ+nI6xHrDLJ18Gh9vwtpvh+rALBK2JYnj8Q" +
        "JJMIEO1+JGQydBgfv17dbNTkaNv6Vd2RcjY5yRDSGyhzByERoTFq+m23UohzGqa+WNG6tWisEj6ugJKP" +
        "Txn63EyWDydh8E2e+vBa+9ueraGBXyqo2Ekmze07r4tR5hpZK1aC1E/tjzAxa7du7zchyBsoaq4iXP/w" +
        "NcebpFXe1hr38VSdpNVwG+kxAX9rhIXS7xy5uI6i9DrdM7/p3lRueIEAQ1srr0F60U9Tr7BdKWXlXTPy" +
        "FrsV9TwpQz9ZWlrxTPuzSOhM2Swe7DECAwEAAaMhMB8wHQYDVR0OBBYEFMNag9W+nIOM8axzW+BdqHze" +
        "vHAVMA0GCSqGSIb3DQEBCwUAA4IBAQAdayAZ6iWLFENHngbnFZrHJncwhYTuACIQw+4Uvl0EuaP3wO5g" +
        "HOjPf83jLCmnDNWpDY+QeC3qIAyorm9xxAkOp2LsL3JVpZPQkLseb1VgtT4kCZWs50FFZ4iQyx4v+uzz" +
        "TPMXDpV8dwwrkj3p1OvmZKG3R+n+5o0GY5p0mzO+NiYRZcdnaAVQ7YjC7p02GtkuIcFapN0CE3aXOVh8" +
        "9gAo07GxrqHSmQ35RpV6gY05Eij3wIQIQbf+Hg4FQ0g/LsWyidtMTY08DnD+Rwz1JoQ9fqe1bTzMkbRV" +
        "65R/uNJUYp9Q0ci2NKoPn9ktHpnOZVVpC90Vl4bLiT8Nr/D6uu0s";
    
    private Object originalPackageManager;
    private Signature spoofedSignature;
    private String packageName;
    
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        
        try {
            packageName = base.getPackageName();
            Log.d(TAG, "Initializing signature spoof for package: " + packageName);
            
            // Decode the original signature
            spoofedSignature = new Signature(Base64.decode(ORIGINAL_SIGNATURE_BASE64, Base64.DEFAULT));
            
            // Hook the PackageManager
            hookPackageManager(base);
            
            // Clear caches to ensure spoofed signature is used
            clearPackageManagerCaches();
            
            Log.d(TAG, "Signature spoof initialized successfully");
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize signature spoof", e);
        }
    }
    
    private void hookPackageManager(Context context) {
        try {
            // Get the ActivityThread class
            Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
            Method currentActivityThreadMethod = activityThreadClass.getDeclaredMethod("currentActivityThread");
            currentActivityThreadMethod.setAccessible(true);
            Object currentActivityThread = currentActivityThreadMethod.invoke(null);
            
            // Get the sPackageManager field
            Field sPackageManagerField = activityThreadClass.getDeclaredField("sPackageManager");
            sPackageManagerField.setAccessible(true);
            originalPackageManager = sPackageManagerField.get(currentActivityThread);
            
            // Create a proxy for IPackageManager
            Class<?> iPackageManagerInterface = Class.forName("android.content.pm.IPackageManager");
            Object proxy = Proxy.newProxyInstance(
                iPackageManagerInterface.getClassLoader(),
                new Class<?>[]{iPackageManagerInterface},
                new PackageManagerInvocationHandler()
            );
            
            // Replace the sPackageManager with our proxy
            sPackageManagerField.set(currentActivityThread, proxy);
            
            // Also hook the PackageManager's mPM field
            PackageManager pm = context.getPackageManager();
            Field mPmField = pm.getClass().getDeclaredField("mPM");
            mPmField.setAccessible(true);
            mPmField.set(pm, proxy);
            
            Log.d(TAG, "PackageManager hooked successfully");
        } catch (Exception e) {
            Log.e(TAG, "Failed to hook PackageManager", e);
        }
    }
    
    private void clearPackageManagerCaches() {
        try {
            // Clear PackageInfo cache
            Field cacheField = PackageManager.class.getDeclaredField("sPackageInfoCache");
            cacheField.setAccessible(true);
            Object cache = cacheField.get(null);
            if (cache != null) {
                Method clearMethod = cache.getClass().getMethod("clear");
                clearMethod.invoke(cache);
            }
            
            // Clear Parcel creator caches
            Field mCreatorsField = Parcel.class.getDeclaredField("mCreators");
            mCreatorsField.setAccessible(true);
            Map<?, ?> mCreators = (Map<?, ?>) mCreatorsField.get(null);
            if (mCreators != null) {
                mCreators.clear();
            }
            
            Field sPairedCreatorsField = Parcel.class.getDeclaredField("sPairedCreators");
            sPairedCreatorsField.setAccessible(true);
            Map<?, ?> sPairedCreators = (Map<?, ?>) sPairedCreatorsField.get(null);
            if (sPairedCreators != null) {
                sPairedCreators.clear();
            }
            
            Log.d(TAG, "PackageManager caches cleared");
        } catch (Exception e) {
            Log.e(TAG, "Failed to clear PackageManager caches", e);
        }
    }
    
    /**
     * InvocationHandler that intercepts PackageManager calls
     */
    private class PackageManagerInvocationHandler implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            try {
                if ("getPackageInfo".equals(method.getName())) {
                    String pkgName = (String) args[0];
                    int flags = (Integer) args[1];
                    
                    // Check if signatures are being requested for our package
                    if ((flags & GET_SIGNATURES) != 0 && packageName.equals(pkgName)) {
                        PackageInfo info = (PackageInfo) method.invoke(originalPackageManager, args);
                        if (info != null) {
                            // Replace the signature with the original one
                            info.signatures = new Signature[]{spoofedSignature};
                            
                            // Also set signingInfo for newer Android versions (API 28+)
                            if (Build.VERSION.SDK_INT >= 28) {
                                try {
                                    Field signingInfoField = PackageInfo.class.getDeclaredField("signingInfo");
                                    signingInfoField.setAccessible(true);
                                    Object signingInfo = signingInfoField.get(info);
                                    if (signingInfo != null) {
                                        // Update the signatures in SigningInfo
                                        Field signaturesField = signingInfo.getClass().getDeclaredField("mSignatures");
                                        signaturesField.setAccessible(true);
                                        signaturesField.set(signingInfo, new Signature[]{spoofedSignature});
                                    }
                                } catch (Exception e) {
                                    Log.w(TAG, "Failed to update SigningInfo", e);
                                }
                            }
                            
                            Log.d(TAG, "Spoofed signature for getPackageInfo: " + pkgName);
                            return info;
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, "Error in PackageManager invocation handler", e);
            }
            
            // Call the original method for all other cases
            return method.invoke(originalPackageManager, args);
        }
    }
}
