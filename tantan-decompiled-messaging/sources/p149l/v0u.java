package p149l;

import android.util.Pair;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashSet;
import p133rx.C22306c;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public class v0u<V extends s7m> extends lss<V> {

    /* JADX INFO: renamed from: f */
    public final C22306c<Boolean> f179142f;

    public v0u(mcr mcrVar, C22306c<Boolean> c22306c, mss mssVar) {
        super(mcrVar, mssVar);
        this.f179142f = c22306c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ Pair m196513P2(j760 j760Var) {
        Pair pair = (Pair) j760Var.f116564a;
        return new Pair((Boolean) pair.first, Boolean.valueOf(((Boolean) pair.second).booleanValue() && ((Boolean) j760Var.f116565b).booleanValue()));
    }

    /* JADX INFO: renamed from: Q2 */
    public void m196514Q2() {
        mo69117n();
    }

    /* JADX INFO: renamed from: R2 */
    public void m196515R2() {
        for (gul gulVar : new HashSet(this.f121122b.values())) {
            if (gulVar instanceof lss) {
                try {
                    ((lss) gulVar).mo122936M2();
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: S2 */
    public void m196516S2() {
        mo70198T();
    }

    @Override // p149l.bwr, p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar, boolean z) {
        return mkd0.m154952D(v9jVar, mkd0.m154984r(this.lifecycleProviderImpl.lifecycle().compose(bwr.m104248p2()), this.f179142f, new xsu()).map(new w9j() { // from class: l.u0u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return v0u.m196513P2((j760) obj);
            }
        }).takeUntil(this.endSubscribeSignal), z);
    }
}
