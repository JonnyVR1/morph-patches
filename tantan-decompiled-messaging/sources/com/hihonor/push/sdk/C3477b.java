package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.bean.RemoteServiceBean;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import com.hihonor.push.sdk.ipc.HonorApiAvailability$PackageStates;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: renamed from: com.hihonor.push.sdk.b */
/* JADX INFO: loaded from: classes7.dex */
public class C3477b {
    /* JADX INFO: renamed from: a */
    public static RequestHeader m17486a() throws ApiException {
        String string;
        Context contextM17520a = C3505l.f11890e.m17520a();
        String strValueOf = null;
        try {
            Object obj = contextM17520a.getPackageManager().getApplicationInfo(contextM17520a.getPackageName(), 128).metaData.get("com.hihonor.push.app_id");
            if (obj != null) {
                strValueOf = String.valueOf(obj);
            }
        } catch (PackageManager.NameNotFoundException e) {
            C3480c.m17504a("ConfigUtils", "getPushAppId", e);
        }
        if (TextUtils.isEmpty(strValueOf)) {
            C3480c.m17503a("checkPushConfig Parameter is missing");
            throw HonorPushErrorEnum.ERROR_NO_APPID.toApiException();
        }
        String strM17491a = m17491a(contextM17520a, contextM17520a.getPackageName());
        if (TextUtils.isEmpty(strM17491a)) {
            C3480c.m17503a("checkPushConfig Parameter is missing.");
            throw HonorPushErrorEnum.ERROR_CERT_FINGERPRINT_EMPTY.toApiException();
        }
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setPackageName(contextM17520a.getPackageName());
        requestHeader.setAppId(strValueOf);
        requestHeader.setCertificateFingerprint(strM17491a);
        C3484d c3484d = C3484d.f11851b;
        requestHeader.setPushToken(c3484d.m17508b(contextM17520a));
        synchronized (c3484d) {
            c3484d.m17506a(contextM17520a);
            SharedPreferences sharedPreferences = C3484d.f11850a.f11881a;
            string = sharedPreferences != null ? sharedPreferences.getString("key_aaid", "") : "";
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString().replace("-", "");
                C3484d.f11850a.m17516a("key_aaid", string);
            }
        }
        requestHeader.setAAID(string);
        requestHeader.setSdkVersion(70041301);
        return requestHeader;
    }

    /* JADX INFO: renamed from: b */
    public static int m17498b(Context context) {
        HonorApiAvailability$PackageStates honorApiAvailability$PackageStates;
        if (context == null) {
            jfd0.m141176a("context must not be null.");
            return 0;
        }
        RemoteServiceBean remoteServiceBeanM17488a = m17488a(context);
        String packageName = remoteServiceBeanM17488a.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            honorApiAvailability$PackageStates = HonorApiAvailability$PackageStates.NOT_INSTALLED;
        } else {
            try {
                honorApiAvailability$PackageStates = context.getPackageManager().getApplicationInfo(packageName, 0).enabled ? HonorApiAvailability$PackageStates.ENABLED : HonorApiAvailability$PackageStates.DISABLED;
            } catch (PackageManager.NameNotFoundException unused) {
                honorApiAvailability$PackageStates = HonorApiAvailability$PackageStates.NOT_INSTALLED;
            }
        }
        if (HonorApiAvailability$PackageStates.NOT_INSTALLED.equals(honorApiAvailability$PackageStates)) {
            return 8002008;
        }
        if (HonorApiAvailability$PackageStates.DISABLED.equals(honorApiAvailability$PackageStates)) {
            return 8002007;
        }
        if (!TextUtils.equals(packageName, "android") || TextUtils.isEmpty(remoteServiceBeanM17488a.getPackageSignature())) {
            return 8002006;
        }
        return HonorPushErrorEnum.SUCCESS.statusCode;
    }

    /* JADX INFO: renamed from: a */
    public static void m17494a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e) {
            C3480c.m17504a("DeflateUtil", "close", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m17495a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("0x");
                int i2 = i * 2;
                byte[] bArr2 = {bytes[i2]};
                Charset charset = StandardCharsets.UTF_8;
                sb.append(new String(bArr2, charset));
                bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, charset)).byteValue());
            }
            return bArr;
        } catch (NumberFormatException e) {
            e.getMessage();
            return bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m17496a(byte[] bArr, int i) {
        if (bArr == null) {
            return bArr;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i < 0) {
                bArr[i2] = (byte) (bArr[i2] << (-i));
            } else {
                bArr[i2] = (byte) (bArr[i2] >> i);
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m17497a(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || bArr2.length != (length = bArr.length)) {
            return null;
        }
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    public static <TResult> C3476a1 m17487a(Callable<TResult> callable) {
        ExecutorService executorService = C3512o0.f11903c.f11905b;
        C3510n0 c3510n0 = new C3510n0();
        try {
            executorService.execute(new RunnableC3534z0(c3510n0, callable));
        } catch (Exception e) {
            c3510n0.m17523a(e);
        }
        return c3510n0.f11901a;
    }

    /* JADX INFO: renamed from: a */
    public static void m17493a(Handler handler) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        qkq0.m175383a("Must be called on the handler thread");
    }

    /* JADX INFO: renamed from: a */
    public static <TResult> TResult m17490a(C3476a1 c3476a1) throws ExecutionException, InterruptedException {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (c3476a1.f11840a) {
                z = c3476a1.f11841b;
            }
            if (!z) {
                C3532y0 c3532y0 = new C3532y0();
                C3512o0 c3512o0 = C3512o0.f11903c;
                c3476a1.m17480a(new C3530x0(c3512o0.f11904a, c3532y0)).m17480a(new C3526v0(c3512o0.f11904a, c3532y0)).m17480a(new C3518r0(c3512o0.f11904a, c3532y0));
                c3532y0.f11947a.await();
            }
            if (c3476a1.m17485e()) {
                return (TResult) c3476a1.m17483c();
            }
            throw new ExecutionException(c3476a1.m17482b());
        }
        qkq0.m175383a("await must not be called on the UI thread");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m17492a(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static ApiException m17489a(Exception exc) {
        if (exc.getCause() instanceof ApiException) {
            return (ApiException) exc.getCause();
        }
        if (exc instanceof ApiException) {
            return (ApiException) exc;
        }
        return new ApiException(-1, exc.getMessage());
    }

    /* JADX INFO: renamed from: a */
    public static RemoteServiceBean m17488a(Context context) {
        RemoteServiceBean remoteServiceBean = new RemoteServiceBean();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("android", "com.hihonor.android.pushagentproxy.HiPushService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (listQueryIntentServices.size() > 0) {
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                String str = next.serviceInfo.applicationInfo.packageName;
                String strM17491a = m17491a(context, str);
                remoteServiceBean.setPackageName(str);
                remoteServiceBean.setPackageServiceName(next.serviceInfo.name);
                remoteServiceBean.setPackageSignature(strM17491a);
            }
        }
        return remoteServiceBean;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0039 -> B:18:0x003a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public static String m17491a(Context context, String str) {
        Signature[] apkContentsSigners;
        String string;
        SigningInfo signingInfo;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                if (packageInfo == null || (signingInfo = packageInfo.signingInfo) == null) {
                    apkContentsSigners = null;
                } else {
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                }
            } else {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
                if (packageInfo2 != null) {
                    apkContentsSigners = packageInfo2.signatures;
                } else {
                    apkContentsSigners = null;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (apkContentsSigners != null && apkContentsSigners.length > 0) {
            for (Signature signature : apkContentsSigners) {
                try {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.ENGLISH);
                        if (upperCase.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(upperCase);
                    }
                    string = sb.toString();
                } catch (NoSuchAlgorithmException unused2) {
                    string = null;
                }
                if (string != null) {
                    arrayList.add(string);
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(0);
    }
}
