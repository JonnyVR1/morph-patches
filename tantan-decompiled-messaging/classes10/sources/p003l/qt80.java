package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.pt80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qt80 {
    /* JADX INFO: renamed from: a */
    public static void m9033a(pt80 pt80Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pt80Var.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pt80Var.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pt80Var.c = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        pt80Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        pt80Var.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        pt80Var.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        pt80Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        pt80Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        pt80Var.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
