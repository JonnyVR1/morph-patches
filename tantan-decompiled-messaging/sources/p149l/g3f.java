package p149l;

import android.util.SparseArray;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class g3f {

    /* JADX INFO: renamed from: a */
    public C22393b<InterfaceC16988a> f100459a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public SparseArray<c4g0> f100460b = new SparseArray<>();

    /* JADX INFO: renamed from: l.g3f$a */
    public interface InterfaceC16988a {
    }

    /* JADX INFO: renamed from: l.g3f$b */
    public interface InterfaceC16989b<T extends InterfaceC16988a> {
        /* JADX INFO: renamed from: a */
        void mo124265a(T t);
    }

    /* JADX INFO: renamed from: b */
    public void m124262b(InterfaceC16988a interfaceC16988a) {
        this.f100459a.onNext(interfaceC16988a);
    }

    /* JADX INFO: renamed from: c */
    public void m124263c(w9j<InterfaceC16988a, Boolean> w9jVar, final InterfaceC16989b interfaceC16989b) {
        C22306c<InterfaceC16988a> c22306cFilter = this.f100459a.asObservable().onBackpressureLatest().observeOn(jo0.m142408a()).filter(w9jVar);
        Objects.requireNonNull(interfaceC16989b);
        this.f100460b.put(interfaceC16989b.hashCode(), c22306cFilter.subscribe(ffw.m121194e(new e30() { // from class: l.e3f
            @Override // p149l.e30
            public final void call(Object obj) {
                interfaceC16989b.mo124265a((g3f.InterfaceC16988a) obj);
            }
        }, new e30() { // from class: l.f3f
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: d */
    public void m124264d(InterfaceC16989b interfaceC16989b) {
        c4g0 c4g0Var = this.f100460b.get(interfaceC16989b.hashCode());
        if (c4g0Var != null) {
            if (!c4g0Var.isUnsubscribed()) {
                c4g0Var.unsubscribe();
            }
            this.f100460b.remove(interfaceC16989b.hashCode());
        }
    }
}
