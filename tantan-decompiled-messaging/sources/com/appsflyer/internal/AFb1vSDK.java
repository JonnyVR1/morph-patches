package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p149l.kfx;
import p149l.lfx;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1vSDK {
    @SuppressLint({"NewApi"})
    public static boolean AFAdRevenueData(@Nullable Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                return lfx.m149749a(context.getApplicationContext().getSystemService(kfx.m145877a())) != null;
            } catch (Throwable th) {
                AFLogger.INSTANCE.m5243e(AFg1cSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : "", th, false, false);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c_ */
    public static boolean m5204c_(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX INFO: renamed from: d_ */
    public static Map<String, String> m5205d_(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            byte b = 0;
            String str = "media_source";
            if (!it.hasNext()) {
                try {
                    if (!map.containsKey("install_time")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        map.put("install_time", simpleDateFormat.format(new Date(j)));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e);
                }
                if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
                    map.put("af_status", "Non-organic");
                }
                if (map.containsKey("agency")) {
                    map.remove("media_source");
                }
                String path = uri.getPath();
                if (path != null) {
                    map.put("path", path);
                }
                String scheme = uri.getScheme();
                if (scheme != null) {
                    map.put(BLiveOperationClickAction.scheme, scheme);
                }
                String host = uri.getHost();
                if (host != null) {
                    map.put("host", host);
                }
                return map;
            }
            String next = it.next();
            String queryParameter = uri.getQueryParameter(next);
            if (!map.containsKey(next)) {
                next.getClass();
                switch (next.hashCode()) {
                    case -1420799080:
                        if (!next.equals("af_prt")) {
                            b = -1;
                        }
                        break;
                    case 99:
                        b = !next.equals("c") ? (byte) -1 : (byte) 1;
                        break;
                    case 110987:
                        b = !next.equals("pid") ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        str = "agency";
                        break;
                    case 1:
                        str = "campaign";
                        break;
                    case 2:
                        break;
                    default:
                        str = next;
                        break;
                }
            } else {
                str = next;
            }
            map.put(str, queryParameter);
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* JADX INFO: renamed from: e_ */
    public static String m5206e_(PackageManager packageManager, String str) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    @Nullable
    /* JADX INFO: renamed from: f_ */
    public static Application m5207f_(@NonNull Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }

    public static boolean getCurrencyIso4217Code(Context context, String str) {
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(iCheckPermission);
        AFLogger.afRDLog(sb.toString());
        return iCheckPermission == 0;
    }

    public static String getMonetizationNetwork(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }

    public static long getRevenue(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    public static boolean getMonetizationNetwork() {
        return Build.BRAND.equals(RomUtil.ROM_OPPO);
    }

    public static boolean getMonetizationNetwork(@Nullable Context context) {
        if (context != null) {
            try {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean getRevenue(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
