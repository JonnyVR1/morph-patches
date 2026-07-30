package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveRecommendInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveSideBarConfig;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class r9d0 extends pat<am40> implements l3m {

    /* JADX INFO: renamed from: l */
    public static long f158355l;

    /* JADX INFO: renamed from: i */
    public final String f158356i;

    /* JADX INFO: renamed from: j */
    public c4g0 f158357j;

    /* JADX INFO: renamed from: k */
    public C22393b<Throwable> f158358k;

    public r9d0(bsm bsmVar, String str) {
        super(bsmVar);
        this.f158358k = C22393b.m221521b();
        this.f158356i = str;
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m178314J3(e30 e30Var, r8d0 r8d0Var) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(r8d0Var);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m178336g4(roj0 roj0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m178337k4(e30<r8d0> e30Var) {
        iqv iqvVarM149816m = ((am40) m206027E2()).m149816m();
        gkh0.m126627j("live_float_window", "RoomPresenter initRoomInfo " + iqvVarM149816m);
        m178343F4();
        ((am40) m206027E2()).mo149812h(pdu.f148371b);
        ((am40) m206027E2()).mo149812h(iqvVarM149816m);
        if (e30Var != null) {
            r8d0 r8d0Var = new r8d0(((am40) m206027E2()).m132146l0(), ((am40) m206027E2()).m170393A2().mo165469j(), ((am40) m206027E2()).m170393A2().mo165470l(), ((am40) m206027E2()).m132167u0(), ((am40) m206027E2()).m132071J0());
            duringCreated(((am40) m206027E2()).m97481M2(r8d0Var)).subscribe(ffw.m121193d(new e30() { // from class: l.z8d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f202148a.m178344G4((Notification) obj);
                }
            }));
            e30Var.call(r8d0Var.m178245c(((am40) m206027E2()).f70548I));
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m178338A4() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m178339B4() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m178340C4() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: D4 */
    public void m178341D4(Throwable th) {
        m206028F2().PlayerEvent.enterRoomFail().m172467p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            if (i == 41038) {
                m206028F2().PlayerEvent.restorePlayerView().m172467p();
                m178342E4(ypv.f199497e.getString(R$string.f47596w), ypv.f199497e.getString(R$string.f47423o2), new d30() { // from class: l.a9d0
                    @Override // p149l.d30
                    public final void call() {
                        this.f68143a.m178338A4();
                    }
                });
                return;
            }
            if (i == 41003) {
                m206028F2().PlayerEvent.restorePlayerView().m172467p();
                m178342E4(ypv.f199497e.getString(R$string.f46965Sj), ypv.f199497e.getString(R$string.f47423o2), new d30() { // from class: l.b9d0
                    @Override // p149l.d30
                    public final void call() {
                        this.f74568a.m178339B4();
                    }
                });
                return;
            }
            if (i == 41028) {
                act().m66873d2();
                ypv.f199493a.m199363o0(3);
                return;
            } else if (i == 41503) {
                String str = coreService.metaMessage;
                m206028F2().PlayerEvent.restorePlayerView().m172467p();
                m178342E4(str, ypv.f199497e.getString(R$string.f47423o2), new d30() { // from class: l.c9d0
                    @Override // p149l.d30
                    public final void call() {
                        this.f79926a.m178340C4();
                    }
                });
                return;
            } else if (i == 41016) {
                lsi0.m151595y(coreService.metaMessage);
                act().m66873d2();
                return;
            }
        }
        lsi0.m151578h(R$string.f46654E9);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m178342E4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4309e c4309eM20496B = this.f188513f.dialog().m20504F(str).m20496B(false);
        Objects.requireNonNull(d30Var);
        c4309eM20496B.m20544n0(str2, new bii0(d30Var)).m20568z0();
    }

    /* JADX INFO: renamed from: F4 */
    public void m178343F4() {
        Act act = act();
        if (act == null || act.getShowingDialog() == null) {
            return;
        }
        act.getShowingDialog().dismiss();
    }

    /* JADX INFO: renamed from: G4 */
    public final void m178344G4(Notification<User> notification) {
        if (ypv.m215672k().m195730S6()) {
            String strM178345h4 = m178345h4(notification.m221295f());
            gkh0.m126627j("[live]", "updateFakeId:" + strM178345h4);
            if (TextUtils.isEmpty(strM178345h4) || TextUtils.equals("0", strM178345h4)) {
                return;
            }
            m206028F2().RoomMysteryEventGroup.setRoomFakeId().mo172463j(strM178345h4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().RoomInfoEvent.initRoomInfo().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.t8d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168890a.m178349m4((s8d0) obj);
            }
        }));
        duringCreated(m206028F2().RoomInfoEvent.initSmallWindowRoomInfo().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.e9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90092a.m178350n4((s8d0) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.j9d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.k9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121994a.m178351o4((NetworkInfo) obj);
            }
        }));
        this.f158357j = ((am40) m206027E2()).m132156o1(this.f188513f).subscribe(ffw.m121193d(new e30() { // from class: l.l9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127076a.m178352p4((LiveControlMessage) obj);
            }
        }));
        duringCreated(this.f158358k).subscribe(new e30() { // from class: l.m9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132771a.m178341D4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public final String m178345h4(User user) {
        if (!NullChecker.m81303a(user) || !NullChecker.m81303a(user.settings) || vwb.m200296J(user.settings.settingGroups)) {
            return "0";
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        return (NullChecker.m81303a(settingGroup) && NullChecker.m81303a(settingGroup.live)) ? settingGroup.live.fakeId : "0";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: i4 */
    public final C22306c<roj0> m178346i4(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveRecommendInfo bLiveRecommendInfo;
        return LivingNormalApiProvider.m71400Z4(((am40) m206027E2()).m149818o(), ypv.f199493a.m199309D0(), ((am40) m206027E2()).mo132155o0(), (!z || (bLiveRecommendInfo = bLiveAbsData.recommendInfo) == null || bLiveRecommendInfo.extInfo == null || !rlt.C19733a.m179883a(((am40) m206027E2()).mo132155o0())) ? null : bLiveAbsData.recommendInfo.extInfo.toJsonAsQueryString(), NullChecker.m81303a(bLiveAbsData.recommendInfo) ? bLiveAbsData.recommendInfo.category : null, ((am40) m206027E2()).m149826x()).doOnNext(new e30() { // from class: l.g9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101559a.m178353q4((BLiveEnvelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.h9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106570a.m178354r4((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.i9d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m178347j4(final BLiveAbsData bLiveAbsData, final boolean z, final e30<r8d0> e30Var, final e30<r8d0> e30Var2) {
        m178343F4();
        if (s91.f163132b != 0) {
            final long jM155944o = mqi0.m155944o() - s91.f163132b;
            eet.m116003b(this, "audience_start_live", new e30() { // from class: l.n9d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((Map) obj).put("watch_duration", Long.valueOf(jM155944o));
                }
            });
            s91.f163132b = 0L;
        }
        f158355l = mqi0.m155944o();
        duringCreated(((am40) m206027E2()).m97477I2(bLiveAbsData)).filter(new w9j() { // from class: l.o9d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f142709a.m178355s4((r8d0) obj);
            }
        }).doOnNext(new e30() { // from class: l.p9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                r9d0.m178314J3(e30Var, (r8d0) obj);
            }
        }).doOnError(new e30() { // from class: l.q9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153424a.m178356t4((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.u8d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f175116a.m178357u4((r8d0) obj);
            }
        }).flatMap(new w9j() { // from class: l.v8d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180465a.m178358v4(z, bLiveAbsData, (Notification) obj);
            }
        }).map(new w9j() { // from class: l.w8d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185202a.m178359w4(e30Var2, obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.x8d0
            @Override // p149l.e30
            public final void call(Object obj) {
                r9d0.m178336g4((roj0) obj);
            }
        }, new e30() { // from class: l.y8d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196814a.m178360x4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m178348l4(String str, final int i) {
        m178343F4();
        m206028F2().PlayerEvent.showLoading().mo172463j(Boolean.TRUE);
        duringCreated(LivingNormalApiProvider.m71473h5(str)).subscribe(ffw.m121194e(new e30() { // from class: l.d9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85113a.m178361y4(i, (r8d0) obj);
            }
        }, new e30() { // from class: l.f9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96481a.m178362z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m178349m4(s8d0 s8d0Var) {
        m178347j4(s8d0Var.f163041b, s8d0Var.f163042c, s8d0Var.f163043d, s8d0Var.f163040a);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f158357j);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m178350n4(s8d0 s8d0Var) {
        m178337k4(s8d0Var.f163040a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m178351o4(NetworkInfo networkInfo) {
        iqv iqvVarM149816m = ((am40) m206027E2()).m149816m();
        if (iqvVarM149816m.m137796c()) {
            m178348l4(((am40) m206027E2()).m149814k(), 2);
        } else if (iqvVarM149816m.m137800g()) {
            m178348l4(((am40) m206027E2()).m149814k(), 1);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m178352p4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("start")) {
            m178348l4(liveControlMessage.liveId, 2);
        } else if (str.equals("recover")) {
            m178348l4(liveControlMessage.liveId, 1);
        }
        if (vdt.m198092b(2)) {
            return;
        }
        gkh0.m126628k(liveControlMessage.toString(), "[live]", "[passivity_exit]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m178353q4(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData;
        BLiveSideBarConfig bLiveSideBarConfig;
        BLive bLiveM175585c = ((am40) m206027E2()).m170393A2().mo165470l();
        if (bLiveEnvelope == null || (bLiveData = bLiveEnvelope.data) == null || (bLiveSideBarConfig = bLiveData.showSideBarConfig) == null || TextUtils.isEmpty(bLiveSideBarConfig.sideBarState)) {
            ((am40) m206027E2()).f70548I = "default";
        } else {
            ((am40) m206027E2()).f70548I = bLiveEnvelope.data.showSideBarConfig.sideBarState;
        }
        ((bgv) ypv.m215673l(fld0.f98151f)).m101715C(bLiveEnvelope.data.intlConfig.switchStar);
        zvf0.m220371D("e_live_enter", mo77274R2(), new j760("enter_rec_category", ((am40) m206027E2()).m132069I0().m218716c()), new j760("live_enter_source", ((am40) m206027E2()).m132060D0()), new j760("live_inter_source", ((am40) m206027E2()).mo132155o0()), new j760("anchorId", bLiveM175585c.anchor.f44419id), new j760("liveId", bLiveM175585c.f44323id), new j760("live_status", (TEnum.equals(bLiveM175585c.state, "onlive") || TEnum.equals(bLiveM175585c.state, "suspended")) ? "on" : BLiveOperationTitleShowType.off), new j760("page_id", mo77274R2()), new j760("trace_id", Long.valueOf(((am40) m206027E2()).m132069I0().m218719f())), new j760("roomId", bLiveM175585c.room.f44419id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m178354r4(BLiveEnvelope bLiveEnvelope) {
        BLive bLiveM175585c = ((am40) m206027E2()).m170393A2().mo165470l();
        if (bLiveM175585c != null) {
            bLiveM175585c.memberCount += 1.0d;
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ Boolean m178355s4(r8d0 r8d0Var) {
        if (TextUtils.equals(this.f158356i, "live") && t7t.m187501a(r8d0Var.f187610c)) {
            BLive bLiveNew_ = BLive.new_();
            bLiveNew_.f44323id = t7t.m187502b(r8d0Var.f187610c);
            bLiveNew_.liveMode = "officialShow";
            m206028F2().FragProxyEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73026o(bLiveNew_).m73032u(m129308n3()).m73025n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m73024m());
            return Boolean.FALSE;
        }
        if (!TextUtils.equals(this.f158356i, "live") || !t7t.m187504d(r8d0Var.f187610c)) {
            return Boolean.TRUE;
        }
        m206028F2().FragProxyEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73026o(r8d0Var.f187610c).m73032u(m129308n3()).m73025n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m73024m());
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m178356t4(Throwable th) {
        m206028F2().PlayerEvent.showErrorText().mo172463j(ypv.f199497e.getString(R$string.f46720H9));
        m206028F2().PlayerEvent.showLoading().mo172463j(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ C22306c m178357u4(r8d0 r8d0Var) {
        m206028F2().FragProxyEvent.changeRoomData().mo172463j(r8d0Var);
        return duringCreated(((am40) m206027E2()).m97481M2(r8d0Var));
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ C22306c m178358v4(boolean z, BLiveAbsData bLiveAbsData, Notification notification) {
        m178344G4(notification);
        return duringCreated(m178346i4(z, bLiveAbsData));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ roj0 m178359w4(e30 e30Var, Object obj) {
        if (e30Var != null) {
            e30Var.call(new r8d0(((am40) m206027E2()).m132146l0(), ((am40) m206027E2()).m170393A2().mo165469j(), ((am40) m206027E2()).m170393A2().mo165470l(), ((am40) m206027E2()).m132167u0(), ((am40) m206027E2()).m132071J0()).m178245c(((am40) m206027E2()).f70548I));
            h5j0.INSTANCE.m129404c("enter_live_room", "onGetEnterRoomInfo 修改状态为living");
        }
        ((am40) m206027E2()).m132099V(((am40) m206027E2()).m170393A2().mo165470l());
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m178360x4(Throwable th) {
        this.f158358k.m132487l(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m178361y4(int i, r8d0 r8d0Var) {
        m206028F2().FragProxyEvent.changeRoomData().mo172463j(r8d0Var);
        BLive bLiveM175585c = ((am40) m206027E2()).m170393A2().mo165470l();
        bLiveM175585c.memberCount += 1.0d;
        ((am40) m206027E2()).m132102W(bLiveM175585c, i);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m178362z4(Throwable th) {
        this.f158358k.m132487l(th);
    }
}
