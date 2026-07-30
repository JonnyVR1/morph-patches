package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.zl90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class am90 {
    /* JADX INFO: renamed from: a */
    public static void m5433a(zl90 zl90Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zl90Var.v = viewGroup.getChildAt(0);
        zl90Var.w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5434b(zl90 zl90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.V9, viewGroup, false);
        m5433a(zl90Var, viewInflate);
        return viewInflate;
    }
}
