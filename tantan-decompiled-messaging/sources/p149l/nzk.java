package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p147v.VFrame;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class nzk {
    /* JADX INFO: renamed from: a */
    public static void m162069a(mzk mzkVar, View view) {
        mzkVar._root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mzkVar._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        mzkVar._help_layout = (VRelative) viewGroup.getChildAt(1);
        mzkVar._help_layout_tv_helper = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mzkVar._help_layout_helper_arrow = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mzkVar._official_layout = (VFrame) viewGroup.getChildAt(2);
        mzkVar._official_layout_official_helper = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        mzkVar._official_layout_official_arrow = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        mzkVar._web_subscription_layout = (VFrame) viewGroup.getChildAt(3);
        mzkVar._web_subscription_layout_web_subscription_desc = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        mzkVar._web_subscription_layout_web_subscription_arrow = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m162070b(mzk mzkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95399I4, viewGroup, false);
        m162069a(mzkVar, viewInflate);
        return viewInflate;
    }
}
