package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class kym0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public kcg0 f129329i;

    /* JADX INFO: renamed from: j */
    public final ztk0 f129330j;

    public kym0(dum dumVar, ztk0 ztk0Var) {
        super(dumVar);
        this.f129330j = ztk0Var;
    }

    /* JADX INFO: renamed from: A4 */
    private void m151997A4() {
        this.f129329i = act().lifecycle().filter(new qcj() { // from class: l.oxm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((C4470c) obj));
            }
        }).map(new qcj() { // from class: l.pxm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj).f16274a);
            }
        }).distinctUntilChanged().doOnNext(new y20() { // from class: l.qxm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160063a.m152024C4((Boolean) obj);
            }
        }).filter(new qcj() { // from class: l.rxm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165359a.m152034p4((Boolean) obj);
            }
        }).filter(new qcj() { // from class: l.sxm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f171149a.m152035q4((Boolean) obj);
            }
        }).filter(new qcj() { // from class: l.txm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f176582a.m152031m4((Boolean) obj);
            }
        }).filter(new qcj() { // from class: l.uxm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f181483a.m152032n4((Boolean) obj);
            }
        }).filter(new qcj() { // from class: l.wxm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f191503a.m152033o4((Boolean) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.xxm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196666a.m151998B4(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public void m151998B4(boolean z) {
        if (((rwn0) m213810E2()).m183437k3()) {
            return;
        }
        BLiveVoiceCall bLiveVoiceCallM152022i4 = m152022i4();
        if (!z) {
            C22421c<T> c22421cDuringCreated = duringCreated(VCallApiProvider.deputyGoAway(bLiveVoiceCallM152022i4.f45333id));
            ztk0 ztk0Var = this.f129330j;
            Objects.requireNonNull(ztk0Var);
            c22421cDuringCreated.subscribe(dhw.m115826e(new cuk0(ztk0Var), new y20() { // from class: l.aym0
                @Override // p153l.y20
                public final void call(Object obj) {
                    kym0.m152020f4((Throwable) obj);
                }
            }));
            return;
        }
        m152027h4(new y20() { // from class: l.yxm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201994a.m152043z4((ado0) obj);
            }
        });
        C22421c<T> c22421cDuringCreated2 = duringCreated(VCallApiProvider.deputyGoBack(bLiveVoiceCallM152022i4.f45333id));
        ztk0 ztk0Var2 = this.f129330j;
        Objects.requireNonNull(ztk0Var2);
        c22421cDuringCreated2.subscribe(dhw.m115826e(new cuk0(ztk0Var2), new y20() { // from class: l.zxm0
            @Override // p153l.y20
            public final void call(Object obj) {
                kym0.m152016b4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m152016b4(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m152020f4(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    private BLiveVoiceCall m152022i4() {
        return ((rwn0) m213810E2()).m183423Y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m152023s4(vxj0 vxj0Var) {
        m152042y4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public final void m152024C4(Boolean bool) {
        if (((rwn0) m213810E2()).m183434i3() || !guk0.m132329h(((rwn0) m213810E2()).m183423Y2()) || ((rwn0) m213810E2()).m183437k3()) {
            return;
        }
        bbo0.m103305a(!bool.booleanValue() || ((rwn0) m213810E2()).m183423Y2().mutedByAnchor || ((rwn0) m213810E2()).m183423Y2().mutedByUser, this);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m152025D4(bzm0 bzm0Var) {
        C22421c<T> c22421cDuringCreated = duringCreated(VCallApiProvider.setMuteDeputy(bzm0Var.f79147a, bzm0Var.f79152f, m213815L2() || "voice-manager".equals(bzm0Var.f79153g)));
        ztk0 ztk0Var = this.f129330j;
        Objects.requireNonNull(ztk0Var);
        c22421cDuringCreated.subscribe(dhw.m115826e(new cuk0(ztk0Var), new r5k()));
    }

    /* JADX INFO: renamed from: E4 */
    public final void m152026E4(LongLinkVirtualVoice.VoiceStreamBizTypeMessage voiceStreamBizTypeMessage) {
        fhw.m125605a("[voice][call]", "updateStreamBizType:" + voiceStreamBizTypeMessage.getBizType());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m151997A4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public void m152027h4(y20<ado0> y20Var) {
        if (((rwn0) m213810E2()).mo183435j() == null || TextUtils.isEmpty(((rwn0) m213810E2()).m202191k())) {
            return;
        }
        duringCreated(m152028j4()).subscribe(dhw.m115826e(y20Var, new r5k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final C22421c<ado0> m152028j4() {
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        return VCallApiProvider.getRoomMembers(((rwn0) m213810E2()).m202194o(), ((rwn0) m213810E2()).mo168489W0(), ((rwn0) m213810E2()).m202191k(), (bLiveVoiceMo183435j == null || bLiveVoiceMo183435j.isIncomerArea()) ? false : true, ((rwn0) m213810E2()).mo183435j().callNumbers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final q54 m152029k4(x34 x34Var) {
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(x34Var.f192218c);
        h64 h64VarM136875n = ((rwn0) m213810E2()).m183411P2().m136875n(x34Var.f192218c);
        if (bLiveVoiceCallM136873l == null || h64VarM136875n == null) {
            return null;
        }
        return new q54(coj.m111661c(h64VarM136875n, p54.m170592b(bLiveVoiceCallM136873l.f45333id, TextUtils.equals(h64VarM136875n.f107997a, ((rwn0) m213810E2()).m168532l0().f56859id) ? "gift-audience-none-voiceLiveMain" : "gift-audience-none-voiceLiveVice", bLiveVoiceCallM136873l.position)), guk0.m132324c(bLiveVoiceCallM136873l));
    }

    /* JADX INFO: renamed from: l4 */
    public void m152030l4(BLiveVoiceCall bLiveVoiceCall) {
        if (guk0.m132329h(bLiveVoiceCall)) {
            bbo0.m103305a(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser, this);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ Boolean m152031m4(Boolean bool) {
        return Boolean.valueOf(!"hung-up".equals(m152022i4().state));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f129329i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Boolean m152032n4(Boolean bool) {
        return Boolean.valueOf(((rwn0) m213810E2()).mo183435j() != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ Boolean m152033o4(Boolean bool) {
        return Boolean.valueOf(!((rwn0) m213810E2()).m183429e3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ Boolean m152034p4(Boolean bool) {
        return ((rwn0) m213810E2()).m183428d3();
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ Boolean m152035q4(Boolean bool) {
        return Boolean.valueOf(!TextUtils.isEmpty(m152022i4().f45333id));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ C22421c m152036r4(NetworkInfo networkInfo) {
        return m152028j4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m113231o2(ConnectivityReceiver.m82473m(), false).skip(1).filter(new qcj() { // from class: l.kxm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).flatMap(new qcj() { // from class: l.fym0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101400a.m152036r4((NetworkInfo) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.gym0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107076a.m152041x4((ado0) obj);
            }
        }, new r5k()));
        m138860d3(x34.class, new qcj() { // from class: l.hym0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112143a.m152029k4((x34) obj);
            }
        });
        duringCreated(m213811F2().VoiceCallEvent.callMuteEvent().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.iym0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117618a.m152025D4((bzm0) obj);
            }
        }));
        m113231o2(((rwn0) m213810E2()).m183424Z2(), false).subscribe(dhw.m115825d(new y20() { // from class: l.jym0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123179a.m152030l4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(m213811F2().VoiceCallEvent.updateDeputyEvent().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.lxm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133969a.m152023s4((vxj0) obj);
            }
        }));
        if (!wft.m206159b(3)) {
            m138858H3(((rwn0) m213810E2()).m168521h2(zrv.m221193k().m203612e6(), TimeUnit.SECONDS).filter(new qcj() { // from class: l.mxm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f139256a.m152037t4((Long) obj);
                }
            })).subscribe(dhw.m115829h(new y20() { // from class: l.nxm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144195a.m152038u4((Long) obj);
                }
            }));
        }
        duringCreated(((rwn0) m213810E2()).m168545q1().f71701c0).subscribe(dhw.m115829h(new y20() { // from class: l.vxm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186283a.m152039v4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        m113231o2(((rwn0) m213810E2()).m168545q1().m98315p1(), false).subscribe(dhw.m115829h(new y20() { // from class: l.cym0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84392a.m152026E4((LongLinkVirtualVoice.VoiceStreamBizTypeMessage) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().f71668S).filter(new qcj() { // from class: l.dym0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("callEffect".equals(((x8p0) obj).f192864e));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.eym0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96454a.m152040w4((x8p0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Boolean m152037t4(Long l2) {
        return Boolean.valueOf(!((rwn0) m213810E2()).m183432g3());
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m152038u4(Long l2) {
        m152042y4();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m152039v4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        m152042y4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final void m152040w4(x8p0 x8p0Var) {
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(x8p0Var.f192862c);
        if (bLiveVoiceCallM136873l != null) {
            bLiveVoiceCallM136873l.callEffect = x8p0Var.m209750a();
            ((rwn0) m213810E2()).m183411P2().m136860C(bLiveVoiceCallM136873l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m152041x4(ado0 ado0Var) {
        this.f129330j.m221560l4(ado0Var);
        this.f129330j.m221555e4(((rwn0) m213810E2()).m183423Y2());
    }

    /* JADX INFO: renamed from: y4 */
    public final void m152042y4() {
        C22421c<T> c22421cDuringCreated = duringCreated(m152028j4());
        final ztk0 ztk0Var = this.f129330j;
        Objects.requireNonNull(ztk0Var);
        c22421cDuringCreated.subscribe(dhw.m115829h(new y20() { // from class: l.bym0
            @Override // p153l.y20
            public final void call(Object obj) {
                ztk0Var.m221560l4((ado0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m152043z4(ado0 ado0Var) {
        this.f129330j.m221560l4(ado0Var);
        this.f129330j.mo169122o4(((rwn0) m213810E2()).m183423Y2());
    }
}
