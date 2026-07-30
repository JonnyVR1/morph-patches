package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Pair;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class apq0 implements cyv {

    /* JADX INFO: renamed from: d */
    private static final SimpleDateFormat f71069d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* JADX INFO: renamed from: e */
    public static String f71070e = "/MiPushLog";

    /* JADX INFO: renamed from: f */
    private static List<Pair<String, Throwable>> f71071f = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: g */
    private static volatile apq0 f71072g;

    /* JADX INFO: renamed from: a */
    private String f71073a;

    /* JADX INFO: renamed from: b */
    private Context f71074b;

    /* JADX INFO: renamed from: c */
    private Handler f71075c;

    /* JADX INFO: renamed from: l.apq0$a */
    public class RunnableC15689a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f71076a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Throwable f71077b;

        public RunnableC15689a(String str, Throwable th) {
            this.f71076a = str;
            this.f71077b = th;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            apq0.f71071f.add(new Pair(String.format("%1$s %2$s %3$s ", apq0.f71069d.format(new Date()), apq0.this.f71073a, this.f71076a), this.f71077b));
            if (apq0.f71071f.size() > 20000) {
                int size = apq0.f71071f.size() - 19950;
                for (int i = 0; i < size; i++) {
                    try {
                        if (apq0.f71071f.size() > 0) {
                            apq0.f71071f.remove(0);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
                apq0.f71071f.add(new Pair(String.format("%1$s %2$s %3$s ", apq0.f71069d.format(new Date()), apq0.this.f71073a, "flush " + size + " lines logs."), null));
            }
            try {
                apq0.this.m98173e();
            } catch (Exception e) {
                Log.e(apq0.this.f71073a, "", e);
            }
        }
    }

    private apq0(Context context) {
        this.f71074b = context;
        if (context.getApplicationContext() != null) {
            this.f71074b = context.getApplicationContext();
        }
        this.f71073a = this.f71074b.getPackageName() + "-" + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.f71075c = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: d */
    public static apq0 m98172d(Context context) {
        if (f71072g == null) {
            synchronized (apq0.class) {
                try {
                    if (f71072g == null) {
                        f71072g = new apq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f71072g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m98173e() throws Throwable {
        FileLock fileLockLock;
        RandomAccessFile randomAccessFile;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(this.f71074b.getFilesDir(), f71070e);
            if (!ywq0.m216410b(file)) {
                file.toString();
                return;
            }
            if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
                File file2 = new File(file, "log.lock");
                if (!file2.exists() || file2.isDirectory()) {
                    file2.createNewFile();
                }
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                            while (!f71071f.isEmpty()) {
                                try {
                                    Pair<String, Throwable> pairRemove = f71071f.remove(0);
                                    String str = (String) pairRemove.first;
                                    if (pairRemove.second != null) {
                                        str = (str + SignParameters.NEW_LINE) + Log.getStackTraceString((Throwable) pairRemove.second);
                                    }
                                    bufferedWriter2.write(str + SignParameters.NEW_LINE);
                                } catch (Exception e) {
                                    e = e;
                                    bufferedWriter = bufferedWriter2;
                                    Log.e(this.f71073a, "", e);
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e2) {
                                            Log.e(this.f71073a, "", e2);
                                        }
                                    }
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e3) {
                                            Log.e(this.f71073a, "", e3);
                                        }
                                    }
                                    if (randomAccessFile == null) {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedWriter = bufferedWriter2;
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e4) {
                                            Log.e(this.f71073a, "", e4);
                                        }
                                    }
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e5) {
                                            Log.e(this.f71073a, "", e5);
                                        }
                                    }
                                    if (randomAccessFile == null) {
                                        throw th;
                                    }
                                    try {
                                        randomAccessFile.close();
                                        throw th;
                                    } catch (IOException e6) {
                                        Log.e(this.f71073a, "", e6);
                                        throw th;
                                    }
                                }
                            }
                            bufferedWriter2.flush();
                            bufferedWriter2.close();
                            File file3 = new File(file, "log1.txt");
                            if (file3.length() >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                                File file4 = new File(file, "log0.txt");
                                if (file4.exists() && file4.isFile()) {
                                    file4.delete();
                                }
                                file3.renameTo(file4);
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e7) {
                                    Log.e(this.f71073a, "", e7);
                                }
                            }
                        } catch (Exception e8) {
                            e = e8;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e9) {
                    e = e9;
                    fileLockLock = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLockLock = null;
                }
                try {
                    randomAccessFile.close();
                } catch (IOException e10) {
                    Log.e(this.f71073a, "", e10);
                }
            }
        } catch (Exception e11) {
            e = e11;
            fileLockLock = null;
            randomAccessFile = null;
        } catch (Throwable th4) {
            th = th4;
            fileLockLock = null;
            randomAccessFile = null;
        }
    }

    @Override // p149l.cyv
    public final void log(String str, Throwable th) {
        this.f71075c.post(new RunnableC15689a(str, th));
    }

    @Override // p149l.cyv
    public final void log(String str) {
        log(str, null);
    }
}
