package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class e0b0 {
    /* JADX INFO: renamed from: a */
    public static void m114172a(d0b0 d0b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d0b0Var.f83164i = viewGroup.getChildAt(0);
        d0b0Var.f83165j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        d0b0Var.f83166k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        d0b0Var.f83167l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        d0b0Var.f83168m = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        d0b0Var.f83169n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m114173b(d0b0 d0b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168401k, viewGroup, false);
        m114172a(d0b0Var, viewInflate);
        return viewInflate;
    }
}
