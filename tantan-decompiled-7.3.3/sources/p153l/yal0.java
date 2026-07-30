package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class yal0 {
    /* JADX INFO: renamed from: a */
    public static void m214897a(xal0 xal0Var, View view) {
        xal0Var._video_act_root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xal0Var._video_buzz_root = (FrameLayout) viewGroup.getChildAt(0);
        xal0Var._self_surface_root = (FrameLayout) viewGroup.getChildAt(1);
        xal0Var._self_surface_root_avatar_mask_bg = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xal0Var._video_search_root = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m214898b(xal0 xal0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136461D, viewGroup, false);
        m214897a(xal0Var, viewInflate);
        return viewInflate;
    }
}
