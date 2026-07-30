package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class las {
    /* JADX INFO: renamed from: a */
    public static void m149176a(LiveFansClubAnchorProfileView liveFansClubAnchorProfileView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubAnchorProfileView.f49076d = (FrameLayout) viewGroup.getChildAt(0);
        liveFansClubAnchorProfileView.f49077e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveFansClubAnchorProfileView.f49078f = (TextView) viewGroup.getChildAt(1);
        liveFansClubAnchorProfileView.f49079g = (VText) viewGroup.getChildAt(2);
        liveFansClubAnchorProfileView.f49080h = (LinearLayout) viewGroup.getChildAt(3);
        liveFansClubAnchorProfileView.f49081i = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveFansClubAnchorProfileView.f49082j = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
