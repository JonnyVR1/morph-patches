package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.chat.input.ChatInputViewGroup;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import l.q5n;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r5n {
    /* JADX INFO: renamed from: a */
    public static void m21778a(q5n q5nVar, View view) {
        q5nVar.k = (VoiceChatKeyboardRoot) view;
        ViewGroup viewGroup = (ViewGroup) view;
        q5nVar.l = (FrameLayout) viewGroup.getChildAt(0);
        q5nVar.m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        q5nVar.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        q5nVar.o = (ChatInputViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        q5nVar.p = (CheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        q5nVar.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        q5nVar.r = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        q5nVar.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        q5nVar.t = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }
}
