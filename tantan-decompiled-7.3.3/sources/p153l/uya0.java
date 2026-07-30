package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uya0 {
    /* JADX INFO: renamed from: a */
    public static void m198580a(tya0 tya0Var, View view) {
        tya0Var.f176651u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tya0Var.f176652v = (VText) viewGroup.getChildAt(0);
        tya0Var.f176653w = (VText) viewGroup.getChildAt(1);
        tya0Var.f176654x = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m198581b(tya0 tya0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126001pa, viewGroup, false);
        m198580a(tya0Var, viewInflate);
        return viewInflate;
    }
}
