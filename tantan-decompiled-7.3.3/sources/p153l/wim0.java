package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterBar;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class wim0 {
    /* JADX INFO: renamed from: a */
    public static void m206594a(vim0 vim0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vim0Var._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        vim0Var._visitors_ll = (VLinear) viewGroup.getChildAt(1);
        vim0Var._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vim0Var._visitors = (VPullUpRecyclerView) view.findViewById(ddc0.f87893W);
        ViewGroup viewGroup2 = (ViewGroup) view;
        vim0Var._privilege = (FrameLayout) viewGroup2.getChildAt(2);
        vim0Var._get_privilege = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        vim0Var._get_privilege_button = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(0);
        vim0Var._get_privilege_info = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(1);
        vim0Var._empty = (VLinear) viewGroup2.getChildAt(3);
        vim0Var._empty_empty_img = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        vim0Var._empty_empty_tv = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        vim0Var._no_permission = (VRelative) viewGroup2.getChildAt(4);
        vim0Var._permission_img = (VImage) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(0);
        vim0Var._permission_subtitle = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(1);
        vim0Var._permission_tv = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(2);
        vim0Var._permission_btn = (VButton) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(3);
        vim0Var._filter_bar_root = (FrameLayout) viewGroup2.getChildAt(5);
        vim0Var._filter_bar_foreground = ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(0);
        vim0Var._filter_bar = (VisitorsFilterBar) ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m206595b(vim0 vim0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152000i2, viewGroup, false);
        m206594a(vim0Var, viewInflate);
        return viewInflate;
    }
}
