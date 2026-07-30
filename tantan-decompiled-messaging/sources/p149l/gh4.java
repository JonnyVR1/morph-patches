package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlFriendPurposeLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class gh4 {
    /* JADX INFO: renamed from: a */
    public static void m126152a(CardBottomIntlFriendPurposeLayout cardBottomIntlFriendPurposeLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomIntlFriendPurposeLayout.f23481c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomIntlFriendPurposeLayout.f23482d = (VLinear) viewGroup.getChildAt(1);
        cardBottomIntlFriendPurposeLayout.f23483e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomIntlFriendPurposeLayout.f23484f = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
