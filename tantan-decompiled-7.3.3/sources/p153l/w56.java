package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class w56 extends ar2<b66> {
    public w56(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m204957g0(Bundle bundle) {
        ((b66) this.viewModel).m102694c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m204958h0(pf60 pf60Var) {
        S s;
        F f = pf60Var.f152156a;
        if (f == 0 || (s = pf60Var.f152157b) == 0) {
            return;
        }
        ((b66) this.viewModel).m102693b(((vg60) f).f184001a, ((List) s).size() > 0);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.t56
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172183a.m204957g0((Bundle) obj);
            }
        });
        this.lifecycleProviderImpl.duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m34167vn(), CoreModule.f18264c.f20384f0.m34103qo(), new rcj() { // from class: l.u56
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((vg60) obj, (List) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.v56
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182479a.m204958h0((pf60) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
