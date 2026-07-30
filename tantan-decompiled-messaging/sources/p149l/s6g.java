package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubLevelView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s6g {
    /* JADX INFO: renamed from: a */
    public static void m182446a(r6g r6gVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        r6gVar.f157918k = viewGroup.getChildAt(0);
        r6gVar.f157919l = (VImage) viewGroup.getChildAt(1);
        r6gVar.f157920m = (LinearLayout) viewGroup.getChildAt(2);
        r6gVar.f157921n = (LiveFansClubAnchorProfileView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        r6gVar.f157922o = (NestedScrollView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        r6gVar.f157923p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        r6gVar.f157924q = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        r6gVar.f157925r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        r6gVar.f157926s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        r6gVar.f157927t = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        r6gVar.f157928u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        r6gVar.f157929v = (LiveFansClubLevelView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        r6gVar.f157930w = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        r6gVar.f157931x = (FansClubSweetCompanyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        r6gVar.f157932y = (FansClubEventView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        r6gVar.f157933z = (FansBottomSelectView) viewGroup.getChildAt(3);
    }
}
