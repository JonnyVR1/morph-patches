package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hq70 {
    /* JADX INFO: renamed from: a */
    public static void m132432a(gq70 gq70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gq70Var.f103890i = viewGroup.getChildAt(0);
        gq70Var.f103891j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gq70Var.f103892k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gq70Var.f103893l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        gq70Var.f103894m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        gq70Var.f103895n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        gq70Var.f103896o = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        gq70Var.f103897p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        gq70Var.f103898q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
        gq70Var.f103899r = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        gq70Var.f103900s = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        gq70Var.f103901t = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(0);
        gq70Var.f103902u = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m132433b(gq70 gq70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168240X4, viewGroup, false);
        m132432a(gq70Var, viewInflate);
        return viewInflate;
    }
}
