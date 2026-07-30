package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;

/* JADX INFO: loaded from: classes4.dex */
public class bbs extends AbstractC19290p4 {

    /* JADX INFO: renamed from: d */
    public XEGiftView f75981d;

    public <V extends oo2> bbs(las lasVar, LiveEnterRoomView liveEnterRoomView) {
        super(lasVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: e */
    private void m103308e() {
        if (this.f75981d == null) {
            XEGiftView xEGiftView = new XEGiftView(this.f150482c.getContext());
            this.f75981d = xEGiftView;
            bnl0.m105524M(xEGiftView, false);
        }
        if (this.f75981d.getParent() == null) {
            int iM105592y0 = (bnl0.m105592y0() * 200) / 375;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bnl0.f77544e, iM105592y0);
            layoutParams.topMargin = ((-iM105592y0) / 2) + qa00.m175859d(30.0f);
            this.f150482c.addView(this.f75981d, layoutParams);
        }
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: a */
    public boolean mo75456a() {
        XEGiftView xEGiftView = this.f75981d;
        return xEGiftView != null && xEGiftView.m70023f();
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: b */
    public void mo75457b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo75457b(bLiveEnterRoom);
        m103308e();
        jhe.m144897r(this.f75981d, new hre(bLiveEnterRoom.getMixResId()).m136827j(bLiveEnterRoom.dynamicEffectExtends).m136828k(bLiveEnterRoom.videoEffectExtras).m136826i(new x20() { // from class: l.abs
            @Override // p153l.x20
            public final void call() {
                this.f69649a.m103309f();
            }
        }));
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: c */
    public void mo75458c() {
        super.mo75458c();
        XEGiftView xEGiftView = this.f75981d;
        if (xEGiftView != null && xEGiftView.m70023f()) {
            this.f75981d.m70027j();
        }
        ynp0.m216920E(this.f75981d, null);
        ynp0.m216945v(this.f75981d, false);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m103309f() {
        las<?> lasVar = this.f150480a;
        if (lasVar != null) {
            lasVar.m153533R3();
        }
    }
}
