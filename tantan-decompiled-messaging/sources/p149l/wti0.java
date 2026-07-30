package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wti0 {
    /* JADX INFO: renamed from: a */
    public static void m205538a(vti0 vti0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vti0Var.f182952k = viewGroup.getChildAt(0);
        vti0Var.f182953l = (ConstraintLayout) viewGroup.getChildAt(1);
        vti0Var.f182954m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vti0Var.f182955n = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vti0Var.f182956o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vti0Var.f182957p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        vti0Var.f182958q = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        vti0Var.f182959r = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        vti0Var.f182960s = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        vti0Var.f182961t = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        vti0Var.f182962u = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        vti0Var.f182963v = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        vti0Var.f182964w = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        vti0Var.f182965x = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        vti0Var.f182966y = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
        vti0Var.f182967z = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14);
        vti0Var.f182948A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15);
    }

    /* JADX INFO: renamed from: b */
    public static View m205539b(vti0 vti0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168304c6, viewGroup, false);
        m205538a(vti0Var, viewInflate);
        return viewInflate;
    }
}
