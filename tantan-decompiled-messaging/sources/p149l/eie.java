package p149l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.tantanapp.common.utils.NullChecker;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class eie<D extends ho2> extends qj2<D, gie> {
    public eie(bsm<D> bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        mo51532C(new gie(frameLayout));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m116673W3(VoiceSweet.VoiceSweetCpAnimation voiceSweetCpAnimation) {
        if (NullChecker.m81303a(voiceSweetCpAnimation) && voiceSweetCpAnimation.getType() == VoiceSweet.VoiceSweetCpAnimation.Type.upgrade) {
            ((gie) this.viewModel).m126288j(voiceSweetCpAnimation);
        }
    }

    @Override // p149l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo104532T3() {
        return ((gie) this.viewModel).f102887b;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().f170387N0).subscribe(ffw.m121197h(new e30() { // from class: l.die
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86379a.m116673W3((VoiceSweet.VoiceSweetCpAnimation) obj);
            }
        }));
    }
}
