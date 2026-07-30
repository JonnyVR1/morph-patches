package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatMicEmojiItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w0n0 {
    /* JADX INFO: renamed from: a */
    public static void m24254a(VoiceChatMicEmojiItemView voiceChatMicEmojiItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatMicEmojiItemView.a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        voiceChatMicEmojiItemView.b = (LinearLayout) viewGroup.getChildAt(1);
        voiceChatMicEmojiItemView.c = (VoiceChatItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceChatMicEmojiItemView.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceChatMicEmojiItemView.e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceChatMicEmojiItemView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceChatMicEmojiItemView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceChatMicEmojiItemView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
