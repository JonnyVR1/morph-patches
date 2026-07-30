package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.messages.AllPairsAct;

/* JADX INFO: loaded from: classes11.dex */
public class kj0 extends ar2<lj0> {

    /* JADX INFO: renamed from: a */
    public Act f127057a;

    public kj0(Act act) {
        super(act);
        this.f127057a = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m149992e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m149995h0(Bundle bundle) {
        ((lj0) this.viewModel).m154450q(act().getResources().getString(R$string.f19294h1));
        ((lj0) this.viewModel).m154447m();
        ((lj0) this.viewModel).m154446l(true, false);
        CoreModule.f18264c.f20384f0.m33653Fo();
        CoreModule.f18264c.f20330N0.m32975p3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m149996i0(vg60 vg60Var) {
        if (TextUtils.equals(this.f127057a.getIntent().getStringExtra(AllPairsAct.f25324f), AllPairsAct.f25325g)) {
            ((lj0) this.viewModel).m154450q("未聊配对(" + vg60Var.f184001a.size() + ")");
            ((lj0) this.viewModel).m154449p();
        }
        ((lj0) this.viewModel).m154448n(vg60Var);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.hj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110107a.m149995h0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20384f0.m33963fo()).subscribe(psd0.m173597H(new y20() { // from class: l.ij0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115161a.m149996i0((vg60) obj);
            }
        }, new y20() { // from class: l.jj0
            @Override // p153l.y20
            public final void call(Object obj) {
                kj0.m149992e0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
