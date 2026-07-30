package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common.card.LiveFeedSuggesstIntlStyleCardView;

/* JADX INFO: loaded from: classes9.dex */
public class ffs extends uxr<LiveFeedSuggesstIntlStyleCardView> implements gpl<LiveFeedSuggesstIntlStyleCardView> {

    /* JADX INFO: renamed from: a */
    public final byu f98828a;

    public ffs(hk4 hk4Var, byu byuVar) {
        super(hk4Var);
        this.f98828a = byuVar;
    }

    /* JADX INFO: renamed from: O */
    public static ffs m125415O(hk4 hk4Var, byu byuVar) {
        return new ffs(hk4Var, byuVar);
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
        yrs.m217233a(view.getContext(), this.f98828a.m107079a());
        m198511L(this.f98828a.m107080b());
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo115540g(LiveFeedSuggesstIntlStyleCardView liveFeedSuggesstIntlStyleCardView, boolean z) {
        if (z) {
            liveFeedSuggesstIntlStyleCardView.m71232u(mo115539f());
        } else {
            liveFeedSuggesstIntlStyleCardView.m71230B();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveFeedSuggesstIntlStyleCardView liveFeedSuggesstIntlStyleCardView) {
        super.mo71749u(liveFeedSuggesstIntlStyleCardView);
        liveFeedSuggesstIntlStyleCardView.m71234w(this.f98828a.live);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveFeedSuggesstIntlStyleCardView liveFeedSuggesstIntlStyleCardView) {
        super.mo72183w(liveFeedSuggesstIntlStyleCardView);
        liveFeedSuggesstIntlStyleCardView.m71230B();
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: a */
    public float mo115538a() {
        return 100.0f;
    }

    @Override // p153l.gpl
    /* JADX INFO: renamed from: f */
    public String mo115539f() {
        return this.f98828a.live.videoCaptureUrl;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193873i;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }
}
