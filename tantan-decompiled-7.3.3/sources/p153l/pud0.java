package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.view.VPagerNewCircleIndicator;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pud0 {
    /* JADX INFO: renamed from: a */
    public static void m173862a(oud0 oud0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oud0Var.f149120a = (VImage) viewGroup.getChildAt(0);
        oud0Var.f149121b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oud0Var.f149122c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oud0Var.f149123d = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        oud0Var.f149124e = (VPagerCircleIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        oud0Var.f149125f = (VPagerNewCircleIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        oud0Var.f149126g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
