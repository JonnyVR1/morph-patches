package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import l.rxn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jwn0 extends vp2<LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage> {
    public jwn0(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage, String str) {
        return !TextUtils.isEmpty(voiceVirtualAvatarInitNoticeMessage.getContent());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage, String str2) {
        LiveUserInfo liveUserInfoM16391z = m16391z(voiceVirtualAvatarInitNoticeMessage);
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.virtualAvatarNoticeMsg = voiceVirtualAvatarInitNoticeMessage;
        VoiceVirtualApi.reportVirtualAvatars();
        return m24091m(null, str, voiceVirtualAvatarInitNoticeMessage.getTemplateData().getId(), liveUserInfoM16391z, null, voiceVirtualAvatarInitNoticeMessage.getTemplateData(), extInfo, null, LiveMessage.VOICE_CHAT_VIRTUAL_NOTICE_CATEGORY);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage> mo9244b() {
        return LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "tricks.voice.virtual.avatar.init.notice";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m16391z(LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage) {
        return new LiveUserInfo(voiceVirtualAvatarInitNoticeMessage.getUserMask().getUserId(), voiceVirtualAvatarInitNoticeMessage.getUserMask().getName(), rxn0.a(voiceVirtualAvatarInitNoticeMessage.getUserMask()));
    }
}
