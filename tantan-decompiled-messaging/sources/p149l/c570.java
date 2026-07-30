package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class c570 {
    /* JADX INFO: renamed from: a */
    public static void m105278a(b570 b570Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b570Var.f73444a = (VNavigationBar) viewGroup.getChildAt(0);
        b570Var.f73445b = (VText) viewGroup.getChildAt(1);
        b570Var.f73446c = (SwipeRefreshLayout) viewGroup.getChildAt(2);
        b570Var.f73447d = (VList) view.findViewById(b5c0.f73502N);
        ViewGroup viewGroup2 = (ViewGroup) view;
        b570Var.f73448e = (VLinear) viewGroup2.getChildAt(3);
        b570Var.f73449f = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        b570Var.f73450g = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m105279b(b570 b570Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142284s5, viewGroup, false);
        m105278a(b570Var, viewInflate);
        return viewInflate;
    }
}
