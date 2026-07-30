package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;

/* JADX INFO: loaded from: classes13.dex */
public class l6o0 implements pyl {

    /* JADX INFO: renamed from: d */
    public static l6o0 f130273d = new l6o0();

    /* JADX INFO: renamed from: a */
    public String f130274a;

    /* JADX INFO: renamed from: b */
    public BLiveUserMask f130275b;

    /* JADX INFO: renamed from: c */
    public boolean f130276c;

    public l6o0(String str, boolean z) {
        this.f130274a = str;
        this.f130276c = z;
    }

    /* JADX INFO: renamed from: c */
    public static l6o0 m153068c(nsv nsvVar) {
        if (nsvVar == null || nsvVar.m164642g() == null) {
            return f130273d;
        }
        return nsvVar.m164642g() instanceof l6o0 ? (l6o0) nsvVar.m164642g() : f130273d;
    }

    /* JADX INFO: renamed from: a */
    public void m153069a(y20<l6o0> y20Var) {
        if (this == f130273d) {
            return;
        }
        y20Var.call(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m153070b() {
        if (this.f130275b == null && this.f130276c) {
            BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
            this.f130275b = bLiveUserMaskNew_;
            bLiveUserMaskNew_.userId = this.f130274a;
            bLiveUserMaskNew_.color = "#ffffff";
            bLiveUserMaskNew_.avatar = "res://drawable/" + mbc0.f135660T;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m153071d() {
        return this != f130273d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m153072e() {
        BLiveUserMask bLiveUserMask;
        return (!m153071d() || (bLiveUserMask = this.f130275b) == null || TextUtils.isEmpty(bLiveUserMask.avatar)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public l6o0 m153073f(BLiveUserMask bLiveUserMask) {
        this.f130275b = bLiveUserMask;
        m153070b();
        return this;
    }

    public l6o0() {
    }
}
