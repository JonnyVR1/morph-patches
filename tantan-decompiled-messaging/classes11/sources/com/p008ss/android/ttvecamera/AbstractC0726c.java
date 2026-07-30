package com.p008ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.Cert;
import com.p008ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface;
import com.p008ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.p008ss.android.ttvecamera.cameracapabilitycollector.C0732a;
import com.p008ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p009l.cjh0;
import p009l.ti3;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class AbstractC0726c {

    /* JADX INFO: renamed from: b */
    protected TECameraSettings f9062b;

    /* JADX INFO: renamed from: d */
    protected a f9064d;

    /* JADX INFO: renamed from: e */
    protected Handler f9065e;

    /* JADX INFO: renamed from: f */
    protected Context f9066f;

    /* JADX INFO: renamed from: g */
    protected cjh0 f9067g;

    /* JADX INFO: renamed from: h */
    protected int f9068h;

    /* JADX INFO: renamed from: i */
    protected int f9069i;

    /* JADX INFO: renamed from: l */
    protected float f9072l;

    /* JADX INFO: renamed from: n */
    protected d f9074n;

    /* JADX INFO: renamed from: a */
    public boolean f9061a = false;

    /* JADX INFO: renamed from: c */
    protected boolean f9063c = false;

    /* JADX INFO: renamed from: j */
    protected int f9070j = -1;

    /* JADX INFO: renamed from: k */
    protected int f9071k = -1;

    /* JADX INFO: renamed from: m */
    protected int f9073m = 0;

    /* JADX INFO: renamed from: o */
    protected e f9075o = null;

    /* JADX INFO: renamed from: p */
    protected b f9076p = null;

    /* JADX INFO: renamed from: q */
    private AtomicBoolean f9077q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r */
    protected Map<String, Bundle> f9078r = new HashMap();

    /* JADX INFO: renamed from: s */
    protected Map<Integer, Bundle> f9079s = new HashMap();

    /* JADX INFO: renamed from: t */
    protected Cert f9080t = null;

    /* JADX INFO: renamed from: u */
    protected TECameraCapabilityCollector f9081u = new TECameraCapabilityCollector();

    /* JADX INFO: renamed from: v */
    public JSONObject f9082v = new JSONObject();

    /* JADX INFO: renamed from: w */
    protected boolean f9083w = false;

    /* JADX INFO: renamed from: x */
    public TECameraAlgorithmInterface f9084x = null;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10844a(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: b */
        void mo10845b(int i, int i2, String str, Object obj);

        /* JADX INFO: renamed from: c */
        void mo10846c(int i, int i2, String str, Object obj);

        /* JADX INFO: renamed from: d */
        void mo10847d(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: e */
        void mo10848e(int i, int i2, String str, Object obj);

        /* JADX INFO: renamed from: f */
        void mo10849f(int i, int i2, AbstractC0726c abstractC0726c, Object obj);

        /* JADX INFO: renamed from: g */
        void mo10850g(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: h */
        void mo10851h(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: i */
        void mo10852i(int i, AbstractC0726c abstractC0726c, Object obj);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        int[] mo10853a(List<int[]> list);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$c */
    public interface c {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        TEFrameSizei mo10854a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$e */
    public interface e {
        TEFrameSizei getPreviewSize(List<TEFrameSizei> list);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$f */
    public interface f {
    }

    public AbstractC0726c(Context context, a aVar, Handler handler, d dVar) {
        this.f9066f = context;
        this.f9064d = aVar;
        this.f9065e = handler;
        this.f9074n = dVar;
        this.f9081u.m11021c(new C0732a());
    }

    /* JADX INFO: renamed from: A */
    public Map<String, Bundle> m10992A() {
        return this.f9078r;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo10909A0(TECameraSettings.InterfaceC0717p interfaceC0717p);

    /* JADX INFO: renamed from: B */
    public int mo10910B() {
        return -1;
    }

    /* JADX INFO: renamed from: B0 */
    public abstract void mo10911B0(int i);

    /* JADX INFO: renamed from: C */
    public abstract int mo10912C();

    /* JADX INFO: renamed from: C0 */
    public abstract void mo10913C0(int i);

    /* JADX INFO: renamed from: D */
    public int m10993D() {
        if (this.f9077q.getAndSet(false)) {
            mo10912C();
        }
        return this.f9070j;
    }

    /* JADX INFO: renamed from: D0 */
    public abstract void mo10914D0(int i, int i2, TECameraSettings.InterfaceC0713l interfaceC0713l);

    /* JADX INFO: renamed from: E */
    public Handler m10994E() {
        return this.f9065e;
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo10915E0(TECameraSettings.InterfaceC0713l interfaceC0713l);

    /* JADX INFO: renamed from: F */
    public int mo10958F() {
        return -1;
    }

    /* JADX INFO: renamed from: F0 */
    public abstract void mo10916F0(boolean z);

    /* JADX INFO: renamed from: G */
    public int[] mo10959G() {
        return new int[]{-1, -1};
    }

    /* JADX INFO: renamed from: G0 */
    public void m10995G0(TECameraAlgorithmParam tECameraAlgorithmParam) {
    }

    /* JADX INFO: renamed from: H */
    public float mo10960H() {
        return -1.0f;
    }

    /* JADX INFO: renamed from: H0 */
    public abstract void mo10917H0(float f2, TECameraSettings.InterfaceC0717p interfaceC0717p);

    /* JADX INFO: renamed from: I */
    public int[] mo10918I() {
        TEFrameSizei tEFrameSizei = this.f9062b.f8967r;
        return new int[]{tEFrameSizei.width, tEFrameSizei.height};
    }

    /* JADX INFO: renamed from: J */
    public int[] mo10919J() {
        return null;
    }

    /* JADX INFO: renamed from: K */
    public cjh0 m10996K() {
        return this.f9067g;
    }

    /* JADX INFO: renamed from: L */
    public int m10997L() {
        return this.f9073m;
    }

    /* JADX INFO: renamed from: M */
    public long[] mo10965M() {
        return new long[]{-1, -1};
    }

    /* JADX INFO: renamed from: N */
    public List<TEFrameSizei> mo10920N() {
        C0743g.m11166b("TECameraBase", "getSupportedPictureSizes error");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public List<TEFrameSizei> mo10921O() {
        C0743g.m11166b("TECameraBase", "getSupportedPreviewSizes error");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public String m10998P() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public abstract boolean mo10922Q();

    /* JADX INFO: renamed from: R */
    public boolean mo10923R() {
        return false;
    }

    /* JADX INFO: renamed from: S */
    public boolean m10999S() {
        return this.f9062b.f8976v0 && !this.f9083w;
    }

    /* JADX INFO: renamed from: T */
    public abstract boolean mo10924T();

    /* JADX INFO: renamed from: U */
    public boolean mo10926U() {
        TECameraSettings.C0705d c0705d = this.f9062b.f8917K;
        return c0705d != null && c0705d.m10857a();
    }

    /* JADX INFO: renamed from: V */
    public abstract boolean mo10927V();

    /* JADX INFO: renamed from: W */
    public int mo10928W(TECameraSettings tECameraSettings, Cert cert) {
        this.f9073m = tECameraSettings.f8977w;
        C0743g.m11169e("TECameraBase", "set start preview retry count: " + this.f9073m);
        return 0;
    }

    /* JADX INFO: renamed from: X */
    public void m11000X(TECameraSettings.C0711j c0711j) {
    }

    /* JADX INFO: renamed from: Y */
    public TECameraFrame m11001Y(TECameraFrame tECameraFrame) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.f9084x;
        if (tECameraAlgorithmInterface != null) {
            return tECameraAlgorithmInterface.processAlgorithm(tECameraFrame);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo10929Z(TECameraSettings.InterfaceC0715n interfaceC0715n);

    /* JADX INFO: renamed from: a */
    public void mo10976a() {
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo10930a0(TECameraSettings.InterfaceC0717p interfaceC0717p, boolean z);

    /* JADX INFO: renamed from: b */
    public void m11002b(TECameraAlgorithmParam tECameraAlgorithmParam) {
    }

    /* JADX INFO: renamed from: b0 */
    public void m11003b0(b bVar) {
        this.f9076p = bVar;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo10931c();

    /* JADX INFO: renamed from: c0 */
    public void m11004c0(e eVar) {
        this.f9075o = eVar;
    }

    /* JADX INFO: renamed from: d */
    public void mo10979d(ti3 ti3Var, TECameraSettings.InterfaceC0704c interfaceC0704c) {
        interfaceC0704c.m10856a(new UnsupportedOperationException("unsupport capture burst, camera type:" + mo10950v()));
    }

    /* JADX INFO: renamed from: d0 */
    public void m11005d0(int i) {
    }

    /* JADX INFO: renamed from: e */
    public void m11006e(int i, c cVar) {
    }

    /* JADX INFO: renamed from: e0 */
    public void m11007e0() {
        int i = this.f9073m;
        if (i > 0) {
            this.f9073m = i - 1;
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo10932f(Cert cert) {
        C0743g.m11165a("TECameraBase", "close...");
    }

    /* JADX INFO: renamed from: f0 */
    public void mo10980f0(float f2) {
    }

    /* JADX INFO: renamed from: g */
    public void mo10933g() {
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo10934g0(boolean z);

    /* JADX INFO: renamed from: h */
    public Exception m11008h(Exception exc, int i) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception message";
        }
        return new Exception(message + ", errorCode=" + i);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo10935h0(boolean z) {
    }

    /* JADX INFO: renamed from: i */
    public void mo10981i() {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.f9084x;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.destroy();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m11009i0(int i) {
        this.f9071k = i;
        this.f9077q.set(true);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo10936j();

    /* JADX INFO: renamed from: j0 */
    public abstract boolean mo10937j0(int i);

    /* JADX INFO: renamed from: k */
    public void mo10982k(boolean z) {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo10938k0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: l */
    public Bundle mo10939l() {
        Bundle bundle;
        if (this.f9078r.containsKey(this.f9062b.f8914H)) {
            bundle = this.f9078r.get(this.f9062b.f8914H);
        } else {
            bundle = new Bundle();
            this.f9078r.put(this.f9062b.f8914H, bundle);
        }
        if (bundle != null) {
            bundle.putInt("facing", this.f9062b.f8939d);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: l0 */
    public void mo10983l0(int i) {
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo10940m(TEFocusSettings tEFocusSettings);

    /* JADX INFO: renamed from: m0 */
    public void mo10984m0(float f2) {
    }

    /* JADX INFO: renamed from: n */
    public void mo10941n(Cert cert) {
    }

    /* JADX INFO: renamed from: n0 */
    public void mo10942n0(int i, int i2) {
    }

    /* JADX INFO: renamed from: o */
    public float[] mo10985o() {
        return new float[]{-1.0f, -1.0f};
    }

    /* JADX INFO: renamed from: o0 */
    public void mo10943o0() {
    }

    /* JADX INFO: renamed from: p */
    public abstract TEFrameSizei mo10944p(float f2, TEFrameSizei tEFrameSizei);

    /* JADX INFO: renamed from: p0 */
    public void m11010p0(@NonNull cjh0 cjh0Var) {
        this.f9067g = cjh0Var;
    }

    /* JADX INFO: renamed from: q */
    public JSONObject mo10945q() {
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public void m11011q0(f fVar) {
    }

    /* JADX INFO: renamed from: r */
    public int[] mo10946r() {
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public void mo10947r0(int i) {
        C0743g.m11169e("TECameraBase", "scene mode: " + i);
    }

    /* JADX INFO: renamed from: s */
    public TECameraSettings.C0705d m11012s() {
        return this.f9062b.f8917K;
    }

    /* JADX INFO: renamed from: s0 */
    public void mo10986s0(long j) {
    }

    /* JADX INFO: renamed from: t */
    public a m11013t() {
        return this.f9064d;
    }

    /* JADX INFO: renamed from: t0 */
    public abstract void mo10948t0(boolean z, String str);

    /* JADX INFO: renamed from: u */
    public TECameraSettings m11014u() {
        return this.f9062b;
    }

    /* JADX INFO: renamed from: u0 */
    public abstract void mo10949u0();

    /* JADX INFO: renamed from: v */
    public abstract int mo10950v();

    /* JADX INFO: renamed from: v0 */
    public int mo10987v0() {
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public int m11015w() {
        TECameraSettings.C0705d c0705d = this.f9062b.f8917K;
        if (c0705d != null) {
            return c0705d.f8991b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: w0 */
    public abstract void mo10951w0(float f2, TECameraSettings.InterfaceC0717p interfaceC0717p);

    /* JADX INFO: renamed from: x */
    public abstract float[] mo10952x();

    /* JADX INFO: renamed from: x0 */
    public abstract void mo10953x0();

    /* JADX INFO: renamed from: y */
    public int m11016y() {
        return this.f9068h;
    }

    /* JADX INFO: renamed from: y0 */
    public int mo10988y0() {
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public Bundle m11017z(String str) {
        return this.f9078r.get(str);
    }

    /* JADX INFO: renamed from: z0 */
    public void m11018z0() {
        this.f9073m = 0;
    }
}
