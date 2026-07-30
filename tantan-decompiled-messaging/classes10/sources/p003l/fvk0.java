package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.evk0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fvk0 {
    /* JADX INFO: renamed from: a */
    public static void m6518a(evk0 evk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        evk0Var.a = viewGroup.getChildAt(0);
        evk0Var.b = viewGroup.getChildAt(1);
        evk0Var.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6519b(evk0 evk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Nc, viewGroup, false);
        m6518a(evk0Var, viewInflate);
        return viewInflate;
    }
}
