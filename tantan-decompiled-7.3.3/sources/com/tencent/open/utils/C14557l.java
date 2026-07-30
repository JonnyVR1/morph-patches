package com.tencent.open.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.PackageInfoWrapper;
import com.tencent.open.log.SLog;
import com.tencent.open.p110b.C14523b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.tencent.open.utils.l */
/* JADX INFO: loaded from: classes2.dex */
public class C14557l {

    /* JADX INFO: renamed from: a */
    private static ConcurrentHashMap<String, PackageInfoWrapper> f61193a = new ConcurrentHashMap<>();

    /* JADX WARN: Code duplicated, block: B:55:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    @SuppressLint({"SdCardPath"})
    /* JADX INFO: renamed from: a */
    public static boolean m85622a(String str, String str2, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        SLog.m85492i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libName: " + str);
        Context contextM85587a = C14553h.m85587a();
        if (contextM85587a == null) {
            SLog.m85492i("openSDK_LOG.SystemUtils", "-->extractSecureLib, global context is null. ");
            return false;
        }
        SharedPreferences sharedPreferences = contextM85587a.getSharedPreferences("secure_lib", 0);
        File file = new File(contextM85587a.getFilesDir(), str2);
        if (file.exists()) {
            int i2 = sharedPreferences.getInt(WBConstants.AUTH_PARAMS_VERSION, 0);
            SLog.m85492i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libVersion: " + i + " | oldVersion: " + i2);
            if (i == i2) {
                return true;
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        InputStream inputStream = null;
        fileOutputStreamOpenFileOutput = null;
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        inputStream = null;
        try {
            InputStream inputStreamOpen = contextM85587a.getAssets().open(str);
            try {
                fileOutputStreamOpenFileOutput = contextM85587a.openFileOutput(str2, 0);
                m85612a(inputStreamOpen, fileOutputStreamOpenFileOutput);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt(WBConstants.AUTH_PARAMS_VERSION, i);
                editorEdit.commit();
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                return true;
            } catch (Exception e2) {
                e = e2;
                FileOutputStream fileOutputStream2 = fileOutputStreamOpenFileOutput;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream2;
                try {
                    SLog.m85491e("openSDK_LOG.SystemUtils", "-->extractSecureLib, when copy lib execption.", e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException unused6) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                FileOutputStream fileOutputStream3 = fileOutputStreamOpenFileOutput;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream3;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileOutputStream != null) {
                    throw th;
                }
                fileOutputStream.close();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m85624b(Context context, String str) {
        SLog.m85496v("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString");
        String strM85657a = "";
        try {
            String packageName = context.getPackageName();
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(signatureArr[0].toByteArray());
            String strM85657a2 = C14559n.m85657a(messageDigest.digest());
            messageDigest.reset();
            SLog.m85496v("openSDK_LOG.SystemUtils", "-->sign: " + strM85657a2);
            messageDigest.update(C14559n.m85693j(packageName + "_" + strM85657a2 + "_" + str + ""));
            strM85657a = C14559n.m85657a(messageDigest.digest());
            messageDigest.reset();
            StringBuilder sb = new StringBuilder("-->signEncryped: ");
            sb.append(strM85657a);
            SLog.m85496v("openSDK_LOG.SystemUtils", sb.toString());
            return strM85657a;
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString error", e);
            return strM85657a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m85630c(Context context) {
        if (m85635g(context, "com.tencent.mobileqq")) {
            SLog.m85492i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: qq");
            return true;
        }
        if (m85635g(context, Constants.PACKAGE_TIM)) {
            SLog.m85492i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: tim");
            return true;
        }
        if (m85635g(context, Constants.PACKAGE_QQ_PAD)) {
            SLog.m85492i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: pad");
            return true;
        }
        SLog.m85492i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: disable speed");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m85632d(Context context) {
        return context != null && context.getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29 && !m85625b();
    }

    /* JADX INFO: renamed from: e */
    private static PackageInfo m85633e(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        synchronized (C14557l.class) {
            try {
                if (!f61193a.containsKey(str)) {
                    PackageInfo packageInfoM85634f = m85634f(context, str);
                    f61193a.put(str, new PackageInfoWrapper(str, packageInfoM85634f));
                    return packageInfoM85634f;
                }
                PackageInfoWrapper packageInfoWrapper = f61193a.get(str);
                if (packageInfoWrapper == null) {
                    SLog.m85490e("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper is null");
                    return null;
                }
                PackageInfo packageInfo = packageInfoWrapper.packageInfo;
                if (packageInfo == null) {
                    SLog.m85490e("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper packageInfo is null");
                }
                return packageInfo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static PackageInfo m85634f(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo;
            }
            SLog.m85490e("openSDK_LOG.SystemUtils", "realGetPackageInfo null. packageName= " + str);
            return packageInfo;
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.SystemUtils", "realGetPackageInfo exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m85635g(Context context, String str) {
        return (C14554i.m85593a(context, m85629c(), str) == null && m85633e(context, str) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static int m85631d(Context context, String str) {
        return m85611a(m85617a(context, Constants.PACKAGE_TIM), str);
    }

    /* JADX INFO: renamed from: c */
    public static int m85628c(Context context, String str) {
        return m85611a(m85617a(context, "com.tencent.mobileqq"), str);
    }

    /* JADX INFO: renamed from: c */
    private static String m85629c() {
        String strM85435b = C14523b.m85435b();
        if (strM85435b != null && !strM85435b.isEmpty()) {
            return strM85435b;
        }
        SLog.m85490e("openSDK_LOG.SystemUtils", "getAppId error: " + strM85435b);
        return strM85435b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m85627b(Context context, Intent intent) {
        boolean z = false;
        if (context != null && intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                SLog.m85492i("openSDK_LOG.SystemUtils", "isAgentActivityExist? component null");
                return false;
            }
            String packageName = component.getPackageName();
            String strM85617a = m85617a(context, packageName);
            if (strM85617a != null && !strM85617a.isEmpty()) {
                z = true;
            }
            SLog.m85492i("openSDK_LOG.SystemUtils", "isAgentActivityExist? packageName = " + packageName + ", appVersionName= " + strM85617a);
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static int m85623b(String str) {
        if ("shareToQQ".equals(str)) {
            return Constants.REQUEST_QQ_SHARE;
        }
        if ("shareToQzone".equals(str)) {
            return Constants.REQUEST_QZONE_SHARE;
        }
        if ("addToQQFavorites".equals(str)) {
            return Constants.REQUEST_QQ_FAVORITES;
        }
        if ("sendToMyComputer".equals(str)) {
            return Constants.REQUEST_SEND_TO_MY_COMPUTER;
        }
        if ("shareToTroopBar".equals(str)) {
            return Constants.REQUEST_SHARE_TO_TROOP_BAR;
        }
        if ("action_login".equals(str)) {
            return 11101;
        }
        return "action_request".equals(str) ? 10100 : -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m85626b(Context context) {
        boolean zM85635g = m85635g(context, "com.tencent.mobileqq");
        SLog.m85492i("openSDK_LOG.SystemUtils", "isQQInstalled " + zM85635g);
        return zM85635g;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m85625b() {
        try {
            return ((Boolean) Environment.class.getMethod("isExternalStorageLegacy", null).invoke(Environment.class, null)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85619a(String str) {
        if (str == null) {
            return;
        }
        f61193a.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public static String m85617a(Context context, String str) {
        String strM85593a = C14554i.m85593a(context, m85629c(), str);
        if (strM85593a != null && !"UNKNOWN".equals(strM85593a)) {
            return strM85593a;
        }
        PackageInfo packageInfoM85633e = m85633e(context, str);
        if (packageInfoM85633e == null) {
            SLog.m85490e("openSDK_LOG.SystemUtils", "getAppVersionName return null. package= " + str);
            return null;
        }
        return packageInfoM85633e.versionName;
    }

    /* JADX INFO: renamed from: a */
    public static int m85611a(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str != null && str2 == null) {
            return 1;
        }
        if (str == null && str2 != null) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                i++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (strArrSplit.length > i) {
            return 1;
        }
        return strArrSplit2.length > i ? -1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85621a(Context context, String str, String str2) {
        SLog.m85496v("openSDK_LOG.SystemUtils", "OpenUi, validateAppSignatureForPackage");
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(str, 64).signatures) {
                if (C14559n.m85686g(signature.toCharsString()).equals(str2)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m85615a(Activity activity, String str) {
        if (activity == null) {
            SLog.m85490e("openSDK_LOG.SystemUtils", "getEncryptPkgName activity==null !!!!!!");
            return "";
        }
        try {
            byte[] bArrM85579a = C14551f.m85579a(str);
            if (bArrM85579a == null) {
                SLog.m85490e("openSDK_LOG.SystemUtils", "getEncryptPkgName shaBytes==null !!!!!!");
                return "";
            }
            byte[] bArr = new byte[8];
            System.arraycopy(bArrM85579a, 5, bArr, 0, 8);
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArrM85579a, 8, bArr2, 0, 16);
            return C14551f.m85577a(activity.getPackageName(), C14551f.m85578a(bArr2), bArr);
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.SystemUtils", "getEncryptPkgName", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85620a(Context context, Intent intent) {
        if (context != null && intent != null) {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z = listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
            if (!z) {
                StringBuilder sb = new StringBuilder("isActivityExist false. result=");
                sb.append(listQueryIntentActivities == null ? "null" : Integer.valueOf(listQueryIntentActivities.size()));
                sb.append(" Intent= ");
                sb.append(intent);
                SLog.m85490e("openSDK_LOG.SystemUtils", sb.toString());
            }
            return z;
        }
        StringBuilder sb2 = new StringBuilder("isActivityExist params error! [");
        sb2.append(context == null);
        sb2.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        sb2.append(intent == null);
        sb2.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        SLog.m85490e("openSDK_LOG.SystemUtils", sb2.toString());
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m85616a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            return applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.SystemUtils", "getAppName exception", th);
            try {
                int i = applicationInfo.labelRes;
                return i <= 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
            } catch (Throwable th2) {
                SLog.m85491e("openSDK_LOG.SystemUtils", "getAppName getLabel exception", th2);
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85618a() {
        f61193a.clear();
    }

    /* JADX INFO: renamed from: a */
    private static long m85612a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                outputStream.write(bArr, 0, i);
                j += (long) i;
            } else {
                SLog.m85492i("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + j);
                return j;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m85613a(int i) {
        if (i == 10103) {
            return "shareToQQ";
        }
        if (i == 10104) {
            return "shareToQzone";
        }
        if (i == 10105) {
            return "addToQQFavorites";
        }
        if (i == 10106) {
            return "sendToMyComputer";
        }
        if (i == 10107) {
            return "shareToTroopBar";
        }
        if (i == 11101) {
            return "action_login";
        }
        if (i == 10100) {
            return "action_request";
        }
        if (i != 10114) {
            return null;
        }
        return "action_common_channel";
    }

    /* JADX INFO: renamed from: a */
    public static String m85614a(Activity activity) {
        try {
            ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getApplicationContext().getPackageName(), 128);
            SLog.m85492i("openSDK_LOG.SystemUtils", "apkPath=" + applicationInfo.sourceDir);
            return applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            SLog.m85491e("openSDK_LOG.SystemUtils", "NameNotFoundException", e);
            return null;
        } catch (Exception e2) {
            SLog.m85491e("openSDK_LOG.SystemUtils", "Exception", e2);
            return null;
        }
    }
}
