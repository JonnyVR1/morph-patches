package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class am40 extends pn40 implements o91 {

    /* JADX INFO: renamed from: H */
    public final String f70547H;

    /* JADX INFO: renamed from: I */
    public String f70548I;

    /* JADX INFO: renamed from: J */
    public C22393b<roj0> f70549J;

    /* JADX INFO: renamed from: K */
    public boolean f70550K;

    /* JADX INFO: renamed from: L */
    public JumpRoomData f70551L;

    /* JADX INFO: renamed from: M */
    public boolean f70552M;

    /* JADX INFO: renamed from: N */
    public AudienceStartData f70553N;

    /* JADX INFO: renamed from: O */
    public final aht f70554O;

    /* JADX INFO: renamed from: P */
    public boolean f70555P;

    /* JADX INFO: renamed from: Q */
    public boolean f70556Q;

    public am40(qn40 qn40Var, zgt zgtVar, aht ahtVar) {
        super(qn40Var, zgtVar);
        this.f70549J = C22393b.m221521b();
        this.f70554O = ahtVar;
        this.f70547H = ypv.f199493a.m199309D0();
    }

    /* JADX INFO: renamed from: G2 */
    public static /* synthetic */ void m97475G2(Notification notification) {
        if (notification.m221300k()) {
            ((idv) ypv.m215673l(fld0.f98147b)).m135629a((User) notification.m221295f());
        } else if (notification.m221299j()) {
            ((idv) ypv.m215673l(fld0.f98147b)).m135629a(ypv.f199493a.m199329V());
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m97476H2() {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126019e();
    }

    /* JADX INFO: renamed from: I2 */
    public C22306c<r8d0> m97477I2(BLiveAbsData bLiveAbsData) {
        r8d0 r8d0Var = this.f108768y;
        if (r8d0Var == null || !TextUtils.equals(r8d0Var.f187610c.f44323id, bLiveAbsData.f44323id)) {
            return TextUtils.equals(bLiveAbsData.f44323id, User.ID_TEAM_ACCOUNT) ? LivingNormalApiProvider.m71382X4(bLiveAbsData) : LivingNormalApiProvider.m71464g5(bLiveAbsData);
        }
        return C22306c.just(this.f108768y).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: J2 */
    public AudienceStartData m97478J2() {
        if (this.f70553N == null) {
            this.f70553N = new AudienceStartData.C11430a().m67611u();
        }
        return this.f70553N;
    }

    /* JADX INFO: renamed from: K2 */
    public boolean m97479K2() {
        return this.f70555P;
    }

    /* JADX INFO: renamed from: L2 */
    public boolean m97480L2() {
        return this.f70556Q;
    }

    @NotNull
    /* JADX INFO: renamed from: M2 */
    public C22306c<? extends Notification<User>> m97481M2(r8d0 r8d0Var) {
        return LivingNormalApiProvider.m71574s7(ypv.f199493a.m199309D0(), r8d0Var.f187610c.f44323id).materialize().doOnNext(new e30() { // from class: l.zl40
            @Override // p149l.e30
            public final void call(Object obj) {
                am40.m97475G2((Notification) obj);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: N2 */
    public void m97482N2(boolean z) {
        this.f70555P = z;
    }

    /* JADX INFO: renamed from: O2 */
    public void m97483O2(JumpRoomData jumpRoomData) {
        if (jumpRoomData == null || !jumpRoomData.isOldDataValid()) {
            this.f70551L = null;
        } else {
            this.f70551L = jumpRoomData;
        }
    }

    /* JADX INFO: renamed from: P2 */
    public void m97484P2(boolean z) {
        this.f70556Q = z;
    }

    /* JADX INFO: renamed from: Q2 */
    public void m97485Q2(AudienceStartData audienceStartData) {
        this.f70553N = audienceStartData;
    }

    @Override // p149l.o91
    /* JADX INFO: renamed from: a */
    public void mo97486a(boolean z) {
        this.f70550K = z;
    }

    @Override // p149l.o91
    /* JADX INFO: renamed from: b */
    public aht mo97487b() {
        return this.f70554O;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: c0 */
    public void mo97488c0(boolean z) {
        super.mo97488c0(z);
        this.f70552M = true;
        this.f70549J.onNext(roj0.f160388a);
        this.f70551L = null;
        upv.m194936x();
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: e2 */
    public void mo97489e2(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveAbsData bLiveAbsData2 = this.f108765v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.f44323id, bLiveAbsData2.f44323id)) {
            super.mo97489e2(z, bLiveAbsData);
        } else if (this.f70550K && this.f70552M) {
            mo132082O1(z, bLiveAbsData.f44323id, bLiveAbsData.room.f44419id);
            this.f70552M = false;
        }
    }

    @Override // p149l.o91
    public void exit() {
        iqv iqvVarM149816m = m149816m();
        pdu pduVar = pdu.f148371b;
        if (iqvVarM149816m == pduVar) {
            return;
        }
        if (!m170394B2() && this.f70547H != null) {
            LivingNormalApiProvider.m71221F5(m149818o(), this.f70547H, m149826x());
        }
        mo149812h(pduVar);
        m132132g2(mo149813j());
        mo97488c0(false);
    }

    @Override // p149l.pn40, p149l.lh20
    /* JADX INFO: renamed from: p */
    public boolean mo97490p() {
        return false;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: y0 */
    public JumpRoomData mo97491y0() {
        return this.f70551L;
    }
}
