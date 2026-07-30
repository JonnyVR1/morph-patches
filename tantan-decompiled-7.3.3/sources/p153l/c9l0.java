package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton_FakeShadow;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class c9l0 {
    /* JADX INFO: renamed from: a */
    public static void m108445a(b9l0 b9l0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b9l0Var.f75591a = (VText) viewGroup.getChildAt(2);
        b9l0Var.f75592b = (VButton_FakeShadow) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m108446b(b9l0 b9l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109110f0, viewGroup, false);
        m108445a(b9l0Var, viewInflate);
        return viewInflate;
    }
}
