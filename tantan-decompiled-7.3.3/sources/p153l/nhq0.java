package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BalanceOpsType;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class nhq0 extends ar2<ohq0> {

    /* JADX INFO: renamed from: a */
    public String f142051a;

    public nhq0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m163175i0(Bundle bundle) {
        ((ohq0) this.viewModel).m167717r();
        CoreModule.f18264c.f20312H0.m155455n5(this.f142051a, BalanceOpsType.withdraw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m163176j0(pf60 pf60Var) {
        ((ohq0) this.viewModel).m167716d((List) pf60Var.f152157b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m163177k0(Throwable th) {
        ((ohq0) this.viewModel).m167716d(null);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f142051a = act().getIntent().getStringExtra("param_account_id");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.jhq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120996a.m163175i0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20312H0.m155457o5()).filter(new qcj() { // from class: l.khq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(BalanceOpsType.withdraw.equals(((pf60) obj).f152156a));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.lhq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132128a.m163176j0((pf60) obj);
            }
        }, new y20() { // from class: l.mhq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136869a.m163177k0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
