package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;

/* JADX INFO: loaded from: classes13.dex */
public class fyu extends uxr<LiveVideoFeedSmallStyleCardView> implements gpl<LiveVideoFeedSmallStyleCardView> {
    public static final float PLAY_PRIORITY_NORMAL_PICTURE = 100.0f;
    private static final int SPAN_COUNT = 2;
    private final byu cardData;

    public fyu(hk4 hk4Var, byu byuVar) {
        super(hk4Var);
        this.cardData = byuVar;
    }

    /* JADX INFO: renamed from: P */
    public static fyu m128126P(hk4 hk4Var, byu byuVar) {
        if (byuVar == null) {
            return null;
        }
        return new fyu(hk4Var, byuVar);
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
        m198511L(this.cardData.m107080b());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo72182m(LiveVideoFeedSmallStyleCardView liveVideoFeedSmallStyleCardView) {
        super.mo72182m(liveVideoFeedSmallStyleCardView);
        liveVideoFeedSmallStyleCardView.m68726a(3);
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo115540g(LiveVideoFeedSmallStyleCardView liveVideoFeedSmallStyleCardView, boolean z) {
        if (z) {
            liveVideoFeedSmallStyleCardView.m68729e(mo115539f());
        } else {
            liveVideoFeedSmallStyleCardView.m68732h();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveVideoFeedSmallStyleCardView liveVideoFeedSmallStyleCardView) {
        super.mo71749u(liveVideoFeedSmallStyleCardView);
        liveVideoFeedSmallStyleCardView.m68730f(this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveVideoFeedSmallStyleCardView liveVideoFeedSmallStyleCardView) {
        super.mo72183w(liveVideoFeedSmallStyleCardView);
        liveVideoFeedSmallStyleCardView.m68732h();
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: a */
    public float mo115538a() {
        return 100.0f;
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: f */
    public String mo115539f() {
        return this.cardData.live.videoCaptureUrl;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183755w;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 2;
    }
}
