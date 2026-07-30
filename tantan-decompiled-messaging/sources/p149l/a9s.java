package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;

/* JADX INFO: loaded from: classes4.dex */
public class a9s extends AbstractC19426q4 {

    /* JADX INFO: renamed from: d */
    public XEGiftView f68199d;

    public <V extends ho2> a9s(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: e */
    private void m95451e() {
        if (this.f68199d == null) {
            XEGiftView xEGiftView = new XEGiftView(this.f152530c.getContext());
            this.f68199d = xEGiftView;
            xdl0.m208344M(xEGiftView, false);
        }
        if (this.f68199d.getParent() == null) {
            int iM208412y0 = (xdl0.m208412y0() * 200) / 375;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xdl0.f192403e, iM208412y0);
            layoutParams.topMargin = ((-iM208412y0) / 2) + t100.m186890d(30.0f);
            this.f152530c.addView(this.f68199d, layoutParams);
        }
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: a */
    public boolean mo74273a() {
        XEGiftView xEGiftView = this.f68199d;
        return xEGiftView != null && xEGiftView.m68840f();
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: b */
    public void mo74274b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo74274b(bLiveEnterRoom);
        m95451e();
        fge.m121214r(this.f68199d, new dqe(bLiveEnterRoom.getMixResId()).m113016j(bLiveEnterRoom.dynamicEffectExtends).m113017k(bLiveEnterRoom.videoEffectExtras).m113015i(new d30() { // from class: l.z8s
            @Override // p149l.d30
            public final void call() {
                this.f202200a.m95452f();
            }
        }));
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: c */
    public void mo74275c() {
        super.mo74275c();
        XEGiftView xEGiftView = this.f68199d;
        if (xEGiftView != null && xEGiftView.m68840f()) {
            this.f68199d.m68844j();
        }
        uep0.m193310E(this.f68199d, null);
        uep0.m193335v(this.f68199d, false);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m95452f() {
        k8s<?> k8sVar = this.f152528a;
        if (k8sVar != null) {
            k8sVar.m144963R3();
        }
    }
}
