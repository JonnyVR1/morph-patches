package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.f6c0;
import l.gh00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hh00 {
    /* JADX INFO: renamed from: a */
    public static void m6958a(gh00 gh00Var, View view) {
        gh00Var.a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gh00Var.b = (RelativeLayout) viewGroup.getChildAt(0);
        gh00Var.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        gh00Var.d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gh00Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        gh00Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        gh00Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        gh00Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        gh00Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        gh00Var.j = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        gh00Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        gh00Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        gh00Var.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        gh00Var.n = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6959b(gh00 gh00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.z7, viewGroup, false);
        m6958a(gh00Var, viewInflate);
        return viewInflate;
    }
}
