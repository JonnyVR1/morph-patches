package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardClipBgView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedOpAnimView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mhk0 {
    /* JADX INFO: renamed from: a */
    public static void m158421a(UserProfileExpandedCardRoot userProfileExpandedCardRoot, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userProfileExpandedCardRoot.f23041C = (ExpandedCardClipBgView) viewGroup.getChildAt(0);
        userProfileExpandedCardRoot.f23042D = (UserProfileExpandedCard) viewGroup.getChildAt(1);
        userProfileExpandedCardRoot.f23043E = (VText) viewGroup.getChildAt(2);
        userProfileExpandedCardRoot.f23045F = (VFrame) viewGroup.getChildAt(3);
        userProfileExpandedCardRoot.f23047G = (ExpandedOpAnimView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        userProfileExpandedCardRoot.f23049H = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        userProfileExpandedCardRoot.f23051I = (ExpandedOpAnimView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        userProfileExpandedCardRoot.f23053J = (ExpandedOpAnimView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        userProfileExpandedCardRoot.f23055K = (ExpandedOpAnimView) viewGroup.getChildAt(4);
        userProfileExpandedCardRoot.f23056L = (ExpandedOpAnimView) viewGroup.getChildAt(5);
        userProfileExpandedCardRoot.f23057M = viewGroup.getChildAt(6);
        userProfileExpandedCardRoot.f23058N = (SimpleDraweeView) viewGroup.getChildAt(7);
        userProfileExpandedCardRoot.f23059O = (ViewStub) viewGroup.getChildAt(8);
        userProfileExpandedCardRoot.f23060P = (FrameLayout) viewGroup.getChildAt(9);
        userProfileExpandedCardRoot.f23061Q = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        userProfileExpandedCardRoot.f23062R = (ViewStub) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
        userProfileExpandedCardRoot.f23063S = (ViewStub) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(2);
    }
}
