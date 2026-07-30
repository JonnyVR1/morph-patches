package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p151v.VFrame;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class d2l {
    /* JADX INFO: renamed from: a */
    public static void m113705a(c2l c2lVar, View view) {
        c2lVar._root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c2lVar._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        c2lVar._help_layout = (VRelative) viewGroup.getChildAt(1);
        c2lVar._help_layout_tv_helper = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c2lVar._help_layout_helper_arrow = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        c2lVar._official_layout = (VFrame) viewGroup.getChildAt(2);
        c2lVar._official_layout_official_helper = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        c2lVar._official_layout_official_arrow = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        c2lVar._web_subscription_layout = (VFrame) viewGroup.getChildAt(3);
        c2lVar._web_subscription_layout_web_subscription_desc = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        c2lVar._web_subscription_layout_web_subscription_arrow = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m113706b(c2l c2lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125453I4, viewGroup, false);
        m113705a(c2lVar, viewInflate);
        return viewInflate;
    }
}
