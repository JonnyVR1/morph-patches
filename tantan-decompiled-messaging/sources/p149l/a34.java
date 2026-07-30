package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;

/* JADX INFO: loaded from: classes5.dex */
public class a34 implements nxl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f67324a;

    /* JADX INFO: renamed from: b */
    public final CallWidgetView f67325b;

    /* JADX INFO: renamed from: c */
    public final LiveCallView f67326c;

    /* JADX INFO: renamed from: d */
    public RoomPusherView f67327d;

    public a34(FrameLayout frameLayout, CallWidgetView callWidgetView, LiveCallView liveCallView) {
        this.f67324a = frameLayout;
        this.f67325b = callWidgetView;
        this.f67326c = liveCallView;
    }

    public a34(CallWidgetView callWidgetView, LiveCallView liveCallView, RoomPusherView roomPusherView) {
        this.f67325b = callWidgetView;
        this.f67326c = liveCallView;
        this.f67327d = roomPusherView;
    }
}
