package p149l;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes13.dex */
public class qrb {

    /* JADX INFO: renamed from: a */
    public static float f155977a;

    /* JADX INFO: renamed from: a */
    public static int m175981a(String str) {
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
    public static float m175982b() {
        if (Build.VERSION.SDK_INT >= 26) {
            f155977a = m175983c();
        } else {
            f155977a = m175984d();
        }
        return f155977a;
    }

    /* JADX INFO: renamed from: c */
    public static float m175983c() {
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
                            int iM175981a = m175981a(strTrim);
                            if (iM175981a != -1) {
                                i = iM175981a;
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
                                            ryl.m181666a(bufferedReader);
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
        ryl.m181666a(bufferedReader);
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public static float m175984d() throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            RandomAccessFile randomAccessFile3 = new RandomAccessFile("/proc/stat", "r");
            try {
                randomAccessFile = new RandomAccessFile("/proc/" + Process.myPid() + "/stat", "r");
                try {
                    float[] fArrM175985e = m175985e(randomAccessFile3, randomAccessFile);
                    if (fArrM175985e != null) {
                        Thread.sleep(500L);
                        randomAccessFile3.seek(0L);
                        randomAccessFile.seek(0L);
                        float[] fArrM175985e2 = m175985e(randomAccessFile3, randomAccessFile);
                        if (fArrM175985e2 != null) {
                            float f = ((fArrM175985e2[1] - fArrM175985e[1]) / (fArrM175985e2[0] - fArrM175985e[0])) * 100.0f;
                            if (f != Float.NaN && f != Float.POSITIVE_INFINITY && f != Float.NEGATIVE_INFINITY) {
                                ryl.m181666a(randomAccessFile3);
                                ryl.m181666a(randomAccessFile);
                                return f;
                            }
                        }
                    }
                    ryl.m181666a(randomAccessFile3);
                } catch (Exception unused) {
                    randomAccessFile2 = randomAccessFile3;
                    ryl.m181666a(randomAccessFile2);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile3;
                    ryl.m181666a(randomAccessFile2);
                    ryl.m181666a(randomAccessFile);
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
        ryl.m181666a(randomAccessFile);
        return 0.0f;
    }

    /* JADX INFO: renamed from: e */
    public static float[] m175985e(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
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
