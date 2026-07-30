package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.d34;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e34 {
    /* JADX INFO: renamed from: a */
    public static void m12156a(d34 d34Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d34Var.a = viewGroup.getChildAt(0);
        d34Var.b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        d34Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        d34Var.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        d34Var.e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        d34Var.f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m12157b(d34 d34Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19563J, viewGroup, false);
        m12156a(d34Var, viewInflate);
        return viewInflate;
    }
}
