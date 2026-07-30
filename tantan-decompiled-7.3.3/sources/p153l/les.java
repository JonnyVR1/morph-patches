package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed.LiveFeedCardView;

/* JADX INFO: loaded from: classes13.dex */
public class les extends uxr<LiveFeedCardView> {
    private static final int SPAN_COUNT = 3;
    private final mes cardData;
    private final ft5 compositeSubscription;

    public les(hk4 hk4Var, mes mesVar) {
        super(hk4Var);
        this.compositeSubscription = new ft5();
        this.cardData = mesVar;
    }

    /* JADX INFO: renamed from: O */
    public static les m153937O(hk4 hk4Var, a4s a4sVar) {
        if (a4sVar instanceof mes) {
            return new les(hk4Var, (mes) a4sVar);
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
    public void mo71749u(LiveFeedCardView liveFeedCardView) {
        super.mo71749u(liveFeedCardView);
        liveFeedCardView.m68638k(this.cardData, this.cardContext.f110375lp, this.compositeSubscription);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveFeedCardView liveFeedCardView) {
        super.mo72183w(liveFeedCardView);
        this.compositeSubscription.m127299c();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183741i;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }
}
