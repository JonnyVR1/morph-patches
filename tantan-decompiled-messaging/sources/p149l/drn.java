package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class drn {
    /* JADX INFO: renamed from: a */
    public static void m113316a(crn crnVar, View view) {
        crnVar.f82262a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        crnVar.f82263b = (VImage) viewGroup.getChildAt(0);
        crnVar.f82264c = (VLinear) viewGroup.getChildAt(1);
        crnVar.f82265d = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        crnVar.f82266e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        crnVar.f82267f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        crnVar.f82268g = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        crnVar.f82269h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        crnVar.f82270i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        crnVar.f82271j = (VPullUpRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        crnVar.f82272k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        crnVar.f82273l = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m113317b(crn crnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121425r, viewGroup, false);
        m113316a(crnVar, viewInflate);
        return viewInflate;
    }
}
