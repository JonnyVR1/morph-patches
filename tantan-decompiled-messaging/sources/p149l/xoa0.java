package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xoa0 {
    /* JADX INFO: renamed from: a */
    public static void m210255a(woa0 woa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        woa0Var.f187392u = (FrameLayout) viewGroup.getChildAt(0);
        woa0Var.f187393v = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        woa0Var.f187394w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        woa0Var.f187395x = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        woa0Var.f187396y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        woa0Var.f187397z = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m210256b(woa0 woa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95778fa, viewGroup, false);
        m210255a(woa0Var, viewInflate);
        return viewInflate;
    }
}
