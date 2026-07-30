package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.view.MaximumScroll;
import com.p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sh4 {
    /* JADX INFO: renamed from: a */
    public static void m9350a(CardBottomMomentCardTwoView cardBottomMomentCardTwoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomMomentCardTwoView.c = viewGroup.getChildAt(0);
        cardBottomMomentCardTwoView.d = viewGroup.getChildAt(1);
        cardBottomMomentCardTwoView.e = (MaximumScroll) viewGroup.getChildAt(2);
        cardBottomMomentCardTwoView.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
