package p153l;

import android.util.Pair;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashSet;
import p137rx.C22421c;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public class w2u<V extends iam> extends mus<V> {

    /* JADX INFO: renamed from: f */
    public final C22421c<Boolean> f186943f;

    public w2u(ner nerVar, C22421c<Boolean> c22421c, nus nusVar) {
        super(nerVar, nusVar);
        this.f186943f = c22421c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ Pair m204600P2(pf60 pf60Var) {
        Pair pair = (Pair) pf60Var.f152156a;
        return new Pair((Boolean) pair.first, Boolean.valueOf(((Boolean) pair.second).booleanValue() && ((Boolean) pf60Var.f152157b).booleanValue()));
    }

    /* JADX INFO: renamed from: Q2 */
    public void m204601Q2() {
        mo70300n();
    }

    /* JADX INFO: renamed from: R2 */
    public void m204602R2() {
        for (uwl uwlVar : new HashSet(this.f130285b.values())) {
            if (uwlVar instanceof mus) {
                try {
                    ((mus) uwlVar).mo160242M2();
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: S2 */
    public void m204603S2() {
        mo71381T();
    }

    @Override // p153l.cyr, p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar, boolean z) {
        return psd0.m173593D(pcjVar, psd0.m173625r(this.lifecycleProviderImpl.lifecycle().compose(cyr.m113229p2()), this.f186943f, new yuu()).map(new qcj() { // from class: l.v2u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w2u.m204600P2((pf60) obj);
            }
        }).takeUntil(this.endSubscribeSignal), z);
    }
}
