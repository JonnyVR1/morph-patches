package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import l.yae0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zae0 {
    /* JADX INFO: renamed from: a */
    public static void m11383a(yae0 yae0Var, View view) {
        yae0Var.a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yae0Var.b = viewGroup.getChildAt(0);
        yae0Var.c = (TextView) viewGroup.getChildAt(1);
        yae0Var.d = (LinearLayout) viewGroup.getChildAt(2);
        yae0Var.e = (TextView) viewGroup.getChildAt(3);
        yae0Var.f = (TextView) viewGroup.getChildAt(4);
        yae0Var.g = (Space) viewGroup.getChildAt(5);
    }
}
