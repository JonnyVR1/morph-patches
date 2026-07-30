package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class tj4 {
    /* JADX INFO: renamed from: a */
    public static void m189243a(sj4 sj4Var, View view) {
        sj4Var.f164782a = (FrameLayout) view;
        sj4Var.f164783b = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m189244b(sj4 sj4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(i6c0.f111727v, viewGroup, false);
        m189243a(sj4Var, viewInflate);
        return viewInflate;
    }
}
