package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.lha0;
import l.n6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mha0 {
    /* JADX INFO: renamed from: a */
    public static void m8155a(lha0 lha0Var, View view) {
        lha0Var.e = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lha0Var.f = viewGroup.getChildAt(0);
        lha0Var.g = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8156b(lha0 lha0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.x, viewGroup, false);
        m8155a(lha0Var, viewInflate);
        return viewInflate;
    }
}
