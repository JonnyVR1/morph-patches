package p149l;

import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;

/* JADX INFO: loaded from: classes5.dex */
public class ta10 implements nxl {

    /* JADX INFO: renamed from: a */
    public MultiCallTopView f169086a;

    /* JADX INFO: renamed from: b */
    public RoomPusherView f169087b;

    /* JADX INFO: renamed from: c */
    public final ug10 f169088c;

    public ta10(MultiCallTopView multiCallTopView, RoomPusherView roomPusherView, String str) {
        this.f169086a = multiCallTopView;
        this.f169087b = roomPusherView;
        this.f169088c = new ug10(s410.f162240f, "", str, -1);
    }

    /* JADX INFO: renamed from: a */
    public String m187693a() {
        return this.f169088c.getOrderId();
    }

    /* JADX INFO: renamed from: b */
    public String m187694b() {
        return this.f169088c.getRole();
    }

    /* JADX INFO: renamed from: c */
    public String m187695c() {
        return this.f169088c.getSeiLayout();
    }

    /* JADX INFO: renamed from: d */
    public int m187696d() {
        return this.f169088c.getTabType();
    }

    public ta10(MultiCallTopView multiCallTopView, ug10 ug10Var) {
        this.f169086a = multiCallTopView;
        this.f169088c = ug10Var;
    }
}
