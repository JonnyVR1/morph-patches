package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p051p1.mobile.putong.core.newui.home.frag.base.HomeTitleBarRootLayout;
import p151v.VFrame;
import p151v.VOnlineIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class abl {
    /* JADX INFO: renamed from: a */
    public static void m96771a(HomeLayoutFrag homeLayoutFrag, View view) {
        homeLayoutFrag.f23742C = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeLayoutFrag.f23743D = (FrameLayout) viewGroup.getChildAt(0);
        homeLayoutFrag.f23744E = (HomeTitleBarRootLayout) viewGroup.getChildAt(1);
        homeLayoutFrag.f23745F = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeLayoutFrag.f23746G = (VOnlineIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        homeLayoutFrag.f23747H = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m96772b(HomeLayoutFrag homeLayoutFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125826f4, viewGroup, false);
        m96771a(homeLayoutFrag, viewInflate);
        return viewInflate;
    }
}
