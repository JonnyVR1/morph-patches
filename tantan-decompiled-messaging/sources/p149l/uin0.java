package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class uin0 extends pat<nnn0> implements ktl {

    /* JADX INFO: renamed from: i */
    public ijn0 f176663i;

    /* JADX INFO: renamed from: j */
    public final float f176664j;

    /* JADX INFO: renamed from: k */
    public float f176665k;

    /* JADX INFO: renamed from: l */
    public final float f176666l;

    /* JADX INFO: renamed from: m */
    public final float f176667m;

    public uin0(bsm<?> bsmVar) {
        super(bsmVar);
        this.f176664j = -1.0f;
        this.f176665k = -1.0f;
        this.f176666l = 4.0f;
        this.f176667m = 1.0f;
        m193926i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public void m193897A4(int i) {
        this.f176663i.m136688V(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public void m193898B4(Boolean bool) {
        this.f176663i.m136689W(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public void m193899C4(Boolean bool) {
        this.f176663i.m136691Y(bool);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m193905O3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D4 */
    public final void m193923D4() {
        duringCreated(((nnn0) m206027E2()).m160262Z2()).filter(new o1r()).distinctUntilChanged(new w9j() { // from class: l.jin0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).state;
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.kin0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123359a.m193929l4((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final void m193924E4() {
        String strM136702x = this.f176663i.m136702x();
        if (TextUtils.isEmpty(strM136702x)) {
            return;
        }
        duringCreated(nhn0.m159428l(((nnn0) m206027E2()).m149814k(), strM136702x, k580.f121165k)).subscribe(ffw.m121194e(new e30() { // from class: l.lin0
            @Override // p149l.e30
            public final void call(Object obj) {
                uin0.m193905O3((BLiveEnvelope) obj);
            }
        }, new ult()));
    }

    @Override // p149l.ktl
    /* JADX INFO: renamed from: L1 */
    public <T> C22306c<T> mo147210L1(C22306c<T> c22306c) {
        return m104250o2(c22306c, false);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        q2f.C19397d<we50, C22306c<we50>> c19397dRegisterPlayListener = m206028F2().VoiceKtvEvent.registerPlayListener();
        final ijn0 ijn0Var = this.f176663i;
        Objects.requireNonNull(ijn0Var);
        m129304h3(c19397dRegisterPlayListener, new e30() { // from class: l.hin0
            @Override // p149l.e30
            public final void call(Object obj) {
                ijn0Var.m136685S((we50) obj);
            }
        });
        q2f.C19397d<we50, C22306c<we50>> c19397dRemovePlayListener = m206028F2().VoiceKtvEvent.removePlayListener();
        final ijn0 ijn0Var2 = this.f176663i;
        Objects.requireNonNull(ijn0Var2);
        m129304h3(c19397dRemovePlayListener, new e30() { // from class: l.iin0
            @Override // p149l.e30
            public final void call(Object obj) {
                ijn0Var2.m136686T((we50) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.ktl
    /* JADX INFO: renamed from: Y1 */
    public nnn0 mo147211Y1() {
        return (nnn0) m206027E2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m193925h4(Float f) {
        if (!alk0.m97308g(((nnn0) m206027E2()).m160261Y2())) {
            this.f176663i.m136694o(f);
        }
        this.f176665k = f.floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m193926i4() {
        if (((nnn0) m206027E2()).m160257U2() == null) {
            this.f176663i = new ijn0(this);
            ((nnn0) m206027E2()).m160248O3(this.f176663i);
        } else {
            ijn0 ijn0VarM160257U2 = ((nnn0) m206027E2()).m160257U2();
            this.f176663i = ijn0VarM160257U2;
            ijn0VarM160257U2.m136690X(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m193927j4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        if (((nnn0) m206027E2()).f139747Q) {
            this.f176663i.m136676I(bLiveVoiceKtvGameInfo, "http");
        } else if (BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvGameInfo.playInfo) && TextUtils.equals(bLiveVoiceKtvGameInfo.playInfo.userId, ypv.f199493a.m199309D0())) {
            nhn0.m159429m(((nnn0) m206027E2()).m149814k(), bLiveVoiceKtvGameInfo.playInfo.orderId, k580.f121168n);
        } else {
            this.f176663i.m136676I(bLiveVoiceKtvGameInfo, "http");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m193928k4() {
        boolean zM97308g = alk0.m97308g(((nnn0) m206027E2()).m160261Y2());
        this.f176665k = zM97308g ? -1.0f : 4.0f;
        this.f176663i.m136694o(Float.valueOf(zM97308g ? 0.0f : 4.0f));
        this.f176663i.m136693n(Float.valueOf(1.0f));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m193929l4(BLiveVoiceCall bLiveVoiceCall) {
        m193928k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ C22306c m193930m4(C4319c c4319c) {
        return duringCreated(nhn0.m159424h(((nnn0) m206027E2()).m149814k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f176663i.m136697r(!((nnn0) m206027E2()).m160273k3());
        if (((nnn0) m206027E2()).m132067H0() == null || ((nnn0) m206027E2()).m132067H0().mo138339e() == null) {
            return;
        }
        ((nnn0) m206027E2()).m132067H0().mo138339e().mo118675Q(null);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Integer m193931n4(ga1 ga1Var) {
        return Integer.valueOf(this.f176663i.m136700v());
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m193932o4(soj0 soj0Var) {
        this.f176663i.m136684R();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m193933p4(soj0 soj0Var) {
        this.f176663i.m136687U();
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m193934q4(soj0 soj0Var) {
        m193924E4();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Float m193935r4(Boolean bool) {
        if (bool.booleanValue()) {
            return Float.valueOf(0.0f);
        }
        if (this.f176665k < 0.0f) {
            this.f176665k = 4.0f;
        }
        return Float.valueOf(this.f176665k);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m193936s4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        this.f176663i.m136676I(bLiveVoiceKtvGameInfo, "http");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (!((nnn0) m206027E2()).f139747Q) {
            if (!alk0.m97309h(((nnn0) m206027E2()).m160261Y2())) {
                m193923D4();
            } else if (alk0.m97308g(((nnn0) m206027E2()).m160261Y2())) {
                this.f176665k = -1.0f;
            } else {
                m193928k4();
            }
            this.f176663i.m136693n(Float.valueOf(1.0f));
        } else if (!alk0.m97309h(((nnn0) m206027E2()).m160261Y2())) {
            m193923D4();
        } else if (alk0.m97308g(((nnn0) m206027E2()).m160261Y2())) {
            this.f176665k = -1.0f;
        } else {
            this.f176665k = this.f176663i.m136672F().floatValue();
        }
        this.f176663i.m136692Z();
        lifecycle().filter(new w9j() { // from class: l.uhn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj).f15555a);
            }
        }).skip(1).distinctUntilChanged().flatMap(new w9j() { // from class: l.whn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f186448a.m193930m4((C4319c) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.yhn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198374a.m193936s4((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        m129301d3(gt10.class, new w9j() { // from class: l.zhn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203198a.m193937t4((gt10) obj);
            }
        });
        m129301d3(zfb0.class, new w9j() { // from class: l.ain0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f70015a.m193938u4((zfb0) obj);
            }
        });
        m129301d3(o580.class, new w9j() { // from class: l.bin0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75780a.m193939v4((o580) obj);
            }
        });
        m129301d3(js10.class, new w9j() { // from class: l.cin0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f81101a.m193940w4((js10) obj);
            }
        });
        m129301d3(bt10.class, new w9j() { // from class: l.din0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86408a.m193941x4((bt10) obj);
            }
        });
        m129301d3(yie.class, new w9j() { // from class: l.ein0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f91619a.m193942y4((yie) obj);
            }
        });
        m129301d3(ny50.class, new w9j() { // from class: l.gin0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f102949a.m193943z4((ny50) obj);
            }
        });
        m129301d3(ga1.class, new w9j() { // from class: l.fin0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97698a.m193931n4((ga1) obj);
            }
        });
        q2f.C19397d<Float, C22306c<Float>> c19397dAdjustMusicVolume = m206028F2().VoiceKtvEvent.adjustMusicVolume();
        final ijn0 ijn0Var = this.f176663i;
        Objects.requireNonNull(ijn0Var);
        m129304h3(c19397dAdjustMusicVolume, new e30() { // from class: l.min0
            @Override // p149l.e30
            public final void call(Object obj) {
                ijn0Var.m136693n((Float) obj);
            }
        });
        m129304h3(m206028F2().VoiceKtvEvent.adjustRecordVolume(), new e30() { // from class: l.nin0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139120a.m193925h4((Float) obj);
            }
        });
        m129304h3(m206028F2().VoiceKtvEvent.pauseMusic(), new e30() { // from class: l.oin0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144142a.m193932o4((soj0) obj);
            }
        });
        m129304h3(m206028F2().VoiceKtvEvent.resumeMusic(), new e30() { // from class: l.pin0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149583a.m193933p4((soj0) obj);
            }
        });
        m129304h3(m206028F2().VoiceKtvEvent.switchNext(), new e30() { // from class: l.qin0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154789a.m193934q4((soj0) obj);
            }
        });
        m129304h3(m206028F2().VoiceKtvEvent.setOriginalSwitcher(), new e30() { // from class: l.rin0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159572a.m193899C4((Boolean) obj);
            }
        });
        m129304h3(m206028F2().VoiceKtvEvent.setEarSwitcher(), new e30() { // from class: l.sin0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164726a.m193898B4((Boolean) obj);
            }
        });
        m129304h3(m206028F2().VoiceKtvEvent.setAudioEffectPreset(), new e30() { // from class: l.tin0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170597a.m193897A4(((Integer) obj).intValue());
            }
        });
        ((exl) m129297F3(new jw00(7009))).mo118675Q(new w9j() { // from class: l.vhn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181518a.m193935r4((Boolean) obj);
            }
        });
        duringCreated(nhn0.m159424h(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.xhn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192899a.m193927j4((BLiveVoiceKtvGameInfo) obj);
            }
        }));
    }

    @Override // p149l.ktl
    /* JADX INFO: renamed from: t1 */
    public void mo147212t1(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        phn0.m169095a(this, bLiveVoiceKtvGameInfo);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Float m193937t4(gt10 gt10Var) {
        return this.f176663i.m136669C();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ Float m193938u4(zfb0 zfb0Var) {
        float f = this.f176665k;
        if (f < 0.0f) {
            f = 0.0f;
        }
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Integer m193939v4(o580 o580Var) {
        return this.f176663i.m136671E();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ Long m193940w4(js10 js10Var) {
        return this.f176663i.m136701w();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ Long m193941x4(bt10 bt10Var) {
        return this.f176663i.m136704z();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ Boolean m193942y4(yie yieVar) {
        return Boolean.valueOf(this.f176663i.m136703y());
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ Boolean m193943z4(ny50 ny50Var) {
        return Boolean.valueOf(this.f176663i.m136670D());
    }
}
