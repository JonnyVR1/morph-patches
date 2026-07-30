package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomExpandedProfileItemView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomProfileExpandedLayout;

/* JADX INFO: loaded from: classes10.dex */
public class zi4 {
    /* JADX INFO: renamed from: a */
    public static void m219723a(CardBottomProfileExpandedLayout cardBottomProfileExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomProfileExpandedLayout.f24312c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomProfileExpandedLayout.f24313d = (CardBottomExpandedBasicInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomProfileExpandedLayout.f24314e = (FrameLayout) viewGroup.getChildAt(1);
        cardBottomProfileExpandedLayout.f24315f = (CardBottomExpandedProfileItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
