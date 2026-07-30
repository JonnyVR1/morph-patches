package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p6j0 {
    /* JADX INFO: renamed from: a */
    public static void m170912a(o6j0 o6j0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        o6j0Var._bg_icon = (VDraweeView) viewGroup.getChildAt(0);
        o6j0Var._root = (VFrame) viewGroup.getChildAt(1);
        o6j0Var._loading = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        o6j0Var._empty = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        o6j0Var._empty_image = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        o6j0Var._empty_desc = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        o6j0Var._progress = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        o6j0Var._list = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        o6j0Var._get_privilege = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m170913b(o6j0 o6j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125630T5, viewGroup, false);
        m170912a(o6j0Var, viewInflate);
        return viewInflate;
    }
}
