package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class hn0 {
    /* JADX INFO: renamed from: a */
    public static void m131809a(gn0 gn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gn0Var.f103562k = viewGroup.getChildAt(0);
        gn0Var.f103563l = (LinearLayout) viewGroup.getChildAt(1);
        gn0Var.f103564m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        gn0Var.f103565n = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        gn0Var.f103566o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        gn0Var.f103567p = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m131810b(gn0 gn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168526t7, viewGroup, false);
        m131809a(gn0Var, viewInflate);
        return viewInflate;
    }
}
