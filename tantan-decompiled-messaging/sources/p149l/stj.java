package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftPanelTopBar;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.SvipVerticalTextView;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes10.dex */
public class stj {
    /* JADX INFO: renamed from: a */
    public static void m185958a(GiftPanelTopBar giftPanelTopBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftPanelTopBar.f29251a = (TabLayout) viewGroup.getChildAt(1);
        giftPanelTopBar.f29252b = (VMarqueeText) viewGroup.getChildAt(2);
        giftPanelTopBar.f29253c = (VLinear) viewGroup.getChildAt(3);
        giftPanelTopBar.f29254d = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        giftPanelTopBar.f29255e = (SvipVerticalTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
