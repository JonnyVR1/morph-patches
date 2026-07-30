package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.base.room.RoomScrollGuideView;
import com.p051p1.mobile.putong.live.livingroom.view.ScrollGuideView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class eld0 {
    /* JADX INFO: renamed from: a */
    public static void m121146a(RoomScrollGuideView roomScrollGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        roomScrollGuideView.f48738a = (ScrollGuideView) viewGroup.getChildAt(0);
        roomScrollGuideView.f48739b = (VImage) viewGroup.getChildAt(1);
        roomScrollGuideView.f48740c = (VImage) viewGroup.getChildAt(2);
        roomScrollGuideView.f48741d = (VText) viewGroup.getChildAt(3);
    }
}
