package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.oam0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pam0 {
    /* JADX INFO: renamed from: a */
    public static void m8723a(oam0 oam0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oam0Var.b = viewGroup.getChildAt(0);
        oam0Var.c = viewGroup.getChildAt(1);
        oam0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oam0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oam0Var.f = viewGroup.getChildAt(2);
        oam0Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        oam0Var.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        oam0Var.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        oam0Var.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m8724b(oam0 oam0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5527b2, viewGroup, false);
        m8723a(oam0Var, viewInflate);
        return viewInflate;
    }
}
