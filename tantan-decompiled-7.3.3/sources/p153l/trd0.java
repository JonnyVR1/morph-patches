package p153l;

import android.os.Looper;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class trd0 {

    /* JADX INFO: renamed from: a */
    public static y20<Throwable> f175864a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m192471a(Exception exc, Object obj) {
        m192474d(exc);
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static void m192474d(Exception exc) {
        y20<Throwable> y20Var;
        if (!kmk0.f127510c || Looper.myLooper() != Looper.getMainLooper() || (y20Var = f175864a) == null || exc == null) {
            return;
        }
        y20Var.call(exc);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static <T> C22421c.d<T, T> m192475e(final f2e0 f2e0Var) {
        if (!kmk0.f127510c || f2e0Var == fo0.m126432a()) {
            return new C22421c.d() { // from class: l.qrd0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((C22421c) obj).subscribeOn(f2e0Var);
                }
            };
        }
        final Exception exc = new Exception("run in UI thread after subscribeOn(notUIThread)，Check it before ANR");
        return new C22421c.d() { // from class: l.rrd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).subscribeOn(f2e0Var).map(new qcj() { // from class: l.srd0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return trd0.m192471a(exc, obj2);
                    }
                });
            }
        };
    }
}
