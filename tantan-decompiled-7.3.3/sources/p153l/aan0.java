package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatMicEmojiItemView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class aan0 {
    /* JADX INFO: renamed from: a */
    public static void m96653a(VoiceChatMicEmojiItemView voiceChatMicEmojiItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatMicEmojiItemView.f53902a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        voiceChatMicEmojiItemView.f53903b = (LinearLayout) viewGroup.getChildAt(1);
        voiceChatMicEmojiItemView.f53904c = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceChatMicEmojiItemView.f53905d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceChatMicEmojiItemView.f53906e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceChatMicEmojiItemView.f53907f = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceChatMicEmojiItemView.f53908g = (VoiceTripleDiceView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceChatMicEmojiItemView.f53909h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
