package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiItemView;

/* JADX INFO: loaded from: classes5.dex */
public class d1o0 extends s0o0<VoiceMicEmojiItemView> {
    public d1o0(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        super(bLiveVoiceEmojiMenuButton);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceMicEmojiItemView voiceMicEmojiItemView) {
        super.m181875J(voiceMicEmojiItemView);
        if (this.f161791a.icon.size() > 0) {
            voiceMicEmojiItemView.setImageUrl(this.f161791a.icon.get(0));
        }
        if (TextUtils.isEmpty(this.f161791a.name)) {
            return;
        }
        voiceMicEmojiItemView.setText(this.f161791a.name);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168173R9;
    }
}
