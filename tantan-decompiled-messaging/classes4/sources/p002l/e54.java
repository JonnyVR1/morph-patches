package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.d54;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e54 {
    /* JADX INFO: renamed from: a */
    public static void m12188a(d54 d54Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d54Var.a = viewGroup.getChildAt(0);
        d54Var.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        d54Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        d54Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        d54Var.e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m12189b(d54 d54Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19587L, viewGroup, false);
        m12188a(d54Var, viewInflate);
        return viewInflate;
    }
}
