package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvStageSuggestItemView;

/* JADX INFO: loaded from: classes5.dex */
public class y3r extends d1q<KtvStageSuggestItemView> {

    /* JADX INFO: renamed from: a */
    public final j4r f195842a;

    /* JADX INFO: renamed from: b */
    public final BLiveVoiceKTVSong f195843b;

    /* JADX INFO: renamed from: c */
    public final int f195844c;

    public y3r(j4r j4rVar, BLiveVoiceKTVSong bLiveVoiceKTVSong, int i) {
        this.f195842a = j4rVar;
        this.f195843b = bLiveVoiceKTVSong;
        this.f195844c = i;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(KtvStageSuggestItemView ktvStageSuggestItemView) {
        super.mo70566u(ktvStageSuggestItemView);
        ktvStageSuggestItemView.m77100i0(this.f195843b, this.f195842a, this.f195844c);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168238X2;
    }
}
