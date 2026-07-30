package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;

/* JADX INFO: loaded from: classes4.dex */
public class zuf extends jk2<LongLinkGiftMessage.LiveGiftReceivedMsg, BLiveGivenGiftBrief> {
    public zuf(wbg0<BLiveGivenGiftBrief, BLiveGivenGiftBrief> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.LiveGiftReceivedMsg liveGiftReceivedMsg, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveGivenGiftBrief mo95993z(String str, LongLinkGiftMessage.LiveGiftReceivedMsg liveGiftReceivedMsg) {
        zod zodVar = this.f137993c;
        return f7t.m124498r(liveGiftReceivedMsg, (zodVar == null || zodVar.m220733a() == null) ? "" : this.f137993c.m220733a().room.f45267id);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveGiftReceivedMsg> mo95510b() {
        return LongLinkGiftMessage.LiveGiftReceivedMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "commercial.gift.facegift";
    }
}
