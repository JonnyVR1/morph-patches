package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.external.view.widgets.SwipeRefreshList;
import com.p051p1.mobile.putong.live.external.voiceslipcard.activity.C12759b;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class e2v {
    /* JADX INFO: renamed from: a */
    public static void m119189a(C12759b c12759b, View view) {
        c12759b.f47294a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c12759b.f47295b = (LinearLayout) viewGroup.getChildAt(0);
        c12759b.f47296c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c12759b.f47297d = (SwipeRefreshList) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        c12759b.f47298e = (VRecyclerView) view.findViewById(ldc0.f131567k1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        c12759b.f47299f = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(1);
        c12759b.f47300g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        c12759b.f47301h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        c12759b.f47302i = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(2);
        c12759b.f47303j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        c12759b.f47304k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m119190b(C12759b c12759b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193813Q1, viewGroup, false);
        m119189a(c12759b, viewInflate);
        return viewInflate;
    }
}
