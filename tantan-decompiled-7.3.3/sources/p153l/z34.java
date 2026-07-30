package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;

/* JADX INFO: loaded from: classes5.dex */
public class z34 implements g0m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f202778a;

    /* JADX INFO: renamed from: b */
    public final CallWidgetView f202779b;

    /* JADX INFO: renamed from: c */
    public final LiveCallView f202780c;

    /* JADX INFO: renamed from: d */
    public RoomPusherView f202781d;

    public z34(FrameLayout frameLayout, CallWidgetView callWidgetView, LiveCallView liveCallView) {
        this.f202778a = frameLayout;
        this.f202779b = callWidgetView;
        this.f202780c = liveCallView;
    }

    public z34(CallWidgetView callWidgetView, LiveCallView liveCallView, RoomPusherView roomPusherView) {
        this.f202779b = callWidgetView;
        this.f202780c = liveCallView;
        this.f202781d = roomPusherView;
    }
}
