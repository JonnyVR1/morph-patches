package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvStageSuggestItemView;

/* JADX INFO: loaded from: classes5.dex */
public class z5r extends d3q<KtvStageSuggestItemView> {

    /* JADX INFO: renamed from: a */
    public final k6r f203077a;

    /* JADX INFO: renamed from: b */
    public final BLiveVoiceKTVSong f203078b;

    /* JADX INFO: renamed from: c */
    public final int f203079c;

    public z5r(k6r k6rVar, BLiveVoiceKTVSong bLiveVoiceKTVSong, int i) {
        this.f203077a = k6rVar;
        this.f203078b = bLiveVoiceKTVSong;
        this.f203079c = i;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(KtvStageSuggestItemView ktvStageSuggestItemView) {
        super.mo71749u(ktvStageSuggestItemView);
        ktvStageSuggestItemView.m78283i0(this.f203078b, this.f203077a, this.f203079c);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198970X2;
    }
}
