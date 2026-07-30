package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yi4 {
    /* JADX INFO: renamed from: a */
    public static void m216007a(CardBottomMomentLayout cardBottomMomentLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomMomentLayout.f24299c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomMomentLayout.f24300d = (VLinear) viewGroup.getChildAt(1);
        cardBottomMomentLayout.f24301e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomMomentLayout.f24302f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomMomentLayout.f24303g = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomMomentLayout.f24304h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomMomentLayout.f24305i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        cardBottomMomentLayout.f24306j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        cardBottomMomentLayout.f24307k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        cardBottomMomentLayout.f24308l = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cardBottomMomentLayout.f24309m = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        cardBottomMomentLayout.f24310n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        cardBottomMomentLayout.f24311o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
    }
}
