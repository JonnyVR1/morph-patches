package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomTagLayout;
import com.p046p1.mobile.putong.core.view.CardLabelShowView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ci4 {
    /* JADX INFO: renamed from: a */
    public static void m107038a(CardBottomTagLayout cardBottomTagLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomTagLayout.f23579c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomTagLayout.f23580d = (VLinear) viewGroup.getChildAt(1);
        cardBottomTagLayout.f23581e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomTagLayout.f23582f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomTagLayout.f23583g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomTagLayout.f23584h = (CardLabelShowView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
