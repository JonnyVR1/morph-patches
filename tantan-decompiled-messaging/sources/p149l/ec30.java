package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;
import p147v.VPullUpRecyclerView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ec30 {
    /* JADX INFO: renamed from: a */
    public static void m115657a(yb30 yb30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yb30Var.f197275a = (VRecyclerView) viewGroup.getChildAt(0);
        yb30Var.f197276b = (VPullUpRecyclerView) viewGroup.getChildAt(1);
        yb30Var.f197277c = (VFrame) viewGroup.getChildAt(2);
        yb30Var.f197278d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        yb30Var.f197279e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        yb30Var.f197280f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m115658b(yb30 yb30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95636X1, viewGroup, false);
        m115657a(yb30Var, viewInflate);
        return viewInflate;
    }
}
