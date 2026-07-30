package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentGreetView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xi4 {
    /* JADX INFO: renamed from: a */
    public static void m211095a(CardBottomMomentGreetView cardBottomMomentGreetView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomMomentGreetView.f24285c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomMomentGreetView.f24286d = (VLinear) viewGroup.getChildAt(1);
        cardBottomMomentGreetView.f24287e = (CardUserContentView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomMomentGreetView.f24288f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomMomentGreetView.f24289g = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomMomentGreetView.f24290h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomMomentGreetView.f24291i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomMomentGreetView.f24292j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomMomentGreetView.f24293k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        cardBottomMomentGreetView.f24294l = (LetterRemainingSwitcherView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        cardBottomMomentGreetView.f24295m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
    }
}
