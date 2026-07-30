package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAddArtworkGuide;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qzp {
    /* JADX INFO: renamed from: a */
    public static void m177277a(ItemAddArtworkGuide itemAddArtworkGuide, View view) {
        itemAddArtworkGuide.f30723a = (ItemAddArtworkGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAddArtworkGuide.f30724b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAddArtworkGuide.f30725c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAddArtworkGuide.f30726d = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemAddArtworkGuide.f30727e = (VPagerCircleIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
