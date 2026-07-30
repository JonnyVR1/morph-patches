package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.Keyboard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class szq {
    /* JADX INFO: renamed from: a */
    public static void m9516a(Keyboard keyboard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        keyboard.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        keyboard.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        keyboard.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        keyboard.i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        keyboard.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        keyboard.k = viewGroup.getChildAt(1);
        keyboard.l = viewGroup.getChildAt(2);
        keyboard.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
