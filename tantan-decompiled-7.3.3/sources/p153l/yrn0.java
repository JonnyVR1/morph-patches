package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class yrn0 extends qct<rwn0> implements yvl {

    /* JADX INFO: renamed from: i */
    public msn0 f201335i;

    /* JADX INFO: renamed from: j */
    public final float f201336j;

    /* JADX INFO: renamed from: k */
    public float f201337k;

    /* JADX INFO: renamed from: l */
    public final float f201338l;

    /* JADX INFO: renamed from: m */
    public final float f201339m;

    public yrn0(dum<?> dumVar) {
        super(dumVar);
        this.f201336j = -1.0f;
        this.f201337k = -1.0f;
        this.f201338l = 4.0f;
        this.f201339m = 1.0f;
        m217202i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public void m217171A4(int i) {
        this.f201335i.m159871V(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public void m217172B4(Boolean bool) {
        this.f201335i.m159872W(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public void m217173C4(Boolean bool) {
        this.f201335i.m159874Y(bool);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m217179O3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D4 */
    public final void m217197D4() {
        duringCreated(((rwn0) m213810E2()).m183424Z2()).filter(new p3r()).distinctUntilChanged(new qcj() { // from class: l.nrn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).state;
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.orn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148728a.m217205l4((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final void m217198E4() {
        String strM159884x = this.f201335i.m159884x();
        if (TextUtils.isEmpty(strM159884x)) {
            return;
        }
        duringCreated(rqn0.m182669l(((rwn0) m213810E2()).m202191k(), strM159884x, qd80.f156676k)).subscribe(dhw.m115826e(new y20() { // from class: l.prn0
            @Override // p153l.y20
            public final void call(Object obj) {
                yrn0.m217179O3((BLiveEnvelope) obj);
            }
        }, new wnt()));
    }

    @Override // p153l.yvl
    /* JADX INFO: renamed from: L1 */
    public <T> C22421c<T> mo217199L1(C22421c<T> c22421c) {
        return m113231o2(c22421c, false);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        v3f.C20736d<dn50, C22421c<dn50>> c20736dRegisterPlayListener = m213811F2().VoiceKtvEvent.registerPlayListener();
        final msn0 msn0Var = this.f201335i;
        Objects.requireNonNull(msn0Var);
        m138863h3(c20736dRegisterPlayListener, new y20() { // from class: l.lrn0
            @Override // p153l.y20
            public final void call(Object obj) {
                msn0Var.m159868S((dn50) obj);
            }
        });
        v3f.C20736d<dn50, C22421c<dn50>> c20736dRemovePlayListener = m213811F2().VoiceKtvEvent.removePlayListener();
        final msn0 msn0Var2 = this.f201335i;
        Objects.requireNonNull(msn0Var2);
        m138863h3(c20736dRemovePlayListener, new y20() { // from class: l.mrn0
            @Override // p153l.y20
            public final void call(Object obj) {
                msn0Var2.m159869T((dn50) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.yvl
    /* JADX INFO: renamed from: Y1 */
    public rwn0 mo217200Y1() {
        return (rwn0) m213810E2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m217201h4(Float f) {
        if (!guk0.m132328g(((rwn0) m213810E2()).m183423Y2())) {
            this.f201335i.m159877o(f);
        }
        this.f201337k = f.floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m217202i4() {
        if (((rwn0) m213810E2()).m183419U2() == null) {
            this.f201335i = new msn0(this);
            ((rwn0) m213810E2()).m183410O3(this.f201335i);
        } else {
            msn0 msn0VarM183419U2 = ((rwn0) m213810E2()).m183419U2();
            this.f201335i = msn0VarM183419U2;
            msn0VarM183419U2.m159873X(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m217203j4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        if (((rwn0) m213810E2()).f165194Q) {
            this.f201335i.m159859I(bLiveVoiceKtvGameInfo, "http");
        } else if (BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvGameInfo.playInfo) && TextUtils.equals(bLiveVoiceKtvGameInfo.playInfo.userId, zrv.f205799a.m207631D0())) {
            rqn0.m182670m(((rwn0) m213810E2()).m202191k(), bLiveVoiceKtvGameInfo.playInfo.orderId, qd80.f156679n);
        } else {
            this.f201335i.m159859I(bLiveVoiceKtvGameInfo, "http");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m217204k4() {
        boolean zM132328g = guk0.m132328g(((rwn0) m213810E2()).m183423Y2());
        this.f201337k = zM132328g ? -1.0f : 4.0f;
        this.f201335i.m159877o(Float.valueOf(zM132328g ? 0.0f : 4.0f));
        this.f201335i.m159876n(Float.valueOf(1.0f));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m217205l4(BLiveVoiceCall bLiveVoiceCall) {
        m217204k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ C22421c m217206m4(C4470c c4470c) {
        return duringCreated(rqn0.m182665h(((rwn0) m213810E2()).m202191k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f201335i.m159880r(!((rwn0) m213810E2()).m183437k3());
        if (((rwn0) m213810E2()).m168456H0() == null || ((rwn0) m213810E2()).m168456H0().mo107434e() == null) {
            return;
        }
        ((rwn0) m213810E2()).m168456H0().mo107434e().mo170511Q(null);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Integer m217207n4(na1 na1Var) {
        return Integer.valueOf(this.f201335i.m159882v());
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m217208o4(vxj0 vxj0Var) {
        this.f201335i.m159867R();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m217209p4(vxj0 vxj0Var) {
        this.f201335i.m159870U();
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m217210q4(vxj0 vxj0Var) {
        m217198E4();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Float m217211r4(Boolean bool) {
        if (bool.booleanValue()) {
            return Float.valueOf(0.0f);
        }
        if (this.f201337k < 0.0f) {
            this.f201337k = 4.0f;
        }
        return Float.valueOf(this.f201337k);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m217212s4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        this.f201335i.m159859I(bLiveVoiceKtvGameInfo, "http");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (!((rwn0) m213810E2()).f165194Q) {
            if (!guk0.m132329h(((rwn0) m213810E2()).m183423Y2())) {
                m217197D4();
            } else if (guk0.m132328g(((rwn0) m213810E2()).m183423Y2())) {
                this.f201337k = -1.0f;
            } else {
                m217204k4();
            }
            this.f201335i.m159876n(Float.valueOf(1.0f));
        } else if (!guk0.m132329h(((rwn0) m213810E2()).m183423Y2())) {
            m217197D4();
        } else if (guk0.m132328g(((rwn0) m213810E2()).m183423Y2())) {
            this.f201337k = -1.0f;
        } else {
            this.f201337k = this.f201335i.m159856F().floatValue();
        }
        this.f201335i.m159875Z();
        lifecycle().filter(new qcj() { // from class: l.yqn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj).f16274a);
            }
        }).skip(1).distinctUntilChanged().flatMap(new qcj() { // from class: l.arn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72973a.m217206m4((C4470c) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.crn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83344a.m217212s4((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        m138860d3(o120.class, new qcj() { // from class: l.drn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f90403a.m217214t4((o120) obj);
            }
        });
        m138860d3(dob0.class, new qcj() { // from class: l.ern0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f95485a.m217215u4((dob0) obj);
            }
        });
        m138860d3(ud80.class, new qcj() { // from class: l.frn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f100441a.m217216v4((ud80) obj);
            }
        });
        m138860d3(r020.class, new qcj() { // from class: l.grn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106095a.m217217w4((r020) obj);
            }
        });
        m138860d3(j120.class, new qcj() { // from class: l.hrn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111369a.m217218x4((j120) obj);
            }
        });
        m138860d3(cke.class, new qcj() { // from class: l.irn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f116589a.m217219y4((cke) obj);
            }
        });
        m138860d3(s660.class, new qcj() { // from class: l.krn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f128487a.m217220z4((s660) obj);
            }
        });
        m138860d3(na1.class, new qcj() { // from class: l.jrn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f122395a.m217207n4((na1) obj);
            }
        });
        v3f.C20736d<Float, C22421c<Float>> c20736dAdjustMusicVolume = m213811F2().VoiceKtvEvent.adjustMusicVolume();
        final msn0 msn0Var = this.f201335i;
        Objects.requireNonNull(msn0Var);
        m138863h3(c20736dAdjustMusicVolume, new y20() { // from class: l.qrn0
            @Override // p153l.y20
            public final void call(Object obj) {
                msn0Var.m159876n((Float) obj);
            }
        });
        m138863h3(m213811F2().VoiceKtvEvent.adjustRecordVolume(), new y20() { // from class: l.rrn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164589a.m217201h4((Float) obj);
            }
        });
        m138863h3(m213811F2().VoiceKtvEvent.pauseMusic(), new y20() { // from class: l.srn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170360a.m217208o4((vxj0) obj);
            }
        });
        m138863h3(m213811F2().VoiceKtvEvent.resumeMusic(), new y20() { // from class: l.trn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175893a.m217209p4((vxj0) obj);
            }
        });
        m138863h3(m213811F2().VoiceKtvEvent.switchNext(), new y20() { // from class: l.urn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180662a.m217210q4((vxj0) obj);
            }
        });
        m138863h3(m213811F2().VoiceKtvEvent.setOriginalSwitcher(), new y20() { // from class: l.vrn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185504a.m217173C4((Boolean) obj);
            }
        });
        m138863h3(m213811F2().VoiceKtvEvent.setEarSwitcher(), new y20() { // from class: l.wrn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190537a.m217172B4((Boolean) obj);
            }
        });
        m138863h3(m213811F2().VoiceKtvEvent.setAudioEffectPreset(), new y20() { // from class: l.xrn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195941a.m217171A4(((Integer) obj).intValue());
            }
        });
        ((xzl) m138856F3(new r410(7009))).mo170511Q(new qcj() { // from class: l.zqn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f205635a.m217211r4((Boolean) obj);
            }
        });
        duringCreated(rqn0.m182665h(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.brn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78039a.m217203j4((BLiveVoiceKtvGameInfo) obj);
            }
        }));
    }

    @Override // p153l.yvl
    /* JADX INFO: renamed from: t1 */
    public void mo217213t1(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        tqn0.m192317a(this, bLiveVoiceKtvGameInfo);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Float m217214t4(o120 o120Var) {
        return this.f201335i.m159853C();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ Float m217215u4(dob0 dob0Var) {
        float f = this.f201337k;
        if (f < 0.0f) {
            f = 0.0f;
        }
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Integer m217216v4(ud80 ud80Var) {
        return this.f201335i.m159855E();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ Long m217217w4(r020 r020Var) {
        return this.f201335i.m159883w();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ Long m217218x4(j120 j120Var) {
        return this.f201335i.m159886z();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ Boolean m217219y4(cke ckeVar) {
        return Boolean.valueOf(this.f201335i.m159885y());
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ Boolean m217220z4(s660 s660Var) {
        return Boolean.valueOf(this.f201335i.m159854D());
    }
}
