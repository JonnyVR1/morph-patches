package p153l;

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
public class afm {

    /* JADX INFO: renamed from: R0 */
    private static volatile afm f70928R0;

    /* JADX INFO: renamed from: S0 */
    private static g5g f70929S0;

    /* JADX INFO: renamed from: A */
    private String f70930A;

    /* JADX INFO: renamed from: A0 */
    private String f70931A0;

    /* JADX INFO: renamed from: B */
    private String f70932B;

    /* JADX INFO: renamed from: B0 */
    private float f70933B0;

    /* JADX INFO: renamed from: C */
    private String f70934C;

    /* JADX INFO: renamed from: C0 */
    public String f70935C0;

    /* JADX INFO: renamed from: D */
    private String f70936D;

    /* JADX INFO: renamed from: D0 */
    public String f70937D0;

    /* JADX INFO: renamed from: F */
    private String f70940F;

    /* JADX INFO: renamed from: G */
    private IdentityOcrInfo f70942G;

    /* JADX INFO: renamed from: G0 */
    private int f70943G0;

    /* JADX INFO: renamed from: H */
    private Bitmap f70944H;

    /* JADX INFO: renamed from: I */
    private boolean f70946I;

    /* JADX INFO: renamed from: J */
    private Bitmap f70948J;

    /* JADX INFO: renamed from: K */
    private String f70950K;

    /* JADX INFO: renamed from: L */
    private String f70952L;

    /* JADX INFO: renamed from: M */
    private boolean f70954M;

    /* JADX INFO: renamed from: M0 */
    private boolean f70955M0;

    /* JADX INFO: renamed from: N */
    private IdentityOcrInfo f70956N;

    /* JADX INFO: renamed from: O */
    private Bitmap f70958O;

    /* JADX INFO: renamed from: P */
    private Bitmap f70960P;

    /* JADX INFO: renamed from: Q */
    private String f70962Q;

    /* JADX INFO: renamed from: Q0 */
    private IdentityFarNearConfig f70963Q0;

    /* JADX INFO: renamed from: R */
    private IdentityOcrInfo f70964R;

    /* JADX INFO: renamed from: S */
    private Bitmap f70965S;

    /* JADX INFO: renamed from: T */
    private Bitmap f70966T;

    /* JADX INFO: renamed from: U */
    private String f70967U;

    /* JADX INFO: renamed from: V */
    private IdentityOcrInfo f70968V;

    /* JADX INFO: renamed from: W */
    private Bitmap f70969W;

    /* JADX INFO: renamed from: X */
    private Bitmap f70970X;

    /* JADX INFO: renamed from: Y */
    private String f70971Y;

    /* JADX INFO: renamed from: Z */
    private NfcConfigRes f70972Z;

    /* JADX INFO: renamed from: a */
    private String f70973a;

    /* JADX INFO: renamed from: a0 */
    private Bitmap f70974a0;

    /* JADX INFO: renamed from: b */
    private String f70975b;

    /* JADX INFO: renamed from: b0 */
    private Bitmap f70976b0;

    /* JADX INFO: renamed from: c */
    private String f70977c;

    /* JADX INFO: renamed from: c0 */
    private String f70978c0;

    /* JADX INFO: renamed from: d0 */
    private String f70980d0;

    /* JADX INFO: renamed from: e */
    private Map<String, Object> f70981e;

    /* JADX INFO: renamed from: e0 */
    private String f70982e0;

    /* JADX INFO: renamed from: f */
    private Map<String, Object> f70983f;

    /* JADX INFO: renamed from: f0 */
    private String f70984f0;

    /* JADX INFO: renamed from: g */
    private Map<String, Object> f70985g;

    /* JADX INFO: renamed from: g0 */
    private Bitmap f70986g0;

    /* JADX INFO: renamed from: h */
    private byte[] f70987h;

    /* JADX INFO: renamed from: h0 */
    private Bitmap f70988h0;

    /* JADX INFO: renamed from: i */
    private byte[] f70989i;

    /* JADX INFO: renamed from: i0 */
    private Bitmap f70990i0;

    /* JADX INFO: renamed from: j0 */
    private Bitmap f70992j0;

    /* JADX INFO: renamed from: k0 */
    private String f70994k0;

    /* JADX INFO: renamed from: l0 */
    private String f70996l0;

