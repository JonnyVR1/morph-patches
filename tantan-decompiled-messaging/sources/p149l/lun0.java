package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;

/* JADX INFO: loaded from: classes4.dex */
public class lun0 extends vp2<VoiceMicEmoji.VoiceEmojiPlayMessage> {
    public lun0(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceMicEmoji.VoiceEmojiPlayMessage voiceEmojiPlayMessage, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, VoiceMicEmoji.VoiceEmojiPlayMessage voiceEmojiPlayMessage, String str2) {
        return m199208m(null, str, voiceEmojiPlayMessage.getTempdata().getId(), m151777z(voiceEmojiPlayMessage), null, voiceEmojiPlayMessage.getTempdata(), new LiveMessage.ExtInfo(), null, LiveMessage.VOICE_CHAT_MIC_EMOJI_CATEGORY);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceMicEmoji.VoiceEmojiPlayMessage> mo94398b() {
        return VoiceMicEmoji.VoiceEmojiPlayMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.tricks.emojiPlayMsg";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m151777z(VoiceMicEmoji.VoiceEmojiPlayMessage voiceEmojiPlayMessage) {
        LiveUserInfo liveUserInfo = new LiveUserInfo(voiceEmojiPlayMessage.getUserMask().getUserId(), voiceEmojiPlayMessage.getUserMask().getName(), rxn0.m181617a(voiceEmojiPlayMessage.getUserMask()));
        liveUserInfo.emojiType = voiceEmojiPlayMessage.getEmojiType();
        liveUserInfo.emojiResult = voiceEmojiPlayMessage.getResultList();
        liveUserInfo.mid = voiceEmojiPlayMessage.getMid();
        liveUserInfo.isMaskMode = (voiceEmojiPlayMessage.getUserMask() == null || voiceEmojiPlayMessage.getUserMask().getVoiceMaskModeAddition() == null || TextUtils.isEmpty(voiceEmojiPlayMessage.getUserMask().getVoiceMaskModeAddition().getColor())) ? false : true;
        return liveUserInfo;
    }
}
