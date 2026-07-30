package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;

/* JADX INFO: loaded from: classes4.dex */
public class p3o0 extends mq2<VoiceMicEmoji.VoiceEmojiPlayMessage> {
    public p3o0(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceMicEmoji.VoiceEmojiPlayMessage voiceEmojiPlayMessage, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, VoiceMicEmoji.VoiceEmojiPlayMessage voiceEmojiPlayMessage, String str2) {
        return m159456m(null, str, voiceEmojiPlayMessage.getTempdata().getId(), m170504z(voiceEmojiPlayMessage), null, voiceEmojiPlayMessage.getTempdata(), new LiveMessage.ExtInfo(), null, LiveMessage.VOICE_CHAT_MIC_EMOJI_CATEGORY);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceMicEmoji.VoiceEmojiPlayMessage> mo95510b() {
        return VoiceMicEmoji.VoiceEmojiPlayMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.tricks.emojiPlayMsg";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m170504z(VoiceMicEmoji.VoiceEmojiPlayMessage voiceEmojiPlayMessage) {
        LiveUserInfo liveUserInfo = new LiveUserInfo(voiceEmojiPlayMessage.getUserMask().getUserId(), voiceEmojiPlayMessage.getUserMask().getName(), v6o0.m200134a(voiceEmojiPlayMessage.getUserMask()));
        liveUserInfo.emojiType = voiceEmojiPlayMessage.getEmojiType();
        liveUserInfo.emojiResult = voiceEmojiPlayMessage.getResultList();
        liveUserInfo.mid = voiceEmojiPlayMessage.getMid();
        liveUserInfo.isMaskMode = (voiceEmojiPlayMessage.getUserMask() == null || voiceEmojiPlayMessage.getUserMask().getVoiceMaskModeAddition() == null || TextUtils.isEmpty(voiceEmojiPlayMessage.getUserMask().getVoiceMaskModeAddition().getColor())) ? false : true;
        return liveUserInfo;
    }
}
