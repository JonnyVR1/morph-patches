package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.jqm0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kqm0 {
    /* JADX INFO: renamed from: a */
    public static void m16763a(jqm0 jqm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jqm0Var.a = viewGroup.getChildAt(0);
        jqm0Var.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jqm0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m16764b(jqm0 jqm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19667R7, viewGroup, false);
        m16763a(jqm0Var, viewInflate);
        return viewInflate;
    }
}
