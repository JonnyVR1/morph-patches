package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomTagExpandedLayout;
import com.p046p1.mobile.putong.core.view.CardLabelShowView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bi4 {
    /* JADX INFO: renamed from: a */
    public static void m101970a(CardBottomTagExpandedLayout cardBottomTagExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomTagExpandedLayout.f23574c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomTagExpandedLayout.f23575d = (CardBottomExpandedBasicInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomTagExpandedLayout.f23576e = (FrameLayout) viewGroup.getChildAt(1);
        cardBottomTagExpandedLayout.f23577f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomTagExpandedLayout.f23578g = (CardLabelShowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}
