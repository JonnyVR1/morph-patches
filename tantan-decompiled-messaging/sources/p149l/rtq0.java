package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.service.C14857ba;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class rtq0 {

    /* JADX INFO: renamed from: a */
    private static boolean f160989a = false;

    /* JADX INFO: renamed from: l.rtq0$a */
    public static class RunnableC19781a implements Runnable {

        /* JADX INFO: renamed from: a */
        private Context f160990a;

        /* JADX INFO: renamed from: b */
        private utq0 f160991b;

        public RunnableC19781a(Context context, utq0 utq0Var) {
            this.f160991b = utq0Var;
            this.f160990a = context;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            rtq0.m180833f(this.f160990a, this.f160991b);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m180828a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX INFO: renamed from: b */
    public static void m180829b(Context context, utq0 utq0Var) {
        njq0.m159772f(context).m159773g(new RunnableC19781a(context, utq0Var));
    }

    /* JADX INFO: renamed from: c */
    private static void m180830c(Context context, utq0 utq0Var, File file, byte[] bArr) throws Throwable {
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
                                ilq0.m137025B("TinyData read from cache file failed cause lengthBuffer error. size:" + i2);
                                break loop0;
                            }
                            int iM143820a = jxq0.m143820a(bArr2);
                            if (iM143820a < 1 || iM143820a > 30720) {
                                ilq0.m137025B("TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + iM143820a);
                                break loop0;
                            }
                            byte[] bArr3 = new byte[iM143820a];
                            int i3 = bufferedInputStream2.read(bArr3);
                            if (i3 != iM143820a) {
                                ilq0.m137025B("TinyData read from cache file failed cause buffer size not equal length. size:" + i3 + "__length:" + iM143820a);
                                break loop0;
                            }
                            byte[] bArrM99035b = auq0.m99035b(bArr, bArr3);
                            if (bArrM99035b == null || bArrM99035b.length == 0) {
                                ilq0.m137025B("TinyData read from cache file failed cause decrypt fail");
                            } else {
                                C14744gj c14744gj = new C14744gj();
                                C14788m.m86276d(c14744gj, bArrM99035b);
                                c14744gj.m85619a("item_size", String.valueOf(bArrM99035b.length));
                                arrayList.add(c14744gj);
                                i++;
                                length += bArrM99035b.length;
                                if (i >= 8 || length >= 30720) {
                                    stq0.m185967d(context, utq0Var, arrayList);
                                    arrayList.clear();
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedInputStream = bufferedInputStream2;
                            ilq0.m137044q(e);
                            dxq0.m114018b(bufferedInputStream);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream = bufferedInputStream2;
                            dxq0.m114018b(bufferedInputStream);
                            throw th;
                        }
                    }
                }
                stq0.m185967d(context, utq0Var, arrayList);
                if (file != null && file.exists() && !file.delete()) {
                    ilq0.m137040m("TinyData delete reading temp file failed");
                }
                dxq0.m114018b(bufferedInputStream2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m180831d(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 4).edit();
        editorEdit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX INFO: renamed from: f */
    public static void m180833f(Context context, utq0 utq0Var) throws Throwable {
        RandomAccessFile randomAccessFile;
        File file;
        if (f160989a) {
            ilq0.m137040m("TinyData extractTinyData is running");
            return;
        }
        f160989a = true;
        File file2 = new File(context.getFilesDir(), "tiny_data.data");
        if (!file2.exists()) {
            ilq0.m137040m("TinyData no ready file to get data.");
            return;
        }
        m180828a(context);
        byte[] bArrM86612a = C14857ba.m86612a(context);
        FileLock fileLockLock = null;
        try {
            try {
                File file3 = new File(context.getFilesDir(), "tiny_data.lock");
                dxq0.m114022f(file3);
                randomAccessFile = new RandomAccessFile(file3, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    file2.renameTo(new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data"));
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e) {
                            ilq0.m137044q(e);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    ilq0.m137044q(e);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                    }
                    dxq0.m114018b(randomAccessFile);
                    file = new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data");
                    if (!file.exists()) {
                        ilq0.m137040m("TinyData no ready file to get data.");
                        return;
                    }
                    m180830c(context, utq0Var, file, bArrM86612a);
                    qtq0.m176474c(false);
                    m180831d(context);
                    f160989a = false;
                }
            } catch (Throwable th) {
                th = th;
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e3) {
                        ilq0.m137044q(e3);
                    }
                }
                dxq0.m114018b(randomAccessFile);
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
            dxq0.m114018b(randomAccessFile);
            throw th;
        }
        dxq0.m114018b(randomAccessFile);
        file = new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data");
        if (!file.exists()) {
            ilq0.m137040m("TinyData no ready file to get data.");
            return;
        }
        m180830c(context, utq0Var, file, bArrM86612a);
        qtq0.m176474c(false);
        m180831d(context);
        f160989a = false;
    }
}
