package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.f6c0;
import l.yf90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zf90 {
    /* JADX INFO: renamed from: a */
    public static void m11393a(yf90 yf90Var, View view) {
        yf90Var.a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yf90Var.b = viewGroup.getChildAt(0);
        yf90Var.c = (RelativeLayout) viewGroup.getChildAt(1);
        yf90Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yf90Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        yf90Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        yf90Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        yf90Var.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        yf90Var.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        yf90Var.j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        yf90Var.k = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        yf90Var.l = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        yf90Var.m = (LinearLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m11394b(yf90 yf90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.xa, viewGroup, false);
        m11393a(yf90Var, viewInflate);
        return viewInflate;
    }
}
