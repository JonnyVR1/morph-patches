package p153l;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.view.VoiceVirtualLovePlanetWidgetView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class vew extends lq2<VoiceVirtualLovePlanetWidgetView, ndp0> {

    /* JADX INFO: renamed from: h */
    public e9m0 f183854h;

    public vew(dum<? extends rwn0> dumVar, e9m0 e9m0Var) {
        super(dumVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.lovePlanet));
        this.f183854h = e9m0Var;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: g */
    public int mo129542g() {
        return yec0.f198906Ra;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: o */
    public void mo129545o() {
        super.mo129545o();
        if (NullChecker.m82486a(this.f183854h.getCurrentMotionType())) {
            ((VoiceVirtualLovePlanetWidgetView) this.f133137c).m78392o0();
        }
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: p */
    public void mo129546p() {
        super.mo129546p();
        if (NullChecker.m82486a(this.f183854h.getCurrentMotionType())) {
            ((VoiceVirtualLovePlanetWidgetView) this.f133137c).m78394t0();
        }
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: r */
    public void mo146834r(ViewGroup viewGroup) {
        super.mo146834r(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0221a) {
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
            ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = qa00.m175859d(12.0f);
            ((ViewGroup.MarginLayoutParams) c0221a).topMargin = qa00.m175859d(10.0f);
        }
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ndp0 mo129543h() {
        return new ndp0(this.f133135a);
    }
}
