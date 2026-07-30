package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.intl.visitor.IntlVisitorsViewModel;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundTextView;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class lop {
    /* JADX INFO: renamed from: a */
    public static void m150786a(IntlVisitorsViewModel intlVisitorsViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVisitorsViewModel._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        intlVisitorsViewModel._intl_visitors_discount_banner_container = (FrameLayout) viewGroup.getChildAt(1);
        intlVisitorsViewModel._visitors_ll = (VLinear) viewGroup.getChildAt(2);
        intlVisitorsViewModel._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlVisitorsViewModel._visitors = (VPullUpRecyclerView) view.findViewById(u4c0.f174489tf);
        ViewGroup viewGroup2 = (ViewGroup) view;
        intlVisitorsViewModel._empty = (VLinear) viewGroup2.getChildAt(3);
        intlVisitorsViewModel._empty_empty_img = (ImageView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        intlVisitorsViewModel._empty_empty_tv = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        intlVisitorsViewModel._bottom_bg = (FrameLayout) viewGroup2.getChildAt(4);
        intlVisitorsViewModel._bottom_bg_get_privilege = (RoundTextView) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m150787b(IntlVisitorsViewModel intlVisitorsViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95640X5, viewGroup, false);
        m150786a(intlVisitorsViewModel, viewInflate);
        return viewInflate;
    }
}
