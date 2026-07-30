package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class jmg {
    /* JADX INFO: renamed from: a */
    public static void m142179a(img imgVar, View view) {
        imgVar.f113918a = (VFrame) view.findViewById(b5c0.f73465A1);
        ViewGroup viewGroup = (ViewGroup) view;
        imgVar.f113919b = (VPullDownRefreshLayout) viewGroup.getChildAt(0);
        imgVar.f113920c = (VRecyclerView) view.findViewById(b5c0.f73547b1);
        imgVar.f113921d = (VLinear) viewGroup.getChildAt(1);
        imgVar.f113922e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        imgVar.f113923f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m142180b(img imgVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f141994A, viewGroup, false);
        m142179a(imgVar, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m142181c(img imgVar) {
        imgVar.f113918a = null;
        imgVar.f113919b = null;
        imgVar.f113920c = null;
        imgVar.f113921d = null;
        imgVar.f113922e = null;
        imgVar.f113923f = null;
    }
}
