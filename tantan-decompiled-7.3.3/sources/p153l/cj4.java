package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomThemeAnswerView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cj4 {
    /* JADX INFO: renamed from: a */
    public static void m110061a(CardBottomThemeAnswerView cardBottomThemeAnswerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomThemeAnswerView.f24327c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomThemeAnswerView.f24328d = (VLinear) viewGroup.getChildAt(1);
        cardBottomThemeAnswerView.f24329e = (CardUserContentView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomThemeAnswerView.f24330f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomThemeAnswerView.f24331g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomThemeAnswerView.f24332h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomThemeAnswerView.f24333i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
