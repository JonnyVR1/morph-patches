package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ip70 {
    /* JADX INFO: renamed from: a */
    public static void m141447a(hp70 hp70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hp70Var._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        hp70Var._root = (VFrame) viewGroup.getChildAt(1);
        hp70Var._loading = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hp70Var._empty = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        hp70Var._empty_image = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        hp70Var._empty_tip = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hp70Var._empty_time = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        hp70Var._empty_space = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        hp70Var._empty_info_layout = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        hp70Var._empty_info_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        hp70Var._empty_info_subTitle = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        hp70Var._empty_liked_user = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(2);
        hp70Var._progress = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        hp70Var._list = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hp70Var._list_foreground = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        hp70Var._get_privilege = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m141448b(hp70 hp70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151967a1, viewGroup, false);
        m141447a(hp70Var, viewInflate);
        return viewInflate;
    }
}
