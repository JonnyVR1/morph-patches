package p149l;

import com.p046p1.mobile.putong.core.data.BCoreLiveActivity;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes12.dex */
public class tm0 {

    /* JADX INFO: renamed from: a */
    public BCoreLiveActivity f171120a;

    /* JADX INFO: renamed from: b */
    public User f171121b;

    /* JADX INFO: renamed from: c */
    public Live f171122c;

    public tm0(User user, Live live, BCoreLiveActivity bCoreLiveActivity) {
        this.f171121b = user;
        this.f171122c = live;
        this.f171120a = bCoreLiveActivity;
    }

    /* JADX INFO: renamed from: a */
    public boolean m189633a() {
        Live live = this.f171122c;
        if (live == null) {
            return false;
        }
        return TEnum.equals(live.state, "onlive") || TEnum.equals(this.f171122c.state, "suspended");
    }
}
