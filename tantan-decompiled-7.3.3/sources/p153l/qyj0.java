package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import com.hellogroup.common.file.FileUtil;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes7.dex */
public class qyj0 {

    /* JADX INFO: renamed from: a */
    private static final String f160161a = "qyj0";

    /* JADX INFO: renamed from: b */
    private static final String[] f160162b = {"../", "~/"};

    /* JADX INFO: renamed from: b */
    public static boolean m178654b(String str, File file, String str2, boolean z, okj okjVar) {
        return file.getName().endsWith(".7z") ? FileUtil.m17537u(file, str2) : m178655c(str, file.getAbsolutePath(), str2, z, okjVar);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m178655c(String str, String str2, String str3, boolean z, okj okjVar) {
        try {
            m178656d(str, str2, str3, z, okjVar);
            return true;
        } catch (Exception e) {
            Log.e(f160161a, "", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m178656d(String str, String str2, String str3, boolean z, okj okjVar) throws Exception {
        BufferedOutputStream bufferedOutputStream;
        Closeable closeable = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        closeable = null;
        try {
            ZipFile zipFile = new ZipFile(str2);
            try {
                int size = zipFile.size();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                int i = 0;
                while (enumerationEntries.hasMoreElements()) {
                    if (okjVar != null) {
                        i++;
                        okjVar.mo138410a(str, 1, 0, size, i);
                    }
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (!m178657e(name)) {
                        throw new IllegalArgumentException("unsecurity zipfile!");
                    }
                    InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                    File file = new File(str3, name);
                    if (!file.getCanonicalPath().startsWith(str3)) {
                        m178653a();
                    }
                    if (!zipEntryNextElement.isDirectory()) {
                        File file2 = new File(file.getParent());
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        if (z) {
                            File file3 = new File(file2, ".nomedia");
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                        }
                        try {
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 4096);
                            try {
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i2 = inputStream.read(bArr, 0, 4096);
                                    if (i2 == -1) {
                                        break;
                                    } else {
                                        bufferedOutputStream.write(bArr, 0, i2);
                                    }
                                }
                                bufferedOutputStream.flush();
                                try {
                                    n1m.m161127b(inputStream);
                                    n1m.m161127b(bufferedOutputStream);
                                    file.setLastModified(System.currentTimeMillis());
                                    bufferedOutputStream2 = bufferedOutputStream;
                                } catch (IOException e) {
                                    e = e;
                                    closeable = zipFile;
                                    try {
                                        Log.e("MK", "", e);
                                        throw e;
                                    } catch (Throwable th) {
                                        th = th;
                                        new File(str3).setLastModified(System.currentTimeMillis());
                                        n1m.m161126a(closeable, bufferedOutputStream);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    closeable = zipFile;
                                    new File(str3).setLastModified(System.currentTimeMillis());
                                    n1m.m161126a(closeable, bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream2 = bufferedOutputStream;
                                try {
                                    Log.e(f160161a, "", th);
                                    throw th;
                                } catch (Throwable th4) {
                                    n1m.m161127b(inputStream);
                                    n1m.m161127b(bufferedOutputStream2);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else if (!file.exists()) {
                        file.mkdirs();
                    }
                }
                new File(str3).setLastModified(System.currentTimeMillis());
                n1m.m161126a(zipFile, bufferedOutputStream2);
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream = bufferedOutputStream2;
                closeable = zipFile;
                Log.e("MK", "", e);
                throw e;
            } catch (Throwable th6) {
                th = th6;
                bufferedOutputStream = bufferedOutputStream2;
                closeable = zipFile;
                new File(str3).setLastModified(System.currentTimeMillis());
                n1m.m161126a(closeable, bufferedOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            bufferedOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m178657e(@NonNull String str) {
        for (String str2 : f160162b) {
            if (str.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static void m178653a() {
    }
}
