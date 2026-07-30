package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ppa0 {
    /* JADX INFO: renamed from: a */
    public static void m8788a(opa0 opa0Var, View view) {
        opa0Var.f6705f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        opa0Var.f6706g = viewGroup.getChildAt(0);
        opa0Var.f6707h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        opa0Var.f6708i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        opa0Var.f6709j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        opa0Var.f6710k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        opa0Var.f6711l = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        opa0Var.f6712m = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        opa0Var.f6713n = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m8789b(opa0 opa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ka, viewGroup, false);
        m8788a(opa0Var, viewInflate);
        return viewInflate;
    }
}
