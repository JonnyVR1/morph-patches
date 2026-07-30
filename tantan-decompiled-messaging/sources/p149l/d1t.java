package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;

/* JADX INFO: loaded from: classes13.dex */
public class d1t implements xvl {

    /* JADX INFO: renamed from: b */
    public static d1t f83296b = new d1t();

    /* JADX INFO: renamed from: a */
    public BLiveUserMask f83297a;

    public d1t(BLiveUserMask bLiveUserMask) {
        this.f83297a = bLiveUserMask;
    }

    /* JADX INFO: renamed from: a */
    public static d1t m109678a(mqv mqvVar) {
        if (mqvVar == null || mqvVar.m156004g() == null) {
            return f83296b;
        }
        return mqvVar.m156004g() instanceof d1t ? (d1t) mqvVar.m156004g() : f83296b;
    }

    /* JADX INFO: renamed from: b */
    public String m109679b() {
        BLiveUserMask bLiveUserMask = this.f83297a;
        return bLiveUserMask != null ? bLiveUserMask.fakeId : "";
    }

    /* JADX INFO: renamed from: c */
    public boolean m109680c() {
        return this != f83296b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m109681d() {
        if (m109682e()) {
            return this.f83297a.fakeType.equals("mystery");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m109682e() {
        BLiveUserMask bLiveUserMask;
        return (!m109680c() || (bLiveUserMask = this.f83297a) == null || TextUtils.isEmpty(bLiveUserMask.avatar)) ? false : true;
    }

    public d1t() {
    }
}
