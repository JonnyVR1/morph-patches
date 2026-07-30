package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class yuu {
    /* JADX INFO: renamed from: a */
    public static void m216162a(xuu xuuVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xuuVar._page_title_bar = (VNavigationBar) viewGroup.getChildAt(0);
        xuuVar._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xuuVar._recycler_view = (VRecyclerView) view.findViewById(f5c0.f95110k1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        xuuVar._empty_error_layout = (LiveEmptyErrorView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        xuuVar._empty_error_layout_image = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        xuuVar._empty_error_layout_tv_tip = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        xuuVar._random_entry = (VLinear) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        xuuVar._start_video_chat = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m216163b(xuu xuuVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162716W0, viewGroup, false);
        m216162a(xuuVar, viewInflate);
        return viewInflate;
    }
}
