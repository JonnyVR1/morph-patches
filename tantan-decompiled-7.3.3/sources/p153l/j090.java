package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.customized.result.PrivateCustomResultCountDownView;
import com.p051p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j090 {
    /* JADX INFO: renamed from: a */
    public static void m142959a(PrivateCustomResultListViewModel privateCustomResultListViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privateCustomResultListViewModel._loading = (VFrame) viewGroup.getChildAt(0);
        privateCustomResultListViewModel._loading_progress = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privateCustomResultListViewModel._rl_error_view = (RelativeLayout) viewGroup.getChildAt(1);
        privateCustomResultListViewModel._img_network_error = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privateCustomResultListViewModel._tv_network_tips = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        privateCustomResultListViewModel._reload = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        privateCustomResultListViewModel._countdown = (PrivateCustomResultCountDownView) viewGroup.getChildAt(2);
        privateCustomResultListViewModel._fl_content_layout = (FrameLayout) viewGroup.getChildAt(3);
        privateCustomResultListViewModel._list = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        privateCustomResultListViewModel._get_privilege = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m142960b(PrivateCustomResultListViewModel privateCustomResultListViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151991g1, viewGroup, false);
        m142959a(privateCustomResultListViewModel, viewInflate);
        return viewInflate;
    }
}
