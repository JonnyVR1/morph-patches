package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class jhe {
    /* JADX INFO: renamed from: a */
    public static void m141498a(ihe iheVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iheVar.f113242e = (VNavigationBar) viewGroup.getChildAt(0);
        iheVar.f113243f = (VLinear) viewGroup.getChildAt(1);
        iheVar.f113244g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iheVar.f113245h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iheVar.f113246i = (VRecyclerView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m141499b(ihe iheVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126290F, viewGroup, false);
        m141498a(iheVar, viewInflate);
        return viewInflate;
    }
}
