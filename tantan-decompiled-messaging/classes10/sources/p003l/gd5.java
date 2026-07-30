package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.fd5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gd5 {
    /* JADX INFO: renamed from: a */
    public static void m6626a(fd5 fd5Var, View view) {
        fd5Var.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fd5Var.b = (FrameLayout) viewGroup.getChildAt(0);
        fd5Var.c = (LinearLayout) viewGroup.getChildAt(1);
        fd5Var.d = (LinearLayout) viewGroup.getChildAt(2);
    }
}
