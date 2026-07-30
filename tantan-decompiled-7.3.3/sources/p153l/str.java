package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesItemView;

/* JADX INFO: loaded from: classes9.dex */
public class str extends d3q<LiveActivitiesItemView> {

    /* JADX INFO: renamed from: a */
    public final User f170599a;

    /* JADX INFO: renamed from: b */
    public final BLiveAbsData f170600b;

    /* JADX INFO: renamed from: c */
    public final BLiveAbsRoom f170601c;

    /* JADX INFO: renamed from: d */
    public final BLiveActivity f170602d;

    public str(BLiveActivity bLiveActivity, User user, BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom) {
        this.f170599a = user;
        this.f170600b = bLiveAbsData;
        this.f170601c = bLiveAbsRoom;
        this.f170602d = bLiveActivity;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveActivitiesItemView liveActivitiesItemView) {
        super.mo71749u(liveActivitiesItemView);
        liveActivitiesItemView.setTitleText(this.f170602d.title);
        liveActivitiesItemView.setDescText(this.f170602d.value);
        User user = this.f170599a;
        if (user != null) {
            liveActivitiesItemView.m72084q(user.m61308fp().url);
        }
        BLiveAbsData bLiveAbsData = this.f170600b;
        if (bLiveAbsData != null) {
            liveActivitiesItemView.m72080B(bLiveAbsData, this.f170602d);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193874i0;
    }
}
