package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p046p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelDView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelEView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelLeftTopView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSpecialLabelView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareSuggestItemView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class a7o {
    /* JADX INFO: renamed from: a */
    public static void m95296a(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareSuggestItemView.f45837a = (LiveSquareMediaView) viewGroup.getChildAt(0);
        intlLiveSquareSuggestItemView.f45838b = (VFrame) viewGroup.getChildAt(1);
        intlLiveSquareSuggestItemView.f45839c = (VFrame) viewGroup.getChildAt(2);
        intlLiveSquareSuggestItemView.f45840d = (LiveIntlSquareFrameView) viewGroup.getChildAt(3);
        intlLiveSquareSuggestItemView.f45841e = (ViewStub) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        intlLiveSquareSuggestItemView.f45842f = (IntlLiveSpecialLabelView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        intlLiveSquareSuggestItemView.f45843g = (IntlLiveNewLabelDView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        intlLiveSquareSuggestItemView.f45844h = (IntlLiveNewLabelLeftTopView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        intlLiveSquareSuggestItemView.f45845i = (IntlLiveNewLabelEView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        intlLiveSquareSuggestItemView.f45846j = (LiveNewOptLabelView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(5);
        intlLiveSquareSuggestItemView.f45847k = (ViewStub) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(6);
        intlLiveSquareSuggestItemView.f45848l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(7);
        intlLiveSquareSuggestItemView.f45849m = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(8);
        intlLiveSquareSuggestItemView.f45850n = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(9);
        intlLiveSquareSuggestItemView.f45851o = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(10);
    }
}
