package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import l.gti0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hti0 {
    /* JADX INFO: renamed from: a */
    public static void m7076a(gti0 gti0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gti0Var.a = (FrameLayout) viewGroup.getChildAt(0);
        gti0Var.b = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        gti0Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        gti0Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        gti0Var.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gti0Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        gti0Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        gti0Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m7077b(gti0 gti0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5480M1, viewGroup, true);
        m7076a(gti0Var, viewInflate);
        return viewInflate;
    }
}
