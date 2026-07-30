package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.fgk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ggk0 {
    /* JADX INFO: renamed from: a */
    public static void m13773a(fgk0 fgk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fgk0Var.a = (TextView) viewGroup.getChildAt(0);
        fgk0Var.b = (TextView) viewGroup.getChildAt(1);
        fgk0Var.c = viewGroup.getChildAt(2);
        fgk0Var.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        fgk0Var.e = viewGroup.getChildAt(3);
        fgk0Var.f = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m13774b(fgk0 fgk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20035u7, viewGroup, false);
        m13773a(fgk0Var, viewInflate);
        return viewInflate;
    }
}
