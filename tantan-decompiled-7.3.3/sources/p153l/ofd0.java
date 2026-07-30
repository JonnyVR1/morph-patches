package p153l;

import com.p051p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage;

/* JADX INFO: loaded from: classes4.dex */
public class ofd0 extends jk2<LongLinkLiveFanbaseMessage.RedPacketEvent, LongLinkLiveFanbaseMessage.RedPacketEvent> {
    public ofd0(wbg0<LongLinkLiveFanbaseMessage.RedPacketEvent, LongLinkLiveFanbaseMessage.RedPacketEvent> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveFanbaseMessage.RedPacketEvent redPacketEvent, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveFanbaseMessage.RedPacketEvent> mo95510b() {
        return LongLinkLiveFanbaseMessage.RedPacketEvent.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.fanbase.event.redpacket";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveFanbaseMessage.RedPacketEvent mo95993z(String str, LongLinkLiveFanbaseMessage.RedPacketEvent redPacketEvent) {
        return redPacketEvent;
    }
}
