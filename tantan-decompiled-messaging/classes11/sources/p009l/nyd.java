package p009l;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nyd {

    /* JADX INFO: renamed from: a */
    public static final FileFilter f17765a = new C1061a();

    /* JADX INFO: renamed from: l.nyd$a */
    public class C1061a implements FileFilter {
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
    public static int m19533a(byte[] bArr, int i) {
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
    public static int m19534b() {
        int i = -1;
        for (int i2 = 0; i2 < m19538f(); i2++) {
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
                            CrashHelper.c(e);
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                }
            } catch (IOException unused) {
                return -1;
            }
        }
        if (i == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int iM19540h = m19540h("cpu MHz", fileInputStream2) * 1000;
                if (iM19540h > i) {
                    i = iM19540h;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static int m19535c() {
        File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(f17765a);
        if (fileArrListFiles != null) {
            return fileArrListFiles.length;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m19536d(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    int iM19537e = m19537e(line);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return iM19537e;
                } catch (IOException e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    CrashHelper.c(e);
                    if (fileInputStream == null) {
                        return -1;
                    }
                    try {
                        fileInputStream.close();
                        return -1;
                    } catch (IOException unused2) {
                        return -1;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m19537e(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* JADX INFO: renamed from: f */
    public static int m19538f() throws Throwable {
        try {
            int iM19536d = m19536d("/sys/devices/system/cpu/possible");
            if (iM19536d == -1) {
                iM19536d = m19536d("/sys/devices/system/cpu/present");
            }
            return iM19536d == -1 ? m19535c() : iM19536d;
        } catch (NullPointerException e) {
            CrashHelper.c(e);
            return -1;
        } catch (SecurityException e2) {
            CrashHelper.c(e2);
            return -1;
        }
    }

    @TargetApi(MediaPickerParamsObject.FROM_DEFAULT)
    /* JADX INFO: renamed from: g */
    public static long m19539g(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: renamed from: h */
    public static int m19540h(String str, FileInputStream fileInputStream) {
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
                            return m19533a(bArr, i3);
                        }
                    }
                }
                i2++;
            }
            return -1;
        } catch (IOException e) {
            CrashHelper.c(e);
            return -1;
        } catch (NumberFormatException e2) {
            CrashHelper.c(e2);
            return -1;
        }
    }
}
