package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wzk0 {
    /* JADX INFO: renamed from: a */
    public static void m26926a(vzk0 vzk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vzk0Var.f24563a = viewGroup.getChildAt(2);
        vzk0Var.f24564b = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m26927b(vzk0 vzk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9428f0, viewGroup, false);
        m26926a(vzk0Var, viewInflate);
        return viewInflate;
    }
}
