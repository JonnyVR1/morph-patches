package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tzm0 {
    /* JADX INFO: renamed from: a */
    public static void m23246a(VoiceChatInputView voiceChatInputView, View view) {
        voiceChatInputView.a = (VoiceChatKeyboardRoot) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatInputView.b = (FrameLayout) viewGroup.getChildAt(0);
        voiceChatInputView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceChatInputView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceChatInputView.e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceChatInputView.f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceChatInputView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceChatInputView.h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceChatInputView.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceChatInputView.j = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        voiceChatInputView.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m23247b(VoiceChatInputView voiceChatInputView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19932m8, viewGroup, false);
        m23246a(voiceChatInputView, viewInflate);
        return viewInflate;
    }
}
