package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes10.dex */
public class erm0 extends qct<jqm0> implements c6m {

    /* JADX INFO: renamed from: i */
    public kcg0 f95484i;

    public erm0(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m122193M3(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m122205Z3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: d4 */
    private C22421c<BLiveEnvelope> m122208d4(boolean z, BLiveAbsData bLiveAbsData) {
        return VoiceRoomApiProvider.getInRoom(((jqm0) m213810E2()).m202194o(), zrv.f205799a.m207631D0(), ((jqm0) m213810E2()).mo160117o0(), ((jqm0) m213810E2()).m146609b4().focusUserId, ((jqm0) m213810E2()).m202200x()).map(new qcj() { // from class: l.uqm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f180491a.m122221m4((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    private void m122209f4(y20<ugd0> y20Var) {
        m122217c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m122210h4(vgd0 vgd0Var) {
        m122218e4(vgd0Var.f184017b, vgd0Var.f184018c, vgd0Var.f184016a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m122211i4(vgd0 vgd0Var) {
        m122209f4(vgd0Var.f184016a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m122212j4(NetworkInfo networkInfo) {
        jsv jsvVarM202193m = ((jqm0) m213810E2()).m202193m();
        if (jsvVarM202193m.m146877c()) {
            m122219g4(((jqm0) m213810E2()).m202191k(), 2);
        } else if (jsvVarM202193m.m146881g()) {
            m122219g4(((jqm0) m213810E2()).m202191k(), 1);
        }
        m122217c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m122213k4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("start")) {
            m122219g4(liveControlMessage.liveId, 2);
            m213811F2().BottomZoneEvent.refreshAllButton().m199277p();
        } else if (str.equals("recover")) {
            m122219g4(liveControlMessage.liveId, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m122214u4() {
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m122215v4() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: x4 */
    private void m122216x4(String str, String str2, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4460e c4460eM21495B = this.f196919f.dialog().m21503F(str).m21495B(false);
        Objects.requireNonNull(x20Var);
        c4460eM21495B.m21543n0(str2, new bri0(x20Var)).m21567z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().RoomInfoEvent.initRoomInfo().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.kqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128260a.m122210h4((vgd0) obj);
            }
        }));
        duringCreated(m213811F2().RoomInfoEvent.initSmallWindowRoomInfo().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.vqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185373a.m122211i4((vgd0) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.wqm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.xqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195820a.m122212j4((NetworkInfo) obj);
            }
        }));
        this.f95484i = ((jqm0) m213810E2()).m168541o1(this.f196919f).subscribe(dhw.m115829h(new y20() { // from class: l.yqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201228a.m122213k4((LiveControlMessage) obj);
            }
        }));
        duringCreated(((jqm0) m213810E2()).m146602W3()).subscribe(dhw.m115825d(new y20() { // from class: l.zqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205633a.m122229w4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m122217c4() {
        duringCreated(VoiceRoomApiProvider.getInRoom(((jqm0) m213810E2()).m202194o(), zrv.f205799a.m207631D0(), ((jqm0) m213810E2()).mo160117o0(), ((jqm0) m213810E2()).m146609b4().focusUserId, ((jqm0) m213810E2()).m202200x())).subscribe(dhw.m115826e(new y20() { // from class: l.rqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                erm0.m122205Z3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.sqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170186a.m122220l4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public void m122218e4(final BLiveAbsData bLiveAbsData, final boolean z, final y20<ugd0> y20Var) {
        m122230y4();
        duringCreated(((jqm0) m213810E2()).m146605Z3(bLiveAbsData)).flatMap(new qcj() { // from class: l.crm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f83339a.m122222n4(z, bLiveAbsData, (ugd0) obj);
            }
        }).map(new qcj() { // from class: l.drm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f90399a.m122223o4(y20Var, (pf60) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.lqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                erm0.m122193M3((uxj0) obj);
            }
        }, new y20() { // from class: l.mqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138114a.m122224p4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m122219g4(String str, final int i) {
        m122230y4();
        duringCreated(VoiceRoomApiProvider.getLiveInfo(str)).subscribe(dhw.m115826e(new y20() { // from class: l.arm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72970a.m122225q4(i, (ugd0) obj);
            }
        }, new y20() { // from class: l.brm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78036a.m122226r4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m122220l4(Throwable th) {
        ((jqm0) m213810E2()).m146602W3().m137019l(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ BLiveEnvelope m122221m4(BLiveEnvelope bLiveEnvelope) {
        BLiveVoiceRoom bLiveVoiceRoomMo122891j = ((jqm0) m213810E2()).m183409O2().mo122891j();
        if (bLiveVoiceRoomMo122891j != null) {
            bLiveVoiceRoomMo122891j.memberCount += 1.0d;
            bLiveVoiceRoomMo122891j.voiceRoomTagInfo = bLiveEnvelope.data.voiceRoomTagInfo;
        }
        return bLiveEnvelope;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f95484i);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ C22421c m122222n4(boolean z, BLiveAbsData bLiveAbsData, ugd0 ugd0Var) {
        m213811F2().FragProxyEvent.changeRoomData().mo199273j(ugd0Var);
        BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) ugd0Var.f138292b;
        m213811F2().VoiceVirtualLiveEvent.preLoadRoomBg().mo199273j(new cfp0(bLiveVoiceRoom.bgPicType, bLiveVoiceRoom.backgroundUrl, ugd0Var.f138293c.liveMode, ((BLiveVoice) ugd0Var.f138293c).template));
        return C22421c.combineLatest(itv.m142091O(ugd0Var), m122208d4(z, bLiveAbsData), new rcj() { // from class: l.tqm0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((Notification) obj, (BLiveEnvelope) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ uxj0 m122223o4(y20 y20Var, pf60 pf60Var) {
        if (y20Var != null) {
            y20Var.call(new ugd0(((jqm0) m213810E2()).m168532l0(), ((jqm0) m213810E2()).m183409O2().mo122891j(), ((jqm0) m213810E2()).m183409O2().mo122892l(), ((jqm0) m213810E2()).m168551u0(), ((jqm0) m213810E2()).m168460J0()));
        }
        lej0.INSTANCE.m153909c("enter_voice_room", "onGetEnterRoomInfo 修改状态为living");
        ((jqm0) m213810E2()).m168485V(((jqm0) m213810E2()).m183409O2().mo122892l());
        ((civ) zrv.m221194l(htd0.f111524f)).m109951C(((BLiveEnvelope) pf60Var.f152157b).data.intlConfig.switchStar);
        return uxj0.f181467a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m122224p4(Throwable th) {
        ((jqm0) m213810E2()).m146602W3().m137019l(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m122225q4(int i, ugd0 ugd0Var) {
        m213811F2().FragProxyEvent.changeRoomData().mo199273j(ugd0Var);
        BLiveVoice bLiveVoiceMo122892l = ((jqm0) m213810E2()).m183409O2().mo122892l();
        bLiveVoiceMo122892l.memberCount += 1.0d;
        m213811F2().RoomMysteryEventGroup.clearRoomFakeId().m199277p();
        ((jqm0) m213810E2()).m168488W(bLiveVoiceMo122892l, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m122226r4(Throwable th) {
        ((jqm0) m213810E2()).m146602W3().m137019l(th);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m122227s4() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m122228t4() {
        act().m68056e2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m122229w4(Throwable th) {
        th.getMessage();
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165634h(R$string.f47502E9);
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 51014) {
            ydn0.m215253f(this, ((jqm0) m213810E2()).m183423Y2());
            m122216x4(zrv.f205803e.getString(R$string.f48444w), zrv.f205803e.getString(R$string.f48271o2), new x20() { // from class: l.nqm0
                @Override // p153l.x20
                public final void call() {
                    this.f143245a.m122215v4();
                }
            });
            return;
        }
        if (i == 41003 || i == 51003) {
            ydn0.m215253f(this, ((jqm0) m213810E2()).m183423Y2());
            m122216x4(i == 51003 ? coreService.metaMessage : zrv.f205803e.getString(R$string.f47813Sj), zrv.f205803e.getString(R$string.f48271o2), new x20() { // from class: l.oqm0
                @Override // p153l.x20
                public final void call() {
                    this.f148604a.m122227s4();
                }
            });
            return;
        }
        if (i == 41028) {
            act().m68056e2();
            zrv.f205799a.m207685o0(3);
            return;
        }
        if (i == 51020) {
            o1j0.m165651y(coreService.metaMessage);
            act().m68056e2();
            return;
        }
        if (i == 51010) {
            if (!TextUtils.equals(((jqm0) m213810E2()).m168465M0(), AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR) && !TextUtils.equals(((jqm0) m213810E2()).m168465M0(), AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR_SHOW_PACKAGE)) {
                m122216x4(zrv.f205803e.getString(R$string.f47556Gj), zrv.f205803e.getString(R$string.f48271o2), new x20() { // from class: l.pqm0
                    @Override // p153l.x20
                    public final void call() {
                        this.f153680a.m122228t4();
                    }
                });
                return;
            }
            r1j0.m179419f(R$string.f47578Hj);
            zrv.f205799a.m207703x0(this.f196919f);
            act().m68056e2();
            return;
        }
        if (i == 51011) {
            String str = coreService.metaMessage;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m122216x4(str, zrv.f205803e.getString(R$string.f48271o2), new x20() { // from class: l.qqm0
                @Override // p153l.x20
                public final void call() {
                    this.f159018a.m122214u4();
                }
            });
            return;
        }
        if (i == 51016) {
            o1j0.m165651y(coreService.metaMessage);
            act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m122230y4() {
        Act act = act();
        if (act == null || act.getShowingDialog() == null) {
            return;
        }
        act.getShowingDialog().dismiss();
    }
}
