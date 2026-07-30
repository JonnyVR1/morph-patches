package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class x960 {
    /* JADX INFO: renamed from: a */
    public static void m27157a(w960 w960Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        w960Var.f25032a = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        w960Var.f25033b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m27158b(w960 w960Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9403M, viewGroup, false);
        m27157a(w960Var, viewInflate);
        return viewInflate;
    }
}
