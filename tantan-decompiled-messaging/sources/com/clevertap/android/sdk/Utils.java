package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.content.FileProvider;
import com.clevertap.android.sdk.bitmap.HttpBitmapLoader;
import com.clevertap.android.sdk.network.C1295a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.cosmos.photon.push.util.NetUtil;
import com.google.firebase.messaging.RemoteMessage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.e13;
import p149l.e16;
import p149l.n95;

/* JADX INFO: loaded from: classes.dex */
public final class Utils {

    /* JADX INFO: renamed from: a */
    private static final Pattern f4835a = Pattern.compile("\\s+");

    @Nullable
    @RequiresApi(26)
    /* JADX INFO: renamed from: A */
    private static Uri m5901A(byte[] bArr, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, n95 n95Var) {
        try {
            File dir = context.getDir(Constants.PUSH_DIRECTORY_NAME, 0);
            if (dir == null) {
                cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "CleverTap.Push dir not available for gif");
                return null;
            }
            File file = new File(dir, n95Var.currentTimeMillis() + ".gif");
            Files.write(file.toPath(), bArr, new OpenOption[0]);
            return FileProvider.getUriForFile(context, context.getPackageName() + ".clevertap.fileprovider", file);
        } catch (Exception e) {
            cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Failed to write gif to file or create URI: " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static List<JSONObject> m5902B(@NonNull JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(jSONObjectOptJSONObject);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m5903C(String str) {
        if (str == null) {
            Logger.m5870i("Utils", "CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is NULL.");
            return false;
        }
        if (str.isEmpty()) {
            Logger.m5870i("Utils", "CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is empty.");
            return false;
        }
        if (str.length() > 64) {
            Logger.m5870i("Utils", "Custom CleverTap ID passed is greater than 64 characters. ");
            return false;
        }
        if (str.matches("[=|<>;+.A-Za-z0-9()!:$@_-]*")) {
            return true;
        }
        Logger.m5870i("Utils", "Custom CleverTap ID cannot contain special characters apart from : =,(,),_,!,@,$,|<,>,;,+,. and - ");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5904a(@Nullable String str, @Nullable String str2) {
        return Objects.equals(m5918o(str), m5918o(str2));
    }

    /* JADX INFO: renamed from: b */
    public static void m5905b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, n95 n95Var) {
        File[] fileArrListFiles;
        File dir = context.getDir(Constants.PUSH_DIRECTORY_NAME, 0);
        if (dir != null) {
            try {
                if (dir.exists() && (fileArrListFiles = dir.listFiles()) != null) {
                    long jCurrentTimeMillis = n95Var.currentTimeMillis();
                    int i = 0;
                    for (File file : fileArrListFiles) {
                        if (file.isFile() && file.getName().endsWith(".gif")) {
                            try {
                                String name = file.getName();
                                if (jCurrentTimeMillis - Long.parseLong(name.substring(0, name.lastIndexOf(".gif"))) >= 86400000) {
                                    if (file.delete()) {
                                        i++;
                                    } else {
                                        cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Failed to delete old GIF file: " + file.getName());
                                    }
                                }
                            } catch (Exception unused) {
                                cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Skipping file with invalid file name format: " + file.getName());
                            }
                        }
                    }
                    if (i > 0) {
                        cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Cleaned up " + i + " old animated notification files");
                    }
                }
            } catch (Exception e) {
                cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Error during animated image cleanup: ", e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m5906c(Collection<String> collection, String str) {
        if (collection != null && str != null) {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static HashMap<String, Object> m5907d(@NonNull Bundle bundle) {
        HashMap<String, Object> map = new HashMap<>();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                map.putAll(m5907d((Bundle) obj));
            } else {
                map.put(str, bundle.get(str));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList<HashMap<String, Object>> m5908e(JSONArray jSONArray) {
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(m5910g(jSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    Logger.m5875v("Utils", "Could not convert JSONArray of JSONObjects to ArrayList of HashMaps", e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList<String> m5909f(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(jSONArray.getString(i));
                } catch (JSONException e) {
                    Logger.m5875v("Utils", "Could not convert JSONArray to ArrayList", e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static HashMap<String, Object> m5910g(JSONObject jSONObject) {
        HashMap<String, Object> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    map.putAll(m5910g((JSONObject) obj));
                } else {
                    map.put(next, jSONObject.get(next));
                }
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    @NonNull
    public static DownloadedBitmap getNotificationBitmapWithTimeoutAndSize(String str, boolean z, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j, int i) throws NullPointerException {
        return HttpBitmapLoader.m5947a(HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT, new e13(str, z, context, cleverTapInstanceConfig, j, i));
    }

    /* JADX INFO: renamed from: h */
    public static String m5911h(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char lowerCase : str.toCharArray()) {
            if (Character.isSpaceChar(lowerCase)) {
                z = true;
            } else if (z) {
                lowerCase = Character.toTitleCase(lowerCase);
                z = false;
            } else {
                lowerCase = Character.toLowerCase(lowerCase);
            }
            sb.append(lowerCase);
        }
        return sb.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    private static DownloadedBitmap m5912i(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        CleverTapInstanceConfig cleverTapInstanceConfig2;
        if (str != null) {
            try {
                if (str.toLowerCase().endsWith(".gif")) {
                    cleverTapInstanceConfig2 = cleverTapInstanceConfig;
                    try {
                        DownloadedBitmap downloadedBitmapM5947a = HttpBitmapLoader.m5947a(HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_BYTES_WITH_TIME_LIMIT, new e13(str, false, context, cleverTapInstanceConfig2, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, -1));
                        cleverTapInstanceConfig2.getLogger().debug(cleverTapInstanceConfig2.getAccountId(), "Downloaded GIF in : " + downloadedBitmapM5947a.getDownloadTime());
                        if (downloadedBitmapM5947a.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == DownloadedBitmap.Status.SUCCESS && downloadedBitmapM5947a.getBytes() != null) {
                            return downloadedBitmapM5947a;
                        }
                        cleverTapInstanceConfig2.getLogger().debug(cleverTapInstanceConfig2.getAccountId(), "Failed to download gif " + downloadedBitmapM5947a.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().getStatusValue());
                        return null;
                    } catch (Exception e) {
                        e = e;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                cleverTapInstanceConfig2 = cleverTapInstanceConfig;
            }
            cleverTapInstanceConfig2.getLogger().debug(cleverTapInstanceConfig2.getAccountId(), "Couldn't download gif for notification: ", e);
        }
        return null;
    }

    public static boolean isRenderFallback(RemoteMessage remoteMessage, Context context) {
        return !Boolean.parseBoolean(remoteMessage.getData().get(Constants.WZRK_TSR_FB)) && Boolean.parseBoolean(remoteMessage.getData().get(Constants.NOTIFICATION_RENDER_FALLBACK));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean isServiceAvailable(@NonNull Context context, Class cls) {
        if (cls == null) {
            return false;
        }
        try {
            for (ServiceInfo serviceInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services) {
                if (serviceInfo.name.equals(cls.getName())) {
                    Logger.m5874v("Utils", "Service " + serviceInfo.name + " found");
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Logger.m5867d("Utils", "Intent Service name not found exception - ", e);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static Bitmap m5913j(@NonNull Drawable drawable) throws NullPointerException {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    private static DownloadedBitmap m5914k(Context context) throws NullPointerException {
        try {
            Drawable applicationLogo = context.getPackageManager().getApplicationLogo(context.getApplicationInfo());
            if (applicationLogo != null) {
                return C1295a.INSTANCE.m6816d(m5913j(applicationLogo), 0L, null);
            }
            throw new Exception("Logo is null");
        } catch (Exception e) {
            Logger.m5875v("Utils", "Failed to get app logo, falling back to app icon", e);
            return C1295a.INSTANCE.m6816d(m5913j(context.getPackageManager().getApplicationIcon(context.getApplicationInfo())), 0L, null);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: l */
    public static String m5915l(@NonNull Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "Unavailable";
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (m5923t(context, "android.permission.READ_BASIC_PHONE_STATE") || m5923t(context, "android.permission.READ_PHONE_STATE")) {
                try {
                    networkType = telephonyManager.getDataNetworkType();
                } catch (SecurityException e) {
                    Logger.m5867d("Utils", "Security Exception caught while fetch network type", e);
                    networkType = 0;
                }
            } else {
                Logger.m5866d("Utils", "READ_PHONE_STATE or READ_BASIC_PHONE_STATE permission not asked by the app or not granted by the user");
            }
            networkType = 0;
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        if (networkType == 20) {
            return NetUtil.NETWORK_CLASS_5G;
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public static DownloadedBitmap m5916m(boolean z, Context context, @NonNull DownloadedBitmap downloadedBitmap) {
        return (downloadedBitmap.getBitmap() == null && z) ? m5914k(context) : downloadedBitmap;
    }

    /* JADX INFO: renamed from: n */
    public static long m5917n() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    /* JADX INFO: renamed from: o */
    public static String m5918o(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return f4835a.matcher(str).replaceAll("").toLowerCase(Locale.ENGLISH);
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public static DownloadedBitmap m5919p(String str, boolean z, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j) throws NullPointerException {
        return HttpBitmapLoader.m5947a(HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT, new e13(str, z, context, cleverTapInstanceConfig, j));
    }

    @Nullable
    @RequiresApi(26)
    /* JADX INFO: renamed from: q */
    public static Uri m5920q(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, n95 n95Var) {
        DownloadedBitmap downloadedBitmapM5912i = m5912i(str, context, cleverTapInstanceConfig);
        if (downloadedBitmapM5912i == null) {
            return null;
        }
        return m5901A(downloadedBitmapM5912i.getBytes(), context, cleverTapInstanceConfig, n95Var);
    }

    /* JADX INFO: renamed from: r */
    public static long m5921r() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: s */
    public static int m5922s(Context context, String str) {
        if (context != null) {
            return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        }
        return -1;
    }

    public static void setPackageNameFromResolveInfoList(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null) {
            String packageName = context.getPackageName();
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (packageName.equals(it.next().activityInfo.packageName)) {
                    intent.setPackage(packageName);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m5923t(@NonNull Context context, @NonNull String str) {
        try {
            return e16.m114373a(context, str) == 0;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    public static double m5924u(Location location, Location location2) {
        double latitude = location.getLatitude() * 0.017453292519943295d;
        double latitude2 = location2.getLatitude() * 0.017453292519943295d;
        double latitude3 = (location2.getLatitude() - location.getLatitude()) * 0.017453292519943295d;
        double longitude = (location2.getLongitude() - location.getLongitude()) * 0.017453292519943295d;
        double dSin = Math.sin(latitude3 / 2.0d);
        double dSin2 = Math.sin(longitude / 2.0d);
        double dCos = (dSin * dSin) + (Math.cos(latitude) * Math.cos(latitude2) * dSin2 * dSin2);
        return Math.atan2(Math.sqrt(dCos), Math.sqrt(1.0d - dCos)) * 12756.4d;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m5925v(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public static boolean m5926w(Context context, String str) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            int iMyPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid && str.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Logger.m5875v("Utils", "Error checking if main process", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m5927x(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.addFlags(268435456);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: y */
    public static String m5928y(Context context, String str) throws IOException {
        InputStream inputStreamOpen = context.getAssets().open(str);
        try {
            String next = new Scanner(inputStreamOpen).useDelimiter("\\A").next();
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return next;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m5929z(Runnable runnable) {
        if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }
}
