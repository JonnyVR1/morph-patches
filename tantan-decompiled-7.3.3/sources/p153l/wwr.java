package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.banner.LiveBannerCardView;

/* JADX INFO: loaded from: classes13.dex */
public class wwr extends uxr<LiveBannerCardView> {
    public static final int AUTO_SCROLL_TIME = 8;
    private final xwr cardData;

    public wwr(hk4 hk4Var, xwr xwrVar) {
        super(hk4Var);
        this.cardData = xwrVar;
    }

    /* JADX INFO: renamed from: O */
    public static wwr m208290O(hk4 hk4Var, xwr xwrVar) {
        if (xwrVar == null) {
            return null;
        }
        return new wwr(hk4Var, xwrVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveBannerCardView liveBannerCardView) {
        super.mo71749u(liveBannerCardView);
        liveBannerCardView.m68588n(this.cardContext, this.cardData);
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo138340I(LiveBannerCardView liveBannerCardView) {
        super.mo138340I(liveBannerCardView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveBannerCardView liveBannerCardView) {
        liveBannerCardView.m68587m();
        super.mo72183w(liveBannerCardView);
    }

    /* JADX INFO: renamed from: S */
    public void m208294S(LiveBannerCardView liveBannerCardView) {
        mo71749u(liveBannerCardView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183736d;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }
}
