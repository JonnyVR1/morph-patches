package p153l;

import com.p051p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class uft extends mq2<LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg> {
    public uft(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg, String str2) {
        if (this.f137993c.m220736d().m157079f(joinLotteryGiftRedPacketMsg.getTemplate().getId()) == null) {
            return null;
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.scheme = joinLotteryGiftRedPacketMsg.getJumpScheme();
        LiveMessage liveMessageM159458o = m159458o(str, joinLotteryGiftRedPacketMsg.getTemplate().getId(), LongLinkLiveMessage.UserInfo.newBuilder().setName(joinLotteryGiftRedPacketMsg.getUserName()).setId(joinLotteryGiftRedPacketMsg.getUserId()).build(), null, joinLotteryGiftRedPacketMsg.getTemplate(), extInfo);
        if (joinLotteryGiftRedPacketMsg.getIsAggregate()) {
            liveMessageM159458o.setLiveMessageType(LiveMessage.LiveMessageType.JOIN_RED_PACKET);
        }
        joinLotteryGiftRedPacketMsg.getIsAggregate();
        return liveMessageM159458o;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg> mo95510b() {
        return LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.redpacket.joinLotteryGiftRedPacket";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg, String str) {
        return m159460r(joinLotteryGiftRedPacketMsg.getRoomId(), "no_care", "no_care");
    }
}
