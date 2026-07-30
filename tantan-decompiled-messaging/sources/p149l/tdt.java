package p149l;

import com.p046p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class tdt extends vp2<LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg> {
    public tdt(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg, String str2) {
        if (this.f182445c.m194417d().m171773f(joinLotteryGiftRedPacketMsg.getTemplate().getId()) == null) {
            return null;
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.scheme = joinLotteryGiftRedPacketMsg.getJumpScheme();
        LiveMessage liveMessageM199210o = m199210o(str, joinLotteryGiftRedPacketMsg.getTemplate().getId(), LongLinkLiveMessage.UserInfo.newBuilder().setName(joinLotteryGiftRedPacketMsg.getUserName()).setId(joinLotteryGiftRedPacketMsg.getUserId()).build(), null, joinLotteryGiftRedPacketMsg.getTemplate(), extInfo);
        if (joinLotteryGiftRedPacketMsg.getIsAggregate()) {
            liveMessageM199210o.setLiveMessageType(LiveMessage.LiveMessageType.JOIN_RED_PACKET);
        }
        joinLotteryGiftRedPacketMsg.getIsAggregate();
        return liveMessageM199210o;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg> mo94398b() {
        return LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.redpacket.joinLotteryGiftRedPacket";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg, String str) {
        return m199212r(joinLotteryGiftRedPacketMsg.getRoomId(), "no_care", "no_care");
    }
}
