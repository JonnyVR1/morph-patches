package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class a1o0 {
    /* JADX INFO: renamed from: a */
    public static void m94572a(VoiceMicEmojiItemView voiceMicEmojiItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMicEmojiItemView.f53115a = (FrameLayout) viewGroup.getChildAt(0);
        voiceMicEmojiItemView.f53116b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceMicEmojiItemView.f53117c = (VText) viewGroup.getChildAt(1);
    }
}
