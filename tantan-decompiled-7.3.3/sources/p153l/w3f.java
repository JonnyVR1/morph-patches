package p153l;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public class w3f {

    /* JADX INFO: renamed from: e */
    private static final ExecutorService f187131e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a */
    boolean f187132a = true;

    /* JADX INFO: renamed from: b */
    ExecutorService f187133b = f187131e;

    /* JADX INFO: renamed from: c */
    wzv f187134c;

    /* JADX INFO: renamed from: d */
    qsw f187135d;

    /* JADX INFO: renamed from: a */
    public static Object m204764a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public wzv m204765b() {
        wzv wzvVar = this.f187134c;
        return wzvVar != null ? wzvVar : wzv.C21217a.m208769a();
    }

    /* JADX INFO: renamed from: c */
    public qsw m204766c() {
        Object objM204764a;
        qsw qswVar = this.f187135d;
        if (qswVar != null) {
            return qswVar;
        }
        if (!zn0.m220572c() || (objM204764a = m204764a()) == null) {
            return null;
        }
        return new qsw.C19649a((Looper) objM204764a);
    }
}
