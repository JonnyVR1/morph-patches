package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.view.MaximumScroll;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;

/* JADX INFO: loaded from: classes10.dex */
public class ri4 {
    /* JADX INFO: renamed from: a */
    public static void m181571a(CardBottomMomentCardTwoView cardBottomMomentCardTwoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomMomentCardTwoView.f24275c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomMomentCardTwoView.f24276d = (CardUserContentView) viewGroup.getChildAt(1);
        cardBottomMomentCardTwoView.f24277e = (MaximumScroll) viewGroup.getChildAt(2);
        cardBottomMomentCardTwoView.f24278f = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
