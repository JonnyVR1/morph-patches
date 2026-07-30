package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.LiveCampaignBannerCardView;

/* JADX INFO: loaded from: classes13.dex */
public class i3s extends uxr<LiveCampaignBannerCardView> {
    public static final int AUTO_SCROLL_TIME = 6;
    private final o3s cardData;

    public i3s(hk4 hk4Var, o3s o3sVar) {
        super(hk4Var);
        this.cardData = o3sVar;
    }

    /* JADX INFO: renamed from: O */
    public static i3s m138339O(hk4 hk4Var, o3s o3sVar) {
        if (o3sVar == null) {
            return null;
        }
        return new i3s(hk4Var, o3sVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveCampaignBannerCardView liveCampaignBannerCardView) {
        super.mo71749u(liveCampaignBannerCardView);
        liveCampaignBannerCardView.m68612n(this.cardContext, this.cardData);
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo138340I(LiveCampaignBannerCardView liveCampaignBannerCardView) {
        super.mo138340I(liveCampaignBannerCardView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveCampaignBannerCardView liveCampaignBannerCardView) {
        liveCampaignBannerCardView.m68611m();
        super.mo72183w(liveCampaignBannerCardView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183738f;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }
}
