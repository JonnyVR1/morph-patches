package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.hf40;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class if40 {
    /* JADX INFO: renamed from: a */
    public static void m7158a(hf40 hf40Var, View view) {
        hf40Var.a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hf40Var.b = viewGroup.getChildAt(0);
        hf40Var.c = viewGroup.getChildAt(1);
        hf40Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hf40Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        hf40Var.f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hf40Var.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        hf40Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        hf40Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        hf40Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        hf40Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        hf40Var.l = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7159b(hf40 hf40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5952b4, viewGroup, false);
        m7158a(hf40Var, viewInflate);
        return viewInflate;
    }
}
