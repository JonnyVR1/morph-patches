package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class la20 {
    /* JADX INFO: renamed from: a */
    public static void m153468a(ka20 ka20Var, View view) {
        ka20Var._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        ka20Var._list = (VPullUpRecyclerView) view.findViewById(ddc0.f87910p);
        ViewGroup viewGroup = (ViewGroup) view;
        ka20Var._privilege = (FrameLayout) viewGroup.getChildAt(1);
        ka20Var._get_privilege = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m153469b(ka20 ka20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151918K0, viewGroup, false);
        m153468a(ka20Var, viewInflate);
        return viewInflate;
    }
}
