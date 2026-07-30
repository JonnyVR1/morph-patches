package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import l.e30;
import l.fld0;
import l.ggv;
import l.idv;
import l.jo0;
import l.r8d0;
import l.roj0;
import l.upv;
import l.wq2;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import rx.Notification;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class am40 extends pn40 implements o91 {

    /* JADX INFO: renamed from: H */
    public final String f7722H;

    /* JADX INFO: renamed from: I */
    public String f7723I;

    /* JADX INFO: renamed from: J */
    public b<roj0> f7724J;

    /* JADX INFO: renamed from: K */
    public boolean f7725K;

    /* JADX INFO: renamed from: L */
    public JumpRoomData f7726L;

    /* JADX INFO: renamed from: M */
    public boolean f7727M;

    /* JADX INFO: renamed from: N */
    public AudienceStartData f7728N;

    /* JADX INFO: renamed from: O */
    public final aht f7729O;

    /* JADX INFO: renamed from: P */
    public boolean f7730P;

    /* JADX INFO: renamed from: Q */
    public boolean f7731Q;

    public am40(qn40 qn40Var, zgt zgtVar, aht ahtVar) {
        super(qn40Var, zgtVar);
        this.f7724J = b.b();
        this.f7729O = ahtVar;
        this.f7722H = ypv.a.D0();
    }

    /* JADX INFO: renamed from: G2 */
    public static /* synthetic */ void m9878G2(Notification notification) {
        if (notification.k()) {
            ((idv) ypv.l(fld0.b)).a((User) notification.f());
        } else if (notification.j()) {
            ((idv) ypv.l(fld0.b)).a(ypv.a.V());
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m9879H2() {
        ((ggv) ypv.l(fld0.c)).e();
    }

    /* JADX INFO: renamed from: I2 */
    public c<r8d0> m9880I2(BLiveAbsData bLiveAbsData) {
        r8d0 r8d0Var = this.f12168y;
        if (r8d0Var == null || !TextUtils.equals(((wq2) r8d0Var).c.id, bLiveAbsData.id)) {
            return TextUtils.equals(bLiveAbsData.id, "-1") ? LivingNormalApiProvider.m4748X4(bLiveAbsData) : LivingNormalApiProvider.m4830g5(bLiveAbsData);
        }
        return c.just(this.f12168y).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: J2 */
    public AudienceStartData m9881J2() {
        if (this.f7728N == null) {
            this.f7728N = new AudienceStartData.a().u();
        }
        return this.f7728N;
    }

    /* JADX INFO: renamed from: K2 */
    public boolean m9882K2() {
        return this.f7730P;
    }

    /* JADX INFO: renamed from: L2 */
    public boolean m9883L2() {
        return this.f7731Q;
    }

    @NotNull
    /* JADX INFO: renamed from: M2 */
    public c<? extends Notification<User>> m9884M2(r8d0 r8d0Var) {
        return LivingNormalApiProvider.m4940s7(ypv.a.D0(), ((wq2) r8d0Var).c.id).materialize().doOnNext(new e30() { // from class: l.zl40
            public final void call(Object obj) {
                am40.m9878G2((Notification) obj);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: N2 */
    public void m9885N2(boolean z) {
        this.f7730P = z;
    }

    /* JADX INFO: renamed from: O2 */
    public void m9886O2(JumpRoomData jumpRoomData) {
        if (jumpRoomData == null || !jumpRoomData.isOldDataValid()) {
            this.f7726L = null;
        } else {
            this.f7726L = jumpRoomData;
        }
    }

    /* JADX INFO: renamed from: P2 */
    public void m9887P2(boolean z) {
        this.f7731Q = z;
    }

    /* JADX INFO: renamed from: Q2 */
    public void m9888Q2(AudienceStartData audienceStartData) {
        this.f7728N = audienceStartData;
    }

    @Override // p002l.o91
    /* JADX INFO: renamed from: a */
    public void mo9889a(boolean z) {
        this.f7725K = z;
    }

    @Override // p002l.o91
    /* JADX INFO: renamed from: b */
    public aht mo9890b() {
        return this.f7729O;
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: c0 */
    public void mo9891c0(boolean z) {
        super.mo9891c0(z);
        this.f7727M = true;
        this.f7724J.onNext(roj0.a);
        this.f7726L = null;
        upv.x();
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: e2 */
    public void mo9892e2(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveAbsData bLiveAbsData2 = this.f12165v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.id, bLiveAbsData2.id)) {
            super.mo9892e2(z, bLiveAbsData);
        } else if (this.f7725K && this.f7727M) {
            mo14518O1(z, bLiveAbsData.id, bLiveAbsData.room.id);
            this.f7727M = false;
        }
    }

    @Override // p002l.o91
    public void exit() {
        iqv iqvVarM17237m = m17237m();
        pdu pduVar = pdu.f17211b;
        if (iqvVarM17237m == pduVar) {
            return;
        }
        if (!m20502B2() && this.f7722H != null) {
            LivingNormalApiProvider.m4587F5(m17239o(), this.f7722H, m17247x());
        }
        mo17233h(pduVar);
        m14568g2(m17234j());
        mo9891c0(false);
    }

    @Override // p002l.pn40, p002l.lh20
    /* JADX INFO: renamed from: p */
    public boolean mo9893p() {
        return false;
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: y0 */
    public JumpRoomData mo9894y0() {
        return this.f7726L;
    }
}
