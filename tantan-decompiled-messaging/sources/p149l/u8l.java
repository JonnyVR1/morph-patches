package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.home.virtualcard.HomeNewBizCardView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u8l {
    /* JADX INFO: renamed from: a */
    public static void m192205a(HomeNewBizCardView homeNewBizCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        homeNewBizCardView._card_bg = (VImage) viewGroup.getChildAt(0);
        homeNewBizCardView._icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeNewBizCardView._title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homeNewBizCardView._subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        homeNewBizCardView._img = (VDraweeView) viewGroup.getChildAt(2);
        homeNewBizCardView._ok = (VButton) viewGroup.getChildAt(3);
    }
}
