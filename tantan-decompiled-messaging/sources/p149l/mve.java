package p149l;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class mve extends jq2<nve> {

    /* JADX INFO: renamed from: a */
    public String f135896a;

    public mve(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m156483g0(Bundle bundle) {
        ((nve) this.viewModel).m161595r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f135896a = act().getIntent().getStringExtra("verify_email");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.kve
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124765a.m156483g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m156484h0(View view) {
        zvf0.m220396r("e_download_data_submit_success_resend_button", "p_download_data_submit_success_view");
        act().setResult(-1);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: i0 */
    public View.OnClickListener m156485i0() {
        return new View.OnClickListener() { // from class: l.lve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130154a.m156484h0(view);
            }
        };
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
