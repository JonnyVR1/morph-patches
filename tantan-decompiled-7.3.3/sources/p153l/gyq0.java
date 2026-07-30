package p153l;

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
public class gyq0 implements zzv {

    /* JADX INFO: renamed from: d */
    private static final SimpleDateFormat f107094d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* JADX INFO: renamed from: e */
    public static String f107095e = "/MiPushLog";

    /* JADX INFO: renamed from: f */
    private static List<Pair<String, Throwable>> f107096f = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: g */
    private static volatile gyq0 f107097g;

    /* JADX INFO: renamed from: a */
    private String f107098a;

    /* JADX INFO: renamed from: b */
    private Context f107099b;

    /* JADX INFO: renamed from: c */
    private Handler f107100c;

    /* JADX INFO: renamed from: l.gyq0$a */
    public class RunnableC17353a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f107101a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Throwable f107102b;

        public RunnableC17353a(String str, Throwable th) {
            this.f107101a = str;
            this.f107102b = th;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            gyq0.f107096f.add(new Pair(String.format("%1$s %2$s %3$s ", gyq0.f107094d.format(new Date()), gyq0.this.f107098a, this.f107101a), this.f107102b));
            if (gyq0.f107096f.size() > 20000) {
                int size = gyq0.f107096f.size() - 19950;
                for (int i = 0; i < size; i++) {
                    try {
                        if (gyq0.f107096f.size() > 0) {
                            gyq0.f107096f.remove(0);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
                gyq0.f107096f.add(new Pair(String.format("%1$s %2$s %3$s ", gyq0.f107094d.format(new Date()), gyq0.this.f107098a, "flush " + size + " lines logs."), null));
            }
            try {
                gyq0.this.m133008e();
            } catch (Exception e) {
                Log.e(gyq0.this.f107098a, "", e);
            }
        }
    }

    private gyq0(Context context) {
        this.f107099b = context;
        if (context.getApplicationContext() != null) {
            this.f107099b = context.getApplicationContext();
        }
        this.f107098a = this.f107099b.getPackageName() + "-" + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.f107100c = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: d */
    public static gyq0 m133007d(Context context) {
        if (f107097g == null) {
            synchronized (gyq0.class) {
                try {
                    if (f107097g == null) {
                        f107097g = new gyq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f107097g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m133008e() throws Throwable {
        FileLock fileLockLock;
        RandomAccessFile randomAccessFile;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(this.f107099b.getFilesDir(), f107095e);
            if (!e6r0.m119667b(file)) {
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
                            while (!f107096f.isEmpty()) {
                                try {
                                    Pair<String, Throwable> pairRemove = f107096f.remove(0);
                                    String str = (String) pairRemove.first;
                                    if (pairRemove.second != null) {
                                        str = (str + SignParameters.NEW_LINE) + Log.getStackTraceString((Throwable) pairRemove.second);
                                    }
                                    bufferedWriter2.write(str + SignParameters.NEW_LINE);
                                } catch (Exception e) {
                                    e = e;
                                    bufferedWriter = bufferedWriter2;
                                    Log.e(this.f107098a, "", e);
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e2) {
                                            Log.e(this.f107098a, "", e2);
                                        }
                                    }
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e3) {
                                            Log.e(this.f107098a, "", e3);
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
                                            Log.e(this.f107098a, "", e4);
                                        }
                                    }
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e5) {
                                            Log.e(this.f107098a, "", e5);
                                        }
                                    }
                                    if (randomAccessFile == null) {
                                        throw th;
                                    }
                                    try {
                                        randomAccessFile.close();
                                        throw th;
                                    } catch (IOException e6) {
                                        Log.e(this.f107098a, "", e6);
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
                                    Log.e(this.f107098a, "", e7);
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
                    Log.e(this.f107098a, "", e10);
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

    @Override // p153l.zzv
    public final void log(String str, Throwable th) {
        this.f107100c.post(new RunnableC17353a(str, th));
    }

    @Override // p153l.zzv
    public final void log(String str) {
        log(str, null);
    }
}
