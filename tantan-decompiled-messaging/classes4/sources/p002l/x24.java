package p002l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p1.mobile.putong.live.base.data.BLivePush;
import com.p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p1.mobile.putong.live.livingroom.view.LiveSettingView;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.idv;
import l.jo0;
import l.jtk;
import l.lsi0;
import l.mkd0;
import l.ptk;
import l.qib0;
import l.soj0;
import l.t100;
import l.vwb;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x24 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public c4g0 f22088i;

    /* JADX INFO: renamed from: j */
    public BLivePushLimit f22089j;

    /* JADX INFO: renamed from: k */
    public DecimalFormat f22090k;

    /* JADX INFO: renamed from: l */
    public c4g0 f22091l;

    /* JADX INFO: renamed from: m */
    public boolean f22092m;

    /* JADX INFO: renamed from: n */
    public String f22093n;

    /* JADX INFO: renamed from: o */
    public String f22094o;

    /* JADX INFO: renamed from: p */
    public final lt3 f22095p;

    public x24(bsm bsmVar, lt3 lt3Var) {
        super(bsmVar);
        this.f22095p = lt3Var;
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m25616L3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ Boolean m25621R3(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.livePushes;
        return Boolean.valueOf(list != null && list.size() > 0);
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ c m25627X3(BLiveMonetizationConfig bLiveMonetizationConfig) {
        BLiveBubbleConfig bLiveBubbleConfig = (BLiveBubbleConfig) vwb.r(bLiveMonetizationConfig.bubbleConfigs, new w9j() { // from class: l.o24
            public final Object call(Object obj) {
                return Boolean.valueOf("callFansLiveButtonBubble".equals(((BLiveBubbleConfig) obj).type));
            }
        });
        return bLiveBubbleConfig == null ? c.just((Object) null) : c.just(bLiveBubbleConfig).delay(bLiveBubbleConfig.bubbleShowAfterWatch, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m25628Y3(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m25632c4(Throwable th) {
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m25634e4(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.h(R$string.f2762H9);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).code;
        if (41006 == i) {
            lsi0.h(R$string.f2676Db);
        } else if (41007 == i) {
            lsi0.h(R$string.f2698Eb);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m25636g4(String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: l4 */
    private String m25637l4() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM25674S2;
        return (!(m25547E2() instanceof x350) || (bLiveOfficialShowCurrentAnchorInfoM25674S2 = ((x350) m25547E2()).m25674S2()) == null) ? m25547E2().m17239o() : bLiveOfficialShowCurrentAnchorInfoM25674S2.anchorRoomId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m25638m4(soj0 soj0Var) {
        m25669z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m25639n4(soj0 soj0Var) {
        m25646G4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m25640A4(BLivePushLimit bLivePushLimit, int i) {
        boolean z = false;
        this.f22095p.m17422r4(bLivePushLimit.remaining > 0 && i > 0);
        lt3 lt3Var = this.f22095p;
        if (bLivePushLimit.remaining > 0 && i <= 0) {
            z = true;
        }
        lt3Var.m17421q4(z);
        m25641B4();
    }

    /* JADX INFO: renamed from: B4 */
    public final void m25641B4() {
        this.f22095p.m17419o4();
    }

    /* JADX INFO: renamed from: C4 */
    public void m25642C4() {
        if (TextUtils.isEmpty(this.f22093n)) {
            return;
        }
        ptk.h().g(this.f22093n);
        this.f22093n = null;
    }

    /* JADX INFO: renamed from: D4 */
    public void m25643D4(LiveSettingView liveSettingView) {
        if (TextUtils.isEmpty(this.f22094o)) {
            m25653h4(liveSettingView);
        } else {
            ptk.h().g(this.f22094o);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public c<BLivePushLimit> m25644E4() {
        return LivingNormalApiProvider.m4893n5(m25637l4());
    }

    /* JADX INFO: renamed from: F4 */
    public final int m25645F4(BLivePushLimit bLivePushLimit) {
        return Math.max(((int) (bLivePushLimit.availableTime - qib0.H.guessedCurrentServerTime())) / 1000, 0);
    }

    /* JADX INFO: renamed from: G4 */
    public final void m25646G4() {
        boolean z;
        m25642C4();
        BLivePushLimit bLivePushLimit = this.f22089j;
        String strM25656k4 = "";
        if (bLivePushLimit != null) {
            z = bLivePushLimit.remaining > 0;
            if (m25645F4(bLivePushLimit) > 0) {
                strM25656k4 = m25656k4(m25645F4(this.f22089j));
            }
        } else {
            z = false;
        }
        this.f22095p.m17424t4(this.f22092m);
        if (z && TextUtils.isEmpty(strM25656k4)) {
            this.f22095p.m17421q4(true);
            this.f22095p.m17422r4(false);
        } else {
            lt3 lt3Var = this.f22095p;
            if (z) {
                lt3Var.m17421q4(false);
                this.f22095p.m17422r4(true);
                this.f22095p.m17423s4(strM25656k4);
            } else {
                lt3Var.m17421q4(false);
                this.f22095p.m17422r4(false);
            }
        }
        m25641B4();
    }

    /* JADX INFO: renamed from: H4 */
    public void m25647H4(BLiveBubbleConfig bLiveBubbleConfig, ViewGroup viewGroup) {
        if (bLiveBubbleConfig == null || TextUtils.isEmpty((CharSequence) bLiveBubbleConfig.bubbleTextList.get(0))) {
            return;
        }
        this.f22095p.m17424t4(true);
        m25641B4();
        final ptk ptkVarH = ptk.h();
        jtk jtkVarB = new jtk(act()).u((String) bLiveBubbleConfig.bubbleTextList.get(0)).e(new int[]{Color.parseColor("#f79533"), Color.parseColor("#f7c333")}).k(true).t(12).v(false).l(t100.d(10.0f)).i(jtk.D).a(bLiveBubbleConfig.bubbleDisappear * 1000).b(new jtk.a() { // from class: l.n24
            /* JADX INFO: renamed from: a */
            public final void m18424a(String str) {
                ptkVarH.g(str);
            }
        });
        View view = (View) m14184F3(new ujj(5000).m23512e(BLiveButtonType.get("settingButton")));
        if (view != null) {
            this.f22093n = ptkVarH.r(jtkVarB, view, viewGroup);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public void m25648I4(LiveSettingView liveSettingView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final ptk ptkVarH = ptk.h();
        jtk jtkVarI = new jtk(act()).u(str).e(new int[]{Color.parseColor("#f79533"), Color.parseColor("#f7c333")}).k(true).t(12).v(false).i(jtk.D);
        Objects.requireNonNull(ptkVarH);
        jtk jtkVarD = jtkVarI.b(new jtk.a() { // from class: l.v24
            /* JADX INFO: renamed from: a */
            public final void m23715a(String str2) {
                ptkVarH.g(str2);
            }
        }).d(new jtk.b() { // from class: l.w24
            /* JADX INFO: renamed from: a */
            public final void m24293a(String str2) {
                this.f21426a.m25659q4(str2);
            }
        });
        View viewM17418n4 = this.f22095p.m17418n4();
        if (viewM17418n4 != null) {
            this.f22094o = ptkVarH.r(jtkVarD, viewM17418n4, liveSettingView);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m25649J4() {
        mkd0.z(this.f22091l);
        this.f22091l = duringCreated(((idv) ypv.l(fld0.b)).d().flatMap(new w9j() { // from class: l.i24
            public final Object call(Object obj) {
                return x24.m25627X3((BLiveMonetizationConfig) obj);
            }
        }).observeOn(jo0.a()).filter(new w9j() { // from class: l.k24
            public final Object call(Object obj) {
                return this.f14171a.m25660r4((BLiveBubbleConfig) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.l24
            public final void call(Object obj) {
                this.f14654a.m25661s4((BLiveBubbleConfig) obj);
            }
        }, new e30() { // from class: l.m24
            public final void call(Object obj) {
                x24.m25628Y3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public void m25650K4(String str) {
        if ("00:00:00".equals(str)) {
            return;
        }
        this.f22095p.m17423s4(str);
        this.f22095p.m17422r4(true);
        this.f22095p.m17424t4(false);
        m25641B4();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: L4 */
    public void m25651L4(final BLivePushLimit bLivePushLimit) {
        mkd0.z(this.f22088i);
        this.f22089j = bLivePushLimit;
        m25640A4(bLivePushLimit, m25645F4(bLivePushLimit));
        this.f22088i = m14186H3(m25547E2().m14575i2(TimeUnit.SECONDS)).takeWhile(new w9j() { // from class: l.b24
            public final Object call(Object obj) {
                return Boolean.valueOf(bLivePushLimit.remaining > 0);
            }
        }).map(new w9j() { // from class: l.c24
            public final Object call(Object obj) {
                return this.f8463a.m25664u4(bLivePushLimit, (Long) obj);
            }
        }).doOnNext(new e30() { // from class: l.d24
            public final void call(Object obj) {
                this.f9040a.m25665v4(bLivePushLimit, (String) obj);
            }
        }).filter(new w9j() { // from class: l.e24
            public final Object call(Object obj) {
                return this.f9541a.m25666w4(bLivePushLimit, (String) obj);
            }
        }).take(1).subscribe(ffw.f(new e30() { // from class: l.f24
            public final void call(Object obj) {
                x24.m25636g4((String) obj);
            }
        }, new e30() { // from class: l.g24
            public final void call(Object obj) {
                x24.m25616L3((Throwable) obj);
            }
        }, new d30() { // from class: l.h24
            public final void call() {
                this.f11846a.m25663t4(bLivePushLimit);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m25652T() {
        super.T();
        duringCreated((c) m25548F2().BottomEvent.onSettingDialogDismiss().g()).subscribe(ffw.d(new e30() { // from class: l.z14
            public final void call(Object obj) {
                this.f23172a.m25638m4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.onSettingDialogShow().g()).subscribe(ffw.d(new e30() { // from class: l.a24
            public final void call(Object obj) {
                this.f7341a.m25639n4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public void m25653h4(LiveSettingView liveSettingView) {
        if (m25654i4()) {
            m25655j4();
        } else {
            m25648I4(liveSettingView, ypv.k().t3());
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final boolean m25654i4() {
        BLivePushLimit bLivePushLimit = this.f22089j;
        return bLivePushLimit != null && bLivePushLimit.remaining > 0 && m25645F4(bLivePushLimit) <= 0;
    }

    /* JADX INFO: renamed from: j4 */
    public void m25655j4() {
        duringCreated(LivingNormalApiProvider.m4580E7(m25637l4()).filter(new w9j() { // from class: l.r24
            public final Object call(Object obj) {
                return x24.m25621R3((BLiveEnvelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.s24
            public final void call(Object obj) {
                this.f18763a.m25657o4((BLiveEnvelope) obj);
            }
        }).flatMap(new w9j() { // from class: l.t24
            public final Object call(Object obj) {
                return this.f19400a.m25658p4((BLiveEnvelope) obj);
            }
        })).subscribe(ffw.e(new j24(this), new e30() { // from class: l.u24
            public final void call(Object obj) {
                x24.m25634e4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final String m25656k4(int i) {
        if (this.f22090k == null) {
            this.f22090k = new DecimalFormat("00");
        }
        return this.f22090k.format(i / 3600) + ":" + this.f22090k.format((i % 3600) / 60) + ":" + this.f22090k.format(i % 60);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mkd0.z(this.f22088i);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m25657o4(BLiveEnvelope bLiveEnvelope) {
        this.f22092m = false;
        lsi0.j(((BLivePush) bLiveEnvelope.data.livePushes.get(0)).resultMessage);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ c m25658p4(BLiveEnvelope bLiveEnvelope) {
        return LivingNormalApiProvider.m4893n5(m25637l4());
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m25659q4(String str) {
        this.f22094o = null;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m25660r4(BLiveBubbleConfig bLiveBubbleConfig) {
        boolean zM25654i4 = m25654i4();
        this.f22092m = zM25654i4;
        return Boolean.valueOf(zM25654i4);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m25661s4(BLiveBubbleConfig bLiveBubbleConfig) {
        m25647H4(bLiveBubbleConfig, m25556Q2());
    }

    /* JADX INFO: renamed from: t */
    public void m25662t() {
        super.t();
        duringCreated(((c) m25548F2().LivePusherEvent.notifyPushStreamReady().g()).take(1).delay(1L, TimeUnit.SECONDS).flatMap(new w9j() { // from class: l.y14
            public final Object call(Object obj) {
                return this.f22595a.m25667x4((soj0) obj);
            }
        })).doOnNext(new j24(this)).subscribe(ffw.e(new e30() { // from class: l.p24
            public final void call(Object obj) {
                this.f16985a.m25668y4((BLivePushLimit) obj);
            }
        }, new e30() { // from class: l.q24
            public final void call(Object obj) {
                x24.m25632c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m25663t4(BLivePushLimit bLivePushLimit) {
        m25640A4(this.f22089j, m25645F4(bLivePushLimit));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ String m25664u4(BLivePushLimit bLivePushLimit, Long l2) {
        return m25656k4(m25645F4(bLivePushLimit));
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m25665v4(BLivePushLimit bLivePushLimit, String str) {
        m25650K4(str);
        m25640A4(this.f22089j, m25645F4(bLivePushLimit));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ Boolean m25666w4(BLivePushLimit bLivePushLimit, String str) {
        return Boolean.valueOf(m25645F4(bLivePushLimit) <= 0);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ c m25667x4(soj0 soj0Var) {
        return m25644E4();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m25668y4(BLivePushLimit bLivePushLimit) {
        m25649J4();
    }

    /* JADX INFO: renamed from: z4 */
    public final void m25669z4() {
        if (TextUtils.isEmpty(this.f22094o)) {
            return;
        }
        ptk.h().g(this.f22094o);
    }
}
