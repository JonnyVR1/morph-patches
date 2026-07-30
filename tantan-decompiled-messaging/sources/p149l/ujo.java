package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.util.view.RoundTextView;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ujo {
    /* JADX INFO: renamed from: a */
    public static void m194016a(tjo tjoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tjoVar._intl_meet_visitor_discount_banner_container = (FrameLayout) viewGroup.getChildAt(0);
        tjoVar._visitors_ll = (VLinear) viewGroup.getChildAt(1);
        tjoVar._visitors = (VRecyclerView) view.findViewById(x4c0.f190988W);
        ViewGroup viewGroup2 = (ViewGroup) view;
        tjoVar._bottom_bg = (FrameLayout) viewGroup2.getChildAt(2);
        tjoVar._bottom_bg_get_privilege = (RoundTextView) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        tjoVar._empty = (VLinear) viewGroup2.getChildAt(3);
        tjoVar._empty_empty_img = (ImageView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        tjoVar._empty_empty_tv = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m194017b(tjo tjoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121297G, viewGroup, false);
        m194016a(tjoVar, viewInflate);
        return viewInflate;
    }
}
