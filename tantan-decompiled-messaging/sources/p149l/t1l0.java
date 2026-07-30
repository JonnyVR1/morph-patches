package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class t1l0 {
    /* JADX INFO: renamed from: a */
    public static void m186913a(s1l0 s1l0Var, View view) {
        s1l0Var._video_act_root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        s1l0Var._video_buzz_root = (FrameLayout) viewGroup.getChildAt(0);
        s1l0Var._self_surface_root = (FrameLayout) viewGroup.getChildAt(1);
        s1l0Var._self_surface_root_avatar_mask_bg = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        s1l0Var._video_search_root = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m186914b(s1l0 s1l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106019D, viewGroup, false);
        m186913a(s1l0Var, viewInflate);
        return viewInflate;
    }
}
