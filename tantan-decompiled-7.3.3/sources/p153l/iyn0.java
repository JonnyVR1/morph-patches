package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.voiceFollow;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;

/* JADX INFO: loaded from: classes4.dex */
public class iyn0 extends mq2<voiceFollow.VoiceLiveFollowMessage> {
    public iyn0(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(voiceFollow.VoiceLiveFollowMessage voiceLiveFollowMessage, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, voiceFollow.VoiceLiveFollowMessage voiceLiveFollowMessage, String str2) {
        LiveUserInfo liveUserInfoM142716z = m142716z(voiceLiveFollowMessage);
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.voiceFollowSource = voiceLiveFollowMessage.getSource().getNumber();
        extInfo.isSystemReplaceMessage = true;
        if (voiceLiveFollowMessage.getUserMask() != null) {
            extInfo.followUserId = voiceLiveFollowMessage.getUserMask().getUserId();
            extInfo.messageUserId = voiceLiveFollowMessage.getUserMask().getUserId();
        }
        LiveMessage liveMessageM159455l = m159455l(null, str, voiceLiveFollowMessage.getTemplateData().getId(), liveUserInfoM142716z, null, voiceLiveFollowMessage.getTemplateData(), extInfo);
        afu.m97564m(liveMessageM159455l, this.f137993c);
        return liveMessageM159455l;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<voiceFollow.VoiceLiveFollowMessage> mo95510b() {
        return voiceFollow.VoiceLiveFollowMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.followship.guide";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m142716z(voiceFollow.VoiceLiveFollowMessage voiceLiveFollowMessage) {
        if (voiceLiveFollowMessage.getSourceValue() == 3) {
            return new LiveUserInfo(voiceLiveFollowMessage.getFollower().getId(), voiceLiveFollowMessage.getFollower().getName());
        }
        LiveUserInfo liveUserInfo = new LiveUserInfo(voiceLiveFollowMessage.getUserMask().getUserId(), voiceLiveFollowMessage.getUserMask().getName(), v6o0.m200134a(voiceLiveFollowMessage.getUserMask()));
        liveUserInfo.isMaskMode = (voiceLiveFollowMessage.getUserMask() == null || voiceLiveFollowMessage.getUserMask().getVoiceMaskModeAddition() == null || TextUtils.isEmpty(voiceLiveFollowMessage.getUserMask().getVoiceMaskModeAddition().getColor())) ? false : true;
        return liveUserInfo;
    }
}
