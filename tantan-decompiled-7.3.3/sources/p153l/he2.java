package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class he2 {
    /* JADX INFO: renamed from: a */
    public static void m134618a(ge2 ge2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ge2Var.f103762l = (VText) viewGroup.getChildAt(1);
        ge2Var.f103763m = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m134619b(ge2 ge2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125640U, viewGroup, false);
        m134618a(ge2Var, viewInflate);
        return viewInflate;
    }
}
