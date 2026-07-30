package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class elg {
    /* JADX INFO: renamed from: a */
    public static void m117119a(clg clgVar, View view) {
        clgVar.f81395q = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        clgVar.f81396r = (VRecyclerView) view.findViewById(b5c0.f73624y);
        ViewGroup viewGroup = (ViewGroup) view;
        clgVar.f81397s = (VLinear) viewGroup.getChildAt(1);
        clgVar.f81398t = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        clgVar.f81399u = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        clgVar.f81400v = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m117120b(clg clgVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142136X1, viewGroup, false);
        m117119a(clgVar, viewInflate);
        return viewInflate;
    }
}
