package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mcs {
    /* JADX INFO: renamed from: a */
    public static void m157934a(LiveFansClubAnchorProfileView liveFansClubAnchorProfileView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubAnchorProfileView.f49924d = (FrameLayout) viewGroup.getChildAt(0);
        liveFansClubAnchorProfileView.f49925e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveFansClubAnchorProfileView.f49926f = (TextView) viewGroup.getChildAt(1);
        liveFansClubAnchorProfileView.f49927g = (VText) viewGroup.getChildAt(2);
        liveFansClubAnchorProfileView.f49928h = (LinearLayout) viewGroup.getChildAt(3);
        liveFansClubAnchorProfileView.f49929i = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveFansClubAnchorProfileView.f49930j = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
