package p002l;

import com.p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l7d0 extends bk2<LongLinkLiveFanbaseMessage.RedPacketEvent, LongLinkLiveFanbaseMessage.RedPacketEvent> {
    public l7d0(p3g0<LongLinkLiveFanbaseMessage.RedPacketEvent, LongLinkLiveFanbaseMessage.RedPacketEvent> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveFanbaseMessage.RedPacketEvent redPacketEvent, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveFanbaseMessage.RedPacketEvent> mo9244b() {
        return LongLinkLiveFanbaseMessage.RedPacketEvent.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.fanbase.event.redpacket";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveFanbaseMessage.RedPacketEvent mo9251z(String str, LongLinkLiveFanbaseMessage.RedPacketEvent redPacketEvent) {
        return redPacketEvent;
    }
}
