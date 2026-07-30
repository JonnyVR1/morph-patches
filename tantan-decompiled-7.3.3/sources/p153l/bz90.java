package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class bz90 {
    /* JADX INFO: renamed from: a */
    public static void m107136a(az90 az90Var, View view) {
        az90Var.f74114u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        az90Var.f74115v = (VText) viewGroup.getChildAt(0);
        az90Var.f74116w = (VText_Tags) viewGroup.getChildAt(1);
        az90Var.f74117x = (VText_Tags) viewGroup.getChildAt(2);
        az90Var.f74118y = (VText_Tags) viewGroup.getChildAt(3);
        az90Var.f74119z = (VText_Tags) viewGroup.getChildAt(4);
        az90Var.f74103A = (VText_Tags) viewGroup.getChildAt(5);
        az90Var.f74104B = (VText_Tags) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m107137b(az90 az90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125815ea, viewGroup, false);
        m107136a(az90Var, viewInflate);
        return viewInflate;
    }
}
