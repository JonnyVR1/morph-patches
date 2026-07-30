package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchasePageTabsContainerView;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x8p {
    /* JADX INFO: renamed from: a */
    public static void m209748a(w8p w8pVar, View view) {
        w8pVar._layoutrootview = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w8pVar._bg = (VImage) viewGroup.getChildAt(0);
        w8pVar._content = (LinearLayout) viewGroup.getChildAt(1);
        w8pVar._close = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        w8pVar._title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        w8pVar._title_img = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        w8pVar._tabs_container = (IntlPurchasePageTabsContainerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        w8pVar._pager = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m209749b(w8p w8pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162469N, viewGroup, false);
        m209748a(w8pVar, viewInflate);
        return viewInflate;
    }
}
