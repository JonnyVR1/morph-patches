package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPager;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l100 {
    /* JADX INFO: renamed from: a */
    public static void m152415a(h100 h100Var, View view) {
        h100Var.f107362a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h100Var.f107363b = (FrameLayout) viewGroup.getChildAt(0);
        h100Var.f107364c = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        h100Var.f107365d = (NewPictureContainerIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        h100Var.f107366e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        h100Var.f107367f = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        h100Var.f107368g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        h100Var.f107369h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        h100Var.f107370i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        h100Var.f107371j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        h100Var.f107372k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        h100Var.f107373l = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m152416b(h100 h100Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157110r3, viewGroup, false);
        m152415a(h100Var, viewInflate);
        return viewInflate;
    }
}
