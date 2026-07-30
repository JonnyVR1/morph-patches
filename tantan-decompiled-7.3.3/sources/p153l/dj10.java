package p153l;

import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;

/* JADX INFO: loaded from: classes5.dex */
public class dj10 implements g0m {

    /* JADX INFO: renamed from: a */
    public MultiCallTopView f88770a;

    /* JADX INFO: renamed from: b */
    public RoomPusherView f88771b;

    /* JADX INFO: renamed from: c */
    public final ep10 f88772c;

    public dj10(MultiCallTopView multiCallTopView, RoomPusherView roomPusherView, String str) {
        this.f88770a = multiCallTopView;
        this.f88771b = roomPusherView;
        this.f88772c = new ep10(cd10.f81078f, "", str, -1);
    }

    /* JADX INFO: renamed from: a */
    public String m116013a() {
        return this.f88772c.getOrderId();
    }

    /* JADX INFO: renamed from: b */
    public String m116014b() {
        return this.f88772c.getRole();
    }

    /* JADX INFO: renamed from: c */
    public String m116015c() {
        return this.f88772c.getSeiLayout();
    }

    /* JADX INFO: renamed from: d */
    public int m116016d() {
        return this.f88772c.getTabType();
    }

    public dj10(MultiCallTopView multiCallTopView, ep10 ep10Var) {
        this.f88770a = multiCallTopView;
        this.f88772c = ep10Var;
    }
}
