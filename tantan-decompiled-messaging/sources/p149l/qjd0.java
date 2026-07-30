package p149l;

import android.os.Looper;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class qjd0 {

    /* JADX INFO: renamed from: a */
    public static e30<Throwable> f154919a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m174989a(Exception exc, Object obj) {
        m174992d(exc);
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static void m174992d(Exception exc) {
        e30<Throwable> e30Var;
        if (!edk0.f90613c || Looper.myLooper() != Looper.getMainLooper() || (e30Var = f154919a) == null || exc == null) {
            return;
        }
        e30Var.call(exc);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static <T> C22306c.d<T, T> m174993e(final bud0 bud0Var) {
        if (!edk0.f90613c || bud0Var == jo0.m142408a()) {
            return new C22306c.d() { // from class: l.njd0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((C22306c) obj).subscribeOn(bud0Var);
                }
            };
        }
        final Exception exc = new Exception("run in UI thread after subscribeOn(notUIThread)，Check it before ANR");
        return new C22306c.d() { // from class: l.ojd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).subscribeOn(bud0Var).map(new w9j() { // from class: l.pjd0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return qjd0.m174989a(exc, obj2);
                    }
                });
            }
        };
    }
}
