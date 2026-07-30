package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeCountDownView;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeListViewModel;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d1h0 {
    /* JADX INFO: renamed from: a */
    public static void m109612a(SupremeListViewModel supremeListViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeListViewModel._loading = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        supremeListViewModel._loading_progress = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        supremeListViewModel._rl_error_view = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        supremeListViewModel._img_network_error = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        supremeListViewModel._tv_network_tips = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        supremeListViewModel._reload = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        supremeListViewModel._countdown = (SupremeCountDownView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        supremeListViewModel._fl_content_layout = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        supremeListViewModel._list = (VPullUpRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        supremeListViewModel._get_privilege = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m109613b(SupremeListViewModel supremeListViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121293E1, viewGroup, false);
        m109612a(supremeListViewModel, viewInflate);
        return viewInflate;
    }
}
