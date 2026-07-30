package p149l;

import com.p046p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage;

/* JADX INFO: loaded from: classes4.dex */
public class l7d0 extends bk2<LongLinkLiveFanbaseMessage.RedPacketEvent, LongLinkLiveFanbaseMessage.RedPacketEvent> {
    public l7d0(p3g0<LongLinkLiveFanbaseMessage.RedPacketEvent, LongLinkLiveFanbaseMessage.RedPacketEvent> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveFanbaseMessage.RedPacketEvent redPacketEvent, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveFanbaseMessage.RedPacketEvent> mo94398b() {
        return LongLinkLiveFanbaseMessage.RedPacketEvent.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.fanbase.event.redpacket";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveFanbaseMessage.RedPacketEvent mo94461z(String str, LongLinkLiveFanbaseMessage.RedPacketEvent redPacketEvent) {
        return redPacketEvent;
    }
}
