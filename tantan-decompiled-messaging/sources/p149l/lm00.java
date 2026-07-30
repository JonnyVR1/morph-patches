package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.visitor.C9048d;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterBar;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VPullUpRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class lm00 {
    /* JADX INFO: renamed from: a */
    public static void m150552a(C9048d c9048d, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c9048d.f38150a = (VNavigationBar) viewGroup.getChildAt(0);
        c9048d.f38151b = (VLinear) viewGroup.getChildAt(1);
        c9048d.f38152c = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c9048d.f38153d = (VPullUpRecyclerView) view.findViewById(x4c0.f190988W);
        ViewGroup viewGroup2 = (ViewGroup) view;
        c9048d.f38154e = (FrameLayout) viewGroup2.getChildAt(2);
        c9048d.f38155f = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        c9048d.f38156g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(0);
        c9048d.f38157h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(1);
        c9048d.f38158i = (VLinear) viewGroup2.getChildAt(3);
        c9048d.f38159j = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        c9048d.f38160k = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        c9048d.f38161l = (VRelative) viewGroup2.getChildAt(4);
        c9048d.f38162m = (VImage) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(0);
        c9048d.f38163n = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(1);
        c9048d.f38164o = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(2);
        c9048d.f38165p = (VButton) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(3);
        c9048d.f38166q = (FrameLayout) viewGroup2.getChildAt(5);
        c9048d.f38167r = ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(0);
        c9048d.f38168s = (VisitorsFilterBar) ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m150553b(C9048d c9048d, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121360a2, viewGroup, false);
        m150552a(c9048d, viewInflate);
        return viewInflate;
    }
}
