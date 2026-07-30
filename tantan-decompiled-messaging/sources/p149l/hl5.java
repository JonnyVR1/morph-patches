package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class hl5 implements x2m {

    /* JADX INFO: renamed from: a */
    public final x7d0 f108322a;

    /* JADX INFO: renamed from: b */
    public C22392a<BLiveAbsData> f108323b = C22392a.m221512b();

    public hl5(x7d0 x7d0Var) {
        this.f108322a = x7d0Var;
    }

    @Override // p149l.x2m
    /* JADX INFO: renamed from: a */
    public j760<Boolean, BLiveAbsData> mo131641a(boolean z) {
        boolean z2;
        int iMo131644d = mo131644d();
        BLiveAbsData bLiveAbsDataM132595h = null;
        if (iMo131644d == -1) {
            return new j760<>(Boolean.FALSE, null);
        }
        hqv hqvVarMo96933f = this.f108322a.m207274p().mo96933f();
        int iM132601n = hqvVarMo96933f.m132601n();
        if (z) {
            if (iM132601n > 1 && iMo131644d >= iM132601n - 1 && ypv.f199493a.m199319L()) {
                iMo131644d = 0;
            }
            z2 = iMo131644d < iM132601n - 1;
            if (z2) {
                bLiveAbsDataM132595h = hqvVarMo96933f.m132595h(iMo131644d + 1);
            }
        } else if (!ypv.f199493a.m199319L() || iM132601n <= 1) {
            z2 = iMo131644d > 0;
            if (z2) {
                bLiveAbsDataM132595h = hqvVarMo96933f.m132595h(iMo131644d - 1);
            }
        } else {
            z2 = iMo131644d >= 0;
            int i = iMo131644d - 1;
            if (z2) {
                if (i < 0) {
                    i = iM132601n - 1;
                }
                bLiveAbsDataM132595h = hqvVarMo96933f.m132595h(i);
            }
        }
        return new j760<>(Boolean.valueOf(z2), bLiveAbsDataM132595h);
    }

    @Override // p149l.x2m
    /* JADX INFO: renamed from: b */
    public BLiveAbsData mo131642b(boolean z) {
        return m131647g(z);
    }

    @Override // p149l.x2m
    /* JADX INFO: renamed from: c */
    public j760<BLiveAbsData, JumpRoomData> mo131643c(boolean z) {
        return new j760<>(m131647g(z), null);
    }

    @Override // p149l.x2m
    /* JADX INFO: renamed from: d */
    public int mo131644d() {
        return this.f108322a.m207274p().mo96933f().m132600m(mo131645e().room.f44419id);
    }

    @Override // p149l.x2m
    /* JADX INFO: renamed from: e */
    public BLiveAbsData mo131645e() {
        return this.f108323b.m221515e();
    }

    @Override // p149l.x2m
    /* JADX INFO: renamed from: f */
    public void mo131646f(BLiveAbsData bLiveAbsData) {
        this.f108323b.onNext(bLiveAbsData);
    }

    /* JADX INFO: renamed from: g */
    public final BLiveAbsData m131647g(boolean z) {
        int iMo131644d = mo131644d();
        if (iMo131644d < 0) {
            return null;
        }
        int iM132601n = iMo131644d + (z ? 1 : -1);
        if (ypv.f199493a.m199319L()) {
            x7d0 x7d0Var = this.f108322a;
            if (iM132601n < 0) {
                iM132601n = x7d0Var.m207274p().mo96933f().m132601n() - 1;
                if (iM132601n < 0) {
                    return null;
                }
            } else if (iM132601n >= x7d0Var.m207274p().mo96933f().m132601n()) {
                iM132601n = 0;
            }
        } else if (iM132601n < 0 || iM132601n >= this.f108322a.m207274p().mo96933f().m132601n()) {
            return null;
        }
        return this.f108322a.m207274p().mo96933f().m132595h(iM132601n);
    }
}
