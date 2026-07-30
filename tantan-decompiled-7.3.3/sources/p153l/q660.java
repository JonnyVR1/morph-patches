package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes9.dex */
public class q660 {
    /* JADX INFO: renamed from: a */
    public static void m175541a(p660 p660Var, View view) {
        p660Var.f150739a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        p660Var.f150740b = (VImage) viewGroup.getChildAt(0);
        p660Var.f150741c = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        p660Var.f150742d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        p660Var.f150743e = (VText) viewGroup.getChildAt(2);
        p660Var.f150744f = (VLinear) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m175542b(p660 p660Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109082J, viewGroup, false);
        m175541a(p660Var, viewInflate);
        return viewInflate;
    }
}
