package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.home.virtualcard.HomeNewBizCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u8l {
    /* JADX INFO: renamed from: a */
    public static void m9692a(HomeNewBizCardView homeNewBizCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        homeNewBizCardView._card_bg = viewGroup.getChildAt(0);
        homeNewBizCardView._icon = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeNewBizCardView._title = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homeNewBizCardView._subtitle = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        homeNewBizCardView._img = viewGroup.getChildAt(2);
        homeNewBizCardView._ok = viewGroup.getChildAt(3);
    }
}
