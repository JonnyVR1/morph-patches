package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p151v.VPager;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes13.dex */
public class dx00 {
    /* JADX INFO: renamed from: a */
    public static void m118436a(cx00 cx00Var, View view) {
        cx00Var.f84158a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cx00Var.f84159b = (VPager) viewGroup.getChildAt(0);
        cx00Var.f84160c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m118437b(cx00 cx00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173794y4, viewGroup, false);
        m118436a(cx00Var, viewInflate);
        return viewInflate;
    }
}
