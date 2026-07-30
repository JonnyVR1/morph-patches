package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.a500;
import l.e6c0;
import l.s4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class b500 {
    /* JADX INFO: renamed from: a */
    public static void m8630a(a500 a500Var, View view) {
        a500Var.a = view.findViewById(s4c0.R);
        ViewGroup viewGroup = (ViewGroup) view;
        a500Var.b = viewGroup.getChildAt(0);
        a500Var.c = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8631b(a500 a500Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.E, viewGroup, false);
        m8630a(a500Var, viewInflate);
        return viewInflate;
    }
}
