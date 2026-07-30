package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;

/* JADX INFO: loaded from: classes4.dex */
public class jwn0 extends vp2<LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage> {
    public jwn0(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage, String str) {
        return !TextUtils.isEmpty(voiceVirtualAvatarInitNoticeMessage.getContent());
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage, String str2) {
        LiveUserInfo liveUserInfoM143664z = m143664z(voiceVirtualAvatarInitNoticeMessage);
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.virtualAvatarNoticeMsg = voiceVirtualAvatarInitNoticeMessage;
        VoiceVirtualApi.reportVirtualAvatars();
        return m199208m(null, str, voiceVirtualAvatarInitNoticeMessage.getTemplateData().getId(), liveUserInfoM143664z, null, voiceVirtualAvatarInitNoticeMessage.getTemplateData(), extInfo, null, LiveMessage.VOICE_CHAT_VIRTUAL_NOTICE_CATEGORY);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage> mo94398b() {
        return LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "tricks.voice.virtual.avatar.init.notice";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m143664z(LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage) {
        return new LiveUserInfo(voiceVirtualAvatarInitNoticeMessage.getUserMask().getUserId(), voiceVirtualAvatarInitNoticeMessage.getUserMask().getName(), rxn0.m181617a(voiceVirtualAvatarInitNoticeMessage.getUserMask()));
    }
}
