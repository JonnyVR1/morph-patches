package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import l.f6c0;
import l.jec0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kec0 {
    /* JADX INFO: renamed from: a */
    public static void m7587a(jec0 jec0Var, View view) {
        jec0Var.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jec0Var.g = (ImageView) viewGroup.getChildAt(0);
        jec0Var.h = viewGroup.getChildAt(2);
        jec0Var.i = viewGroup.getChildAt(3);
        jec0Var.j = viewGroup.getChildAt(4);
        jec0Var.k = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7588b(jec0 jec0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Db, viewGroup, false);
        m7587a(jec0Var, viewInflate);
        return viewInflate;
    }
}
