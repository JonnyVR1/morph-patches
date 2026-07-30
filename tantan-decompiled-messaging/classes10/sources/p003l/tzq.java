package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.Keyboard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tzq {
    /* JADX INFO: renamed from: a */
    public static void m9636a(Keyboard keyboard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        keyboard.a = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        keyboard.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        keyboard.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        keyboard.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        keyboard.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
