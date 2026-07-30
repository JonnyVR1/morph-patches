package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallGiftItem;
import com.p1.mobile.android.app.Act;
import l.d1q;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class srj extends d1q<VoiceGiftWallGiftItem> {

    /* JADX INFO: renamed from: a */
    public GiftBean f20439a;

    /* JADX INFO: renamed from: b */
    public Act f20440b;

    public srj(GiftBean giftBean, Act act) {
        this.f20439a = giftBean;
        this.f20440b = act;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m22362u(VoiceGiftWallGiftItem voiceGiftWallGiftItem) {
        super.u(voiceGiftWallGiftItem);
        voiceGiftWallGiftItem.m8903h0(this.f20439a, this.f20440b);
    }

    /* JADX INFO: renamed from: o */
    public int m22361o() {
        return t6c0.K8;
    }
}
