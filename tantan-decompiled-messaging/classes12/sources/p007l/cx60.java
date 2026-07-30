package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cx60 {
    /* JADX INFO: renamed from: a */
    public static void m9249a(bx60 bx60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bx60Var.f6448o = viewGroup.getChildAt(0);
        bx60Var.f6449p = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bx60Var.f6450q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bx60Var.f6451r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        bx60Var.f6452s = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bx60Var.f6453t = view.findViewById(b5c0.f6105y);
        ViewGroup viewGroup2 = (ViewGroup) view;
        bx60Var.f6454u = viewGroup2.getChildAt(2);
        bx60Var.f6455v = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        bx60Var.f6456w = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1);
        bx60Var.f6457x = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9250b(bx60 bx60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11261m5, viewGroup, false);
        m9249a(bx60Var, viewInflate);
        return viewInflate;
    }
}
