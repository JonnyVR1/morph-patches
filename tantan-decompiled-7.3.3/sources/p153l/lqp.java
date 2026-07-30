package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.intl.visitor.IntlVisitorsViewModel;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundTextView;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class lqp {
    /* JADX INFO: renamed from: a */
    public static void m155500a(IntlVisitorsViewModel intlVisitorsViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVisitorsViewModel._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        intlVisitorsViewModel._intl_visitors_discount_banner_container = (FrameLayout) viewGroup.getChildAt(1);
        intlVisitorsViewModel._visitors_ll = (VLinear) viewGroup.getChildAt(2);
        intlVisitorsViewModel._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlVisitorsViewModel._visitors = (VPullUpRecyclerView) view.findViewById(adc0.f70631wf);
        ViewGroup viewGroup2 = (ViewGroup) view;
        intlVisitorsViewModel._empty = (VLinear) viewGroup2.getChildAt(3);
        intlVisitorsViewModel._empty_empty_img = (ImageView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        intlVisitorsViewModel._empty_empty_tv = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        intlVisitorsViewModel._bottom_bg = (FrameLayout) viewGroup2.getChildAt(4);
        intlVisitorsViewModel._bottom_bg_get_privilege = (RoundTextView) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m155501b(IntlVisitorsViewModel intlVisitorsViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125710Y5, viewGroup, false);
        m155500a(intlVisitorsViewModel, viewInflate);
        return viewInflate;
    }
}
