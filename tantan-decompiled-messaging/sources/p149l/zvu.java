package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedBStyleCardView;

/* JADX INFO: loaded from: classes13.dex */
public class zvu extends tvr<LiveVideoFeedBStyleCardView> {
    private static final int SPAN_COUNT = 3;
    private final awu cardData;

    public zvu(ij4 ij4Var, awu awuVar) {
        super(ij4Var);
        this.cardData = awuVar;
    }

    /* JADX INFO: renamed from: P */
    public static zvu m220484P(ij4 ij4Var, awu awuVar) {
        if (awuVar == null) {
            return null;
        }
        return new zvu(ij4Var, awuVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        m190779N(n80Var, this.cardData.m99326b());
        return true;
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
        xps.m210534a(view.getContext(), this.cardData.m99325a());
        LiveCardTracker.trackMc(this.cardData.m99326b());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo70999m(LiveVideoFeedBStyleCardView liveVideoFeedBStyleCardView) {
        super.mo70999m(liveVideoFeedBStyleCardView);
        liveVideoFeedBStyleCardView.m67540a(2);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveVideoFeedBStyleCardView liveVideoFeedBStyleCardView) {
        super.mo70566u(liveVideoFeedBStyleCardView);
        liveVideoFeedBStyleCardView.m67541b(this.cardData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152897v;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 3;
    }
}
