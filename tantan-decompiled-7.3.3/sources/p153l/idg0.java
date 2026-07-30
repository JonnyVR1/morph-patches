package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class idg0 {
    /* JADX INFO: renamed from: a */
    public static void m139533a(hdg0 hdg0Var, View view) {
        hdg0Var.f108990a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hdg0Var.f108991b = (VNavigationBar) viewGroup.getChildAt(0);
        hdg0Var.f108992c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hdg0Var.f108993d = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m139534b(hdg0 hdg0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125837ff, viewGroup, false);
        m139533a(hdg0Var, viewInflate);
        return viewInflate;
    }
}
