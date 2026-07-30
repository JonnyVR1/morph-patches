package p153l;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.external.internal.vchat.card.videoChat.LiveVideoChatCardView;

/* JADX INFO: loaded from: classes9.dex */
public class kwu extends uxr<LiveVideoChatCardView> {

    /* JADX INFO: renamed from: a */
    public final lwu f129094a;

    public kwu(hk4 hk4Var, lwu lwuVar) {
        super(hk4Var);
        this.f129094a = lwuVar;
    }

    /* JADX INFO: renamed from: O */
    public static kwu m151739O(hk4 hk4Var, a4s a4sVar) {
        if (a4sVar instanceof lwu) {
            return new kwu(hk4Var, (lwu) a4sVar);
        }
        return null;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        LiveCardTracker.trackMv(this.f129094a.m156112l());
        return true;
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        i4g0.m138523u("e_live_video_quickchat_profile_enter", "p_live_video_quickchat", pf60.m172085a(FirebaseAnalytics.Param.INDEX, this.f129094a.m156112l().get(FirebaseAnalytics.Param.INDEX)), pf60.m172085a("anchorId", this.f129094a.m156112l().get("anchorId")));
        mbs.m157866m0((Act) view.getContext(), this.f129094a.m156101a(), true);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveVideoChatCardView liveVideoChatCardView) {
        super.mo71749u(liveVideoChatCardView);
        liveVideoChatCardView.m70434e(this.f129094a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193877j;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }
}
