package com.p046p1.mobile.putong.live.livingroom.archi.sdk.momoengine;

import android.text.TextUtils;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p046p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.momoengine.CoreEngineAction;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.bxl;
import p149l.d8s;
import p149l.dkw;
import p149l.e30;
import p149l.e51;
import p149l.f4m;
import p149l.gkh0;
import p149l.lpd0;
import p149l.pph0;
import p149l.q0f;
import p149l.qph0;
import p149l.roj0;
import p149l.twr;
import p149l.vwb;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class MomoEffectEngine extends d8s implements bxl {

    /* JADX INFO: renamed from: a */
    public final q0f f47767a;

    /* JADX INFO: renamed from: b */
    public f4m f47768b;

    /* JADX INFO: renamed from: g */
    public boolean f47773g;

    /* JADX INFO: renamed from: h */
    public boolean f47774h;

    /* JADX INFO: renamed from: j */
    public pph0 f47776j;

    /* JADX INFO: renamed from: c */
    public final List<TTPresetFilter> f47769c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public volatile SurroundState f47770d = SurroundState.UNKNOW;

    /* JADX INFO: renamed from: e */
    public final C22392a<roj0> f47771e = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public C12712b f47772f = new C12712b();

    /* JADX INFO: renamed from: i */
    public int f47775i = -1;

    /* JADX INFO: renamed from: k */
    public String f47777k = null;

    public enum SurroundState {
        UNKNOW,
        STARTING,
        STARTED,
        STOPPING,
        STOPPED,
        PAUSE
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine$a */
    public static /* synthetic */ class C12711a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f47778a;

        static {
            int[] iArr = new int[CoreEngineAction.values().length];
            f47778a = iArr;
            try {
                iArr[CoreEngineAction.ACTION_SWITCH_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47778a[CoreEngineAction.ACTION_AFTER_PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47778a[CoreEngineAction.ACTION_BEFORE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine$b */
    public static class C12712b {

        /* JADX INFO: renamed from: a */
        public boolean f47779a;

        /* JADX INFO: renamed from: b */
        public int f47780b;

        /* JADX INFO: renamed from: c */
        public float f47781c;

        /* JADX INFO: renamed from: d */
        public float f47782d;

        /* JADX INFO: renamed from: e */
        public String f47783e = "";

        /* JADX INFO: renamed from: f */
        public float f47784f = 0.0f;
    }

    public MomoEffectEngine(q0f q0fVar) {
        this.f47767a = q0fVar;
        this.f47768b = q0fVar.f152050b;
    }

    /* JADX INFO: renamed from: V0 */
    private void m71848V0() {
        this.f47771e.onNext(roj0.f160388a);
        C12712b c12712b = this.f47772f;
        if (c12712b.f47779a) {
            return;
        }
        mo71878m(c12712b.f47783e);
        setIntensity(this.f47772f.f47784f);
    }

    /* JADX INFO: renamed from: W0 */
    private boolean m71849W0(String str) {
        boolean z = (this.f47774h && this.f47773g) ? false : true;
        if (z && !TextUtils.equals(str, this.f47777k)) {
            gkh0.m126627j("[live]sdk_engine", "beauty unprepared when call " + str);
            this.f47777k = str;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public /* synthetic */ void m71850Z0(BLiveBeautyItem bLiveBeautyItem) {
        lpd0 lpd0Var = new lpd0(twr.m190885b(bLiveBeautyItem.f44337id, ypv.f199493a.m199309D0()), bLiveBeautyItem.getDefaultBeautyValue());
        bLiveBeautyItem.getValue();
        Objects.toString(lpd0Var.get());
        mo71860L(bLiveBeautyItem.f44337id, lpd0Var.get().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public void m71851c1() {
        List<BLiveBeautyItem> listM186346K = ypv.f199495c.m186346K();
        if (vwb.m200296J(listM186346K)) {
            return;
        }
        vwb.m200354z(listM186346K, new e30() { // from class: l.yt00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199880a.m71850Z0((BLiveBeautyItem) obj);
            }
        });
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: A */
    public void mo71852A(float f) {
        if (NullChecker.m81303a(this.f47768b)) {
            this.f47768b.mo68528A(f);
        }
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: B */
    public void mo71853B(int i, pph0 pph0Var) {
        if (TextUtils.isEmpty(pph0Var.m170725d())) {
            this.f47768b.mo68569h0(i, pph0Var);
        } else {
            this.f47776j = pph0Var;
            this.f47768b.mo68535H(pph0Var);
        }
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: D */
    public void mo71854D(byte[] bArr) {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            f4mVar.mo68531D(bArr);
        }
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: D0 */
    public void mo71855D0(String str) {
        gkh0.m126627j("[live]sdk_engine", "removeGestureModel. typeName:" + str);
        this.f47768b.mo68556b(str);
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: E */
    public void mo71856E(String str, boolean z) {
        gkh0.m126627j("[live]sdk_engine", "startSurroundMusic:" + str);
        m71873f1(SurroundState.STARTING);
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            f4mVar.mo68532E(str, z);
            m71873f1(SurroundState.STARTED);
        }
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: F */
    public void mo71857F() {
        if (m71849W0("removeMakeupStyle")) {
            return;
        }
        C12712b c12712b = this.f47772f;
        c12712b.f47779a = false;
        c12712b.f47782d = 0.0f;
        c12712b.f47781c = 0.0f;
        ByteDanceHelper.m68512g(this.f47768b, c12712b.f47780b, ByteDanceHelper.MakeupStyleType.FILTER, 0.0f);
        f4m f4mVar = this.f47768b;
        C12712b c12712b2 = this.f47772f;
        ByteDanceHelper.m68512g(f4mVar, c12712b2.f47780b, ByteDanceHelper.MakeupStyleType.MAKEUP, c12712b2.f47782d);
        ByteDanceHelper.m68510e(this.f47768b);
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: G */
    public void mo71858G(int i) {
        pph0 pph0Var = this.f47776j;
        if (pph0Var != null) {
            this.f47768b.mo68544Q(pph0Var);
        }
        this.f47768b.mo68571i0(i);
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: H */
    public int mo71859H(Boolean bool) {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            return f4mVar.mo68553Z(bool);
        }
        return -1;
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: L */
    public void mo71860L(int i, float f) {
        if (m71849W0("updateBeautyValue")) {
            return;
        }
        ByteDanceHelper.m68511f(this.f47768b, i, f);
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: M */
    public void mo71861M(Boolean bool) {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            f4mVar.mo68540M(bool);
        }
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: Q0 */
    public int mo71862Q0(int i) {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            return f4mVar.selectAudioTrack(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m71863X0(CoreEngineAction coreEngineAction) {
        int i = C12711a.f47778a[coreEngineAction.ordinal()];
        if (i == 1) {
            e51.m114742G(new Runnable() { // from class: l.wt00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187989a.m71851c1();
                }
            });
            return;
        }
        if (i == 2) {
            m71848V0();
        } else if (i != 3) {
            return;
        }
        m71851c1();
        C12712b c12712b = this.f47772f;
        if (c12712b.f47779a) {
            mo71881s(c12712b.f47780b, ByteDanceHelper.MakeupStyleType.FILTER, c12712b.f47781c);
            C12712b c12712b2 = this.f47772f;
            mo71881s(c12712b2.f47780b, ByteDanceHelper.MakeupStyleType.MAKEUP, c12712b2.f47782d);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m71864Y0() {
        this.f47767a.f152051c.m185832l1(new e30() { // from class: l.ut00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178219a.m71863X0((CoreEngineAction) obj);
            }
        });
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: a0 */
    public void mo71865a0(float f) {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            f4mVar.setMusicVolume(f);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m71866a1() {
        this.f47774h = true;
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: b0 */
    public SurroundState mo71867b0() {
        return this.f47770d;
    }

    /* JADX INFO: renamed from: b1 */
    public void m71868b1() {
        this.f47768b = null;
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: c */
    public long mo71869c() {
        return this.f47768b.mo68558c();
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: d */
    public float mo71870d() {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            return f4mVar.mo68560d();
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: d1 */
    public void m71871d1(String str) {
        this.f47768b.mo68585v(str);
    }

    /* JADX INFO: renamed from: e1 */
    public void m71872e1() {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            f4mVar.stopAllEffect();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final synchronized void m71873f1(SurroundState surroundState) {
        this.f47770d = surroundState;
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: h */
    public int mo71874h(int i) {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            return f4mVar.mo68568h(i);
        }
        return -1;
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: i */
    public float mo71875i() {
        return this.f47768b.mo68570i();
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: j */
    public void mo71876j() {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            f4mVar.mo68572j();
            m71873f1(SurroundState.PAUSE);
        }
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: k */
    public int mo71877k() {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            return f4mVar.mo68574k();
        }
        return -1;
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: m */
    public void mo71878m(String str) {
        this.f47772f.f47783e = str;
        this.f47768b.mo68576m(str);
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: q */
    public void mo71879q() {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            f4mVar.mo68580q();
            m71873f1(SurroundState.STARTING);
        }
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: r */
    public long mo71880r() {
        return this.f47768b.mo68581r();
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: s */
    public void mo71881s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f) {
        if (m71849W0("updateMakeupStyleValue")) {
            return;
        }
        C12712b c12712b = this.f47772f;
        c12712b.f47780b = i;
        c12712b.f47779a = true;
        if (makeupStyleType == ByteDanceHelper.MakeupStyleType.FILTER) {
            c12712b.f47781c = f;
        } else {
            c12712b.f47782d = f;
        }
        ByteDanceHelper.m68512g(this.f47768b, i, makeupStyleType, f);
    }

    @Override // p149l.bxl
    public void setIntensity(float f) {
        this.f47772f.f47784f = f;
        if (this.f47771e.m221519i()) {
            this.f47768b.mo68587x(f);
        }
    }

    @Override // p149l.bxl
    public void stopEffect(int i) {
        f4m f4mVar = this.f47768b;
        if (f4mVar != null) {
            f4mVar.stopEffect(i);
        }
    }

    @Override // p149l.bxl
    public void stopSurroundMusic() {
        gkh0.m126627j("[live]sdk_engine", "stopSurroundMusic");
        m71873f1(SurroundState.STOPPING);
        f4m f4mVar = this.f47768b;
        if (f4mVar == null) {
            return;
        }
        f4mVar.stopSurroundMusic();
        m71873f1(SurroundState.STOPPED);
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: t */
    public List<TTPresetFilter> mo71882t() {
        return this.f47769c;
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: t0 */
    public void mo71883t0(String str, String str2) {
        gkh0.m126627j("[live]sdk_engine", "addGestureModel. typeName:" + str + " modelPath:" + str2);
        pph0 pph0VarM175842b = qph0.m175841a().m175842b(ypv.f199497e, str2);
        if (NullChecker.m81303a(pph0VarM175842b)) {
            pph0VarM175842b.m170727f(pph0.m170722a());
            pph0VarM175842b.m170726e(3000L);
            this.f47768b.mo68549V(str, pph0VarM175842b);
        }
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: u */
    public void mo71884u(int i, String str, boolean z, boolean z2) {
        if (this.f47768b == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f47768b.mo68584u(i, str, z, z2);
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: v */
    public C22306c<roj0> mo71885v() {
        return this.f47771e.asObservable();
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: x */
    public void mo71886x(List<TTPresetFilter> list) {
        if (this.f47769c.isEmpty()) {
            this.f47769c.addAll(list);
            f4m f4mVar = this.f47768b;
            if (f4mVar != null) {
                f4mVar.mo68533F(this.f47769c);
            }
        }
    }

    @Override // p149l.bxl
    /* JADX INFO: renamed from: z */
    public void mo71887z(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE, String str) {
        if (momoMediaConstants$BEAUTY_TYPE == MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE) {
            dkw.m112280g(str);
        } else if (momoMediaConstants$BEAUTY_TYPE == MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE) {
            this.f47768b.mo68583t(str);
        }
        this.f47773g = true;
    }
}
