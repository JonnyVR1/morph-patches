package p149l;

import com.apm.lite.nativecrash.NativeImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class jsq0 {
    /* JADX INFO: renamed from: a */
    public static File m143055a(String str, int i, int i2) {
        File file = new File(dwq0.m113915c(hrq0.m132700i(), str), "logcat.txt");
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5159g(file.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
        return file;
    }

    /* JADX INFO: renamed from: b */
    public static void m143056b() {
        try {
            m143055a(hrq0.m132699h(), hrq0.m132702k().m143402f(), hrq0.m132702k().m143403g());
            if (hrq0.m132712u()) {
                m143057c();
                m143059e();
                m143058d();
                m143060f();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static File m143057c() {
        File file = new File(dwq0.m113930r(hrq0.m132700i()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5160h(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static File m143058d() {
        File file = new File(dwq0.m113930r(hrq0.m132700i()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5161i(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: e */
    public static File m143059e() {
        File file = new File(dwq0.m113930r(hrq0.m132700i()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5158f(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: f */
    public static File m143060f() {
        File file = new File(dwq0.m113930r(hrq0.m132700i()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m5162j(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: g */
    public static File m143061g() throws Throwable {
        BufferedWriter bufferedWriter;
        File file = new File(dwq0.m113930r(hrq0.m132700i()), "anr_trace.txt");
        if (!file.exists() && iiq0.m136438m()) {
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
                                gvq0.m128290a(bufferedReader);
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                gvq0.m128290a(bufferedReader);
                                gvq0.m128290a(bufferedWriter);
                                throw th;
                            }
                        } while (length < 1048576);
                        gvq0.m128290a(bufferedReader2);
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
                gvq0.m128290a(bufferedWriter);
                return file;
            }
        }
        return file;
    }
}
