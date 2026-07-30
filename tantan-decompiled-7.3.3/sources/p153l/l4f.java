package p153l;

import android.util.SparseArray;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes5.dex */
public class l4f {

    /* JADX INFO: renamed from: a */
    public C22508b<InterfaceC18342a> f129968a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public SparseArray<kcg0> f129969b = new SparseArray<>();

    /* JADX INFO: renamed from: l.l4f$a */
    public interface InterfaceC18342a {
    }

    /* JADX INFO: renamed from: l.l4f$b */
    public interface InterfaceC18343b<T extends InterfaceC18342a> {
        /* JADX INFO: renamed from: a */
        void mo132882a(T t);
    }

    /* JADX INFO: renamed from: b */
    public void m152762b(InterfaceC18342a interfaceC18342a) {
        this.f129968a.onNext(interfaceC18342a);
    }

    /* JADX INFO: renamed from: c */
    public void m152763c(qcj<InterfaceC18342a, Boolean> qcjVar, final InterfaceC18343b interfaceC18343b) {
        C22421c<InterfaceC18342a> c22421cFilter = this.f129968a.asObservable().onBackpressureLatest().observeOn(fo0.m126432a()).filter(qcjVar);
        Objects.requireNonNull(interfaceC18343b);
        this.f129969b.put(interfaceC18343b.hashCode(), c22421cFilter.subscribe(dhw.m115826e(new y20() { // from class: l.j4f
            @Override // p153l.y20
            public final void call(Object obj) {
                interfaceC18343b.mo132882a((l4f.InterfaceC18342a) obj);
            }
        }, new y20() { // from class: l.k4f
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: d */
    public void m152764d(InterfaceC18343b interfaceC18343b) {
        kcg0 kcg0Var = this.f129969b.get(interfaceC18343b.hashCode());
        if (kcg0Var != null) {
            if (!kcg0Var.isUnsubscribed()) {
                kcg0Var.unsubscribe();
            }
            this.f129969b.remove(interfaceC18343b.hashCode());
        }
    }
}
