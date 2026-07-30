package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallGiftItem;

/* JADX INFO: loaded from: classes11.dex */
public class srj extends d1q<VoiceGiftWallGiftItem> {

    /* JADX INFO: renamed from: a */
    public GiftBean f166101a;

    /* JADX INFO: renamed from: b */
    public Act f166102b;

    public srj(GiftBean giftBean, Act act) {
        this.f166101a = giftBean;
        this.f166102b = act;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceGiftWallGiftItem voiceGiftWallGiftItem) {
        super.mo70566u(voiceGiftWallGiftItem);
        voiceGiftWallGiftItem.m78687h0(this.f166101a, this.f166102b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168088K8;
    }
}
