package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class dtn {
    /* JADX INFO: renamed from: a */
    public static void m117887a(ctn ctnVar, View view) {
        ctnVar.f83719a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ctnVar.f83720b = (VImage) viewGroup.getChildAt(0);
        ctnVar.f83721c = (VLinear) viewGroup.getChildAt(1);
        ctnVar.f83722d = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ctnVar.f83723e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ctnVar.f83724f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        ctnVar.f83725g = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        ctnVar.f83726h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ctnVar.f83727i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ctnVar.f83728j = (VPullUpRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        ctnVar.f83729k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        ctnVar.f83730l = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m117888b(ctn ctnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152033r, viewGroup, false);
        m117887a(ctnVar, viewInflate);
        return viewInflate;
    }
}
