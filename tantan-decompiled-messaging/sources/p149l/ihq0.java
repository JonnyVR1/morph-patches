package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VListCell;
import p147v.VRangeSlider;
import p147v.VScroll;
import p147v.VSlider;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ihq0 {
    /* JADX INFO: renamed from: a */
    public static void m136267a(hhq0 hhq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hhq0Var._close = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hhq0Var._filter = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hhq0Var._save = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        hhq0Var._scroll = (VScroll) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hhq0Var._age_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hhq0Var._show_ages = (VRangeSlider) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hhq0Var._search_distance_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        hhq0Var._distance_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        hhq0Var._search_distance = (VSlider) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        hhq0Var._advace_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        hhq0Var._prefer_match = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        hhq0Var._prefer_online = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        hhq0Var._prefer_popular = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2);
        hhq0Var._prefer_auth = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(3);
        hhq0Var._prefer_real = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(4);
        hhq0Var._prefer_more_info = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m136268b(hhq0 hhq0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121404l2, viewGroup, false);
        m136267a(hhq0Var, viewInflate);
        return viewInflate;
    }
}
