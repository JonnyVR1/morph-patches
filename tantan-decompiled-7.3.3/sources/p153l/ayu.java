package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedBStyleCardView;

/* JADX INFO: loaded from: classes13.dex */
public class ayu extends uxr<LiveVideoFeedBStyleCardView> {
    private static final int SPAN_COUNT = 3;
    private final byu cardData;

    public ayu(hk4 hk4Var, byu byuVar) {
        super(hk4Var);
        this.cardData = byuVar;
    }

    /* JADX INFO: renamed from: P */
    public static ayu m100923P(hk4 hk4Var, byu byuVar) {
        if (byuVar == null) {
            return null;
        }
        return new ayu(hk4Var, byuVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        m198512N(j80Var, this.cardData.m107080b());
        return true;
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
        yrs.m217233a(view.getContext(), this.cardData.m107079a());
        LiveCardTracker.trackMc(this.cardData.m107080b());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo72182m(LiveVideoFeedBStyleCardView liveVideoFeedBStyleCardView) {
        super.mo72182m(liveVideoFeedBStyleCardView);
        liveVideoFeedBStyleCardView.m68723a(2);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveVideoFeedBStyleCardView liveVideoFeedBStyleCardView) {
        super.mo71749u(liveVideoFeedBStyleCardView);
        liveVideoFeedBStyleCardView.m68724b(this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183754v;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }
}
