package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveFanBase;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.h4g;
import l.idv;
import l.lsi0;
import l.qib0;
import l.sds;
import l.uxi;
import l.vdt;
import l.ypv;
import l.zcu;
import rx.Notification;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class go1 extends bn1<am40> {
    public go1(bsm bsmVar, AvatarView avatarView) {
        super(bsmVar, avatarView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.bn1
    /* JADX INFO: renamed from: a4 */
    public boolean mo10502a4() {
        return uxi.b(((am40) m25547E2()).m14582l0(), ((am40) m25547E2()).m14603u0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.bn1
    /* JADX INFO: renamed from: b4 */
    public boolean mo10503b4() {
        return ((am40) m25547E2()).m14536V0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.bn1
    /* JADX INFO: renamed from: l4 */
    public void mo10510l4(int i) {
        super.mo10510l4(i);
        if (i == 3) {
            h4g h4gVarM14597r0 = ((am40) m25547E2()).m14597r0();
            if (h4gVarM14597r0 != null) {
                if (h4gVarM14597r0.c(qib0.b0.a.userId())) {
                    m25548F2().FansClubEvent.showFansClubDialog().j(Boolean.TRUE);
                } else {
                    m25548F2().FansClubEntryEvent.openEntry().j(Boolean.TRUE);
                }
                BLiveFanBase bLiveFanBaseB = h4gVarM14597r0.b();
                if (bLiveFanBaseB != null) {
                    m13988z4(bLiveFanBaseB.id);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            User userM14582l0 = ((am40) m25547E2()).m14582l0();
            if (userM14582l0 != null) {
                sds.a aVarD = sds.k().h(((DbObject) userM14582l0).id).e("liveRoom_topleft").d(((DbObject) userM14582l0).id);
                BLive bLiveMo19690l = ((am40) m25547E2()).m20501A2().mo19690l();
                if (bLiveMo19690l != null) {
                    aVarD.f(((BLiveAbsData) bLiveMo19690l).id).g(((BLiveAbsData) bLiveMo19690l).state);
                }
                zcu.c(mo21430R2(), aVarD.a());
            }
            ((am40) m25547E2()).m14561e0(false, mo21430R2(), "liveRoom_topleft", new d30() { // from class: l.bo1
                public final void call() {
                    this.f8288a.m13982t4();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.bn1
    /* JADX INFO: renamed from: n4 */
    public void mo10512n4(String str) {
        ro1.m22092k((pn40) m25547E2(), mo21430R2(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.bn1
    /* JADX INFO: renamed from: t */
    public void mo10513t() {
        super.mo10513t();
        duringCreated(((idv) ypv.l(fld0.b)).g()).subscribe(ffw.d(new e30() { // from class: l.co1
            public final void call(Object obj) {
                this.f8766a.m13985w4((User) obj);
            }
        }));
        duringCreated(((am40) m25547E2()).m14601t0()).subscribe(ffw.d(new e30() { // from class: l.do1
            public final void call(Object obj) {
                this.f9367a.m13986x4((Followship) obj);
            }
        }));
        m13987y4();
    }

    /* JADX INFO: renamed from: t4 */
    public final void m13982t4() {
        if (vdt.b(2)) {
            lsi0.w(R$string.f2866M4);
        } else {
            lsi0.w(R$string.f2845L4);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m13983u4(Integer num) {
        ((AvatarView) ((bwr) this).viewModel).m5564B(num.intValue() > 0);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m13984v4(Notification notification) {
        ((AvatarView) ((bwr) this).viewModel).m5564B(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m13985w4(User user) {
        if (TextUtils.equals(((DbObject) ((am40) m25547E2()).m14582l0()).id, ((DbObject) user).id)) {
            ((am40) m25547E2()).m14532U(user.localFollowship);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m13986x4(Followship followship) {
        m10511m4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final void m13987y4() {
        BLiveFanBase bLiveFanBaseB;
        if (!mo10503b4() || (bLiveFanBaseB = ((am40) m25547E2()).m14597r0().b()) == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m4667O4(bLiveFanBaseB.id)).subscribe(ffw.h(new e30() { // from class: l.eo1
            public final void call(Object obj) {
                this.f9887a.m13983u4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m13988z4(String str) {
        duringCreated(LivingNormalApiProvider.m4732V6(str)).materialize().subscribe(ffw.d(new e30() { // from class: l.fo1
            public final void call(Object obj) {
                this.f10562a.m13984v4((Notification) obj);
            }
        }));
    }
}
