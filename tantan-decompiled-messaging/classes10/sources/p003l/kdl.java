package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.home.views.HomeTitleLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kdl {
    /* JADX INFO: renamed from: a */
    public static void m7554a(HomeTitleLayout homeTitleLayout, View view) {
        homeTitleLayout.a = (HomeTitleLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeTitleLayout.b = viewGroup.getChildAt(0);
        homeTitleLayout.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeTitleLayout.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeTitleLayout.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeTitleLayout.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeTitleLayout.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        homeTitleLayout.h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeTitleLayout.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeTitleLayout.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        homeTitleLayout.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        homeTitleLayout.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        homeTitleLayout.m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        homeTitleLayout.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0);
        homeTitleLayout.o = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        homeTitleLayout.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        homeTitleLayout.q = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        homeTitleLayout.r = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        homeTitleLayout.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(0);
        homeTitleLayout.t = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        homeTitleLayout.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(0);
        homeTitleLayout.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1);
        homeTitleLayout.w = (ViewStub) viewGroup.getChildAt(1);
        homeTitleLayout.x = (ViewStub) viewGroup.getChildAt(2);
    }
}
