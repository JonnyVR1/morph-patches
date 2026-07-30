package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;

/* JADX INFO: loaded from: classes13.dex */
public class aw10 {

    /* JADX INFO: renamed from: a */
    public final BLiveAbsData f72000a;

    /* JADX INFO: renamed from: b */
    public final BLiveAbsRoom f72001b;

    /* JADX INFO: renamed from: c */
    public final User f72002c;

    /* JADX INFO: renamed from: d */
    public final BLiveActivity f72003d;

    public aw10(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user, BLiveActivity bLiveActivity) {
        this.f72000a = bLiveAbsData;
        this.f72001b = bLiveAbsRoom;
        this.f72002c = user;
        this.f72003d = bLiveActivity;
    }

    /* JADX INFO: renamed from: a */
    public final BLiveAbsData m99223a() {
        return this.f72000a;
    }

    /* JADX INFO: renamed from: b */
    public final BLiveAbsRoom m99224b() {
        return this.f72001b;
    }

    /* JADX INFO: renamed from: c */
    public final User m99225c() {
        return this.f72002c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m99226d() {
        BLiveAbsData bLiveAbsData = this.f72000a;
        return (bLiveAbsData instanceof BLive) && ((BLive) bLiveAbsData).isMultiCall();
    }

    /* JADX INFO: renamed from: e */
    public boolean m99227e() {
        return TEnum.equals(this.f72000a.state, "onlive");
    }

    /* JADX INFO: renamed from: f */
    public boolean m99228f() {
        return this.f72000a instanceof BLiveVoice;
    }
}
