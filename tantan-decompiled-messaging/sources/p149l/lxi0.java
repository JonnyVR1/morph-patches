package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lxi0 {
    /* JADX INFO: renamed from: a */
    public static void m152065a(kxi0 kxi0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kxi0Var._bg_icon = (VDraweeView) viewGroup.getChildAt(0);
        kxi0Var._root = (VFrame) viewGroup.getChildAt(1);
        kxi0Var._loading = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        kxi0Var._empty = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        kxi0Var._empty_image = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        kxi0Var._empty_desc = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        kxi0Var._progress = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        kxi0Var._list = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        kxi0Var._get_privilege = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m152066b(kxi0 kxi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95560S5, viewGroup, false);
        m152065a(kxi0Var, viewInflate);
        return viewInflate;
    }
}
