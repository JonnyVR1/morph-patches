package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.home.virtualcard.HomeNewBizCardView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kbl {
    /* JADX INFO: renamed from: a */
    public static void m149063a(HomeNewBizCardView homeNewBizCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        homeNewBizCardView._card_bg = (VImage) viewGroup.getChildAt(0);
        homeNewBizCardView._icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeNewBizCardView._title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homeNewBizCardView._subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        homeNewBizCardView._img = (VDraweeView) viewGroup.getChildAt(2);
        homeNewBizCardView._ok = (VButton) viewGroup.getChildAt(3);
    }
}
