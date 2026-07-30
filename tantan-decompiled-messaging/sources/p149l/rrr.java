package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesItemView;

/* JADX INFO: loaded from: classes13.dex */
public class rrr extends d1q<LiveActivitiesItemView> {

    /* JADX INFO: renamed from: a */
    public final User f160772a;

    /* JADX INFO: renamed from: b */
    public final BLiveAbsData f160773b;

    /* JADX INFO: renamed from: c */
    public final BLiveAbsRoom f160774c;

    /* JADX INFO: renamed from: d */
    public final BLiveActivity f160775d;

    public rrr(BLiveActivity bLiveActivity, User user, BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom) {
        this.f160772a = user;
        this.f160773b = bLiveAbsData;
        this.f160774c = bLiveAbsRoom;
        this.f160775d = bLiveActivity;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveActivitiesItemView liveActivitiesItemView) {
        super.mo70566u(liveActivitiesItemView);
        liveActivitiesItemView.setTitleText(this.f160775d.title);
        liveActivitiesItemView.setDescText(this.f160775d.value);
        User user = this.f160772a;
        if (user != null) {
            liveActivitiesItemView.m70901q(user.m60124fp().url);
        }
        BLiveAbsData bLiveAbsData = this.f160773b;
        if (bLiveAbsData != null) {
            liveActivitiesItemView.m70897B(bLiveAbsData, this.f160775d);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162760i0;
    }
}
