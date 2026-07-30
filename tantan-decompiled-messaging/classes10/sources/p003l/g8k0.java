package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g8k0 {
    /* JADX INFO: renamed from: a */
    public static void m6616a(UserProfileExpandedCardRoot userProfileExpandedCardRoot, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userProfileExpandedCardRoot.C = viewGroup.getChildAt(0);
        userProfileExpandedCardRoot.D = viewGroup.getChildAt(1);
        userProfileExpandedCardRoot.E = viewGroup.getChildAt(2);
        userProfileExpandedCardRoot.F = viewGroup.getChildAt(3);
        userProfileExpandedCardRoot.G = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        userProfileExpandedCardRoot.H = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        userProfileExpandedCardRoot.I = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        userProfileExpandedCardRoot.J = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        userProfileExpandedCardRoot.K = viewGroup.getChildAt(4);
        userProfileExpandedCardRoot.L = viewGroup.getChildAt(5);
        userProfileExpandedCardRoot.M = viewGroup.getChildAt(6);
        userProfileExpandedCardRoot.N = viewGroup.getChildAt(7);
        userProfileExpandedCardRoot.O = (ViewStub) viewGroup.getChildAt(8);
        userProfileExpandedCardRoot.P = (FrameLayout) viewGroup.getChildAt(9);
        userProfileExpandedCardRoot.Q = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        userProfileExpandedCardRoot.R = (ViewStub) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
        userProfileExpandedCardRoot.S = (ViewStub) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(2);
    }
}
