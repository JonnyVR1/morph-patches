package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;

/* JADX INFO: loaded from: classes4.dex */
public class ltf extends bk2<LongLinkGiftMessage.LiveGiftReceivedMsg, BLiveGivenGiftBrief> {
    public ltf(p3g0<BLiveGivenGiftBrief, BLiveGivenGiftBrief> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.LiveGiftReceivedMsg liveGiftReceivedMsg, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveGivenGiftBrief mo94461z(String str, LongLinkGiftMessage.LiveGiftReceivedMsg liveGiftReceivedMsg) {
        und undVar = this.f182445c;
        return e5t.m114914r(liveGiftReceivedMsg, (undVar == null || undVar.m194414a() == null) ? "" : this.f182445c.m194414a().room.f44419id);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveGiftReceivedMsg> mo94398b() {
        return LongLinkGiftMessage.LiveGiftReceivedMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "commercial.gift.facegift";
    }
}
