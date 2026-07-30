package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class uh30 {
    /* JADX INFO: renamed from: a */
    public static void m193611a(th30 th30Var, View view) {
        th30Var.f170185a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        th30Var.f170186b = (VPager) viewGroup.getChildAt(0);
        th30Var.f170187c = (NewPictureContainerIndicator) viewGroup.getChildAt(1);
        th30Var.f170188d = (TextView) viewGroup.getChildAt(2);
        th30Var.f170189e = viewGroup.getChildAt(3);
        th30Var.f170190f = viewGroup.getChildAt(4);
        th30Var.f170191g = viewGroup.getChildAt(5);
        th30Var.f170192h = (LinearLayout) viewGroup.getChildAt(6);
        th30Var.f170193i = (TextView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m193612b(th30 th30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121422q0, viewGroup, false);
        m193611a(th30Var, viewInflate);
        return viewInflate;
    }
}
