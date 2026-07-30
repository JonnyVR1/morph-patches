package p149l;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.external.internal.vchat.card.videoChat.LiveVideoChatCardView;

/* JADX INFO: loaded from: classes13.dex */
public class juu extends tvr<LiveVideoChatCardView> {

    /* JADX INFO: renamed from: a */
    public final kuu f119812a;

    public juu(ij4 ij4Var, kuu kuuVar) {
        super(ij4Var);
        this.f119812a = kuuVar;
    }

    /* JADX INFO: renamed from: O */
    public static juu m143344O(ij4 ij4Var, z1s z1sVar) {
        if (z1sVar instanceof kuu) {
            return new juu(ij4Var, (kuu) z1sVar);
        }
        return null;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        LiveCardTracker.trackMv(this.f119812a.m147315l());
        return true;
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        zvf0.m220399u("e_live_video_quickchat_profile_enter", "p_live_video_quickchat", j760.m140076a(FirebaseAnalytics.Param.INDEX, this.f119812a.m147315l().get(FirebaseAnalytics.Param.INDEX)), j760.m140076a("anchorId", this.f119812a.m147315l().get("anchorId")));
        l9s.m149089m0((Act) view.getContext(), this.f119812a.m147304a(), true);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveVideoChatCardView liveVideoChatCardView) {
        super.mo70566u(liveVideoChatCardView);
        liveVideoChatCardView.m69251e(this.f119812a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162763j;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }
}
