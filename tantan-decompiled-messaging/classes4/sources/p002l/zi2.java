package p002l;

import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.bwr;
import l.k4t;
import l.roj0;
import l.sje0;
import p002l.ho2;
import p002l.vpl;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class zi2<D extends ho2, V extends vpl> extends h4t<D, V> {

    /* JADX INFO: renamed from: i */
    public V f23436i;

    /* JADX INFO: renamed from: j */
    public final b<roj0> f23437j;

    public zi2(bsm<D> bsmVar) {
        super(bsmVar);
        this.f23437j = b.b();
    }

    /* JADX INFO: renamed from: J3 */
    public <T> c<T> m27393J3(c<T> cVar) {
        return duringCreated(cVar).takeUntil(this.f23437j);
    }

    /* JADX INFO: renamed from: K3 */
    public abstract V mo15345K3();

    /* JADX INFO: renamed from: L3 */
    public void m27394L3() {
        if (this.f23436i == null) {
            this.f23436i = (V) mo15345K3();
        }
        C(this.f23436i);
        ((vpl) ((bwr) this).viewModel).init();
    }

    /* JADX INFO: renamed from: M3 */
    public void mo15348M3() {
        this.f23437j.onNext(roj0.a);
        HashMap map = ((k4t) this).b;
        if (map == null || map.isEmpty()) {
            return;
        }
        sje0.f(((k4t) this).b);
        ((k4t) this).b.clear();
    }

    /* JADX INFO: renamed from: N3 */
    public void m27395N3() {
        if (isShowing()) {
            return;
        }
        ((vpl) ((bwr) this).viewModel).mo5089F0(false);
    }

    public boolean isShowing() {
        return NullChecker.a(((bwr) this).viewModel) && ((vpl) ((bwr) this).viewModel).isShowing();
    }
}
