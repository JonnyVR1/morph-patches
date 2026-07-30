package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksGuideCarouselItemView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class hm70 {
    /* JADX INFO: renamed from: a */
    public static void m135825a(PicksGuideCarouselItemView picksGuideCarouselItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksGuideCarouselItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        picksGuideCarouselItemView._verification = (VImage) viewGroup.getChildAt(1);
    }
}
