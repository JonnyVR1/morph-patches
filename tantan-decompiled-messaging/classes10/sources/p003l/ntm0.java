package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import l.mtm0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ntm0 {
    /* JADX INFO: renamed from: a */
    public static void m8372a(mtm0 mtm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mtm0Var.a = (ImageView) viewGroup.getChildAt(0);
        mtm0Var.b = viewGroup.getChildAt(1);
        mtm0Var.c = viewGroup.getChildAt(2);
        mtm0Var.d = viewGroup.getChildAt(3);
        mtm0Var.e = viewGroup.getChildAt(4);
        mtm0Var.f = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        mtm0Var.g = viewGroup.getChildAt(5);
        mtm0Var.h = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        mtm0Var.i = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        mtm0Var.j = viewGroup.getChildAt(6);
        mtm0Var.k = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        mtm0Var.l = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        mtm0Var.m = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m8373b(mtm0 mtm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5769A4, viewGroup, false);
        m8372a(mtm0Var, viewInflate);
        return viewInflate;
    }
}
