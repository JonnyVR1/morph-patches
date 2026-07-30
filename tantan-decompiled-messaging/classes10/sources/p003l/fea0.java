package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.eea0;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fea0 {
    /* JADX INFO: renamed from: a */
    public static void m6469a(eea0 eea0Var, View view) {
        eea0Var.a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eea0Var.b = viewGroup.getChildAt(0);
        eea0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        eea0Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        eea0Var.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        eea0Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        eea0Var.g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        eea0Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        eea0Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6470b(eea0 eea0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ca, viewGroup, false);
        m6469a(eea0Var, viewInflate);
        return viewInflate;
    }
}
