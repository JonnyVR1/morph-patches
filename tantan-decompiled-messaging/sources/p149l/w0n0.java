package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatMicEmojiItemView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class w0n0 {
    /* JADX INFO: renamed from: a */
    public static void m200896a(VoiceChatMicEmojiItemView voiceChatMicEmojiItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatMicEmojiItemView.f53054a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        voiceChatMicEmojiItemView.f53055b = (LinearLayout) viewGroup.getChildAt(1);
        voiceChatMicEmojiItemView.f53056c = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceChatMicEmojiItemView.f53057d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceChatMicEmojiItemView.f53058e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceChatMicEmojiItemView.f53059f = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceChatMicEmojiItemView.f53060g = (VoiceTripleDiceView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceChatMicEmojiItemView.f53061h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
