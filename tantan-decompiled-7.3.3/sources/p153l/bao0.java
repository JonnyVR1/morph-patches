package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiDynamicItemView;

/* JADX INFO: loaded from: classes5.dex */
public class bao0 extends w9o0<VoiceMicEmojiDynamicItemView> {
    public bao0(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        super(bLiveVoiceEmojiMenuButton);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceMicEmojiDynamicItemView voiceMicEmojiDynamicItemView) {
        super.m205609J(voiceMicEmojiDynamicItemView);
        if (this.f188043a.icon.size() > 0) {
            voiceMicEmojiDynamicItemView.setImageUrl(this.f188043a.icon.get(0));
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198881P9;
    }
}
