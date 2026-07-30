package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.util.view.RoundTextView;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ulo {
    /* JADX INFO: renamed from: a */
    public static void m196560a(tlo tloVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tloVar._intl_meet_visitor_discount_banner_container = (FrameLayout) viewGroup.getChildAt(0);
        tloVar._visitors_ll = (VLinear) viewGroup.getChildAt(1);
        tloVar._visitors = (VRecyclerView) view.findViewById(ddc0.f87893W);
        ViewGroup viewGroup2 = (ViewGroup) view;
        tloVar._bottom_bg = (FrameLayout) viewGroup2.getChildAt(2);
        tloVar._bottom_bg_get_privilege = (RoundTextView) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        tloVar._empty = (VLinear) viewGroup2.getChildAt(3);
        tloVar._empty_empty_img = (ImageView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        tloVar._empty_empty_tv = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m196561b(tlo tloVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151905G, viewGroup, false);
        m196560a(tloVar, viewInflate);
        return viewInflate;
    }
}
