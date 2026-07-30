package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.idv;
import l.lsi0;
import l.s7m;
import l.sds;
import l.uxi;
import l.w9j;
import l.ypv;
import l.zcu;
import p002l.pn40;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j350<D extends pn40> extends h4t<D, OfficialShowAvatarView> {

    /* JADX INFO: renamed from: i */
    public String f13543i;

    public j350(bsm bsmVar, OfficialShowAvatarView officialShowAvatarView) {
        super(bsmVar);
        this.f13543i = "";
        C(officialShowAvatarView);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ BLiveEnvelope m15589P3(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m15594W3(KeyboardEventData keyboardEventData) {
        ((OfficialShowAvatarView) ((bwr) this).viewModel).m9018m(!keyboardEventData.m5201b());
    }

    /* JADX INFO: renamed from: T */
    public void m15595T() {
        super.T();
        duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.y250
            public final void call(Object obj) {
                this.f22611a.m15594W3((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public boolean m15596V3() {
        return uxi.c(m25547E2().m14582l0(), m25547E2().m14603u0());
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m15597X3(BLive bLive) {
        m15606g4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ c m15598Y3(User user) {
        String str = ((DbObject) user).id;
        this.f13543i = str;
        String strM17235k = m25547E2().m17235k();
        String str2 = ((DbObject) user).id;
        return LivingNormalApiProvider.m4949t7(str, strM17235k, str2, str2, "live", "live", m25547E2().m17239o(), ((DbObject) m25547E2().m14582l0()).id);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ BLiveUserMask m15599Z3(BLiveEnvelope bLiveEnvelope) {
        return e1t.m12110d(bLiveEnvelope, this.f13543i);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m15600a4(BLiveUserMask bLiveUserMask) {
        return Boolean.valueOf(m25547E2().m14582l0() != null);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m15601b4(BLiveUserMask bLiveUserMask) {
        ((OfficialShowAvatarView) ((bwr) this).viewModel).m9020p(m25547E2().m14582l0(), bLiveUserMask);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m15602c4(User user) {
        if (TextUtils.equals(((DbObject) m25547E2().m14582l0()).id, ((DbObject) user).id)) {
            m25547E2().m14532U(user.localFollowship);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m15603d4(Followship followship) {
        m15606g4();
    }

    /* JADX INFO: renamed from: e4 */
    public void m15604e4() {
        if (m25547E2().m14582l0() != null) {
            m25548F2().OfficialShowCardEvent.show().j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m15605f4() {
        User userM14582l0 = m25547E2().m14582l0();
        if (userM14582l0 != null) {
            sds.a aVarD = sds.k().h(((DbObject) userM14582l0).id).e("liveRoom_topleft").d(((DbObject) userM14582l0).id);
            BLive bLiveMo19690l = m25547E2().m20501A2().mo19690l();
            if (bLiveMo19690l != null) {
                aVarD.f(((BLiveAbsData) bLiveMo19690l).id).g(((BLiveAbsData) bLiveMo19690l).state);
            }
            zcu.c(mo21430R2(), aVarD.a());
        }
        m25547E2().m14561e0(false, mo21430R2(), "liveRoom_topleft", new d30() { // from class: l.z250
            public final void call() {
                lsi0.y("订阅成功");
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m15606g4() {
        boolean zM15596V3 = m15596V3();
        s7m s7mVar = ((bwr) this).viewModel;
        if (zM15596V3) {
            ((OfficialShowAvatarView) s7mVar).m9017l(false);
        } else {
            ((OfficialShowAvatarView) s7mVar).m9017l(true);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m15607h4(String str) {
        ro1.m22092k(m25547E2(), mo21430R2(), str);
    }

    /* JADX INFO: renamed from: t */
    public void m15608t() {
        super.t();
        ((OfficialShowAvatarView) ((bwr) this).viewModel).m9018m(!m25551K2().m22224l(LiveDialogEnum.CHAT_INPUT));
        duringCreated(m25547E2().m20501A2().m21483d()).subscribe(ffw.h(new e30() { // from class: l.a350
            public final void call(Object obj) {
                this.f7356a.m15597X3((BLive) obj);
            }
        }));
        duringCreated(m25547E2().m14569h0().filter(new w9j() { // from class: l.b350
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        }).flatMap(new w9j() { // from class: l.c350
            public final Object call(Object obj) {
                return this.f8473a.m15598Y3((User) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.d350
            public final Object call(Object obj) {
                return j350.m15589P3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.e350
            public final Object call(Object obj) {
                return this.f9560a.m15599Z3((BLiveEnvelope) obj);
            }
        })).filter(new w9j() { // from class: l.f350
            public final Object call(Object obj) {
                return this.f10113a.m15600a4((BLiveUserMask) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.g350
            public final void call(Object obj) {
                this.f10739a.m15601b4((BLiveUserMask) obj);
            }
        }));
        duringCreated(((idv) ypv.l(fld0.b)).g()).subscribe(ffw.d(new e30() { // from class: l.h350
            public final void call(Object obj) {
                this.f11861a.m15602c4((User) obj);
            }
        }));
        duringCreated(m25547E2().m14601t0()).subscribe(ffw.d(new e30() { // from class: l.i350
            public final void call(Object obj) {
                this.f12413a.m15603d4((Followship) obj);
            }
        }));
    }
}
