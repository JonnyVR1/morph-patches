package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallItemView;

/* JADX INFO: loaded from: classes5.dex */
public class lkn0 extends d3q<VoiceGiftWallItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceGiftWallBookInfo f132489a;

    /* JADX INFO: renamed from: b */
    public int f132490b;

    public lkn0(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, int i) {
        this.f132489a = bLiveVoiceGiftWallBookInfo;
        this.f132490b = i;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceGiftWallItemView voiceGiftWallItemView) {
        super.mo71749u(voiceGiftWallItemView);
        voiceGiftWallItemView.m79352i0(this.f132489a, this.f132490b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198892Q8;
    }
}
