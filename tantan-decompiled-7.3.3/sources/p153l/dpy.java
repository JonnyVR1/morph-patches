package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class dpy {
    /* JADX INFO: renamed from: a */
    public static void m117433a(cpy cpyVar, View view) {
        cpyVar._memoji_act_root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cpyVar._memoji_buzz_root = (FrameLayout) viewGroup.getChildAt(0);
        cpyVar._self_surface_root = (FrameLayout) viewGroup.getChildAt(1);
        cpyVar._self_surface_root_avatar_mask_bg = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cpyVar._memoji_search_root = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m117434b(cpy cpyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136490y, viewGroup, false);
        m117433a(cpyVar, viewInflate);
        return viewInflate;
    }
}
