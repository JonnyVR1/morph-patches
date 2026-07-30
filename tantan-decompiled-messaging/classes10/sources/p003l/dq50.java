package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.cq50;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dq50 {
    /* JADX INFO: renamed from: a */
    public static void m6192a(cq50 cq50Var, View view) {
        cq50Var.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cq50Var.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cq50Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cq50Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cq50Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        cq50Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        cq50Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        cq50Var.h = viewGroup.getChildAt(1);
        cq50Var.i = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6193b(cq50 cq50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ne, viewGroup, false);
        m6192a(cq50Var, viewInflate);
        return viewInflate;
    }
}
