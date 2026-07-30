package p153l;

import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: renamed from: l.tq */
/* JADX INFO: loaded from: classes9.dex */
public class C20377tq extends ar2<C20620uq> {

    /* JADX INFO: renamed from: a */
    public boolean f175668a;

    public C20377tq(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m192224g0(Bundle bundle) {
        ((C20620uq) this.viewModel).m197197r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f175668a = act().getIntent().getBooleanExtra("hasContract", false);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.rq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164417a.m192224g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m192225h0(View view) {
        ((C20620uq) this.viewModel).getAct().startActivity(CoreModule.m30929H().mo29167kg(act(), false));
    }

    /* JADX INFO: renamed from: i0 */
    public View.OnClickListener m192226i0() {
        return new View.OnClickListener() { // from class: l.sq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170122a.m192225h0(view);
            }
        };
    }

    /* JADX INFO: renamed from: j0 */
    public void m192227j0() {
        ((C20620uq) this.viewModel).m197196c();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
