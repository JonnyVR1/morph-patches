package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class o5n0 {
    /* JADX INFO: renamed from: a */
    public static void m166163a(VoiceChatBottomView voiceChatBottomView, View view) {
        voiceChatBottomView.f53862a = (VoiceChatBottomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatBottomView.f53863b = (VText) viewGroup.getChildAt(0);
        voiceChatBottomView.f53864c = (ImageView) viewGroup.getChildAt(1);
    }
}
