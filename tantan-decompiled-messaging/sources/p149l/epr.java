package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p046p1.mobile.putong.live.external.view.widgets.SwipeRefreshList;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class epr {
    /* JADX INFO: renamed from: a */
    public static void m117674a(LiveActivitiesAct liveActivitiesAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesAct.f44961c = (VNavigationBar) viewGroup.getChildAt(0);
        liveActivitiesAct.f44962d = (SwipeRefreshList) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveActivitiesAct.f44963e = (VRecyclerView) view.findViewById(f5c0.f95110k1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        liveActivitiesAct.f44964f = (VRelative) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        liveActivitiesAct.f44965g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0);
        liveActivitiesAct.f44966h = (VRelative) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        liveActivitiesAct.f44967i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m117675b(LiveActivitiesAct liveActivitiesAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162727a, viewGroup, false);
        m117674a(liveActivitiesAct, viewInflate);
        return viewInflate;
    }
}
