package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.view.KeyboardMediaLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class myq {
    /* JADX INFO: renamed from: a */
    public static void m8293a(KeyboardMediaLayout keyboardMediaLayout, View view) {
        keyboardMediaLayout.a = (KeyboardMediaLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        keyboardMediaLayout.b = viewGroup.getChildAt(0);
        keyboardMediaLayout.c = viewGroup.getChildAt(1);
    }
}
