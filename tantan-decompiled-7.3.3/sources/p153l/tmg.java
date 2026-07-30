package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class tmg {
    /* JADX INFO: renamed from: a */
    public static void m191733a(rmg rmgVar, View view) {
        rmgVar.f163869q = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        rmgVar.f163870r = (VRecyclerView) view.findViewById(hdc0.f108977y);
        ViewGroup viewGroup = (ViewGroup) view;
        rmgVar.f163871s = (VLinear) viewGroup.getChildAt(1);
        rmgVar.f163872t = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rmgVar.f163873u = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        rmgVar.f163874v = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m191734b(rmg rmgVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173605X1, viewGroup, false);
        m191733a(rmgVar, viewInflate);
        return viewInflate;
    }
}
