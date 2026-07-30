package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VSearchBar;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class os3 {
    /* JADX INFO: renamed from: a */
    public static void m168957a(ns3 ns3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ns3Var.f143457c = (VRecyclerView) viewGroup.getChildAt(0);
        ns3Var.f143458d = (ConstraintLayout) viewGroup.getChildAt(1);
        ns3Var.f143459e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ns3Var.f143460f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ns3Var.f143461g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ns3Var.f143462h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ns3Var.f143463i = viewGroup.getChildAt(2);
        ns3Var.f143464j = (VSearchBar) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m168958b(ns3 ns3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109119k, viewGroup, false);
        m168957a(ns3Var, viewInflate);
        return viewInflate;
    }
}
