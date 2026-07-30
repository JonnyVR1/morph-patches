package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.base.data.BLivePush;
import com.p046p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.view.LiveSettingView;
import com.tencent.mmkv.MMKV;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class x24 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public c4g0 f189117i;

    /* JADX INFO: renamed from: j */
    public BLivePushLimit f189118j;

    /* JADX INFO: renamed from: k */
    public DecimalFormat f189119k;

    /* JADX INFO: renamed from: l */
    public c4g0 f189120l;

    /* JADX INFO: renamed from: m */
    public boolean f189121m;

    /* JADX INFO: renamed from: n */
    public String f189122n;

    /* JADX INFO: renamed from: o */
    public String f189123o;

    /* JADX INFO: renamed from: p */
    public final lt3 f189124p;

    public x24(bsm bsmVar, lt3 lt3Var) {
        super(bsmVar);
        this.f189124p = lt3Var;
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m206771L3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ Boolean m206776R3(BLiveEnvelope bLiveEnvelope) {
        List<BLivePush> list = bLiveEnvelope.data.livePushes;
        return Boolean.valueOf(list != null && list.size() > 0);
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ C22306c m206782X3(BLiveMonetizationConfig bLiveMonetizationConfig) {
        BLiveBubbleConfig bLiveBubbleConfig = (BLiveBubbleConfig) vwb.m200346r(bLiveMonetizationConfig.bubbleConfigs, new w9j() { // from class: l.o24
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("callFansLiveButtonBubble".equals(((BLiveBubbleConfig) obj).type));
            }
        });
        return bLiveBubbleConfig == null ? C22306c.just(null) : C22306c.just(bLiveBubbleConfig).delay(bLiveBubbleConfig.bubbleShowAfterWatch, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m206783Y3(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m206787c4(Throwable th) {
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m206789e4(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151578h(R$string.f46720H9);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).code;
        if (41006 == i) {
            lsi0.m151578h(R$string.f46634Db);
        } else if (41007 == i) {
            lsi0.m151578h(R$string.f46656Eb);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m206791g4(String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: l4 */
    private String m206792l4() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM206897S2;
        return (!(m206027E2() instanceof x350) || (bLiveOfficialShowCurrentAnchorInfoM206897S2 = ((x350) m206027E2()).m206897S2()) == null) ? m206027E2().m149818o() : bLiveOfficialShowCurrentAnchorInfoM206897S2.anchorRoomId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m206793m4(soj0 soj0Var) {
        m206822z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m206794n4(soj0 soj0Var) {
        m206801G4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m206795A4(BLivePushLimit bLivePushLimit, int i) {
        boolean z = false;
        this.f189124p.m151667r4(bLivePushLimit.remaining > 0 && i > 0);
        lt3 lt3Var = this.f189124p;
        if (bLivePushLimit.remaining > 0 && i <= 0) {
            z = true;
        }
        lt3Var.m151666q4(z);
        m206796B4();
    }

    /* JADX INFO: renamed from: B4 */
    public final void m206796B4() {
        this.f189124p.m151664o4();
    }

    /* JADX INFO: renamed from: C4 */
    public void m206797C4() {
        if (TextUtils.isEmpty(this.f189122n)) {
            return;
        }
        ptk.m171332h().m171334g(this.f189122n);
        this.f189122n = null;
    }

    /* JADX INFO: renamed from: D4 */
    public void m206798D4(LiveSettingView liveSettingView) {
        if (TextUtils.isEmpty(this.f189123o)) {
            m206807h4(liveSettingView);
        } else {
            ptk.m171332h().m171334g(this.f189123o);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public C22306c<BLivePushLimit> m206799E4() {
        return LivingNormalApiProvider.m71527n5(m206792l4());
    }

    /* JADX INFO: renamed from: F4 */
    public final int m206800F4(BLivePushLimit bLivePushLimit) {
        return Math.max(((int) (bLivePushLimit.availableTime - qib0.f154693H.guessedCurrentServerTime())) / 1000, 0);
    }

    /* JADX INFO: renamed from: G4 */
    public final void m206801G4() {
        boolean z;
        m206797C4();
        BLivePushLimit bLivePushLimit = this.f189118j;
        String strM206810k4 = "";
        if (bLivePushLimit != null) {
            z = bLivePushLimit.remaining > 0;
            if (m206800F4(bLivePushLimit) > 0) {
                strM206810k4 = m206810k4(m206800F4(this.f189118j));
            }
        } else {
            z = false;
        }
        this.f189124p.m151669t4(this.f189121m);
        if (z && TextUtils.isEmpty(strM206810k4)) {
            this.f189124p.m151666q4(true);
            this.f189124p.m151667r4(false);
        } else {
            lt3 lt3Var = this.f189124p;
            if (z) {
                lt3Var.m151666q4(false);
                this.f189124p.m151667r4(true);
                this.f189124p.m151668s4(strM206810k4);
            } else {
                lt3Var.m151666q4(false);
                this.f189124p.m151667r4(false);
            }
        }
        m206796B4();
    }

    /* JADX INFO: renamed from: H4 */
    public void m206802H4(BLiveBubbleConfig bLiveBubbleConfig, ViewGroup viewGroup) {
        if (bLiveBubbleConfig == null || TextUtils.isEmpty(bLiveBubbleConfig.bubbleTextList.get(0))) {
            return;
        }
        this.f189124p.m151669t4(true);
        m206796B4();
        final ptk ptkVarM171332h = ptk.m171332h();
        jtk jtkVarM143110b = new jtk(act()).m143129u(bLiveBubbleConfig.bubbleTextList.get(0)).m143113e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m143119k(true).m143128t(12).m143130v(false).m143120l(t100.m186890d(10.0f)).m143117i(jtk.f119617D).m143109a(bLiveBubbleConfig.bubbleDisappear * 1000).m143110b(new jtk.InterfaceC17856a() { // from class: l.n24
            @Override // p149l.jtk.InterfaceC17856a
            /* JADX INFO: renamed from: a */
            public final void mo125326a(String str) {
                ptkVarM171332h.m171334g(str);
            }
        });
        View view = (View) m129297F3(new ujj(5000).m194015e(BLiveButtonType.get("settingButton")));
        if (view != null) {
            this.f189122n = ptkVarM171332h.m171344r(jtkVarM143110b, view, viewGroup);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public void m206803I4(LiveSettingView liveSettingView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ptk ptkVarM171332h = ptk.m171332h();
        jtk jtkVarM143117i = new jtk(act()).m143129u(str).m143113e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m143119k(true).m143128t(12).m143130v(false).m143117i(jtk.f119617D);
        Objects.requireNonNull(ptkVarM171332h);
        jtk jtkVarM143112d = jtkVarM143117i.m143110b(new v24(ptkVarM171332h)).m143112d(new jtk.InterfaceC17857b() { // from class: l.w24
            @Override // p149l.jtk.InterfaceC17857b
            /* JADX INFO: renamed from: a */
            public final void mo135260a(String str2) {
                this.f184085a.m206813q4(str2);
            }
        });
        View viewM151663n4 = this.f189124p.m151663n4();
        if (viewM151663n4 != null) {
            this.f189123o = ptkVarM171332h.m171344r(jtkVarM143112d, viewM151663n4, liveSettingView);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m206804J4() {
        mkd0.m154992z(this.f189120l);
        this.f189120l = duringCreated(((idv) ypv.m215673l(fld0.f98147b)).m135632d().flatMap(new w9j() { // from class: l.i24
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x24.m206782X3((BLiveMonetizationConfig) obj);
            }
        }).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.k24
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120689a.m206814r4((BLiveBubbleConfig) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.l24
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125743a.m206815s4((BLiveBubbleConfig) obj);
            }
        }, new e30() { // from class: l.m24
            @Override // p149l.e30
            public final void call(Object obj) {
                x24.m206783Y3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public void m206805K4(String str) {
        if ("00:00:00".equals(str)) {
            return;
        }
        this.f189124p.m151668s4(str);
        this.f189124p.m151667r4(true);
        this.f189124p.m151669t4(false);
        m206796B4();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: L4 */
    public void m206806L4(final BLivePushLimit bLivePushLimit) {
        mkd0.m154992z(this.f189117i);
        this.f189118j = bLivePushLimit;
        m206795A4(bLivePushLimit, m206800F4(bLivePushLimit));
        this.f189117i = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).takeWhile(new w9j() { // from class: l.b24
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(bLivePushLimit.remaining > 0);
            }
        }).map(new w9j() { // from class: l.c24
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f78329a.m206817u4(bLivePushLimit, (Long) obj);
            }
        }).doOnNext(new e30() { // from class: l.d24
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83325a.m206818v4(bLivePushLimit, (String) obj);
            }
        }).filter(new w9j() { // from class: l.e24
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88879a.m206819w4(bLivePushLimit, (String) obj);
            }
        }).take(1).subscribe(ffw.m121195f(new e30() { // from class: l.f24
            @Override // p149l.e30
            public final void call(Object obj) {
                x24.m206791g4((String) obj);
            }
        }, new e30() { // from class: l.g24
            @Override // p149l.e30
            public final void call(Object obj) {
                x24.m206771L3((Throwable) obj);
            }
        }, new d30() { // from class: l.h24
            @Override // p149l.d30
            public final void call() {
                this.f105487a.m206816t4(bLivePushLimit);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().BottomEvent.onSettingDialogDismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.z14
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201046a.m206793m4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.onSettingDialogShow().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.a24
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67225a.m206794n4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public void m206807h4(LiveSettingView liveSettingView) {
        if (m206808i4()) {
            m206809j4();
        } else {
            m206803I4(liveSettingView, ypv.m215672k().m195946t3());
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final boolean m206808i4() {
        BLivePushLimit bLivePushLimit = this.f189118j;
        return bLivePushLimit != null && bLivePushLimit.remaining > 0 && m206800F4(bLivePushLimit) <= 0;
    }

    /* JADX INFO: renamed from: j4 */
    public void m206809j4() {
        duringCreated((C22306c) LivingNormalApiProvider.m71214E7(m206792l4()).filter(new w9j() { // from class: l.r24
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x24.m206776R3((BLiveEnvelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.s24
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161958a.m206811o4((BLiveEnvelope) obj);
            }
        }).flatMap(new w9j() { // from class: l.t24
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167440a.m206812p4((BLiveEnvelope) obj);
            }
        })).subscribe(ffw.m121194e(new j24(this), new e30() { // from class: l.u24
            @Override // p149l.e30
            public final void call(Object obj) {
                x24.m206789e4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final String m206810k4(int i) {
        if (this.f189119k == null) {
            this.f189119k = new DecimalFormat("00");
        }
        return this.f189119k.format(i / MMKV.ExpireInHour) + ":" + this.f189119k.format((i % MMKV.ExpireInHour) / 60) + ":" + this.f189119k.format(i % 60);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f189117i);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m206811o4(BLiveEnvelope bLiveEnvelope) {
        this.f189121m = false;
        lsi0.m151580j(bLiveEnvelope.data.livePushes.get(0).resultMessage);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ C22306c m206812p4(BLiveEnvelope bLiveEnvelope) {
        return LivingNormalApiProvider.m71527n5(m206792l4());
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m206813q4(String str) {
        this.f189123o = null;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m206814r4(BLiveBubbleConfig bLiveBubbleConfig) {
        boolean zM206808i4 = m206808i4();
        this.f189121m = zM206808i4;
        return Boolean.valueOf(zM206808i4);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m206815s4(BLiveBubbleConfig bLiveBubbleConfig) {
        m206802H4(bLiveBubbleConfig, m206036Q2());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().LivePusherEvent.notifyPushStreamReady().m172460g().take(1).delay(1L, TimeUnit.SECONDS).flatMap(new w9j() { // from class: l.y14
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f195382a.m206820x4((soj0) obj);
            }
        })).doOnNext(new j24(this)).subscribe(ffw.m121194e(new e30() { // from class: l.p24
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146801a.m206821y4((BLivePushLimit) obj);
            }
        }, new e30() { // from class: l.q24
            @Override // p149l.e30
            public final void call(Object obj) {
                x24.m206787c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m206816t4(BLivePushLimit bLivePushLimit) {
        m206795A4(this.f189118j, m206800F4(bLivePushLimit));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ String m206817u4(BLivePushLimit bLivePushLimit, Long l2) {
        return m206810k4(m206800F4(bLivePushLimit));
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m206818v4(BLivePushLimit bLivePushLimit, String str) {
        m206805K4(str);
        m206795A4(this.f189118j, m206800F4(bLivePushLimit));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ Boolean m206819w4(BLivePushLimit bLivePushLimit, String str) {
        return Boolean.valueOf(m206800F4(bLivePushLimit) <= 0);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ C22306c m206820x4(soj0 soj0Var) {
        return m206799E4();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m206821y4(BLivePushLimit bLivePushLimit) {
        m206804J4();
    }

    /* JADX INFO: renamed from: z4 */
    public final void m206822z4() {
        if (TextUtils.isEmpty(this.f189123o)) {
            return;
        }
        ptk.m171332h().m171334g(this.f189123o);
    }
}
