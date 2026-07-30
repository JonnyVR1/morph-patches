package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.iuo0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class juo0 {
    /* JADX INFO: renamed from: a */
    public static void m16269a(iuo0 iuo0Var, View view) {
        iuo0Var.e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        iuo0Var.f = viewGroup.getChildAt(0);
        iuo0Var.g = (LinearLayout) viewGroup.getChildAt(1);
        iuo0Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iuo0Var.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m16270b(iuo0 iuo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19841f8, viewGroup, false);
        m16269a(iuo0Var, viewInflate);
        return viewInflate;
    }
}
