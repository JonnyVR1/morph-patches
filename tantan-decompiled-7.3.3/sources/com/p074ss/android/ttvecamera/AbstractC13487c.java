package com.p074ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.Cert;
import com.p074ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface;
import com.p074ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.p074ss.android.ttvecamera.cameracapabilitycollector.C13493a;
import com.p074ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p153l.hj3;
import p153l.jrh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.c */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC13487c {

    /* JADX INFO: renamed from: b */
    protected TECameraSettings f56304b;

    /* JADX INFO: renamed from: d */
    protected a f56306d;

    /* JADX INFO: renamed from: e */
    protected Handler f56307e;

    /* JADX INFO: renamed from: f */
    protected Context f56308f;

    /* JADX INFO: renamed from: g */
    protected jrh0 f56309g;

    /* JADX INFO: renamed from: h */
    protected int f56310h;

    /* JADX INFO: renamed from: i */
    protected int f56311i;

    /* JADX INFO: renamed from: l */
    protected float f56314l;

    /* JADX INFO: renamed from: n */
    protected d f56316n;

    /* JADX INFO: renamed from: a */
    public boolean f56303a = false;

    /* JADX INFO: renamed from: c */
    protected boolean f56305c = false;

    /* JADX INFO: renamed from: j */
    protected int f56312j = -1;

    /* JADX INFO: renamed from: k */
    protected int f56313k = -1;

    /* JADX INFO: renamed from: m */
    protected int f56315m = 0;

    /* JADX INFO: renamed from: o */
    protected e f56317o = null;

    /* JADX INFO: renamed from: p */
    protected b f56318p = null;

    /* JADX INFO: renamed from: q */
    private AtomicBoolean f56319q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r */
    protected Map<String, Bundle> f56320r = new HashMap();

    /* JADX INFO: renamed from: s */
    protected Map<Integer, Bundle> f56321s = new HashMap();

    /* JADX INFO: renamed from: t */
    protected Cert f56322t = null;

    /* JADX INFO: renamed from: u */
    protected TECameraCapabilityCollector f56323u = new TECameraCapabilityCollector();

    /* JADX INFO: renamed from: v */
    public JSONObject f56324v = new JSONObject();

    /* JADX INFO: renamed from: w */
    protected boolean f56325w = false;

    /* JADX INFO: renamed from: x */
    public TECameraAlgorithmInterface f56326x = null;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo81676a(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: b */
        void mo81677b(int i, int i2, String str, Object obj);

        /* JADX INFO: renamed from: c */
        void mo81678c(int i, int i2, String str, Object obj);

        /* JADX INFO: renamed from: d */
        void mo81679d(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: e */
        void mo81680e(int i, int i2, String str, Object obj);

        /* JADX INFO: renamed from: f */
        void mo81681f(int i, int i2, AbstractC13487c abstractC13487c, Object obj);

        /* JADX INFO: renamed from: g */
        void mo81682g(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: h */
        void mo81683h(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: i */
        void mo81684i(int i, AbstractC13487c abstractC13487c, Object obj);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        int[] mo81685a(List<int[]> list);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$c */
    public interface c {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        TEFrameSizei mo81686a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$e */
    public interface e {
        TEFrameSizei getPreviewSize(List<TEFrameSizei> list);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$f */
    public interface f {
    }

    public AbstractC13487c(Context context, a aVar, Handler handler, d dVar) {
        this.f56308f = context;
        this.f56306d = aVar;
        this.f56307e = handler;
        this.f56316n = dVar;
        this.f56323u.m81853c(new C13493a());
    }

    /* JADX INFO: renamed from: A */
    public Map<String, Bundle> m81824A() {
        return this.f56320r;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo81741A0(TECameraSettings.InterfaceC13478p interfaceC13478p);

    /* JADX INFO: renamed from: B */
    public int mo81742B() {
        return -1;
    }

    /* JADX INFO: renamed from: B0 */
    public abstract void mo81743B0(int i);

    /* JADX INFO: renamed from: C */
    public abstract int mo81744C();

    /* JADX INFO: renamed from: C0 */
    public abstract void mo81745C0(int i);

    /* JADX INFO: renamed from: D */
    public int m81825D() {
        if (this.f56319q.getAndSet(false)) {
            mo81744C();
        }
        return this.f56312j;
    }

    /* JADX INFO: renamed from: D0 */
    public abstract void mo81746D0(int i, int i2, TECameraSettings.InterfaceC13474l interfaceC13474l);

    /* JADX INFO: renamed from: E */
    public Handler m81826E() {
        return this.f56307e;
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo81747E0(TECameraSettings.InterfaceC13474l interfaceC13474l);

    /* JADX INFO: renamed from: F */
    public int mo81790F() {
        return -1;
    }

    /* JADX INFO: renamed from: F0 */
    public abstract void mo81748F0(boolean z);

    /* JADX INFO: renamed from: G */
    public int[] mo81791G() {
        return new int[]{-1, -1};
    }

    /* JADX INFO: renamed from: G0 */
    public void m81827G0(TECameraAlgorithmParam tECameraAlgorithmParam) {
    }

    /* JADX INFO: renamed from: H */
    public float mo81792H() {
        return -1.0f;
    }

    /* JADX INFO: renamed from: H0 */
    public abstract void mo81749H0(float f2, TECameraSettings.InterfaceC13478p interfaceC13478p);

    /* JADX INFO: renamed from: I */
    public int[] mo81750I() {
        TEFrameSizei tEFrameSizei = this.f56304b.f56209r;
        return new int[]{tEFrameSizei.width, tEFrameSizei.height};
    }

    /* JADX INFO: renamed from: J */
    public int[] mo81751J() {
        return null;
    }

    /* JADX INFO: renamed from: K */
    public jrh0 m81828K() {
        return this.f56309g;
    }

    /* JADX INFO: renamed from: L */
    public int m81829L() {
        return this.f56315m;
    }

    /* JADX INFO: renamed from: M */
    public long[] mo81797M() {
        return new long[]{-1, -1};
    }

    /* JADX INFO: renamed from: N */
    public List<TEFrameSizei> mo81752N() {
        C13504g.m81998b("TECameraBase", "getSupportedPictureSizes error");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public List<TEFrameSizei> mo81753O() {
        C13504g.m81998b("TECameraBase", "getSupportedPreviewSizes error");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public String m81830P() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public abstract boolean mo81754Q();

    /* JADX INFO: renamed from: R */
    public boolean mo81755R() {
        return false;
    }

    /* JADX INFO: renamed from: S */
    public boolean m81831S() {
        return this.f56304b.f56218v0 && !this.f56325w;
    }

    /* JADX INFO: renamed from: T */
    public abstract boolean mo81756T();

    /* JADX INFO: renamed from: U */
    public boolean mo81758U() {
        TECameraSettings.C13466d c13466d = this.f56304b.f56159K;
        return c13466d != null && c13466d.m81689a();
    }

    /* JADX INFO: renamed from: V */
    public abstract boolean mo81759V();

    /* JADX INFO: renamed from: W */
    public int mo81760W(TECameraSettings tECameraSettings, Cert cert) {
        this.f56315m = tECameraSettings.f56219w;
        C13504g.m82001e("TECameraBase", "set start preview retry count: " + this.f56315m);
        return 0;
    }

    /* JADX INFO: renamed from: X */
    public void m81832X(TECameraSettings.C13472j c13472j) {
    }

    /* JADX INFO: renamed from: Y */
    public TECameraFrame m81833Y(TECameraFrame tECameraFrame) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.f56326x;
        if (tECameraAlgorithmInterface != null) {
            return tECameraAlgorithmInterface.processAlgorithm(tECameraFrame);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo81761Z(TECameraSettings.InterfaceC13476n interfaceC13476n);

    /* JADX INFO: renamed from: a */
    public void mo81808a() {
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo81762a0(TECameraSettings.InterfaceC13478p interfaceC13478p, boolean z);

    /* JADX INFO: renamed from: b */
    public void m81834b(TECameraAlgorithmParam tECameraAlgorithmParam) {
    }

    /* JADX INFO: renamed from: b0 */
    public void m81835b0(b bVar) {
        this.f56318p = bVar;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo81763c();

    /* JADX INFO: renamed from: c0 */
    public void m81836c0(e eVar) {
        this.f56317o = eVar;
    }

    /* JADX INFO: renamed from: d */
    public void mo81811d(hj3 hj3Var, TECameraSettings.InterfaceC13465c interfaceC13465c) {
        interfaceC13465c.m81688a(new UnsupportedOperationException("unsupport capture burst, camera type:" + mo81782v()));
    }

    /* JADX INFO: renamed from: d0 */
    public void m81837d0(int i) {
    }

    /* JADX INFO: renamed from: e */
    public void m81838e(int i, c cVar) {
    }

    /* JADX INFO: renamed from: e0 */
    public void m81839e0() {
        int i = this.f56315m;
        if (i > 0) {
            this.f56315m = i - 1;
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo81764f(Cert cert) {
        C13504g.m81997a("TECameraBase", "close...");
    }

    /* JADX INFO: renamed from: f0 */
    public void mo81812f0(float f2) {
    }

    /* JADX INFO: renamed from: g */
    public void mo81765g() {
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo81766g0(boolean z);

    /* JADX INFO: renamed from: h */
    public Exception m81840h(Exception exc, int i) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception message";
        }
        return new Exception(message + ", errorCode=" + i);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo81767h0(boolean z) {
    }

    /* JADX INFO: renamed from: i */
    public void mo81813i() {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.f56326x;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.destroy();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m81841i0(int i) {
        this.f56313k = i;
        this.f56319q.set(true);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo81768j();

    /* JADX INFO: renamed from: j0 */
    public abstract boolean mo81769j0(int i);

    /* JADX INFO: renamed from: k */
    public void mo81814k(boolean z) {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo81770k0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: l */
    public Bundle mo81771l() {
        Bundle bundle;
        if (this.f56320r.containsKey(this.f56304b.f56156H)) {
            bundle = this.f56320r.get(this.f56304b.f56156H);
        } else {
            bundle = new Bundle();
            this.f56320r.put(this.f56304b.f56156H, bundle);
        }
        if (bundle != null) {
            bundle.putInt("facing", this.f56304b.f56181d);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: l0 */
    public void mo81815l0(int i) {
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo81772m(TEFocusSettings tEFocusSettings);

    /* JADX INFO: renamed from: m0 */
    public void mo81816m0(float f2) {
    }

    /* JADX INFO: renamed from: n */
    public void mo81773n(Cert cert) {
    }

    /* JADX INFO: renamed from: n0 */
    public void mo81774n0(int i, int i2) {
    }

    /* JADX INFO: renamed from: o */
    public float[] mo81817o() {
        return new float[]{-1.0f, -1.0f};
    }

    /* JADX INFO: renamed from: o0 */
    public void mo81775o0() {
    }

    /* JADX INFO: renamed from: p */
    public abstract TEFrameSizei mo81776p(float f2, TEFrameSizei tEFrameSizei);

    /* JADX INFO: renamed from: p0 */
    public void m81842p0(@NonNull jrh0 jrh0Var) {
        this.f56309g = jrh0Var;
    }

    /* JADX INFO: renamed from: q */
    public JSONObject mo81777q() {
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public void m81843q0(f fVar) {
    }

    /* JADX INFO: renamed from: r */
    public int[] mo81778r() {
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public void mo81779r0(int i) {
        C13504g.m82001e("TECameraBase", "scene mode: " + i);
    }

    /* JADX INFO: renamed from: s */
    public TECameraSettings.C13466d m81844s() {
        return this.f56304b.f56159K;
    }

    /* JADX INFO: renamed from: s0 */
    public void mo81818s0(long j) {
    }

    /* JADX INFO: renamed from: t */
    public a m81845t() {
        return this.f56306d;
    }

    /* JADX INFO: renamed from: t0 */
    public abstract void mo81780t0(boolean z, String str);

    /* JADX INFO: renamed from: u */
    public TECameraSettings m81846u() {
        return this.f56304b;
    }

    /* JADX INFO: renamed from: u0 */
    public abstract void mo81781u0();

    /* JADX INFO: renamed from: v */
    public abstract int mo81782v();

    /* JADX INFO: renamed from: v0 */
    public int mo81819v0() {
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public int m81847w() {
        TECameraSettings.C13466d c13466d = this.f56304b.f56159K;
        if (c13466d != null) {
            return c13466d.f56233b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: w0 */
    public abstract void mo81783w0(float f2, TECameraSettings.InterfaceC13478p interfaceC13478p);

    /* JADX INFO: renamed from: x */
    public abstract float[] mo81784x();

    /* JADX INFO: renamed from: x0 */
    public abstract void mo81785x0();

    /* JADX INFO: renamed from: y */
    public int m81848y() {
        return this.f56310h;
    }

    /* JADX INFO: renamed from: y0 */
    public int mo81820y0() {
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public Bundle m81849z(String str) {
        return this.f56320r.get(str);
    }

    /* JADX INFO: renamed from: z0 */
    public void m81850z0() {
        this.f56315m = 0;
    }
}
