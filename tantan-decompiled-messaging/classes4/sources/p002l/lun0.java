package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import l.rxn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lun0 extends vp2<VoiceMicEmoji.VoiceEmojiPlayMessage> {
    public lun0(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceMicEmoji.VoiceEmojiPlayMessage voiceEmojiPlayMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, VoiceMicEmoji.VoiceEmojiPlayMessage voiceEmojiPlayMessage, String str2) {
        return m24091m(null, str, voiceEmojiPlayMessage.getTempdata().getId(), m17468z(voiceEmojiPlayMessage), null, voiceEmojiPlayMessage.getTempdata(), new LiveMessage.ExtInfo(), null, LiveMessage.VOICE_CHAT_MIC_EMOJI_CATEGORY);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceMicEmoji.VoiceEmojiPlayMessage> mo9244b() {
        return VoiceMicEmoji.VoiceEmojiPlayMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.tricks.emojiPlayMsg";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m17468z(VoiceMicEmoji.VoiceEmojiPlayMessage voiceEmojiPlayMessage) {
        LiveUserInfo liveUserInfo = new LiveUserInfo(voiceEmojiPlayMessage.getUserMask().getUserId(), voiceEmojiPlayMessage.getUserMask().getName(), rxn0.a(voiceEmojiPlayMessage.getUserMask()));
        liveUserInfo.emojiType = voiceEmojiPlayMessage.getEmojiType();
        liveUserInfo.emojiResult = voiceEmojiPlayMessage.getResultList();
        liveUserInfo.mid = voiceEmojiPlayMessage.getMid();
        liveUserInfo.isMaskMode = (voiceEmojiPlayMessage.getUserMask() == null || voiceEmojiPlayMessage.getUserMask().getVoiceMaskModeAddition() == null || TextUtils.isEmpty(voiceEmojiPlayMessage.getUserMask().getVoiceMaskModeAddition().getColor())) ? false : true;
        return liveUserInfo;
    }
}
