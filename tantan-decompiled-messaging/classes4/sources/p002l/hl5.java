package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import l.j760;
import l.ypv;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hl5 implements x2m {

    /* JADX INFO: renamed from: a */
    public final x7d0 f12100a;

    /* JADX INFO: renamed from: b */
    public a<BLiveAbsData> f12101b = a.b();

    public hl5(x7d0 x7d0Var) {
        this.f12100a = x7d0Var;
    }

    @Override // p002l.x2m
    /* JADX INFO: renamed from: a */
    public j760<Boolean, BLiveAbsData> mo14439a(boolean z) {
        boolean z2;
        int iMo14442d = mo14442d();
        BLiveAbsData bLiveAbsDataM14715h = null;
        if (iMo14442d == -1) {
            return new j760<>(Boolean.FALSE, (Object) null);
        }
        hqv hqvVarMo9808f = this.f12100a.m25726p().mo9808f();
        int iM14721n = hqvVarMo9808f.m14721n();
        if (z) {
            if (iM14721n > 1 && iMo14442d >= iM14721n - 1 && ypv.a.L()) {
                iMo14442d = 0;
            }
            z2 = iMo14442d < iM14721n - 1;
            if (z2) {
                bLiveAbsDataM14715h = hqvVarMo9808f.m14715h(iMo14442d + 1);
            }
        } else if (!ypv.a.L() || iM14721n <= 1) {
            z2 = iMo14442d > 0;
            if (z2) {
                bLiveAbsDataM14715h = hqvVarMo9808f.m14715h(iMo14442d - 1);
            }
        } else {
            z2 = iMo14442d >= 0;
            int i = iMo14442d - 1;
            if (z2) {
                if (i < 0) {
                    i = iM14721n - 1;
                }
                bLiveAbsDataM14715h = hqvVarMo9808f.m14715h(i);
            }
        }
        return new j760<>(Boolean.valueOf(z2), bLiveAbsDataM14715h);
    }

    @Override // p002l.x2m
    /* JADX INFO: renamed from: b */
    public BLiveAbsData mo14440b(boolean z) {
        return m14445g(z);
    }

    @Override // p002l.x2m
    /* JADX INFO: renamed from: c */
    public j760<BLiveAbsData, JumpRoomData> mo14441c(boolean z) {
        return new j760<>(m14445g(z), (Object) null);
    }

    @Override // p002l.x2m
    /* JADX INFO: renamed from: d */
    public int mo14442d() {
        return this.f12100a.m25726p().mo9808f().m14720m(mo14443e().room.id);
    }

    @Override // p002l.x2m
    /* JADX INFO: renamed from: e */
    public BLiveAbsData mo14443e() {
        return (BLiveAbsData) this.f12101b.e();
    }

    @Override // p002l.x2m
    /* JADX INFO: renamed from: f */
    public void mo14444f(BLiveAbsData bLiveAbsData) {
        this.f12101b.onNext(bLiveAbsData);
    }

    /* JADX INFO: renamed from: g */
    public final BLiveAbsData m14445g(boolean z) {
        int iMo14442d = mo14442d();
        if (iMo14442d < 0) {
            return null;
        }
        int iM14721n = iMo14442d + (z ? 1 : -1);
        if (ypv.a.L()) {
            x7d0 x7d0Var = this.f12100a;
            if (iM14721n < 0) {
                iM14721n = x7d0Var.m25726p().mo9808f().m14721n() - 1;
                if (iM14721n < 0) {
                    return null;
                }
            } else if (iM14721n >= x7d0Var.m25726p().mo9808f().m14721n()) {
                iM14721n = 0;
            }
        } else if (iM14721n < 0 || iM14721n >= this.f12100a.m25726p().mo9808f().m14721n()) {
            return null;
        }
        return this.f12100a.m25726p().mo9808f().m14715h(iM14721n);
    }
}
