package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class am90 {
    /* JADX INFO: renamed from: a */
    public static void m97530a(zl90 zl90Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zl90Var.f203608v = (VRelative) viewGroup.getChildAt(0);
        zl90Var.f203609w = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m97531b(zl90 zl90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95612V9, viewGroup, false);
        m97530a(zl90Var, viewInflate);
        return viewInflate;
    }
}
