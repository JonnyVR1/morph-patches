package p007l;

import android.os.Bundle;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;

/* JADX INFO: renamed from: l.yq */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0799yq extends jq2<C0809zq> {

    /* JADX INFO: renamed from: a */
    public boolean f5459a;

    public C0799yq(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m11954g0(Bundle bundle) {
        ((C0809zq) this.viewModel).m12036r();
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo9553Z() {
        super.mo9553Z();
        this.f5459a = act().getIntent().getBooleanExtra("hasContract", false);
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.wq
            public final void call(Object obj) {
                this.f5049a.m11954g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m11955h0(View view) {
        ((C0809zq) this.viewModel).act().startActivity(CoreModule.H().kg(act(), false));
    }

    /* JADX INFO: renamed from: i0 */
    public View.OnClickListener m11956i0() {
        return new View.OnClickListener() { // from class: l.xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5361a.m11955h0(view);
            }
        };
    }

    /* JADX INFO: renamed from: j0 */
    public void m11957j0() {
        ((C0809zq) this.viewModel).m12035c();
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
