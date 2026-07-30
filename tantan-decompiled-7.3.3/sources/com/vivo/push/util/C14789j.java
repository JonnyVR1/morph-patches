package com.vivo.push.util;

import android.os.Build;
import android.text.TextUtils;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.vivo.push.util.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C14789j {

    /* JADX INFO: renamed from: e */
    private static Method f61965e;

    /* JADX INFO: renamed from: a */
    public static final boolean f61961a = m86157b("rom_1.0");

    /* JADX INFO: renamed from: b */
    public static final boolean f61962b = m86157b("rom_2.0");

    /* JADX INFO: renamed from: c */
    public static final boolean f61963c = m86157b("rom_2.5");

    /* JADX INFO: renamed from: d */
    public static final boolean f61964d = m86157b("rom_3.0");

    /* JADX INFO: renamed from: f */
    private static String f61966f = null;

    /* JADX INFO: renamed from: g */
    private static String f61967g = null;

    /* JADX WARN: Code duplicated, block: B:15:0x007f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0081 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:12:0x004d, B:13:0x0054, B:17:0x0081), top: B:27:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x008d A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:21:0x008f A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x007f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x008d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x008f, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static synchronized String m86153a() {
        String strM86154a;
        String strM86154a2;
        if (f61966f != null || f61967g != null) {
            C14795p.m86192d("Device", "sRomProperty1 : " + f61966f + " ; sRomProperty2 : " + f61967g);
            strM86154a = m86154a(f61966f);
            if (!TextUtils.isEmpty(strM86154a)) {
                return strM86154a;
            }
            strM86154a2 = m86154a(f61967g);
            if (TextUtils.isEmpty(strM86154a2)) {
                return null;
            }
            return strM86154a2;
        }
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
            f61965e = declaredMethod;
            declaredMethod.setAccessible(true);
            f61966f = (String) f61965e.invoke(null, "ro.vivo.rom", "@><@");
            f61967g = (String) f61965e.invoke(null, "ro.vivo.rom.version", "@><@");
        } catch (Exception unused) {
            C14795p.m86186b("Device", "getRomCode error");
        }
        C14795p.m86192d("Device", "sRomProperty1 : " + f61966f + " ; sRomProperty2 : " + f61967g);
        strM86154a = m86154a(f61966f);
        if (!TextUtils.isEmpty(strM86154a)) {
            return strM86154a;
        }
        strM86154a2 = m86154a(f61967g);
        if (TextUtils.isEmpty(strM86154a2)) {
            return strM86154a2;
        }
        return null;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m86156b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            C14795p.m86192d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        C14795p.m86192d("Device", "Build.MANUFACTURER is " + str);
        return str.toLowerCase().contains("bbk") || str.toLowerCase().startsWith(HardwareEarMonitorUtils.MANUFACTURER_VIVO);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m86157b(String str) {
        String strM86233b = C14805z.m86233b("ro.vivo.rom", "");
        String strM86233b2 = C14805z.m86233b("ro.vivo.rom.version", "");
        C14795p.m86192d("Device", "ro.vivo.rom = " + strM86233b + " ; ro.vivo.rom.version = " + strM86233b2);
        if (strM86233b == null || !strM86233b.contains(str)) {
            return strM86233b2 != null && strM86233b2.contains(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static String m86155a(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    /* JADX INFO: renamed from: a */
    private static String m86154a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("rom_([\\d]*).?([\\d]*)", 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(matcher.group(1));
        sb.append(TextUtils.isEmpty(matcher.group(2)) ? "0" : matcher.group(2).substring(0, 1));
        return sb.toString();
    }
}
