package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hij0 {
    /* JADX INFO: renamed from: a */
    public static void m7004a(gij0 gij0Var, View view) {
        gij0Var.f4636f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gij0Var.f4637g = viewGroup.getChildAt(0);
        gij0Var.f4638h = viewGroup.getChildAt(1);
        gij0Var.f4639i = viewGroup.getChildAt(2);
        gij0Var.f4640j = viewGroup.getChildAt(3);
        gij0Var.f4641k = viewGroup.getChildAt(4);
        gij0Var.f4642l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        gij0Var.f4643m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        gij0Var.f4644n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        gij0Var.f4645o = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        gij0Var.f4646p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0);
        gij0Var.f4647q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(1);
        gij0Var.f4648r = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        gij0Var.f4649s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4)).getChildAt(0);
        gij0Var.f4650t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4)).getChildAt(1);
        gij0Var.f4651u = viewGroup.getChildAt(5);
        gij0Var.f4652v = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        gij0Var.f4653w = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        gij0Var.f4654x = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m7005b(gij0 gij0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Lc, viewGroup, false);
        m7004a(gij0Var, viewInflate);
        return viewInflate;
    }
}
