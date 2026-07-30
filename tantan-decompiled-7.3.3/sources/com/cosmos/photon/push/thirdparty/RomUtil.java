package com.cosmos.photon.push.thirdparty;

import android.os.Build;
import android.text.TextUtils;
import com.immomo.push.thirdparty.honor.C4116a;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class RomUtil {
    private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
    public static final String ROM_EMUI = "EMUI";
    public static final String ROM_FLYME = "FLYME";
    public static final String ROM_HONOR = "HONOR";
    public static final String ROM_MIUI = "MIUI";
    public static final String ROM_OPPO = "OPPO";
    public static final String ROM_VIVO = "VIVO";
    private static volatile String sName;

    public static boolean check(String str) {
        boolean zM20455a;
        if (sName != null) {
            return sName.equals(str);
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI)) {
            sName = ROM_MIUI;
        } else if (str2.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_HONOR) || str2.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI)) {
            try {
                zM20455a = C4116a.m20455a(ThirdPushManager.getInstance().getContext());
            } catch (Throwable unused) {
                zM20455a = false;
            }
            if (zM20455a) {
                sName = "HONOR";
            } else {
                sName = ROM_EMUI;
            }
        } else if (str2.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_OPPO) || str2.equalsIgnoreCase("oneplus") || str2.equalsIgnoreCase("realme")) {
            sName = ROM_OPPO;
        } else if (str2.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_VIVO)) {
            sName = ROM_VIVO;
        } else if (str2.equalsIgnoreCase("meizu")) {
            sName = ROM_FLYME;
        } else if (TextUtils.isEmpty(getProp(KEY_VERSION_EMUI))) {
            sName = "unknown";
        } else {
            sName = ROM_EMUI;
        }
        return sName.equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:59), block:B:11:0x003a */
    public static String getProp(String str) throws Throwable {
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
                        e.printStackTrace();
                        return line;
                    }
                } catch (IOException e2) {
                    e = e2;
                    PushLogger.m7457e("Unable to read prop " + str, e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
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
                        e4.printStackTrace();
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

    public static boolean isEmui() {
        return check(ROM_EMUI);
    }

    public static boolean isFlyme() {
        return check(ROM_FLYME);
    }

    public static boolean isHonor() {
        return check("HONOR");
    }

    public static boolean isMiui() {
        return check(ROM_MIUI);
    }

    public static boolean isOppoSupport() {
        return check(ROM_OPPO);
    }

    public static boolean isVivo() {
        return check(ROM_VIVO);
    }
}
