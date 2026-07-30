package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegePaymentView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.view.TopCardLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.view.bottom.AlphaTransformerViewPager;
import p147v.VDraweeView;
import p147v.VSegmentBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class jhl0 {
    /* JADX INFO: renamed from: a */
    public static void m141531a(ihl0 ihl0Var, View view) {
        ihl0Var.f113267a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ihl0Var.f113268b = (FrameLayout) viewGroup.getChildAt(0);
        ihl0Var.f113269c = (FrameLayout) viewGroup.getChildAt(1);
        ihl0Var.f113270d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ihl0Var.f113271e = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ihl0Var.f113272f = (CoordinatorLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        ihl0Var.f113273g = (TopCardLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ihl0Var.f113274h = (AlphaTransformerViewPager) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ihl0Var.f113275i = (VSegmentBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ihl0Var.f113276j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ihl0Var.f113277k = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        ihl0Var.f113278l = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        ihl0Var.f113279m = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        ihl0Var.f113280n = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(3);
        ihl0Var.f113281o = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(4);
        ihl0Var.f113282p = (PrivilegePaymentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(5);
        ihl0Var.f113283q = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(6);
        ihl0Var.f113284r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(6)).getChildAt(0)).getChildAt(0);
        ihl0Var.f113285s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m141532b(ihl0 ihl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95531Q8, viewGroup, false);
        m141531a(ihl0Var, viewInflate);
        return viewInflate;
    }
}
