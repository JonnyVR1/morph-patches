package p002l;

import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift.PlayPanelView;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mis {

    /* JADX INFO: renamed from: a */
    public PlayPanelView f15404a;

    /* JADX INFO: renamed from: a */
    public final void m17965a(FrameLayout frameLayout) {
        if (this.f15404a == null) {
            this.f15404a = new PlayPanelView(frameLayout.getContext());
        }
        if (this.f15404a.getParent() == null) {
            PlayPanelView playPanelView = this.f15404a;
            int i = xdl0.e;
            frameLayout.addView(playPanelView, i, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m17966b() {
        PlayPanelView playPanelView = this.f15404a;
        if (playPanelView != null) {
            playPanelView.m7099d();
        }
        m17969e();
    }

    /* JADX INFO: renamed from: c */
    public void m17967c(FrameLayout frameLayout, BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        m17965a(frameLayout);
        m17968d(bLiveGiftExtraDrawInfo);
    }

    /* JADX INFO: renamed from: d */
    public final void m17968d(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        this.f15404a.m7101f(bLiveGiftExtraDrawInfo, new Runnable() { // from class: l.lis
            @Override // java.lang.Runnable
            public final void run() {
                this.f14884a.m17969e();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m17969e() {
    }
}
