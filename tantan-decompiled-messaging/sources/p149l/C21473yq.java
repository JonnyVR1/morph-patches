package p149l;

import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: renamed from: l.yq */
/* JADX INFO: loaded from: classes8.dex */
public class C21473yq extends jq2<C21755zq> {

    /* JADX INFO: renamed from: a */
    public boolean f199512a;

    public C21473yq(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m215689g0(Bundle bundle) {
        ((C21755zq) this.viewModel).m219817r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f199512a = act().getIntent().getBooleanExtra("hasContract", false);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.wq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187597a.m215689g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m215690h0(View view) {
        ((C21755zq) this.viewModel).getAct().startActivity(CoreModule.m29931H().mo28168kg(act(), false));
    }

    /* JADX INFO: renamed from: i0 */
    public View.OnClickListener m215691i0() {
        return new View.OnClickListener() { // from class: l.xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193972a.m215690h0(view);
            }
        };
    }

    /* JADX INFO: renamed from: j0 */
    public void m215692j0() {
        ((C21755zq) this.viewModel).m219816c();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
