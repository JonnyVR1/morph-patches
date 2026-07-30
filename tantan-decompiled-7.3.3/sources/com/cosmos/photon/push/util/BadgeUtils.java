package com.cosmos.photon.push.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivo.push.PushClientConstants;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.seamless.xhtml.XHTML;

/* JADX INFO: loaded from: classes.dex */
public class BadgeUtils {
    public static boolean checkIs360Rom() {
        String str = Build.MANUFACTURER;
        return str.contains("QiKU") || str.contains("360");
    }

    public static boolean checkIsHuaweiRom() {
        return Build.MANUFACTURER.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI);
    }

    public static boolean checkIsMeizuRom() {
        return DeviceUtils.isMeizu();
    }

    public static boolean checkIsMiuiRom() {
        return Build.MANUFACTURER.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI);
    }

    public static boolean checkIsSamsungRom() {
        return Build.MANUFACTURER.toLowerCase().contains("samsung");
    }

    public static boolean checkIsSmartisanRom() {
        return Build.MANUFACTURER.toLowerCase().contains("smartisan");
    }

    public static boolean checkIsVivoRom() {
        return Build.MANUFACTURER.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_VIVO);
    }

    public static double getEmuiVersion() throws Throwable {
        try {
            String systemProperty = getSystemProperty("ro.build.version.emui");
            return Double.parseDouble(systemProperty.substring(systemProperty.indexOf("_") + 1));
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.COMMON, e);
            return 4.0d;
        }
    }

    public static int getMiuiVersion() throws Throwable {
        String systemProperty = getSystemProperty("ro.miui.ui.version.name");
        if (systemProperty == null) {
            return -1;
        }
        try {
            return Integer.parseInt(systemProperty.substring(1));
        } catch (Exception unused) {
            MDLog.m7445e(LogTag.NOTIFY, "get miui version code error, version : ".concat(systemProperty));
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0042: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:67), block:B:11:0x0042 */
    public static String getSystemProperty(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                        return line;
                    } catch (IOException e) {
                        MDLog.m7446e(LogTag.NOTIFY, "Exception while closing InputStream", e);
                        return line;
                    }
                } catch (IOException e2) {
                    e = e2;
                    MDLog.m7446e(LogTag.NOTIFY, "Unable to read sysprop " + str, e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            MDLog.m7446e(LogTag.NOTIFY, "Exception while closing InputStream", e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader3 = bufferedReader2;
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                    } catch (IOException e4) {
                        MDLog.m7446e(LogTag.NOTIFY, "Exception while closing InputStream", e4);
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader3 != null) {
                bufferedReader3.close();
            }
            throw th;
        }
    }

    public static boolean isOppo() {
        return Build.MANUFACTURER.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_OPPO);
    }

    public static void setBadgeNum(Context context, int i) {
        try {
            if (checkIsMiuiRom()) {
                return;
            }
            if (checkIsHuaweiRom()) {
                Bundle bundle = new Bundle();
                bundle.putString("package", context.getPackageName());
                bundle.putString(XHTML.ATTR.CLASS, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
                bundle.putInt("badgenumber", i);
                context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
                return;
            }
            if (checkIsVivoRom()) {
                Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                intent.putExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context.getPackageName());
                intent.putExtra(PushClientConstants.TAG_CLASS_NAME, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
                intent.putExtra("notificationNum", i);
                context.sendBroadcast(intent);
                return;
            }
            if (checkIsSamsungRom()) {
                String className = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName();
                Intent intent2 = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                intent2.putExtra("badge_count", i);
                intent2.putExtra("badge_count_package_name", context.getPackageName());
                intent2.putExtra("badge_count_class_name", className);
                context.sendBroadcast(intent2);
                return;
            }
            if (checkIsSmartisanRom()) {
                Intent intent3 = new Intent("com.smartisanos.launcher.new_message");
                intent3.putExtra("extra_packagename", context.getApplicationInfo().packageName);
                intent3.putExtra("extra_componentname", "com.immomo.momo.android.activity.WelcomeActivity");
                intent3.putExtra("extra_message_count", i);
                context.sendBroadcast(intent3);
                return;
            }
            if (isOppo()) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("app_badge_count", i);
                bundle2.putString("app_badge_packageName", context.getPackageName());
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle2);
            }
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.COMMON, e);
        }
    }
}
