package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.jia0;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kia0 {
    /* JADX INFO: renamed from: a */
    public static void m7599a(jia0 jia0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jia0Var.a = viewGroup.getChildAt(0);
        jia0Var.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7600b(jia0 jia0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.z, viewGroup, false);
        m7599a(jia0Var, viewInflate);
        return viewInflate;
    }
}
