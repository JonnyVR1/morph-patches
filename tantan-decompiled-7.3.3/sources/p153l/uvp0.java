package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class uvp0 {
    /* JADX INFO: renamed from: a */
    public static void m198302a(tvp0 tvp0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tvp0Var.f176276f = viewGroup.getChildAt(0);
        tvp0Var.f176277g = (LinearLayout) viewGroup.getChildAt(1);
        tvp0Var.f176278h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tvp0Var.f176279i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        tvp0Var.f176280j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        tvp0Var.f176281k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m198303b(tvp0 tvp0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125717Yc, viewGroup, false);
        m198302a(tvp0Var, viewInflate);
        return viewInflate;
    }
}
