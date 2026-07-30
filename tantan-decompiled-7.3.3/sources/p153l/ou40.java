package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class ou40 extends dw40 implements v91 {

    /* JADX INFO: renamed from: H */
    public final String f149050H;

    /* JADX INFO: renamed from: I */
    public String f149051I;

    /* JADX INFO: renamed from: J */
    public C22508b<uxj0> f149052J;

    /* JADX INFO: renamed from: K */
    public boolean f149053K;

    /* JADX INFO: renamed from: L */
    public JumpRoomData f149054L;

    /* JADX INFO: renamed from: M */
    public boolean f149055M;

    /* JADX INFO: renamed from: N */
    public AudienceStartData f149056N;

    /* JADX INFO: renamed from: O */
    public final bjt f149057O;

    /* JADX INFO: renamed from: P */
    public boolean f149058P;

    /* JADX INFO: renamed from: Q */
    public boolean f149059Q;

    public ou40(ew40 ew40Var, ajt ajtVar, bjt bjtVar) {
        super(ew40Var, ajtVar);
        this.f149052J = C22508b.m222767b();
        this.f149057O = bjtVar;
        this.f149050H = zrv.f205799a.m207631D0();
    }

    /* JADX INFO: renamed from: G2 */
    public static /* synthetic */ void m169222G2(Notification notification) {
        if (notification.m222546k()) {
            ((jfv) zrv.m221194l(htd0.f111520b)).m144714a((User) notification.m222541f());
        } else if (notification.m222545j()) {
            ((jfv) zrv.m221194l(htd0.f111520b)).m144714a(zrv.f205799a.m207651V());
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m169223H2() {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135153e();
    }

    /* JADX INFO: renamed from: I2 */
    public C22421c<ugd0> m169224I2(BLiveAbsData bLiveAbsData) {
        ugd0 ugd0Var = this.f148281y;
        if (ugd0Var == null || !TextUtils.equals(ugd0Var.f138293c.f45171id, bLiveAbsData.f45171id)) {
            return TextUtils.equals(bLiveAbsData.f45171id, User.ID_TEAM_ACCOUNT) ? LivingNormalApiProvider.m72565X4(bLiveAbsData) : LivingNormalApiProvider.m72647g5(bLiveAbsData);
        }
        return C22421c.just(this.f148281y).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: J2 */
    public AudienceStartData m169225J2() {
        if (this.f149056N == null) {
            this.f149056N = new AudienceStartData.C11593a().m68794u();
        }
        return this.f149056N;
    }

    /* JADX INFO: renamed from: K2 */
    public boolean m169226K2() {
        return this.f149058P;
    }

    /* JADX INFO: renamed from: L2 */
    public boolean m169227L2() {
        return this.f149059Q;
    }

    @NotNull
    /* JADX INFO: renamed from: M2 */
    public C22421c<? extends Notification<User>> m169228M2(ugd0 ugd0Var) {
        return LivingNormalApiProvider.m72757s7(zrv.f205799a.m207631D0(), ugd0Var.f138293c.f45171id).materialize().doOnNext(new y20() { // from class: l.nu40
            @Override // p153l.y20
            public final void call(Object obj) {
                ou40.m169222G2((Notification) obj);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: N2 */
    public void m169229N2(boolean z) {
        this.f149058P = z;
    }

    /* JADX INFO: renamed from: O2 */
    public void m169230O2(JumpRoomData jumpRoomData) {
        if (jumpRoomData == null || !jumpRoomData.isOldDataValid()) {
            this.f149054L = null;
        } else {
            this.f149054L = jumpRoomData;
        }
    }

    /* JADX INFO: renamed from: P2 */
    public void m169231P2(boolean z) {
        this.f149059Q = z;
    }

    /* JADX INFO: renamed from: Q2 */
    public void m169232Q2(AudienceStartData audienceStartData) {
        this.f149056N = audienceStartData;
    }

    @Override // p153l.v91
    /* JADX INFO: renamed from: a */
    public void mo146606a(boolean z) {
        this.f149053K = z;
    }

    @Override // p153l.v91
    /* JADX INFO: renamed from: b */
    public bjt mo146608b() {
        return this.f149057O;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: c0 */
    public void mo146610c0(boolean z) {
        super.mo146610c0(z);
        this.f149055M = true;
        this.f149052J.onNext(uxj0.f181467a);
        this.f149054L = null;
        vrv.m202563x();
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: e2 */
    public void mo146096e2(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveAbsData bLiveAbsData2 = this.f148278v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.f45171id, bLiveAbsData2.f45171id)) {
            super.mo146096e2(z, bLiveAbsData);
        } else if (this.f149053K && this.f149055M) {
            mo118372O1(z, bLiveAbsData.f45171id, bLiveAbsData.room.f45267id);
            this.f149055M = false;
        }
    }

    @Override // p153l.v91
    public void exit() {
        jsv jsvVarM202193m = m202193m();
        qfu qfuVar = qfu.f157341b;
        if (jsvVarM202193m == qfuVar) {
            return;
        }
        if (!m118364B2() && this.f149050H != null) {
            LivingNormalApiProvider.m72404F5(m202194o(), this.f149050H, m202200x());
        }
        mo160116h(qfuVar);
        m168518g2(mo183435j());
        mo146610c0(false);
    }

    @Override // p153l.dw40, p153l.vp20
    /* JADX INFO: renamed from: p */
    public boolean mo118373p() {
        return false;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: y0 */
    public JumpRoomData mo146616y0() {
        return this.f149054L;
    }
}
