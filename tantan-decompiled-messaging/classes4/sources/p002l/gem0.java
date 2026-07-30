package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gem0 extends vp2<LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage> {
    public gem0(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage voiceLiveFollowShipApplyMessage, String str2) {
        return (voiceLiveFollowShipApplyMessage.getTemplateData() == null || voiceLiveFollowShipApplyMessage.getTemplateData().getId() == 0) ? super.mo9247x(str, voiceLiveFollowShipApplyMessage, str2) : m24092n(str, voiceLiveFollowShipApplyMessage.getTemplateData().getId(), null, null, voiceLiveFollowShipApplyMessage.getTemplateData());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage> mo9244b() {
        return LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.followship.apply";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage voiceLiveFollowShipApplyMessage, String str) {
        return true;
    }
}
