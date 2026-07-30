package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftPanelTopBar;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.SvipVerticalTextView;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes10.dex */
public class iwj {
    /* JADX INFO: renamed from: a */
    public static void m142384a(GiftPanelTopBar giftPanelTopBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftPanelTopBar.f30099a = (TabLayout) viewGroup.getChildAt(1);
        giftPanelTopBar.f30100b = (VMarqueeText) viewGroup.getChildAt(2);
        giftPanelTopBar.f30101c = (VLinear) viewGroup.getChildAt(3);
        giftPanelTopBar.f30102d = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        giftPanelTopBar.f30103e = (SvipVerticalTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
