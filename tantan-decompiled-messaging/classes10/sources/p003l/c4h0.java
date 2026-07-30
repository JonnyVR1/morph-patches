package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c4h0 {
    /* JADX INFO: renamed from: a */
    public static void m5861a(b4h0 b4h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b4h0Var.f3312j = viewGroup.getChildAt(0);
        b4h0Var.f3313k = viewGroup.getChildAt(1);
        b4h0Var.f3314l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        b4h0Var.f3315m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        b4h0Var.f3316n = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m5862b(b4h0 b4h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.l6, viewGroup, false);
        m5861a(b4h0Var, viewInflate);
        return viewInflate;
    }
}
