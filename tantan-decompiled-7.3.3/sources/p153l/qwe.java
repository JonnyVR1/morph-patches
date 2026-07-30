package p153l;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class qwe extends ar2<rwe> {

    /* JADX INFO: renamed from: a */
    public String f159884a;

    public qwe(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m178473g0(Bundle bundle) {
        ((rwe) this.viewModel).m183355r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f159884a = act().getIntent().getStringExtra("verify_email");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.owe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149476a.m178473g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m178474h0(View view) {
        i4g0.m138520r("e_download_data_submit_success_resend_button", "p_download_data_submit_success_view");
        act().setResult(-1);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: i0 */
    public View.OnClickListener m178475i0() {
        return new View.OnClickListener() { // from class: l.pwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154397a.m178474h0(view);
            }
        };
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
