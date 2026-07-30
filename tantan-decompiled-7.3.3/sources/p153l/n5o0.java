package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;

/* JADX INFO: loaded from: classes4.dex */
public class n5o0 extends mq2<LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage> {
    public n5o0(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage, String str) {
        return !TextUtils.isEmpty(voiceVirtualAvatarInitNoticeMessage.getContent());
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage, String str2) {
        LiveUserInfo liveUserInfoM161730z = m161730z(voiceVirtualAvatarInitNoticeMessage);
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.virtualAvatarNoticeMsg = voiceVirtualAvatarInitNoticeMessage;
        VoiceVirtualApi.reportVirtualAvatars();
        return m159456m(null, str, voiceVirtualAvatarInitNoticeMessage.getTemplateData().getId(), liveUserInfoM161730z, null, voiceVirtualAvatarInitNoticeMessage.getTemplateData(), extInfo, null, LiveMessage.VOICE_CHAT_VIRTUAL_NOTICE_CATEGORY);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage> mo95510b() {
        return LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "tricks.voice.virtual.avatar.init.notice";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m161730z(LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage) {
        return new LiveUserInfo(voiceVirtualAvatarInitNoticeMessage.getUserMask().getUserId(), voiceVirtualAvatarInitNoticeMessage.getUserMask().getName(), v6o0.m200134a(voiceVirtualAvatarInitNoticeMessage.getUserMask()));
    }
}
