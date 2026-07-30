package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z6g {
    /* JADX INFO: renamed from: a */
    public static void m27107a(y6g y6gVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y6gVar.f22692k = (FrameLayout) viewGroup.getChildAt(0);
        y6gVar.f22693l = viewGroup.getChildAt(1);
        y6gVar.f22694m = (LinearLayout) viewGroup.getChildAt(2);
        y6gVar.f22695n = (LiveFansClubAnchorProfileView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        y6gVar.f22696o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        y6gVar.f22697p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        y6gVar.f22698q = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
