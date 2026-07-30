package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VButton;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class wbd0 {
    /* JADX INFO: renamed from: a */
    public static void m205710a(vbd0 vbd0Var, View view) {
        vbd0Var.f183226a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vbd0Var.f183227b = (VNavigationBar) viewGroup.getChildAt(0);
        vbd0Var.f183228c = (RecyclerView) viewGroup.getChildAt(1);
        vbd0Var.f183229d = viewGroup.getChildAt(2);
        vbd0Var.f183230e = viewGroup.getChildAt(3);
        vbd0Var.f183231f = (VButton) viewGroup.getChildAt(4);
        vbd0Var.f183232g = (Group) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m205711b(vbd0 vbd0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193893n1, viewGroup, false);
        m205710a(vbd0Var, viewInflate);
        return viewInflate;
    }
}
