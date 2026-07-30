package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class oe90 {
    /* JADX INFO: renamed from: a */
    public static void m163935a(ne90 ne90Var, View view) {
        ne90Var.f138595u = (FrameLayout) view;
        ne90Var.f138596v = (FrameLayout) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m163936b(ne90 ne90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95861k9, viewGroup, false);
        m163935a(ne90Var, viewInflate);
        return viewInflate;
    }
}
