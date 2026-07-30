package com.p051p1.mobile.putong.live.livingroom.archi.sdk.momoengine;

import android.text.TextUtils;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p051p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.momoengine.CoreEngineAction;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.cnw;
import p153l.eas;
import p153l.jyb;
import p153l.l51;
import p153l.nsh0;
import p153l.nxd0;
import p153l.u1f;
import p153l.uxj0;
import p153l.uyr;
import p153l.uzl;
import p153l.v6m;
import p153l.wxh0;
import p153l.xxh0;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class MomoEffectEngine extends eas implements uzl {

    /* JADX INFO: renamed from: a */
    public final u1f f48615a;

    /* JADX INFO: renamed from: b */
    public v6m f48616b;

    /* JADX INFO: renamed from: g */
    public boolean f48621g;

    /* JADX INFO: renamed from: h */
    public boolean f48622h;

    /* JADX INFO: renamed from: j */
    public wxh0 f48624j;

    /* JADX INFO: renamed from: c */
    public final List<TTPresetFilter> f48617c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public volatile SurroundState f48618d = SurroundState.UNKNOW;

    /* JADX INFO: renamed from: e */
    public final C22507a<uxj0> f48619e = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public C12875b f48620f = new C12875b();

    /* JADX INFO: renamed from: i */
    public int f48623i = -1;

    /* JADX INFO: renamed from: k */
    public String f48625k = null;

    public enum SurroundState {
        UNKNOW,
        STARTING,
        STARTED,
        STOPPING,
        STOPPED,
        PAUSE
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine$a */
    public static /* synthetic */ class C12874a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48626a;

        static {
            int[] iArr = new int[CoreEngineAction.values().length];
            f48626a = iArr;
            try {
                iArr[CoreEngineAction.ACTION_SWITCH_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48626a[CoreEngineAction.ACTION_AFTER_PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48626a[CoreEngineAction.ACTION_BEFORE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine$b */
    public static class C12875b {

        /* JADX INFO: renamed from: a */
        public boolean f48627a;

        /* JADX INFO: renamed from: b */
        public int f48628b;

        /* JADX INFO: renamed from: c */
        public float f48629c;

        /* JADX INFO: renamed from: d */
        public float f48630d;

        /* JADX INFO: renamed from: e */
        public String f48631e = "";

        /* JADX INFO: renamed from: f */
        public float f48632f = 0.0f;
    }

    public MomoEffectEngine(u1f u1fVar) {
        this.f48615a = u1fVar;
        this.f48616b = u1fVar.f176993b;
    }

    /* JADX INFO: renamed from: V0 */
    private void m73031V0() {
        this.f48619e.onNext(uxj0.f181467a);
        C12875b c12875b = this.f48620f;
        if (c12875b.f48627a) {
            return;
        }
        mo73061m(c12875b.f48631e);
        setIntensity(this.f48620f.f48632f);
    }

    /* JADX INFO: renamed from: W0 */
    private boolean m73032W0(String str) {
        boolean z = (this.f48622h && this.f48621g) ? false : true;
        if (z && !TextUtils.equals(str, this.f48625k)) {
            nsh0.m164608j("[live]sdk_engine", "beauty unprepared when call " + str);
            this.f48625k = str;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public /* synthetic */ void m73033Z0(BLiveBeautyItem bLiveBeautyItem) {
        nxd0 nxd0Var = new nxd0(uyr.m198691b(bLiveBeautyItem.f45185id, zrv.f205799a.m207631D0()), bLiveBeautyItem.getDefaultBeautyValue());
        bLiveBeautyItem.getValue();
        Objects.toString(nxd0Var.get());
        mo73043L(bLiveBeautyItem.f45185id, nxd0Var.get().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public void m73034c1() {
        List<BLiveBeautyItem> listM193611K = zrv.f205801c.m193611K();
        if (jyb.m147479J(listM193611K)) {
            return;
        }
        jyb.m147537z(listM193611K, new y20() { // from class: l.h210
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107518a.m73033Z0((BLiveBeautyItem) obj);
            }
        });
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: A */
    public void mo73035A(float f) {
        if (NullChecker.m82486a(this.f48616b)) {
            this.f48616b.mo69711A(f);
        }
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: B */
    public void mo73036B(int i, wxh0 wxh0Var) {
        if (TextUtils.isEmpty(wxh0Var.m208417d())) {
            this.f48616b.mo69752h0(i, wxh0Var);
        } else {
            this.f48624j = wxh0Var;
            this.f48616b.mo69718H(wxh0Var);
        }
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: D */
    public void mo73037D(byte[] bArr) {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            v6mVar.mo69714D(bArr);
        }
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: D0 */
    public void mo73038D0(String str) {
        nsh0.m164608j("[live]sdk_engine", "removeGestureModel. typeName:" + str);
        this.f48616b.mo69739b(str);
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: E */
    public void mo73039E(String str, boolean z) {
        nsh0.m164608j("[live]sdk_engine", "startSurroundMusic:" + str);
        m73056f1(SurroundState.STARTING);
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            v6mVar.mo69715E(str, z);
            m73056f1(SurroundState.STARTED);
        }
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: F */
    public void mo73040F() {
        if (m73032W0("removeMakeupStyle")) {
            return;
        }
        C12875b c12875b = this.f48620f;
        c12875b.f48627a = false;
        c12875b.f48630d = 0.0f;
        c12875b.f48629c = 0.0f;
        ByteDanceHelper.m69695g(this.f48616b, c12875b.f48628b, ByteDanceHelper.MakeupStyleType.FILTER, 0.0f);
        v6m v6mVar = this.f48616b;
        C12875b c12875b2 = this.f48620f;
        ByteDanceHelper.m69695g(v6mVar, c12875b2.f48628b, ByteDanceHelper.MakeupStyleType.MAKEUP, c12875b2.f48630d);
        ByteDanceHelper.m69693e(this.f48616b);
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: G */
    public void mo73041G(int i) {
        wxh0 wxh0Var = this.f48624j;
        if (wxh0Var != null) {
            this.f48616b.mo69727Q(wxh0Var);
        }
        this.f48616b.mo69754i0(i);
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: H */
    public int mo73042H(Boolean bool) {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            return v6mVar.mo69736Z(bool);
        }
        return -1;
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: L */
    public void mo73043L(int i, float f) {
        if (m73032W0("updateBeautyValue")) {
            return;
        }
        ByteDanceHelper.m69694f(this.f48616b, i, f);
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: M */
    public void mo73044M(Boolean bool) {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            v6mVar.mo69723M(bool);
        }
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: Q0 */
    public int mo73045Q0(int i) {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            return v6mVar.selectAudioTrack(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m73046X0(CoreEngineAction coreEngineAction) {
        int i = C12874a.f48626a[coreEngineAction.ordinal()];
        if (i == 1) {
            l51.m152887G(new Runnable() { // from class: l.f210
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96848a.m73034c1();
                }
            });
            return;
        }
        if (i == 2) {
            m73031V0();
        } else if (i != 3) {
            return;
        }
        m73034c1();
        C12875b c12875b = this.f48620f;
        if (c12875b.f48627a) {
            mo73064s(c12875b.f48628b, ByteDanceHelper.MakeupStyleType.FILTER, c12875b.f48629c);
            C12875b c12875b2 = this.f48620f;
            mo73064s(c12875b2.f48628b, ByteDanceHelper.MakeupStyleType.MAKEUP, c12875b2.f48630d);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m73047Y0() {
        this.f48615a.f176994c.m101595l1(new y20() { // from class: l.d210
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84747a.m73046X0((CoreEngineAction) obj);
            }
        });
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: a0 */
    public void mo73048a0(float f) {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            v6mVar.setMusicVolume(f);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m73049a1() {
        this.f48622h = true;
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: b0 */
    public SurroundState mo73050b0() {
        return this.f48618d;
    }

    /* JADX INFO: renamed from: b1 */
    public void m73051b1() {
        this.f48616b = null;
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: c */
    public long mo73052c() {
        return this.f48616b.mo69741c();
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: d */
    public float mo73053d() {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            return v6mVar.mo69743d();
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: d1 */
    public void m73054d1(String str) {
        this.f48616b.mo69768v(str);
    }

    /* JADX INFO: renamed from: e1 */
    public void m73055e1() {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            v6mVar.stopAllEffect();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final synchronized void m73056f1(SurroundState surroundState) {
        this.f48618d = surroundState;
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: h */
    public int mo73057h(int i) {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            return v6mVar.mo69751h(i);
        }
        return -1;
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: i */
    public float mo73058i() {
        return this.f48616b.mo69753i();
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: j */
    public void mo73059j() {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            v6mVar.mo69755j();
            m73056f1(SurroundState.PAUSE);
        }
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: k */
    public int mo73060k() {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            return v6mVar.mo69757k();
        }
        return -1;
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: m */
    public void mo73061m(String str) {
        this.f48620f.f48631e = str;
        this.f48616b.mo69759m(str);
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: q */
    public void mo73062q() {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            v6mVar.mo69763q();
            m73056f1(SurroundState.STARTING);
        }
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: r */
    public long mo73063r() {
        return this.f48616b.mo69764r();
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: s */
    public void mo73064s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f) {
        if (m73032W0("updateMakeupStyleValue")) {
            return;
        }
        C12875b c12875b = this.f48620f;
        c12875b.f48628b = i;
        c12875b.f48627a = true;
        if (makeupStyleType == ByteDanceHelper.MakeupStyleType.FILTER) {
            c12875b.f48629c = f;
        } else {
            c12875b.f48630d = f;
        }
        ByteDanceHelper.m69695g(this.f48616b, i, makeupStyleType, f);
    }

    @Override // p153l.uzl
    public void setIntensity(float f) {
        this.f48620f.f48632f = f;
        if (this.f48619e.m222765i()) {
            this.f48616b.mo69770x(f);
        }
    }

    @Override // p153l.uzl
    public void stopEffect(int i) {
        v6m v6mVar = this.f48616b;
        if (v6mVar != null) {
            v6mVar.stopEffect(i);
        }
    }

    @Override // p153l.uzl
    public void stopSurroundMusic() {
        nsh0.m164608j("[live]sdk_engine", "stopSurroundMusic");
        m73056f1(SurroundState.STOPPING);
        v6m v6mVar = this.f48616b;
        if (v6mVar == null) {
            return;
        }
        v6mVar.stopSurroundMusic();
        m73056f1(SurroundState.STOPPED);
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: t */
    public List<TTPresetFilter> mo73065t() {
        return this.f48617c;
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: t0 */
    public void mo73066t0(String str, String str2) {
        nsh0.m164608j("[live]sdk_engine", "addGestureModel. typeName:" + str + " modelPath:" + str2);
        wxh0 wxh0VarM213525b = xxh0.m213524a().m213525b(zrv.f205803e, str2);
        if (NullChecker.m82486a(wxh0VarM213525b)) {
            wxh0VarM213525b.m208419f(wxh0.m208414a());
            wxh0VarM213525b.m208418e(3000L);
            this.f48616b.mo69732V(str, wxh0VarM213525b);
        }
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: u */
    public void mo73067u(int i, String str, boolean z, boolean z2) {
        if (this.f48616b == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f48616b.mo69767u(i, str, z, z2);
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: v */
    public C22421c<uxj0> mo73068v() {
        return this.f48619e.asObservable();
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: x */
    public void mo73069x(List<TTPresetFilter> list) {
        if (this.f48617c.isEmpty()) {
            this.f48617c.addAll(list);
            v6m v6mVar = this.f48616b;
            if (v6mVar != null) {
                v6mVar.mo69716F(this.f48617c);
            }
        }
    }

    @Override // p153l.uzl
    /* JADX INFO: renamed from: z */
    public void mo73070z(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE, String str) {
        if (momoMediaConstants$BEAUTY_TYPE == MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE) {
            cnw.m111548g(str);
        } else if (momoMediaConstants$BEAUTY_TYPE == MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE) {
            this.f48616b.mo69766t(str);
        }
        this.f48621g = true;
    }
}
