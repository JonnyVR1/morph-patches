package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomExpandedProfileItemView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xh4 {
    /* JADX INFO: renamed from: a */
    public static void m210982a(CardBottomExpandedProfileItemView cardBottomExpandedProfileItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomExpandedProfileItemView.f24209c = (VLinear) viewGroup.getChildAt(0);
        cardBottomExpandedProfileItemView.f24210d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomExpandedProfileItemView.f24211e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardBottomExpandedProfileItemView.f24212f = (VLinear) viewGroup.getChildAt(1);
        cardBottomExpandedProfileItemView.f24213g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomExpandedProfileItemView.f24214h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
