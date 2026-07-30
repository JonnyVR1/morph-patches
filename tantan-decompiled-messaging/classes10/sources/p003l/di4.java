package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.CardBottomThemeAnswerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class di4 {
    /* JADX INFO: renamed from: a */
    public static void m6117a(CardBottomThemeAnswerView cardBottomThemeAnswerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomThemeAnswerView.c = viewGroup.getChildAt(0);
        cardBottomThemeAnswerView.d = viewGroup.getChildAt(1);
        cardBottomThemeAnswerView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomThemeAnswerView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomThemeAnswerView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomThemeAnswerView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomThemeAnswerView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
