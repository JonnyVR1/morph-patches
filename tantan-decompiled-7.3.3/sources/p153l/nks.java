package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift.PlayPanelView;

/* JADX INFO: loaded from: classes4.dex */
public class nks {

    /* JADX INFO: renamed from: a */
    public PlayPanelView f142479a;

    /* JADX INFO: renamed from: a */
    public final void m163665a(FrameLayout frameLayout) {
        if (this.f142479a == null) {
            this.f142479a = new PlayPanelView(frameLayout.getContext());
        }
        if (this.f142479a.getParent() == null) {
            PlayPanelView playPanelView = this.f142479a;
            int i = bnl0.f77544e;
            frameLayout.addView(playPanelView, i, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m163666b() {
        PlayPanelView playPanelView = this.f142479a;
        if (playPanelView != null) {
            playPanelView.m74738d();
        }
        m163669e();
    }

    /* JADX INFO: renamed from: c */
    public void m163667c(FrameLayout frameLayout, BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        m163665a(frameLayout);
        m163668d(bLiveGiftExtraDrawInfo);
    }

    /* JADX INFO: renamed from: d */
    public final void m163668d(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        this.f142479a.m74740f(bLiveGiftExtraDrawInfo, new Runnable() { // from class: l.mks
            @Override // java.lang.Runnable
            public final void run() {
                this.f137330a.m163669e();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m163669e() {
    }
}
