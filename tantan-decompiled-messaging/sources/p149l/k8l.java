package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p046p1.mobile.putong.core.newui.home.frag.base.HomeTitleBarRootLayout;
import p147v.VFrame;
import p147v.VOnlineIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class k8l {
    /* JADX INFO: renamed from: a */
    public static void m144944a(HomeLayoutFrag homeLayoutFrag, View view) {
        homeLayoutFrag.f23000C = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeLayoutFrag.f23001D = (FrameLayout) viewGroup.getChildAt(0);
        homeLayoutFrag.f23002E = (HomeTitleBarRootLayout) viewGroup.getChildAt(1);
        homeLayoutFrag.f23003F = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeLayoutFrag.f23004G = (VOnlineIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        homeLayoutFrag.f23005H = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m144945b(HomeLayoutFrag homeLayoutFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95772f4, viewGroup, false);
        m144944a(homeLayoutFrag, viewInflate);
        return viewInflate;
    }
}
