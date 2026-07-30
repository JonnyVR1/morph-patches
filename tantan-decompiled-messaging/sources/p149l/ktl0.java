package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.virtual.payGuide.VirtualPayGuideV2View;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ktl0 {
    /* JADX INFO: renamed from: a */
    public static void m147213a(VirtualPayGuideV2View virtualPayGuideV2View, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualPayGuideV2View.f52625d = (VDraweeView) viewGroup.getChildAt(0);
        virtualPayGuideV2View.f52626e = (VImage) viewGroup.getChildAt(1);
        virtualPayGuideV2View.f52627f = (VText) viewGroup.getChildAt(2);
        virtualPayGuideV2View.f52628g = (VLinear) viewGroup.getChildAt(3);
        virtualPayGuideV2View.f52629h = (VMarqueeText) viewGroup.getChildAt(4);
        virtualPayGuideV2View.f52630i = (VFrame) viewGroup.getChildAt(5);
        virtualPayGuideV2View.f52631j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        virtualPayGuideV2View.f52632k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
    }
}
