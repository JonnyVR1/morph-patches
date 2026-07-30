package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x940 {
    /* JADX INFO: renamed from: a */
    public static void m207481a(w940 w940Var, View view) {
        w940Var.f185294a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w940Var.f185295b = (VEditText) viewGroup.getChildAt(0);
        w940Var.f185296c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m207482b(w940 w940Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126518m2, viewGroup, false);
        m207481a(w940Var, viewInflate);
        return viewInflate;
    }
}
