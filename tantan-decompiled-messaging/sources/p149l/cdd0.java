package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.base.room.RoomScrollGuideView;
import com.p046p1.mobile.putong.live.livingroom.view.ScrollGuideView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cdd0 {
    /* JADX INFO: renamed from: a */
    public static void m106216a(RoomScrollGuideView roomScrollGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        roomScrollGuideView.f47890a = (ScrollGuideView) viewGroup.getChildAt(0);
        roomScrollGuideView.f47891b = (VImage) viewGroup.getChildAt(1);
        roomScrollGuideView.f47892c = (VImage) viewGroup.getChildAt(2);
        roomScrollGuideView.f47893d = (VText) viewGroup.getChildAt(3);
    }
}
