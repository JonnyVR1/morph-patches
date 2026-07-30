package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.elk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class flk0 {
    /* JADX INFO: renamed from: a */
    public static void m13296a(elk0 elk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        elk0Var.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        elk0Var.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        elk0Var.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        elk0Var.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        elk0Var.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        elk0Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        elk0Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        elk0Var.h = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13297b(elk0 elk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19815d8, viewGroup, false);
        m13296a(elk0Var, viewInflate);
        return viewInflate;
    }
}
