package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VButton;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cy4 {
    /* JADX INFO: renamed from: a */
    public static void m109129a(by4 by4Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        by4Var.f77853a = viewGroup.getChildAt(0);
        by4Var.f77854b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        by4Var.f77855c = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        by4Var.f77856d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        by4Var.f77857e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        by4Var.f77858f = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(0);
        by4Var.f77859g = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
        by4Var.f77860h = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m109130b(by4 by4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168272a0, viewGroup, false);
        m109129a(by4Var, viewInflate);
        return viewInflate;
    }
}
