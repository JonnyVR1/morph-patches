package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ftj0 {
    /* JADX INFO: renamed from: a */
    public static void m127324a(etj0 etj0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        etj0Var.f95760a = (VFrame) viewGroup.getChildAt(0);
        etj0Var.f95761b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        etj0Var.f95762c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        etj0Var.f95763d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        etj0Var.f95764e = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        etj0Var.f95765f = (VPullUpRecyclerView) viewGroup.getChildAt(1);
        etj0Var.f95766g = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m127325b(etj0 etj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151934P1, viewGroup, false);
        m127324a(etj0Var, viewInflate);
        return viewInflate;
    }
}
