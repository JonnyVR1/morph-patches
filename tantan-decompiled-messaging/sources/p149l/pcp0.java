package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceWeekStarListItemView;

/* JADX INFO: loaded from: classes11.dex */
public class pcp0 extends d1q<VoiceWeekStarListItemView> {

    /* JADX INFO: renamed from: a */
    public WeekStarLeaderboard f148205a;

    /* JADX INFO: renamed from: b */
    public e30<String> f148206b;

    /* JADX INFO: renamed from: c */
    public boolean f148207c;

    public pcp0(WeekStarLeaderboard weekStarLeaderboard) {
        this.f148205a = weekStarLeaderboard;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceWeekStarListItemView voiceWeekStarListItemView) {
        super.mo70566u(voiceWeekStarListItemView);
        voiceWeekStarListItemView.m78695j0(this.f148205a, this.f148206b, this.f148207c);
    }

    /* JADX INFO: renamed from: I */
    public void m168363I(e30<String> e30Var) {
        this.f148206b = e30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m168364J(boolean z) {
        this.f148207c = z;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168491qb;
    }
}
