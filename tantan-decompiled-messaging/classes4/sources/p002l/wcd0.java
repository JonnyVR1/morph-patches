package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wcd0 {
    /* JADX INFO: renamed from: a */
    public static void m24492a(RoomPusherView roomPusherView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        roomPusherView.a = (FrameLayout) viewGroup.getChildAt(0);
        roomPusherView.b = (FrameLayout) viewGroup.getChildAt(1);
    }
}
