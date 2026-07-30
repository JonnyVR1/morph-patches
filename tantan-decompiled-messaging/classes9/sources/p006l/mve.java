package p006l;

import android.os.Bundle;
import android.view.View;
import l.e30;
import l.jq2;
import l.mcr;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mve extends jq2<nve> {

    /* JADX INFO: renamed from: a */
    public String f17311a;

    public mve(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m19523g0(Bundle bundle) {
        ((nve) ((jq2) this).viewModel).m20228r();
    }

    /* JADX INFO: renamed from: Z */
    public void m19524Z() {
        super.Z();
        this.f17311a = act().getIntent().getStringExtra("verify_email");
    }

    /* JADX INFO: renamed from: a0 */
    public void m19525a0() {
        creates(new e30() { // from class: l.kve
            public final void call(Object obj) {
                this.f16007a.m19523g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m19526h0(View view) {
        zvf0.r("e_download_data_submit_success_resend_button", "p_download_data_submit_success_view");
        act().setResult(-1);
        act().finish();
    }

    /* JADX INFO: renamed from: i0 */
    public View.OnClickListener m19527i0() {
        return new View.OnClickListener() { // from class: l.lve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16673a.m19526h0(view);
            }
        };
    }

    public void destroy() {
    }
}
