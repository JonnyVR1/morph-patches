package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class f15 {
    /* JADX INFO: renamed from: a */
    public static void m123554a(d15 d15Var, View view) {
        d15Var.f84639a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d15Var.f84640b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        d15Var.f84641c = (VRecyclerView) viewGroup.getChildAt(1);
        d15Var.f84642d = (VLinear) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m123555b(d15 d15Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125890j1, viewGroup, false);
        m123554a(d15Var, viewInflate);
        return viewInflate;
    }
}
