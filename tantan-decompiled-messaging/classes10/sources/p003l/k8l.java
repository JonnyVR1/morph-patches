package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k8l {
    /* JADX INFO: renamed from: a */
    public static void m7549a(HomeLayoutFrag homeLayoutFrag, View view) {
        homeLayoutFrag.C = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeLayoutFrag.D = (FrameLayout) viewGroup.getChildAt(0);
        homeLayoutFrag.E = viewGroup.getChildAt(1);
        homeLayoutFrag.F = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeLayoutFrag.G = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        homeLayoutFrag.H = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7550b(HomeLayoutFrag homeLayoutFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f4, viewGroup, false);
        m7549a(homeLayoutFrag, viewInflate);
        return viewInflate;
    }
}
