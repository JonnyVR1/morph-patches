package p149l;

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

/* JADX INFO: loaded from: classes11.dex */
public class oyd {

    /* JADX INFO: renamed from: a */
    public static final FileFilter f146315a = new C19080a();

    /* JADX INFO: renamed from: l.oyd$a */
    public class C19080a implements FileFilter {
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
    public static int m166648a(byte[] bArr, int i) {
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
    public static String m166649b() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: c */
    public static int m166650c() {
        int i = -1;
        for (int i2 = 0; i2 < m166655h(); i2++) {
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
                            CrashHelper.m81296c(e);
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                }
            } catch (IOException e2) {
                CrashHelper.m81296c(e2);
                return -1;
            }
        }
        if (i == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int iM166660m = m166660m("cpu MHz", fileInputStream2) * 1000;
                if (iM166660m > i) {
                    i = iM166660m;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static int m166651d(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    int iM166652e = m166652e(line);
                    try {
                        fileInputStream2.close();
                        return iM166652e;
                    } catch (IOException e) {
                        CrashHelper.m81296c(e);
                        return iM166652e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    CrashHelper.m81296c(e);
                    if (fileInputStream == null) {
                        return -1;
                    }
                    try {
                        fileInputStream.close();
                        return -1;
                    } catch (IOException e3) {
                        CrashHelper.m81296c(e3);
                        return -1;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            CrashHelper.m81296c(e4);
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
    public static int m166652e(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* JADX INFO: renamed from: f */
    public static String m166653f() {
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
            CrashHelper.m81296c(e);
        } catch (IOException e2) {
            CrashHelper.m81296c(e2);
        }
        return Build.HARDWARE;
    }

    /* JADX INFO: renamed from: g */
    public static String m166654g() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: h */
    public static int m166655h() throws Throwable {
        try {
            int iM166651d = m166651d("/sys/devices/system/cpu/possible");
            if (iM166651d == -1) {
                iM166651d = m166651d("/sys/devices/system/cpu/present");
            }
            return iM166651d == -1 ? new File("/sys/devices/system/cpu/").listFiles(f146315a).length : iM166651d;
        } catch (NullPointerException e) {
            CrashHelper.m81296c(e);
            return -1;
        } catch (SecurityException e2) {
            CrashHelper.m81296c(e2);
            return -1;
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: i */
    public static long m166656i(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: renamed from: j */
    public static int m166657j() {
        m166653f();
        int iM166650c = m166650c() / 1000;
        if (iM166650c <= 1600) {
            return 0;
        }
        if (iM166650c <= 2000) {
            return 1;
        }
        return iM166650c <= 2500 ? 2 : 3;
    }

    /* JADX INFO: renamed from: k */
    public static int m166658k(Context context) {
        int iM166659l = m166659l(context);
        int iM166657j = m166657j();
        if (iM166659l == 0 || iM166659l == 1 || iM166657j == 0) {
            return 0;
        }
        if (iM166659l == 2 && iM166657j >= 1) {
            return 1;
        }
        if (iM166659l > 2) {
            return iM166657j > 1 ? 2 : 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static int m166659l(Context context) {
        long jM166656i = m166656i(context) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        if (jM166656i <= 2000) {
            return 0;
        }
        if (jM166656i <= 3000) {
            return 1;
        }
        if (jM166656i <= 4000) {
            return 2;
        }
        return jM166656i <= 6000 ? 3 : 4;
    }

    /* JADX INFO: renamed from: m */
    public static int m166660m(String str, FileInputStream fileInputStream) {
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
                            return m166648a(bArr, i3);
                        }
                    }
                }
                i2++;
            }
            return -1;
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return -1;
        } catch (NumberFormatException e2) {
            CrashHelper.m81296c(e2);
            return -1;
        }
    }
}
