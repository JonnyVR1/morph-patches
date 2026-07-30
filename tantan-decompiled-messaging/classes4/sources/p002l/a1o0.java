package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a1o0 {
    /* JADX INFO: renamed from: a */
    public static void m9271a(VoiceMicEmojiItemView voiceMicEmojiItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMicEmojiItemView.a = (FrameLayout) viewGroup.getChildAt(0);
        voiceMicEmojiItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceMicEmojiItemView.c = viewGroup.getChildAt(1);
    }
}
