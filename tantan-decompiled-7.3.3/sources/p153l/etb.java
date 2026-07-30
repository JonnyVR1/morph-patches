package p153l;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes11.dex */
public class etb {

    /* JADX INFO: renamed from: a */
    public static float f95709a;

    /* JADX INFO: renamed from: a */
    public static int m122430a(String str) {
        if (!str.contains("CPU")) {
            return -1;
        }
        String[] strArrSplit = str.split("\\s+");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].contains("CPU")) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static float m122431b() {
        if (Build.VERSION.SDK_INT >= 26) {
            f95709a = m122432c();
        } else {
            f95709a = m122433d();
        }
        return f95709a;
    }

    /* JADX INFO: renamed from: c */
    public static float m122432c() {
        BufferedReader bufferedReader;
        Process process = null;
        try {
            Process processExec = Runtime.getRuntime().exec("top -n 1");
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                int i = -1;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            processExec.destroy();
                            break;
                        }
                        String strTrim = line.trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            int iM122430a = m122430a(strTrim);
                            if (iM122430a != -1) {
                                i = iM122430a;
                            } else if (strTrim.contains(String.valueOf(Process.myPid())) && i != -1) {
                                String[] strArrSplit = strTrim.split("\\s+");
                                if (strArrSplit.length > i) {
                                    String strSubstring = strArrSplit[i];
                                    if (strSubstring.endsWith("%")) {
                                        strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf("%"));
                                    }
                                    int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                                    if (iAvailableProcessors != 0) {
                                        float f = Float.parseFloat(strSubstring) / iAvailableProcessors;
                                        if (f != Float.NaN && f != Float.POSITIVE_INFINITY && f != Float.NEGATIVE_INFINITY) {
                                            processExec.destroy();
                                            m1m.m156698a(bufferedReader);
                                            return f;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused) {
                        process = processExec;
                        if (process != null) {
                            process.destroy();
                        }
                    }
                }
            } catch (Throwable unused2) {
                bufferedReader = null;
            }
        } catch (Throwable unused3) {
            bufferedReader = null;
        }
        m1m.m156698a(bufferedReader);
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public static float m122433d() throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            RandomAccessFile randomAccessFile3 = new RandomAccessFile("/proc/stat", "r");
            try {
                randomAccessFile = new RandomAccessFile("/proc/" + Process.myPid() + "/stat", "r");
                try {
                    float[] fArrM122434e = m122434e(randomAccessFile3, randomAccessFile);
                    if (fArrM122434e != null) {
                        Thread.sleep(500L);
                        randomAccessFile3.seek(0L);
                        randomAccessFile.seek(0L);
                        float[] fArrM122434e2 = m122434e(randomAccessFile3, randomAccessFile);
                        if (fArrM122434e2 != null) {
                            float f = ((fArrM122434e2[1] - fArrM122434e[1]) / (fArrM122434e2[0] - fArrM122434e[0])) * 100.0f;
                            if (f != Float.NaN && f != Float.POSITIVE_INFINITY && f != Float.NEGATIVE_INFINITY) {
                                m1m.m156698a(randomAccessFile3);
                                m1m.m156698a(randomAccessFile);
                                return f;
                            }
                        }
                    }
                    m1m.m156698a(randomAccessFile3);
                } catch (Exception unused) {
                    randomAccessFile2 = randomAccessFile3;
                    m1m.m156698a(randomAccessFile2);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile3;
                    m1m.m156698a(randomAccessFile2);
                    m1m.m156698a(randomAccessFile);
                    throw th;
                }
            } catch (Exception unused2) {
                randomAccessFile = null;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
            }
        } catch (Exception unused3) {
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
        m1m.m156698a(randomAccessFile);
        return 0.0f;
    }

    /* JADX INFO: renamed from: e */
    public static float[] m122434e(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        long j;
        long j2;
        try {
            String line = randomAccessFile.readLine();
            String line2 = randomAccessFile2.readLine();
            if (TextUtils.isEmpty(line) || TextUtils.isEmpty(line2)) {
                j = 0;
                j2 = 0;
            } else {
                String[] strArrSplit = line.split("\\s+");
                String[] strArrSplit2 = line2.split("\\s+");
                if (strArrSplit2.length < 17) {
                    return null;
                }
                j = Long.parseLong(strArrSplit[1]) + Long.parseLong(strArrSplit[2]) + Long.parseLong(strArrSplit[3]) + Long.parseLong(strArrSplit[4]) + Long.parseLong(strArrSplit[5]) + Long.parseLong(strArrSplit[6]) + Long.parseLong(strArrSplit[7]);
                j2 = Long.parseLong(strArrSplit2[13]) + Long.parseLong(strArrSplit2[14]) + Long.parseLong(strArrSplit2[15]) + Long.parseLong(strArrSplit2[16]);
            }
            return new float[]{j, j2};
        } catch (Throwable unused) {
            return null;
        }
    }
}
