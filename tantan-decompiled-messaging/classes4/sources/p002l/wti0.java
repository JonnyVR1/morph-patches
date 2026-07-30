package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wti0 {
    /* JADX INFO: renamed from: a */
    public static void m25478a(vti0 vti0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vti0Var.f21302k = viewGroup.getChildAt(0);
        vti0Var.f21303l = viewGroup.getChildAt(1);
        vti0Var.f21304m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vti0Var.f21305n = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vti0Var.f21306o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vti0Var.f21307p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        vti0Var.f21308q = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        vti0Var.f21309r = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        vti0Var.f21310s = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        vti0Var.f21311t = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        vti0Var.f21312u = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        vti0Var.f21313v = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        vti0Var.f21314w = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        vti0Var.f21315x = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        vti0Var.f21316y = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
        vti0Var.f21317z = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14);
        vti0Var.f21298A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15);
    }

    /* JADX INFO: renamed from: b */
    public static View m25479b(vti0 vti0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19800c6, viewGroup, false);
        m25478a(vti0Var, viewInflate);
        return viewInflate;
    }
}
