package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.search.LiveSearchBar;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jcv {
    /* JADX INFO: renamed from: a */
    public static void m144378a(icv icvVar, View view) {
        icvVar._root_view = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        icvVar._container = (VLinear) viewGroup.getChildAt(0);
        icvVar._search_bar = (LiveSearchBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        icvVar._empty_error_layout = (LiveEmptyErrorView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        icvVar._empty_error_layout_image = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        icvVar._empty_error_layout_tv_tip = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        icvVar._search_list = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m144379b(icv icvVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193904r0, viewGroup, false);
        m144378a(icvVar, viewInflate);
        return viewInflate;
    }
}
