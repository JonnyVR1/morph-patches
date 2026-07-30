package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common.card.LiveFeedNearbyIntlStyleCardView;

/* JADX INFO: loaded from: classes9.dex */
public class dfs extends uxr<LiveFeedNearbyIntlStyleCardView> implements gpl<LiveFeedNearbyIntlStyleCardView> {

    /* JADX INFO: renamed from: a */
    public byu f88216a;

    public dfs(hk4 hk4Var, byu byuVar) {
        super(hk4Var);
        this.f88216a = byuVar;
    }

    /* JADX INFO: renamed from: O */
    public static dfs m115534O(hk4 hk4Var, byu byuVar) {
        return new dfs(hk4Var, byuVar);
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
        yrs.m217233a(view.getContext(), this.f88216a.m107079a());
        m198511L(this.f88216a.m107080b());
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo115540g(LiveFeedNearbyIntlStyleCardView liveFeedNearbyIntlStyleCardView, boolean z) {
        if (z) {
            liveFeedNearbyIntlStyleCardView.m71222e(mo115539f());
        } else {
            liveFeedNearbyIntlStyleCardView.m71226i();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveFeedNearbyIntlStyleCardView liveFeedNearbyIntlStyleCardView) {
        super.mo71749u(liveFeedNearbyIntlStyleCardView);
        liveFeedNearbyIntlStyleCardView.m71223f(this.f88216a.live);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveFeedNearbyIntlStyleCardView liveFeedNearbyIntlStyleCardView) {
        super.mo72183w(liveFeedNearbyIntlStyleCardView);
        liveFeedNearbyIntlStyleCardView.m71226i();
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: a */
    public float mo115538a() {
        return 100.0f;
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: f */
    public String mo115539f() {
        return this.f88216a.live.videoCaptureUrl;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193869h;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 2;
    }
}
