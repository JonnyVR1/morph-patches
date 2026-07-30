package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class xpa0 extends ar2<zpa0> {
    public xpa0(Act act) {
        super(act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m212642f0(Bundle bundle) {
        ((zpa0) this.viewModel).m220829d((LoopInputType) act().getIntent().getSerializableExtra("loop_create_tag_info"));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.wpa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190276a.m212642f0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
