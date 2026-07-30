package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tzm0 {
    /* JADX INFO: renamed from: a */
    public static void m191209a(VoiceChatInputView voiceChatInputView, View view) {
        voiceChatInputView.f53020a = (VoiceChatKeyboardRoot) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatInputView.f53021b = (FrameLayout) viewGroup.getChildAt(0);
        voiceChatInputView.f53022c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceChatInputView.f53023d = (VirtualChatInputTipsView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceChatInputView.f53024e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceChatInputView.f53025f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceChatInputView.f53026g = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceChatInputView.f53027h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceChatInputView.f53028i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceChatInputView.f53029j = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        voiceChatInputView.f53030k = (VPager) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m191210b(VoiceChatInputView voiceChatInputView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168436m8, viewGroup, false);
        m191209a(voiceChatInputView, viewInflate);
        return viewInflate;
    }
}
