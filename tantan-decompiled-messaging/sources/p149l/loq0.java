package p149l;

import android.os.Build;
import android.text.TextUtils;
import com.apm.lite.p009j.C0922e;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class loq0 {

    /* JADX INFO: renamed from: a */
    private static boolean f129130a = false;

    /* JADX INFO: renamed from: b */
    private static int f129131b = -1;

    /* JADX INFO: renamed from: c */
    private static final Pattern f129132c = Pattern.compile("^0-([\\d]+)$");

    /* JADX INFO: renamed from: l.loq0$a */
    public static class C18274a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        private final Pattern f129133a = Pattern.compile("^cpu[\\d]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f129133a.matcher(str).matches();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m150788a() {
        return m150790c("ro.build.version.emui");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m150789b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m150788a();
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return m150791d();
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static String m150790c(String str) {
        BufferedReader bufferedReader;
        String line = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                line = bufferedReader.readLine();
                bufferedReader.close();
                gvq0.m128290a(bufferedReader);
                return line;
            } catch (Throwable unused) {
                gvq0.m128290a(bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m150791d() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI)) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2) || !str2.toLowerCase(Locale.getDefault()).startsWith(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m150792e(String str) {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null) {
                        int iM150794g = m150794g(line);
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                        return iM150794g;
                    }
                    bufferedReader2.close();
                } catch (Throwable unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                        return -1;
                    }
                    bufferedReader.close();
                }
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable unused4) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m150793f() {
        if (!f129130a) {
            try {
                Class.forName("miui.os.Build");
                C0922e.f4193a = true;
                f129130a = true;
                return true;
            } catch (Exception unused) {
                f129130a = true;
            }
        }
        return C0922e.f4193a;
    }

    /* JADX INFO: renamed from: g */
    private static int m150794g(String str) {
        Matcher matcher = f129132c.matcher(str);
        if (!matcher.matches()) {
            return -1;
        }
        try {
            return Integer.parseInt(matcher.group(1)) + 1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m150795h() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX INFO: renamed from: i */
    public static int m150796i() {
        int i = f129131b;
        if (i > 0) {
            return i;
        }
        int iM150792e = m150792e("/sys/devices/system/cpu/possible");
        if (iM150792e <= 0) {
            iM150792e = m150792e("/sys/devices/system/cpu/present");
        }
        if (iM150792e <= 0) {
            iM150792e = m150797j("/sys/devices/system/cpu/");
        }
        if (iM150792e <= 0) {
            iM150792e = Runtime.getRuntime().availableProcessors();
        }
        if (iM150792e <= 0) {
            iM150792e = 1;
        }
        f129131b = iM150792e;
        return iM150792e;
    }

    /* JADX INFO: renamed from: j */
    private static int m150797j(String str) {
        try {
            File[] fileArrListFiles = new File(str).listFiles(new C18274a());
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return -1;
            }
            return fileArrListFiles.length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
