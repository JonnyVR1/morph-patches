package p009l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import l.bsm;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.fhm0;
import l.h5j0;
import l.hrv;
import l.iqv;
import l.j760;
import l.l3m;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.pat;
import l.r8d0;
import l.roj0;
import l.s8d0;
import l.u4n0;
import l.vwb;
import l.w9j;
import l.wq2;
import l.wxs;
import l.x9j;
import l.y5p0;
import org.jetbrains.annotations.NotNull;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class aim0 extends pat<fhm0> implements l3m {

    /* JADX INFO: renamed from: i */
    public c4g0 f9535i;

    public aim0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m11453M3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m11465Z3(BLiveEnvelope bLiveEnvelope) {
    }

    @NotNull
    /* JADX INFO: renamed from: d4 */
    private c<BLiveEnvelope> m11468d4(boolean z, BLiveAbsData bLiveAbsData) {
        return VoiceRoomApiProvider.getInRoom(E2().o(), ypv.f23196a.m23619D0(), E2().o0(), E2().b4().focusUserId, E2().x()).map(new w9j() { // from class: l.qhm0
            public final Object call(Object obj) {
                return this.f19261a.m11482m4((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    private void m11469f4(e30<r8d0> e30Var) {
        m11478c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m11470h4(s8d0 s8d0Var) {
        m11479e4(s8d0Var.b, s8d0Var.c, s8d0Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m11471i4(s8d0 s8d0Var) {
        m11469f4(s8d0Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m11472j4(NetworkInfo networkInfo) {
        iqv iqvVarM = E2().m();
        if (iqvVarM.c()) {
            m11480g4(E2().k(), 2);
        } else if (iqvVarM.g()) {
            m11480g4(E2().k(), 1);
        }
        m11478c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m11473k4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("start")) {
            m11480g4(liveControlMessage.liveId, 2);
            F2().BottomZoneEvent.refreshAllButton().p();
        } else if (str.equals("recover")) {
            m11480g4(liveControlMessage.liveId, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m11474u4() {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m11475v4() {
        act().finish();
    }

    /* JADX INFO: renamed from: x4 */
    private void m11476x4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.e eVarB = ((wxs) this).f.dialog().F(str).B(false);
        Objects.requireNonNull(d30Var);
        eVarB.n0(str2, new bii0(d30Var)).z0();
    }

    /* JADX INFO: renamed from: T */
    public void m11477T() {
        super/*l.k4t*/.T();
        duringCreated((c) F2().RoomInfoEvent.initRoomInfo().g()).subscribe(ffw.h(new e30() { // from class: l.ghm0
            public final void call(Object obj) {
                this.f13574a.m11470h4((s8d0) obj);
            }
        }));
        duringCreated((c) F2().RoomInfoEvent.initSmallWindowRoomInfo().g()).subscribe(ffw.h(new e30() { // from class: l.rhm0
            public final void call(Object obj) {
                this.f19838a.m11471i4((s8d0) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.shm0
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(ffw.h(new e30() { // from class: l.thm0
            public final void call(Object obj) {
                this.f20700a.m11472j4((NetworkInfo) obj);
            }
        }));
        this.f9535i = E2().o1(((wxs) this).f).subscribe(ffw.h(new e30() { // from class: l.uhm0
            public final void call(Object obj) {
                this.f21194a.m11473k4((LiveControlMessage) obj);
            }
        }));
        duringCreated(E2().W3()).subscribe(ffw.d(new e30() { // from class: l.vhm0
            public final void call(Object obj) {
                this.f21584a.m11491w4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m11478c4() {
        duringCreated(VoiceRoomApiProvider.getInRoom(E2().o(), ypv.f23196a.m23619D0(), E2().o0(), E2().b4().focusUserId, E2().x())).subscribe(ffw.e(new e30() { // from class: l.nhm0
            public final void call(Object obj) {
                aim0.m11465Z3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.ohm0
            public final void call(Object obj) {
                this.f18049a.m11481l4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public void m11479e4(final BLiveAbsData bLiveAbsData, final boolean z, final e30<r8d0> e30Var) {
        m11492y4();
        duringCreated(E2().Z3(bLiveAbsData)).flatMap(new w9j() { // from class: l.yhm0
            public final Object call(Object obj) {
                return this.f23065a.m11484n4(z, bLiveAbsData, (r8d0) obj);
            }
        }).map(new w9j() { // from class: l.zhm0
            public final Object call(Object obj) {
                return this.f23680a.m11485o4(e30Var, (j760) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.hhm0
            public final void call(Object obj) {
                aim0.m11453M3((roj0) obj);
            }
        }, new e30() { // from class: l.ihm0
            public final void call(Object obj) {
                this.f14640a.m11486p4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m11480g4(String str, final int i) {
        m11492y4();
        duringCreated(VoiceRoomApiProvider.getLiveInfo(str)).subscribe(ffw.e(new e30() { // from class: l.whm0
            public final void call(Object obj) {
                this.f22117a.m11487q4(i, (r8d0) obj);
            }
        }, new e30() { // from class: l.xhm0
            public final void call(Object obj) {
                this.f22613a.m11488r4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m11481l4(Throwable th) {
        E2().W3().onNext(th);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ BLiveEnvelope m11482m4(BLiveEnvelope bLiveEnvelope) {
        BLiveVoiceRoom bLiveVoiceRoomE = E2().O2().e();
        if (bLiveVoiceRoomE != null) {
            bLiveVoiceRoomE.memberCount += 1.0d;
            bLiveVoiceRoomE.voiceRoomTagInfo = bLiveEnvelope.data.voiceRoomTagInfo;
        }
        return bLiveEnvelope;
    }

    /* JADX INFO: renamed from: n */
    public void m11483n() {
        super/*l.h4t*/.n();
        mkd0.z(this.f9535i);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ c m11484n4(boolean z, BLiveAbsData bLiveAbsData, r8d0 r8d0Var) {
        F2().FragProxyEvent.changeRoomData().j(r8d0Var);
        BLiveVoiceRoom bLiveVoiceRoom = ((wq2) r8d0Var).b;
        F2().VoiceVirtualLiveEvent.preLoadRoomBg().j(new y5p0(bLiveVoiceRoom.bgPicType, bLiveVoiceRoom.backgroundUrl, ((wq2) r8d0Var).c.liveMode, ((wq2) r8d0Var).c.template));
        return c.combineLatest(hrv.O(r8d0Var), m11468d4(z, bLiveAbsData), new x9j() { // from class: l.phm0
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((Notification) obj, (BLiveEnvelope) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ roj0 m11485o4(e30 e30Var, j760 j760Var) {
        if (e30Var != null) {
            e30Var.call(new r8d0(E2().l0(), E2().O2().e(), E2().O2().c(), E2().u0(), E2().J0()));
        }
        h5j0.INSTANCE.c("enter_voice_room", "onGetEnterRoomInfo 修改状态为living");
        E2().V(E2().O2().c());
        ((bgv) ypv.m25491l(fld0.f13080f)).m11999C(((BLiveEnvelope) j760Var.b).data.intlConfig.switchStar);
        return roj0.a;
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m11486p4(Throwable th) {
        E2().W3().onNext(th);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m11487q4(int i, r8d0 r8d0Var) {
        F2().FragProxyEvent.changeRoomData().j(r8d0Var);
        BLiveVoice bLiveVoiceC = E2().O2().c();
        ((BLiveAbsData) bLiveVoiceC).memberCount += 1.0d;
        F2().RoomMysteryEventGroup.clearRoomFakeId().p();
        E2().W(bLiveVoiceC, i);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m11488r4(Throwable th) {
        E2().W3().onNext(th);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m11489s4() {
        act().finish();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m11490t4() {
        act().finish();
    }

    /* JADX INFO: renamed from: w4 */
    public void m11491w4(Throwable th) {
        th.getMessage();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.h(R.string.E9);
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 51014) {
            u4n0.f(this, E2().Y2());
            m11476x4(ypv.f23200e.getString(R.string.w), ypv.f23200e.getString(R.string.o2), new d30() { // from class: l.jhm0
                public final void call() {
                    this.f15170a.m11475v4();
                }
            });
            return;
        }
        if (i == 41003 || i == 51003) {
            u4n0.f(this, E2().Y2());
            m11476x4(i == 51003 ? coreService.metaMessage : ypv.f23200e.getString(R.string.Sj), ypv.f23200e.getString(R.string.o2), new d30() { // from class: l.khm0
                public final void call() {
                    this.f15690a.m11489s4();
                }
            });
            return;
        }
        if (i == 41028) {
            act().finish();
            ypv.f23196a.m23673o0(3);
            return;
        }
        if (i == 51020) {
            lsi0.y(coreService.metaMessage);
            act().finish();
            return;
        }
        if (i == 51010) {
            if (!TextUtils.equals(E2().M0(), "chatAssistantFixAnchor") && !TextUtils.equals(E2().M0(), "chatAssistantFixAnchorShowPackage")) {
                m11476x4(ypv.f23200e.getString(R.string.Gj), ypv.f23200e.getString(R.string.o2), new d30() { // from class: l.lhm0
                    public final void call() {
                        this.f16163a.m11490t4();
                    }
                });
                return;
            }
            osi0.f(R.string.Hj);
            ypv.f23196a.m23691x0(((wxs) this).f);
            act().finish();
            return;
        }
        if (i == 51011) {
            String str = coreService.metaMessage;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m11476x4(str, ypv.f23200e.getString(R.string.o2), new d30() { // from class: l.mhm0
                public final void call() {
                    this.f16924a.m11474u4();
                }
            });
            return;
        }
        if (i == 51016) {
            lsi0.y(coreService.metaMessage);
            act().finish();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m11492y4() {
        Act act = act();
        if (act == null || act.getShowingDialog() == null) {
            return;
        }
        act.getShowingDialog().dismiss();
    }
}
