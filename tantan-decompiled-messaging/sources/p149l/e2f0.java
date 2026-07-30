package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import p147v.VFrame;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class e2f0 {
    /* JADX INFO: renamed from: a */
    public static void m114498a(d2f0 d2f0Var, View view) {
        d2f0Var.f83358a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d2f0Var.f83359b = (LinearLayout) viewGroup.getChildAt(0);
        d2f0Var.f83360c = (SidesSlipHeadItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        d2f0Var.f83361d = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        d2f0Var.f83362e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m114499b(d2f0 d2f0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95514P7, viewGroup, false);
        m114498a(d2f0Var, viewInflate);
        return viewInflate;
    }
}
