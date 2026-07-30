package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p1.mobile.longlink.msg.liveroom.voiceFollow;
import l.rxn0;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class epn0 extends vp2<voiceFollow.VoiceLiveFollowMessage> {
    public epn0(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(voiceFollow.VoiceLiveFollowMessage voiceLiveFollowMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, voiceFollow.VoiceLiveFollowMessage voiceLiveFollowMessage, String str2) {
        LiveUserInfo liveUserInfoM12659z = m12659z(voiceLiveFollowMessage);
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.voiceFollowSource = voiceLiveFollowMessage.getSource().getNumber();
        extInfo.isSystemReplaceMessage = true;
        if (voiceLiveFollowMessage.getUserMask() != null) {
            extInfo.followUserId = voiceLiveFollowMessage.getUserMask().getUserId();
            extInfo.messageUserId = voiceLiveFollowMessage.getUserMask().getUserId();
        }
        LiveMessage liveMessageM24090l = m24090l(null, str, voiceLiveFollowMessage.getTemplateData().getId(), liveUserInfoM12659z, null, voiceLiveFollowMessage.getTemplateData(), extInfo);
        zcu.m(liveMessageM24090l, this.f21259c);
        return liveMessageM24090l;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<voiceFollow.VoiceLiveFollowMessage> mo9244b() {
        return voiceFollow.VoiceLiveFollowMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.followship.guide";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m12659z(voiceFollow.VoiceLiveFollowMessage voiceLiveFollowMessage) {
        if (voiceLiveFollowMessage.getSourceValue() == 3) {
            return new LiveUserInfo(voiceLiveFollowMessage.getFollower().getId(), voiceLiveFollowMessage.getFollower().getName());
        }
        LiveUserInfo liveUserInfo = new LiveUserInfo(voiceLiveFollowMessage.getUserMask().getUserId(), voiceLiveFollowMessage.getUserMask().getName(), rxn0.a(voiceLiveFollowMessage.getUserMask()));
        liveUserInfo.isMaskMode = (voiceLiveFollowMessage.getUserMask() == null || voiceLiveFollowMessage.getUserMask().getVoiceMaskModeAddition() == null || TextUtils.isEmpty(voiceLiveFollowMessage.getUserMask().getVoiceMaskModeAddition().getColor())) ? false : true;
        return liveUserInfo;
    }
}
