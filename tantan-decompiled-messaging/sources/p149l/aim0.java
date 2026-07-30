package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class aim0 extends pat<fhm0> implements l3m {

    /* JADX INFO: renamed from: i */
    public c4g0 f70013i;

    public aim0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m96833M3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m96845Z3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: d4 */
    private C22306c<BLiveEnvelope> m96848d4(boolean z, BLiveAbsData bLiveAbsData) {
        return VoiceRoomApiProvider.getInRoom(((fhm0) m206027E2()).m149818o(), ypv.f199493a.m199309D0(), ((fhm0) m206027E2()).mo132155o0(), ((fhm0) m206027E2()).m121381b4().focusUserId, ((fhm0) m206027E2()).m149826x()).map(new w9j() { // from class: l.qhm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154477a.m96861m4((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    private void m96849f4(e30<r8d0> e30Var) {
        m96857c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m96850h4(s8d0 s8d0Var) {
        m96858e4(s8d0Var.f163041b, s8d0Var.f163042c, s8d0Var.f163040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m96851i4(s8d0 s8d0Var) {
        m96849f4(s8d0Var.f163040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m96852j4(NetworkInfo networkInfo) {
        iqv iqvVarM149816m = ((fhm0) m206027E2()).m149816m();
        if (iqvVarM149816m.m137796c()) {
            m96859g4(((fhm0) m206027E2()).m149814k(), 2);
        } else if (iqvVarM149816m.m137800g()) {
            m96859g4(((fhm0) m206027E2()).m149814k(), 1);
        }
        m96857c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m96853k4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("start")) {
            m96859g4(liveControlMessage.liveId, 2);
            m206028F2().BottomZoneEvent.refreshAllButton().m172467p();
        } else if (str.equals("recover")) {
            m96859g4(liveControlMessage.liveId, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m96854u4() {
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m96855v4() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: x4 */
    private void m96856x4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4309e c4309eM20496B = this.f188513f.dialog().m20504F(str).m20496B(false);
        Objects.requireNonNull(d30Var);
        c4309eM20496B.m20544n0(str2, new bii0(d30Var)).m20568z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().RoomInfoEvent.initRoomInfo().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ghm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102670a.m96850h4((s8d0) obj);
            }
        }));
        duringCreated(m206028F2().RoomInfoEvent.initSmallWindowRoomInfo().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.rhm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159449a.m96851i4((s8d0) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.shm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.thm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170266a.m96852j4((NetworkInfo) obj);
            }
        }));
        this.f70013i = ((fhm0) m206027E2()).m132156o1(this.f188513f).subscribe(ffw.m121197h(new e30() { // from class: l.uhm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176580a.m96853k4((LiveControlMessage) obj);
            }
        }));
        duringCreated(((fhm0) m206027E2()).m121376W3()).subscribe(ffw.m121193d(new e30() { // from class: l.vhm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181516a.m96869w4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m96857c4() {
        duringCreated(VoiceRoomApiProvider.getInRoom(((fhm0) m206027E2()).m149818o(), ypv.f199493a.m199309D0(), ((fhm0) m206027E2()).mo132155o0(), ((fhm0) m206027E2()).m121381b4().focusUserId, ((fhm0) m206027E2()).m149826x())).subscribe(ffw.m121194e(new e30() { // from class: l.nhm0
            @Override // p149l.e30
            public final void call(Object obj) {
                aim0.m96845Z3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.ohm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144026a.m96860l4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public void m96858e4(final BLiveAbsData bLiveAbsData, final boolean z, final e30<r8d0> e30Var) {
        m96870y4();
        duringCreated(((fhm0) m206027E2()).m121379Z3(bLiveAbsData)).flatMap(new w9j() { // from class: l.yhm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198371a.m96862n4(z, bLiveAbsData, (r8d0) obj);
            }
        }).map(new w9j() { // from class: l.zhm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203195a.m96863o4(e30Var, (j760) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.hhm0
            @Override // p149l.e30
            public final void call(Object obj) {
                aim0.m96833M3((roj0) obj);
            }
        }, new e30() { // from class: l.ihm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113318a.m96864p4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m96859g4(String str, final int i) {
        m96870y4();
        duringCreated(VoiceRoomApiProvider.getLiveInfo(str)).subscribe(ffw.m121194e(new e30() { // from class: l.whm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186445a.m96865q4(i, (r8d0) obj);
            }
        }, new e30() { // from class: l.xhm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192898a.m96866r4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m96860l4(Throwable th) {
        ((fhm0) m206027E2()).m121376W3().m132487l(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ BLiveEnvelope m96861m4(BLiveEnvelope bLiveEnvelope) {
        BLiveVoiceRoom bLiveVoiceRoomMo165469j = ((fhm0) m206027E2()).m160247O2().mo165469j();
        if (bLiveVoiceRoomMo165469j != null) {
            bLiveVoiceRoomMo165469j.memberCount += 1.0d;
            bLiveVoiceRoomMo165469j.voiceRoomTagInfo = bLiveEnvelope.data.voiceRoomTagInfo;
        }
        return bLiveEnvelope;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f70013i);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ C22306c m96862n4(boolean z, BLiveAbsData bLiveAbsData, r8d0 r8d0Var) {
        m206028F2().FragProxyEvent.changeRoomData().mo172463j(r8d0Var);
        BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) r8d0Var.f187609b;
        m206028F2().VoiceVirtualLiveEvent.preLoadRoomBg().mo172463j(new y5p0(bLiveVoiceRoom.bgPicType, bLiveVoiceRoom.backgroundUrl, r8d0Var.f187610c.liveMode, ((BLiveVoice) r8d0Var.f187610c).template));
        return C22306c.combineLatest(hrv.m132732O(r8d0Var), m96848d4(z, bLiveAbsData), new x9j() { // from class: l.phm0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((Notification) obj, (BLiveEnvelope) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ roj0 m96863o4(e30 e30Var, j760 j760Var) {
        if (e30Var != null) {
            e30Var.call(new r8d0(((fhm0) m206027E2()).m132146l0(), ((fhm0) m206027E2()).m160247O2().mo165469j(), ((fhm0) m206027E2()).m160247O2().mo165470l(), ((fhm0) m206027E2()).m132167u0(), ((fhm0) m206027E2()).m132071J0()));
        }
        h5j0.INSTANCE.m129404c("enter_voice_room", "onGetEnterRoomInfo 修改状态为living");
        ((fhm0) m206027E2()).m132099V(((fhm0) m206027E2()).m160247O2().mo165470l());
        ((bgv) ypv.m215673l(fld0.f98151f)).m101715C(((BLiveEnvelope) j760Var.f116565b).data.intlConfig.switchStar);
        return roj0.f160388a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m96864p4(Throwable th) {
        ((fhm0) m206027E2()).m121376W3().m132487l(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m96865q4(int i, r8d0 r8d0Var) {
        m206028F2().FragProxyEvent.changeRoomData().mo172463j(r8d0Var);
        BLiveVoice bLiveVoiceMo165470l = ((fhm0) m206027E2()).m160247O2().mo165470l();
        bLiveVoiceMo165470l.memberCount += 1.0d;
        m206028F2().RoomMysteryEventGroup.clearRoomFakeId().m172467p();
        ((fhm0) m206027E2()).m132102W(bLiveVoiceMo165470l, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m96866r4(Throwable th) {
        ((fhm0) m206027E2()).m121376W3().m132487l(th);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m96867s4() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m96868t4() {
        act().m66873d2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m96869w4(Throwable th) {
        th.getMessage();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151578h(R$string.f46654E9);
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 51014) {
            u4n0.m191747f(this, ((fhm0) m206027E2()).m160261Y2());
            m96856x4(ypv.f199497e.getString(R$string.f47596w), ypv.f199497e.getString(R$string.f47423o2), new d30() { // from class: l.jhm0
                @Override // p149l.d30
                public final void call() {
                    this.f117961a.m96855v4();
                }
            });
            return;
        }
        if (i == 41003 || i == 51003) {
            u4n0.m191747f(this, ((fhm0) m206027E2()).m160261Y2());
            m96856x4(i == 51003 ? coreService.metaMessage : ypv.f199497e.getString(R$string.f46965Sj), ypv.f199497e.getString(R$string.f47423o2), new d30() { // from class: l.khm0
                @Override // p149l.d30
                public final void call() {
                    this.f123190a.m96867s4();
                }
            });
            return;
        }
        if (i == 41028) {
            act().m66873d2();
            ypv.f199493a.m199363o0(3);
            return;
        }
        if (i == 51020) {
            lsi0.m151595y(coreService.metaMessage);
            act().m66873d2();
            return;
        }
        if (i == 51010) {
            if (!TextUtils.equals(((fhm0) m206027E2()).m132077M0(), AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR) && !TextUtils.equals(((fhm0) m206027E2()).m132077M0(), AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR_SHOW_PACKAGE)) {
                m96856x4(ypv.f199497e.getString(R$string.f46708Gj), ypv.f199497e.getString(R$string.f47423o2), new d30() { // from class: l.lhm0
                    @Override // p149l.d30
                    public final void call() {
                        this.f128120a.m96868t4();
                    }
                });
                return;
            }
            osi0.m165782f(R$string.f46730Hj);
            ypv.f199493a.m199381x0(this.f188513f);
            act().m66873d2();
            return;
        }
        if (i == 51011) {
            String str = coreService.metaMessage;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m96856x4(str, ypv.f199497e.getString(R$string.f47423o2), new d30() { // from class: l.mhm0
                @Override // p149l.d30
                public final void call() {
                    this.f133830a.m96854u4();
                }
            });
            return;
        }
        if (i == 51016) {
            lsi0.m151595y(coreService.metaMessage);
            act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m96870y4() {
        Act act = act();
        if (act == null || act.getShowingDialog() == null) {
            return;
        }
        act.getShowingDialog().dismiss();
    }
}
