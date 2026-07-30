package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes9.dex */
public class qlf0 {
    /* JADX INFO: renamed from: a */
    public static void m176997a(plf0 plf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        plf0Var._list = (VRecyclerView) viewGroup.getChildAt(1);
        plf0Var._btn = (VText_NoTopPadding) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m176998b(plf0 plf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109137w, viewGroup, false);
        m176997a(plf0Var, viewInflate);
        return viewInflate;
    }
}
