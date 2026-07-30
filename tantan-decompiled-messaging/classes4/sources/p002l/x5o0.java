package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.w5o0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x5o0 {
    /* JADX INFO: renamed from: a */
    public static void m25685a(w5o0 w5o0Var, View view) {
        w5o0Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w5o0Var.b = viewGroup.getChildAt(0);
        w5o0Var.c = (ImageView) viewGroup.getChildAt(1);
        w5o0Var.d = (TextView) viewGroup.getChildAt(2);
        w5o0Var.e = viewGroup.getChildAt(3);
        w5o0Var.f = viewGroup.getChildAt(4);
        w5o0Var.g = (Button) viewGroup.getChildAt(5);
        w5o0Var.h = viewGroup.getChildAt(6);
        w5o0Var.i = (TextView) viewGroup.getChildAt(7);
        w5o0Var.j = (TextView) viewGroup.getChildAt(8);
        w5o0Var.k = (LinearLayout) viewGroup.getChildAt(9);
        w5o0Var.l = (Button) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m25686b(w5o0 w5o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19619N7, viewGroup, false);
        m25685a(w5o0Var, viewInflate);
        return viewInflate;
    }
}
