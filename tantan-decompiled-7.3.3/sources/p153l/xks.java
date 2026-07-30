package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;

/* JADX INFO: loaded from: classes4.dex */
public class xks {

    /* JADX INFO: renamed from: a */
    public XEGiftView f194812a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f194813b;

    /* JADX INFO: renamed from: c */
    public final void m211410c(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f194813b = liveGiftExtLayer;
        if (this.f194812a == null) {
            this.f194812a = new XEGiftView(frameLayout.getContext());
        }
        if (this.f194812a.getParent() == null) {
            XEGiftView xEGiftView = this.f194812a;
            int i = bnl0.f77544e;
            frameLayout.addView(xEGiftView, i, i);
            bnl0.m105524M(this.f194812a, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m211411d(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        muj.m160171N(bLiveEffect, giftTrayData);
        this.f194813b.m74807a();
        rre.m182749u(giftTrayData, true, z);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m211412e(GiftTrayData giftTrayData, boolean z) {
        this.f194813b.m74807a();
        rre.m182749u(giftTrayData, false, z);
    }

    /* JADX INFO: renamed from: f */
    public void m211413f(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        m211410c(frameLayout, liveGiftExtLayer);
        m211414g(bLiveEffect, giftTrayData, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m211414g(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z) {
        muj.m160175R(bLiveEffect, giftTrayData);
        jhe.m144897r(this.f194812a, new hre(bLiveEffect.f45207id).m136828k(giftTrayData.f50931M).m136826i(new x20() { // from class: l.vks
            @Override // p153l.x20
            public final void call() {
                this.f184513a.m211411d(bLiveEffect, giftTrayData, z);
            }
        }).m136829l(new x20() { // from class: l.wks
            @Override // p153l.x20
            public final void call() {
                this.f189589a.m211412e(giftTrayData, z);
            }
        }));
        this.f194813b.m74808b(giftTrayData.m75344e());
    }
}
