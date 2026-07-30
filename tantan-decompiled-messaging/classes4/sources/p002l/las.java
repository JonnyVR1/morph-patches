package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class las {
    /* JADX INFO: renamed from: a */
    public static void m17119a(LiveFansClubAnchorProfileView liveFansClubAnchorProfileView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubAnchorProfileView.f5118d = (FrameLayout) viewGroup.getChildAt(0);
        liveFansClubAnchorProfileView.f5119e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveFansClubAnchorProfileView.f5120f = (TextView) viewGroup.getChildAt(1);
        liveFansClubAnchorProfileView.f5121g = viewGroup.getChildAt(2);
        liveFansClubAnchorProfileView.f5122h = (LinearLayout) viewGroup.getChildAt(3);
        liveFansClubAnchorProfileView.f5123i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveFansClubAnchorProfileView.f5124j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
