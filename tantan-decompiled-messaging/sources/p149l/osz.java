package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPager;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class osz {
    /* JADX INFO: renamed from: a */
    public static void m165917a(ksz kszVar, View view) {
        kszVar.f124525a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kszVar.f124526b = (FrameLayout) viewGroup.getChildAt(0);
        kszVar.f124527c = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kszVar.f124528d = (NewPictureContainerIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kszVar.f124529e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        kszVar.f124530f = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        kszVar.f124531g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        kszVar.f124532h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        kszVar.f124533i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        kszVar.f124534j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        kszVar.f124535k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        kszVar.f124536l = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m165918b(ksz kszVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126554r3, viewGroup, false);
        m165917a(kszVar, viewInflate);
        return viewInflate;
    }
}
