package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mui extends vp2<LongLinkLiveMessage.LiveTemplateMsg> {
    public mui(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.LiveTemplateMsg liveTemplateMsg, String str2) {
        return new LiveControlMessage(str, "reward_point");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.LiveTemplateMsg liveTemplateMsg, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.followUserId = liveTemplateMsg.getUser().getId();
        extInfo.followType = "rewardPoint";
        extInfo.followTrackName = "gift";
        LiveMessage liveMessageM24093o = m24093o(str, liveTemplateMsg.getTempdata().getId(), liveTemplateMsg.getUser(), null, liveTemplateMsg.getTempdata(), extInfo);
        zcu.e(liveMessageM24093o, this.f21259c);
        return liveMessageM24093o;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveTemplateMsg> mo9244b() {
        return LongLinkLiveMessage.LiveTemplateMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.room.rewardPoint";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveTemplateMsg liveTemplateMsg, String str) {
        return m24095r(liveTemplateMsg.getRoomId(), "no_care", "no_care");
    }
}
