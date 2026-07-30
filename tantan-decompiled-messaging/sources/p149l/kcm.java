package p149l;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.idv.identity.platform.api.IdentityOcrInfo;
import com.idv.identity.platform.api.IdentityRetCallback;
import com.idv.identity.platform.config.Chameleon;
import com.idv.identity.platform.config.IdentityFarNearConfig;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.model.NfcConfigRes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class kcm {

    /* JADX INFO: renamed from: R0 */
    private static volatile kcm f122398R0;

    /* JADX INFO: renamed from: S0 */
    private static s3g f122399S0;

    /* JADX INFO: renamed from: A */
    private String f122400A;

    /* JADX INFO: renamed from: A0 */
    private String f122401A0;

    /* JADX INFO: renamed from: B */
    private String f122402B;

    /* JADX INFO: renamed from: B0 */
    private float f122403B0;

    /* JADX INFO: renamed from: C */
    private String f122404C;

    /* JADX INFO: renamed from: C0 */
    public String f122405C0;

    /* JADX INFO: renamed from: D */
    private String f122406D;

    /* JADX INFO: renamed from: D0 */
    public String f122407D0;

    /* JADX INFO: renamed from: F */
    private String f122410F;

    /* JADX INFO: renamed from: G */
    private IdentityOcrInfo f122412G;

    /* JADX INFO: renamed from: G0 */
    private int f122413G0;

    /* JADX INFO: renamed from: H */
    private Bitmap f122414H;

    /* JADX INFO: renamed from: I */
    private boolean f122416I;

    /* JADX INFO: renamed from: J */
    private Bitmap f122418J;

    /* JADX INFO: renamed from: K */
    private String f122420K;

    /* JADX INFO: renamed from: L */
    private String f122422L;

    /* JADX INFO: renamed from: M */
    private boolean f122424M;

    /* JADX INFO: renamed from: M0 */
    private boolean f122425M0;

    /* JADX INFO: renamed from: N */
    private IdentityOcrInfo f122426N;

    /* JADX INFO: renamed from: O */
    private Bitmap f122428O;

    /* JADX INFO: renamed from: P */
    private Bitmap f122430P;

    /* JADX INFO: renamed from: Q */
    private String f122432Q;

    /* JADX INFO: renamed from: Q0 */
    private IdentityFarNearConfig f122433Q0;

    /* JADX INFO: renamed from: R */
    private IdentityOcrInfo f122434R;

    /* JADX INFO: renamed from: S */
    private Bitmap f122435S;

    /* JADX INFO: renamed from: T */
    private Bitmap f122436T;

    /* JADX INFO: renamed from: U */
    private String f122437U;

    /* JADX INFO: renamed from: V */
    private IdentityOcrInfo f122438V;

    /* JADX INFO: renamed from: W */
    private Bitmap f122439W;

    /* JADX INFO: renamed from: X */
    private Bitmap f122440X;

    /* JADX INFO: renamed from: Y */
    private String f122441Y;

    /* JADX INFO: renamed from: Z */
    private NfcConfigRes f122442Z;

    /* JADX INFO: renamed from: a */
    private String f122443a;

    /* JADX INFO: renamed from: a0 */
    private Bitmap f122444a0;

    /* JADX INFO: renamed from: b */
    private String f122445b;

    /* JADX INFO: renamed from: b0 */
    private Bitmap f122446b0;

    /* JADX INFO: renamed from: c */
    private String f122447c;

    /* JADX INFO: renamed from: c0 */
    private String f122448c0;

    /* JADX INFO: renamed from: d0 */
    private String f122450d0;

    /* JADX INFO: renamed from: e */
    private Map<String, Object> f122451e;

    /* JADX INFO: renamed from: e0 */
    private String f122452e0;

    /* JADX INFO: renamed from: f */
    private Map<String, Object> f122453f;

    /* JADX INFO: renamed from: f0 */
    private String f122454f0;

    /* JADX INFO: renamed from: g */
    private Map<String, Object> f122455g;

    /* JADX INFO: renamed from: g0 */
    private Bitmap f122456g0;

    /* JADX INFO: renamed from: h */
    private byte[] f122457h;

    /* JADX INFO: renamed from: h0 */
    private Bitmap f122458h0;

    /* JADX INFO: renamed from: i */
    private byte[] f122459i;

    /* JADX INFO: renamed from: i0 */
    private Bitmap f122460i0;

    /* JADX INFO: renamed from: j0 */
    private Bitmap f122462j0;

    /* JADX INFO: renamed from: k0 */
    private String f122464k0;

    /* JADX INFO: renamed from: l0 */
    private String f122466l0;

    /* JADX INFO: renamed from: m */
    private String f122467m;

    /* JADX INFO: renamed from: m0 */
    private String f122468m0;

    /* JADX INFO: renamed from: n */
    private kb20 f122469n;

    /* JADX INFO: renamed from: n0 */
    private Bitmap f122470n0;

    /* JADX INFO: renamed from: o */
    private String f122471o;

    /* JADX INFO: renamed from: o0 */
    private Bitmap f122472o0;

    /* JADX INFO: renamed from: p */
    private String f122473p;

    /* JADX INFO: renamed from: p0 */
    private Bitmap f122474p0;

    /* JADX INFO: renamed from: q */
    private String f122475q;

    /* JADX INFO: renamed from: q0 */
    private Bitmap f122476q0;

    /* JADX INFO: renamed from: r */
    private IdentityRetCallback f122477r;

    /* JADX INFO: renamed from: r0 */
    private String f122478r0;

    /* JADX INFO: renamed from: s */
    private OSSConfig f122479s;

    /* JADX INFO: renamed from: s0 */
    private String f122480s0;

    /* JADX INFO: renamed from: t */
    private String f122481t;

    /* JADX INFO: renamed from: t0 */
    private String f122482t0;

    /* JADX INFO: renamed from: u */
    private String f122483u;

    /* JADX INFO: renamed from: u0 */
    private String f122484u0;

    /* JADX INFO: renamed from: v */
    private IdentityOcrInfo f122485v;

    /* JADX INFO: renamed from: v0 */
    private String f122486v0;

    /* JADX INFO: renamed from: w */
    private String f122487w;

    /* JADX INFO: renamed from: w0 */
    private String f122488w0;

    /* JADX INFO: renamed from: x */
    private String f122489x;

    /* JADX INFO: renamed from: x0 */
    private String f122490x0;

    /* JADX INFO: renamed from: y */
    private String f122491y;

    /* JADX INFO: renamed from: y0 */
    private String f122492y0;

    /* JADX INFO: renamed from: z */
    private String f122493z;

    /* JADX INFO: renamed from: z0 */
    private String f122494z0;

    /* JADX INFO: renamed from: d */
    private List<String> f122449d = new ArrayList();

    /* JADX INFO: renamed from: j */
    private boolean f122461j = false;

    /* JADX INFO: renamed from: k */
    private boolean f122463k = true;

    /* JADX INFO: renamed from: l */
    private boolean f122465l = false;

    /* JADX INFO: renamed from: E */
    private boolean f122408E = false;

    /* JADX INFO: renamed from: E0 */
    public int f122409E0 = 0;

    /* JADX INFO: renamed from: F0 */
    private boolean f122411F0 = false;

    /* JADX INFO: renamed from: H0 */
    private float f122415H0 = 480.0f;

    /* JADX INFO: renamed from: I0 */
    private float f122417I0 = 480.0f;

    /* JADX INFO: renamed from: J0 */
    private float f122419J0 = 640.0f;

    /* JADX INFO: renamed from: K0 */
    private float f122421K0 = 0.8f;

    /* JADX INFO: renamed from: L0 */
    private Chameleon f122423L0 = new Chameleon();

    /* JADX INFO: renamed from: N0 */
    private long f122427N0 = 0;

    /* JADX INFO: renamed from: O0 */
    private boolean f122429O0 = false;

    /* JADX INFO: renamed from: P0 */
    public boolean f122431P0 = false;

    /* JADX INFO: renamed from: l.kcm$a */
    public class RunnableC17983a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f122495a;

        public RunnableC17983a(String str) {
            this.f122495a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (kcm.this.f122477r != null) {
                kcm.this.f122477r.onIdentityFinish(this.f122495a);
            }
            kcm.this.f122408E = true;
        }
    }

    private kcm() {
    }

    /* JADX INFO: renamed from: H */
    public static kcm m145452H() {
        if (f122398R0 == null) {
            synchronized (kcm.class) {
                try {
                    if (f122398R0 == null) {
                        f122398R0 = new kcm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f122398R0;
    }

    /* JADX INFO: renamed from: q0 */
    private void m145455q0() {
        kb20 kb20Var = this.f122469n;
        if (kb20Var != null) {
            this.f122471o = kb20Var.f122187b;
            this.f122473p = kb20Var.f122186a;
        }
    }

    /* JADX INFO: renamed from: A */
    public String m145456A() {
        ksf0.m147071e(ksf0.C18071a.f124468f, null);
        return this.f122464k0;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m145457A0() {
        return this.f122491y.equals(ocm.f143053b);
    }

    /* JADX INFO: renamed from: A1 */
    public void m145458A1(Bitmap bitmap) {
        this.f122418J = bitmap;
    }

    /* JADX INFO: renamed from: B */
    public s3g m145459B() {
        return f122399S0;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m145460B0() {
        return this.f122491y.equals("SHAKE_HEAD_DISTANCE");
    }

    /* JADX INFO: renamed from: B1 */
    public void m145461B1(Bitmap bitmap) {
        this.f122440X = bitmap;
    }

    /* JADX INFO: renamed from: C */
    public Bitmap m145462C() {
        ksf0.m147071e(ksf0.C18071a.f124468f, null);
        return this.f122458h0;
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m145463C0() {
        return this.f122491y.equals("SILENT");
    }

    /* JADX INFO: renamed from: C1 */
    public void m145464C1(String str) {
        this.f122420K = str;
    }

    /* JADX INFO: renamed from: D */
    public String m145465D() {
        return this.f122466l0;
    }

    /* JADX INFO: renamed from: D0 */
    public void m145466D0(boolean z) {
        this.f122411F0 = z;
    }

    /* JADX INFO: renamed from: D1 */
    public void m145467D1(String str) {
        this.f122441Y = str;
    }

    /* JADX INFO: renamed from: E */
    public IdentityFarNearConfig m145468E() {
        return this.f122433Q0;
    }

    /* JADX INFO: renamed from: E0 */
    public void m145469E0(String str) {
        this.f122401A0 = str;
    }

    /* JADX INFO: renamed from: E1 */
    public void m145470E1(Bitmap bitmap) {
        this.f122414H = bitmap;
    }

    /* JADX INFO: renamed from: F */
    public int m145471F() {
        return this.f122413G0;
    }

    /* JADX INFO: renamed from: F0 */
    public void m145472F0(String str) {
        this.f122445b = str;
    }

    /* JADX INFO: renamed from: F1 */
    public void m145473F1(Bitmap bitmap) {
        this.f122439W = bitmap;
    }

    /* JADX INFO: renamed from: G */
    public boolean m145474G() {
        return this.f122429O0;
    }

    /* JADX INFO: renamed from: G0 */
    public void m145475G0(String str) {
        this.f122443a = str;
    }

    /* JADX INFO: renamed from: G1 */
    public void m145476G1(String str, boolean z) {
        this.f122422L = str;
        this.f122424M = z;
    }

    /* JADX INFO: renamed from: H0 */
    public void m145477H0(String str) {
        this.f122447c = str;
    }

    /* JADX INFO: renamed from: H1 */
    public void m145478H1(IdentityOcrInfo identityOcrInfo) {
        this.f122485v = identityOcrInfo;
    }

    /* JADX INFO: renamed from: I */
    public Bitmap m145479I() {
        ksf0.m147071e(ksf0.C18071a.f124468f, null);
        return this.f122460i0;
    }

    /* JADX INFO: renamed from: I0 */
    public void m145480I0(byte[] bArr) {
        this.f122457h = bArr;
    }

    /* JADX INFO: renamed from: I1 */
    public void m145481I1(String str) {
        this.f122402B = str;
    }

    /* JADX INFO: renamed from: J */
    public String m145482J() {
        return this.f122468m0;
    }

    /* JADX INFO: renamed from: J0 */
    public void m145483J0(String str) {
        this.f122486v0 = str;
    }

    /* JADX INFO: renamed from: J1 */
    public void m145484J1(OSSConfig oSSConfig) {
        this.f122479s = oSSConfig;
    }

    /* JADX INFO: renamed from: K */
    public kb20 m145485K() {
        return this.f122469n;
    }

    /* JADX INFO: renamed from: K0 */
    public void m145486K0(String str) {
        this.f122475q = str;
    }

    /* JADX INFO: renamed from: K1 */
    public void m145487K1(boolean z) {
        this.f122463k = z;
    }

    /* JADX INFO: renamed from: L */
    public NfcConfigRes m145488L() {
        return this.f122442Z;
    }

    /* JADX INFO: renamed from: L0 */
    public void m145489L0(Chameleon chameleon) {
        this.f122423L0 = chameleon;
    }

    /* JADX INFO: renamed from: L1 */
    public void m145490L1(String str) {
        this.f122492y0 = str;
    }

    /* JADX INFO: renamed from: M */
    public String m145491M() {
        return this.f122400A;
    }

    /* JADX INFO: renamed from: M0 */
    public void m145492M0(boolean z) {
        this.f122425M0 = z;
    }

    /* JADX INFO: renamed from: M1 */
    public void m145493M1(String str) {
        this.f122494z0 = str;
    }

    /* JADX INFO: renamed from: N */
    public Map<String, Object> m145494N() {
        return this.f122455g;
    }

    /* JADX INFO: renamed from: N0 */
    public void m145495N0(float f) {
        this.f122403B0 = f;
    }

    /* JADX INFO: renamed from: N1 */
    public void m145496N1(float f, float f2, float f3, float f4) {
        this.f122415H0 = f;
        this.f122417I0 = f2;
        this.f122419J0 = f3;
        this.f122421K0 = f4;
    }

    /* JADX INFO: renamed from: O */
    public String m145497O() {
        return this.f122448c0;
    }

    /* JADX INFO: renamed from: O0 */
    public void m145498O0(boolean z) {
        this.f122416I = z;
    }

    /* JADX INFO: renamed from: O1 */
    public void m145499O1(String str) {
        this.f122405C0 = str;
    }

    /* JADX INFO: renamed from: P */
    public Map<String, Object> m145500P() {
        return this.f122451e;
    }

    /* JADX INFO: renamed from: P0 */
    public void m145501P0(boolean z) {
        this.f122465l = z;
    }

    /* JADX INFO: renamed from: P1 */
    public void m145502P1(String str) {
        this.f122406D = str;
    }

    /* JADX INFO: renamed from: Q */
    public Map<String, Object> m145503Q() {
        return this.f122453f;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m145504Q0(String str) {
        this.f122467m = str;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m145505Q1(long j) {
        this.f122427N0 = j;
    }

    /* JADX INFO: renamed from: R */
    public IdentityOcrInfo m145506R() {
        return this.f122426N;
    }

    /* JADX INFO: renamed from: R0 */
    public void m145507R0(List<String> list) {
        this.f122449d = list;
    }

    /* JADX INFO: renamed from: R1 */
    public void m145508R1(String str) {
        this.f122404C = str;
    }

    /* JADX INFO: renamed from: S */
    public Bitmap m145509S() {
        return this.f122430P;
    }

    /* JADX INFO: renamed from: S0 */
    public void m145510S0(int i) {
        this.f122409E0 = i;
    }

    /* JADX INFO: renamed from: S1 */
    public void m145511S1(String str) {
        this.f122488w0 = str;
    }

    /* JADX INFO: renamed from: T */
    public String m145512T() {
        return this.f122432Q;
    }

    /* JADX INFO: renamed from: T0 */
    public void m145513T0(String str) {
        this.f122407D0 = str;
    }

    /* JADX INFO: renamed from: T1 */
    public void m145514T1(String str) {
        this.f122490x0 = str;
    }

    /* JADX INFO: renamed from: U */
    public Bitmap m145515U() {
        return this.f122428O;
    }

    /* JADX INFO: renamed from: U0 */
    public void m145516U0(String str) {
        this.f122489x = str;
    }

    /* JADX INFO: renamed from: V */
    public IdentityOcrInfo m145517V() {
        return this.f122412G;
    }

    /* JADX INFO: renamed from: V0 */
    public void m145518V0(String str) {
        this.f122487w = str;
    }

    /* JADX INFO: renamed from: W */
    public Bitmap m145519W() {
        return this.f122418J;
    }

    /* JADX INFO: renamed from: W0 */
    public void m145520W0(Bitmap bitmap) {
        ksf0.m147071e(ksf0.C18071a.f124467e, null);
        this.f122456g0 = bitmap;
    }

    /* JADX INFO: renamed from: X */
    public String m145521X() {
        return this.f122420K;
    }

    /* JADX INFO: renamed from: X0 */
    public void m145522X0(byte[] bArr) {
        this.f122459i = bArr;
    }

    /* JADX INFO: renamed from: Y */
    public Bitmap m145523Y() {
        return this.f122414H;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m145524Y0(String str) {
        this.f122464k0 = str;
    }

    /* JADX INFO: renamed from: Z */
    public String m145525Z() {
        return this.f122422L;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m145526Z0(String str) {
        this.f122410F = str;
    }

    /* JADX INFO: renamed from: a0 */
    public IdentityOcrInfo m145527a0() {
        return this.f122485v;
    }

    /* JADX INFO: renamed from: a1 */
    public void m145528a1(s3g s3gVar) {
        f122399S0 = s3gVar;
    }

    /* JADX INFO: renamed from: b0 */
    public String m145529b0() {
        return this.f122402B;
    }

    /* JADX INFO: renamed from: b1 */
    public void m145530b1(Bitmap bitmap) {
        ksf0.m147071e(ksf0.C18071a.f124467e, null);
        this.f122458h0 = bitmap;
    }

    /* JADX INFO: renamed from: c */
    public void m145531c() {
        this.f122467m = null;
        this.f122450d0 = null;
        this.f122475q = null;
        this.f122477r = null;
        this.f122479s = null;
        this.f122481t = null;
        this.f122408E = false;
        this.f122485v = null;
        this.f122412G = null;
        this.f122414H = null;
        this.f122418J = null;
        this.f122420K = null;
        this.f122422L = null;
        this.f122424M = true;
        this.f122426N = null;
        this.f122428O = null;
        this.f122430P = null;
        this.f122432Q = null;
        this.f122488w0 = null;
        this.f122490x0 = null;
        this.f122492y0 = null;
        this.f122494z0 = null;
        this.f122444a0 = null;
        this.f122446b0 = null;
        this.f122448c0 = null;
        this.f122452e0 = null;
        this.f122454f0 = null;
        this.f122456g0 = null;
        this.f122458h0 = null;
        this.f122460i0 = null;
        this.f122462j0 = null;
        this.f122486v0 = null;
        this.f122413G0 = 0;
        this.f122464k0 = null;
        this.f122466l0 = null;
        this.f122468m0 = null;
        this.f122476q0 = null;
        this.f122484u0 = null;
        this.f122470n0 = null;
        this.f122478r0 = null;
        this.f122472o0 = null;
        this.f122480s0 = null;
        this.f122474p0 = null;
        this.f122482t0 = null;
        this.f122411F0 = false;
        this.f122415H0 = 480.0f;
        this.f122417I0 = 480.0f;
        this.f122419J0 = 640.0f;
        this.f122421K0 = 0.8f;
        this.f122427N0 = 0L;
        this.f122405C0 = "";
        this.f122407D0 = "";
        this.f122409E0 = 0;
        this.f122433Q0 = null;
        this.f122442Z = null;
        this.f122402B = "";
        this.f122406D = "";
        this.f122449d.clear();
        this.f122451e = null;
        this.f122453f = null;
        this.f122455g = null;
        this.f122457h = null;
        this.f122459i = null;
        s3g s3gVar = f122399S0;
        if (s3gVar != null) {
            s3gVar.m182161b();
            f122399S0 = null;
        }
        this.f122469n = null;
        this.f122445b = "";
        this.f122443a = "";
        this.f122447c = "";
    }

    /* JADX INFO: renamed from: c0 */
    public float m145532c0() {
        return this.f122419J0;
    }

    /* JADX INFO: renamed from: c1 */
    public void m145533c1(String str) {
        this.f122466l0 = str;
    }

    /* JADX INFO: renamed from: d */
    public boolean m145534d(String str) {
        List<String> list = this.f122449d;
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public OSSConfig m145535d0() {
        return this.f122479s;
    }

    /* JADX INFO: renamed from: d1 */
    public void m145536d1(IdentityFarNearConfig identityFarNearConfig) {
        this.f122433Q0 = identityFarNearConfig;
    }

    /* JADX INFO: renamed from: e */
    public void m145537e(String str) {
        if (this.f122408E) {
            ixq0.m138884a("已经回调过了，不要重复回调...");
            return;
        }
        ixq0.m138884a("IdentityCenter.exitFlowVerify() errCode" + str);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC17983a(str));
            return;
        }
        this.f122408E = true;
        IdentityRetCallback identityRetCallback = this.f122477r;
        if (identityRetCallback != null) {
            identityRetCallback.onIdentityFinish(str);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m145538e0() {
        return this.f122463k;
    }

    /* JADX INFO: renamed from: e1 */
    public void m145539e1(IdentityRetCallback identityRetCallback) {
        this.f122477r = identityRetCallback;
    }

    /* JADX INFO: renamed from: f */
    public boolean m145540f() {
        return this.f122411F0;
    }

    /* JADX INFO: renamed from: f0 */
    public String m145541f0() {
        return this.f122492y0;
    }

    /* JADX INFO: renamed from: f1 */
    public void m145542f1(int i) {
        this.f122413G0 = i;
    }

    /* JADX INFO: renamed from: g */
    public String m145543g() {
        return this.f122401A0;
    }

    /* JADX INFO: renamed from: g0 */
    public String m145544g0() {
        return this.f122494z0;
    }

    /* JADX INFO: renamed from: g1 */
    public void m145545g1(boolean z) {
        this.f122429O0 = z;
    }

    /* JADX INFO: renamed from: h */
    public String m145546h() {
        return this.f122445b;
    }

    /* JADX INFO: renamed from: h0 */
    public float m145547h0() {
        return this.f122415H0;
    }

    /* JADX INFO: renamed from: h1 */
    public void m145548h1(String str) {
        this.f122491y = str;
    }

    /* JADX INFO: renamed from: i */
    public String m145549i() {
        return this.f122443a;
    }

    /* JADX INFO: renamed from: i0 */
    public String m145550i0() {
        return this.f122405C0;
    }

    /* JADX INFO: renamed from: i1 */
    public void m145551i1(Bitmap bitmap) {
        ksf0.m147071e(ksf0.C18071a.f124467e, null);
        this.f122460i0 = bitmap;
    }

    /* JADX INFO: renamed from: j */
    public String m145552j() {
        return this.f122447c;
    }

    /* JADX INFO: renamed from: j0 */
    public String m145553j0() {
        return this.f122406D;
    }

    /* JADX INFO: renamed from: j1 */
    public void m145554j1(String str) {
        this.f122468m0 = str;
    }

    /* JADX INFO: renamed from: k */
    public Bitmap m145555k() {
        return this.f122462j0;
    }

    /* JADX INFO: renamed from: k0 */
    public String m145556k0() {
        return this.f122493z;
    }

    /* JADX INFO: renamed from: k1 */
    public void m145557k1(kb20 kb20Var) {
        this.f122469n = kb20Var;
        m145455q0();
    }

    /* JADX INFO: renamed from: l */
    public byte[] m145558l() {
        return this.f122457h;
    }

    /* JADX INFO: renamed from: l0 */
    public long m145559l0() {
        return this.f122427N0;
    }

    /* JADX INFO: renamed from: l1 */
    public void m145560l1(NfcConfigRes nfcConfigRes) {
        this.f122442Z = nfcConfigRes;
    }

    /* JADX INFO: renamed from: m */
    public String m145561m() {
        return this.f122486v0;
    }

    /* JADX INFO: renamed from: m0 */
    public String m145562m0() {
        return this.f122473p;
    }

    /* JADX INFO: renamed from: m1 */
    public void m145563m1(String str) {
        this.f122400A = str;
    }

    /* JADX INFO: renamed from: n */
    public String m145564n() {
        return this.f122475q;
    }

    /* JADX INFO: renamed from: n0 */
    public String m145565n0() {
        return this.f122471o;
    }

    /* JADX INFO: renamed from: n1 */
    public void m145566n1(String str) {
        this.f122483u = str;
    }

    /* JADX INFO: renamed from: o */
    public Chameleon m145567o() {
        return this.f122423L0;
    }

    /* JADX INFO: renamed from: o0 */
    public String m145568o0() {
        return this.f122488w0;
    }

    /* JADX INFO: renamed from: o1 */
    public void m145569o1(Map<String, Object> map) {
        this.f122451e = map;
    }

    /* JADX INFO: renamed from: p */
    public float m145570p() {
        return this.f122403B0;
    }

    /* JADX INFO: renamed from: p0 */
    public String m145571p0() {
        return this.f122490x0;
    }

    /* JADX INFO: renamed from: p1 */
    public void m145572p1(Map<String, Object> map) {
        this.f122453f = map;
    }

    /* JADX INFO: renamed from: q */
    public boolean m145573q() {
        return this.f122461j;
    }

    /* JADX INFO: renamed from: q1 */
    public void m145574q1(IdentityOcrInfo identityOcrInfo) {
        this.f122426N = identityOcrInfo;
    }

    /* JADX INFO: renamed from: r */
    public boolean m145575r() {
        return this.f122465l;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m145576r0() {
        return this.f122425M0;
    }

    /* JADX INFO: renamed from: r1 */
    public void m145577r1(IdentityOcrInfo identityOcrInfo) {
        this.f122434R = identityOcrInfo;
    }

    /* JADX INFO: renamed from: s */
    public String m145578s() {
        return this.f122467m;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m145579s0() {
        return this.f122416I;
    }

    /* JADX INFO: renamed from: s1 */
    public void m145580s1(Bitmap bitmap) {
        this.f122430P = bitmap;
    }

    /* JADX INFO: renamed from: t */
    public List<String> m145581t() {
        return this.f122449d;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m145582t0() {
        return ocm.f143052a.equals(this.f122491y) || "PHOTINUS_FAR_NEAR".equals(this.f122491y) || "PHOTINUS_FAR_NEAR_MULTI_ACTION".equals(this.f122491y) || "PHOTINUS_FAR_NEAR_LIVENESS".equals(this.f122491y);
    }

    /* JADX INFO: renamed from: t1 */
    public void m145583t1(Bitmap bitmap) {
        this.f122436T = bitmap;
    }

    /* JADX INFO: renamed from: u */
    public int m145584u() {
        return this.f122409E0;
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m145585u0() {
        return "PHOTINUS_FAR_NEAR".equals(this.f122491y) || "PHOTINUS_FAR_NEAR_MULTI_ACTION".equals(this.f122491y) || "PHOTINUS_LIVENESS".equals(this.f122491y) || ocm.f143053b.equals(this.f122491y) || "PHOTINUS_FAR_NEAR_LIVENESS".equals(this.f122491y);
    }

    /* JADX INFO: renamed from: u1 */
    public void m145586u1(String str) {
        this.f122432Q = str;
    }

    /* JADX INFO: renamed from: v */
    public String m145587v() {
        return this.f122407D0;
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m145588v0() {
        return "Y".equals(this.f122410F) && this.f122491y.equals("PHOTINUS_FAR_NEAR_LIVENESS");
    }

    /* JADX INFO: renamed from: v1 */
    public void m145589v1(String str) {
        this.f122437U = str;
    }

    /* JADX INFO: renamed from: w */
    public String m145590w() {
        return this.f122489x;
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m145591w0() {
        return "PHOTINUS_FAR_NEAR".equals(this.f122491y);
    }

    /* JADX INFO: renamed from: w1 */
    public void m145592w1(Bitmap bitmap) {
        this.f122428O = bitmap;
    }

    /* JADX INFO: renamed from: x */
    public String m145593x() {
        return this.f122487w;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m145594x0() {
        return this.f122491y.equals("PHOTINUS_FAR_NEAR_MULTI_ACTION");
    }

    /* JADX INFO: renamed from: x1 */
    public void m145595x1(Bitmap bitmap) {
        this.f122435S = bitmap;
    }

    /* JADX INFO: renamed from: y */
    public Bitmap m145596y() {
        ksf0.m147071e(ksf0.C18071a.f124468f, null);
        return this.f122456g0;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m145597y0() {
        return this.f122491y.equals("LIVENESS");
    }

    /* JADX INFO: renamed from: y1 */
    public void m145598y1(IdentityOcrInfo identityOcrInfo) {
        this.f122412G = identityOcrInfo;
    }

    /* JADX INFO: renamed from: z */
    public byte[] m145599z() {
        return this.f122459i;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m145600z0() {
        return this.f122491y.equals("PHOTINUS_LIVENESS");
    }

    /* JADX INFO: renamed from: z1 */
    public void m145601z1(IdentityOcrInfo identityOcrInfo) {
        this.f122438V = identityOcrInfo;
    }
}
