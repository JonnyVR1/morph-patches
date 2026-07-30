package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksGuideCarouselItemView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class be70 {
    /* JADX INFO: renamed from: a */
    public static void m101324a(PicksGuideCarouselItemView picksGuideCarouselItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksGuideCarouselItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        picksGuideCarouselItemView._verification = (VImage) viewGroup.getChildAt(1);
    }
}
