package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oxa0 {
    /* JADX INFO: renamed from: a */
    public static void m169682a(nxa0 nxa0Var, View view) {
        nxa0Var.f144099u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nxa0Var.f144100v = (VText) viewGroup.getChildAt(0);
        nxa0Var.f144101w = (VDraweeView) viewGroup.getChildAt(1);
        nxa0Var.f144102x = (VText) viewGroup.getChildAt(2);
        nxa0Var.f144103y = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m169683b(nxa0 nxa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125967na, viewGroup, false);
        m169682a(nxa0Var, viewInflate);
        return viewInflate;
    }
}
