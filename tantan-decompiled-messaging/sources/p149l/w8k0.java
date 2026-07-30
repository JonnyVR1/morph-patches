package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class w8k0 {
    /* JADX INFO: renamed from: a */
    public static void m202187a(v8k0 v8k0Var, View view) {
        v8k0Var.f180549a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        v8k0Var.f180550b = (VNavigationBar) viewGroup.getChildAt(0);
        v8k0Var.f180551c = (RecyclerView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m202188b(v8k0 v8k0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162776m1, viewGroup, false);
        m202187a(v8k0Var, viewInflate);
        return viewInflate;
    }
}
