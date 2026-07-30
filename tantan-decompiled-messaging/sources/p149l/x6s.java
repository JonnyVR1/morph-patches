package p149l;

import androidx.annotation.CallSuper;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.ho2;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x6s<D extends ho2, V extends s7m> extends h4t<D, V> {

    /* JADX INFO: renamed from: i */
    public final C22393b<roj0> f191268i;

    public x6s(bsm<? extends D> bsmVar) {
        super(bsmVar);
        this.f191268i = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m207195J3(gul gulVar) {
        if (gulVar instanceof x6s) {
            try {
                ((x6s) gulVar).mo99576P3();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m207196K3(gul gulVar) {
        if (gulVar instanceof x6s) {
            try {
                ((x6s) gulVar).mo94471O3();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ C22306c m207197L3(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: M3 */
    public <T> C22306c<T> m207198M3(v9j<C22306c<T>> v9jVar, boolean z) {
        return super.duringCreated(v9jVar, z).takeUntil(this.f191268i);
    }

    /* JADX INFO: renamed from: N3 */
    public <T> C22306c<T> m207199N3(final C22306c<T> c22306c) {
        return m207198M3(new v9j() { // from class: l.w6s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return x6s.m207197L3(c22306c);
            }
        }, true);
    }

    @CallSuper
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        this.f191268i.onNext(roj0.f160388a);
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.u6s
            @Override // p149l.e30
            public final void call(Object obj) {
                x6s.m207196K3((gul) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.v6s
            @Override // p149l.e30
            public final void call(Object obj) {
                x6s.m207195J3((gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
    }
}
