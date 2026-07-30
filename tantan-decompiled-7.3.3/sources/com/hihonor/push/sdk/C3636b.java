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
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: renamed from: com.hihonor.push.sdk.b */
/* JADX INFO: loaded from: classes7.dex */
public class C3636b {
    /* JADX INFO: renamed from: a */
    public static RequestHeader m18563a() throws ApiException {
        String string;
        Context contextM18597a = C3664l.f12631e.m18597a();
        String strValueOf = null;
        try {
            Object obj = contextM18597a.getPackageManager().getApplicationInfo(contextM18597a.getPackageName(), 128).metaData.get("com.hihonor.push.app_id");
            if (obj != null) {
                strValueOf = String.valueOf(obj);
            }
        } catch (PackageManager.NameNotFoundException e) {
            C3639c.m18581a("ConfigUtils", "getPushAppId", e);
        }
        if (TextUtils.isEmpty(strValueOf)) {
            C3639c.m18580a("checkPushConfig Parameter is missing");
            throw HonorPushErrorEnum.ERROR_NO_APPID.toApiException();
        }
        String strM18568a = m18568a(contextM18597a, contextM18597a.getPackageName());
        if (TextUtils.isEmpty(strM18568a)) {
            C3639c.m18580a("checkPushConfig Parameter is missing.");
            throw HonorPushErrorEnum.ERROR_CERT_FINGERPRINT_EMPTY.toApiException();
        }
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setPackageName(contextM18597a.getPackageName());
        requestHeader.setAppId(strValueOf);
        requestHeader.setCertificateFingerprint(strM18568a);
        C3643d c3643d = C3643d.f12592b;
        requestHeader.setPushToken(c3643d.m18585b(contextM18597a));
        synchronized (c3643d) {
            c3643d.m18583a(contextM18597a);
            SharedPreferences sharedPreferences = C3643d.f12591a.f12622a;
            string = sharedPreferences != null ? sharedPreferences.getString("key_aaid", "") : "";
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString().replace("-", "");
                C3643d.f12591a.m18593a("key_aaid", string);
            }
        }
        requestHeader.setAAID(string);
        requestHeader.setSdkVersion(70041301);
        return requestHeader;
    }

    /* JADX INFO: renamed from: b */
    public static int m18575b(Context context) {
        HonorApiAvailability$PackageStates honorApiAvailability$PackageStates;
        if (context == null) {
            mnd0.m159157a("context must not be null.");
            return 0;
        }
        RemoteServiceBean remoteServiceBeanM18565a = m18565a(context);
        String packageName = remoteServiceBeanM18565a.getPackageName();
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
        if (!TextUtils.equals(packageName, "android") || TextUtils.isEmpty(remoteServiceBeanM18565a.getPackageSignature())) {
            return 8002006;
        }
        return HonorPushErrorEnum.SUCCESS.statusCode;
    }

    /* JADX INFO: renamed from: a */
    public static void m18571a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e) {
            C3639c.m18581a("DeflateUtil", "close", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m18572a(String str) {
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
    public static byte[] m18573a(byte[] bArr, int i) {
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
    public static byte[] m18574a(byte[] bArr, byte[] bArr2) {
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
    public static C3635a1 m18564a(Callable callable) {
        ExecutorService executorService = C3671o0.f12644c.f12646b;
        C3669n0 c3669n0 = new C3669n0();
        try {
            executorService.execute(new RunnableC3693z0(c3669n0, callable));
        } catch (Exception e) {
            c3669n0.m18600a(e);
        }
        return c3669n0.f12642a;
    }

    /* JADX INFO: renamed from: a */
    public static void m18570a(Handler handler) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        wtq0.m207906a("Must be called on the handler thread");
    }

    /* JADX INFO: renamed from: a */
    public static Object m18567a(C3635a1 c3635a1) throws ExecutionException, InterruptedException {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (c3635a1.f12581a) {
                z = c3635a1.f12582b;
            }
            if (!z) {
                C3691y0 c3691y0 = new C3691y0();
                C3671o0 c3671o0 = C3671o0.f12644c;
                c3635a1.m18557a(new C3689x0(c3671o0.f12645a, c3691y0)).m18557a(new C3685v0(c3671o0.f12645a, c3691y0)).m18557a(new C3677r0(c3671o0.f12645a, c3691y0));
                c3691y0.f12688a.await();
            }
            if (c3635a1.m18562e()) {
                return c3635a1.m18560c();
            }
            throw new ExecutionException(c3635a1.m18559b());
        }
        wtq0.m207906a("await must not be called on the UI thread");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m18569a(byte[] bArr) {
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
    public static ApiException m18566a(Exception exc) {
        if (exc.getCause() instanceof ApiException) {
            return (ApiException) exc.getCause();
        }
        if (exc instanceof ApiException) {
            return (ApiException) exc;
        }
        return new ApiException(-1, exc.getMessage());
    }

    /* JADX INFO: renamed from: a */
    public static RemoteServiceBean m18565a(Context context) {
        RemoteServiceBean remoteServiceBean = new RemoteServiceBean();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("android", "com.hihonor.android.pushagentproxy.HiPushService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (listQueryIntentServices.size() > 0) {
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                String str = next.serviceInfo.applicationInfo.packageName;
                String strM18568a = m18568a(context, str);
                remoteServiceBean.setPackageName(str);
                remoteServiceBean.setPackageServiceName(next.serviceInfo.name);
                remoteServiceBean.setPackageSignature(strM18568a);
            }
        }
        return remoteServiceBean;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0039 -> B:18:0x003a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public static String m18568a(Context context, String str) {
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
