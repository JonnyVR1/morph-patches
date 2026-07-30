package p002l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveRecommendInfo;
import com.p1.mobile.putong.live.base.data.BLiveSideBarConfig;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import java.util.Objects;
import l.bgv;
import l.bii0;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.gkh0;
import l.h5j0;
import l.j760;
import l.l3m;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.r8d0;
import l.rlt;
import l.roj0;
import l.vdt;
import l.vwb;
import l.w9j;
import l.wq2;
import l.ypv;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import rx.Notification;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r9d0 extends pat<am40> implements l3m {

    /* JADX INFO: renamed from: l */
    public static long f18419l;

    /* JADX INFO: renamed from: i */
    public final String f18420i;

    /* JADX INFO: renamed from: j */
    public c4g0 f18421j;

    /* JADX INFO: renamed from: k */
    public b<Throwable> f18422k;

    public r9d0(bsm bsmVar, String str) {
        super(bsmVar);
        this.f18422k = b.b();
        this.f18420i = str;
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m21805J3(e30 e30Var, r8d0 r8d0Var) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(r8d0Var);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m21827g4(roj0 roj0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m21828k4(e30<r8d0> e30Var) {
        iqv iqvVarM17237m = ((am40) m25547E2()).m17237m();
        gkh0.j("live_float_window", "RoomPresenter initRoomInfo " + iqvVarM17237m);
        m21834F4();
        ((am40) m25547E2()).mo17233h(pdu.f17211b);
        ((am40) m25547E2()).mo17233h(iqvVarM17237m);
        if (e30Var != null) {
            r8d0 r8d0Var = new r8d0(((am40) m25547E2()).m14582l0(), ((am40) m25547E2()).m20501A2().mo19689j(), ((am40) m25547E2()).m20501A2().mo19690l(), ((am40) m25547E2()).m14603u0(), ((am40) m25547E2()).m14507J0());
            duringCreated(((am40) m25547E2()).m9884M2(r8d0Var)).subscribe(ffw.d(new e30() { // from class: l.z8d0
                public final void call(Object obj) {
                    this.f23303a.m21835G4((Notification) obj);
                }
            }));
            e30Var.call(r8d0Var.c(((am40) m25547E2()).f7723I));
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m21829A4() {
        act().finish();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m21830B4() {
        act().finish();
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m21831C4() {
        act().finish();
    }

    /* JADX INFO: renamed from: D4 */
    public void m21832D4(Throwable th) {
        m25548F2().PlayerEvent.enterRoomFail().p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            if (i == 41038) {
                m25548F2().PlayerEvent.restorePlayerView().p();
                m21833E4(ypv.e.getString(R$string.f3638w), ypv.e.getString(R$string.f3465o2), new d30() { // from class: l.a9d0
                    public final void call() {
                        this.f7453a.m21829A4();
                    }
                });
                return;
            }
            if (i == 41003) {
                m25548F2().PlayerEvent.restorePlayerView().p();
                m21833E4(ypv.e.getString(R$string.f3007Sj), ypv.e.getString(R$string.f3465o2), new d30() { // from class: l.b9d0
                    public final void call() {
                        this.f8039a.m21830B4();
                    }
                });
                return;
            }
            if (i == 41028) {
                act().finish();
                ypv.a.o0(3);
                return;
            } else if (i == 41503) {
                String str = coreService.metaMessage;
                m25548F2().PlayerEvent.restorePlayerView().p();
                m21833E4(str, ypv.e.getString(R$string.f3465o2), new d30() { // from class: l.c9d0
                    public final void call() {
                        this.f8563a.m21831C4();
                    }
                });
                return;
            } else if (i == 41016) {
                lsi0.y(coreService.metaMessage);
                act().finish();
                return;
            }
        }
        lsi0.h(R$string.f2696E9);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m21833E4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.e eVarB = this.f22037f.dialog().F(str).B(false);
        Objects.requireNonNull(d30Var);
        eVarB.n0(str2, new bii0(d30Var)).z0();
    }

    /* JADX INFO: renamed from: F4 */
    public void m21834F4() {
        Act act = act();
        if (act == null || act.getShowingDialog() == null) {
            return;
        }
        act.getShowingDialog().dismiss();
    }

    /* JADX INFO: renamed from: G4 */
    public final void m21835G4(Notification<User> notification) {
        if (ypv.k().S6()) {
            String strM21837h4 = m21837h4((User) notification.f());
            gkh0.j("[live]", "updateFakeId:" + strM21837h4);
            if (TextUtils.isEmpty(strM21837h4) || TextUtils.equals("0", strM21837h4)) {
                return;
            }
            m25548F2().RoomMysteryEventGroup.setRoomFakeId().j(strM21837h4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m21836T() {
        super.T();
        duringCreated((c) m25548F2().RoomInfoEvent.initRoomInfo().g()).subscribe(ffw.d(new e30() { // from class: l.t8d0
            public final void call(Object obj) {
                this.f20125a.m21841m4((s8d0) obj);
            }
        }));
        duringCreated((c) m25548F2().RoomInfoEvent.initSmallWindowRoomInfo().g()).subscribe(ffw.d(new e30() { // from class: l.e9d0
            public final void call(Object obj) {
                this.f9637a.m21842n4((s8d0) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.j9d0
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(ffw.d(new e30() { // from class: l.k9d0
            public final void call(Object obj) {
                this.f14259a.m21843o4((NetworkInfo) obj);
            }
        }));
        this.f18421j = ((am40) m25547E2()).m14592o1(this.f22037f).subscribe(ffw.d(new e30() { // from class: l.l9d0
            public final void call(Object obj) {
                this.f14738a.m21844p4((LiveControlMessage) obj);
            }
        }));
        duringCreated(this.f18422k).subscribe(new e30() { // from class: l.m9d0
            public final void call(Object obj) {
                this.f15288a.m21832D4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public final String m21837h4(User user) {
        if (!NullChecker.a(user) || !NullChecker.a(user.settings) || vwb.J(user.settings.settingGroups)) {
            return "0";
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        return (NullChecker.a(settingGroup) && NullChecker.a(settingGroup.live)) ? settingGroup.live.fakeId : "0";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: i4 */
    public final c<roj0> m21838i4(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveRecommendInfo bLiveRecommendInfo;
        return LivingNormalApiProvider.m4766Z4(((am40) m25547E2()).m17239o(), ypv.a.D0(), ((am40) m25547E2()).mo14591o0(), (!z || (bLiveRecommendInfo = bLiveAbsData.recommendInfo) == null || bLiveRecommendInfo.extInfo == null || !rlt.a.a(((am40) m25547E2()).mo14591o0())) ? null : bLiveAbsData.recommendInfo.extInfo.toJsonAsQueryString(), NullChecker.a(bLiveAbsData.recommendInfo) ? bLiveAbsData.recommendInfo.category : null, ((am40) m25547E2()).m17247x()).doOnNext(new e30() { // from class: l.g9d0
            public final void call(Object obj) {
                this.f11309a.m21845q4((BLiveEnvelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.h9d0
            public final void call(Object obj) {
                this.f11948a.m21846r4((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.i9d0
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m21839j4(final BLiveAbsData bLiveAbsData, final boolean z, final e30<r8d0> e30Var, final e30<r8d0> e30Var2) {
        m21834F4();
        if (s91.f18847b != 0) {
            final long jO = mqi0.o() - s91.f18847b;
            eet.m12448b(this, "audience_start_live", new e30() { // from class: l.n9d0
                public final void call(Object obj) {
                    ((Map) obj).put("watch_duration", Long.valueOf(jO));
                }
            });
            s91.f18847b = 0L;
        }
        f18419l = mqi0.o();
        duringCreated(((am40) m25547E2()).m9880I2(bLiveAbsData)).filter(new w9j() { // from class: l.o9d0
            public final Object call(Object obj) {
                return this.f16443a.m21847s4((r8d0) obj);
            }
        }).doOnNext(new e30() { // from class: l.p9d0
            public final void call(Object obj) {
                r9d0.m21805J3(e30Var, (r8d0) obj);
            }
        }).doOnError(new e30() { // from class: l.q9d0
            public final void call(Object obj) {
                this.f17876a.m21848t4((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.u8d0
            public final Object call(Object obj) {
                return this.f20537a.m21849u4((r8d0) obj);
            }
        }).flatMap(new w9j() { // from class: l.v8d0
            public final Object call(Object obj) {
                return this.f21029a.m21850v4(z, bLiveAbsData, (Notification) obj);
            }
        }).map(new w9j() { // from class: l.w8d0
            public final Object call(Object obj) {
                return this.f21555a.m21851w4(e30Var2, obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.x8d0
            public final void call(Object obj) {
                r9d0.m21827g4((roj0) obj);
            }
        }, new e30() { // from class: l.y8d0
            public final void call(Object obj) {
                this.f22737a.m21852x4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m21840l4(String str, final int i) {
        m21834F4();
        m25548F2().PlayerEvent.showLoading().j(Boolean.TRUE);
        duringCreated(LivingNormalApiProvider.m4839h5(str)).subscribe(ffw.e(new e30() { // from class: l.d9d0
            public final void call(Object obj) {
                this.f9118a.m21853y4(i, (r8d0) obj);
            }
        }, new e30() { // from class: l.f9d0
            public final void call(Object obj) {
                this.f10197a.m21854z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m21841m4(s8d0 s8d0Var) {
        m21839j4(s8d0Var.f18833b, s8d0Var.f18834c, s8d0Var.f18835d, s8d0Var.f18832a);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mkd0.z(this.f18421j);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m21842n4(s8d0 s8d0Var) {
        m21828k4(s8d0Var.f18832a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m21843o4(NetworkInfo networkInfo) {
        iqv iqvVarM17237m = ((am40) m25547E2()).m17237m();
        if (iqvVarM17237m.m15300c()) {
            m21840l4(((am40) m25547E2()).m17235k(), 2);
        } else if (iqvVarM17237m.m15304g()) {
            m21840l4(((am40) m25547E2()).m17235k(), 1);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m21844p4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("start")) {
            m21840l4(liveControlMessage.liveId, 2);
        } else if (str.equals("recover")) {
            m21840l4(liveControlMessage.liveId, 1);
        }
        if (vdt.b(2)) {
            return;
        }
        gkh0.k(liveControlMessage.toString(), new String[]{"[live]", "[passivity_exit]"});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m21845q4(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData;
        BLiveSideBarConfig bLiveSideBarConfig;
        BLive bLiveMo19690l = ((am40) m25547E2()).m20501A2().mo19690l();
        if (bLiveEnvelope == null || (bLiveData = bLiveEnvelope.data) == null || (bLiveSideBarConfig = bLiveData.showSideBarConfig) == null || TextUtils.isEmpty(bLiveSideBarConfig.sideBarState)) {
            ((am40) m25547E2()).f7723I = "default";
        } else {
            ((am40) m25547E2()).f7723I = bLiveEnvelope.data.showSideBarConfig.sideBarState;
        }
        ((bgv) ypv.l(fld0.f)).C(bLiveEnvelope.data.intlConfig.switchStar);
        zvf0.D("e_live_enter", mo21430R2(), new j760[]{new j760("enter_rec_category", ((am40) m25547E2()).m14505I0().m27367c()), new j760("live_enter_source", ((am40) m25547E2()).m14495D0()), new j760("live_inter_source", ((am40) m25547E2()).mo14591o0()), new j760("anchorId", ((BLiveAbsData) bLiveMo19690l).anchor.id), new j760("liveId", ((BLiveAbsData) bLiveMo19690l).id), new j760("live_status", (TEnum.equals(((BLiveAbsData) bLiveMo19690l).state, "onlive") || TEnum.equals(((BLiveAbsData) bLiveMo19690l).state, "suspended")) ? "on" : "off"), new j760("page_id", mo21430R2()), new j760("trace_id", Long.valueOf(((am40) m25547E2()).m14505I0().m27370f())), new j760("roomId", ((BLiveAbsData) bLiveMo19690l).room.id)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m21846r4(BLiveEnvelope bLiveEnvelope) {
        BLive bLiveMo19690l = ((am40) m25547E2()).m20501A2().mo19690l();
        if (bLiveMo19690l != null) {
            ((BLiveAbsData) bLiveMo19690l).memberCount += 1.0d;
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ Boolean m21847s4(r8d0 r8d0Var) {
        if (TextUtils.equals(this.f18420i, "live") && t7t.m22809a(((wq2) r8d0Var).c)) {
            BLiveAbsData bLiveAbsDataNew_ = BLive.new_();
            bLiveAbsDataNew_.id = t7t.m22810b(((wq2) r8d0Var).c);
            bLiveAbsDataNew_.liveMode = "officialShow";
            m25548F2().FragProxyEvent.jumpRoom().j(new JumpRoomData.C0350a().m6549o(bLiveAbsDataNew_).m6555u(m14195n3()).m6548n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m6547m());
            return Boolean.FALSE;
        }
        if (!TextUtils.equals(this.f18420i, "live") || !t7t.m22812d(((wq2) r8d0Var).c)) {
            return Boolean.TRUE;
        }
        m25548F2().FragProxyEvent.jumpRoom().j(new JumpRoomData.C0350a().m6549o(((wq2) r8d0Var).c).m6555u(m14195n3()).m6548n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m6547m());
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m21848t4(Throwable th) {
        m25548F2().PlayerEvent.showErrorText().j(ypv.e.getString(R$string.f2762H9));
        m25548F2().PlayerEvent.showLoading().j(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ c m21849u4(r8d0 r8d0Var) {
        m25548F2().FragProxyEvent.changeRoomData().j(r8d0Var);
        return duringCreated(((am40) m25547E2()).m9884M2(r8d0Var));
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ c m21850v4(boolean z, BLiveAbsData bLiveAbsData, Notification notification) {
        m21835G4(notification);
        return duringCreated(m21838i4(z, bLiveAbsData));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ roj0 m21851w4(e30 e30Var, Object obj) {
        if (e30Var != null) {
            e30Var.call(new r8d0(((am40) m25547E2()).m14582l0(), ((am40) m25547E2()).m20501A2().mo19689j(), ((am40) m25547E2()).m20501A2().mo19690l(), ((am40) m25547E2()).m14603u0(), ((am40) m25547E2()).m14507J0()).c(((am40) m25547E2()).f7723I));
            h5j0.INSTANCE.c("enter_live_room", "onGetEnterRoomInfo 修改状态为living");
        }
        ((am40) m25547E2()).m14535V(((am40) m25547E2()).m20501A2().mo19690l());
        return roj0.a;
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m21852x4(Throwable th) {
        this.f18422k.onNext(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m21853y4(int i, r8d0 r8d0Var) {
        m25548F2().FragProxyEvent.changeRoomData().j(r8d0Var);
        BLiveAbsData bLiveAbsDataMo19690l = ((am40) m25547E2()).m20501A2().mo19690l();
        bLiveAbsDataMo19690l.memberCount += 1.0d;
        ((am40) m25547E2()).m14538W(bLiveAbsDataMo19690l, i);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m21854z4(Throwable th) {
        this.f18422k.onNext(th);
    }
}
