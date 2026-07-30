package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.feed.newui.preview.act.C11315a;
import p147v.VPager;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes12.dex */
public class z770 {
    /* JADX INFO: renamed from: a */
    public static void m217448a(C11315a c11315a, View view) {
        c11315a.f42609a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c11315a.f42610b = (VPager) viewGroup.getChildAt(0);
        c11315a.f42611c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m217449b(C11315a c11315a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142071M2, viewGroup, false);
        m217448a(c11315a, viewInflate);
        return viewInflate;
    }
}
