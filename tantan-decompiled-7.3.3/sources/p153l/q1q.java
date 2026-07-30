package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAddArtworkGuide;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q1q {
    /* JADX INFO: renamed from: a */
    public static void m174927a(ItemAddArtworkGuide itemAddArtworkGuide, View view) {
        itemAddArtworkGuide.f31571a = (ItemAddArtworkGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAddArtworkGuide.f31572b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAddArtworkGuide.f31573c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAddArtworkGuide.f31574d = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemAddArtworkGuide.f31575e = (VPagerCircleIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
