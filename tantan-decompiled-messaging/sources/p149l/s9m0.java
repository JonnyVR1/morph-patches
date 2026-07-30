package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterBar;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VPullUpRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class s9m0 {
    /* JADX INFO: renamed from: a */
    public static void m182735a(r9m0 r9m0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        r9m0Var._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        r9m0Var._visitors_ll = (VLinear) viewGroup.getChildAt(1);
        r9m0Var._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        r9m0Var._visitors = (VPullUpRecyclerView) view.findViewById(x4c0.f190988W);
        ViewGroup viewGroup2 = (ViewGroup) view;
        r9m0Var._privilege = (FrameLayout) viewGroup2.getChildAt(2);
        r9m0Var._get_privilege = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        r9m0Var._get_privilege_button = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(0);
        r9m0Var._get_privilege_info = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(1);
        r9m0Var._empty = (VLinear) viewGroup2.getChildAt(3);
        r9m0Var._empty_empty_img = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        r9m0Var._empty_empty_tv = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        r9m0Var._no_permission = (VRelative) viewGroup2.getChildAt(4);
        r9m0Var._permission_img = (VImage) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(0);
        r9m0Var._permission_subtitle = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(1);
        r9m0Var._permission_tv = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(2);
        r9m0Var._permission_btn = (VButton) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(3);
        r9m0Var._filter_bar_root = (FrameLayout) viewGroup2.getChildAt(5);
        r9m0Var._filter_bar_foreground = ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(0);
        r9m0Var._filter_bar = (VisitorsFilterBar) ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182736b(r9m0 r9m0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121392i2, viewGroup, false);
        m182735a(r9m0Var, viewInflate);
        return viewInflate;
    }
}
