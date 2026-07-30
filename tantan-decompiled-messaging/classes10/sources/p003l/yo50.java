package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.vo50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yo50 {
    /* JADX INFO: renamed from: a */
    public static void m11269a(vo50 vo50Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vo50Var.b = (RelativeLayout) viewGroup.getChildAt(0);
        vo50Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vo50Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        vo50Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        vo50Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vo50Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vo50Var.h = (RelativeLayout) viewGroup.getChildAt(1);
        vo50Var.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vo50Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vo50Var.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vo50Var.l = (FrameLayout) viewGroup.getChildAt(2);
        vo50Var.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vo50Var.n = view.findViewById(x4c0.f8346p);
        vo50Var.o = (TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11270b(vo50 vo50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5515Y0, viewGroup, false);
        m11269a(vo50Var, viewInflate);
        return viewInflate;
    }
}
