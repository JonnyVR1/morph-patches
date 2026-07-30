package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksGuideCarouselView;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksGuideView;

/* JADX INFO: loaded from: classes10.dex */
public class nm70 {
    /* JADX INFO: renamed from: a */
    public static void m163804a(PicksGuideView picksGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksGuideView._carousel_view = (PicksGuideCarouselView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        picksGuideView._title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        picksGuideView._subtitle = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        picksGuideView._check = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
