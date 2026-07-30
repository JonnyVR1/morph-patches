package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed.LiveVoiceFeedCardView;

/* JADX INFO: loaded from: classes13.dex */
public class h6v extends uxr<LiveVoiceFeedCardView> {
    private static final int SPAN_COUNT = 3;
    private final mes cardData;
    private final ft5 compositeSubscription;

    public h6v(hk4 hk4Var, mes mesVar) {
        super(hk4Var);
        this.compositeSubscription = new ft5();
        this.cardData = mesVar;
    }

    /* JADX INFO: renamed from: O */
    public static h6v m133734O(hk4 hk4Var, a4s a4sVar) {
        if (a4sVar instanceof mes) {
            return new h6v(hk4Var, (mes) a4sVar);
        }
        return null;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        LiveCardTracker.trackMv(this.cardData.m158089m());
        return true;
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
        yrs.m217233a(view.getContext(), this.cardData.m158082f());
        LiveCardTracker.trackMc(this.cardData.m158089m());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveVoiceFeedCardView liveVoiceFeedCardView) {
        super.mo71749u(liveVoiceFeedCardView);
        liveVoiceFeedCardView.m68644a(this.cardData, this.cardContext.f110375lp, this.compositeSubscription);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveVoiceFeedCardView liveVoiceFeedCardView) {
        super.mo72183w(liveVoiceFeedCardView);
        this.compositeSubscription.m127299c();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183756x;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }
}
