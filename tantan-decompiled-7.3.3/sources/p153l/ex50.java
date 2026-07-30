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

/* JADX INFO: loaded from: classes10.dex */
public class ex50 {
    /* JADX INFO: renamed from: a */
    public static void m123012a(bx50 bx50Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bx50Var._rl_loading = (RelativeLayout) viewGroup.getChildAt(0);
        bx50Var._rl_loading_radar = (VFrame_Squared) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bx50Var._rl_loading_radar_ripple = (RadarRipple) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        bx50Var._rl_loading_radar_image = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        bx50Var._rl_loading_describe = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bx50Var._rl_loading_setting = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bx50Var._rl_error_view = (RelativeLayout) viewGroup.getChildAt(1);
        bx50Var._rl_error_view_img_network_error = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bx50Var._rl_error_view_tv_network_tips = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bx50Var._rl_error_view_reload = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        bx50Var._fl_content_layout = (FrameLayout) viewGroup.getChildAt(2);
        bx50Var._refresh = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bx50Var._list = (VPullUpRecyclerView) view.findViewById(ddc0.f87910p);
        bx50Var._get_privilege = (TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123013b(bx50 bx50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151960Y0, viewGroup, false);
        m123012a(bx50Var, viewInflate);
        return viewInflate;
    }
}
