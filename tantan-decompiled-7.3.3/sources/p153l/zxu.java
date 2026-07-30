package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedAStyleCardView;

/* JADX INFO: loaded from: classes13.dex */
public class zxu extends uxr<LiveVideoFeedAStyleCardView> implements gpl<LiveVideoFeedAStyleCardView> {
    public static final float PLAY_PRIORITY_NORMAL_PICTURE = 100.0f;
    private static final int SPAN_COUNT = 3;
    private final byu cardData;

    public zxu(hk4 hk4Var, byu byuVar) {
        super(hk4Var);
        this.cardData = byuVar;
    }

    /* JADX INFO: renamed from: P */
    public static zxu m222079P(hk4 hk4Var, byu byuVar) {
        if (byuVar == null) {
            return null;
        }
        return new zxu(hk4Var, byuVar);
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
    public void mo72182m(LiveVideoFeedAStyleCardView liveVideoFeedAStyleCardView) {
        super.mo72182m(liveVideoFeedAStyleCardView);
        liveVideoFeedAStyleCardView.m68719a(2);
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo115540g(LiveVideoFeedAStyleCardView liveVideoFeedAStyleCardView, boolean z) {
        if (z) {
            liveVideoFeedAStyleCardView.m68720b(mo115539f());
        } else {
            liveVideoFeedAStyleCardView.m68722d();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveVideoFeedAStyleCardView liveVideoFeedAStyleCardView) {
        super.mo71749u(liveVideoFeedAStyleCardView);
        liveVideoFeedAStyleCardView.m68721c(this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveVideoFeedAStyleCardView liveVideoFeedAStyleCardView) {
        super.mo72183w(liveVideoFeedAStyleCardView);
        liveVideoFeedAStyleCardView.m68722d();
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
        return vec0.f183753u;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }
}
