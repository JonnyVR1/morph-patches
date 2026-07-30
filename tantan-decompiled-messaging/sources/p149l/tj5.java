package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class tj5 {
    /* JADX INFO: renamed from: a */
    public static void m189248a(sj5 sj5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sj5Var.f164784h = viewGroup.getChildAt(0);
        sj5Var.f164785i = (LinearLayout) viewGroup.getChildAt(1);
        sj5Var.f164786j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sj5Var.f164787k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sj5Var.f164788l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sj5Var.f164789m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        sj5Var.f164790n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m189249b(sj5 sj5Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95818i, viewGroup, false);
        m189248a(sj5Var, viewInflate);
        return viewInflate;
    }
}
