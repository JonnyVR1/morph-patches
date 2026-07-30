package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VListCell;
import p151v.VRangeSlider;
import p151v.VScroll;
import p151v.VSlider;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nqq0 {
    /* JADX INFO: renamed from: a */
    public static void m164351a(mqq0 mqq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mqq0Var._close = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mqq0Var._filter = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mqq0Var._save = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mqq0Var._scroll = (VScroll) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mqq0Var._age_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        mqq0Var._show_ages = (VRangeSlider) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        mqq0Var._search_distance_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        mqq0Var._distance_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        mqq0Var._search_distance = (VSlider) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        mqq0Var._advace_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        mqq0Var._prefer_match = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        mqq0Var._prefer_online = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        mqq0Var._prefer_popular = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2);
        mqq0Var._prefer_auth = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(3);
        mqq0Var._prefer_real = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(4);
        mqq0Var._prefer_more_info = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m164352b(mqq0 mqq0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152012l2, viewGroup, false);
        m164351a(mqq0Var, viewInflate);
        return viewInflate;
    }
}
