package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class tha0 extends jq2<vha0> {
    public tha0(Act act) {
        super(act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m188879f0(Bundle bundle) {
        ((vha0) this.viewModel).m198425d((LoopInputType) act().getIntent().getSerializableExtra("loop_create_tag_info"));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.sha0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164535a.m188879f0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
