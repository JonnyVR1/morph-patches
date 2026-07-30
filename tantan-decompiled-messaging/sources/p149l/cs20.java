package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VPager;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cs20 {
    /* JADX INFO: renamed from: a */
    public static void m108475a(bs20 bs20Var, View view) {
        bs20Var.f76974a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bs20Var.f76975b = (CoreGiftLayer) viewGroup.getChildAt(0);
        bs20Var.f76976c = (FrameLayout) viewGroup.getChildAt(1);
        bs20Var.f76977d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bs20Var.f76978e = (FrameLayout) viewGroup.getChildAt(2);
        bs20Var.f76979f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bs20Var.f76980g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        bs20Var.f76981h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        bs20Var.f76982i = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        bs20Var.f76983j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        bs20Var.f76984k = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        bs20Var.f76985l = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m108476b(bs20 bs20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126332L, viewGroup, false);
        m108475a(bs20Var, viewInflate);
        return viewInflate;
    }
}
