package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wd2 {
    /* JADX INFO: renamed from: a */
    public static void m205837a(vd2 vd2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vd2Var.f183527a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        vd2Var.f183528b = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m205838b(vd2 vd2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(nec0.f141619d, viewGroup, false);
        m205837a(vd2Var, viewInflate);
        return viewInflate;
    }
}
