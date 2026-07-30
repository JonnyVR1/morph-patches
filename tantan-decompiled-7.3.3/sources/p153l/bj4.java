package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomTagLayout;
import com.p051p1.mobile.putong.core.view.CardLabelShowView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bj4 {
    /* JADX INFO: renamed from: a */
    public static void m104593a(CardBottomTagLayout cardBottomTagLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomTagLayout.f24321c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomTagLayout.f24322d = (VLinear) viewGroup.getChildAt(1);
        cardBottomTagLayout.f24323e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomTagLayout.f24324f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomTagLayout.f24325g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomTagLayout.f24326h = (CardLabelShowView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
