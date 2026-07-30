package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.LiveCampaignBannerCardView;

/* JADX INFO: loaded from: classes13.dex */
public class h1s extends tvr<LiveCampaignBannerCardView> {
    public static final int AUTO_SCROLL_TIME = 6;
    private final n1s cardData;

    public h1s(ij4 ij4Var, n1s n1sVar) {
        super(ij4Var);
        this.cardData = n1sVar;
    }

    /* JADX INFO: renamed from: O */
    public static h1s m129074O(ij4 ij4Var, n1s n1sVar) {
        if (n1sVar == null) {
            return null;
        }
        return new h1s(ij4Var, n1sVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveCampaignBannerCardView liveCampaignBannerCardView) {
        super.mo70566u(liveCampaignBannerCardView);
        liveCampaignBannerCardView.m67429n(this.cardContext, this.cardData);
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo129075I(LiveCampaignBannerCardView liveCampaignBannerCardView) {
        super.mo129075I(liveCampaignBannerCardView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveCampaignBannerCardView liveCampaignBannerCardView) {
        liveCampaignBannerCardView.m67428m();
        super.mo71000w(liveCampaignBannerCardView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152881f;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }
}
