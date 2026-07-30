package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansRecallSelectView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class z7g {
    /* JADX INFO: renamed from: a */
    public static void m217463a(FansClubEventView fansClubEventView, View view) {
        fansClubEventView.f49029a = (FansClubEventView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fansClubEventView.f49030b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fansClubEventView.f49031c = (FansClubTabView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fansClubEventView.f49032d = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fansClubEventView.f49033e = (FansRecallSelectView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
