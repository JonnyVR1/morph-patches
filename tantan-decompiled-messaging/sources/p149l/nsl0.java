package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class nsl0 {
    /* JADX INFO: renamed from: a */
    public static void m160782a(msl0 msl0Var, View view) {
        msl0Var.f135510k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        msl0Var.f135511l = (SmartRefreshLayout) viewGroup.getChildAt(2);
        msl0Var.f135512m = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
