package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class mui extends vp2<LongLinkLiveMessage.LiveTemplateMsg> {
    public mui(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.LiveTemplateMsg liveTemplateMsg, String str2) {
        return new LiveControlMessage(str, "reward_point");
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.LiveTemplateMsg liveTemplateMsg, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.followUserId = liveTemplateMsg.getUser().getId();
        extInfo.followType = "rewardPoint";
        extInfo.followTrackName = "gift";
        LiveMessage liveMessageM199210o = m199210o(str, liveTemplateMsg.getTempdata().getId(), liveTemplateMsg.getUser(), null, liveTemplateMsg.getTempdata(), extInfo);
        zcu.m218090e(liveMessageM199210o, this.f182445c);
        return liveMessageM199210o;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveTemplateMsg> mo94398b() {
        return LongLinkLiveMessage.LiveTemplateMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.rewardPoint";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveTemplateMsg liveTemplateMsg, String str) {
        return m199212r(liveTemplateMsg.getRoomId(), "no_care", "no_care");
    }
}
