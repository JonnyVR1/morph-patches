package p007l;

import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.LiveState;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.core.data.BCoreLiveActivity;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tm0 {

    /* JADX INFO: renamed from: a */
    public BCoreLiveActivity f13332a;

    /* JADX INFO: renamed from: b */
    public User f13333b;

    /* JADX INFO: renamed from: c */
    public Live f13334c;

    public tm0(User user, Live live, BCoreLiveActivity bCoreLiveActivity) {
        this.f13333b = user;
        this.f13334c = live;
        this.f13332a = bCoreLiveActivity;
    }

    /* JADX INFO: renamed from: a */
    public boolean m14566a() {
        Live live = this.f13334c;
        if (live == null) {
            return false;
        }
        return TEnum.equals(live.state, "onlive") || TEnum.equals(this.f13334c.state, LiveState.suspended);
    }
}
