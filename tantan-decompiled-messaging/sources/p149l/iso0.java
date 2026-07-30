package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetListItemView;

/* JADX INFO: loaded from: classes11.dex */
public class iso0 extends d1q<VoiceSweetListItemView> {

    /* JADX INFO: renamed from: a */
    public final int f114785a;

    /* JADX INFO: renamed from: b */
    public final BLiveSweetCpRankInfo f114786b;

    /* JADX INFO: renamed from: c */
    public final e30<String> f114787c;

    public iso0(int i, BLiveSweetCpRankInfo bLiveSweetCpRankInfo, e30<String> e30Var) {
        this.f114785a = i;
        this.f114786b = bLiveSweetCpRankInfo;
        this.f114787c = e30Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceSweetListItemView voiceSweetListItemView) {
        super.mo70566u(voiceSweetListItemView);
        voiceSweetListItemView.m78579l0(this.f114786b, this.f114785a, this.f114787c);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168568wa;
    }
}
