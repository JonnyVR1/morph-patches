package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.n6c0;
import l.uma0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vma0 {
    /* JADX INFO: renamed from: a */
    public static void m10244a(uma0 uma0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uma0Var.a = viewGroup.getChildAt(0);
        uma0Var.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10245b(uma0 uma0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.I0, viewGroup, false);
        m10244a(uma0Var, viewInflate);
        return viewInflate;
    }
}
