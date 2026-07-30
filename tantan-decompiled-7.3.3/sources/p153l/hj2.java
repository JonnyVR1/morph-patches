package p153l;

import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.isl;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hj2<D extends oo2, V extends isl> extends i6t<D, V> {

    /* JADX INFO: renamed from: i */
    public V f110147i;

    /* JADX INFO: renamed from: j */
    public final C22508b<uxj0> f110148j;

    public hj2(dum<D> dumVar) {
        super(dumVar);
        this.f110148j = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: J3 */
    public <T> C22421c<T> m135318J3(C22421c<T> c22421c) {
        return duringCreated(c22421c).takeUntil(this.f110148j);
    }

    /* JADX INFO: renamed from: K3 */
    public abstract V mo76862K3();

    /* JADX INFO: renamed from: L3 */
    public void m135319L3() {
        if (this.f110147i == null) {
            this.f110147i = (V) mo76862K3();
        }
        mo52715C(this.f110147i);
        ((isl) this.viewModel).init();
    }

    /* JADX INFO: renamed from: M3 */
    public void mo135320M3() {
        this.f110148j.onNext(uxj0.f181467a);
        HashMap<String, uwl> map = this.f130285b;
        if (map == null || map.isEmpty()) {
            return;
        }
        xre0.m212823f(this.f130285b);
        this.f130285b.clear();
    }

    /* JADX INFO: renamed from: N3 */
    public void mo135321N3() {
        if (isShowing()) {
            return;
        }
        ((isl) this.viewModel).mo72905F0(false);
    }

    public boolean isShowing() {
        return NullChecker.m82486a(this.viewModel) && ((isl) this.viewModel).isShowing();
    }
}
