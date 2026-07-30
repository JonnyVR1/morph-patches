package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iui {
    /* JADX INFO: renamed from: a */
    public static void m15412a(yti ytiVar, View view) {
        ytiVar.f23077a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ytiVar.f23078b = viewGroup.getChildAt(0);
        ytiVar.f23079c = (RelativeLayout) viewGroup.getChildAt(1);
        ytiVar.f23080d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ytiVar.f23081e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ytiVar.f23082f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ytiVar.f23083g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ytiVar.f23084h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        ytiVar.f23085i = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        ytiVar.f23086j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ytiVar.f23087k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ytiVar.f23088l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        ytiVar.f23089m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        ytiVar.f23090n = (RelativeLayout) viewGroup.getChildAt(2);
        ytiVar.f23091o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ytiVar.f23092p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ytiVar.f23093q = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ytiVar.f23094r = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m15413b(yti ytiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19821e1, viewGroup, false);
        m15412a(ytiVar, viewInflate);
        return viewInflate;
    }
}
