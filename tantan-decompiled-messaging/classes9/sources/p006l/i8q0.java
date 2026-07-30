package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class i8q0 extends jq2<j8q0> {

    /* JADX INFO: renamed from: a */
    public String f14314a;

    public i8q0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m16518i0(Bundle bundle) {
        ((j8q0) ((jq2) this).viewModel).m17398r();
        CoreModule.f1534c.f3559H0.m27542n5(this.f14314a, "withdraw");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m16519j0(j760 j760Var) {
        ((j8q0) ((jq2) this).viewModel).m17396d((List) j760Var.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m16520k0(Throwable th) {
        ((j8q0) ((jq2) this).viewModel).m17396d(null);
    }

    /* JADX INFO: renamed from: Z */
    public void m16521Z() {
        super.Z();
        this.f14314a = act().getIntent().getStringExtra("param_account_id");
    }

    /* JADX INFO: renamed from: a0 */
    public void m16522a0() {
        super.a0();
        creates(new e30() { // from class: l.e8q0
            public final void call(Object obj) {
                this.f10851a.m16518i0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f1534c.f3559H0.m27544o5()).filter(new w9j() { // from class: l.f8q0
            public final Object call(Object obj) {
                return Boolean.valueOf("withdraw".equals(((j760) obj).a));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.g8q0
            public final void call(Object obj) {
                this.f13108a.m16519j0((j760) obj);
            }
        }, new e30() { // from class: l.h8q0
            public final void call(Object obj) {
                this.f13745a.m16520k0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
