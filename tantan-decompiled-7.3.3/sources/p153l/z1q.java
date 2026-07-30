package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAddTagsGuide;
import p151v.VButton;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z1q {
    /* JADX INFO: renamed from: a */
    public static void m218364a(ItemAddTagsGuide itemAddTagsGuide, View view) {
        itemAddTagsGuide.f31586a = (ItemAddTagsGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAddTagsGuide.f31587b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAddTagsGuide.f31588c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAddTagsGuide.f31589d = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemAddTagsGuide.f31590e = (VPagerCircleIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemAddTagsGuide.f31591f = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
