package p149l;

import com.immomo.resdownloader.log.MLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class phi {

    /* JADX INFO: renamed from: a */
    private static final String[] f148933a = {"../", "~/"};

    /* JADX WARN: Code duplicated, block: B:32:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #5 {all -> 0x0057, blocks: (B:31:0x004f, B:33:0x0054), top: B:39:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m168969a(File file, File file2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file), 4096);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2), 4096);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = bufferedInputStream2.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream.flush();
                            try {
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                            } catch (Throwable unused2) {
                                throw th;
                            }
                        } else if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                    } else if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m168970b(String str, String str2) {
        return m168971c(str, str2, false);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m168971c(String str, String str2, boolean z) {
        try {
            m168972d(str, str2, z);
            return true;
        } catch (Exception e) {
            MLog.printErrStackTrace("momo FileUtil", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m168972d(String str, String str2, boolean z) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        BufferedOutputStream bufferedOutputStream = null;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                byte[] bArr = new byte[4096];
                String name = nextEntry.getName();
                if (!m168973e(name)) {
                    throw new IllegalArgumentException("unsecurity zipfile!");
                }
                File file = new File(str2, name);
                if (!nextEntry.isDirectory()) {
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
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file), 4096);
                        while (true) {
                            try {
                                int i = zipInputStream.read(bArr, 0, 4096);
                                if (i == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream2.write(bArr, 0, i);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                bufferedOutputStream.close();
                                throw th;
                            }
                        }
                        bufferedOutputStream2.flush();
                        bufferedOutputStream2.close();
                        bufferedOutputStream = bufferedOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable th3) {
                zipInputStream.close();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m168973e(String str) {
        int length = f148933a.length;
        for (int i = 0; i < length; i++) {
            if (str.contains(f148933a[i])) {
                return false;
            }
        }
        return true;
    }
}
