package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.banner.LiveBannerCardView;

/* JADX INFO: loaded from: classes13.dex */
public class vur extends tvr<LiveBannerCardView> {
    public static final int AUTO_SCROLL_TIME = 8;
    private final wur cardData;

    public vur(ij4 ij4Var, wur wurVar) {
        super(ij4Var);
        this.cardData = wurVar;
    }

    /* JADX INFO: renamed from: O */
    public static vur m200090O(ij4 ij4Var, wur wurVar) {
        if (wurVar == null) {
            return null;
        }
        return new vur(ij4Var, wurVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveBannerCardView liveBannerCardView) {
        super.mo70566u(liveBannerCardView);
        liveBannerCardView.m67405n(this.cardContext, this.cardData);
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo129075I(LiveBannerCardView liveBannerCardView) {
        super.mo129075I(liveBannerCardView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveBannerCardView liveBannerCardView) {
        liveBannerCardView.m67404m();
        super.mo71000w(liveBannerCardView);
    }

    /* JADX INFO: renamed from: S */
    public void m200094S(LiveBannerCardView liveBannerCardView) {
        mo70566u(liveBannerCardView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152879d;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }
}
