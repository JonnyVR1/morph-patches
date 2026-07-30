package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class km5 implements p5m {

    /* JADX INFO: renamed from: a */
    public final agd0 f127438a;

    /* JADX INFO: renamed from: b */
    public C22507a<BLiveAbsData> f127439b = C22507a.m222758b();

    public km5(agd0 agd0Var) {
        this.f127438a = agd0Var;
    }

    @Override // p153l.p5m
    /* JADX INFO: renamed from: a */
    public pf60<Boolean, BLiveAbsData> mo150407a(boolean z) {
        boolean z2;
        int iMo150410d = mo150410d();
        BLiveAbsData bLiveAbsDataM141977h = null;
        if (iMo150410d == -1) {
            return new pf60<>(Boolean.FALSE, null);
        }
        isv isvVarMo104856f = this.f127438a.m97611p().mo104856f();
        int iM141983n = isvVarMo104856f.m141983n();
        if (z) {
            if (iM141983n > 1 && iMo150410d >= iM141983n - 1 && zrv.f205799a.m207641L()) {
                iMo150410d = 0;
            }
            z2 = iMo150410d < iM141983n - 1;
            if (z2) {
                bLiveAbsDataM141977h = isvVarMo104856f.m141977h(iMo150410d + 1);
            }
        } else if (!zrv.f205799a.m207641L() || iM141983n <= 1) {
            z2 = iMo150410d > 0;
            if (z2) {
                bLiveAbsDataM141977h = isvVarMo104856f.m141977h(iMo150410d - 1);
            }
        } else {
            z2 = iMo150410d >= 0;
            int i = iMo150410d - 1;
            if (z2) {
                if (i < 0) {
                    i = iM141983n - 1;
                }
                bLiveAbsDataM141977h = isvVarMo104856f.m141977h(i);
            }
        }
        return new pf60<>(Boolean.valueOf(z2), bLiveAbsDataM141977h);
    }

    @Override // p153l.p5m
    /* JADX INFO: renamed from: b */
    public BLiveAbsData mo150408b(boolean z) {
        return m150413g(z);
    }

    @Override // p153l.p5m
    /* JADX INFO: renamed from: c */
    public pf60<BLiveAbsData, JumpRoomData> mo150409c(boolean z) {
        return new pf60<>(m150413g(z), null);
    }

    @Override // p153l.p5m
    /* JADX INFO: renamed from: d */
    public int mo150410d() {
        return this.f127438a.m97611p().mo104856f().m141982m(mo150411e().room.f45267id);
    }

    @Override // p153l.p5m
    /* JADX INFO: renamed from: e */
    public BLiveAbsData mo150411e() {
        return this.f127439b.m222761e();
    }

    @Override // p153l.p5m
    /* JADX INFO: renamed from: f */
    public void mo150412f(BLiveAbsData bLiveAbsData) {
        this.f127439b.onNext(bLiveAbsData);
    }

    /* JADX INFO: renamed from: g */
    public final BLiveAbsData m150413g(boolean z) {
        int iMo150410d = mo150410d();
        if (iMo150410d < 0) {
            return null;
        }
        int iM141983n = iMo150410d + (z ? 1 : -1);
        if (zrv.f205799a.m207641L()) {
            agd0 agd0Var = this.f127438a;
            if (iM141983n < 0) {
                iM141983n = agd0Var.m97611p().mo104856f().m141983n() - 1;
                if (iM141983n < 0) {
                    return null;
                }
            } else if (iM141983n >= agd0Var.m97611p().mo104856f().m141983n()) {
                iM141983n = 0;
            }
        } else if (iM141983n < 0 || iM141983n >= this.f127438a.m97611p().mo104856f().m141983n()) {
            return null;
        }
        return this.f127438a.m97611p().mo104856f().m141977h(iM141983n);
    }
}
