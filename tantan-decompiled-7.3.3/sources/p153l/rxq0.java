package p153l;

import android.os.Build;
import android.text.TextUtils;
import com.apm.lite.p010j.C0926e;
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
public class rxq0 {

    /* JADX INFO: renamed from: a */
    private static boolean f165365a = false;

    /* JADX INFO: renamed from: b */
    private static int f165366b = -1;

    /* JADX INFO: renamed from: c */
    private static final Pattern f165367c = Pattern.compile("^0-([\\d]+)$");

    /* JADX INFO: renamed from: l.rxq0$a */
    public static class C19933a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        private final Pattern f165368a = Pattern.compile("^cpu[\\d]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f165368a.matcher(str).matches();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m183555a() {
        return m183557c("ro.build.version.emui");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m183556b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m183555a();
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return m183558d();
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static String m183557c(String str) {
        BufferedReader bufferedReader;
        String line = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                line = bufferedReader.readLine();
                bufferedReader.close();
                m4r0.m157051a(bufferedReader);
                return line;
            } catch (Throwable unused) {
                m4r0.m157051a(bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m183558d() {
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
    private static int m183559e(String str) {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null) {
                        int iM183561g = m183561g(line);
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                        return iM183561g;
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
    public static boolean m183560f() {
        if (!f165365a) {
            try {
                Class.forName("miui.os.Build");
                C0926e.f4193a = true;
                f165365a = true;
                return true;
            } catch (Exception unused) {
                f165365a = true;
            }
        }
        return C0926e.f4193a;
    }

    /* JADX INFO: renamed from: g */
    private static int m183561g(String str) {
        Matcher matcher = f165367c.matcher(str);
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
    public static boolean m183562h() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX INFO: renamed from: i */
    public static int m183563i() {
        int i = f165366b;
        if (i > 0) {
            return i;
        }
        int iM183559e = m183559e("/sys/devices/system/cpu/possible");
        if (iM183559e <= 0) {
            iM183559e = m183559e("/sys/devices/system/cpu/present");
        }
        if (iM183559e <= 0) {
            iM183559e = m183564j("/sys/devices/system/cpu/");
        }
        if (iM183559e <= 0) {
            iM183559e = Runtime.getRuntime().availableProcessors();
        }
        if (iM183559e <= 0) {
            iM183559e = 1;
        }
        f165366b = iM183559e;
        return iM183559e;
    }

    /* JADX INFO: renamed from: j */
    private static int m183564j(String str) {
        try {
            File[] fileArrListFiles = new File(str).listFiles(new C19933a());
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return -1;
            }
            return fileArrListFiles.length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
