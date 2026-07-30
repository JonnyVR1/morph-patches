package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kwm0 {
    /* JADX INFO: renamed from: a */
    public static void m16837a(VoiceChatBottomView voiceChatBottomView, View view) {
        voiceChatBottomView.a = (VoiceChatBottomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatBottomView.b = viewGroup.getChildAt(0);
        voiceChatBottomView.c = (ImageView) viewGroup.getChildAt(1);
    }
}
