package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ao1 {
    /* JADX INFO: renamed from: a */
    public static void m97839a(zn1 zn1Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zn1Var.f203914a = (VImage) viewGroup.getChildAt(0);
        zn1Var.f203915b = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zn1Var.f203916c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        zn1Var.f203917d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        zn1Var.f203918e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        zn1Var.f203919f = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        zn1Var.f203920g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        zn1Var.f203921h = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        zn1Var.f203922i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        zn1Var.f203923j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        zn1Var.f203924k = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        zn1Var.f203925l = (VText_Default_Bold) viewGroup.getChildAt(2);
        zn1Var.f203926m = (VImage) viewGroup.getChildAt(3);
        zn1Var.f203927n = (VButton) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m97840b(zn1 zn1Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95522Q, viewGroup, false);
        m97839a(zn1Var, viewInflate);
        return viewInflate;
    }
}
