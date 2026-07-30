package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPurchasePageTabsContainerView;
import p147v.VImage;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x6p {
    /* JADX INFO: renamed from: a */
    public static void m207191a(w6p w6pVar, View view) {
        w6pVar._layoutrootview = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w6pVar._bg = (VImage) viewGroup.getChildAt(0);
        w6pVar._content = (LinearLayout) viewGroup.getChildAt(1);
        w6pVar._close = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        w6pVar._title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        w6pVar._title_img = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        w6pVar._tabs_container = (IntlPurchasePageTabsContainerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        w6pVar._pager = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m207192b(w6p w6pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131509N, viewGroup, false);
        m207191a(w6pVar, viewInflate);
        return viewInflate;
    }
}
