package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.vtl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wtl0 {
    /* JADX INFO: renamed from: a */
    public static void m25480a(vtl0 vtl0Var, View view) {
        vtl0Var.k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vtl0Var.l = viewGroup.getChildAt(0);
        vtl0Var.m = viewGroup.getChildAt(1);
        vtl0Var.n = (ImageView) viewGroup.getChildAt(2);
        vtl0Var.o = (TextView) viewGroup.getChildAt(3);
        vtl0Var.p = (ScrollView) viewGroup.getChildAt(4);
        vtl0Var.q = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        vtl0Var.r = (TextView) viewGroup.getChildAt(5);
    }
}
