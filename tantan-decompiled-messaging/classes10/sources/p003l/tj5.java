package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.f6c0;
import l.sj5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tj5 {
    /* JADX INFO: renamed from: a */
    public static void m9581a(sj5 sj5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sj5Var.h = viewGroup.getChildAt(0);
        sj5Var.i = (LinearLayout) viewGroup.getChildAt(1);
        sj5Var.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sj5Var.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sj5Var.l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sj5Var.m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        sj5Var.n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m9582b(sj5 sj5Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.i, viewGroup, false);
        m9581a(sj5Var, viewInflate);
        return viewInflate;
    }
}
