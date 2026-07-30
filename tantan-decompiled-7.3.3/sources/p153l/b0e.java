package p153l;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes10.dex */
public class b0e {

    /* JADX INFO: renamed from: a */
    public static final FileFilter f74267a = new C15880a();

    /* JADX INFO: renamed from: l.b0e$a */
    public class C15880a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m101287a(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static String m101288b() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: c */
    public static int m101289c() {
        int i = -1;
        for (int i2 = 0; i2 < m101294h(); i2++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            fileInputStream.read(bArr);
                            int i3 = 0;
                            while (Character.isDigit(bArr[i3]) && i3 < 128) {
                                i3++;
                            }
                            int i4 = Integer.parseInt(new String(bArr, 0, i3));
                            if (i4 > i) {
                                i = i4;
                            }
                        } catch (NumberFormatException e) {
                            CrashHelper.m82479c(e);
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                }
            } catch (IOException e2) {
                CrashHelper.m82479c(e2);
                return -1;
            }
        }
        if (i == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int iM101299m = m101299m("cpu MHz", fileInputStream2) * 1000;
                if (iM101299m > i) {
                    i = iM101299m;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static int m101290d(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    int iM101291e = m101291e(line);
                    try {
                        fileInputStream2.close();
                        return iM101291e;
                    } catch (IOException e) {
                        CrashHelper.m82479c(e);
                        return iM101291e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    CrashHelper.m82479c(e);
                    if (fileInputStream == null) {
                        return -1;
                    }
                    try {
                        fileInputStream.close();
                        return -1;
                    } catch (IOException e3) {
                        CrashHelper.m82479c(e3);
                        return -1;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            CrashHelper.m82479c(e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m101291e(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* JADX INFO: renamed from: f */
    public static String m101292f() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                str = line;
            }
            if (str.contains("Hardware")) {
                return str.split(":\\s+", 2)[1];
            }
        } catch (FileNotFoundException e) {
            CrashHelper.m82479c(e);
        } catch (IOException e2) {
            CrashHelper.m82479c(e2);
        }
        return Build.HARDWARE;
    }

    /* JADX INFO: renamed from: g */
    public static String m101293g() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: h */
    public static int m101294h() throws Throwable {
        try {
            int iM101290d = m101290d("/sys/devices/system/cpu/possible");
            if (iM101290d == -1) {
                iM101290d = m101290d("/sys/devices/system/cpu/present");
            }
            return iM101290d == -1 ? new File("/sys/devices/system/cpu/").listFiles(f74267a).length : iM101290d;
        } catch (NullPointerException e) {
            CrashHelper.m82479c(e);
            return -1;
        } catch (SecurityException e2) {
            CrashHelper.m82479c(e2);
            return -1;
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: i */
    public static long m101295i(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: renamed from: j */
    public static int m101296j() {
        m101292f();
        int iM101289c = m101289c() / 1000;
        if (iM101289c <= 1600) {
            return 0;
        }
        if (iM101289c <= 2000) {
            return 1;
        }
        return iM101289c <= 2500 ? 2 : 3;
    }

    /* JADX INFO: renamed from: k */
    public static int m101297k(Context context) {
        int iM101298l = m101298l(context);
        int iM101296j = m101296j();
        if (iM101298l == 0 || iM101298l == 1 || iM101296j == 0) {
            return 0;
        }
        if (iM101298l == 2 && iM101296j >= 1) {
            return 1;
        }
        if (iM101298l > 2) {
            return iM101296j > 1 ? 2 : 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static int m101298l(Context context) {
        long jM101295i = m101295i(context) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        if (jM101295i <= 2000) {
            return 0;
        }
        if (jM101295i <= 3000) {
            return 1;
        }
        if (jM101295i <= 4000) {
            return 2;
        }
        return jM101295i <= 6000 ? 3 : 4;
    }

    /* JADX INFO: renamed from: m */
    public static int m101299m(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int i = fileInputStream.read(bArr);
            int i2 = 0;
            while (i2 < i) {
                byte b = bArr[i2];
                if (b == 10 || i2 == 0) {
                    if (b == 10) {
                        i2++;
                    }
                    for (int i3 = i2; i3 < i; i3++) {
                        int i4 = i3 - i2;
                        if (bArr[i3] != str.charAt(i4)) {
                            break;
                        }
                        if (i4 == str.length() - 1) {
                            return m101287a(bArr, i3);
                        }
                    }
                }
                i2++;
            }
            return -1;
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return -1;
        } catch (NumberFormatException e2) {
            CrashHelper.m82479c(e2);
            return -1;
        }
    }
}
