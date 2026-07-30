package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegePaymentView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.TopCardLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.bottom.AlphaTransformerViewPager;
import p151v.VDraweeView;
import p151v.VSegmentBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class nql0 {
    /* JADX INFO: renamed from: a */
    public static void m164334a(mql0 mql0Var, View view) {
        mql0Var.f138080a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mql0Var.f138081b = (FrameLayout) viewGroup.getChildAt(0);
        mql0Var.f138082c = (FrameLayout) viewGroup.getChildAt(1);
        mql0Var.f138083d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mql0Var.f138084e = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mql0Var.f138085f = (CoordinatorLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        mql0Var.f138086g = (TopCardLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        mql0Var.f138087h = (AlphaTransformerViewPager) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        mql0Var.f138088i = (VSegmentBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        mql0Var.f138089j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        mql0Var.f138090k = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        mql0Var.f138091l = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        mql0Var.f138092m = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        mql0Var.f138093n = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(3);
        mql0Var.f138094o = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(4);
        mql0Var.f138095p = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(5);
        mql0Var.f138096q = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(6);
        mql0Var.f138097r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(6)).getChildAt(0)).getChildAt(0);
        mql0Var.f138098s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m164335b(mql0 mql0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125697X8, viewGroup, false);
        m164334a(mql0Var, viewInflate);
        return viewInflate;
    }
}
