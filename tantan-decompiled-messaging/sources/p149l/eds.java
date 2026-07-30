package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.common.card.LiveFeedSuggesstIntlStyleCardView;

/* JADX INFO: loaded from: classes13.dex */
public class eds extends tvr<LiveFeedSuggesstIntlStyleCardView> implements vml<LiveFeedSuggesstIntlStyleCardView> {

    /* JADX INFO: renamed from: a */
    public final awu f90642a;

    public eds(ij4 ij4Var, awu awuVar) {
        super(ij4Var);
        this.f90642a = awuVar;
    }

    /* JADX INFO: renamed from: O */
    public static eds m115828O(ij4 ij4Var, awu awuVar) {
        return new eds(ij4Var, awuVar);
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
        xps.m210534a(view.getContext(), this.f90642a.m99325a());
        m190778L(this.f90642a.m99326b());
    }

    @Override // p149l.vml
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo106288g(LiveFeedSuggesstIntlStyleCardView liveFeedSuggesstIntlStyleCardView, boolean z) {
        if (z) {
            liveFeedSuggesstIntlStyleCardView.m70049u(mo106287f());
        } else {
            liveFeedSuggesstIntlStyleCardView.m70047B();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveFeedSuggesstIntlStyleCardView liveFeedSuggesstIntlStyleCardView) {
        super.mo70566u(liveFeedSuggesstIntlStyleCardView);
        liveFeedSuggesstIntlStyleCardView.m70051w(this.f90642a.live);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveFeedSuggesstIntlStyleCardView liveFeedSuggesstIntlStyleCardView) {
        super.mo71000w(liveFeedSuggesstIntlStyleCardView);
        liveFeedSuggesstIntlStyleCardView.m70047B();
    }

    @Override // p149l.vml
    /* JADX INFO: renamed from: a */
    public float mo106286a() {
        return 100.0f;
    }

    @Override // p149l.vml
    /* JADX INFO: renamed from: f */
    public String mo106287f() {
        return this.f90642a.live.videoCaptureUrl;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162759i;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 3;
    }
}
