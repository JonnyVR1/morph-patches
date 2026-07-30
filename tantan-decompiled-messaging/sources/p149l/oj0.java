package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.messages.AllPairsAct;

/* JADX INFO: loaded from: classes11.dex */
public class oj0 extends jq2<pj0> {

    /* JADX INFO: renamed from: a */
    public Act f144210a;

    public oj0(Act act) {
        super(act);
        this.f144210a = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m164584e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m164587h0(Bundle bundle) {
        ((pj0) this.viewModel).m169780q(act().getResources().getString(R$string.f18564h1));
        ((pj0) this.viewModel).m169777m();
        ((pj0) this.viewModel).m169776l(true, false);
        CoreModule.f17545c.f19642f0.m32650Fo();
        CoreModule.f17545c.f19588N0.m31972p3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m164588i0(q860 q860Var) {
        if (TextUtils.equals(this.f144210a.getIntent().getStringExtra(AllPairsAct.f24582f), AllPairsAct.f24583g)) {
            ((pj0) this.viewModel).m169780q("未聊配对(" + q860Var.f153135a.size() + ")");
            ((pj0) this.viewModel).m169779p();
        }
        ((pj0) this.viewModel).m169778n(q860Var);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.lj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128273a.m164587h0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19642f0.m32960fo()).subscribe(mkd0.m154956H(new e30() { // from class: l.mj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134086a.m164588i0((q860) obj);
            }
        }, new e30() { // from class: l.nj0
            @Override // p149l.e30
            public final void call(Object obj) {
                oj0.m164584e0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
