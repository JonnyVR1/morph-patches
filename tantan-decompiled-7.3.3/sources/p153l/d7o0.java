package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallItemView;

/* JADX INFO: loaded from: classes10.dex */
public class d7o0 extends d3q<VoiceMedalWallItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveIntlMedalWallItem f85538a;

    /* JADX INFO: renamed from: b */
    public boolean f85539b;

    public d7o0(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, int i) {
        this.f85538a = bLiveIntlMedalWallItem;
        this.f85539b = i == 1;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceMedalWallItemView voiceMedalWallItemView) {
        super.mo71749u(voiceMedalWallItemView);
        voiceMedalWallItemView.m79460Q(this.f85538a, this.f85539b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198749E9;
    }
}
