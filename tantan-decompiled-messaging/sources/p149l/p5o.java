package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSpecialLabelView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareNearbyItemView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class p5o {
    /* JADX INFO: renamed from: a */
    public static void m167512a(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareNearbyItemView.f45829a = (LiveSquareMediaView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlLiveSquareNearbyItemView.f45830b = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlLiveSquareNearbyItemView.f45831c = (IntlLiveSpecialLabelView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlLiveSquareNearbyItemView.f45832d = (LiveNewOptLabelView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlLiveSquareNearbyItemView.f45833e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlLiveSquareNearbyItemView.f45834f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlLiveSquareNearbyItemView.f45835g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlLiveSquareNearbyItemView.f45836h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
