package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.cka0;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dka0 {
    /* JADX INFO: renamed from: a */
    public static void m6166a(cka0 cka0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cka0Var.a = (TextView) viewGroup.getChildAt(0);
        cka0Var.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cka0Var.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6167b(cka0 cka0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.C, viewGroup, false);
        m6166a(cka0Var, viewInflate);
        return viewInflate;
    }
}
