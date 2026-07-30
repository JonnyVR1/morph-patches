package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VSearchBar;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class pr3 {
    /* JADX INFO: renamed from: a */
    public static void m170987a(or3 or3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        or3Var.f145221c = (VRecyclerView) viewGroup.getChildAt(0);
        or3Var.f145222d = (ConstraintLayout) viewGroup.getChildAt(1);
        or3Var.f145223e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        or3Var.f145224f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        or3Var.f145225g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        or3Var.f145226h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        or3Var.f145227i = viewGroup.getChildAt(2);
        or3Var.f145228j = (VSearchBar) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m170988b(or3 or3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79507k, viewGroup, false);
        m170987a(or3Var, viewInflate);
        return viewInflate;
    }
}
