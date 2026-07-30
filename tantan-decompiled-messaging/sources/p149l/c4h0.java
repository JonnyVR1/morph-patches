package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c4h0 {
    /* JADX INFO: renamed from: a */
    public static void m105217a(b4h0 b4h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b4h0Var.f73360j = (SVGAnimationView) viewGroup.getChildAt(0);
        b4h0Var.f73361k = (SimpleDraweeView) viewGroup.getChildAt(1);
        b4h0Var.f73362l = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        b4h0Var.f73363m = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        b4h0Var.f73364n = (VImage) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m105218b(b4h0 b4h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95875l6, viewGroup, false);
        m105217a(b4h0Var, viewInflate);
        return viewInflate;
    }
}
