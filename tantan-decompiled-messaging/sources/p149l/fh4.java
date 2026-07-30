package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlComplimentReceivedLayout;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class fh4 {
    /* JADX INFO: renamed from: a */
    public static void m121348a(CardBottomIntlComplimentReceivedLayout cardBottomIntlComplimentReceivedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomIntlComplimentReceivedLayout.f23473c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomIntlComplimentReceivedLayout.f23474d = (VLinear) viewGroup.getChildAt(1);
        cardBottomIntlComplimentReceivedLayout.f23475e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomIntlComplimentReceivedLayout.f23476f = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        cardBottomIntlComplimentReceivedLayout.f23477g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        cardBottomIntlComplimentReceivedLayout.f23478h = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        cardBottomIntlComplimentReceivedLayout.f23479i = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        cardBottomIntlComplimentReceivedLayout.f23480j = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}
