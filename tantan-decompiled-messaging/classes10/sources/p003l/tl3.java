package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import l.sl3;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tl3 {
    /* JADX INFO: renamed from: a */
    public static void m9587a(sl3 sl3Var, View view) {
        sl3Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sl3Var.b = viewGroup.getChildAt(0);
        sl3Var.c = (FrameLayout) viewGroup.getChildAt(1);
        sl3Var.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sl3Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sl3Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        sl3Var.g = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sl3Var.h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        sl3Var.i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        sl3Var.j = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9588b(sl3 sl3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5540f, viewGroup, false);
        m9587a(sl3Var, viewInflate);
        return viewInflate;
    }
}
