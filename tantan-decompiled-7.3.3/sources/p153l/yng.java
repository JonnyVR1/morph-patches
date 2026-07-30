package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class yng {
    /* JADX INFO: renamed from: a */
    public static void m216834a(xng xngVar, View view) {
        xngVar.f195382a = (VFrame) view.findViewById(hdc0.f108818A1);
        ViewGroup viewGroup = (ViewGroup) view;
        xngVar.f195383b = (VPullDownRefreshLayout) viewGroup.getChildAt(0);
        xngVar.f195384c = (VRecyclerView) view.findViewById(hdc0.f108900b1);
        xngVar.f195385d = (VLinear) viewGroup.getChildAt(1);
        xngVar.f195386e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xngVar.f195387f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m216835b(xng xngVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173463A, viewGroup, false);
        m216834a(xngVar, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m216836c(xng xngVar) {
        xngVar.f195382a = null;
        xngVar.f195383b = null;
        xngVar.f195384c = null;
        xngVar.f195385d = null;
        xngVar.f195386e = null;
        xngVar.f195387f = null;
    }
}
