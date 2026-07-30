package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.external.view.widgets.SwipeRefreshList;
import com.p046p1.mobile.putong.live.external.voiceslipcard.activity.C12596b;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class d0v {
    /* JADX INFO: renamed from: a */
    public static void m109554a(C12596b c12596b, View view) {
        c12596b.f46446a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c12596b.f46447b = (LinearLayout) viewGroup.getChildAt(0);
        c12596b.f46448c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c12596b.f46449d = (SwipeRefreshList) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        c12596b.f46450e = (VRecyclerView) view.findViewById(f5c0.f95110k1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        c12596b.f46451f = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(1);
        c12596b.f46452g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        c12596b.f46453h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        c12596b.f46454i = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(2);
        c12596b.f46455j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        c12596b.f46456k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m109555b(C12596b c12596b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162699Q1, viewGroup, false);
        m109554a(c12596b, viewInflate);
        return viewInflate;
    }
}
