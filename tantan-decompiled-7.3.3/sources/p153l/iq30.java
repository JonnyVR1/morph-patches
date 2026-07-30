package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class iq30 {
    /* JADX INFO: renamed from: a */
    public static void m141559a(hq30 hq30Var, View view) {
        hq30Var.f111070a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hq30Var.f111071b = (VPager) viewGroup.getChildAt(0);
        hq30Var.f111072c = (NewPictureContainerIndicator) viewGroup.getChildAt(1);
        hq30Var.f111073d = (TextView) viewGroup.getChildAt(2);
        hq30Var.f111074e = viewGroup.getChildAt(3);
        hq30Var.f111075f = viewGroup.getChildAt(4);
        hq30Var.f111076g = viewGroup.getChildAt(5);
        hq30Var.f111077h = (LinearLayout) viewGroup.getChildAt(6);
        hq30Var.f111078i = (TextView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m141560b(hq30 hq30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152030q0, viewGroup, false);
        m141559a(hq30Var, viewInflate);
        return viewInflate;
    }
}
