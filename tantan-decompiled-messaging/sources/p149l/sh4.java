package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.view.MaximumScroll;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;

/* JADX INFO: loaded from: classes10.dex */
public class sh4 {
    /* JADX INFO: renamed from: a */
    public static void m184154a(CardBottomMomentCardTwoView cardBottomMomentCardTwoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomMomentCardTwoView.f23533c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomMomentCardTwoView.f23534d = (CardUserContentView) viewGroup.getChildAt(1);
        cardBottomMomentCardTwoView.f23535e = (MaximumScroll) viewGroup.getChildAt(2);
        cardBottomMomentCardTwoView.f23536f = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
