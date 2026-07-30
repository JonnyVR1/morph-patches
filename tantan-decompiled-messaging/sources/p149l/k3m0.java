package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class k3m0 {
    /* JADX INFO: renamed from: a */
    public static void m144412a(j3m0 j3m0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j3m0Var.f116087k = viewGroup.getChildAt(0);
        j3m0Var.f116088l = (ConstraintLayout) viewGroup.getChildAt(1);
        j3m0Var.f116089m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        j3m0Var.f116090n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j3m0Var.f116091o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        j3m0Var.f116092p = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        j3m0Var.f116093q = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
