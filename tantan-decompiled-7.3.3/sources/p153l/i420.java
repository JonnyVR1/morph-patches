package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;

/* JADX INFO: loaded from: classes9.dex */
public class i420 {

    /* JADX INFO: renamed from: a */
    public final BLiveAbsData f112821a;

    /* JADX INFO: renamed from: b */
    public final BLiveAbsRoom f112822b;

    /* JADX INFO: renamed from: c */
    public final User f112823c;

    /* JADX INFO: renamed from: d */
    public final BLiveActivity f112824d;

    public i420(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user, BLiveActivity bLiveActivity) {
        this.f112821a = bLiveAbsData;
        this.f112822b = bLiveAbsRoom;
        this.f112823c = user;
        this.f112824d = bLiveActivity;
    }

    /* JADX INFO: renamed from: a */
    public final BLiveAbsData m138386a() {
        return this.f112821a;
    }

    /* JADX INFO: renamed from: b */
    public final BLiveAbsRoom m138387b() {
        return this.f112822b;
    }

    /* JADX INFO: renamed from: c */
    public final User m138388c() {
        return this.f112823c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m138389d() {
        BLiveAbsData bLiveAbsData = this.f112821a;
        return (bLiveAbsData instanceof BLive) && ((BLive) bLiveAbsData).isMultiCall();
    }

    /* JADX INFO: renamed from: e */
    public boolean m138390e() {
        return TEnum.equals(this.f112821a.state, "onlive");
    }

    /* JADX INFO: renamed from: f */
    public boolean m138391f() {
        return this.f112821a instanceof BLiveVoice;
    }
}
