package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed.LiveFullLineFeedCardView;

/* JADX INFO: loaded from: classes13.dex */
public class xds extends tvr<LiveFullLineFeedCardView> {
    private final yds cardData;
    private final bs5 compositeSubscription;

    public xds(ij4 ij4Var, yds ydsVar) {
        super(ij4Var);
        this.compositeSubscription = new bs5();
        this.cardData = ydsVar;
    }

    /* JADX INFO: renamed from: O */
    public static xds m208425O(ij4 ij4Var, yds ydsVar) {
        return new xds(ij4Var, ydsVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        LiveCardTracker.trackMv(this.cardData.trackData);
        return true;
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
        xps.m210534a(view.getContext(), this.cardData.goAction);
        LiveCardTracker.trackMc(this.cardData.trackData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveFullLineFeedCardView liveFullLineFeedCardView) {
        super.mo70566u(liveFullLineFeedCardView);
        liveFullLineFeedCardView.m67459k0(this.cardData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveFullLineFeedCardView liveFullLineFeedCardView) {
        super.mo71000w(liveFullLineFeedCardView);
        this.compositeSubscription.m103657c();
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152886k;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }
}
