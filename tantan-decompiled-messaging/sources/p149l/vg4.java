package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomDefaultExpandedLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomExpandedProfileItemView;
import com.p046p1.mobile.putong.core.newui.home.views.IconTextView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vg4 {
    /* JADX INFO: renamed from: a */
    public static void m198315a(CardBottomDefaultExpandedLayout cardBottomDefaultExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomDefaultExpandedLayout.f23449c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomDefaultExpandedLayout.f23450d = (CardBottomExpandedBasicInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomDefaultExpandedLayout.f23451e = (VLinear) viewGroup.getChildAt(1);
        cardBottomDefaultExpandedLayout.f23452f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomDefaultExpandedLayout.f23453g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomDefaultExpandedLayout.f23454h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomDefaultExpandedLayout.f23455i = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomDefaultExpandedLayout.f23456j = (IconTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomDefaultExpandedLayout.f23457k = (CardBottomExpandedProfileItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
