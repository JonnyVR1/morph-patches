package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubLevelView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s6g {
    /* JADX INFO: renamed from: a */
    public static void m22212a(r6g r6gVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        r6gVar.f18378k = viewGroup.getChildAt(0);
        r6gVar.f18379l = viewGroup.getChildAt(1);
        r6gVar.f18380m = (LinearLayout) viewGroup.getChildAt(2);
        r6gVar.f18381n = (LiveFansClubAnchorProfileView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        r6gVar.f18382o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        r6gVar.f18383p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        r6gVar.f18384q = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        r6gVar.f18385r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        r6gVar.f18386s = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        r6gVar.f18387t = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        r6gVar.f18388u = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        r6gVar.f18389v = (LiveFansClubLevelView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        r6gVar.f18390w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        r6gVar.f18391x = (FansClubSweetCompanyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        r6gVar.f18392y = (FansClubEventView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        r6gVar.f18393z = (FansBottomSelectView) viewGroup.getChildAt(3);
    }
}
