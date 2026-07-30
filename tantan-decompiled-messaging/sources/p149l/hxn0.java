package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;

/* JADX INFO: loaded from: classes13.dex */
public class hxn0 implements xvl {

    /* JADX INFO: renamed from: d */
    public static hxn0 f109894d = new hxn0();

    /* JADX INFO: renamed from: a */
    public String f109895a;

    /* JADX INFO: renamed from: b */
    public BLiveUserMask f109896b;

    /* JADX INFO: renamed from: c */
    public boolean f109897c;

    public hxn0(String str, boolean z) {
        this.f109895a = str;
        this.f109897c = z;
    }

    /* JADX INFO: renamed from: c */
    public static hxn0 m133350c(mqv mqvVar) {
        if (mqvVar == null || mqvVar.m156004g() == null) {
            return f109894d;
        }
        return mqvVar.m156004g() instanceof hxn0 ? (hxn0) mqvVar.m156004g() : f109894d;
    }

    /* JADX INFO: renamed from: a */
    public void m133351a(e30<hxn0> e30Var) {
        if (this == f109894d) {
            return;
        }
        e30Var.call(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m133352b() {
        if (this.f109896b == null && this.f109897c) {
            BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
            this.f109896b = bLiveUserMaskNew_;
            bLiveUserMaskNew_.userId = this.f109895a;
            bLiveUserMaskNew_.color = "#ffffff";
            bLiveUserMaskNew_.avatar = "res://drawable/" + g3c0.f100398T;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m133353d() {
        return this != f109894d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m133354e() {
        BLiveUserMask bLiveUserMask;
        return (!m133353d() || (bLiveUserMask = this.f109896b) == null || TextUtils.isEmpty(bLiveUserMask.avatar)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public hxn0 m133355f(BLiveUserMask bLiveUserMask) {
        this.f109896b = bLiveUserMask;
        m133352b();
        return this;
    }

    public hxn0() {
    }
}
