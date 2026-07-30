package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kch0 {
    /* JADX INFO: renamed from: a */
    public static void m149112a(jch0 jch0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jch0Var.f120060j = (SVGAnimationView) viewGroup.getChildAt(0);
        jch0Var.f120061k = (SimpleDraweeView) viewGroup.getChildAt(1);
        jch0Var.f120062l = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        jch0Var.f120063m = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        jch0Var.f120064n = (VImage) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m149113b(jch0 jch0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125946m6, viewGroup, false);
        m149112a(jch0Var, viewInflate);
        return viewInflate;
    }
}
