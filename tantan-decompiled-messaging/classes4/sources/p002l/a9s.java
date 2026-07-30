package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.base.view.XEGiftView;
import l.d30;
import l.t100;
import l.uep0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a9s extends AbstractC0781q4 {

    /* JADX INFO: renamed from: d */
    public XEGiftView f7469d;

    public <V extends ho2> a9s(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: e */
    private void m9460e() {
        if (this.f7469d == null) {
            XEGiftView xEGiftView = new XEGiftView(this.f17799c.getContext());
            this.f7469d = xEGiftView;
            xdl0.M(xEGiftView, false);
        }
        if (this.f7469d.getParent() == null) {
            int iY0 = (xdl0.y0() * 200) / 375;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xdl0.e, iY0);
            layoutParams.topMargin = ((-iY0) / 2) + t100.d(30.0f);
            this.f17799c.addView((View) this.f7469d, (ViewGroup.LayoutParams) layoutParams);
        }
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: a */
    public boolean mo7854a() {
        XEGiftView xEGiftView = this.f7469d;
        return xEGiftView != null && xEGiftView.f();
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: b */
    public void mo7855b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo7855b(bLiveEnterRoom);
        m9460e();
        fge.m13166r(this.f7469d, new dqe(bLiveEnterRoom.getMixResId()).m11988j(bLiveEnterRoom.dynamicEffectExtends).m11989k(bLiveEnterRoom.videoEffectExtras).m11987i(new d30() { // from class: l.z8s
            public final void call() {
                this.f23311a.m9461f();
            }
        }));
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: c */
    public void mo7856c() {
        super.mo7856c();
        XEGiftView xEGiftView = this.f7469d;
        if (xEGiftView != null && xEGiftView.f()) {
            this.f7469d.j();
        }
        uep0.E(this.f7469d, (View.OnClickListener) null);
        uep0.v(this.f7469d, false);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m9461f() {
        k8s<?> k8sVar = this.f17797a;
        if (k8sVar != null) {
            k8sVar.m16561R3();
        }
    }
}
