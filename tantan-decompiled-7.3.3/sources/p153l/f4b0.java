package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f4b0 {
    /* JADX INFO: renamed from: a */
    public static void m123974a(d4b0 d4b0Var, View view) {
        d4b0Var.f85026z = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d4b0Var.f85019A = (VImage) viewGroup.getChildAt(0);
        d4b0Var.f85020B = (VText) viewGroup.getChildAt(1);
        d4b0Var.f85021C = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m123975b(d4b0 d4b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126137xa, viewGroup, false);
        m123974a(d4b0Var, viewInflate);
        return viewInflate;
    }
}
