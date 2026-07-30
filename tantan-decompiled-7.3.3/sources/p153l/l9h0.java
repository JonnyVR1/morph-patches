package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeCountDownView;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeListViewModel;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l9h0 {
    /* JADX INFO: renamed from: a */
    public static void m153428a(SupremeListViewModel supremeListViewModel, View view) {
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
    public static View m153429b(SupremeListViewModel supremeListViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151901E1, viewGroup, false);
        m153428a(supremeListViewModel, viewInflate);
        return viewInflate;
    }
}
