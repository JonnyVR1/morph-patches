package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomExpandedProfileItemView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomProfileExpandedLayout;

/* JADX INFO: loaded from: classes10.dex */
public class ai4 {
    /* JADX INFO: renamed from: a */
    public static void m96785a(CardBottomProfileExpandedLayout cardBottomProfileExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomProfileExpandedLayout.f23570c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomProfileExpandedLayout.f23571d = (CardBottomExpandedBasicInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomProfileExpandedLayout.f23572e = (FrameLayout) viewGroup.getChildAt(1);
        cardBottomProfileExpandedLayout.f23573f = (CardBottomExpandedProfileItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
