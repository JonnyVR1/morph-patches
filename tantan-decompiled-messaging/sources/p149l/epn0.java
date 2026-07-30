package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.voiceFollow;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;

/* JADX INFO: loaded from: classes4.dex */
public class epn0 extends vp2<voiceFollow.VoiceLiveFollowMessage> {
    public epn0(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(voiceFollow.VoiceLiveFollowMessage voiceLiveFollowMessage, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, voiceFollow.VoiceLiveFollowMessage voiceLiveFollowMessage, String str2) {
        LiveUserInfo liveUserInfoM117661z = m117661z(voiceLiveFollowMessage);
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.voiceFollowSource = voiceLiveFollowMessage.getSource().getNumber();
        extInfo.isSystemReplaceMessage = true;
        if (voiceLiveFollowMessage.getUserMask() != null) {
            extInfo.followUserId = voiceLiveFollowMessage.getUserMask().getUserId();
            extInfo.messageUserId = voiceLiveFollowMessage.getUserMask().getUserId();
        }
        LiveMessage liveMessageM199207l = m199207l(null, str, voiceLiveFollowMessage.getTemplateData().getId(), liveUserInfoM117661z, null, voiceLiveFollowMessage.getTemplateData(), extInfo);
        zcu.m218098m(liveMessageM199207l, this.f182445c);
        return liveMessageM199207l;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<voiceFollow.VoiceLiveFollowMessage> mo94398b() {
        return voiceFollow.VoiceLiveFollowMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.followship.guide";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m117661z(voiceFollow.VoiceLiveFollowMessage voiceLiveFollowMessage) {
        if (voiceLiveFollowMessage.getSourceValue() == 3) {
            return new LiveUserInfo(voiceLiveFollowMessage.getFollower().getId(), voiceLiveFollowMessage.getFollower().getName());
        }
        LiveUserInfo liveUserInfo = new LiveUserInfo(voiceLiveFollowMessage.getUserMask().getUserId(), voiceLiveFollowMessage.getUserMask().getName(), rxn0.m181617a(voiceLiveFollowMessage.getUserMask()));
        liveUserInfo.isMaskMode = (voiceLiveFollowMessage.getUserMask() == null || voiceLiveFollowMessage.getUserMask().getVoiceMaskModeAddition() == null || TextUtils.isEmpty(voiceLiveFollowMessage.getUserMask().getVoiceMaskModeAddition().getColor())) ? false : true;
        return liveUserInfo;
    }
}
