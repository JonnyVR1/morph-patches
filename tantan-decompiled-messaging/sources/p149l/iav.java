package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.search.LiveSearchBar;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class iav {
    /* JADX INFO: renamed from: a */
    public static void m135202a(hav havVar, View view) {
        havVar._root_view = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        havVar._container = (VLinear) viewGroup.getChildAt(0);
        havVar._search_bar = (LiveSearchBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        havVar._empty_error_layout = (LiveEmptyErrorView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        havVar._empty_error_layout_image = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        havVar._empty_error_layout_tv_tip = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        havVar._search_list = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m135203b(hav havVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162790r0, viewGroup, false);
        m135202a(havVar, viewInflate);
        return viewInflate;
    }
}
