package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.dk6;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ek6 {
    /* JADX INFO: renamed from: a */
    public static void m6302a(dk6 dk6Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dk6Var.a = (FrameLayout) viewGroup.getChildAt(0);
        dk6Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dk6Var.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dk6Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        dk6Var.e = (LinearLayout) viewGroup.getChildAt(1);
        dk6Var.f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        dk6Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dk6Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        dk6Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        dk6Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6303b(dk6 dk6Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Y1, viewGroup, false);
        m6302a(dk6Var, viewInflate);
        return viewInflate;
    }
}
