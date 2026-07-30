package p153l;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class rn00 {
    /* JADX WARN: Code duplicated, block: B:36:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0060 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #4 {all -> 0x0063, blocks: (B:35:0x005b, B:37:0x0060), top: B:45:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m182116a(File file, File file2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (!file.exists() || file2.isDirectory()) {
            zpg0.m220844a("复制出错，请检查参数合法性");
            return;
        }
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
    public static Object m182117b(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(fileInputStream));
            Object object = objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
            return object;
        } catch (Throwable th) {
            lyv.m156388b(th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m182118c(File file, Serializable serializable) {
        if (file.exists()) {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                objectOutputStream.writeObject(serializable);
                objectOutputStream.flush();
                objectOutputStream.close();
            } catch (FileNotFoundException e) {
                lyv.m156388b(e.getMessage());
            } catch (IOException unused) {
            }
        }
    }
}
