package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.jq2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tha0 extends jq2<vha0> {
    public tha0(Act act) {
        super(act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m22960f0(Bundle bundle) {
        ((vha0) ((jq2) this).viewModel).m23949d((LoopInputType) act().getIntent().getSerializableExtra("loop_create_tag_info"));
    }

    /* JADX INFO: renamed from: a0 */
    public void m22961a0() {
        super.a0();
        creates(new e30() { // from class: l.sha0
            public final void call(Object obj) {
                this.f19019a.m22960f0((Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
