package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class gpm0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public c4g0 f103810i;

    /* JADX INFO: renamed from: j */
    public final tkk0 f103811j;

    public gpm0(bsm bsmVar, tkk0 tkk0Var) {
        super(bsmVar);
        this.f103811j = tkk0Var;
    }

    /* JADX INFO: renamed from: A4 */
    private void m127359A4() {
        this.f103810i = act().lifecycle().filter(new w9j() { // from class: l.kom0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((C4319c) obj));
            }
        }).map(new w9j() { // from class: l.lom0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj).f15555a);
            }
        }).distinctUntilChanged().doOnNext(new e30() { // from class: l.mom0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134923a.m127386C4((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.nom0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139853a.m127396p4((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.oom0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144894a.m127397q4((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.pom0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150544a.m127393m4((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.qom0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f155605a.m127394n4((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.som0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f165706a.m127395o4((Boolean) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.tom0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171391a.m127360B4(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public void m127360B4(boolean z) {
        if (((nnn0) m206027E2()).m160273k3()) {
            return;
        }
        BLiveVoiceCall bLiveVoiceCallM127384i4 = m127384i4();
        if (!z) {
            C22306c<T> c22306cDuringCreated = duringCreated(VCallApiProvider.deputyGoAway(bLiveVoiceCallM127384i4.f44485id));
            tkk0 tkk0Var = this.f103811j;
            Objects.requireNonNull(tkk0Var);
            c22306cDuringCreated.subscribe(ffw.m121194e(new wkk0(tkk0Var), new e30() { // from class: l.wom0
                @Override // p149l.e30
                public final void call(Object obj) {
                    gpm0.m127382f4((Throwable) obj);
                }
            }));
            return;
        }
        m127389h4(new e30() { // from class: l.uom0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177518a.m127405z4((w3o0) obj);
            }
        });
        C22306c<T> c22306cDuringCreated2 = duringCreated(VCallApiProvider.deputyGoBack(bLiveVoiceCallM127384i4.f44485id));
        tkk0 tkk0Var2 = this.f103811j;
        Objects.requireNonNull(tkk0Var2);
        c22306cDuringCreated2.subscribe(ffw.m121194e(new wkk0(tkk0Var2), new e30() { // from class: l.vom0
            @Override // p149l.e30
            public final void call(Object obj) {
                gpm0.m127378b4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m127378b4(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m127382f4(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    private BLiveVoiceCall m127384i4() {
        return ((nnn0) m206027E2()).m160261Y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m127385s4(soj0 soj0Var) {
        m127404y4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public final void m127386C4(Boolean bool) {
        if (((nnn0) m206027E2()).m160271i3() || !alk0.m97309h(((nnn0) m206027E2()).m160261Y2()) || ((nnn0) m206027E2()).m160273k3()) {
            return;
        }
        x1o0.m206755a(!bool.booleanValue() || ((nnn0) m206027E2()).m160261Y2().mutedByAnchor || ((nnn0) m206027E2()).m160261Y2().mutedByUser, this);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m127387D4(xpm0 xpm0Var) {
        C22306c<T> c22306cDuringCreated = duringCreated(VCallApiProvider.setMuteDeputy(xpm0Var.f193937a, xpm0Var.f193942f, m206032L2() || "voice-manager".equals(xpm0Var.f193943g)));
        tkk0 tkk0Var = this.f103811j;
        Objects.requireNonNull(tkk0Var);
        c22306cDuringCreated.subscribe(ffw.m121194e(new wkk0(tkk0Var), new z2k()));
    }

    /* JADX INFO: renamed from: E4 */
    public final void m127388E4(LongLinkVirtualVoice.VoiceStreamBizTypeMessage voiceStreamBizTypeMessage) {
        hfw.m130790a("[voice][call]", "updateStreamBizType:" + voiceStreamBizTypeMessage.getBizType());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m127359A4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public void m127389h4(e30<w3o0> e30Var) {
        if (((nnn0) m206027E2()).mo149813j() == null || TextUtils.isEmpty(((nnn0) m206027E2()).m149814k())) {
            return;
        }
        duringCreated(m127390j4()).subscribe(ffw.m121194e(e30Var, new z2k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final C22306c<w3o0> m127390j4() {
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        return VCallApiProvider.getRoomMembers(((nnn0) m206027E2()).m149818o(), ((nnn0) m206027E2()).mo132103W0(), ((nnn0) m206027E2()).m149814k(), (bLiveVoiceMo149813j == null || bLiveVoiceMo149813j.isIncomerArea()) ? false : true, ((nnn0) m206027E2()).mo149813j().callNumbers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final r44 m127391k4(y24 y24Var) {
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(y24Var.f195489c);
        i54 i54VarM102065n = ((nnn0) m206027E2()).m160249P2().m102065n(y24Var.f195489c);
        if (bLiveVoiceCallM102063l == null || i54VarM102065n == null) {
            return null;
        }
        return new r44(mlj.m155154c(i54VarM102065n, q44.m172922b(bLiveVoiceCallM102063l.f44485id, TextUtils.equals(i54VarM102065n.f111520a, ((nnn0) m206027E2()).m132146l0().f56011id) ? "gift-audience-none-voiceLiveMain" : "gift-audience-none-voiceLiveVice", bLiveVoiceCallM102063l.position)), alk0.m97304c(bLiveVoiceCallM102063l));
    }

    /* JADX INFO: renamed from: l4 */
    public void m127392l4(BLiveVoiceCall bLiveVoiceCall) {
        if (alk0.m97309h(bLiveVoiceCall)) {
            x1o0.m206755a(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser, this);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ Boolean m127393m4(Boolean bool) {
        return Boolean.valueOf(!"hung-up".equals(m127384i4().state));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f103810i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Boolean m127394n4(Boolean bool) {
        return Boolean.valueOf(((nnn0) m206027E2()).mo149813j() != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ Boolean m127395o4(Boolean bool) {
        return Boolean.valueOf(!((nnn0) m206027E2()).m160267e3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ Boolean m127396p4(Boolean bool) {
        return ((nnn0) m206027E2()).m160266d3();
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ Boolean m127397q4(Boolean bool) {
        return Boolean.valueOf(!TextUtils.isEmpty(m127384i4().f44485id));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ C22306c m127398r4(NetworkInfo networkInfo) {
        return m127390j4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m104250o2(ConnectivityReceiver.m81290m(), false).skip(1).filter(new w9j() { // from class: l.gom0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).flatMap(new w9j() { // from class: l.bpm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76654a.m127398r4((NetworkInfo) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.cpm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81974a.m127403x4((w3o0) obj);
            }
        }, new z2k()));
        m129301d3(y24.class, new w9j() { // from class: l.dpm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f87293a.m127391k4((y24) obj);
            }
        });
        duringCreated(m206028F2().VoiceCallEvent.callMuteEvent().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.epm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92697a.m127387D4((xpm0) obj);
            }
        }));
        m104250o2(((nnn0) m206027E2()).m160262Z2(), false).subscribe(ffw.m121193d(new e30() { // from class: l.fpm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98719a.m127392l4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(m206028F2().VoiceCallEvent.updateDeputyEvent().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.hom0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108832a.m127385s4((soj0) obj);
            }
        }));
        if (!vdt.m198092b(3)) {
            m129299H3(((nnn0) m206027E2()).m132135h2(ypv.m215672k().m195825e6(), TimeUnit.SECONDS).filter(new w9j() { // from class: l.iom0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f114176a.m127399t4((Long) obj);
                }
            })).subscribe(ffw.m121197h(new e30() { // from class: l.jom0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118999a.m127400u4((Long) obj);
                }
            }));
        }
        duringCreated(((nnn0) m206027E2()).m132160q1().f170434c0).subscribe(ffw.m121197h(new e30() { // from class: l.rom0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160397a.m127401v4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        m104250o2(((nnn0) m206027E2()).m132160q1().m189133p1(), false).subscribe(ffw.m121197h(new e30() { // from class: l.yom0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199312a.m127388E4((LongLinkVirtualVoice.VoiceStreamBizTypeMessage) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().f170401S).filter(new w9j() { // from class: l.zom0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("callEffect".equals(((tzo0) obj).f172748e));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.apm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71063a.m127402w4((tzo0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Boolean m127399t4(Long l2) {
        return Boolean.valueOf(!((nnn0) m206027E2()).m160269g3());
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m127400u4(Long l2) {
        m127404y4();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m127401v4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        m127404y4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final void m127402w4(tzo0 tzo0Var) {
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(tzo0Var.f172746c);
        if (bLiveVoiceCallM102063l != null) {
            bLiveVoiceCallM102063l.callEffect = tzo0Var.m191211a();
            ((nnn0) m206027E2()).m160249P2().m102050C(bLiveVoiceCallM102063l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m127403x4(w3o0 w3o0Var) {
        this.f103811j.m189519l4(w3o0Var);
        this.f103811j.m189514e4(((nnn0) m206027E2()).m160261Y2());
    }

    /* JADX INFO: renamed from: y4 */
    public final void m127404y4() {
        C22306c<T> c22306cDuringCreated = duringCreated(m127390j4());
        final tkk0 tkk0Var = this.f103811j;
        Objects.requireNonNull(tkk0Var);
        c22306cDuringCreated.subscribe(ffw.m121197h(new e30() { // from class: l.xom0
            @Override // p149l.e30
            public final void call(Object obj) {
                tkk0Var.m189519l4((w3o0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m127405z4(w3o0 w3o0Var) {
        this.f103811j.m189519l4(w3o0Var);
        this.f103811j.mo136829o4(((nnn0) m206027E2()).m160261Y2());
    }
}
