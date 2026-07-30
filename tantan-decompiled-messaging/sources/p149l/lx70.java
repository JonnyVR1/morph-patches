package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkUpDownScorllView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lx70 {
    /* JADX INFO: renamed from: a */
    public static void m152045a(kx70 kx70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kx70Var.f125069i = viewGroup.getChildAt(0);
        kx70Var.f125070j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        kx70Var.f125071k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        kx70Var.f125072l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        kx70Var.f125073m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        kx70Var.f125074n = (PkUpDownScorllView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        kx70Var.f125075o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        kx70Var.f125076p = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        kx70Var.f125077q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        kx70Var.f125078r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        kx70Var.f125079s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        kx70Var.f125080t = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        kx70Var.f125081u = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        kx70Var.f125082v = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        kx70Var.f125083w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m152046b(kx70 kx70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168252Y4, viewGroup, false);
        m152045a(kx70Var, viewInflate);
        return viewInflate;
    }
}
