package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentGreetView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yh4 {
    /* JADX INFO: renamed from: a */
    public static void m214786a(CardBottomMomentGreetView cardBottomMomentGreetView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomMomentGreetView.f23543c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomMomentGreetView.f23544d = (VLinear) viewGroup.getChildAt(1);
        cardBottomMomentGreetView.f23545e = (CardUserContentView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomMomentGreetView.f23546f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomMomentGreetView.f23547g = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomMomentGreetView.f23548h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomMomentGreetView.f23549i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomMomentGreetView.f23550j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomMomentGreetView.f23551k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        cardBottomMomentGreetView.f23552l = (LetterRemainingSwitcherView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        cardBottomMomentGreetView.f23553m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
    }
}
