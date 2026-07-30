package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class h2b0 {
    /* JADX INFO: renamed from: a */
    public static void m133372a(g2b0 g2b0Var, View view) {
        g2b0Var.f101819u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g2b0Var.f101820v = (VText) viewGroup.getChildAt(0);
        g2b0Var.f101821w = (VText_Tags) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m133373b(g2b0 g2b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126103va, viewGroup, false);
        m133372a(g2b0Var, viewInflate);
        return viewInflate;
    }
}
