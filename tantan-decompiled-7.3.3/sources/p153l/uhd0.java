package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveRecommendInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveSideBarConfig;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class uhd0 extends qct<ou40> implements c6m {

    /* JADX INFO: renamed from: l */
    public static long f179016l;

    /* JADX INFO: renamed from: i */
    public final String f179017i;

    /* JADX INFO: renamed from: j */
    public kcg0 f179018j;

    /* JADX INFO: renamed from: k */
    public C22508b<Throwable> f179019k;

    public uhd0(dum dumVar, String str) {
        super(dumVar);
        this.f179019k = C22508b.m222767b();
        this.f179017i = str;
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m196026J3(y20 y20Var, ugd0 ugd0Var) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(ugd0Var);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m196048g4(uxj0 uxj0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m196049k4(y20<ugd0> y20Var) {
        jsv jsvVarM202193m = ((ou40) m213810E2()).m202193m();
        nsh0.m164608j("live_float_window", "RoomPresenter initRoomInfo " + jsvVarM202193m);
        m196055F4();
        ((ou40) m213810E2()).mo160116h(qfu.f157341b);
        ((ou40) m213810E2()).mo160116h(jsvVarM202193m);
        if (y20Var != null) {
            ugd0 ugd0Var = new ugd0(((ou40) m213810E2()).m168532l0(), ((ou40) m213810E2()).m118363A2().mo122891j(), ((ou40) m213810E2()).m118363A2().mo122892l(), ((ou40) m213810E2()).m168551u0(), ((ou40) m213810E2()).m168460J0());
            duringCreated(((ou40) m213810E2()).m169228M2(ugd0Var)).subscribe(dhw.m115825d(new y20() { // from class: l.chd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f81798a.m196056G4((Notification) obj);
                }
            }));
            y20Var.call(ugd0Var.m195900c(((ou40) m213810E2()).f149051I));
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m196050A4() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m196051B4() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m196052C4() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: D4 */
    public void m196053D4(Throwable th) {
        m213811F2().PlayerEvent.enterRoomFail().m199277p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            if (i == 41038) {
                m213811F2().PlayerEvent.restorePlayerView().m199277p();
                m196054E4(zrv.f205803e.getString(R$string.f48444w), zrv.f205803e.getString(R$string.f48271o2), new x20() { // from class: l.dhd0
                    @Override // p153l.x20
                    public final void call() {
                        this.f88482a.m196050A4();
                    }
                });
                return;
            }
            if (i == 41003) {
                m213811F2().PlayerEvent.restorePlayerView().m199277p();
                m196054E4(zrv.f205803e.getString(R$string.f47813Sj), zrv.f205803e.getString(R$string.f48271o2), new x20() { // from class: l.ehd0
                    @Override // p153l.x20
                    public final void call() {
                        this.f94037a.m196051B4();
                    }
                });
                return;
            }
            if (i == 41028) {
                act().m68056e2();
                zrv.f205799a.m207685o0(3);
                return;
            } else if (i == 41503) {
                String str = coreService.metaMessage;
                m213811F2().PlayerEvent.restorePlayerView().m199277p();
                m196054E4(str, zrv.f205803e.getString(R$string.f48271o2), new x20() { // from class: l.fhd0
                    @Override // p153l.x20
                    public final void call() {
                        this.f99042a.m196052C4();
                    }
                });
                return;
            } else if (i == 41016) {
                o1j0.m165651y(coreService.metaMessage);
                act().m68056e2();
                return;
            }
        }
        o1j0.m165634h(R$string.f47502E9);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m196054E4(String str, String str2, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4460e c4460eM21495B = this.f196919f.dialog().m21503F(str).m21495B(false);
        Objects.requireNonNull(x20Var);
        c4460eM21495B.m21543n0(str2, new bri0(x20Var)).m21567z0();
    }

    /* JADX INFO: renamed from: F4 */
    public void m196055F4() {
        Act act = act();
        if (act == null || act.getShowingDialog() == null) {
            return;
        }
        act.getShowingDialog().dismiss();
    }

    /* JADX INFO: renamed from: G4 */
    public final void m196056G4(Notification<User> notification) {
        if (zrv.m221193k().m203517S6()) {
            String strM196057h4 = m196057h4(notification.m222541f());
            nsh0.m164608j("[live]", "updateFakeId:" + strM196057h4);
            if (TextUtils.isEmpty(strM196057h4) || TextUtils.equals("0", strM196057h4)) {
                return;
            }
            m213811F2().RoomMysteryEventGroup.setRoomFakeId().mo199273j(strM196057h4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().RoomInfoEvent.initRoomInfo().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.wgd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188967a.m196061m4((vgd0) obj);
            }
        }));
        duringCreated(m213811F2().RoomInfoEvent.initSmallWindowRoomInfo().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.hhd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109878a.m196062n4((vgd0) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.mhd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.nhd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141987a.m196063o4((NetworkInfo) obj);
            }
        }));
        this.f179018j = ((ou40) m213810E2()).m168541o1(this.f196919f).subscribe(dhw.m115825d(new y20() { // from class: l.ohd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147433a.m196064p4((LiveControlMessage) obj);
            }
        }));
        duringCreated(this.f179019k).subscribe(new y20() { // from class: l.phd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152424a.m196053D4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public final String m196057h4(User user) {
        if (!NullChecker.m82486a(user) || !NullChecker.m82486a(user.settings) || jyb.m147479J(user.settings.settingGroups)) {
            return "0";
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        return (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.live)) ? settingGroup.live.fakeId : "0";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: i4 */
    public final C22421c<uxj0> m196058i4(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveRecommendInfo bLiveRecommendInfo;
        return LivingNormalApiProvider.m72583Z4(((ou40) m213810E2()).m202194o(), zrv.f205799a.m207631D0(), ((ou40) m213810E2()).mo160117o0(), (!z || (bLiveRecommendInfo = bLiveAbsData.recommendInfo) == null || bLiveRecommendInfo.extInfo == null || !tnt.C20353a.m191967a(((ou40) m213810E2()).mo160117o0())) ? null : bLiveAbsData.recommendInfo.extInfo.toJsonAsQueryString(), NullChecker.m82486a(bLiveAbsData.recommendInfo) ? bLiveAbsData.recommendInfo.category : null, ((ou40) m213810E2()).m202200x()).doOnNext(new y20() { // from class: l.jhd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120966a.m196065q4((BLiveEnvelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.khd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126861a.m196066r4((BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.lhd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m196059j4(final BLiveAbsData bLiveAbsData, final boolean z, final y20<ugd0> y20Var, final y20<ugd0> y20Var2) {
        m196055F4();
        if (z91.f203436b != 0) {
            final long jM174454o = pzi0.m174454o() - z91.f203436b;
            fgt.m125530b(this, "audience_start_live", new y20() { // from class: l.qhd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((Map) obj).put("watch_duration", Long.valueOf(jM174454o));
                }
            });
            z91.f203436b = 0L;
        }
        f179016l = pzi0.m174454o();
        duringCreated(((ou40) m213810E2()).m169224I2(bLiveAbsData)).filter(new qcj() { // from class: l.rhd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163157a.m196067s4((ugd0) obj);
            }
        }).doOnNext(new y20() { // from class: l.shd0
            @Override // p153l.y20
            public final void call(Object obj) {
                uhd0.m196026J3(y20Var, (ugd0) obj);
            }
        }).doOnError(new y20() { // from class: l.thd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174356a.m196068t4((Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.xgd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194180a.m196069u4((ugd0) obj);
            }
        }).flatMap(new qcj() { // from class: l.ygd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f199820a.m196070v4(z, bLiveAbsData, (Notification) obj);
            }
        }).map(new qcj() { // from class: l.zgd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204291a.m196071w4(y20Var2, obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ahd0
            @Override // p153l.y20
            public final void call(Object obj) {
                uhd0.m196048g4((uxj0) obj);
            }
        }, new y20() { // from class: l.bhd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76772a.m196072x4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m196060l4(String str, final int i) {
        m196055F4();
        m213811F2().PlayerEvent.showLoading().mo199273j(Boolean.TRUE);
        duringCreated(LivingNormalApiProvider.m72656h5(str)).subscribe(dhw.m115826e(new y20() { // from class: l.ghd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104116a.m196073y4(i, (ugd0) obj);
            }
        }, new y20() { // from class: l.ihd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114931a.m196074z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m196061m4(vgd0 vgd0Var) {
        m196059j4(vgd0Var.f184017b, vgd0Var.f184018c, vgd0Var.f184019d, vgd0Var.f184016a);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f179018j);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m196062n4(vgd0 vgd0Var) {
        m196049k4(vgd0Var.f184016a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m196063o4(NetworkInfo networkInfo) {
        jsv jsvVarM202193m = ((ou40) m213810E2()).m202193m();
        if (jsvVarM202193m.m146877c()) {
            m196060l4(((ou40) m213810E2()).m202191k(), 2);
        } else if (jsvVarM202193m.m146881g()) {
            m196060l4(((ou40) m213810E2()).m202191k(), 1);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m196064p4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("start")) {
            m196060l4(liveControlMessage.liveId, 2);
        } else if (str.equals("recover")) {
            m196060l4(liveControlMessage.liveId, 1);
        }
        if (wft.m206159b(2)) {
            return;
        }
        nsh0.m164609k(liveControlMessage.toString(), "[live]", "[passivity_exit]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m196065q4(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData;
        BLiveSideBarConfig bLiveSideBarConfig;
        BLive bLiveM122887c = ((ou40) m213810E2()).m118363A2().mo122892l();
        if (bLiveEnvelope == null || (bLiveData = bLiveEnvelope.data) == null || (bLiveSideBarConfig = bLiveData.showSideBarConfig) == null || TextUtils.isEmpty(bLiveSideBarConfig.sideBarState)) {
            ((ou40) m213810E2()).f149051I = "default";
        } else {
            ((ou40) m213810E2()).f149051I = bLiveEnvelope.data.showSideBarConfig.sideBarState;
        }
        ((civ) zrv.m221194l(htd0.f111524f)).m109951C(bLiveEnvelope.data.intlConfig.switchStar);
        i4g0.m138495D("e_live_enter", mo78457R2(), new pf60("enter_rec_category", ((ou40) m213810E2()).m168458I0().m98480c()), new pf60("live_enter_source", ((ou40) m213810E2()).m168449D0()), new pf60("live_inter_source", ((ou40) m213810E2()).mo160117o0()), new pf60("anchorId", bLiveM122887c.anchor.f45267id), new pf60("liveId", bLiveM122887c.f45171id), new pf60("live_status", (TEnum.equals(bLiveM122887c.state, "onlive") || TEnum.equals(bLiveM122887c.state, "suspended")) ? "on" : BLiveOperationTitleShowType.off), new pf60("page_id", mo78457R2()), new pf60("trace_id", Long.valueOf(((ou40) m213810E2()).m168458I0().m98483f())), new pf60("roomId", bLiveM122887c.room.f45267id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m196066r4(BLiveEnvelope bLiveEnvelope) {
        BLive bLiveM122887c = ((ou40) m213810E2()).m118363A2().mo122892l();
        if (bLiveM122887c != null) {
            bLiveM122887c.memberCount += 1.0d;
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ Boolean m196067s4(ugd0 ugd0Var) {
        if (TextUtils.equals(this.f179017i, "live") && u9t.m195112a(ugd0Var.f138293c)) {
            BLive bLiveNew_ = BLive.new_();
            bLiveNew_.f45171id = u9t.m195113b(ugd0Var.f138293c);
            bLiveNew_.liveMode = "officialShow";
            m213811F2().FragProxyEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74209o(bLiveNew_).m74215u(m138867n3()).m74208n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m74207m());
            return Boolean.FALSE;
        }
        if (!TextUtils.equals(this.f179017i, "live") || !u9t.m195115d(ugd0Var.f138293c)) {
            return Boolean.TRUE;
        }
        m213811F2().FragProxyEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74209o(ugd0Var.f138293c).m74215u(m138867n3()).m74208n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m74207m());
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m196068t4(Throwable th) {
        m213811F2().PlayerEvent.showErrorText().mo199273j(zrv.f205803e.getString(R$string.f47568H9));
        m213811F2().PlayerEvent.showLoading().mo199273j(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ C22421c m196069u4(ugd0 ugd0Var) {
        m213811F2().FragProxyEvent.changeRoomData().mo199273j(ugd0Var);
        return duringCreated(((ou40) m213810E2()).m169228M2(ugd0Var));
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ C22421c m196070v4(boolean z, BLiveAbsData bLiveAbsData, Notification notification) {
        m196056G4(notification);
        return duringCreated(m196058i4(z, bLiveAbsData));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ uxj0 m196071w4(y20 y20Var, Object obj) {
        if (y20Var != null) {
            y20Var.call(new ugd0(((ou40) m213810E2()).m168532l0(), ((ou40) m213810E2()).m118363A2().mo122891j(), ((ou40) m213810E2()).m118363A2().mo122892l(), ((ou40) m213810E2()).m168551u0(), ((ou40) m213810E2()).m168460J0()).m195900c(((ou40) m213810E2()).f149051I));
            lej0.INSTANCE.m153909c("enter_live_room", "onGetEnterRoomInfo 修改状态为living");
        }
        ((ou40) m213810E2()).m168485V(((ou40) m213810E2()).m118363A2().mo122892l());
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m196072x4(Throwable th) {
        this.f179019k.m137019l(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m196073y4(int i, ugd0 ugd0Var) {
        m213811F2().FragProxyEvent.changeRoomData().mo199273j(ugd0Var);
        BLive bLiveM122887c = ((ou40) m213810E2()).m118363A2().mo122892l();
        bLiveM122887c.memberCount += 1.0d;
        ((ou40) m213810E2()).m168488W(bLiveM122887c, i);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m196074z4(Throwable th) {
        this.f179019k.m137019l(th);
    }
}
