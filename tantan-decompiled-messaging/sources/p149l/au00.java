package p149l;

import android.text.TextUtils;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p046p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.momoengine.CoreEngineAction;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class au00 extends d8s implements cxl {

    /* JADX INFO: renamed from: a */
    public final r0f f71697a;

    /* JADX INFO: renamed from: b */
    public f4m f71698b;

    /* JADX INFO: renamed from: f */
    public boolean f71702f;

    /* JADX INFO: renamed from: g */
    public boolean f71703g;

    /* JADX INFO: renamed from: i */
    public pph0 f71705i;

    /* JADX INFO: renamed from: c */
    public final List<TTPresetFilter> f71699c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public final C22392a<roj0> f71700d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public C15715b f71701e = new C15715b();

    /* JADX INFO: renamed from: h */
    public String f71704h = null;

    /* JADX INFO: renamed from: l.au00$a */
    public static /* synthetic */ class C15714a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f71706a;

        static {
            int[] iArr = new int[CoreEngineAction.values().length];
            f71706a = iArr;
            try {
                iArr[CoreEngineAction.ACTION_SWITCH_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71706a[CoreEngineAction.ACTION_AFTER_PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71706a[CoreEngineAction.ACTION_BEFORE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.au00$b */
    public static class C15715b {

        /* JADX INFO: renamed from: a */
        public boolean f71707a;

        /* JADX INFO: renamed from: b */
        public int f71708b;

        /* JADX INFO: renamed from: c */
        public float f71709c;

        /* JADX INFO: renamed from: d */
        public float f71710d;

        /* JADX INFO: renamed from: e */
        public String f71711e = "";

        /* JADX INFO: renamed from: f */
        public float f71712f = 0.0f;
    }

    public au00(r0f r0fVar) {
        this.f71697a = r0fVar;
        this.f71698b = r0fVar.f157167b;
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: B */
    public void mo98890B(int i, pph0 pph0Var) {
        if (TextUtils.isEmpty(pph0Var.m170725d())) {
            this.f71698b.mo68569h0(i, pph0Var);
        } else {
            this.f71705i = pph0Var;
            this.f71698b.mo68535H(pph0Var);
        }
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: F */
    public void mo98891F() {
        if (m98895W0("removeMakeupStyle")) {
            return;
        }
        C15715b c15715b = this.f71701e;
        c15715b.f71707a = false;
        c15715b.f71710d = 0.0f;
        c15715b.f71709c = 0.0f;
        ByteDanceHelper.m68512g(this.f71698b, c15715b.f71708b, ByteDanceHelper.MakeupStyleType.FILTER, 0.0f);
        f4m f4mVar = this.f71698b;
        C15715b c15715b2 = this.f71701e;
        ByteDanceHelper.m68512g(f4mVar, c15715b2.f71708b, ByteDanceHelper.MakeupStyleType.MAKEUP, c15715b2.f71710d);
        ByteDanceHelper.m68510e(this.f71698b);
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: G */
    public void mo98892G(int i) {
        f4m f4mVar = this.f71698b;
        if (f4mVar == null) {
            return;
        }
        pph0 pph0Var = this.f71705i;
        if (pph0Var != null) {
            f4mVar.mo68544Q(pph0Var);
        }
        this.f71698b.mo68571i0(i);
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: L */
    public void mo98893L(int i, float f) {
        if (m98895W0("updateBeautyValue")) {
            return;
        }
        ByteDanceHelper.m68511f(this.f71698b, i, f);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m98894V0() {
        this.f71700d.onNext(roj0.f160388a);
        C15715b c15715b = this.f71701e;
        if (c15715b.f71707a) {
            return;
        }
        mo98902m(c15715b.f71711e);
        setIntensity(this.f71701e.f71712f);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m98895W0(String str) {
        boolean z = (this.f71703g && this.f71702f) ? false : true;
        if (z && !TextUtils.equals(str, this.f71704h)) {
            gkh0.m126627j("[live]sdk_engine", "beauty unprepared when call " + str);
            this.f71704h = str;
        }
        return z;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m98896X0(CoreEngineAction coreEngineAction) {
        int i = C15714a.f71706a[coreEngineAction.ordinal()];
        if (i == 1) {
            e51.m114742G(new Runnable() { // from class: l.xt00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194344a.m98901c1();
                }
            });
            return;
        }
        if (i == 2) {
            m98894V0();
        } else if (i != 3) {
            return;
        }
        m98901c1();
        C15715b c15715b = this.f71701e;
        if (c15715b.f71707a) {
            mo98903s(c15715b.f71708b, ByteDanceHelper.MakeupStyleType.FILTER, c15715b.f71709c);
            C15715b c15715b2 = this.f71701e;
            mo98903s(c15715b2.f71708b, ByteDanceHelper.MakeupStyleType.MAKEUP, c15715b2.f71710d);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m98897Y0() {
        this.f71697a.f157168c.m180765d1(new e30() { // from class: l.vt00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182899a.m98896X0((CoreEngineAction) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m98898Z0(BLiveBeautyItem bLiveBeautyItem) {
        mo98893L(bLiveBeautyItem.f44337id, new lpd0(twr.m190895l(bLiveBeautyItem.f44337id, l9s.m149093o0()), bLiveBeautyItem.getDefaultBeautyValue()).get().floatValue());
    }

    /* JADX INFO: renamed from: a1 */
    public void m98899a1() {
        this.f71703g = true;
    }

    /* JADX INFO: renamed from: b1 */
    public void m98900b1() {
        this.f71698b = null;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m98901c1() {
        List<BLiveBeautyItem> listM186346K = ypv.f199495c.m186346K();
        if (vwb.m200296J(listM186346K)) {
            return;
        }
        vwb.m200354z(listM186346K, new e30() { // from class: l.zt00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204664a.m98898Z0((BLiveBeautyItem) obj);
            }
        });
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: m */
    public void mo98902m(String str) {
        this.f71701e.f71711e = str;
        this.f71698b.mo68576m(str);
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: s */
    public void mo98903s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f) {
        if (m98895W0("updateMakeupStyleValue")) {
            return;
        }
        C15715b c15715b = this.f71701e;
        c15715b.f71708b = i;
        c15715b.f71707a = true;
        if (makeupStyleType == ByteDanceHelper.MakeupStyleType.FILTER) {
            c15715b.f71709c = f;
        } else {
            c15715b.f71710d = f;
        }
        ByteDanceHelper.m68512g(this.f71698b, i, makeupStyleType, f);
    }

    @Override // p149l.cxl
    public void setIntensity(float f) {
        this.f71701e.f71712f = f;
        if (this.f71700d.m221519i()) {
            this.f71698b.mo68587x(f);
        }
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: t */
    public List<TTPresetFilter> mo98904t() {
        return this.f71699c;
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: v */
    public C22306c<roj0> mo98905v() {
        return this.f71700d.asObservable();
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: x */
    public void mo98906x(List<TTPresetFilter> list) {
        if (this.f71699c.isEmpty()) {
            this.f71699c.addAll(list);
            f4m f4mVar = this.f71698b;
            if (f4mVar != null) {
                f4mVar.mo68533F(this.f71699c);
            }
        }
    }

    @Override // p149l.cxl
    /* JADX INFO: renamed from: z */
    public void mo98907z(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE, String str) {
        if (momoMediaConstants$BEAUTY_TYPE == MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE) {
            dkw.m112280g(str);
        } else if (momoMediaConstants$BEAUTY_TYPE == MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE) {
            this.f71698b.mo68583t(str);
        }
        this.f71702f = true;
    }
}
