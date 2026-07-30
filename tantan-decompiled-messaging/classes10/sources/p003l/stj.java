package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.gift.opt.view.GiftPanelTopBar;
import com.p000p1.mobile.putong.core.p001ui.gift.opt.view.SvipVerticalTextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class stj {
    /* JADX INFO: renamed from: a */
    public static void m9489a(GiftPanelTopBar giftPanelTopBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftPanelTopBar.f1645a = viewGroup.getChildAt(1);
        giftPanelTopBar.f1646b = viewGroup.getChildAt(2);
        giftPanelTopBar.f1647c = viewGroup.getChildAt(3);
        giftPanelTopBar.f1648d = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        giftPanelTopBar.f1649e = (SvipVerticalTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
