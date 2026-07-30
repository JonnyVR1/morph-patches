package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed.LiveVoiceFeedCardView;

/* JADX INFO: loaded from: classes13.dex */
public class g4v extends tvr<LiveVoiceFeedCardView> {
    private static final int SPAN_COUNT = 3;
    private final lcs cardData;
    private final bs5 compositeSubscription;

    public g4v(ij4 ij4Var, lcs lcsVar) {
        super(ij4Var);
        this.compositeSubscription = new bs5();
        this.cardData = lcsVar;
    }

    /* JADX INFO: renamed from: O */
    public static g4v m124424O(ij4 ij4Var, z1s z1sVar) {
        if (z1sVar instanceof lcs) {
            return new g4v(ij4Var, (lcs) z1sVar);
        }
        return null;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        LiveCardTracker.trackMv(this.cardData.m149363m());
        return true;
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
        xps.m210534a(view.getContext(), this.cardData.m149356f());
        LiveCardTracker.trackMc(this.cardData.m149363m());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveVoiceFeedCardView liveVoiceFeedCardView) {
        super.mo70566u(liveVoiceFeedCardView);
        liveVoiceFeedCardView.m67461a(this.cardData, this.cardContext.f113496lp, this.compositeSubscription);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveVoiceFeedCardView liveVoiceFeedCardView) {
        super.mo71000w(liveVoiceFeedCardView);
        this.compositeSubscription.m103657c();
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152899x;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 3;
    }
}
