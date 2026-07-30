package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.view.RadarRipple;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame_Squared;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class wh20 {
    /* JADX INFO: renamed from: a */
    public static void m206331a(th20 th20Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        th20Var._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        th20Var._rl_loading = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        th20Var._rl_loading_radar = (VFrame_Squared) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        th20Var._rl_loading_radar_ripple = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        th20Var._rl_loading_radar_image = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        th20Var._rl_loading_describe = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        th20Var._rl_loading_setting = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        th20Var._rl_error_view = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        th20Var._rl_error_view_img_network_error = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        th20Var._rl_error_view_tv_network_tips = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        th20Var._rl_error_view_reload = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        th20Var._fl_content_layout = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        th20Var._refresh = (VPullDownRefreshLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        th20Var._list = (VPullUpRecyclerView) view.findViewById(ddc0.f87910p);
        th20Var._get_privilege = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m206332b(th20 th20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151936Q0, viewGroup, false);
        m206331a(th20Var, viewInflate);
        return viewInflate;
    }
}
