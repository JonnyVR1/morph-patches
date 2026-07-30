package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14896gn;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14890gh;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.service.C14985ah;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bzq0 extends tsq0.AbstractRunnableC20394c {

    /* JADX INFO: renamed from: c */
    protected int f79173c;

    /* JADX INFO: renamed from: d */
    protected Context f79174d;

    public bzq0(Context context, int i) {
        this.f79173c = i;
        this.f79174d = context;
    }

    /* JADX INFO: renamed from: c */
    public static void m107245c(Context context, C14896gn c14896gn) {
        iyq0 iyq0VarM147616a = jyq0.m147615b().m147616a();
        String strMo142717a = iyq0VarM147616a == null ? "" : iyq0VarM147616a.mo142717a();
        if (TextUtils.isEmpty(strMo142717a) || TextUtils.isEmpty(c14896gn.m86825a())) {
            return;
        }
        m107246d(context, c14896gn, strMo142717a);
    }

    /* JADX INFO: renamed from: d */
    private static void m107246d(Context context, C14896gn c14896gn, String str) {
        BufferedOutputStream bufferedOutputStream;
        RandomAccessFile randomAccessFile;
        byte[] bArrM156378d = lyq0.m156378d(str, C14936m.m87448e(c14896gn));
        if (bArrM156378d == null || bArrM156378d.length == 0) {
            return;
        }
        synchronized (myq0.f139428a) {
            FileLock fileLock = null;
            BufferedOutputStream bufferedOutputStream2 = null;
            fileLock = null;
            fileLock = null;
            fileLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), "push_cdata.lock");
                    j6r0.m143695f(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileLock fileLockLock = randomAccessFile.getChannel().lock();
                        try {
                            File file2 = new File(context.getFilesDir(), "push_cdata.data");
                            if (e6r0.m119667b(file2)) {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
                                try {
                                    bufferedOutputStream.write(p6r0.m170922b(bArrM156378d.length));
                                    bufferedOutputStream.write(bArrM156378d);
                                    bufferedOutputStream.flush();
                                    file2.setLastModified(0L);
                                    bufferedOutputStream2 = bufferedOutputStream;
                                } catch (IOException e) {
                                    e = e;
                                    fileLock = fileLockLock;
                                    try {
                                        e.printStackTrace();
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        j6r0.m143691b(bufferedOutputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        j6r0.m143691b(bufferedOutputStream);
                                        j6r0.m143691b(randomAccessFile);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileLock = fileLockLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    j6r0.m143691b(bufferedOutputStream);
                                    j6r0.m143691b(randomAccessFile);
                                    throw th;
                                }
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException unused3) {
                                }
                            }
                            j6r0.m143691b(bufferedOutputStream2);
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
                } catch (Throwable th5) {
                    throw th5;
                }
            } catch (IOException e4) {
                e = e4;
                bufferedOutputStream = null;
                randomAccessFile = null;
            } catch (Throwable th6) {
                th = th6;
                bufferedOutputStream = null;
                randomAccessFile = null;
            }
            j6r0.m143691b(randomAccessFile);
        }
    }

    /* JADX INFO: renamed from: h */
    private String m107247h() {
        return "dc_job_result_time_" + mo87798a();
    }

    /* JADX INFO: renamed from: j */
    private String m107248j() {
        return "dc_job_result_" + mo87798a();
    }

    /* JADX INFO: renamed from: b */
    public abstract EnumC14890gh mo107249b();

    /* JADX INFO: renamed from: e */
    public boolean m107250e() {
        return lyq0.m156376b(this.f79174d, String.valueOf(mo87798a()), this.f79173c);
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo107251f();

    /* JADX INFO: renamed from: g */
    public boolean m107252g() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m107253i() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strMo107251f = mo107251f();
        if (TextUtils.isEmpty(strMo107251f)) {
            return;
        }
        if (m107250e()) {
            ouq0.m169393m("DC run job mutual: " + mo87798a());
            return;
        }
        iyq0 iyq0VarM147616a = jyq0.m147615b().m147616a();
        String strMo142717a = iyq0VarM147616a == null ? "" : iyq0VarM147616a.mo142717a();
        if (!TextUtils.isEmpty(strMo142717a) && m107252g()) {
            if (m107253i()) {
                SharedPreferences sharedPreferences = this.f79174d.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
                if (bvq0.m106588b(strMo107251f).equals(sharedPreferences.getString(m107248j(), null))) {
                    long j = sharedPreferences.getLong(m107247h(), 0L);
                    int iM87652a = C14985ah.m87648a(this.f79174d).m87652a(EnumC14893gk.DCJobUploadRepeatedInterval.m86817a(), 604800);
                    if ((System.currentTimeMillis() - j) / 1000 < this.f79173c) {
                        return;
                    }
                    if ((System.currentTimeMillis() - j) / 1000 < iM87652a) {
                        strMo107251f = "same_" + j;
                    }
                }
            }
            C14896gn c14896gn = new C14896gn();
            c14896gn.m86824a(strMo107251f);
            c14896gn.m86822a(System.currentTimeMillis());
            c14896gn.m86823a(mo107249b());
            m107246d(this.f79174d, c14896gn, strMo142717a);
        }
    }
}
