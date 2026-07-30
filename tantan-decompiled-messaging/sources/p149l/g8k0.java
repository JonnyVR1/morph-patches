package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardClipBgView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedOpAnimView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class g8k0 {
    /* JADX INFO: renamed from: a */
    public static void m124757a(UserProfileExpandedCardRoot userProfileExpandedCardRoot, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userProfileExpandedCardRoot.f22299C = (ExpandedCardClipBgView) viewGroup.getChildAt(0);
        userProfileExpandedCardRoot.f22300D = (UserProfileExpandedCard) viewGroup.getChildAt(1);
        userProfileExpandedCardRoot.f22301E = (VText) viewGroup.getChildAt(2);
        userProfileExpandedCardRoot.f22303F = (VFrame) viewGroup.getChildAt(3);
        userProfileExpandedCardRoot.f22305G = (ExpandedOpAnimView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        userProfileExpandedCardRoot.f22307H = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        userProfileExpandedCardRoot.f22309I = (ExpandedOpAnimView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        userProfileExpandedCardRoot.f22311J = (ExpandedOpAnimView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        userProfileExpandedCardRoot.f22313K = (ExpandedOpAnimView) viewGroup.getChildAt(4);
        userProfileExpandedCardRoot.f22314L = (ExpandedOpAnimView) viewGroup.getChildAt(5);
        userProfileExpandedCardRoot.f22315M = viewGroup.getChildAt(6);
        userProfileExpandedCardRoot.f22316N = (SimpleDraweeView) viewGroup.getChildAt(7);
        userProfileExpandedCardRoot.f22317O = (ViewStub) viewGroup.getChildAt(8);
        userProfileExpandedCardRoot.f22318P = (FrameLayout) viewGroup.getChildAt(9);
        userProfileExpandedCardRoot.f22319Q = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        userProfileExpandedCardRoot.f22320R = (ViewStub) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
        userProfileExpandedCardRoot.f22321S = (ViewStub) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(2);
    }
}
