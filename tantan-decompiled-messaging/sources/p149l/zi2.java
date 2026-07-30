package p149l;

import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.ho2;
import p149l.vpl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zi2<D extends ho2, V extends vpl> extends h4t<D, V> {

    /* JADX INFO: renamed from: i */
    public V f203250i;

    /* JADX INFO: renamed from: j */
    public final C22393b<roj0> f203251j;

    public zi2(bsm<D> bsmVar) {
        super(bsmVar);
        this.f203251j = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: J3 */
    public <T> C22306c<T> m218909J3(C22306c<T> c22306c) {
        return duringCreated(c22306c).takeUntil(this.f203251j);
    }

    /* JADX INFO: renamed from: K3 */
    public abstract V mo75679K3();

    /* JADX INFO: renamed from: L3 */
    public void m218910L3() {
        if (this.f203250i == null) {
            this.f203250i = (V) mo75679K3();
        }
        mo51532C(this.f203250i);
        ((vpl) this.viewModel).init();
    }

    /* JADX INFO: renamed from: M3 */
    public void mo138009M3() {
        this.f203251j.onNext(roj0.f160388a);
        HashMap<String, gul> map = this.f121122b;
        if (map == null || map.isEmpty()) {
            return;
        }
        sje0.m184488f(this.f121122b);
        this.f121122b.clear();
    }

    /* JADX INFO: renamed from: N3 */
    public void mo168244N3() {
        if (isShowing()) {
            return;
        }
        ((vpl) this.viewModel).mo71722F0(false);
    }

    public boolean isShowing() {
        return NullChecker.m81303a(this.viewModel) && ((vpl) this.viewModel).isShowing();
    }
}
