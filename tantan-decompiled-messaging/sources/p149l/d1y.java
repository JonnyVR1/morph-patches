package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class d1y {
    /* JADX INFO: renamed from: a */
    public static void m109698a(b1y b1yVar, View view) {
        b1yVar.f72639a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        b1yVar.f72640b = (VPager) viewGroup.getChildAt(0);
        b1yVar.f72641c = (NewPictureContainerIndicator) viewGroup.getChildAt(1);
        b1yVar.f72642d = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m109699b(b1y b1yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121433t0, viewGroup, false);
        m109698a(b1yVar, viewInflate);
        return viewInflate;
    }
}