    /* JADX INFO: renamed from: m */
    private String f70997m;

    /* JADX INFO: renamed from: m0 */
    private String f70998m0;

    /* JADX INFO: renamed from: n */
    private tj20 f70999n;

    /* JADX INFO: renamed from: n0 */
    private Bitmap f71000n0;

    /* JADX INFO: renamed from: o */
    private String f71001o;

    /* JADX INFO: renamed from: o0 */
    private Bitmap f71002o0;

    /* JADX INFO: renamed from: p */
    private String f71003p;

    /* JADX INFO: renamed from: p0 */
    private Bitmap f71004p0;

    /* JADX INFO: renamed from: q */
    private String f71005q;

    /* JADX INFO: renamed from: q0 */
    private Bitmap f71006q0;

    /* JADX INFO: renamed from: r */
    private IdentityRetCallback f71007r;

    /* JADX INFO: renamed from: r0 */
    private String f71008r0;

    /* JADX INFO: renamed from: s */
    private OSSConfig f71009s;

    /* JADX INFO: renamed from: s0 */
    private String f71010s0;

    /* JADX INFO: renamed from: t */
    private String f71011t;

    /* JADX INFO: renamed from: t0 */
    private String f71012t0;

    /* JADX INFO: renamed from: u */
    private String f71013u;

    /* JADX INFO: renamed from: u0 */
    private String f71014u0;

    /* JADX INFO: renamed from: v */
    private IdentityOcrInfo f71015v;

    /* JADX INFO: renamed from: v0 */
    private String f71016v0;

    /* JADX INFO: renamed from: w */
    private String f71017w;

    /* JADX INFO: renamed from: w0 */
    private String f71018w0;

    /* JADX INFO: renamed from: x */
    private String f71019x;

    /* JADX INFO: renamed from: x0 */
    private String f71020x0;

    /* JADX INFO: renamed from: y */
    private String f71021y;

    /* JADX INFO: renamed from: y0 */
    private String f71022y0;

    /* JADX INFO: renamed from: z */
    private String f71023z;

    /* JADX INFO: renamed from: z0 */
    private String f71024z0;

    /* JADX INFO: renamed from: d */
    private List<String> f70979d = new ArrayList();

    /* JADX INFO: renamed from: j */
    private boolean f70991j = false;

    /* JADX INFO: renamed from: k */
    private boolean f70993k = true;

    /* JADX INFO: renamed from: l */
    private boolean f70995l = false;

    /* JADX INFO: renamed from: E */
    private boolean f70938E = false;

    /* JADX INFO: renamed from: E0 */
    public int f70939E0 = 0;

    /* JADX INFO: renamed from: F0 */
    private boolean f70941F0 = false;

    /* JADX INFO: renamed from: H0 */
    private float f70945H0 = 480.0f;

    /* JADX INFO: renamed from: I0 */
    private float f70947I0 = 480.0f;

    /* JADX INFO: renamed from: J0 */
    private float f70949J0 = 640.0f;

    /* JADX INFO: renamed from: K0 */
    private float f70951K0 = 0.8f;

    /* JADX INFO: renamed from: L0 */
    private Chameleon f70953L0 = new Chameleon();

    /* JADX INFO: renamed from: N0 */
    private long f70957N0 = 0;

    /* JADX INFO: renamed from: O0 */
    private boolean f70959O0 = false;

    /* JADX INFO: renamed from: P0 */
    public boolean f70961P0 = false;

    /* JADX INFO: renamed from: l.afm$a */
    public class RunnableC15701a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f71025a;

