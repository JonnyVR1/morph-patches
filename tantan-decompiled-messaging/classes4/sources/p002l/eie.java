package p002l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.tantanapp.common.utils.NullChecker;
import l.bwr;
import l.e30;
import l.ffw;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eie<D extends ho2> extends qj2<D, gie> {
    public eie(bsm<D> bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        C(new gie(frameLayout));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m12559W3(VoiceSweet.VoiceSweetCpAnimation voiceSweetCpAnimation) {
        if (NullChecker.a(voiceSweetCpAnimation) && voiceSweetCpAnimation.getType() == VoiceSweet.VoiceSweetCpAnimation.Type.upgrade) {
            ((gie) ((bwr) this).viewModel).m13826j(voiceSweetCpAnimation);
        }
    }

    @Override // p002l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo10687T3() {
        return ((gie) ((bwr) this).viewModel).f11450b;
    }

    /* JADX INFO: renamed from: t */
    public void m12560t() {
        super.t();
        duringCreated(m25547E2().m14596q1().N0).subscribe(ffw.h(new e30() { // from class: l.die
            public final void call(Object obj) {
                this.f9288a.m12559W3((VoiceSweet.VoiceSweetCpAnimation) obj);
            }
        }));
    }
}
