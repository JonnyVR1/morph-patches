package p153l;

import com.apm.lite.nativecrash.NativeImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class p1r0 {
    /* JADX INFO: renamed from: a */
    public static File m170259a(String str, int i, int i2) {
        File file = new File(j5r0.m143567c(n0r0.m161022i(), str), "logcat.txt");
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5169g(file.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
        return file;
    }

    /* JADX INFO: renamed from: b */
    public static void m170260b() {
        try {
            m170259a(n0r0.m161021h(), n0r0.m161024k().m169523f(), n0r0.m161024k().m169524g());
            if (n0r0.m161034u()) {
                m170261c();
                m170263e();
                m170262d();
                m170264f();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static File m170261c() {
        File file = new File(j5r0.m143582r(n0r0.m161022i()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5170h(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static File m170262d() {
        File file = new File(j5r0.m143582r(n0r0.m161022i()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5171i(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: e */
    public static File m170263e() {
        File file = new File(j5r0.m143582r(n0r0.m161022i()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5168f(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: f */
    public static File m170264f() {
        File file = new File(j5r0.m143582r(n0r0.m161022i()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5172j(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: g */
    public static File m170265g() throws Throwable {
        BufferedWriter bufferedWriter;
        File file = new File(j5r0.m143582r(n0r0.m161022i()), "anr_trace.txt");
        if (!file.exists() && nrq0.m164516m()) {
            File file2 = new File("/data/anr/traces.txt");
            if (file2.exists()) {
                BufferedReader bufferedReader = null;
                try {
                    file.getParentFile().mkdirs();
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file));
                        int length = 0;
                        do {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                bufferedWriter.write(line);
                                bufferedWriter.write(10);
                                length += line.length();
                            } catch (IOException unused) {
                                bufferedReader = bufferedReader2;
                                m4r0.m157051a(bufferedReader);
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                m4r0.m157051a(bufferedReader);
                                m4r0.m157051a(bufferedWriter);
                                throw th;
                            }
                        } while (length < 1048576);
                        m4r0.m157051a(bufferedReader2);
                    } catch (IOException unused2) {
                        bufferedWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter = null;
                    }
                } catch (IOException unused3) {
                    bufferedWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter = null;
                }
                m4r0.m157051a(bufferedWriter);
                return file;
            }
        }
        return file;
    }
}
