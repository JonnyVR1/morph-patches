package p153l;

import android.text.TextUtils;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p051p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.momoengine.CoreEngineAction;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class j210 extends eas implements vzl {

    /* JADX INFO: renamed from: a */
    public final v1f f118010a;

    /* JADX INFO: renamed from: b */
    public v6m f118011b;

    /* JADX INFO: renamed from: f */
    public boolean f118015f;

    /* JADX INFO: renamed from: g */
    public boolean f118016g;

    /* JADX INFO: renamed from: i */
    public wxh0 f118018i;

    /* JADX INFO: renamed from: c */
    public final List<TTPresetFilter> f118012c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public final C22507a<uxj0> f118013d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public C17854b f118014e = new C17854b();

    /* JADX INFO: renamed from: h */
    public String f118017h = null;

    /* JADX INFO: renamed from: l.j210$a */
    public static /* synthetic */ class C17853a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f118019a;

        static {
            int[] iArr = new int[CoreEngineAction.values().length];
            f118019a = iArr;
            try {
                iArr[CoreEngineAction.ACTION_SWITCH_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118019a[CoreEngineAction.ACTION_AFTER_PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f118019a[CoreEngineAction.ACTION_BEFORE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.j210$b */
    public static class C17854b {

        /* JADX INFO: renamed from: a */
        public boolean f118020a;

        /* JADX INFO: renamed from: b */
        public int f118021b;

        /* JADX INFO: renamed from: c */
        public float f118022c;

        /* JADX INFO: renamed from: d */
        public float f118023d;

        /* JADX INFO: renamed from: e */
        public String f118024e = "";

        /* JADX INFO: renamed from: f */
        public float f118025f = 0.0f;
    }

    public j210(v1f v1fVar) {
        this.f118010a = v1fVar;
        this.f118011b = v1fVar.f181962b;
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: B */
    public void mo143167B(int i, wxh0 wxh0Var) {
        if (TextUtils.isEmpty(wxh0Var.m208417d())) {
            this.f118011b.mo69752h0(i, wxh0Var);
        } else {
            this.f118018i = wxh0Var;
            this.f118011b.mo69718H(wxh0Var);
        }
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: F */
    public void mo143168F() {
        if (m143172W0("removeMakeupStyle")) {
            return;
        }
        C17854b c17854b = this.f118014e;
        c17854b.f118020a = false;
        c17854b.f118023d = 0.0f;
        c17854b.f118022c = 0.0f;
        ByteDanceHelper.m69695g(this.f118011b, c17854b.f118021b, ByteDanceHelper.MakeupStyleType.FILTER, 0.0f);
        v6m v6mVar = this.f118011b;
        C17854b c17854b2 = this.f118014e;
        ByteDanceHelper.m69695g(v6mVar, c17854b2.f118021b, ByteDanceHelper.MakeupStyleType.MAKEUP, c17854b2.f118023d);
        ByteDanceHelper.m69693e(this.f118011b);
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: G */
    public void mo143169G(int i) {
        v6m v6mVar = this.f118011b;
        if (v6mVar == null) {
            return;
        }
        wxh0 wxh0Var = this.f118018i;
        if (wxh0Var != null) {
            v6mVar.mo69727Q(wxh0Var);
        }
        this.f118011b.mo69754i0(i);
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: L */
    public void mo143170L(int i, float f) {
        if (m143172W0("updateBeautyValue")) {
            return;
        }
        ByteDanceHelper.m69694f(this.f118011b, i, f);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m143171V0() {
        this.f118013d.onNext(uxj0.f181467a);
        C17854b c17854b = this.f118014e;
        if (c17854b.f118020a) {
            return;
        }
        mo143179m(c17854b.f118024e);
        setIntensity(this.f118014e.f118025f);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m143172W0(String str) {
        boolean z = (this.f118016g && this.f118015f) ? false : true;
        if (z && !TextUtils.equals(str, this.f118017h)) {
            nsh0.m164608j("[live]sdk_engine", "beauty unprepared when call " + str);
            this.f118017h = str;
        }
        return z;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m143173X0(CoreEngineAction coreEngineAction) {
        int i = C17853a.f118019a[coreEngineAction.ordinal()];
        if (i == 1) {
            l51.m152887G(new Runnable() { // from class: l.g210
                @Override // java.lang.Runnable
                public final void run() {
                    this.f101806a.m143178c1();
                }
            });
            return;
        }
        if (i == 2) {
            m143171V0();
        } else if (i != 3) {
            return;
        }
        m143178c1();
        C17854b c17854b = this.f118014e;
        if (c17854b.f118020a) {
            mo143180s(c17854b.f118021b, ByteDanceHelper.MakeupStyleType.FILTER, c17854b.f118022c);
            C17854b c17854b2 = this.f118014e;
            mo143180s(c17854b2.f118021b, ByteDanceHelper.MakeupStyleType.MAKEUP, c17854b2.f118023d);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m143174Y0() {
        this.f118010a.f181963c.m95605d1(new y20() { // from class: l.e210
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91695a.m143173X0((CoreEngineAction) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m143175Z0(BLiveBeautyItem bLiveBeautyItem) {
        mo143170L(bLiveBeautyItem.f45185id, new nxd0(uyr.m198701l(bLiveBeautyItem.f45185id, mbs.m157870o0()), bLiveBeautyItem.getDefaultBeautyValue()).get().floatValue());
    }

    /* JADX INFO: renamed from: a1 */
    public void m143176a1() {
        this.f118016g = true;
    }

    /* JADX INFO: renamed from: b1 */
    public void m143177b1() {
        this.f118011b = null;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m143178c1() {
        List<BLiveBeautyItem> listM193611K = zrv.f205801c.m193611K();
        if (jyb.m147479J(listM193611K)) {
            return;
        }
        jyb.m147537z(listM193611K, new y20() { // from class: l.i210
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112578a.m143175Z0((BLiveBeautyItem) obj);
            }
        });
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: m */
    public void mo143179m(String str) {
        this.f118014e.f118024e = str;
        this.f118011b.mo69759m(str);
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: s */
    public void mo143180s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f) {
        if (m143172W0("updateMakeupStyleValue")) {
            return;
        }
        C17854b c17854b = this.f118014e;
        c17854b.f118021b = i;
        c17854b.f118020a = true;
        if (makeupStyleType == ByteDanceHelper.MakeupStyleType.FILTER) {
            c17854b.f118022c = f;
        } else {
            c17854b.f118023d = f;
        }
        ByteDanceHelper.m69695g(this.f118011b, i, makeupStyleType, f);
    }

    @Override // p153l.vzl
    public void setIntensity(float f) {
        this.f118014e.f118025f = f;
        if (this.f118013d.m222765i()) {
            this.f118011b.mo69770x(f);
        }
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: t */
    public List<TTPresetFilter> mo143181t() {
        return this.f118012c;
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: v */
    public C22421c<uxj0> mo143182v() {
        return this.f118013d.asObservable();
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: x */
    public void mo143183x(List<TTPresetFilter> list) {
        if (this.f118012c.isEmpty()) {
            this.f118012c.addAll(list);
            v6m v6mVar = this.f118011b;
            if (v6mVar != null) {
                v6mVar.mo69716F(this.f118012c);
            }
        }
    }

    @Override // p153l.vzl
    /* JADX INFO: renamed from: z */
    public void mo143184z(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE, String str) {
        if (momoMediaConstants$BEAUTY_TYPE == MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE) {
            cnw.m111548g(str);
        } else if (momoMediaConstants$BEAUTY_TYPE == MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE) {
            this.f118011b.mo69766t(str);
        }
        this.f118015f = true;
    }
}
