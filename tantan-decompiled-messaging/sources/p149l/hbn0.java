package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallItemView;

/* JADX INFO: loaded from: classes5.dex */
public class hbn0 extends d1q<VoiceGiftWallItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceGiftWallBookInfo f106948a;

    /* JADX INFO: renamed from: b */
    public int f106949b;

    public hbn0(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, int i) {
        this.f106948a = bLiveVoiceGiftWallBookInfo;
        this.f106949b = i;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceGiftWallItemView voiceGiftWallItemView) {
        super.mo70566u(voiceGiftWallItemView);
        voiceGiftWallItemView.m78169i0(this.f106948a, this.f106949b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168160Q8;
    }
}
