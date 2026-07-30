package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.bkj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ckj0 {
    /* JADX INFO: renamed from: a */
    public static void m5955a(bkj0 bkj0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bkj0Var.a = viewGroup.getChildAt(0);
        bkj0Var.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bkj0Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        bkj0Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        bkj0Var.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bkj0Var.f = viewGroup.getChildAt(1);
        bkj0Var.g = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5956b(bkj0 bkj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5489P1, viewGroup, false);
        m5955a(bkj0Var, viewInflate);
        return viewInflate;
    }
}