        public RunnableC15701a(String str) {
            this.f71025a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (afm.this.f71007r != null) {
                afm.this.f71007r.onIdentityFinish(this.f71025a);
            }
            afm.this.f70938E = true;
        }
    }

    private afm() {
    }

    /* JADX INFO: renamed from: H */
    public static afm m97360H() {
        if (f70928R0 == null) {
            synchronized (afm.class) {
                try {
                    if (f70928R0 == null) {
                        f70928R0 = new afm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f70928R0;
    }

    /* JADX INFO: renamed from: q0 */
    private void m97363q0() {
        tj20 tj20Var = this.f70999n;
        if (tj20Var != null) {
            this.f71001o = tj20Var.f174528b;
            this.f71003p = tj20Var.f174527a;
        }
    }

    /* JADX INFO: renamed from: A */
    public String m97364A() {
        t0g0.m188742e(t0g0.C20202a.f171518f, null);
        return this.f70994k0;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m97365A0() {
        return this.f71021y.equals(efm.f93798b);
    }

    /* JADX INFO: renamed from: A1 */
    public void m97366A1(Bitmap bitmap) {
        this.f70948J = bitmap;
    }

    /* JADX INFO: renamed from: B */
    public g5g m97367B() {
        return f70929S0;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m97368B0() {
        return this.f71021y.equals("SHAKE_HEAD_DISTANCE");
    }

    /* JADX INFO: renamed from: B1 */
    public void m97369B1(Bitmap bitmap) {
        this.f70970X = bitmap;
    }

    /* JADX INFO: renamed from: C */
    public Bitmap m97370C() {
        t0g0.m188742e(t0g0.C20202a.f171518f, null);
        return this.f70988h0;
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m97371C0() {
        return this.f71021y.equals("SILENT");
    }

    /* JADX INFO: renamed from: C1 */
    public void m97372C1(String str) {
        this.f70950K = str;
    }

    /* JADX INFO: renamed from: D */
    public String m97373D() {
        return this.f70996l0;
    }

    /* JADX INFO: renamed from: D0 */
    public void m97374D0(boolean z) {
        this.f70941F0 = z;
    }

    /* JADX INFO: renamed from: D1 */
    public void m97375D1(String str) {
        this.f70971Y = str;
    }

    /* JADX INFO: renamed from: E */
    public IdentityFarNearConfig m97376E() {
        return this.f70963Q0;
    }

    /* JADX INFO: renamed from: E0 */
    public void m97377E0(String str) {
        this.f70931A0 = str;
    }

    /* JADX INFO: renamed from: E1 */
    public void m97378E1(Bitmap bitmap) {
        this.f70944H = bitmap;
    }

    /* JADX INFO: renamed from: F */
    public int m97379F() {
        return this.f70943G0;
    }

    /* JADX INFO: renamed from: F0 */
    public void m97380F0(String str) {
        this.f70975b = str;
    }

    /* JADX INFO: renamed from: F1 */
    public void m97381F1(Bitmap bitmap) {
        this.f70969W = bitmap;
    }

    /* JADX INFO: renamed from: G */
    public boolean m97382G() {
        return this.f70959O0;
    }

    /* JADX INFO: renamed from: G0 */
    public void m97383G0(String str) {
        this.f70973a = str;
    }

    /* JADX INFO: renamed from: G1 */
    public void m97384G1(String str, boolean z) {
        this.f70952L = str;
        this.f70954M = z;
    }

    /* JADX INFO: renamed from: H0 */
    public void m97385H0(String str) {
        this.f70977c = str;
    }

    /* JADX INFO: renamed from: H1 */
    public void m97386H1(IdentityOcrInfo identityOcrInfo) {
        this.f71015v = identityOcrInfo;
    }

    /* JADX INFO: renamed from: I */
    public Bitmap m97387I() {
        t0g0.m188742e(t0g0.C20202a.f171518f, null);
        return this.f70990i0;
    }

    /* JADX INFO: renamed from: I0 */
    public void m97388I0(byte[] bArr) {
        this.f70987h = bArr;
    }

    /* JADX INFO: renamed from: I1 */
    public void m97389I1(String str) {
        this.f70932B = str;
    }

    /* JADX INFO: renamed from: J */
    public String m97390J() {
        return this.f70998m0;
    }

    /* JADX INFO: renamed from: J0 */
    public void m97391J0(String str) {
        this.f71016v0 = str;
    }

    /* JADX INFO: renamed from: J1 */
    public void m97392J1(OSSConfig oSSConfig) {
        this.f71009s = oSSConfig;
    }

    /* JADX INFO: renamed from: K */
    public tj20 m97393K() {
        return this.f70999n;
    }

    /* JADX INFO: renamed from: K0 */
    public void m97394K0(String str) {
        this.f71005q = str;
    }

    /* JADX INFO: renamed from: K1 */
    public void m97395K1(boolean z) {
        this.f70993k = z;
    }

    /* JADX INFO: renamed from: L */
    public NfcConfigRes m97396L() {
        return this.f70972Z;
    }

    /* JADX INFO: renamed from: L0 */
    public void m97397L0(Chameleon chameleon) {
        this.f70953L0 = chameleon;
    }

    /* JADX INFO: renamed from: L1 */
    public void m97398L1(String str) {
        this.f71022y0 = str;
    }

    /* JADX INFO: renamed from: M */
    public String m97399M() {
        return this.f70930A;
    }

    /* JADX INFO: renamed from: M0 */
    public void m97400M0(boolean z) {
        this.f70955M0 = z;
    }

    /* JADX INFO: renamed from: M1 */
    public void m97401M1(String str) {
        this.f71024z0 = str;
    }

    /* JADX INFO: renamed from: N */
    public Map<String, Object> m97402N() {
        return this.f70985g;
    }

    /* JADX INFO: renamed from: N0 */
    public void m97403N0(float f) {
        this.f70933B0 = f;
    }

    /* JADX INFO: renamed from: N1 */
    public void m97404N1(float f, float f2, float f3, float f4) {
        this.f70945H0 = f;
        this.f70947I0 = f2;
        this.f70949J0 = f3;
        this.f70951K0 = f4;
    }

    /* JADX INFO: renamed from: O */
    public String m97405O() {
        return this.f70978c0;
    }

    /* JADX INFO: renamed from: O0 */
    public void m97406O0(boolean z) {
        this.f70946I = z;
    }

    /* JADX INFO: renamed from: O1 */
    public void m97407O1(String str) {
        this.f70935C0 = str;
    }

    /* JADX INFO: renamed from: P */
    public Map<String, Object> m97408P() {
        return this.f70981e;
    }

    /* JADX INFO: renamed from: P0 */
    public void m97409P0(boolean z) {
        this.f70995l = z;
    }

    /* JADX INFO: renamed from: P1 */
    public void m97410P1(String str) {
        this.f70936D = str;
    }

    /* JADX INFO: renamed from: Q */
    public Map<String, Object> m97411Q() {
        return this.f70983f;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m97412Q0(String str) {
        this.f70997m = str;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m97413Q1(long j) {
        this.f70957N0 = j;
    }

    /* JADX INFO: renamed from: R */
    public IdentityOcrInfo m97414R() {
        return this.f70956N;
    }

    /* JADX INFO: renamed from: R0 */
    public void m97415R0(List<String> list) {
        this.f70979d = list;
    }

    /* JADX INFO: renamed from: R1 */
    public void m97416R1(String str) {
        this.f70934C = str;
    }

    /* JADX INFO: renamed from: S */
    public Bitmap m97417S() {
        return this.f70960P;
    }

    /* JADX INFO: renamed from: S0 */
    public void m97418S0(int i) {
        this.f70939E0 = i;
    }

    /* JADX INFO: renamed from: S1 */
    public void m97419S1(String str) {
        this.f71018w0 = str;
    }

    /* JADX INFO: renamed from: T */
    public String m97420T() {
        return this.f70962Q;
    }

    /* JADX INFO: renamed from: T0 */
    public void m97421T0(String str) {
        this.f70937D0 = str;
    }

    /* JADX INFO: renamed from: T1 */
    public void m97422T1(String str) {
        this.f71020x0 = str;
    }

    /* JADX INFO: renamed from: U */
    public Bitmap m97423U() {
        return this.f70958O;
    }

    /* JADX INFO: renamed from: U0 */
    public void m97424U0(String str) {
        this.f71019x = str;
    }

    /* JADX INFO: renamed from: V */
    public IdentityOcrInfo m97425V() {
        return this.f70942G;
    }

    /* JADX INFO: renamed from: V0 */
    public void m97426V0(String str) {
        this.f71017w = str;
    }

    /* JADX INFO: renamed from: W */
    public Bitmap m97427W() {
        return this.f70948J;
    }

    /* JADX INFO: renamed from: W0 */
    public void m97428W0(Bitmap bitmap) {
        t0g0.m188742e(t0g0.C20202a.f171517e, null);
        this.f70986g0 = bitmap;
    }

    /* JADX INFO: renamed from: X */
    public String m97429X() {
        return this.f70950K;
    }

    /* JADX INFO: renamed from: X0 */
    public void m97430X0(byte[] bArr) {
        this.f70989i = bArr;
    }

    /* JADX INFO: renamed from: Y */
    public Bitmap m97431Y() {
        return this.f70944H;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m97432Y0(String str) {
        this.f70994k0 = str;
    }

    /* JADX INFO: renamed from: Z */
    public String m97433Z() {
        return this.f70952L;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m97434Z0(String str) {
        this.f70940F = str;
    }

    /* JADX INFO: renamed from: a0 */
    public IdentityOcrInfo m97435a0() {
        return this.f71015v;
    }

    /* JADX INFO: renamed from: a1 */
    public void m97436a1(g5g g5gVar) {
        f70929S0 = g5gVar;
    }

    /* JADX INFO: renamed from: b0 */
    public String m97437b0() {
        return this.f70932B;
    }

    /* JADX INFO: renamed from: b1 */
    public void m97438b1(Bitmap bitmap) {
        t0g0.m188742e(t0g0.C20202a.f171517e, null);
        this.f70988h0 = bitmap;
    }

    /* JADX INFO: renamed from: c */
    public void m97439c() {
        this.f70997m = null;
        this.f70980d0 = null;
        this.f71005q = null;
        this.f71007r = null;
        this.f71009s = null;
        this.f71011t = null;
        this.f70938E = false;
        this.f71015v = null;
        this.f70942G = null;
        this.f70944H = null;
        this.f70948J = null;
        this.f70950K = null;
        this.f70952L = null;
        this.f70954M = true;
        this.f70956N = null;
        this.f70958O = null;
        this.f70960P = null;
        this.f70962Q = null;
        this.f71018w0 = null;
        this.f71020x0 = null;
        this.f71022y0 = null;
        this.f71024z0 = null;
        this.f70974a0 = null;
        this.f70976b0 = null;
        this.f70978c0 = null;
        this.f70982e0 = null;
        this.f70984f0 = null;
        this.f70986g0 = null;
        this.f70988h0 = null;
        this.f70990i0 = null;
        this.f70992j0 = null;
        this.f71016v0 = null;
        this.f70943G0 = 0;
        this.f70994k0 = null;
        this.f70996l0 = null;
        this.f70998m0 = null;
        this.f71006q0 = null;
        this.f71014u0 = null;
        this.f71000n0 = null;
        this.f71008r0 = null;
        this.f71002o0 = null;
        this.f71010s0 = null;
        this.f71004p0 = null;
        this.f71012t0 = null;
        this.f70941F0 = false;
        this.f70945H0 = 480.0f;
        this.f70947I0 = 480.0f;
        this.f70949J0 = 640.0f;
        this.f70951K0 = 0.8f;
        this.f70957N0 = 0L;
        this.f70935C0 = "";
        this.f70937D0 = "";
        this.f70939E0 = 0;
        this.f70963Q0 = null;
        this.f70972Z = null;
        this.f70932B = "";
        this.f70936D = "";
        this.f70979d.clear();
        this.f70981e = null;
        this.f70983f = null;
        this.f70985g = null;
        this.f70987h = null;
        this.f70989i = null;
        g5g g5gVar = f70929S0;
        if (g5gVar != null) {
            g5gVar.m129052b();
            f70929S0 = null;
        }
        this.f70999n = null;
        this.f70975b = "";
        this.f70973a = "";
        this.f70977c = "";
    }

    /* JADX INFO: renamed from: c0 */
    public float m97440c0() {
        return this.f70949J0;
    }

    /* JADX INFO: renamed from: c1 */
    public void m97441c1(String str) {
        this.f70996l0 = str;
    }

    /* JADX INFO: renamed from: d */
    public boolean m97442d(String str) {
        List<String> list = this.f70979d;
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
    public OSSConfig m97443d0() {
        return this.f71009s;
    }

    /* JADX INFO: renamed from: d1 */
    public void m97444d1(IdentityFarNearConfig identityFarNearConfig) {
        this.f70963Q0 = identityFarNearConfig;
    }

    /* JADX INFO: renamed from: e */
    public void m97445e(String str) {
        if (this.f70938E) {
            o6r0.m166281a("已经回调过了，不要重复回调...");
            return;
        }
        o6r0.m166281a("IdentityCenter.exitFlowVerify() errCode" + str);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC15701a(str));
            return;
        }
        this.f70938E = true;
        IdentityRetCallback identityRetCallback = this.f71007r;
        if (identityRetCallback != null) {
            identityRetCallback.onIdentityFinish(str);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m97446e0() {
        return this.f70993k;
    }

    /* JADX INFO: renamed from: e1 */
    public void m97447e1(IdentityRetCallback identityRetCallback) {
        this.f71007r = identityRetCallback;
    }

    /* JADX INFO: renamed from: f */
    public boolean m97448f() {
        return this.f70941F0;
    }

    /* JADX INFO: renamed from: f0 */
    public String m97449f0() {
        return this.f71022y0;
    }

    /* JADX INFO: renamed from: f1 */
    public void m97450f1(int i) {
        this.f70943G0 = i;
    }

    /* JADX INFO: renamed from: g */
    public String m97451g() {
        return this.f70931A0;
    }

    /* JADX INFO: renamed from: g0 */
    public String m97452g0() {
        return this.f71024z0;
    }

    /* JADX INFO: renamed from: g1 */
    public void m97453g1(boolean z) {
        this.f70959O0 = z;
    }

    /* JADX INFO: renamed from: h */
    public String m97454h() {
        return this.f70975b;
    }

    /* JADX INFO: renamed from: h0 */
    public float m97455h0() {
        return this.f70945H0;
    }

    /* JADX INFO: renamed from: h1 */
    public void m97456h1(String str) {
        this.f71021y = str;
    }

    /* JADX INFO: renamed from: i */
    public String m97457i() {
        return this.f70973a;
    }

    /* JADX INFO: renamed from: i0 */
    public String m97458i0() {
        return this.f70935C0;
    }

    /* JADX INFO: renamed from: i1 */
    public void m97459i1(Bitmap bitmap) {
        t0g0.m188742e(t0g0.C20202a.f171517e, null);
        this.f70990i0 = bitmap;
    }

    /* JADX INFO: renamed from: j */
    public String m97460j() {
        return this.f70977c;
    }

    /* JADX INFO: renamed from: j0 */
    public String m97461j0() {
        return this.f70936D;
    }

    /* JADX INFO: renamed from: j1 */
    public void m97462j1(String str) {
        this.f70998m0 = str;
    }

    /* JADX INFO: renamed from: k */
    public Bitmap m97463k() {
        return this.f70992j0;
    }

    /* JADX INFO: renamed from: k0 */
    public String m97464k0() {
        return this.f71023z;
    }

    /* JADX INFO: renamed from: k1 */
    public void m97465k1(tj20 tj20Var) {
        this.f70999n = tj20Var;
        m97363q0();
    }

    /* JADX INFO: renamed from: l */
    public byte[] m97466l() {
        return this.f70987h;
    }

    /* JADX INFO: renamed from: l0 */
    public long m97467l0() {
        return this.f70957N0;
    }

    /* JADX INFO: renamed from: l1 */
    public void m97468l1(NfcConfigRes nfcConfigRes) {
        this.f70972Z = nfcConfigRes;
    }

    /* JADX INFO: renamed from: m */
    public String m97469m() {
        return this.f71016v0;
    }

    /* JADX INFO: renamed from: m0 */
    public String m97470m0() {
        return this.f71003p;
    }

    /* JADX INFO: renamed from: m1 */
    public void m97471m1(String str) {
        this.f70930A = str;
    }

    /* JADX INFO: renamed from: n */
    public String m97472n() {
        return this.f71005q;
    }

    /* JADX INFO: renamed from: n0 */
    public String m97473n0() {
        return this.f71001o;
    }

    /* JADX INFO: renamed from: n1 */
    public void m97474n1(String str) {
        this.f71013u = str;
    }

    /* JADX INFO: renamed from: o */
    public Chameleon m97475o() {
        return this.f70953L0;
    }

    /* JADX INFO: renamed from: o0 */
    public String m97476o0() {
        return this.f71018w0;
    }

    /* JADX INFO: renamed from: o1 */
    public void m97477o1(Map<String, Object> map) {
        this.f70981e = map;
    }

    /* JADX INFO: renamed from: p */
    public float m97478p() {
        return this.f70933B0;
    }

    /* JADX INFO: renamed from: p0 */
    public String m97479p0() {
        return this.f71020x0;
    }

    /* JADX INFO: renamed from: p1 */
    public void m97480p1(Map<String, Object> map) {
        this.f70983f = map;
    }

    /* JADX INFO: renamed from: q */
    public boolean m97481q() {
        return this.f70991j;
    }

    /* JADX INFO: renamed from: q1 */
    public void m97482q1(IdentityOcrInfo identityOcrInfo) {
        this.f70956N = identityOcrInfo;
    }

    /* JADX INFO: renamed from: r */
    public boolean m97483r() {
        return this.f70995l;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m97484r0() {
        return this.f70955M0;
    }

    /* JADX INFO: renamed from: r1 */
    public void m97485r1(IdentityOcrInfo identityOcrInfo) {
        this.f70964R = identityOcrInfo;
    }

    /* JADX INFO: renamed from: s */
    public String m97486s() {
        return this.f70997m;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m97487s0() {
        return this.f70946I;
    }

    /* JADX INFO: renamed from: s1 */
    public void m97488s1(Bitmap bitmap) {
        this.f70960P = bitmap;
    }

    /* JADX INFO: renamed from: t */
    public List<String> m97489t() {
        return this.f70979d;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m97490t0() {
        return efm.f93797a.equals(this.f71021y) || "PHOTINUS_FAR_NEAR".equals(this.f71021y) || "PHOTINUS_FAR_NEAR_MULTI_ACTION".equals(this.f71021y) || "PHOTINUS_FAR_NEAR_LIVENESS".equals(this.f71021y);
    }

    /* JADX INFO: renamed from: t1 */
    public void m97491t1(Bitmap bitmap) {
        this.f70966T = bitmap;
    }

    /* JADX INFO: renamed from: u */
    public int m97492u() {
        return this.f70939E0;
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m97493u0() {
        return "PHOTINUS_FAR_NEAR".equals(this.f71021y) || "PHOTINUS_FAR_NEAR_MULTI_ACTION".equals(this.f71021y) || "PHOTINUS_LIVENESS".equals(this.f71021y) || efm.f93798b.equals(this.f71021y) || "PHOTINUS_FAR_NEAR_LIVENESS".equals(this.f71021y);
    }

    /* JADX INFO: renamed from: u1 */
    public void m97494u1(String str) {
        this.f70962Q = str;
    }

    /* JADX INFO: renamed from: v */
    public String m97495v() {
        return this.f70937D0;
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m97496v0() {
        return "Y".equals(this.f70940F) && this.f71021y.equals("PHOTINUS_FAR_NEAR_LIVENESS");
    }

    /* JADX INFO: renamed from: v1 */
    public void m97497v1(String str) {
        this.f70967U = str;
    }

    /* JADX INFO: renamed from: w */
    public String m97498w() {
        return this.f71019x;
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m97499w0() {
        return "PHOTINUS_FAR_NEAR".equals(this.f71021y);
    }

    /* JADX INFO: renamed from: w1 */
    public void m97500w1(Bitmap bitmap) {
        this.f70958O = bitmap;
    }

    /* JADX INFO: renamed from: x */
    public String m97501x() {
        return this.f71017w;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m97502x0() {
        return this.f71021y.equals("PHOTINUS_FAR_NEAR_MULTI_ACTION");
    }

    /* JADX INFO: renamed from: x1 */
    public void m97503x1(Bitmap bitmap) {
        this.f70965S = bitmap;
    }

    /* JADX INFO: renamed from: y */
    public Bitmap m97504y() {
        t0g0.m188742e(t0g0.C20202a.f171518f, null);
        return this.f70986g0;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m97505y0() {
        return this.f71021y.equals("LIVENESS");
    }

    /* JADX INFO: renamed from: y1 */
    public void m97506y1(IdentityOcrInfo identityOcrInfo) {
        this.f70942G = identityOcrInfo;
    }

    /* JADX INFO: renamed from: z */
    public byte[] m97507z() {
        return this.f70989i;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m97508z0() {
        return this.f71021y.equals("PHOTINUS_LIVENESS");
    }

    /* JADX INFO: renamed from: z1 */
    public void m97509z1(IdentityOcrInfo identityOcrInfo) {
        this.f70968V = identityOcrInfo;
    }
}
