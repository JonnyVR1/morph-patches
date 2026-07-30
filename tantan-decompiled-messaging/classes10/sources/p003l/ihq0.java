package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ihq0 {
    /* JADX INFO: renamed from: a */
    public static void m7239a(hhq0 hhq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hhq0Var._close = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hhq0Var._filter = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hhq0Var._save = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        hhq0Var._scroll = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hhq0Var._age_text = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hhq0Var._show_ages = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hhq0Var._search_distance_title = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        hhq0Var._distance_text = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        hhq0Var._search_distance = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        hhq0Var._advace_title = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        hhq0Var._prefer_match = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        hhq0Var._prefer_online = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        hhq0Var._prefer_popular = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2);
        hhq0Var._prefer_auth = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(3);
        hhq0Var._prefer_real = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(4);
        hhq0Var._prefer_more_info = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7240b(hhq0 hhq0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5567l2, viewGroup, false);
        m7239a(hhq0Var, viewInflate);
        return viewInflate;
    }
}
