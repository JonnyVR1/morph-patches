package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.chat.input.ChatInputViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r5n {
    /* JADX INFO: renamed from: a */
    public static void m177955a(q5n q5nVar, View view) {
        q5nVar.f152797k = (VoiceChatKeyboardRoot) view;
        ViewGroup viewGroup = (ViewGroup) view;
        q5nVar.f152798l = (FrameLayout) viewGroup.getChildAt(0);
        q5nVar.f152799m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        q5nVar.f152800n = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        q5nVar.f152801o = (ChatInputViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        q5nVar.f152802p = (CheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        q5nVar.f152803q = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        q5nVar.f152804r = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        q5nVar.f152805s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        q5nVar.f152806t = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }
}
