package p002l;

import android.util.SparseArray;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import l.c4g0;
import l.e30;
import l.ffw;
import l.jo0;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g3f {

    /* JADX INFO: renamed from: a */
    public b<InterfaceC0581a> f10747a = b.b();

    /* JADX INFO: renamed from: b */
    public SparseArray<c4g0> f10748b = new SparseArray<>();

    /* JADX INFO: renamed from: l.g3f$a */
    public interface InterfaceC0581a {
    }

    /* JADX INFO: renamed from: l.g3f$b */
    public interface InterfaceC0582b<T extends InterfaceC0581a> {
        /* JADX INFO: renamed from: a */
        void mo13544a(T t);
    }

    /* JADX INFO: renamed from: b */
    public void m13541b(InterfaceC0581a interfaceC0581a) {
        this.f10747a.onNext(interfaceC0581a);
    }

    /* JADX INFO: renamed from: c */
    public void m13542c(w9j<InterfaceC0581a, Boolean> w9jVar, final InterfaceC0582b interfaceC0582b) {
        c cVarFilter = this.f10747a.asObservable().onBackpressureLatest().observeOn(jo0.a()).filter(w9jVar);
        Objects.requireNonNull(interfaceC0582b);
        this.f10748b.put(interfaceC0582b.hashCode(), cVarFilter.subscribe(ffw.e(new e30() { // from class: l.e3f
            public final void call(Object obj) {
                interfaceC0582b.mo13544a((g3f.InterfaceC0581a) obj);
            }
        }, new e30() { // from class: l.f3f
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: d */
    public void m13543d(InterfaceC0582b interfaceC0582b) {
        c4g0 c4g0Var = this.f10748b.get(interfaceC0582b.hashCode());
        if (c4g0Var != null) {
            if (!c4g0Var.isUnsubscribed()) {
                c4g0Var.unsubscribe();
            }
            this.f10748b.remove(interfaceC0582b.hashCode());
        }
    }
}
