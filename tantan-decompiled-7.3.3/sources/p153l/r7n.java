package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.chat.input.ChatInputViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r7n {
    /* JADX INFO: renamed from: a */
    public static void m180161a(q7n q7nVar, View view) {
        q7nVar.f155977k = (VoiceChatKeyboardRoot) view;
        ViewGroup viewGroup = (ViewGroup) view;
        q7nVar.f155978l = (FrameLayout) viewGroup.getChildAt(0);
        q7nVar.f155979m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        q7nVar.f155980n = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        q7nVar.f155981o = (ChatInputViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        q7nVar.f155982p = (CheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        q7nVar.f155983q = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        q7nVar.f155984r = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        q7nVar.f155985s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        q7nVar.f155986t = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }
}
