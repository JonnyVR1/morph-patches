package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kwm0 {
    /* JADX INFO: renamed from: a */
    public static void m147599a(VoiceChatBottomView voiceChatBottomView, View view) {
        voiceChatBottomView.f53014a = (VoiceChatBottomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatBottomView.f53015b = (VText) viewGroup.getChildAt(0);
        voiceChatBottomView.f53016c = (ImageView) viewGroup.getChildAt(1);
    }
}
