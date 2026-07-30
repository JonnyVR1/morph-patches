package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.profile.views.HomeCardTopNameViewBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class p5l {
    /* JADX INFO: renamed from: a */
    public static void m8713a(HomeCardTopNameViewBar homeCardTopNameViewBar, View view) {
        homeCardTopNameViewBar.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardTopNameViewBar.b = viewGroup.getChildAt(0);
        homeCardTopNameViewBar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardTopNameViewBar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardTopNameViewBar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardTopNameViewBar.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
