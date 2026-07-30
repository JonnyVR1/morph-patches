package p149l;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.view.VoiceVirtualLovePlanetWidgetView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class xcw extends up2<VoiceVirtualLovePlanetWidgetView, j4p0> {

    /* JADX INFO: renamed from: h */
    public a0m0 f192281h;

    public xcw(bsm<? extends nnn0> bsmVar, a0m0 a0m0Var) {
        super(bsmVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.lovePlanet));
        this.f192281h = a0m0Var;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: g */
    public int mo105616g() {
        return t6c0.f168174Ra;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: o */
    public void mo105618o() {
        super.mo105618o();
        if (NullChecker.m81303a(this.f192281h.getCurrentMotionType())) {
            ((VoiceVirtualLovePlanetWidgetView) this.f177564c).m77209o0();
        }
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: p */
    public void mo105619p() {
        super.mo105619p();
        if (NullChecker.m81303a(this.f192281h.getCurrentMotionType())) {
            ((VoiceVirtualLovePlanetWidgetView) this.f177564c).m77211t0();
        }
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: r */
    public void mo194596r(ViewGroup viewGroup) {
        super.mo194596r(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0220a) {
            ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) layoutParams;
            ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = t100.m186890d(12.0f);
            ((ViewGroup.MarginLayoutParams) c0220a).topMargin = t100.m186890d(10.0f);
        }
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public j4p0 mo105617h() {
        return new j4p0(this.f177562a);
    }
}
