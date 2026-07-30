package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class rpo0 {
    /* JADX INFO: renamed from: a */
    public static void m180372a(qpo0 qpo0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qpo0Var.f155788x = (LinearLayout) viewGroup.getChildAt(0);
        qpo0Var.f155789y = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qpo0Var.f155790z = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qpo0Var.f155784A = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qpo0Var.f155785B = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        qpo0Var.f155786C = (ImageView) viewGroup.getChildAt(1);
    }
}
