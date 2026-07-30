package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p147v.VPullDownRefreshLayout;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class d220 {
    /* JADX INFO: renamed from: a */
    public static void m109705a(c220 c220Var, View view) {
        c220Var._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        c220Var._list = (VPullUpRecyclerView) view.findViewById(x4c0.f191005p);
        ViewGroup viewGroup = (ViewGroup) view;
        c220Var._privilege = (FrameLayout) viewGroup.getChildAt(1);
        c220Var._get_privilege = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m109706b(c220 c220Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121310K0, viewGroup, false);
        m109705a(c220Var, viewInflate);
        return viewInflate;
    }
}
