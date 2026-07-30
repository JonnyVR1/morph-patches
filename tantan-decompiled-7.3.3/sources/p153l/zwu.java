package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class zwu {
    /* JADX INFO: renamed from: a */
    public static void m221952a(ywu ywuVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ywuVar._page_title_bar = (VNavigationBar) viewGroup.getChildAt(0);
        ywuVar._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ywuVar._recycler_view = (VRecyclerView) view.findViewById(ldc0.f131567k1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        ywuVar._empty_error_layout = (LiveEmptyErrorView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        ywuVar._empty_error_layout_image = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ywuVar._empty_error_layout_tv_tip = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ywuVar._random_entry = (VLinear) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        ywuVar._start_video_chat = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m221953b(ywu ywuVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193830W0, viewGroup, false);
        m221952a(ywuVar, viewInflate);
        return viewInflate;
    }
}
