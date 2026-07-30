package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallGiftItem;

/* JADX INFO: loaded from: classes10.dex */
public class iuj extends d3q<VoiceGiftWallGiftItem> {

    /* JADX INFO: renamed from: a */
    public GiftBean f116952a;

    /* JADX INFO: renamed from: b */
    public Act f116953b;

    public iuj(GiftBean giftBean, Act act) {
        this.f116952a = giftBean;
        this.f116953b = act;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceGiftWallGiftItem voiceGiftWallGiftItem) {
        super.mo71749u(voiceGiftWallGiftItem);
        voiceGiftWallGiftItem.m79870h0(this.f116952a, this.f116953b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198820K8;
    }
}
