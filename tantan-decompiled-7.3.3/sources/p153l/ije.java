package p153l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.tantanapp.common.utils.NullChecker;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class ije<D extends oo2> extends yj2<D, kje> {
    public ije(dum<D> dumVar, FrameLayout frameLayout) {
        super(dumVar);
        mo52715C(new kje(frameLayout));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m140190W3(VoiceSweet.VoiceSweetCpAnimation voiceSweetCpAnimation) {
        if (NullChecker.m82486a(voiceSweetCpAnimation) && voiceSweetCpAnimation.getType() == VoiceSweet.VoiceSweetCpAnimation.Type.upgrade) {
            ((kje) this.viewModel).m150033j(voiceSweetCpAnimation);
        }
    }

    @Override // p153l.yj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo130467T3() {
        return ((kje) this.viewModel).f127092b;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().f71654N0).subscribe(dhw.m115829h(new y20() { // from class: l.hje
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110183a.m140190W3((VoiceSweet.VoiceSweetCpAnimation) obj);
            }
        }));
    }
}
