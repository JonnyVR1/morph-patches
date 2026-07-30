package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetListItemView;

/* JADX INFO: loaded from: classes10.dex */
public class m1p0 extends d3q<VoiceSweetListItemView> {

    /* JADX INFO: renamed from: a */
    public final int f134453a;

    /* JADX INFO: renamed from: b */
    public final BLiveSweetCpRankInfo f134454b;

    /* JADX INFO: renamed from: c */
    public final y20<String> f134455c;

    public m1p0(int i, BLiveSweetCpRankInfo bLiveSweetCpRankInfo, y20<String> y20Var) {
        this.f134453a = i;
        this.f134454b = bLiveSweetCpRankInfo;
        this.f134455c = y20Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceSweetListItemView voiceSweetListItemView) {
        super.mo71749u(voiceSweetListItemView);
        voiceSweetListItemView.m79762l0(this.f134454b, this.f134453a, this.f134455c);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199300wa;
    }
}
