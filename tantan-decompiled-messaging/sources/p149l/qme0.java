package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qme0 {
    /* JADX INFO: renamed from: a */
    public static void m175565a(pme0 pme0Var, View view) {
        pme0Var.f150207a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pme0Var.f150208b = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pme0Var.f150209c = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        pme0Var.f150210d = (VEditText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        pme0Var.f150211e = (VText) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m175566b(pme0 pme0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126562s4, viewGroup, false);
        m175565a(pme0Var, viewInflate);
        return viewInflate;
    }
}
