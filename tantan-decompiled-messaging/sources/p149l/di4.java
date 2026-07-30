package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomThemeAnswerView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class di4 {
    /* JADX INFO: renamed from: a */
    public static void m111863a(CardBottomThemeAnswerView cardBottomThemeAnswerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomThemeAnswerView.f23585c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomThemeAnswerView.f23586d = (VLinear) viewGroup.getChildAt(1);
        cardBottomThemeAnswerView.f23587e = (CardUserContentView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomThemeAnswerView.f23588f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomThemeAnswerView.f23589g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomThemeAnswerView.f23590h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomThemeAnswerView.f23591i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
