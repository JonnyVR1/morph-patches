package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.base.data.BLivePush;
import com.p051p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.view.LiveSettingView;
import com.tencent.mmkv.MMKV;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class w34 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public kcg0 f187073i;

    /* JADX INFO: renamed from: j */
    public BLivePushLimit f187074j;

    /* JADX INFO: renamed from: k */
    public DecimalFormat f187075k;

    /* JADX INFO: renamed from: l */
    public kcg0 f187076l;

    /* JADX INFO: renamed from: m */
    public boolean f187077m;

    /* JADX INFO: renamed from: n */
    public String f187078n;

    /* JADX INFO: renamed from: o */
    public String f187079o;

    /* JADX INFO: renamed from: p */
    public final ku3 f187080p;

    public w34(dum dumVar, ku3 ku3Var) {
        super(dumVar);
        this.f187080p = ku3Var;
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m204684L3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ Boolean m204689R3(BLiveEnvelope bLiveEnvelope) {
        List<BLivePush> list = bLiveEnvelope.data.livePushes;
        return Boolean.valueOf(list != null && list.size() > 0);
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ C22421c m204695X3(BLiveMonetizationConfig bLiveMonetizationConfig) {
        BLiveBubbleConfig bLiveBubbleConfig = (BLiveBubbleConfig) jyb.m147529r(bLiveMonetizationConfig.bubbleConfigs, new qcj() { // from class: l.n34
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("callFansLiveButtonBubble".equals(((BLiveBubbleConfig) obj).type));
            }
        });
        return bLiveBubbleConfig == null ? C22421c.just(null) : C22421c.just(bLiveBubbleConfig).delay(bLiveBubbleConfig.bubbleShowAfterWatch, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m204696Y3(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m204700c4(Throwable th) {
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m204702e4(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165634h(R$string.f47568H9);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).code;
        if (41006 == i) {
            o1j0.m165634h(R$string.f47482Db);
        } else if (41007 == i) {
            o1j0.m165634h(R$string.f47504Eb);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m204704g4(String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: l4 */
    private String m204705l4() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM157913S2;
        return (!(m213810E2() instanceof mc50) || (bLiveOfficialShowCurrentAnchorInfoM157913S2 = ((mc50) m213810E2()).m157913S2()) == null) ? m213810E2().m202194o() : bLiveOfficialShowCurrentAnchorInfoM157913S2.anchorRoomId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m204706m4(vxj0 vxj0Var) {
        m204735z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m204707n4(vxj0 vxj0Var) {
        m204714G4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m204708A4(BLivePushLimit bLivePushLimit, int i) {
        boolean z = false;
        this.f187080p.m151447r4(bLivePushLimit.remaining > 0 && i > 0);
        ku3 ku3Var = this.f187080p;
        if (bLivePushLimit.remaining > 0 && i <= 0) {
            z = true;
        }
        ku3Var.m151446q4(z);
        m204709B4();
    }

    /* JADX INFO: renamed from: B4 */
    public final void m204709B4() {
        this.f187080p.m151444o4();
    }

    /* JADX INFO: renamed from: C4 */
    public void m204710C4() {
        if (TextUtils.isEmpty(this.f187078n)) {
            return;
        }
        fwk.m127777h().m127779g(this.f187078n);
        this.f187078n = null;
    }

    /* JADX INFO: renamed from: D4 */
    public void m204711D4(LiveSettingView liveSettingView) {
        if (TextUtils.isEmpty(this.f187079o)) {
            m204720h4(liveSettingView);
        } else {
            fwk.m127777h().m127779g(this.f187079o);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public C22421c<BLivePushLimit> m204712E4() {
        return LivingNormalApiProvider.m72710n5(m204705l4());
    }

    /* JADX INFO: renamed from: F4 */
    public final int m204713F4(BLivePushLimit bLivePushLimit) {
        return Math.max(((int) (bLivePushLimit.availableTime - uqb0.f180376H.guessedCurrentServerTime())) / 1000, 0);
    }

    /* JADX INFO: renamed from: G4 */
    public final void m204714G4() {
        boolean z;
        m204710C4();
        BLivePushLimit bLivePushLimit = this.f187074j;
        String strM204723k4 = "";
        if (bLivePushLimit != null) {
            z = bLivePushLimit.remaining > 0;
            if (m204713F4(bLivePushLimit) > 0) {
                strM204723k4 = m204723k4(m204713F4(this.f187074j));
            }
        } else {
            z = false;
        }
        this.f187080p.m151449t4(this.f187077m);
        if (z && TextUtils.isEmpty(strM204723k4)) {
            this.f187080p.m151446q4(true);
            this.f187080p.m151447r4(false);
        } else {
            ku3 ku3Var = this.f187080p;
            if (z) {
                ku3Var.m151446q4(false);
                this.f187080p.m151447r4(true);
                this.f187080p.m151448s4(strM204723k4);
            } else {
                ku3Var.m151446q4(false);
                this.f187080p.m151447r4(false);
            }
        }
        m204709B4();
    }

    /* JADX INFO: renamed from: H4 */
    public void m204715H4(BLiveBubbleConfig bLiveBubbleConfig, ViewGroup viewGroup) {
        if (bLiveBubbleConfig == null || TextUtils.isEmpty(bLiveBubbleConfig.bubbleTextList.get(0))) {
            return;
        }
        this.f187080p.m151449t4(true);
        m204709B4();
        final fwk fwkVarM127777h = fwk.m127777h();
        zvk zvkVarM221757b = new zvk(act()).m221776u(bLiveBubbleConfig.bubbleTextList.get(0)).m221760e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m221766k(true).m221775t(12).m221777v(false).m221767l(qa00.m175859d(10.0f)).m221764i(zvk.f206227D).m221756a(bLiveBubbleConfig.bubbleDisappear * 1000).m221757b(new zvk.InterfaceC21905a() { // from class: l.m34
            @Override // p153l.zvk.InterfaceC21905a
            /* JADX INFO: renamed from: a */
            public final void mo102709a(String str) {
                fwkVarM127777h.m127779g(str);
            }
        });
        View view = (View) m138856F3(new nmj(5000).m163820e(BLiveButtonType.get("settingButton")));
        if (view != null) {
            this.f187078n = fwkVarM127777h.m127789r(zvkVarM221757b, view, viewGroup);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public void m204716I4(LiveSettingView liveSettingView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fwk fwkVarM127777h = fwk.m127777h();
        zvk zvkVarM221764i = new zvk(act()).m221776u(str).m221760e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m221766k(true).m221775t(12).m221777v(false).m221764i(zvk.f206227D);
        Objects.requireNonNull(fwkVarM127777h);
        zvk zvkVarM221759d = zvkVarM221764i.m221757b(new u34(fwkVarM127777h)).m221759d(new zvk.InterfaceC21906b() { // from class: l.v34
            @Override // p153l.zvk.InterfaceC21906b
            /* JADX INFO: renamed from: a */
            public final void mo96261a(String str2) {
                this.f182151a.m204726q4(str2);
            }
        });
        View viewM151443n4 = this.f187080p.m151443n4();
        if (viewM151443n4 != null) {
            this.f187079o = fwkVarM127777h.m127789r(zvkVarM221759d, viewM151443n4, liveSettingView);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m204717J4() {
        psd0.m173633z(this.f187076l);
        this.f187076l = duringCreated(((jfv) zrv.m221194l(htd0.f111520b)).m144717d().flatMap(new qcj() { // from class: l.h34
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w34.m204695X3((BLiveMonetizationConfig) obj);
            }
        }).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.j34
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118149a.m204727r4((BLiveBubbleConfig) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.k34
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123680a.m204728s4((BLiveBubbleConfig) obj);
            }
        }, new y20() { // from class: l.l34
            @Override // p153l.y20
            public final void call(Object obj) {
                w34.m204696Y3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public void m204718K4(String str) {
        if ("00:00:00".equals(str)) {
            return;
        }
        this.f187080p.m151448s4(str);
        this.f187080p.m151447r4(true);
        this.f187080p.m151449t4(false);
        m204709B4();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX INFO: renamed from: L4 */
    public void m204719L4(final BLivePushLimit bLivePushLimit) {
        psd0.m173633z(this.f187073i);
        this.f187074j = bLivePushLimit;
        m204708A4(bLivePushLimit, m204713F4(bLivePushLimit));
        this.f187073i = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).takeWhile(new qcj() { // from class: l.a34
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(bLivePushLimit.remaining > 0);
            }
        }).map(new qcj() { // from class: l.b34
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74709a.m204730u4(bLivePushLimit, (Long) obj);
            }
        }).doOnNext(new y20() { // from class: l.c34
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79574a.m204731v4(bLivePushLimit, (String) obj);
            }
        }).filter(new qcj() { // from class: l.d34
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84849a.m204732w4(bLivePushLimit, (String) obj);
            }
        }).take(1).subscribe(dhw.m115827f(new y20() { // from class: l.e34
            @Override // p153l.y20
            public final void call(Object obj) {
                w34.m204704g4((String) obj);
            }
        }, new y20() { // from class: l.f34
            @Override // p153l.y20
            public final void call(Object obj) {
                w34.m204684L3((Throwable) obj);
            }
        }, new x20() { // from class: l.g34
            @Override // p153l.x20
            public final void call() {
                this.f101943a.m204729t4(bLivePushLimit);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().BottomEvent.onSettingDialogDismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.y24
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197176a.m204706m4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.onSettingDialogShow().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.z24
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202628a.m204707n4((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public void m204720h4(LiveSettingView liveSettingView) {
        if (m204721i4()) {
            m204722j4();
        } else {
            m204716I4(liveSettingView, zrv.m221193k().m203733t3());
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final boolean m204721i4() {
        BLivePushLimit bLivePushLimit = this.f187074j;
        return bLivePushLimit != null && bLivePushLimit.remaining > 0 && m204713F4(bLivePushLimit) <= 0;
    }

    /* JADX INFO: renamed from: j4 */
    public void m204722j4() {
        duringCreated((C22421c) LivingNormalApiProvider.m72397E7(m204705l4()).filter(new qcj() { // from class: l.q34
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w34.m204689R3((BLiveEnvelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.r34
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160996a.m204724o4((BLiveEnvelope) obj);
            }
        }).flatMap(new qcj() { // from class: l.s34
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165973a.m204725p4((BLiveEnvelope) obj);
            }
        })).subscribe(dhw.m115826e(new i34(this), new y20() { // from class: l.t34
            @Override // p153l.y20
            public final void call(Object obj) {
                w34.m204702e4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final String m204723k4(int i) {
        if (this.f187075k == null) {
            this.f187075k = new DecimalFormat("00");
        }
        return this.f187075k.format(i / MMKV.ExpireInHour) + ":" + this.f187075k.format((i % MMKV.ExpireInHour) / 60) + ":" + this.f187075k.format(i % 60);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f187073i);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m204724o4(BLiveEnvelope bLiveEnvelope) {
        this.f187077m = false;
        o1j0.m165636j(bLiveEnvelope.data.livePushes.get(0).resultMessage);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ C22421c m204725p4(BLiveEnvelope bLiveEnvelope) {
        return LivingNormalApiProvider.m72710n5(m204705l4());
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m204726q4(String str) {
        this.f187079o = null;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m204727r4(BLiveBubbleConfig bLiveBubbleConfig) {
        boolean zM204721i4 = m204721i4();
        this.f187077m = zM204721i4;
        return Boolean.valueOf(zM204721i4);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m204728s4(BLiveBubbleConfig bLiveBubbleConfig) {
        m204715H4(bLiveBubbleConfig, m213819Q2());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().LivePusherEvent.notifyPushStreamReady().m199270g().take(1).delay(1L, TimeUnit.SECONDS).flatMap(new qcj() { // from class: l.x24
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192115a.m204733x4((vxj0) obj);
            }
        })).doOnNext(new i34(this)).subscribe(dhw.m115826e(new y20() { // from class: l.o34
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144816a.m204734y4((BLivePushLimit) obj);
            }
        }, new y20() { // from class: l.p34
            @Override // p153l.y20
            public final void call(Object obj) {
                w34.m204700c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m204729t4(BLivePushLimit bLivePushLimit) {
        m204708A4(this.f187074j, m204713F4(bLivePushLimit));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ String m204730u4(BLivePushLimit bLivePushLimit, Long l2) {
        return m204723k4(m204713F4(bLivePushLimit));
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m204731v4(BLivePushLimit bLivePushLimit, String str) {
        m204718K4(str);
        m204708A4(this.f187074j, m204713F4(bLivePushLimit));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ Boolean m204732w4(BLivePushLimit bLivePushLimit, String str) {
        return Boolean.valueOf(m204713F4(bLivePushLimit) <= 0);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ C22421c m204733x4(vxj0 vxj0Var) {
        return m204712E4();
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m204734y4(BLivePushLimit bLivePushLimit) {
        m204717J4();
    }

    /* JADX INFO: renamed from: z4 */
    public final void m204735z4() {
        if (TextUtils.isEmpty(this.f187079o)) {
            return;
        }
        fwk.m127777h().m127779g(this.f187079o);
    }
}
