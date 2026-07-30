package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.ljl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mjl0 {
    /* JADX INFO: renamed from: a */
    public static void m8160a(ljl0 ljl0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ljl0Var.a = viewGroup.getChildAt(0);
        ljl0Var.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ljl0Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ljl0Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        ljl0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ljl0Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ljl0Var.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ljl0Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        ljl0Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        ljl0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8161b(ljl0 ljl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.vf, viewGroup, false);
        m8160a(ljl0Var, viewInflate);
        return viewInflate;
    }
}
