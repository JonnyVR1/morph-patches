package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift.PlayPanelView;

/* JADX INFO: loaded from: classes4.dex */
public class mis {

    /* JADX INFO: renamed from: a */
    public PlayPanelView f134033a;

    /* JADX INFO: renamed from: a */
    public final void m154751a(FrameLayout frameLayout) {
        if (this.f134033a == null) {
            this.f134033a = new PlayPanelView(frameLayout.getContext());
        }
        if (this.f134033a.getParent() == null) {
            PlayPanelView playPanelView = this.f134033a;
            int i = xdl0.f192403e;
            frameLayout.addView(playPanelView, i, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m154752b() {
        PlayPanelView playPanelView = this.f134033a;
        if (playPanelView != null) {
            playPanelView.m73555d();
        }
        m154755e();
    }

    /* JADX INFO: renamed from: c */
    public void m154753c(FrameLayout frameLayout, BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        m154751a(frameLayout);
        m154754d(bLiveGiftExtraDrawInfo);
    }

    /* JADX INFO: renamed from: d */
    public final void m154754d(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        this.f134033a.m73557f(bLiveGiftExtraDrawInfo, new Runnable() { // from class: l.lis
            @Override // java.lang.Runnable
            public final void run() {
                this.f128258a.m154755e();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m154755e() {
    }
}
