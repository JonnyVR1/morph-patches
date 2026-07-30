package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14748gn;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14742gh;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.service.C14837ah;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vpq0 extends njq0.AbstractRunnableC18717c {

    /* JADX INFO: renamed from: c */
    protected int f182518c;

    /* JADX INFO: renamed from: d */
    protected Context f182519d;

    public vpq0(Context context, int i) {
        this.f182518c = i;
        this.f182519d = context;
    }

    /* JADX INFO: renamed from: c */
    public static void m199291c(Context context, C14748gn c14748gn) {
        cpq0 cpq0VarM112925a = dpq0.m112924b().m112925a();
        String strMo108171a = cpq0VarM112925a == null ? "" : cpq0VarM112925a.mo108171a();
        if (TextUtils.isEmpty(strMo108171a) || TextUtils.isEmpty(c14748gn.m85654a())) {
            return;
        }
        m199292d(context, c14748gn, strMo108171a);
    }

    /* JADX INFO: renamed from: d */
    private static void m199292d(Context context, C14748gn c14748gn, String str) {
        BufferedOutputStream bufferedOutputStream;
        RandomAccessFile randomAccessFile;
        byte[] bArrM122628d = fpq0.m122628d(str, C14788m.m86277e(c14748gn));
        if (bArrM122628d == null || bArrM122628d.length == 0) {
            return;
        }
        synchronized (gpq0.f103834a) {
            FileLock fileLock = null;
            BufferedOutputStream bufferedOutputStream2 = null;
            fileLock = null;
            fileLock = null;
            fileLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), "push_cdata.lock");
                    dxq0.m114022f(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileLock fileLockLock = randomAccessFile.getChannel().lock();
                        try {
                            File file2 = new File(context.getFilesDir(), "push_cdata.data");
                            if (ywq0.m216410b(file2)) {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
                                try {
                                    bufferedOutputStream.write(jxq0.m143821b(bArrM122628d.length));
                                    bufferedOutputStream.write(bArrM122628d);
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
                                        dxq0.m114018b(bufferedOutputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        dxq0.m114018b(bufferedOutputStream);
                                        dxq0.m114018b(randomAccessFile);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileLock = fileLockLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    dxq0.m114018b(bufferedOutputStream);
                                    dxq0.m114018b(randomAccessFile);
                                    throw th;
                                }
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException unused3) {
                                }
                            }
                            dxq0.m114018b(bufferedOutputStream2);
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
            dxq0.m114018b(randomAccessFile);
        }
    }

    /* JADX INFO: renamed from: h */
    private String m199293h() {
        return "dc_job_result_time_" + mo86627a();
    }

    /* JADX INFO: renamed from: j */
    private String m199294j() {
        return "dc_job_result_" + mo86627a();
    }

    /* JADX INFO: renamed from: b */
    public abstract EnumC14742gh mo199295b();

    /* JADX INFO: renamed from: e */
    public boolean m199296e() {
        return fpq0.m122626b(this.f182519d, String.valueOf(mo86627a()), this.f182518c);
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo199297f();

    /* JADX INFO: renamed from: g */
    public boolean m199298g() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m199299i() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strMo199297f = mo199297f();
        if (TextUtils.isEmpty(strMo199297f)) {
            return;
        }
        if (m199296e()) {
            ilq0.m137040m("DC run job mutual: " + mo86627a());
            return;
        }
        cpq0 cpq0VarM112925a = dpq0.m112924b().m112925a();
        String strMo108171a = cpq0VarM112925a == null ? "" : cpq0VarM112925a.mo108171a();
        if (!TextUtils.isEmpty(strMo108171a) && m199298g()) {
            if (m199299i()) {
                SharedPreferences sharedPreferences = this.f182519d.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
                if (vlq0.m198839b(strMo199297f).equals(sharedPreferences.getString(m199294j(), null))) {
                    long j = sharedPreferences.getLong(m199293h(), 0L);
                    int iM86481a = C14837ah.m86477a(this.f182519d).m86481a(EnumC14745gk.DCJobUploadRepeatedInterval.m85646a(), 604800);
                    if ((System.currentTimeMillis() - j) / 1000 < this.f182518c) {
                        return;
                    }
                    if ((System.currentTimeMillis() - j) / 1000 < iM86481a) {
                        strMo199297f = "same_" + j;
                    }
                }
            }
            C14748gn c14748gn = new C14748gn();
            c14748gn.m85653a(strMo199297f);
            c14748gn.m85651a(System.currentTimeMillis());
            c14748gn.m85652a(mo199295b());
            m199292d(this.f182519d, c14748gn, strMo108171a);
        }
    }
}
