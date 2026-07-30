package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class r1m0 {
    /* JADX INFO: renamed from: a */
    public static void m179426a(q1m0 q1m0Var, View view) {
        q1m0Var.f155205k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        q1m0Var.f155206l = (SmartRefreshLayout) viewGroup.getChildAt(2);
        q1m0Var.f155207m = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
