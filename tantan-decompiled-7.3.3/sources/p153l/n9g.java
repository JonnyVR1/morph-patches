package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansRecallSelectView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class n9g {
    /* JADX INFO: renamed from: a */
    public static void m161977a(FansClubEventView fansClubEventView, View view) {
        fansClubEventView.f49877a = (FansClubEventView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fansClubEventView.f49878b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fansClubEventView.f49879c = (FansClubTabView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fansClubEventView.f49880d = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fansClubEventView.f49881e = (FansRecallSelectView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
