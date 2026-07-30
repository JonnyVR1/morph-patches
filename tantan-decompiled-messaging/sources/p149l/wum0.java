package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallItemView;

/* JADX INFO: loaded from: classes11.dex */
public class wum0 extends d1q<VoiceCardGiftWallItemView> {

    /* JADX INFO: renamed from: a */
    public final Act f188143a;

    /* JADX INFO: renamed from: b */
    public BLiveUserCardGiftWallGift f188144b;

    public wum0(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift, Act act) {
        this.f188144b = bLiveUserCardGiftWallGift;
        this.f188143a = act;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceCardGiftWallItemView voiceCardGiftWallItemView) {
        super.mo70566u(voiceCardGiftWallItemView);
        voiceCardGiftWallItemView.m78709h0(this.f188144b, this.f188143a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168114Ma;
    }
}
