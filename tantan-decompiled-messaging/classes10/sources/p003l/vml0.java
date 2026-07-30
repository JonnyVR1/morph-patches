package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.uml0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vml0 {
    /* JADX INFO: renamed from: a */
    public static void m10248a(uml0 uml0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uml0Var.a = viewGroup.getChildAt(0);
        uml0Var.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        uml0Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        uml0Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        uml0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        uml0Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        uml0Var.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        uml0Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        uml0Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10249b(uml0 uml0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Pc, viewGroup, false);
        m10248a(uml0Var, viewInflate);
        return viewInflate;
    }
}
