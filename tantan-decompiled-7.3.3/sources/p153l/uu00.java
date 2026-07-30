package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9211d;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterBar;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class uu00 {
    /* JADX INFO: renamed from: a */
    public static void m198137a(C9211d c9211d, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c9211d.f38998a = (VNavigationBar) viewGroup.getChildAt(0);
        c9211d.f38999b = (VLinear) viewGroup.getChildAt(1);
        c9211d.f39000c = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c9211d.f39001d = (VPullUpRecyclerView) view.findViewById(ddc0.f87893W);
        ViewGroup viewGroup2 = (ViewGroup) view;
        c9211d.f39002e = (FrameLayout) viewGroup2.getChildAt(2);
        c9211d.f39003f = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        c9211d.f39004g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(0);
        c9211d.f39005h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(1);
        c9211d.f39006i = (VLinear) viewGroup2.getChildAt(3);
        c9211d.f39007j = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        c9211d.f39008k = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        c9211d.f39009l = (VRelative) viewGroup2.getChildAt(4);
        c9211d.f39010m = (VImage) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(0);
        c9211d.f39011n = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(1);
        c9211d.f39012o = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(2);
        c9211d.f39013p = (VButton) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(3);
        c9211d.f39014q = (FrameLayout) viewGroup2.getChildAt(5);
        c9211d.f39015r = ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(0);
        c9211d.f39016s = (VisitorsFilterBar) ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m198138b(C9211d c9211d, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151968a2, viewGroup, false);
        m198137a(c9211d, viewInflate);
        return viewInflate;
    }
}
