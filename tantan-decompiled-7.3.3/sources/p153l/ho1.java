package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ho1 {
    /* JADX INFO: renamed from: a */
    public static void m136380a(go1 go1Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        go1Var.f105181a = (VImage) viewGroup.getChildAt(0);
        go1Var.f105182b = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        go1Var.f105183c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        go1Var.f105184d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        go1Var.f105185e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        go1Var.f105186f = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        go1Var.f105187g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        go1Var.f105188h = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        go1Var.f105189i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        go1Var.f105190j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        go1Var.f105191k = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        go1Var.f105192l = (VText_Default_Bold) viewGroup.getChildAt(2);
        go1Var.f105193m = (VImage) viewGroup.getChildAt(3);
        go1Var.f105194n = (VButton) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m136381b(go1 go1Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125576Q, viewGroup, false);
        m136380a(go1Var, viewInflate);
        return viewInflate;
    }
}
