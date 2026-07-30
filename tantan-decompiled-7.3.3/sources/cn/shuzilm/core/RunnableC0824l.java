package cn.shuzilm.core;

import android.content.Context;
import android.os.Looper;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: cn.shuzilm.core.l */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0824l implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3827a;

    public RunnableC0824l(Context context) {
        this.f3827a = context;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #1 {all -> 0x007a, blocks: (B:38:0x0072, B:40:0x0077), top: B:45:0x0072 }] */
    @Override // java.lang.Runnable
    public void run() {
        FileOutputStream fileOutputStreamOpenFileOutput;
        FileLock fileLockTryLock = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.f3827a.openFileOutput("du.lock", 0);
                try {
                    fileLockTryLock = fileOutputStreamOpenFileOutput.getChannel().tryLock();
                    if (fileLockTryLock != null && fileLockTryLock.isValid()) {
                        DUHelper.m4724b(1);
                        DUHelper.m4733d(DUHelper.mContext);
                        try {
                            System.loadLibrary("du");
                            if (!DUHelper.f3733d.f3757D) {
                                if (Looper.myLooper() == null) {
                                    Looper.prepare();
                                }
                                Looper.myLooper();
                            }
                            DUHelper.f3733d.f3757D = true;
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        fileLockTryLock.release();
                        fileOutputStreamOpenFileOutput.close();
                        return;
                    }
                    if (fileLockTryLock != null) {
                        fileLockTryLock.release();
                    }
                    fileOutputStreamOpenFileOutput.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        if (fileLockTryLock != null) {
                            fileLockTryLock.release();
                        }
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Throwable th3) {
                        if (fileLockTryLock != null) {
                            try {
                                fileLockTryLock.release();
                                if (fileOutputStreamOpenFileOutput != null) {
                                    fileOutputStreamOpenFileOutput.close();
                                }
                            } catch (Throwable unused) {
                                throw th3;
                            }
                        } else if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                        throw th3;
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStreamOpenFileOutput = null;
        }
    }
}
