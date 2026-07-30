package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.service.C15005ba;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class x2r0 {

    /* JADX INFO: renamed from: a */
    private static boolean f192178a = false;

    /* JADX INFO: renamed from: l.x2r0$a */
    public static class RunnableC21235a implements Runnable {

        /* JADX INFO: renamed from: a */
        private Context f192179a;

        /* JADX INFO: renamed from: b */
        private a3r0 f192180b;

        public RunnableC21235a(Context context, a3r0 a3r0Var) {
            this.f192180b = a3r0Var;
            this.f192179a = context;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            x2r0.m209176f(this.f192179a, this.f192180b);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m209171a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX INFO: renamed from: b */
    public static void m209172b(Context context, a3r0 a3r0Var) {
        tsq0.m192627f(context).m192628g(new RunnableC21235a(context, a3r0Var));
    }

    /* JADX INFO: renamed from: c */
    private static void m209173c(Context context, a3r0 a3r0Var, File file, byte[] bArr) throws Throwable {
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                loop0: while (true) {
                    int i = 0;
                    int length = 0;
                    while (true) {
                        try {
                            int i2 = bufferedInputStream2.read(bArr2);
                            if (i2 == -1) {
                                break loop0;
                            }
                            if (i2 != 4) {
                                ouq0.m169378B("TinyData read from cache file failed cause lengthBuffer error. size:" + i2);
                                break loop0;
                            }
                            int iM170921a = p6r0.m170921a(bArr2);
                            if (iM170921a < 1 || iM170921a > 30720) {
                                ouq0.m169378B("TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + iM170921a);
                                break loop0;
                            }
                            byte[] bArr3 = new byte[iM170921a];
                            int i3 = bufferedInputStream2.read(bArr3);
                            if (i3 != iM170921a) {
                                ouq0.m169378B("TinyData read from cache file failed cause buffer size not equal length. size:" + i3 + "__length:" + iM170921a);
                                break loop0;
                            }
                            byte[] bArrM128757b = g3r0.m128757b(bArr, bArr3);
                            if (bArrM128757b == null || bArrM128757b.length == 0) {
                                ouq0.m169378B("TinyData read from cache file failed cause decrypt fail");
                            } else {
                                C14892gj c14892gj = new C14892gj();
                                C14936m.m87447d(c14892gj, bArrM128757b);
                                c14892gj.m86790a("item_size", String.valueOf(bArrM128757b.length));
                                arrayList.add(c14892gj);
                                i++;
                                length += bArrM128757b.length;
                                if (i >= 8 || length >= 30720) {
                                    y2r0.m214099d(context, a3r0Var, arrayList);
                                    arrayList.clear();
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedInputStream = bufferedInputStream2;
                            ouq0.m169397q(e);
                            j6r0.m143691b(bufferedInputStream);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream = bufferedInputStream2;
                            j6r0.m143691b(bufferedInputStream);
                            throw th;
                        }
                    }
                }
                y2r0.m214099d(context, a3r0Var, arrayList);
                if (file != null && file.exists() && !file.delete()) {
                    ouq0.m169393m("TinyData delete reading temp file failed");
                }
                j6r0.m143691b(bufferedInputStream2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m209174d(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 4).edit();
        editorEdit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX INFO: renamed from: f */
    public static void m209176f(Context context, a3r0 a3r0Var) throws Throwable {
        RandomAccessFile randomAccessFile;
        File file;
        if (f192178a) {
            ouq0.m169393m("TinyData extractTinyData is running");
            return;
        }
        f192178a = true;
        File file2 = new File(context.getFilesDir(), "tiny_data.data");
        if (!file2.exists()) {
            ouq0.m169393m("TinyData no ready file to get data.");
            return;
        }
        m209171a(context);
        byte[] bArrM87783a = C15005ba.m87783a(context);
        FileLock fileLockLock = null;
        try {
            try {
                File file3 = new File(context.getFilesDir(), "tiny_data.lock");
                j6r0.m143695f(file3);
                randomAccessFile = new RandomAccessFile(file3, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    file2.renameTo(new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data"));
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e) {
                            ouq0.m169397q(e);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    ouq0.m169397q(e);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                    }
                    j6r0.m143691b(randomAccessFile);
                    file = new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data");
                    if (!file.exists()) {
                        ouq0.m169393m("TinyData no ready file to get data.");
                        return;
                    }
                    m209173c(context, a3r0Var, file, bArrM87783a);
                    w2r0.m204583c(false);
                    m209174d(context);
                    f192178a = false;
                }
            } catch (Throwable th) {
                th = th;
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e3) {
                        ouq0.m169397q(e3);
                    }
                }
                j6r0.m143691b(randomAccessFile);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            if (fileLockLock != null) {
                fileLockLock.release();
            }
            j6r0.m143691b(randomAccessFile);
            throw th;
        }
        j6r0.m143691b(randomAccessFile);
        file = new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data");
        if (!file.exists()) {
            ouq0.m169393m("TinyData no ready file to get data.");
            return;
        }
        m209173c(context, a3r0Var, file, bArrM87783a);
        w2r0.m204583c(false);
        m209174d(context);
        f192178a = false;
    }
}
