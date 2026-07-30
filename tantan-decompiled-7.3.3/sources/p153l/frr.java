package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p051p1.mobile.putong.live.external.view.widgets.SwipeRefreshList;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class frr {
    /* JADX INFO: renamed from: a */
    public static void m126978a(LiveActivitiesAct liveActivitiesAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesAct.f45809c = (VNavigationBar) viewGroup.getChildAt(0);
        liveActivitiesAct.f45810d = (SwipeRefreshList) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveActivitiesAct.f45811e = (VRecyclerView) view.findViewById(ldc0.f131567k1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        liveActivitiesAct.f45812f = (VRelative) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        liveActivitiesAct.f45813g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0);
        liveActivitiesAct.f45814h = (VRelative) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        liveActivitiesAct.f45815i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m126979b(LiveActivitiesAct liveActivitiesAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193841a, viewGroup, false);
        m126978a(liveActivitiesAct, viewInflate);
        return viewInflate;
    }
}
