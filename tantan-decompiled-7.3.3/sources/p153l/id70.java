package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class id70 {
    /* JADX INFO: renamed from: a */
    public static void m139509a(hd70 hd70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hd70Var.f108791a = (VNavigationBar) viewGroup.getChildAt(0);
        hd70Var.f108792b = (VText) viewGroup.getChildAt(1);
        hd70Var.f108793c = (SwipeRefreshLayout) viewGroup.getChildAt(2);
        hd70Var.f108794d = (VList) view.findViewById(hdc0.f108855N);
        ViewGroup viewGroup2 = (ViewGroup) view;
        hd70Var.f108795e = (VLinear) viewGroup2.getChildAt(3);
        hd70Var.f108796f = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        hd70Var.f108797g = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m139510b(hd70 hd70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173753s5, viewGroup, false);
        m139509a(hd70Var, viewInflate);
        return viewInflate;
    }
}
