package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.gift.HorRecyclerViewIndicator;
import com.p000p1.mobile.putong.core.p001ui.gift.panel.NewGiftPanelPagerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kr20 {
    /* JADX INFO: renamed from: a */
    public static void m7634a(NewGiftPanelPagerView newGiftPanelPagerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newGiftPanelPagerView.f1679c = viewGroup.getChildAt(0);
        newGiftPanelPagerView.f1680d = (HorRecyclerViewIndicator) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
