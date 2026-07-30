package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class f85 {
    /* JADX INFO: renamed from: a */
    public static void m124513a(e85 e85Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        e85Var.f92509a = (VNavigationBar) viewGroup.getChildAt(0);
        e85Var.f92510b = (VFrame) viewGroup.getChildAt(1);
        e85Var.f92511c = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        e85Var.f92512d = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        e85Var.f92513e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        e85Var.f92514f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        e85Var.f92515g = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        e85Var.f92516h = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m124514b(e85 e85Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126043s1, viewGroup, false);
        m124513a(e85Var, viewInflate);
        return viewInflate;
    }
}
