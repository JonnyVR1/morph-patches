package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.messages.AllPairsAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import l.e30;
import l.jq2;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oj0 extends jq2<pj0> {

    /* JADX INFO: renamed from: a */
    public Act f18072a;

    public oj0(Act act) {
        super(act);
        this.f18072a = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m19811e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m19814h0(Bundle bundle) {
        ((pj0) ((jq2) this).viewModel).m20453q(act().getResources().getString(R.string.h1));
        ((pj0) ((jq2) this).viewModel).m20450m();
        ((pj0) ((jq2) this).viewModel).m20449l(true, false);
        CoreModule.c.f0.Fo();
        CoreModule.c.N0.p3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m19815i0(q860 q860Var) {
        if (TextUtils.equals(this.f18072a.getIntent().getStringExtra(AllPairsAct.f3360f), AllPairsAct.f3361g)) {
            ((pj0) ((jq2) this).viewModel).m20453q("未聊配对(" + q860Var.f19068a.size() + ")");
            ((pj0) ((jq2) this).viewModel).m20452p();
        }
        ((pj0) ((jq2) this).viewModel).m20451n(q860Var);
    }

    /* JADX INFO: renamed from: a0 */
    public void m19816a0() {
        super.a0();
        creates(new e30() { // from class: l.lj0
            public final void call(Object obj) {
                this.f16181a.m19814h0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.f0.fo()).subscribe(mkd0.H(new e30() { // from class: l.mj0
            public final void call(Object obj) {
                this.f16961a.m19815i0((q860) obj);
            }
        }, new e30() { // from class: l.nj0
            public final void call(Object obj) {
                oj0.m19811e0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
