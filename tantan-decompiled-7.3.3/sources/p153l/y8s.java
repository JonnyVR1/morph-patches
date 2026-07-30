package p153l;

import androidx.annotation.CallSuper;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.iam;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y8s<D extends oo2, V extends iam> extends i6t<D, V> {

    /* JADX INFO: renamed from: i */
    public final C22508b<uxj0> f198037i;

    public y8s(dum<? extends D> dumVar) {
        super(dumVar);
        this.f198037i = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m214775J3(uwl uwlVar) {
        if (uwlVar instanceof y8s) {
            try {
                ((y8s) uwlVar).mo96837P3();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m214776K3(uwl uwlVar) {
        if (uwlVar instanceof y8s) {
            try {
                ((y8s) uwlVar).mo96836O3();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ C22421c m214777L3(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: M3 */
    public <T> C22421c<T> m214778M3(pcj<C22421c<T>> pcjVar, boolean z) {
        return super.duringCreated(pcjVar, z).takeUntil(this.f198037i);
    }

    /* JADX INFO: renamed from: N3 */
    public <T> C22421c<T> m214779N3(final C22421c<T> c22421c) {
        return m214778M3(new pcj() { // from class: l.x8s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return y8s.m214777L3(c22421c);
            }
        }, true);
    }

    @CallSuper
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        this.f198037i.onNext(uxj0.f181467a);
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.v8s
            @Override // p153l.y20
            public final void call(Object obj) {
                y8s.m214776K3((uwl) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.w8s
            @Override // p153l.y20
            public final void call(Object obj) {
                y8s.m214775J3((uwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
    }
}
