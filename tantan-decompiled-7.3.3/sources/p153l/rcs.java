package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubLevelView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rcs {
    /* JADX INFO: renamed from: a */
    public static void m180819a(LiveFansClubLevelView liveFansClubLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubLevelView.f49936a = (VText) viewGroup.getChildAt(0);
        liveFansClubLevelView.f49937b = (VImage) viewGroup.getChildAt(1);
        liveFansClubLevelView.f49938c = (VText) viewGroup.getChildAt(2);
        liveFansClubLevelView.f49939d = (FrameLayout) viewGroup.getChildAt(3);
        liveFansClubLevelView.f49940e = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveFansClubLevelView.f49941f = (VText) viewGroup.getChildAt(4);
        liveFansClubLevelView.f49942g = (VText) viewGroup.getChildAt(5);
        liveFansClubLevelView.f49943h = (VText) viewGroup.getChildAt(6);
    }
}
