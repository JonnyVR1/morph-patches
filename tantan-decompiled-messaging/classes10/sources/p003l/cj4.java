package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cj4 {
    /* JADX INFO: renamed from: a */
    public static void m5951a(bj4 bj4Var, View view) {
        bj4Var.f3386f = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bj4Var.f3387g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bj4Var.f3388h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        bj4Var.f3389i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        bj4Var.f3390j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bj4Var.f3391k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bj4Var.f3392l = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5952b(bj4 bj4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.C0, viewGroup, false);
        m5951a(bj4Var, viewInflate);
        return viewInflate;
    }
}
