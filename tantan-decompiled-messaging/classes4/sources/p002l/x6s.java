package p002l;

import androidx.annotation.CallSuper;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import l.e30;
import l.gul;
import l.k4t;
import l.roj0;
import l.s7m;
import l.v9j;
import l.vwb;
import p002l.ho2;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class x6s<D extends ho2, V extends s7m> extends h4t<D, V> {

    /* JADX INFO: renamed from: i */
    public final b<roj0> f22148i;

    public x6s(bsm<? extends D> bsmVar) {
        super(bsmVar);
        this.f22148i = b.b();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m25703J3(gul gulVar) {
        if (gulVar instanceof x6s) {
            try {
                ((x6s) gulVar).mo10254P3();
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m25704K3(gul gulVar) {
        if (gulVar instanceof x6s) {
            try {
                ((x6s) gulVar).mo9256O3();
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ c m25705L3(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: M3 */
    public <T> c<T> m25706M3(v9j<c<T>> v9jVar, boolean z) {
        return super/*l.bwr*/.duringCreated(v9jVar, z).takeUntil(this.f22148i);
    }

    /* JADX INFO: renamed from: N3 */
    public <T> c<T> m25707N3(final c<T> cVar) {
        return m25706M3(new v9j() { // from class: l.w6s
            public final Object call() {
                return x6s.m25705L3(cVar);
            }
        }, true);
    }

    @CallSuper
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        this.f22148i.onNext(roj0.a);
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return;
        }
        vwb.z(map.values(), new e30() { // from class: l.u6s
            public final void call(Object obj) {
                x6s.m25704K3((gul) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return;
        }
        vwb.z(map.values(), new e30() { // from class: l.v6s
            public final void call(Object obj) {
                x6s.m25703J3((gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void mo9823R3() {
    }
}
