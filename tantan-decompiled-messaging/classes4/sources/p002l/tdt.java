package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveredpacket.LongLinkRedPacketMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tdt extends vp2<LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg> {
    public tdt(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg, String str2) {
        if (this.f21259c.m23568d().m20739f(joinLotteryGiftRedPacketMsg.getTemplate().getId()) == null) {
            return null;
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.scheme = joinLotteryGiftRedPacketMsg.getJumpScheme();
        LiveMessage liveMessageM24093o = m24093o(str, joinLotteryGiftRedPacketMsg.getTemplate().getId(), (LongLinkLiveMessage.UserInfo) LongLinkLiveMessage.UserInfo.newBuilder().setName(joinLotteryGiftRedPacketMsg.getUserName()).setId(joinLotteryGiftRedPacketMsg.getUserId()).build(), null, joinLotteryGiftRedPacketMsg.getTemplate(), extInfo);
        if (joinLotteryGiftRedPacketMsg.getIsAggregate()) {
            liveMessageM24093o.setLiveMessageType(LiveMessage.LiveMessageType.JOIN_RED_PACKET);
        }
        joinLotteryGiftRedPacketMsg.getIsAggregate();
        return liveMessageM24093o;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg> mo9244b() {
        return LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.redpacket.joinLotteryGiftRedPacket";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkRedPacketMessage.JoinLotteryGiftRedPacketMsg joinLotteryGiftRedPacketMsg, String str) {
        return m24095r(joinLotteryGiftRedPacketMsg.getRoomId(), "no_care", "no_care");
    }
}
