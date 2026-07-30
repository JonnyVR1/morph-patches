package p006l;

import android.os.Bundle;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bvk0 extends jq2<evk0> {

    /* JADX INFO: renamed from: a */
    public Act f9109a;

    /* JADX INFO: renamed from: b */
    public String f9110b;

    public bvk0(mcr mcrVar, Act act) {
        super(mcrVar);
        this.f9109a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m12903f0(Bundle bundle) {
        ((evk0) ((jq2) this).viewModel).m14903r();
    }

    /* JADX INFO: renamed from: Z */
    public void m12904Z() {
        super.Z();
        Bundle extras = this.f9109a.getIntent().getExtras();
        if (extras == null) {
            this.f9109a.finish();
        } else {
            this.f9110b = extras.getString("from");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m12905a0() {
        super.a0();
        creates(new e30() { // from class: l.avk0
            public final void call(Object obj) {
                this.f8557a.m12903f0((Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
