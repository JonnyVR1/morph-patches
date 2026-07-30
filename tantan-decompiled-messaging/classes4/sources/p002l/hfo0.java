package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.gfo0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hfo0 {
    /* JADX INFO: renamed from: a */
    public static void m14364a(gfo0 gfo0Var, View view) {
        gfo0Var.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gfo0Var.b = viewGroup.getChildAt(0);
        gfo0Var.c = (RelativeLayout) viewGroup.getChildAt(1);
        gfo0Var.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gfo0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gfo0Var.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        gfo0Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        gfo0Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        gfo0Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        gfo0Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        gfo0Var.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m14365b(gfo0 gfo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19829e9, viewGroup, false);
        m14364a(gfo0Var, viewInflate);
        return viewInflate;
    }
}
