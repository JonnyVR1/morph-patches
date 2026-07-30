package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.common.card.LiveFeedNearbyIntlStyleCardView;

/* JADX INFO: loaded from: classes13.dex */
public class cds extends tvr<LiveFeedNearbyIntlStyleCardView> implements vml<LiveFeedNearbyIntlStyleCardView> {

    /* JADX INFO: renamed from: a */
    public awu f80405a;

    public cds(ij4 ij4Var, awu awuVar) {
        super(ij4Var);
        this.f80405a = awuVar;
    }

    /* JADX INFO: renamed from: O */
    public static cds m106282O(ij4 ij4Var, awu awuVar) {
        return new cds(ij4Var, awuVar);
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
        xps.m210534a(view.getContext(), this.f80405a.m99325a());
        m190778L(this.f80405a.m99326b());
    }

    @Override // p149l.vml
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo106288g(LiveFeedNearbyIntlStyleCardView liveFeedNearbyIntlStyleCardView, boolean z) {
        if (z) {
            liveFeedNearbyIntlStyleCardView.m70039e(mo106287f());
        } else {
            liveFeedNearbyIntlStyleCardView.m70043i();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveFeedNearbyIntlStyleCardView liveFeedNearbyIntlStyleCardView) {
        super.mo70566u(liveFeedNearbyIntlStyleCardView);
        liveFeedNearbyIntlStyleCardView.m70040f(this.f80405a.live);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveFeedNearbyIntlStyleCardView liveFeedNearbyIntlStyleCardView) {
        super.mo71000w(liveFeedNearbyIntlStyleCardView);
        liveFeedNearbyIntlStyleCardView.m70043i();
    }

    @Override // p149l.vml
    /* JADX INFO: renamed from: a */
    public float mo106286a() {
        return 100.0f;
    }

    @Override // p149l.vml
    /* JADX INFO: renamed from: f */
    public String mo106287f() {
        return this.f80405a.live.videoCaptureUrl;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162755h;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 2;
    }
}
