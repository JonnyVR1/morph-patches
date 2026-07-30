package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiDynamicItemView;

/* JADX INFO: loaded from: classes5.dex */
public class x0o0 extends s0o0<VoiceMicEmojiDynamicItemView> {
    public x0o0(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        super(bLiveVoiceEmojiMenuButton);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceMicEmojiDynamicItemView voiceMicEmojiDynamicItemView) {
        super.m181875J(voiceMicEmojiDynamicItemView);
        if (this.f161791a.icon.size() > 0) {
            voiceMicEmojiDynamicItemView.setImageUrl(this.f161791a.icon.get(0));
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168149P9;
    }
}
