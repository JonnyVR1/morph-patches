package p149l;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes13.dex */
public class r2f {

    /* JADX INFO: renamed from: e */
    private static final ExecutorService f157401e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a */
    boolean f157402a = true;

    /* JADX INFO: renamed from: b */
    ExecutorService f157403b = f157401e;

    /* JADX INFO: renamed from: c */
    zxv f157404c;

    /* JADX INFO: renamed from: d */
    rpw f157405d;

    /* JADX INFO: renamed from: a */
    public static Object m177599a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public zxv m177600b() {
        zxv zxvVar = this.f157404c;
        return zxvVar != null ? zxvVar : zxv.C21811a.m220851a();
    }

    /* JADX INFO: renamed from: c */
    public rpw m177601c() {
        Object objM177599a;
        rpw rpwVar = this.f157405d;
        if (rpwVar != null) {
            return rpwVar;
        }
        if (!do0.m112697c() || (objM177599a = m177599a()) == null) {
            return null;
        }
        return new rpw.C19750a((Looper) objM177599a);
    }
}
