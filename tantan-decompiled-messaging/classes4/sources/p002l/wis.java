package p002l;

import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.view.XEGiftView;
import l.d30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wis {

    /* JADX INFO: renamed from: a */
    public XEGiftView f21795a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f21796b;

    /* JADX INFO: renamed from: c */
    public final void m24669c(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f21796b = liveGiftExtLayer;
        if (this.f21795a == null) {
            this.f21795a = new XEGiftView(frameLayout.getContext());
        }
        if (this.f21795a.getParent() == null) {
            XEGiftView xEGiftView = this.f21795a;
            int i = xdl0.e;
            frameLayout.addView((View) xEGiftView, i, i);
            xdl0.M(this.f21795a, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m24670d(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        wrj.m25379N(bLiveEffect, giftTrayData);
        this.f21796b.m7170a();
        nqe.m18966u(giftTrayData, true, z);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m24671e(GiftTrayData giftTrayData, boolean z) {
        this.f21796b.m7170a();
        nqe.m18966u(giftTrayData, false, z);
    }

    /* JADX INFO: renamed from: f */
    public void m24672f(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        m24669c(frameLayout, liveGiftExtLayer);
        m24673g(bLiveEffect, giftTrayData, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m24673g(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z) {
        wrj.m25383R(bLiveEffect, giftTrayData);
        fge.m13166r(this.f21795a, new dqe(bLiveEffect.id).m11989k(giftTrayData.f6125M).m11987i(new d30() { // from class: l.uis
            public final void call() {
                this.f20667a.m24670d(bLiveEffect, giftTrayData, z);
            }
        }).m11990l(new d30() { // from class: l.vis
            public final void call() {
                this.f21180a.m24671e(giftTrayData, z);
            }
        }));
        this.f21796b.m7171b(giftTrayData.m7726e());
    }
}
