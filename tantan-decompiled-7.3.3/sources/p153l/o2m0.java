package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.virtual.payGuide.VirtualPayGuideV2View;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class o2m0 {
    /* JADX INFO: renamed from: a */
    public static void m165734a(VirtualPayGuideV2View virtualPayGuideV2View, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualPayGuideV2View.f53473d = (VDraweeView) viewGroup.getChildAt(0);
        virtualPayGuideV2View.f53474e = (VImage) viewGroup.getChildAt(1);
        virtualPayGuideV2View.f53475f = (VText) viewGroup.getChildAt(2);
        virtualPayGuideV2View.f53476g = (VLinear) viewGroup.getChildAt(3);
        virtualPayGuideV2View.f53477h = (VMarqueeText) viewGroup.getChildAt(4);
        virtualPayGuideV2View.f53478i = (VFrame) viewGroup.getChildAt(5);
        virtualPayGuideV2View.f53479j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        virtualPayGuideV2View.f53480k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
    }
}
