package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class z8e0 {
    /* JADX INFO: renamed from: a */
    public static void m217594a(y8e0 y8e0Var, View view) {
        y8e0Var.f196815a = (VList) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m217595b(y8e0 y8e0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95334E3, viewGroup, false);
        m217594a(y8e0Var, viewInflate);
        return viewInflate;
    }
}
