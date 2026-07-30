package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.zva0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bwa0 {
    /* JADX INFO: renamed from: a */
    public static void m5823a(zva0 zva0Var, View view) {
        zva0Var.z = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zva0Var.A = viewGroup.getChildAt(0);
        zva0Var.B = viewGroup.getChildAt(1);
        zva0Var.C = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5824b(zva0 zva0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.qa, viewGroup, false);
        m5823a(zva0Var, viewInflate);
        return viewInflate;
    }
}
