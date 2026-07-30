package p002l;

import android.os.Bundle;
import l.e30;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iue0 extends jq2<uue0> {

    /* JADX INFO: renamed from: a */
    public String f13417a;

    public iue0(mcr mcrVar) {
        super(mcrVar);
        this.f13417a = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m15409f0(Bundle bundle) {
        ((uue0) ((jq2) this).viewModel).m23617A3(this.f13417a);
    }

    /* JADX INFO: renamed from: Z */
    public void m15410Z() {
        super.Z();
        this.f13417a = act().getIntent().getStringExtra("userId");
    }

    /* JADX INFO: renamed from: a0 */
    public void m15411a0() {
        creates(new e30() { // from class: l.hue0
            public final void call(Object obj) {
                this.f12272a.m15409f0((Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
