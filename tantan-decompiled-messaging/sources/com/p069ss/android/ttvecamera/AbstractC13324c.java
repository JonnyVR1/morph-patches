package com.p069ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.Cert;
import com.p069ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface;
import com.p069ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.p069ss.android.ttvecamera.cameracapabilitycollector.C13330a;
import com.p069ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p149l.cjh0;
import p149l.ti3;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.c */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC13324c {

    /* JADX INFO: renamed from: b */
    protected TECameraSettings f55456b;

    /* JADX INFO: renamed from: d */
    protected a f55458d;

    /* JADX INFO: renamed from: e */
    protected Handler f55459e;

    /* JADX INFO: renamed from: f */
    protected Context f55460f;

    /* JADX INFO: renamed from: g */
    protected cjh0 f55461g;

    /* JADX INFO: renamed from: h */
    protected int f55462h;

    /* JADX INFO: renamed from: i */
    protected int f55463i;

    /* JADX INFO: renamed from: l */
    protected float f55466l;

    /* JADX INFO: renamed from: n */
    protected d f55468n;

    /* JADX INFO: renamed from: a */
    public boolean f55455a = false;

    /* JADX INFO: renamed from: c */
    protected boolean f55457c = false;

    /* JADX INFO: renamed from: j */
    protected int f55464j = -1;

    /* JADX INFO: renamed from: k */
    protected int f55465k = -1;

    /* JADX INFO: renamed from: m */
    protected int f55467m = 0;

    /* JADX INFO: renamed from: o */
    protected e f55469o = null;

    /* JADX INFO: renamed from: p */
    protected b f55470p = null;

    /* JADX INFO: renamed from: q */
    private AtomicBoolean f55471q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r */
    protected Map<String, Bundle> f55472r = new HashMap();

    /* JADX INFO: renamed from: s */
    protected Map<Integer, Bundle> f55473s = new HashMap();

    /* JADX INFO: renamed from: t */
    protected Cert f55474t = null;

    /* JADX INFO: renamed from: u */
    protected TECameraCapabilityCollector f55475u = new TECameraCapabilityCollector();

    /* JADX INFO: renamed from: v */
    public JSONObject f55476v = new JSONObject();

    /* JADX INFO: renamed from: w */
    protected boolean f55477w = false;

    /* JADX INFO: renamed from: x */
    public TECameraAlgorithmInterface f55478x = null;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo80493a(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: b */
        void mo80494b(int i, int i2, String str, Object obj);

        /* JADX INFO: renamed from: c */
        void mo80495c(int i, int i2, String str, Object obj);

        /* JADX INFO: renamed from: d */
        void mo80496d(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: e */
        void mo80497e(int i, int i2, String str, Object obj);

        /* JADX INFO: renamed from: f */
        void mo80498f(int i, int i2, AbstractC13324c abstractC13324c, Object obj);

        /* JADX INFO: renamed from: g */
        void mo80499g(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: h */
        void mo80500h(int i, int i2, int i3, String str, Object obj);

        /* JADX INFO: renamed from: i */
        void mo80501i(int i, AbstractC13324c abstractC13324c, Object obj);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        int[] mo80502a(List<int[]> list);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$c */
    public interface c {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        TEFrameSizei mo80503a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$e */
    public interface e {
        TEFrameSizei getPreviewSize(List<TEFrameSizei> list);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$f */
    public interface f {
    }

    public AbstractC13324c(Context context, a aVar, Handler handler, d dVar) {
        this.f55460f = context;
        this.f55458d = aVar;
        this.f55459e = handler;
        this.f55468n = dVar;
        this.f55475u.m80670c(new C13330a());
    }

    /* JADX INFO: renamed from: A */
    public Map<String, Bundle> m80641A() {
        return this.f55472r;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo80558A0(TECameraSettings.InterfaceC13315p interfaceC13315p);

    /* JADX INFO: renamed from: B */
    public int mo80559B() {
        return -1;
    }

    /* JADX INFO: renamed from: B0 */
    public abstract void mo80560B0(int i);

    /* JADX INFO: renamed from: C */
    public abstract int mo80561C();

    /* JADX INFO: renamed from: C0 */
    public abstract void mo80562C0(int i);

    /* JADX INFO: renamed from: D */
    public int m80642D() {
        if (this.f55471q.getAndSet(false)) {
            mo80561C();
        }
        return this.f55464j;
    }

    /* JADX INFO: renamed from: D0 */
    public abstract void mo80563D0(int i, int i2, TECameraSettings.InterfaceC13311l interfaceC13311l);

    /* JADX INFO: renamed from: E */
    public Handler m80643E() {
        return this.f55459e;
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo80564E0(TECameraSettings.InterfaceC13311l interfaceC13311l);

    /* JADX INFO: renamed from: F */
    public int mo80607F() {
        return -1;
    }

    /* JADX INFO: renamed from: F0 */
    public abstract void mo80565F0(boolean z);

    /* JADX INFO: renamed from: G */
    public int[] mo80608G() {
        return new int[]{-1, -1};
    }

    /* JADX INFO: renamed from: G0 */
    public void m80644G0(TECameraAlgorithmParam tECameraAlgorithmParam) {
    }

    /* JADX INFO: renamed from: H */
    public float mo80609H() {
        return -1.0f;
    }

    /* JADX INFO: renamed from: H0 */
    public abstract void mo80566H0(float f2, TECameraSettings.InterfaceC13315p interfaceC13315p);

    /* JADX INFO: renamed from: I */
    public int[] mo80567I() {
        TEFrameSizei tEFrameSizei = this.f55456b.f55361r;
        return new int[]{tEFrameSizei.width, tEFrameSizei.height};
    }

    /* JADX INFO: renamed from: J */
    public int[] mo80568J() {
        return null;
    }

    /* JADX INFO: renamed from: K */
    public cjh0 m80645K() {
        return this.f55461g;
    }

    /* JADX INFO: renamed from: L */
    public int m80646L() {
        return this.f55467m;
    }

    /* JADX INFO: renamed from: M */
    public long[] mo80614M() {
        return new long[]{-1, -1};
    }

    /* JADX INFO: renamed from: N */
    public List<TEFrameSizei> mo80569N() {
        C13341g.m80815b("TECameraBase", "getSupportedPictureSizes error");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public List<TEFrameSizei> mo80570O() {
        C13341g.m80815b("TECameraBase", "getSupportedPreviewSizes error");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public String m80647P() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public abstract boolean mo80571Q();

    /* JADX INFO: renamed from: R */
    public boolean mo80572R() {
        return false;
    }

    /* JADX INFO: renamed from: S */
    public boolean m80648S() {
        return this.f55456b.f55370v0 && !this.f55477w;
    }

    /* JADX INFO: renamed from: T */
    public abstract boolean mo80573T();

    /* JADX INFO: renamed from: U */
    public boolean mo80575U() {
        TECameraSettings.C13303d c13303d = this.f55456b.f55311K;
        return c13303d != null && c13303d.m80506a();
    }

    /* JADX INFO: renamed from: V */
    public abstract boolean mo80576V();

    /* JADX INFO: renamed from: W */
    public int mo80577W(TECameraSettings tECameraSettings, Cert cert) {
        this.f55467m = tECameraSettings.f55371w;
        C13341g.m80818e("TECameraBase", "set start preview retry count: " + this.f55467m);
        return 0;
    }

    /* JADX INFO: renamed from: X */
    public void m80649X(TECameraSettings.C13309j c13309j) {
    }

    /* JADX INFO: renamed from: Y */
    public TECameraFrame m80650Y(TECameraFrame tECameraFrame) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.f55478x;
        if (tECameraAlgorithmInterface != null) {
            return tECameraAlgorithmInterface.processAlgorithm(tECameraFrame);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo80578Z(TECameraSettings.InterfaceC13313n interfaceC13313n);

    /* JADX INFO: renamed from: a */
    public void mo80625a() {
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo80579a0(TECameraSettings.InterfaceC13315p interfaceC13315p, boolean z);

    /* JADX INFO: renamed from: b */
    public void m80651b(TECameraAlgorithmParam tECameraAlgorithmParam) {
    }

    /* JADX INFO: renamed from: b0 */
    public void m80652b0(b bVar) {
        this.f55470p = bVar;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo80580c();

    /* JADX INFO: renamed from: c0 */
    public void m80653c0(e eVar) {
        this.f55469o = eVar;
    }

    /* JADX INFO: renamed from: d */
    public void mo80628d(ti3 ti3Var, TECameraSettings.InterfaceC13302c interfaceC13302c) {
        interfaceC13302c.m80505a(new UnsupportedOperationException("unsupport capture burst, camera type:" + mo80599v()));
    }

    /* JADX INFO: renamed from: d0 */
    public void m80654d0(int i) {
    }

    /* JADX INFO: renamed from: e */
    public void m80655e(int i, c cVar) {
    }

    /* JADX INFO: renamed from: e0 */
    public void m80656e0() {
        int i = this.f55467m;
        if (i > 0) {
            this.f55467m = i - 1;
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo80581f(Cert cert) {
        C13341g.m80814a("TECameraBase", "close...");
    }

    /* JADX INFO: renamed from: f0 */
    public void mo80629f0(float f2) {
    }

    /* JADX INFO: renamed from: g */
    public void mo80582g() {
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo80583g0(boolean z);

    /* JADX INFO: renamed from: h */
    public Exception m80657h(Exception exc, int i) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception message";
        }
        return new Exception(message + ", errorCode=" + i);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo80584h0(boolean z) {
    }

    /* JADX INFO: renamed from: i */
    public void mo80630i() {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.f55478x;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.destroy();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m80658i0(int i) {
        this.f55465k = i;
        this.f55471q.set(true);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo80585j();

    /* JADX INFO: renamed from: j0 */
    public abstract boolean mo80586j0(int i);

    /* JADX INFO: renamed from: k */
    public void mo80631k(boolean z) {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo80587k0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: l */
    public Bundle mo80588l() {
        Bundle bundle;
        if (this.f55472r.containsKey(this.f55456b.f55308H)) {
            bundle = this.f55472r.get(this.f55456b.f55308H);
        } else {
            bundle = new Bundle();
            this.f55472r.put(this.f55456b.f55308H, bundle);
        }
        if (bundle != null) {
            bundle.putInt("facing", this.f55456b.f55333d);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: l0 */
    public void mo80632l0(int i) {
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo80589m(TEFocusSettings tEFocusSettings);

    /* JADX INFO: renamed from: m0 */
    public void mo80633m0(float f2) {
    }

    /* JADX INFO: renamed from: n */
    public void mo80590n(Cert cert) {
    }

    /* JADX INFO: renamed from: n0 */
    public void mo80591n0(int i, int i2) {
    }

    /* JADX INFO: renamed from: o */
    public float[] mo80634o() {
        return new float[]{-1.0f, -1.0f};
    }

    /* JADX INFO: renamed from: o0 */
    public void mo80592o0() {
    }

    /* JADX INFO: renamed from: p */
    public abstract TEFrameSizei mo80593p(float f2, TEFrameSizei tEFrameSizei);

    /* JADX INFO: renamed from: p0 */
    public void m80659p0(@NonNull cjh0 cjh0Var) {
        this.f55461g = cjh0Var;
    }

    /* JADX INFO: renamed from: q */
    public JSONObject mo80594q() {
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public void m80660q0(f fVar) {
    }

    /* JADX INFO: renamed from: r */
    public int[] mo80595r() {
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public void mo80596r0(int i) {
        C13341g.m80818e("TECameraBase", "scene mode: " + i);
    }

    /* JADX INFO: renamed from: s */
    public TECameraSettings.C13303d m80661s() {
        return this.f55456b.f55311K;
    }

    /* JADX INFO: renamed from: s0 */
    public void mo80635s0(long j) {
    }

    /* JADX INFO: renamed from: t */
    public a m80662t() {
        return this.f55458d;
    }

    /* JADX INFO: renamed from: t0 */
    public abstract void mo80597t0(boolean z, String str);

    /* JADX INFO: renamed from: u */
    public TECameraSettings m80663u() {
        return this.f55456b;
    }

    /* JADX INFO: renamed from: u0 */
    public abstract void mo80598u0();

    /* JADX INFO: renamed from: v */
    public abstract int mo80599v();

    /* JADX INFO: renamed from: v0 */
    public int mo80636v0() {
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public int m80664w() {
        TECameraSettings.C13303d c13303d = this.f55456b.f55311K;
        if (c13303d != null) {
            return c13303d.f55385b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: w0 */
    public abstract void mo80600w0(float f2, TECameraSettings.InterfaceC13315p interfaceC13315p);

    /* JADX INFO: renamed from: x */
    public abstract float[] mo80601x();

    /* JADX INFO: renamed from: x0 */
    public abstract void mo80602x0();

    /* JADX INFO: renamed from: y */
    public int m80665y() {
        return this.f55462h;
    }

    /* JADX INFO: renamed from: y0 */
    public int mo80637y0() {
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public Bundle m80666z(String str) {
        return this.f55472r.get(str);
    }

    /* JADX INFO: renamed from: z0 */
    public void m80667z0() {
        this.f55467m = 0;
    }
}
