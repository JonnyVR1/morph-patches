package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class ggy {
    /* JADX INFO: renamed from: a */
    public static void m126096a(fgy fgyVar, View view) {
        fgyVar._memoji_act_root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fgyVar._memoji_buzz_root = (FrameLayout) viewGroup.getChildAt(0);
        fgyVar._self_surface_root = (FrameLayout) viewGroup.getChildAt(1);
        fgyVar._self_surface_root_avatar_mask_bg = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fgyVar._memoji_search_root = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m126097b(fgy fgyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106048y, viewGroup, false);
        m126096a(fgyVar, viewInflate);
        return viewInflate;
    }
}
