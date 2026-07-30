package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class x8n0 {
    /* JADX INFO: renamed from: a */
    public static void m209744a(VoiceChatInputView voiceChatInputView, View view) {
        voiceChatInputView.f53868a = (VoiceChatKeyboardRoot) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceChatInputView.f53869b = (FrameLayout) viewGroup.getChildAt(0);
        voiceChatInputView.f53870c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceChatInputView.f53871d = (VirtualChatInputTipsView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceChatInputView.f53872e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceChatInputView.f53873f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceChatInputView.f53874g = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceChatInputView.f53875h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceChatInputView.f53876i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceChatInputView.f53877j = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        voiceChatInputView.f53878k = (VPager) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m209745b(VoiceChatInputView voiceChatInputView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199168m8, viewGroup, false);
        m209744a(voiceChatInputView, viewInflate);
        return viewInflate;
    }
}
