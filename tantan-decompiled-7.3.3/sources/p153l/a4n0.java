package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallItemView;

/* JADX INFO: loaded from: classes10.dex */
public class a4n0 extends d3q<VoiceCardGiftWallItemView> {

    /* JADX INFO: renamed from: a */
    public final Act f68433a;

    /* JADX INFO: renamed from: b */
    public BLiveUserCardGiftWallGift f68434b;

    public a4n0(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift, Act act) {
        this.f68434b = bLiveUserCardGiftWallGift;
        this.f68433a = act;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceCardGiftWallItemView voiceCardGiftWallItemView) {
        super.mo71749u(voiceCardGiftWallItemView);
        voiceCardGiftWallItemView.m79892h0(this.f68434b, this.f68433a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198846Ma;
    }
}
