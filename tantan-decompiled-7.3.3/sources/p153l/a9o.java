package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p051p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelDView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelEView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelLeftTopView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSpecialLabelView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareSuggestItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class a9o {
    /* JADX INFO: renamed from: a */
    public static void m96602a(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareSuggestItemView.f46685a = (LiveSquareMediaView) viewGroup.getChildAt(0);
        intlLiveSquareSuggestItemView.f46686b = (VFrame) viewGroup.getChildAt(1);
        intlLiveSquareSuggestItemView.f46687c = (VFrame) viewGroup.getChildAt(2);
        intlLiveSquareSuggestItemView.f46688d = (LiveIntlSquareFrameView) viewGroup.getChildAt(3);
        intlLiveSquareSuggestItemView.f46689e = (ViewStub) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        intlLiveSquareSuggestItemView.f46690f = (IntlLiveSpecialLabelView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        intlLiveSquareSuggestItemView.f46691g = (IntlLiveNewLabelDView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        intlLiveSquareSuggestItemView.f46692h = (IntlLiveNewLabelLeftTopView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        intlLiveSquareSuggestItemView.f46693i = (IntlLiveNewLabelEView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        intlLiveSquareSuggestItemView.f46694j = (LiveNewOptLabelView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(5);
        intlLiveSquareSuggestItemView.f46695k = (ViewStub) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(6);
        intlLiveSquareSuggestItemView.f46696l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(7);
        intlLiveSquareSuggestItemView.f46697m = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(8);
        intlLiveSquareSuggestItemView.f46698n = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(9);
        intlLiveSquareSuggestItemView.f46699o = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(10);
    }
}
