package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class dka0 {
    /* JADX INFO: renamed from: a */
    public static void m112215a(cka0 cka0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cka0Var.f81309a = (TextView) viewGroup.getChildAt(0);
        cka0Var.f81310b = (VList) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cka0Var.f81311c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m112216b(cka0 cka0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137289C, viewGroup, false);
        m112215a(cka0Var, viewInflate);
        return viewInflate;
    }
}
