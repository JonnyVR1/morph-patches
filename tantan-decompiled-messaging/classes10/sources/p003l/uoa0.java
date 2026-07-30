package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.toa0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uoa0 {
    /* JADX INFO: renamed from: a */
    public static void m9754a(toa0 toa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        toa0Var.u = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        toa0Var.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        toa0Var.w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        toa0Var.x = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9755b(toa0 toa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ga, viewGroup, false);
        m9754a(toa0Var, viewInflate);
        return viewInflate;
    }
}
