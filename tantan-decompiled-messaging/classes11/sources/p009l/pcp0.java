package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceWeekStarListItemView;
import l.d1q;
import l.e30;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pcp0 extends d1q<VoiceWeekStarListItemView> {

    /* JADX INFO: renamed from: a */
    public WeekStarLeaderboard f18477a;

    /* JADX INFO: renamed from: b */
    public e30<String> f18478b;

    /* JADX INFO: renamed from: c */
    public boolean f18479c;

    public pcp0(WeekStarLeaderboard weekStarLeaderboard) {
        this.f18477a = weekStarLeaderboard;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m20150u(VoiceWeekStarListItemView voiceWeekStarListItemView) {
        super.u(voiceWeekStarListItemView);
        voiceWeekStarListItemView.m8911j0(this.f18477a, this.f18478b, this.f18479c);
    }

    /* JADX INFO: renamed from: I */
    public void m20147I(e30<String> e30Var) {
        this.f18478b = e30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m20148J(boolean z) {
        this.f18479c = z;
    }

    /* JADX INFO: renamed from: o */
    public int m20149o() {
        return t6c0.qb;
    }
}
