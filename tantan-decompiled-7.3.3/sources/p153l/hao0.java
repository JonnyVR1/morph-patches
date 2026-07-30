package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiItemView;

/* JADX INFO: loaded from: classes5.dex */
public class hao0 extends w9o0<VoiceMicEmojiItemView> {
    public hao0(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        super(bLiveVoiceEmojiMenuButton);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceMicEmojiItemView voiceMicEmojiItemView) {
        super.m205609J(voiceMicEmojiItemView);
        if (this.f188043a.icon.size() > 0) {
            voiceMicEmojiItemView.setImageUrl(this.f188043a.icon.get(0));
        }
        if (TextUtils.isEmpty(this.f188043a.name)) {
            return;
        }
        voiceMicEmojiItemView.setText(this.f188043a.name);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198905R9;
    }
}
