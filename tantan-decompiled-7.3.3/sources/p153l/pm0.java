package p153l;

import com.p051p1.mobile.putong.core.data.BCoreLiveActivity;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes3.dex */
public class pm0 {

    /* JADX INFO: renamed from: a */
    public BCoreLiveActivity f153111a;

    /* JADX INFO: renamed from: b */
    public User f153112b;

    /* JADX INFO: renamed from: c */
    public Live f153113c;

    public pm0(User user, Live live, BCoreLiveActivity bCoreLiveActivity) {
        this.f153112b = user;
        this.f153113c = live;
        this.f153111a = bCoreLiveActivity;
    }

    /* JADX INFO: renamed from: a */
    public boolean m172912a() {
        Live live = this.f153113c;
        if (live == null) {
            return false;
        }
        return TEnum.equals(live.state, "onlive") || TEnum.equals(this.f153113c.state, "suspended");
    }
}
