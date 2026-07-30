package com.vivo.push.util;

import android.os.Build;
import android.text.TextUtils;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.vivo.push.util.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C14641j {

    /* JADX INFO: renamed from: e */
    private static Method f61118e;

    /* JADX INFO: renamed from: a */
    public static final boolean f61114a = m84986b("rom_1.0");

    /* JADX INFO: renamed from: b */
    public static final boolean f61115b = m84986b("rom_2.0");

    /* JADX INFO: renamed from: c */
    public static final boolean f61116c = m84986b("rom_2.5");

    /* JADX INFO: renamed from: d */
    public static final boolean f61117d = m84986b("rom_3.0");

    /* JADX INFO: renamed from: f */
    private static String f61119f = null;

    /* JADX INFO: renamed from: g */
    private static String f61120g = null;

    /* JADX WARN: Code duplicated, block: B:15:0x007f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0081 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:12:0x004d, B:13:0x0054, B:17:0x0081), top: B:27:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x008d A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:21:0x008f A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x007f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x008d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x008f, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static synchronized String m84982a() {
        String strM84983a;
        String strM84983a2;
        if (f61119f != null || f61120g != null) {
            C14647p.m85021d("Device", "sRomProperty1 : " + f61119f + " ; sRomProperty2 : " + f61120g);
            strM84983a = m84983a(f61119f);
            if (!TextUtils.isEmpty(strM84983a)) {
                return strM84983a;
            }
            strM84983a2 = m84983a(f61120g);
            if (TextUtils.isEmpty(strM84983a2)) {
                return null;
            }
            return strM84983a2;
        }
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
            f61118e = declaredMethod;
            declaredMethod.setAccessible(true);
            f61119f = (String) f61118e.invoke(null, "ro.vivo.rom", "@><@");
            f61120g = (String) f61118e.invoke(null, "ro.vivo.rom.version", "@><@");
        } catch (Exception unused) {
            C14647p.m85015b("Device", "getRomCode error");
        }
        C14647p.m85021d("Device", "sRomProperty1 : " + f61119f + " ; sRomProperty2 : " + f61120g);
        strM84983a = m84983a(f61119f);
        if (!TextUtils.isEmpty(strM84983a)) {
            return strM84983a;
        }
        strM84983a2 = m84983a(f61120g);
        if (TextUtils.isEmpty(strM84983a2)) {
            return strM84983a2;
        }
        return null;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m84985b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            C14647p.m85021d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        C14647p.m85021d("Device", "Build.MANUFACTURER is " + str);
        return str.toLowerCase().contains("bbk") || str.toLowerCase().startsWith(HardwareEarMonitorUtils.MANUFACTURER_VIVO);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m84986b(String str) {
        String strM85062b = C14657z.m85062b("ro.vivo.rom", "");
        String strM85062b2 = C14657z.m85062b("ro.vivo.rom.version", "");
        C14647p.m85021d("Device", "ro.vivo.rom = " + strM85062b + " ; ro.vivo.rom.version = " + strM85062b2);
        if (strM85062b == null || !strM85062b.contains(str)) {
            return strM85062b2 != null && strM85062b2.contains(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static String m84984a(String str, String str2) {
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
    private static String m84983a(String str) {
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
