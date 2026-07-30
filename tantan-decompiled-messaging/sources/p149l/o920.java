package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.view.RadarRipple;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame_Squared;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class o920 {
    /* JADX INFO: renamed from: a */
    public static void m163196a(l920 l920Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        l920Var._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        l920Var._rl_loading = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        l920Var._rl_loading_radar = (VFrame_Squared) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        l920Var._rl_loading_radar_ripple = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        l920Var._rl_loading_radar_image = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        l920Var._rl_loading_describe = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        l920Var._rl_loading_setting = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        l920Var._rl_error_view = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        l920Var._rl_error_view_img_network_error = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        l920Var._rl_error_view_tv_network_tips = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        l920Var._rl_error_view_reload = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        l920Var._fl_content_layout = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        l920Var._refresh = (VPullDownRefreshLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        l920Var._list = (VPullUpRecyclerView) view.findViewById(x4c0.f191005p);
        l920Var._get_privilege = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m163197b(l920 l920Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121328Q0, viewGroup, false);
        m163196a(l920Var, viewInflate);
        return viewInflate;
    }
}
