package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
import l.d1q;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wum0 extends d1q<VoiceCardGiftWallItemView> {

    /* JADX INFO: renamed from: a */
    public final Act f22330a;

    /* JADX INFO: renamed from: b */
    public BLiveUserCardGiftWallGift f22331b;

    public wum0(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift, Act act) {
        this.f22331b = bLiveUserCardGiftWallGift;
        this.f22330a = act;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m24573u(VoiceCardGiftWallItemView voiceCardGiftWallItemView) {
        super.u(voiceCardGiftWallItemView);
        voiceCardGiftWallItemView.m8925h0(this.f22331b, this.f22330a);
    }

    /* JADX INFO: renamed from: o */
    public int m24572o() {
        return t6c0.Ma;
    }
}
