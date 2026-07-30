package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullDownRefreshLayout;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class or30 {
    /* JADX INFO: renamed from: a */
    public static void m168857a(nr30 nr30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nr30Var.f143363a = (VNavigationBar) viewGroup.getChildAt(0);
        nr30Var.f143364b = (VPullDownRefreshLayout) viewGroup.getChildAt(1);
        nr30Var.f143365c = (RecyclerView) view.findViewById(ddc0.f87910p);
        ViewGroup viewGroup2 = (ViewGroup) view;
        nr30Var.f143366d = (LinearLayout) viewGroup2.getChildAt(2);
        nr30Var.f143367e = (VProgressBar) viewGroup2.getChildAt(3);
        nr30Var.f143368f = (VImage) viewGroup2.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m168858b(nr30 nr30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151945T0, viewGroup, false);
        m168857a(nr30Var, viewInflate);
        return viewInflate;
    }
}
