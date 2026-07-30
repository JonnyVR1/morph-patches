package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlFriendPurposeLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class fi4 {
    /* JADX INFO: renamed from: a */
    public static void m125668a(CardBottomIntlFriendPurposeLayout cardBottomIntlFriendPurposeLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomIntlFriendPurposeLayout.f24223c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomIntlFriendPurposeLayout.f24224d = (VLinear) viewGroup.getChildAt(1);
        cardBottomIntlFriendPurposeLayout.f24225e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomIntlFriendPurposeLayout.f24226f = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
