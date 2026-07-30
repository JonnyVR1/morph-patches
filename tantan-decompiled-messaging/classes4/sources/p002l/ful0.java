package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.eul0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ful0 {
    /* JADX INFO: renamed from: a */
    public static void m13485a(eul0 eul0Var, View view) {
        eul0Var.l = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eul0Var.m = viewGroup.getChildAt(0);
        eul0Var.n = viewGroup.getChildAt(1);
        eul0Var.o = viewGroup.getChildAt(2);
        eul0Var.p = (ImageView) viewGroup.getChildAt(3);
        eul0Var.q = (TextView) viewGroup.getChildAt(4);
        eul0Var.r = (ScrollView) viewGroup.getChildAt(5);
        eul0Var.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        eul0Var.t = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        eul0Var.u = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        eul0Var.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(3);
    }
}
