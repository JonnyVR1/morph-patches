package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSpecialLabelView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareNearbyItemView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class p7o {
    /* JADX INFO: renamed from: a */
    public static void m171159a(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareNearbyItemView.f46677a = (LiveSquareMediaView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlLiveSquareNearbyItemView.f46678b = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlLiveSquareNearbyItemView.f46679c = (IntlLiveSpecialLabelView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlLiveSquareNearbyItemView.f46680d = (LiveNewOptLabelView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlLiveSquareNearbyItemView.f46681e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlLiveSquareNearbyItemView.f46682f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlLiveSquareNearbyItemView.f46683g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlLiveSquareNearbyItemView.f46684h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
