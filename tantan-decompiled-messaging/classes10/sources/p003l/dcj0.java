package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.ccj0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dcj0 {
    /* JADX INFO: renamed from: a */
    public static void m6101a(ccj0 ccj0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ccj0Var.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ccj0Var.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ccj0Var.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        ccj0Var.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        ccj0Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        ccj0Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ccj0Var.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        ccj0Var.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2);
        ccj0Var.j = viewGroup.getChildAt(1);
        ccj0Var.k = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6102b(ccj0 ccj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.hf, viewGroup, false);
        m6101a(ccj0Var, viewInflate);
        return viewInflate;
    }
}
