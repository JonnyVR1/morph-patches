package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class x800 {
    /* JADX INFO: renamed from: a */
    public static void m16034a(w800 w800Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        w800Var.f14453c = viewGroup.getChildAt(0);
        w800Var.f14454d = (LinearLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m16035b(w800 w800Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11218g4, viewGroup, false);
        m16034a(w800Var, viewInflate);
        return viewInflate;
    }
}
