package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.feed.newui.preview.act.C11478a;
import p151v.VPager;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes13.dex */
public class fg70 {
    /* JADX INFO: renamed from: a */
    public static void m125491a(C11478a c11478a, View view) {
        c11478a.f43457a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c11478a.f43458b = (VPager) viewGroup.getChildAt(0);
        c11478a.f43459c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m125492b(C11478a c11478a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173540M2, viewGroup, false);
        m125491a(c11478a, viewInflate);
        return viewInflate;
    }
}
