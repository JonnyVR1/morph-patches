package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ckj0 {
    /* JADX INFO: renamed from: a */
    public static void m107417a(bkj0 bkj0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bkj0Var.f76033a = (VFrame) viewGroup.getChildAt(0);
        bkj0Var.f76034b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bkj0Var.f76035c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        bkj0Var.f76036d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        bkj0Var.f76037e = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bkj0Var.f76038f = (VPullUpRecyclerView) viewGroup.getChildAt(1);
        bkj0Var.f76039g = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m107418b(bkj0 bkj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121326P1, viewGroup, false);
        m107417a(bkj0Var, viewInflate);
        return viewInflate;
    }
}
