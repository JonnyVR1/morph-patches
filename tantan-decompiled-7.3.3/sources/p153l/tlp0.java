package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceWeekStarListItemView;

/* JADX INFO: loaded from: classes10.dex */
public class tlp0 extends d3q<VoiceWeekStarListItemView> {

    /* JADX INFO: renamed from: a */
    public WeekStarLeaderboard f174857a;

    /* JADX INFO: renamed from: b */
    public y20<String> f174858b;

    /* JADX INFO: renamed from: c */
    public boolean f174859c;

    public tlp0(WeekStarLeaderboard weekStarLeaderboard) {
        this.f174857a = weekStarLeaderboard;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceWeekStarListItemView voiceWeekStarListItemView) {
        super.mo71749u(voiceWeekStarListItemView);
        voiceWeekStarListItemView.m79878j0(this.f174857a, this.f174858b, this.f174859c);
    }

    /* JADX INFO: renamed from: I */
    public void m191695I(y20<String> y20Var) {
        this.f174858b = y20Var;
    }

    /* JADX INFO: renamed from: J */
    public void m191696J(boolean z) {
        this.f174859c = z;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199223qb;
    }
}
