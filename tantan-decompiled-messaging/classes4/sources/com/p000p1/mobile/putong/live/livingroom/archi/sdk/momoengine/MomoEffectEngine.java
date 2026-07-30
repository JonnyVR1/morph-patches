package com.p000p1.mobile.putong.live.livingroom.archi.sdk.momoengine;

import android.text.TextUtils;
import com.immomo.momomediaext.MomoMediaConstants;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.momoengine.CoreEngineAction;
import com.p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import l.d8s;
import l.dkw;
import l.e30;
import l.e51;
import l.f4m;
import l.gkh0;
import l.lpd0;
import l.pph0;
import l.qph0;
import l.roj0;
import l.twr;
import l.vwb;
import l.ypv;
import p002l.bxl;
import p002l.q0f;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MomoEffectEngine extends d8s implements bxl {

    /* JADX INFO: renamed from: a */
    public final q0f f3809a;

    /* JADX INFO: renamed from: b */
    public f4m f3810b;

    /* JADX INFO: renamed from: g */
    public boolean f3815g;

    /* JADX INFO: renamed from: h */
    public boolean f3816h;

    /* JADX INFO: renamed from: j */
    public pph0 f3818j;

    /* JADX INFO: renamed from: c */
    public final List<TTPresetFilter> f3811c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public volatile SurroundState f3812d = SurroundState.UNKNOW;

    /* JADX INFO: renamed from: e */
    public final a<roj0> f3813e = a.b();

    /* JADX INFO: renamed from: f */
    public C0301b f3814f = new C0301b();

    /* JADX INFO: renamed from: i */
    public int f3817i = -1;

    /* JADX INFO: renamed from: k */
    public String f3819k = null;

    public enum SurroundState {
        UNKNOW,
        STARTING,
        STARTED,
        STOPPING,
        STOPPED,
        PAUSE
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine$a */
    public static /* synthetic */ class C0300a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3820a;

        static {
            int[] iArr = new int[CoreEngineAction.values().length];
            f3820a = iArr;
            try {
                iArr[CoreEngineAction.ACTION_SWITCH_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3820a[CoreEngineAction.ACTION_AFTER_PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3820a[CoreEngineAction.ACTION_BEFORE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine$b */
    public static class C0301b {

        /* JADX INFO: renamed from: a */
        public boolean f3821a;

        /* JADX INFO: renamed from: b */
        public int f3822b;

        /* JADX INFO: renamed from: c */
        public float f3823c;

        /* JADX INFO: renamed from: d */
        public float f3824d;

        /* JADX INFO: renamed from: e */
        public String f3825e = "";

        /* JADX INFO: renamed from: f */
        public float f3826f = 0.0f;
    }

    public MomoEffectEngine(q0f q0fVar) {
        this.f3809a = q0fVar;
        this.f3810b = q0fVar.f17743b;
    }

    /* JADX INFO: renamed from: V0 */
    private void m5226V0() {
        this.f3813e.onNext(roj0.a);
        C0301b c0301b = this.f3814f;
        if (c0301b.f3821a) {
            return;
        }
        mo5256m(c0301b.f3825e);
        setIntensity(this.f3814f.f3826f);
    }

    /* JADX INFO: renamed from: W0 */
    private boolean m5227W0(String str) {
        boolean z = (this.f3816h && this.f3815g) ? false : true;
        if (z && !TextUtils.equals(str, this.f3819k)) {
            gkh0.j("[live]sdk_engine", "beauty unprepared when call " + str);
            this.f3819k = str;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public /* synthetic */ void m5228Z0(BLiveBeautyItem bLiveBeautyItem) {
        lpd0 lpd0Var = new lpd0(twr.b(bLiveBeautyItem.id, ypv.a.D0()), bLiveBeautyItem.getDefaultBeautyValue());
        bLiveBeautyItem.getValue();
        Objects.toString(lpd0Var.get());
        mo5238L(bLiveBeautyItem.id, ((Float) lpd0Var.get()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public void m5229c1() {
        List<BLiveBeautyItem> listM22733K = ypv.c.m22733K();
        if (vwb.J(listM22733K)) {
            return;
        }
        vwb.z(listM22733K, new e30() { // from class: l.yt00
            public final void call(Object obj) {
                this.f23071a.m5228Z0((BLiveBeautyItem) obj);
            }
        });
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: A */
    public void mo5230A(float f) {
        if (NullChecker.a(this.f3810b)) {
            this.f3810b.A(f);
        }
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: B */
    public void mo5231B(int i, pph0 pph0Var) {
        if (TextUtils.isEmpty(pph0Var.d())) {
            this.f3810b.h0(i, pph0Var);
        } else {
            this.f3818j = pph0Var;
            this.f3810b.H(pph0Var);
        }
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: D */
    public void mo5232D(byte[] bArr) {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            f4mVar.D(bArr);
        }
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: D0 */
    public void mo5233D0(String str) {
        gkh0.j("[live]sdk_engine", "removeGestureModel. typeName:" + str);
        this.f3810b.b(str);
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: E */
    public void mo5234E(String str, boolean z) {
        gkh0.j("[live]sdk_engine", "startSurroundMusic:" + str);
        m5251f1(SurroundState.STARTING);
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            f4mVar.E(str, z);
            m5251f1(SurroundState.STARTED);
        }
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: F */
    public void mo5235F() {
        if (m5227W0("removeMakeupStyle")) {
            return;
        }
        C0301b c0301b = this.f3814f;
        c0301b.f3821a = false;
        c0301b.f3824d = 0.0f;
        c0301b.f3823c = 0.0f;
        ByteDanceHelper.g(this.f3810b, c0301b.f3822b, ByteDanceHelper.MakeupStyleType.FILTER, 0.0f);
        f4m f4mVar = this.f3810b;
        C0301b c0301b2 = this.f3814f;
        ByteDanceHelper.g(f4mVar, c0301b2.f3822b, ByteDanceHelper.MakeupStyleType.MAKEUP, c0301b2.f3824d);
        ByteDanceHelper.e(this.f3810b);
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: G */
    public void mo5236G(int i) {
        pph0 pph0Var = this.f3818j;
        if (pph0Var != null) {
            this.f3810b.Q(pph0Var);
        }
        this.f3810b.i0(i);
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: H */
    public int mo5237H(Boolean bool) {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            return f4mVar.Z(bool);
        }
        return -1;
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: L */
    public void mo5238L(int i, float f) {
        if (m5227W0("updateBeautyValue")) {
            return;
        }
        ByteDanceHelper.f(this.f3810b, i, f);
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: M */
    public void mo5239M(Boolean bool) {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            f4mVar.M(bool);
        }
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: Q0 */
    public int mo5240Q0(int i) {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            return f4mVar.selectAudioTrack(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m5241X0(CoreEngineAction coreEngineAction) {
        int i = C0300a.f3820a[coreEngineAction.ordinal()];
        if (i == 1) {
            e51.G(new Runnable() { // from class: l.wt00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21969a.m5229c1();
                }
            });
            return;
        }
        if (i == 2) {
            m5226V0();
        } else if (i != 3) {
            return;
        }
        m5229c1();
        C0301b c0301b = this.f3814f;
        if (c0301b.f3821a) {
            mo5259s(c0301b.f3822b, ByteDanceHelper.MakeupStyleType.FILTER, c0301b.f3823c);
            C0301b c0301b2 = this.f3814f;
            mo5259s(c0301b2.f3822b, ByteDanceHelper.MakeupStyleType.MAKEUP, c0301b2.f3824d);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m5242Y0() {
        this.f3809a.f17744c.m22662l1(new e30() { // from class: l.ut00
            public final void call(Object obj) {
                this.f20785a.m5241X0((CoreEngineAction) obj);
            }
        });
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: a0 */
    public void mo5243a0(float f) {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            f4mVar.setMusicVolume(f);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m5244a1() {
        this.f3816h = true;
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: b0 */
    public SurroundState mo5245b0() {
        return this.f3812d;
    }

    /* JADX INFO: renamed from: b1 */
    public void m5246b1() {
        this.f3810b = null;
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: c */
    public long mo5247c() {
        return this.f3810b.c();
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: d */
    public float mo5248d() {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            return f4mVar.d();
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: d1 */
    public void m5249d1(String str) {
        this.f3810b.v(str);
    }

    /* JADX INFO: renamed from: e1 */
    public void m5250e1() {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            f4mVar.stopAllEffect();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final synchronized void m5251f1(SurroundState surroundState) {
        this.f3812d = surroundState;
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: h */
    public int mo5252h(int i) {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            return f4mVar.h(i);
        }
        return -1;
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: i */
    public float mo5253i() {
        return this.f3810b.i();
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: j */
    public void mo5254j() {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            f4mVar.j();
            m5251f1(SurroundState.PAUSE);
        }
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: k */
    public int mo5255k() {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            return f4mVar.k();
        }
        return -1;
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: m */
    public void mo5256m(String str) {
        this.f3814f.f3825e = str;
        this.f3810b.m(str);
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: q */
    public void mo5257q() {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            f4mVar.q();
            m5251f1(SurroundState.STARTING);
        }
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: r */
    public long mo5258r() {
        return this.f3810b.r();
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: s */
    public void mo5259s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f) {
        if (m5227W0("updateMakeupStyleValue")) {
            return;
        }
        C0301b c0301b = this.f3814f;
        c0301b.f3822b = i;
        c0301b.f3821a = true;
        if (makeupStyleType == ByteDanceHelper.MakeupStyleType.FILTER) {
            c0301b.f3823c = f;
        } else {
            c0301b.f3824d = f;
        }
        ByteDanceHelper.g(this.f3810b, i, makeupStyleType, f);
    }

    @Override // p002l.bxl
    public void setIntensity(float f) {
        this.f3814f.f3826f = f;
        if (this.f3813e.i()) {
            this.f3810b.x(f);
        }
    }

    @Override // p002l.bxl
    public void stopEffect(int i) {
        f4m f4mVar = this.f3810b;
        if (f4mVar != null) {
            f4mVar.stopEffect(i);
        }
    }

    @Override // p002l.bxl
    public void stopSurroundMusic() {
        gkh0.j("[live]sdk_engine", "stopSurroundMusic");
        m5251f1(SurroundState.STOPPING);
        f4m f4mVar = this.f3810b;
        if (f4mVar == null) {
            return;
        }
        f4mVar.stopSurroundMusic();
        m5251f1(SurroundState.STOPPED);
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: t */
    public List<TTPresetFilter> mo5260t() {
        return this.f3811c;
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: t0 */
    public void mo5261t0(String str, String str2) {
        gkh0.j("[live]sdk_engine", "addGestureModel. typeName:" + str + " modelPath:" + str2);
        pph0 pph0VarB = qph0.a().b(ypv.e, str2);
        if (NullChecker.a(pph0VarB)) {
            pph0VarB.f(pph0.a());
            pph0VarB.e(3000L);
            this.f3810b.V(str, pph0VarB);
        }
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: u */
    public void mo5262u(int i, String str, boolean z, boolean z2) {
        if (this.f3810b == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f3810b.u(i, str, z, z2);
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: v */
    public c<roj0> mo5263v() {
        return this.f3813e.asObservable();
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: x */
    public void mo5264x(List<TTPresetFilter> list) {
        if (this.f3811c.isEmpty()) {
            this.f3811c.addAll(list);
            f4m f4mVar = this.f3810b;
            if (f4mVar != null) {
                f4mVar.F(this.f3811c);
            }
        }
    }

    @Override // p002l.bxl
    /* JADX INFO: renamed from: z */
    public void mo5265z(MomoMediaConstants.BEAUTY_TYPE beauty_type, String str) {
        if (beauty_type == MomoMediaConstants.BEAUTY_TYPE.BEAUTY_TYPE_BYTE) {
            dkw.g(str);
        } else if (beauty_type == MomoMediaConstants.BEAUTY_TYPE.BEAUTY_TYPE_ENGINE) {
            this.f3810b.t(str);
        }
        this.f3815g = true;
    }
}
