package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ni2 {
    /* JADX INFO: renamed from: a */
    public static void m163262a(mi2 mi2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mi2Var.f136912c = (VImage) viewGroup.getChildAt(0);
        mi2Var.f136913d = (VText) viewGroup.getChildAt(1);
        mi2Var.f136914e = (VText) viewGroup.getChildAt(2);
        mi2Var.f136915f = (VLinear) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m163263b(mi2 mi2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125990p, viewGroup, false);
        m163262a(mi2Var, viewInflate);
        return viewInflate;
    }
}
