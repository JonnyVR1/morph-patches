package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;

/* JADX INFO: loaded from: classes13.dex */
public class e3t implements pyl {

    /* JADX INFO: renamed from: b */
    public static e3t f91996b = new e3t();

    /* JADX INFO: renamed from: a */
    public BLiveUserMask f91997a;

    public e3t(BLiveUserMask bLiveUserMask) {
        this.f91997a = bLiveUserMask;
    }

    /* JADX INFO: renamed from: a */
    public static e3t m119319a(nsv nsvVar) {
        if (nsvVar == null || nsvVar.m164642g() == null) {
            return f91996b;
        }
        return nsvVar.m164642g() instanceof e3t ? (e3t) nsvVar.m164642g() : f91996b;
    }

    /* JADX INFO: renamed from: b */
    public String m119320b() {
        BLiveUserMask bLiveUserMask = this.f91997a;
        return bLiveUserMask != null ? bLiveUserMask.fakeId : "";
    }

    /* JADX INFO: renamed from: c */
    public boolean m119321c() {
        return this != f91996b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m119322d() {
        if (m119323e()) {
            return this.f91997a.fakeType.equals("mystery");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m119323e() {
        BLiveUserMask bLiveUserMask;
        return (!m119321c() || (bLiveUserMask = this.f91997a) == null || TextUtils.isEmpty(bLiveUserMask.avatar)) ? false : true;
    }

    public e3t() {
    }
}
