package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;

/* JADX INFO: loaded from: classes13.dex */
public class ewu extends tvr<LiveVideoFeedSmallStyleCardView> implements vml<LiveVideoFeedSmallStyleCardView> {
    public static final float PLAY_PRIORITY_NORMAL_PICTURE = 100.0f;
    private static final int SPAN_COUNT = 2;
    private final awu cardData;

    public ewu(ij4 ij4Var, awu awuVar) {
        super(ij4Var);
        this.cardData = awuVar;
    }

    /* JADX INFO: renamed from: P */
    public static ewu m118516P(ij4 ij4Var, awu awuVar) {
        if (awuVar == null) {
            return null;
        }
        return new ewu(ij4Var, awuVar);
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
        m190778L(this.cardData.m99326b());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo70999m(LiveVideoFeedSmallStyleCardView liveVideoFeedSmallStyleCardView) {
        super.mo70999m(liveVideoFeedSmallStyleCardView);
        liveVideoFeedSmallStyleCardView.m67543a(3);
    }

    @Override // p149l.vml
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo106288g(LiveVideoFeedSmallStyleCardView liveVideoFeedSmallStyleCardView, boolean z) {
        if (z) {
            liveVideoFeedSmallStyleCardView.m67546e(mo106287f());
        } else {
            liveVideoFeedSmallStyleCardView.m67549h();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveVideoFeedSmallStyleCardView liveVideoFeedSmallStyleCardView) {
        super.mo70566u(liveVideoFeedSmallStyleCardView);
        liveVideoFeedSmallStyleCardView.m67547f(this.cardData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveVideoFeedSmallStyleCardView liveVideoFeedSmallStyleCardView) {
        super.mo71000w(liveVideoFeedSmallStyleCardView);
        liveVideoFeedSmallStyleCardView.m67549h();
    }

    @Override // p149l.vml
    /* JADX INFO: renamed from: a */
    public float mo106286a() {
        return 100.0f;
    }

    @Override // p149l.vml
    /* JADX INFO: renamed from: f */
    public String mo106287f() {
        return this.cardData.live.videoCaptureUrl;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152898w;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 2;
    }
}
