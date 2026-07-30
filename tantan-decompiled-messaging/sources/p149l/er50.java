package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class er50 {
    /* JADX INFO: renamed from: a */
    public static void m117823a(dr50 dr50Var, View view) {
        dr50Var.f87580a = (VRecyclerView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m117824b(dr50 dr50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95928o8, viewGroup, false);
        m117823a(dr50Var, viewInflate);
        return viewInflate;
    }
}
