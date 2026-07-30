package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BalanceOpsType;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class i8q0 extends jq2<j8q0> {

    /* JADX INFO: renamed from: a */
    public String f112063a;

    public i8q0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m134981i0(Bundle bundle) {
        ((j8q0) this.viewModel).m140336r();
        CoreModule.f17545c.f19570H0.m210367n5(this.f112063a, BalanceOpsType.withdraw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m134982j0(j760 j760Var) {
        ((j8q0) this.viewModel).m140335d((List) j760Var.f116565b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m134983k0(Throwable th) {
        ((j8q0) this.viewModel).m140335d(null);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f112063a = act().getIntent().getStringExtra("param_account_id");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.e8q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89856a.m134981i0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19570H0.m210369o5()).filter(new w9j() { // from class: l.f8q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(BalanceOpsType.withdraw.equals(((j760) obj).f116564a));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.g8q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101515a.m134982j0((j760) obj);
            }
        }, new e30() { // from class: l.h8q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106458a.m134983k0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
