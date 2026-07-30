package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VPullUpRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class k3h0 {
    /* JADX INFO: renamed from: a */
    public static void m148114a(j3h0 j3h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j3h0Var.f118180a = (VNavigationBar) viewGroup.getChildAt(0);
        j3h0Var.f118181b = (VPullUpRecyclerView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m148115b(j3h0 j3h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125969nc, viewGroup, false);
        m148114a(j3h0Var, viewInflate);
        return viewInflate;
    }
}
