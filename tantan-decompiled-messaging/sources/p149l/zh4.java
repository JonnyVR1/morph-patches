package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zh4 {
    /* JADX INFO: renamed from: a */
    public static void m218762a(CardBottomMomentLayout cardBottomMomentLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomMomentLayout.f23557c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomMomentLayout.f23558d = (VLinear) viewGroup.getChildAt(1);
        cardBottomMomentLayout.f23559e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomMomentLayout.f23560f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomMomentLayout.f23561g = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomMomentLayout.f23562h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomMomentLayout.f23563i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        cardBottomMomentLayout.f23564j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        cardBottomMomentLayout.f23565k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        cardBottomMomentLayout.f23566l = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cardBottomMomentLayout.f23567m = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        cardBottomMomentLayout.f23568n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        cardBottomMomentLayout.f23569o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
    }
}
