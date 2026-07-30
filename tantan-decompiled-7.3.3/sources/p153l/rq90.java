package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class rq90 {
    /* JADX INFO: renamed from: a */
    public static void m182600a(qq90 qq90Var, View view) {
        qq90Var.f158969u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qq90Var.f158970v = (VText) viewGroup.getChildAt(0);
        qq90Var.f158971w = (VText) viewGroup.getChildAt(1);
        qq90Var.f158972x = (VText) viewGroup.getChildAt(2);
        qq90Var.f158973y = (VText_Tags) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m182601b(qq90 qq90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125714Y9, viewGroup, false);
        m182600a(qq90Var, viewInflate);
        return viewInflate;
    }
}
