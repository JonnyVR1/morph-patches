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

/* JADX INFO: loaded from: classes10.dex */
public class yo50 {
    /* JADX INFO: renamed from: a */
    public static void m215473a(vo50 vo50Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vo50Var._rl_loading = (RelativeLayout) viewGroup.getChildAt(0);
        vo50Var._rl_loading_radar = (VFrame_Squared) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vo50Var._rl_loading_radar_ripple = (RadarRipple) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        vo50Var._rl_loading_radar_image = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        vo50Var._rl_loading_describe = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vo50Var._rl_loading_setting = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vo50Var._rl_error_view = (RelativeLayout) viewGroup.getChildAt(1);
        vo50Var._rl_error_view_img_network_error = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vo50Var._rl_error_view_tv_network_tips = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vo50Var._rl_error_view_reload = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vo50Var._fl_content_layout = (FrameLayout) viewGroup.getChildAt(2);
        vo50Var._refresh = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vo50Var._list = (VPullUpRecyclerView) view.findViewById(x4c0.f191005p);
        vo50Var._get_privilege = (TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m215474b(vo50 vo50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121352Y0, viewGroup, false);
        m215473a(vo50Var, viewInflate);
        return viewInflate;
    }
}
