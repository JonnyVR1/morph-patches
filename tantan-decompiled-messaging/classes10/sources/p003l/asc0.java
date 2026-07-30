package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.m6c0;
import l.zrc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class asc0 {
    /* JADX INFO: renamed from: a */
    public static void m5622a(zrc0 zrc0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zrc0Var.a = viewGroup.getChildAt(0);
        zrc0Var.b = viewGroup.getChildAt(1);
        zrc0Var.c = (LinearLayout) viewGroup.getChildAt(2);
        zrc0Var.d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        zrc0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        zrc0Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        zrc0Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        zrc0Var.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        zrc0Var.i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        zrc0Var.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        zrc0Var.k = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        zrc0Var.l = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        zrc0Var.m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        zrc0Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        zrc0Var.o = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(2);
        zrc0Var.p = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m5623b(zrc0 zrc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.Y1, viewGroup, false);
        m5622a(zrc0Var, viewInflate);
        return viewInflate;
    }
}
