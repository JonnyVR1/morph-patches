package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;

/* JADX INFO: loaded from: classes4.dex */
public class wis {

    /* JADX INFO: renamed from: a */
    public XEGiftView f186566a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f186567b;

    /* JADX INFO: renamed from: c */
    public final void m203350c(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f186567b = liveGiftExtLayer;
        if (this.f186566a == null) {
            this.f186566a = new XEGiftView(frameLayout.getContext());
        }
        if (this.f186566a.getParent() == null) {
            XEGiftView xEGiftView = this.f186566a;
            int i = xdl0.f192403e;
            frameLayout.addView(xEGiftView, i, i);
            xdl0.m208344M(this.f186566a, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m203351d(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        wrj.m205207N(bLiveEffect, giftTrayData);
        this.f186567b.m73624a();
        nqe.m160615u(giftTrayData, true, z);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m203352e(GiftTrayData giftTrayData, boolean z) {
        this.f186567b.m73624a();
        nqe.m160615u(giftTrayData, false, z);
    }

    /* JADX INFO: renamed from: f */
    public void m203353f(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        m203350c(frameLayout, liveGiftExtLayer);
        m203354g(bLiveEffect, giftTrayData, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m203354g(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z) {
        wrj.m205211R(bLiveEffect, giftTrayData);
        fge.m121214r(this.f186566a, new dqe(bLiveEffect.f44359id).m113017k(giftTrayData.f50083M).m113015i(new d30() { // from class: l.uis
            @Override // p149l.d30
            public final void call() {
                this.f176687a.m203351d(bLiveEffect, giftTrayData, z);
            }
        }).m113018l(new d30() { // from class: l.vis
            @Override // p149l.d30
            public final void call() {
                this.f181638a.m203352e(giftTrayData, z);
            }
        }));
        this.f186567b.m73625b(giftTrayData.m74161e());
    }
}
