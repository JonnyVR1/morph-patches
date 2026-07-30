package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class dg4 {
    /* JADX INFO: renamed from: a */
    public static void m111607a(cg4 cg4Var, View view) {
        cg4Var.f80700a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cg4Var.f80701b = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cg4Var.f80702c = (VText) viewGroup.getChildAt(1);
        cg4Var.f80703d = (LinearLayout) viewGroup.getChildAt(2);
        cg4Var.f80704e = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cg4Var.f80705f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        cg4Var.f80706g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m111608b(cg4 cg4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142220j4, viewGroup, false);
        m111607a(cg4Var, viewInflate);
        return viewInflate;
    }
}
