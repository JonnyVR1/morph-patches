package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAddTagsGuide;
import p147v.VButton;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zzp {
    /* JADX INFO: renamed from: a */
    public static void m221026a(ItemAddTagsGuide itemAddTagsGuide, View view) {
        itemAddTagsGuide.f30738a = (ItemAddTagsGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAddTagsGuide.f30739b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAddTagsGuide.f30740c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAddTagsGuide.f30741d = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemAddTagsGuide.f30742e = (VPagerCircleIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemAddTagsGuide.f30743f = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
