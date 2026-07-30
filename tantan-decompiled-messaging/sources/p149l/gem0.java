package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class gem0 extends vp2<LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage> {
    public gem0(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage voiceLiveFollowShipApplyMessage, String str2) {
        return (voiceLiveFollowShipApplyMessage.getTemplateData() == null || voiceLiveFollowShipApplyMessage.getTemplateData().getId() == 0) ? super.mo94401x(str, voiceLiveFollowShipApplyMessage, str2) : m199209n(str, voiceLiveFollowShipApplyMessage.getTemplateData().getId(), null, null, voiceLiveFollowShipApplyMessage.getTemplateData());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage> mo94398b() {
        return LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.followship.apply";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage voiceLiveFollowShipApplyMessage, String str) {
        return true;
    }
}
