package com.tencent.liteav.beauty;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14008a;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.C14016i;
import com.tencent.liteav.basic.p088c.C14017j;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.p091a.p092a.C14058a;
import com.tencent.liteav.beauty.p091a.p092a.C14060c;
import com.tencent.liteav.beauty.p093b.C14062a;
import com.tencent.liteav.beauty.p093b.C14068b;
import com.tencent.liteav.beauty.p093b.C14071c;
import com.tencent.liteav.beauty.p093b.C14081i;
import com.tencent.liteav.beauty.p093b.C14082j;
import com.tencent.liteav.beauty.p093b.C14083k;
import com.tencent.liteav.beauty.p093b.C14084l;
import com.tencent.liteav.beauty.p093b.C14085m;
import com.tencent.liteav.beauty.p093b.C14088p;
import com.tencent.liteav.beauty.p093b.C14098z;
import com.tencent.liteav.beauty.p093b.InterfaceC14086n;
import com.tencent.liteav.beauty.p093b.p094a.C14063a;
import com.tencent.liteav.beauty.p093b.p095b.C14069a;
import com.tencent.liteav.beauty.p093b.p096c.C14072a;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.c */
/* JADX INFO: loaded from: classes2.dex */
class HandlerThreadC14099c extends HandlerThread {

    /* JADX INFO: renamed from: A */
    private int f58833A;

    /* JADX INFO: renamed from: B */
    private int f58834B;

    /* JADX INFO: renamed from: C */
    private int f58835C;

    /* JADX INFO: renamed from: D */
    private int f58836D;

    /* JADX INFO: renamed from: E */
    private Context f58837E;

    /* JADX INFO: renamed from: F */
    private boolean f58838F;

    /* JADX INFO: renamed from: G */
    private boolean f58839G;

    /* JADX INFO: renamed from: H */
    private C14100d.e f58840H;

    /* JADX INFO: renamed from: I */
    private C14100d.f f58841I;

    /* JADX INFO: renamed from: J */
    private int f58842J;

    /* JADX INFO: renamed from: K */
    private int f58843K;

    /* JADX INFO: renamed from: L */
    private int f58844L;

    /* JADX INFO: renamed from: M */
    private int f58845M;

    /* JADX INFO: renamed from: N */
    private int f58846N;

    /* JADX INFO: renamed from: O */
    private int f58847O;

    /* JADX INFO: renamed from: P */
    private float f58848P;

    /* JADX INFO: renamed from: Q */
    private int f58849Q;

    /* JADX INFO: renamed from: R */
    private int f58850R;

    /* JADX INFO: renamed from: S */
    private int f58851S;

    /* JADX INFO: renamed from: T */
    private boolean f58852T;

    /* JADX INFO: renamed from: U */
    private float[] f58853U;

    /* JADX INFO: renamed from: V */
    private boolean f58854V;

    /* JADX INFO: renamed from: W */
    private int f58855W;

    /* JADX INFO: renamed from: X */
    private int f58856X;

    /* JADX INFO: renamed from: Y */
    private C14008a f58857Y;

    /* JADX INFO: renamed from: Z */
    private Bitmap f58858Z;

    /* JADX INFO: renamed from: a */
    boolean f58859a;

    /* JADX INFO: renamed from: aA */
    private a f58860aA;

    /* JADX INFO: renamed from: aB */
    private float f58861aB;

    /* JADX INFO: renamed from: aC */
    private int f58862aC;

    /* JADX INFO: renamed from: aD */
    private int f58863aD;

    /* JADX INFO: renamed from: aE */
    private int f58864aE;

    /* JADX INFO: renamed from: aF */
    private int f58865aF;

    /* JADX INFO: renamed from: aG */
    private int f58866aG;

    /* JADX INFO: renamed from: aH */
    private boolean f58867aH;

    /* JADX INFO: renamed from: aI */
    private C14060c f58868aI;

    /* JADX INFO: renamed from: aJ */
    private C14058a f58869aJ;

    /* JADX INFO: renamed from: aK */
    private Bitmap f58870aK;

    /* JADX INFO: renamed from: aL */
    private List<C14100d.f> f58871aL;

    /* JADX INFO: renamed from: aM */
    private long f58872aM;

    /* JADX INFO: renamed from: aN */
    private int f58873aN;

    /* JADX INFO: renamed from: aO */
    private final int f58874aO;

    /* JADX INFO: renamed from: aP */
    private final float f58875aP;

    /* JADX INFO: renamed from: aQ */
    private byte[] f58876aQ;

    /* JADX INFO: renamed from: aR */
    private int[] f58877aR;

    /* JADX INFO: renamed from: aS */
    private boolean f58878aS;

    /* JADX INFO: renamed from: aT */
    private byte[] f58879aT;

    /* JADX INFO: renamed from: aU */
    private int f58880aU;

    /* JADX INFO: renamed from: aV */
    private int f58881aV;

    /* JADX INFO: renamed from: aW */
    private int f58882aW;

    /* JADX INFO: renamed from: aX */
    private int f58883aX;

    /* JADX INFO: renamed from: aY */
    private InterfaceC14101e f58884aY;

    /* JADX INFO: renamed from: aZ */
    private WeakReference<InterfaceC14007b> f58885aZ;

    /* JADX INFO: renamed from: aa */
    private C14083k f58886aa;

    /* JADX INFO: renamed from: ab */
    private C14088p f58887ab;

    /* JADX INFO: renamed from: ac */
    private C14068b f58888ac;

    /* JADX INFO: renamed from: ad */
    private C14063a f58889ad;

    /* JADX INFO: renamed from: ae */
    private C14069a f58890ae;

    /* JADX INFO: renamed from: af */
    private C14071c f58891af;

    /* JADX INFO: renamed from: ag */
    private C14072a f58892ag;

    /* JADX INFO: renamed from: ah */
    private Bitmap f58893ah;

    /* JADX INFO: renamed from: ai */
    private Bitmap f58894ai;

    /* JADX INFO: renamed from: aj */
    private float f58895aj;

    /* JADX INFO: renamed from: ak */
    private float f58896ak;

    /* JADX INFO: renamed from: al */
    private float f58897al;

    /* JADX INFO: renamed from: am */
    private C14085m f58898am;

    /* JADX INFO: renamed from: an */
    private InterfaceC14086n f58899an;

    /* JADX INFO: renamed from: ao */
    private C14098z f58900ao;

    /* JADX INFO: renamed from: ap */
    private C14082j f58901ap;

    /* JADX INFO: renamed from: aq */
    private C14081i f58902aq;

    /* JADX INFO: renamed from: ar */
    private C14015h f58903ar;

    /* JADX INFO: renamed from: as */
    private C14084l f58904as;

    /* JADX INFO: renamed from: at */
    private C14016i f58905at;

    /* JADX INFO: renamed from: au */
    private C14015h f58906au;

    /* JADX INFO: renamed from: av */
    private final Queue<Runnable> f58907av;

    /* JADX INFO: renamed from: aw */
    private boolean f58908aw;

    /* JADX INFO: renamed from: ax */
    private Object f58909ax;

    /* JADX INFO: renamed from: ay */
    private Object f58910ay;

    /* JADX INFO: renamed from: az */
    private Handler f58911az;

    /* JADX INFO: renamed from: b */
    protected int[] f58912b;

    /* JADX INFO: renamed from: ba */
    private C14017j.b f58913ba;

    /* JADX INFO: renamed from: c */
    protected int[] f58914c;

    /* JADX INFO: renamed from: d */
    C14062a f58915d;

    /* JADX INFO: renamed from: e */
    C14062a f58916e;

    /* JADX INFO: renamed from: f */
    C14062a f58917f;

    /* JADX INFO: renamed from: g */
    private int f58918g;

    /* JADX INFO: renamed from: h */
    private int f58919h;

    /* JADX INFO: renamed from: i */
    private int f58920i;

    /* JADX INFO: renamed from: j */
    private int f58921j;

    /* JADX INFO: renamed from: k */
    private int f58922k;

    /* JADX INFO: renamed from: l */
    private int f58923l;

    /* JADX INFO: renamed from: m */
    private int f58924m;

    /* JADX INFO: renamed from: n */
    private int f58925n;

    /* JADX INFO: renamed from: o */
    private int f58926o;

    /* JADX INFO: renamed from: p */
    private int f58927p;

    /* JADX INFO: renamed from: q */
    private int f58928q;

    /* JADX INFO: renamed from: r */
    private int f58929r;

    /* JADX INFO: renamed from: s */
    private int f58930s;

    /* JADX INFO: renamed from: t */
    private int f58931t;

    /* JADX INFO: renamed from: u */
    private int f58932u;

    /* JADX INFO: renamed from: v */
    private int f58933v;

    /* JADX INFO: renamed from: w */
    private int f58934w;

    /* JADX INFO: renamed from: x */
    private int f58935x;

    /* JADX INFO: renamed from: y */
    private int f58936y;

    /* JADX INFO: renamed from: z */
    private int f58937z;

    public HandlerThreadC14099c(Context context, boolean z) {
        super("TXCFilterDrawer");
        this.f58918g = 0;
        this.f58919h = 0;
        this.f58920i = 0;
        this.f58921j = 0;
        this.f58922k = 0;
        this.f58923l = 0;
        this.f58924m = 0;
        this.f58925n = 0;
        this.f58926o = 0;
        this.f58927p = 0;
        this.f58928q = 0;
        this.f58929r = 0;
        this.f58930s = 0;
        this.f58931t = 0;
        this.f58932u = 0;
        this.f58933v = 0;
        this.f58934w = 0;
        this.f58935x = 0;
        this.f58936y = 0;
        this.f58937z = 0;
        this.f58833A = 0;
        this.f58834B = 0;
        this.f58835C = 0;
        this.f58836D = 0;
        this.f58837E = null;
        this.f58838F = true;
        this.f58839G = false;
        this.f58840H = new C14100d.e();
        this.f58841I = null;
        this.f58842J = -1;
        this.f58843K = -1;
        this.f58844L = -1;
        this.f58845M = -1;
        this.f58846N = -1;
        this.f58847O = -1;
        this.f58848P = 1.0f;
        this.f58849Q = -1;
        this.f58850R = -1;
        this.f58851S = 1;
        this.f58852T = false;
        this.f58853U = null;
        this.f58854V = false;
        this.f58855W = 0;
        this.f58856X = 0;
        this.f58857Y = null;
        this.f58858Z = null;
        this.f58886aa = null;
        this.f58887ab = null;
        this.f58888ac = null;
        this.f58889ad = null;
        this.f58890ae = null;
        this.f58891af = null;
        this.f58892ag = null;
        this.f58899an = null;
        this.f58900ao = null;
        this.f58901ap = null;
        this.f58902aq = null;
        this.f58903ar = null;
        this.f58904as = null;
        this.f58905at = null;
        this.f58906au = null;
        this.f58907av = new LinkedList();
        this.f58859a = false;
        this.f58909ax = new Object();
        this.f58910ay = new Object();
        this.f58861aB = 0.5f;
        this.f58862aC = 0;
        this.f58863aD = 0;
        this.f58864aE = 0;
        this.f58865aF = 0;
        this.f58866aG = 0;
        this.f58867aH = false;
        this.f58868aI = null;
        this.f58869aJ = null;
        this.f58870aK = null;
        this.f58871aL = null;
        this.f58872aM = 0L;
        this.f58873aN = 0;
        this.f58874aO = 100;
        this.f58875aP = 1000.0f;
        this.f58876aQ = null;
        this.f58877aR = null;
        this.f58878aS = false;
        this.f58879aT = null;
        this.f58912b = null;
        this.f58914c = null;
        this.f58880aU = -1;
        this.f58881aV = 0;
        this.f58882aW = 1;
        this.f58883aX = -1;
        this.f58884aY = null;
        this.f58885aZ = new WeakReference<>(null);
        this.f58915d = new C14062a();
        this.f58916e = new C14062a();
        this.f58917f = new C14062a();
        this.f58913ba = new C14017j.b() { // from class: com.tencent.liteav.beauty.c.12
        };
        this.f58837E = context;
        this.f58911az = new Handler(this.f58837E.getMainLooper());
        this.f58908aw = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public int m83172A(int i) {
        GLES20.glViewport(0, 0, this.f58842J, this.f58843K);
        return m83220a(this.f58886aa.m83138q(), i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83198b() {
        TXCLog.m82969i("TXCFilterDrawer", "come into releaseInternal");
        this.f58878aS = false;
        C14083k c14083k = this.f58886aa;
        if (c14083k != null) {
            c14083k.mo82806d();
            this.f58886aa = null;
        }
        C14088p c14088p = this.f58887ab;
        if (c14088p != null) {
            c14088p.mo82806d();
            this.f58887ab = null;
        }
        m83204c();
        C14085m c14085m = this.f58898am;
        if (c14085m != null) {
            c14085m.mo82806d();
            this.f58898am = null;
        }
        InterfaceC14086n interfaceC14086n = this.f58899an;
        if (interfaceC14086n != null) {
            interfaceC14086n.m83150a();
            this.f58899an = null;
        }
        C14016i c14016i = this.f58905at;
        if (c14016i != null) {
            c14016i.mo82806d();
            this.f58905at = null;
        }
        C14084l c14084l = this.f58904as;
        if (c14084l != null) {
            c14084l.mo82806d();
            this.f58904as = null;
        }
        C14015h c14015h = this.f58903ar;
        if (c14015h != null) {
            c14015h.mo82806d();
            this.f58903ar = null;
        }
        C14098z c14098z = this.f58900ao;
        if (c14098z != null) {
            c14098z.mo82806d();
            this.f58900ao = null;
        }
        C14082j c14082j = this.f58901ap;
        if (c14082j != null) {
            c14082j.m83133a();
            this.f58901ap = null;
        }
        C14081i c14081i = this.f58902aq;
        if (c14081i != null) {
            c14081i.mo82806d();
            this.f58902aq = null;
        }
        C14015h c14015h2 = this.f58906au;
        if (c14015h2 != null) {
            c14015h2.mo82806d();
            this.f58906au = null;
        }
        int[] iArr = this.f58912b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f58912b = null;
        }
        int[] iArr2 = this.f58914c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f58914c = null;
        }
        int[] iArr3 = this.f58877aR;
        if (iArr3 != null && iArr3[0] > 0) {
            GLES20.glDeleteBuffers(1, iArr3, 0);
            this.f58877aR = null;
        }
        TXCLog.m82969i("TXCFilterDrawer", "come out releaseInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m83205c(C14100d.b bVar) {
        TXCLog.m82969i("TXCFilterDrawer", "come into initInternal");
        m83198b();
        this.f58908aw = bVar.f59002j;
        this.f58842J = bVar.f58996d;
        this.f58843K = bVar.f58997e;
        this.f58857Y = bVar.f59005m;
        int i = bVar.f58999g;
        int i2 = bVar.f58998f;
        int i3 = bVar.f59000h;
        this.f58852T = bVar.f59001i;
        int i4 = bVar.f58994b;
        this.f58849Q = i4;
        int i5 = bVar.f58995c;
        this.f58850R = i5;
        int i6 = bVar.f58993a;
        this.f58844L = i;
        this.f58845M = i2;
        if (i3 == 90 || i3 == 270) {
            this.f58844L = i2;
            this.f58845M = i;
        }
        this.f58856X = bVar.f59004l;
        this.f58855W = bVar.f59003k;
        this.f58876aQ = new byte[i4 * i5 * 4];
        TXCLog.m82970i("TXCFilterDrawer", "processWidth mPituScaleRatio is %f, process size: %d x %d", Float.valueOf(this.f58848P), Integer.valueOf(this.f58844L), Integer.valueOf(this.f58845M));
        if (this.f58848P != 1.0f) {
            int i7 = this.f58844L;
            int i8 = this.f58845M;
            if (i7 >= i8) {
                i7 = i8;
            }
            if (i7 > 368) {
                this.f58848P = 432.0f / i7;
            }
            if (this.f58848P > 1.0f) {
                this.f58848P = 1.0f;
            }
        }
        float f = this.f58844L;
        float f2 = this.f58848P;
        int i9 = (int) (f * f2);
        this.f58846N = i9;
        int i10 = (int) (this.f58845M * f2);
        this.f58847O = i10;
        m83183a(i9, i10, this.f58862aC);
        C14100d.f fVar = this.f58841I;
        if (fVar != null && fVar.f59022a != null && this.f58900ao == null) {
            TXCLog.m82969i("TXCFilterDrawer", "reset water mark!");
            C14100d.f fVar2 = this.f58841I;
            m83227a(fVar2.f59022a, fVar2.f59023b, fVar2.f59024c, fVar2.f59025d);
        }
        Bitmap bitmap = this.f58893ah;
        if ((bitmap != null || this.f58894ai != null) && this.f58898am == null) {
            m83182a(this.f58846N, this.f58847O, this.f58895aj, bitmap, this.f58896ak, this.f58894ai, this.f58897al);
        }
        m83185a(this.f58857Y, i, i2, this.f58846N, this.f58847O, this.f58852T, i3, this.f58855W);
        m83184a(this.f58844L, this.f58845M, this.f58849Q, this.f58850R, i6);
        int[] iArr = this.f58912b;
        if (iArr == null) {
            this.f58912b = new int[1];
        } else {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
        }
        int[] iArr2 = this.f58914c;
        if (iArr2 == null) {
            this.f58914c = new int[1];
        } else {
            GLES20.glDeleteTextures(1, iArr2, 0);
        }
        m83192a(this.f58912b, this.f58914c, this.f58849Q, this.f58850R);
        if (3 == C14017j.m82819a()) {
            if (this.f58877aR == null) {
                this.f58877aR = new int[1];
            } else {
                TXCLog.m82969i("TXCFilterDrawer", "m_pbo0 is not null, delete Buffers, and recreate");
                GLES20.glDeleteBuffers(1, this.f58877aR, 0);
            }
            TXCLog.m82969i("TXCFilterDrawer", "opengl es 3.0, use PBO");
            C14017j.m82823a(i, i2, this.f58877aR);
        }
        TXCLog.m82969i("TXCFilterDrawer", "come out initInternal");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public boolean m83207d(C14100d.b bVar) {
        int i = bVar.f59003k;
        if ((1 == i || 3 == i || 2 == i) && this.f58886aa == null) {
            C14083k c14083k = new C14083k(bVar.f59003k);
            this.f58886aa = c14083k;
            c14083k.m82793a(true);
            if (!this.f58886aa.mo82796a()) {
                TXCLog.m82966e("TXCFilterDrawer", "mI4202RGBAFilter init failed!!, break init");
                return false;
            }
            this.f58886aa.mo82786a(bVar.f58996d, bVar.f58997e);
        }
        int i2 = bVar.f59004l;
        if ((1 == i2 || 3 == i2 || 2 == i2) && this.f58887ab == null) {
            C14088p c14088p = new C14088p(bVar.f59004l);
            this.f58887ab = c14088p;
            if (!c14088p.mo82796a()) {
                TXCLog.m82966e("TXCFilterDrawer", "mRGBA2I420Filter init failed!!, break init");
                return false;
            }
            this.f58887ab.mo82786a(bVar.f58994b, bVar.f58995c);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m83220a(int i, int i2, long j) {
        int iMo83271a;
        m83190a(this.f58907av);
        boolean z = this.f58848P != 1.0f;
        GLES20.glViewport(0, 0, this.f58846N, this.f58847O);
        C14084l c14084l = this.f58904as;
        if (c14084l != null) {
            if (4 == i2 || true == this.f58854V) {
                c14084l.mo82794a(this.f58853U);
                this.f58904as.m83139c(this.f58854V);
            }
            i = this.f58904as.mo82798b(i);
        }
        if (this.f58888ac != null) {
            int i3 = Math.min(this.f58849Q, this.f58850R) < 540 ? 0 : this.f58865aF;
            this.f58888ac.mo83096f(i3);
            if (this.f58863aD > 0 || this.f58864aE > 0 || this.f58866aG > 0 || i3 > 0) {
                i = this.f58888ac.mo82798b(i);
            }
        }
        C14085m c14085m = this.f58898am;
        if (c14085m != null) {
            i = c14085m.mo82798b(i);
        }
        GLES20.glViewport(0, 0, this.f58844L, this.f58845M);
        C14082j c14082j = this.f58901ap;
        if (c14082j != null) {
            i = c14082j.m83132a(i);
            z = false;
        }
        C14081i c14081i = this.f58902aq;
        if (c14081i != null) {
            i = c14081i.mo82798b(i);
            z = false;
        }
        if (z) {
            m83199b(this.f58844L, this.f58845M);
            if (this.f58906au != null) {
                GLES20.glViewport(0, 0, this.f58844L, this.f58845M);
                i = this.f58906au.mo82798b(i);
            }
        }
        InterfaceC14101e interfaceC14101e = this.f58884aY;
        if (interfaceC14101e != null && (iMo83271a = interfaceC14101e.mo83271a(i, this.f58844L, this.f58845M)) > 0) {
            i = iMo83271a;
        }
        GLES20.glViewport(0, 0, this.f58844L, this.f58845M);
        C14098z c14098z = this.f58900ao;
        if (c14098z != null) {
            i = c14098z.mo82798b(i);
        }
        if (this.f58903ar != null) {
            GLES20.glViewport(0, 0, this.f58849Q, this.f58850R);
            i = this.f58903ar.mo82798b(i);
        }
        m83175a(i, j);
        return i;
    }

    /* JADX INFO: renamed from: e */
    public void m83241e(final int i) {
        this.f58864aE = i;
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.3
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    C14057a.m83066a().m83070c();
                }
                if (HandlerThreadC14099c.this.f58888ac == null || i < 0) {
                    return;
                }
                HandlerThreadC14099c.this.f58888ac.mo83094d(i);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m83242f(final int i) {
        this.f58865aF = i;
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.4
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    C14057a.m83066a().m83073f();
                }
                if (HandlerThreadC14099c.this.f58888ac == null || i < 0) {
                    return;
                }
                HandlerThreadC14099c.this.f58888ac.mo83096f(i);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m83243g(final int i) {
        this.f58866aG = i;
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.5
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    C14057a.m83066a().m83071d();
                }
                if (HandlerThreadC14099c.this.f58888ac == null || i < 0) {
                    return;
                }
                HandlerThreadC14099c.this.f58888ac.mo83095e(i);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m83253q(int i) {
    }

    /* JADX INFO: renamed from: r */
    public void m83254r(int i) {
    }

    /* JADX INFO: renamed from: s */
    public void m83255s(int i) {
    }

    /* JADX INFO: renamed from: t */
    public void m83256t(int i) {
    }

    /* JADX INFO: renamed from: u */
    public void m83257u(int i) {
    }

    /* JADX INFO: renamed from: v */
    public void m83258v(int i) {
    }

    /* JADX INFO: renamed from: w */
    public void m83259w(int i) {
    }

    /* JADX INFO: renamed from: x */
    public void m83260x(int i) {
    }

    /* JADX INFO: renamed from: y */
    public void m83261y(int i) {
    }

    /* JADX INFO: renamed from: z */
    public void m83262z(int i) {
    }

    /* JADX INFO: renamed from: h */
    public void m83244h(int i) {
    }

    /* JADX INFO: renamed from: i */
    public void m83245i(int i) {
    }

    /* JADX INFO: renamed from: j */
    public void m83246j(int i) {
    }

    /* JADX INFO: renamed from: k */
    public void m83247k(int i) {
    }

    /* JADX INFO: renamed from: l */
    public void m83248l(int i) {
    }

    /* JADX INFO: renamed from: m */
    public void m83249m(int i) {
    }

    /* JADX INFO: renamed from: n */
    public void m83250n(int i) {
    }

    /* JADX INFO: renamed from: p */
    public void m83252p(int i) {
    }

    /* JADX INFO: renamed from: o */
    public void m83251o(int i) {
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.c$a */
    public class a extends Handler {

        /* JADX INFO: renamed from: b */
        private String f58973b;

        public a(Looper looper, Context context) {
            super(looper);
            this.f58973b = "EGLDrawThreadHandler";
        }

        /* JADX INFO: renamed from: a */
        public void m83264a() {
            TXCLog.m82969i(this.f58973b, "come into releaseEGL");
            HandlerThreadC14099c.this.m83198b();
            if (HandlerThreadC14099c.this.f58868aI != null) {
                HandlerThreadC14099c.this.f58868aI.m83084c();
                HandlerThreadC14099c.this.f58868aI = null;
            }
            if (HandlerThreadC14099c.this.f58869aJ != null) {
                HandlerThreadC14099c.this.f58869aJ.m83078a();
                HandlerThreadC14099c.this.f58869aJ = null;
            }
            HandlerThreadC14099c.this.f58867aH = false;
            NativeLoad.getInstance();
            NativeLoad.nativeDeleteYuv2Yuv();
            TXCLog.m82969i(this.f58973b, "come out releaseEGL");
        }

        /* JADX INFO: renamed from: b */
        public void m83265b() {
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0070 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:33:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            super.handleMessage(message);
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    m83264a();
                    HandlerThreadC14099c.this.f58915d.m83088a();
                } else if (i == 2) {
                    HandlerThreadC14099c.this.m83200b((byte[]) message.obj);
                } else if (i == 3) {
                    HandlerThreadC14099c.this.m83172A(message.arg1);
                } else if (i == 4) {
                    HandlerThreadC14099c.this.f58861aB = (float) (((double) message.arg1) / 100.0d);
                    if (HandlerThreadC14099c.this.f58898am != null) {
                        HandlerThreadC14099c.this.f58898am.m83147a(HandlerThreadC14099c.this.f58861aB);
                    }
                } else if (i == 5) {
                    HandlerThreadC14099c.this.m83207d((C14100d.b) message.obj);
                }
                z = false;
                synchronized (this) {
                    if (true == z) {
                        try {
                            notify();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            m83263a(message.obj);
            HandlerThreadC14099c.this.f58867aH = true;
            z = true;
            synchronized (this) {
                if (true == z) {
                    notify();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m83263a(Object obj) {
            TXCLog.m82969i(this.f58973b, "come into InitEGL");
            C14100d.b bVar = (C14100d.b) obj;
            m83264a();
            HandlerThreadC14099c.this.f58869aJ = new C14058a();
            HandlerThreadC14099c handlerThreadC14099c = HandlerThreadC14099c.this;
            handlerThreadC14099c.f58868aI = new C14060c(handlerThreadC14099c.f58869aJ, bVar.f58999g, bVar.f58998f, false);
            HandlerThreadC14099c.this.f58868aI.m83083b();
            boolean zM83205c = HandlerThreadC14099c.this.m83205c(bVar);
            String str = this.f58973b;
            if (!zM83205c) {
                TXCLog.m82966e(str, "initInternal failed!");
            } else {
                TXCLog.m82969i(str, "come out InitEGL");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m83240d(final int i) {
        if (this.f58862aC == i || i > 3 || i < 0) {
            return;
        }
        this.f58862aC = i;
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.2
            @Override // java.lang.Runnable
            public void run() {
                HandlerThreadC14099c handlerThreadC14099c = HandlerThreadC14099c.this;
                handlerThreadC14099c.m83183a(handlerThreadC14099c.f58846N, HandlerThreadC14099c.this.f58847O, i);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m83236b(final int i) {
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.11
            @Override // java.lang.Runnable
            public void run() {
                HandlerThreadC14099c.this.f58856X = i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83200b(byte[] bArr) {
        C14083k c14083k = this.f58886aa;
        if (c14083k == null) {
            TXCLog.m82966e("TXCFilterDrawer", "mI4202RGBAFilter is null!");
        } else {
            c14083k.m83137a(bArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83237b(boolean z) {
    }

    /* JADX INFO: renamed from: b */
    public boolean m83238b(C14100d.b bVar) {
        if (!this.f58908aw) {
            a aVar = this.f58860aA;
            if (aVar == null) {
                TXCLog.m82966e("TXCFilterDrawer", "mThreadHandler is null!");
                return false;
            }
            aVar.obtainMessage(5, 0, 0, bVar).sendToTarget();
            return true;
        }
        m83207d(bVar);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m83199b(int i, int i2) {
        if (this.f58906au == null) {
            TXCLog.m82969i("TXCFilterDrawer", "createRecoverScaleFilter");
            C14015h c14015h = new C14015h();
            this.f58906au = c14015h;
            if (true == c14015h.mo82796a()) {
                this.f58906au.m82793a(true);
            } else {
                TXCLog.m82966e("TXCFilterDrawer", "mRecoverScaleFilter init failed!");
            }
        }
        C14015h c14015h2 = this.f58906au;
        if (c14015h2 != null) {
            c14015h2.mo82786a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83230a(String str) {
    }

    /* JADX INFO: renamed from: a */
    public void m83231a(String str, boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m83235a(C14100d.b bVar) {
        boolean zM83205c;
        try {
            if (!bVar.f59002j) {
                if (this.f58860aA == null) {
                    start();
                    this.f58860aA = new a(getLooper(), this.f58837E);
                }
                this.f58860aA.obtainMessage(0, bVar).sendToTarget();
                this.f58860aA.m83265b();
                zM83205c = true;
            } else {
                zM83205c = m83205c(bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zM83205c;
    }

    /* JADX INFO: renamed from: a */
    public void m83225a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public int m83221a(byte[] bArr, int i) {
        m83233a(bArr);
        if (!this.f58908aw) {
            byte[] bArr2 = (byte[]) bArr.clone();
            this.f58860aA.obtainMessage(2, bArr2).sendToTarget();
            if (!this.f58878aS) {
                TXCLog.m82969i("TXCFilterDrawer", "First Frame, clear queue");
                NativeLoad.getInstance();
                NativeLoad.nativeClearQueue();
            }
            this.f58860aA.obtainMessage(3, i, 0).sendToTarget();
            m83191a(bArr2, this.f58878aS);
            this.f58878aS = true;
            return -1;
        }
        m83200b(bArr);
        return m83172A(i);
    }

    /* JADX INFO: renamed from: a */
    public void m83223a(final float f) {
        this.f58861aB = f;
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (HandlerThreadC14099c.this.f58898am != null) {
                    HandlerThreadC14099c.this.f58898am.m83147a(f);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83234a(final float[] fArr) {
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.7
            @Override // java.lang.Runnable
            public void run() {
                HandlerThreadC14099c.this.f58853U = fArr;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83232a(final boolean z) {
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.9
            @Override // java.lang.Runnable
            public void run() {
                HandlerThreadC14099c.this.f58854V = z;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m83185a(C14008a c14008a, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (this.f58904as == null) {
            TXCLog.m82969i("TXCFilterDrawer", "Create CropFilter");
            if (4 == i6) {
                this.f58904as = new C14084l("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", true);
            } else {
                this.f58904as = new C14084l();
            }
            if (true == this.f58904as.mo82796a()) {
                this.f58904as.m82793a(true);
            } else {
                TXCLog.m82966e("TXCFilterDrawer", "mInputCropFilter init failed!");
            }
        }
        this.f58904as.mo82786a(i3, i4);
        float[] fArrM82797a = this.f58904as.m82797a(this.f58842J, this.f58843K, null, c14008a, i6);
        int i7 = (720 - i5) % 360;
        int i8 = (i7 == 90 || i7 == 270) ? i4 : i3;
        if (i7 != 90 && i7 != 270) {
            i3 = i4;
        }
        this.f58904as.m82787a(i, i2, i7, fArrM82797a, i8 / i3, z, false);
    }

    /* JADX INFO: renamed from: a */
    private void m83184a(int i, int i2, int i3, int i4, int i5) {
        synchronized (this.f58910ay) {
            try {
                int i6 = (i5 + 360) % 360;
                TXCLog.m82969i("TXCFilterDrawer", "real outputAngle " + i6);
                if (this.f58903ar == null) {
                    if (i == i3 && i2 == i4 && i6 == 0) {
                        TXCLog.m82969i("TXCFilterDrawer", "Don't need change output Image, don't create out filter!");
                        return;
                    }
                    C14015h c14015h = new C14015h();
                    this.f58903ar = c14015h;
                    if (true == c14015h.mo82796a()) {
                        this.f58903ar.m82793a(true);
                    } else {
                        TXCLog.m82966e("TXCFilterDrawer", "mOutputZoomFilter init failed!");
                    }
                }
                this.f58903ar.mo82786a(i3, i4);
                this.f58903ar.m82788a((720 - i6) % 360, (FloatBuffer) null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83227a(final Bitmap bitmap, final float f, final float f2, final float f3) {
        if (this.f58841I == null) {
            this.f58841I = new C14100d.f();
        }
        if (TXCCommonUtil.equals(this.f58841I.f59022a, bitmap)) {
            C14100d.f fVar = this.f58841I;
            if (f == fVar.f59023b && f2 == fVar.f59024c && f3 == fVar.f59025d && this.f58900ao != null) {
                return;
            }
        }
        C14100d.f fVar2 = this.f58841I;
        fVar2.f59022a = bitmap;
        fVar2.f59023b = f;
        fVar2.f59024c = f2;
        fVar2.f59025d = f3;
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.10
            @Override // java.lang.Runnable
            public void run() {
                if (bitmap != null) {
                    C14057a.m83066a().m83074g();
                }
                Bitmap bitmap2 = bitmap;
                HandlerThreadC14099c handlerThreadC14099c = HandlerThreadC14099c.this;
                if (bitmap2 == null) {
                    if (handlerThreadC14099c.f58900ao != null) {
                        HandlerThreadC14099c.this.f58900ao.mo82806d();
                        HandlerThreadC14099c.this.f58900ao = null;
                        return;
                    }
                    return;
                }
                if (handlerThreadC14099c.f58900ao == null) {
                    if (HandlerThreadC14099c.this.f58844L <= 0 || HandlerThreadC14099c.this.f58845M <= 0) {
                        TXCLog.m82966e("TXCFilterDrawer", "output Width and Height is error!");
                        return;
                    }
                    HandlerThreadC14099c.this.f58900ao = new C14098z();
                    HandlerThreadC14099c.this.f58900ao.m82793a(true);
                    if (!HandlerThreadC14099c.this.f58900ao.mo82796a()) {
                        TXCLog.m82966e("TXCFilterDrawer", "mWatermarkFilter.init failed!");
                        HandlerThreadC14099c.this.f58900ao.mo82806d();
                        HandlerThreadC14099c.this.f58900ao = null;
                        return;
                    }
                    HandlerThreadC14099c.this.f58900ao.mo82786a(HandlerThreadC14099c.this.f58844L, HandlerThreadC14099c.this.f58845M);
                }
                HandlerThreadC14099c.this.f58900ao.m83171d(true);
                HandlerThreadC14099c.this.f58900ao.m83169a(bitmap, f, f2, f3);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83229a(InterfaceC14101e interfaceC14101e) {
        TXCLog.m82969i("TXCFilterDrawer", "set listener");
        this.f58884aY = interfaceC14101e;
    }

    /* JADX INFO: renamed from: a */
    public void m83228a(InterfaceC14007b interfaceC14007b) {
        TXCLog.m82969i("TXCFilterDrawer", "set notify");
        WeakReference<InterfaceC14007b> weakReference = new WeakReference<>(interfaceC14007b);
        this.f58885aZ = weakReference;
        C14082j c14082j = this.f58901ap;
        if (c14082j != null) {
            c14082j.m83134a(weakReference.get());
        }
    }

    /* JADX INFO: renamed from: a */
    private int m83175a(int i, long j) {
        int i2 = this.f58856X;
        if (i2 == 0) {
            if (this.f58884aY == null) {
                return i;
            }
            if (j == 0) {
                j = TXCTimeUtil.generatePtsMS();
            }
            this.f58884aY.mo83279a(i, this.f58849Q, this.f58850R, j);
            return i;
        }
        if (1 != i2 && 3 != i2 && 2 != i2) {
            TXCLog.m82966e("TXCFilterDrawer", "Don't support format!");
            return -1;
        }
        GLES20.glViewport(0, 0, this.f58849Q, this.f58850R);
        if (this.f58887ab == null) {
            TXCLog.m82966e("TXCFilterDrawer", "mRGBA2I420Filter is null!");
            return i;
        }
        GLES20.glBindFramebuffer(36160, this.f58912b[0]);
        this.f58887ab.m82783a(i);
        int i3 = this.f58856X;
        int i4 = this.f58849Q;
        if (2 == i3) {
            m83174a(i4, this.f58850R);
        } else {
            m83174a(i4, (this.f58850R * 3) / 8);
        }
        GLES20.glBindFramebuffer(36160, 0);
        return i;
    }

    /* JADX INFO: renamed from: a */
    private int m83174a(int i, int i2) {
        if (true == this.f58908aw) {
            if (this.f58884aY != null) {
                NativeLoad.getInstance();
                NativeLoad.nativeGlReadPixs(i, i2, this.f58876aQ);
                this.f58884aY.mo83289a(this.f58876aQ, this.f58849Q, this.f58850R, this.f58856X, TXCTimeUtil.generatePtsMS());
            } else if (this.f58879aT != null) {
                NativeLoad.getInstance();
                NativeLoad.nativeGlReadPixs(i, i2, this.f58879aT);
            }
        } else if (3 == C14017j.m82819a()) {
            if (0 == this.f58872aM) {
                this.f58872aM = TXCTimeUtil.getTimeTick();
            }
            int i3 = this.f58873aN + 1;
            this.f58873aN = i3;
            if (i3 >= 100) {
                TXCLog.m82969i("TXCFilterDrawer", "Real fps " + (100.0f / ((TXCTimeUtil.getTimeTick() - this.f58872aM) / 1000.0f)));
                this.f58873aN = 0;
                this.f58872aM = TXCTimeUtil.getTimeTick();
            }
            GLES20.glPixelStorei(3333, 1);
            GLES30.glReadBuffer(TXLiteAVCode.EVT_LOCAL_RECORD_RESULT);
            GLES20.glBindBuffer(35051, this.f58877aR[0]);
            NativeLoad.getInstance();
            NativeLoad.nativeGlReadPixs(i, i2, null);
            ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, i * i2 * 4, 1);
            if (byteBuffer == null) {
                TXCLog.m82966e("TXCFilterDrawer", "glMapBufferRange is null");
                return -1;
            }
            NativeLoad.getInstance();
            NativeLoad.nativeGlMapBufferToQueue(i, i2, byteBuffer);
            GLES30.glUnmapBuffer(35051);
            GLES20.glBindBuffer(35051, 0);
        } else {
            NativeLoad.getInstance();
            NativeLoad.nativeGlReadPixsToQueue(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private void m83191a(byte[] bArr, boolean z) {
        if (!z) {
            InterfaceC14101e interfaceC14101e = this.f58884aY;
            if (interfaceC14101e == null) {
                TXCLog.m82969i("TXCFilterDrawer", "First Frame, don't process!");
                return;
            } else {
                interfaceC14101e.mo83289a(bArr, this.f58849Q, this.f58850R, this.f58856X, TXCTimeUtil.generatePtsMS());
                return;
            }
        }
        int i = this.f58850R;
        int i2 = (i * 3) / 8;
        if (2 != this.f58856X) {
            i = i2;
        }
        if (this.f58884aY != null) {
            NativeLoad.getInstance();
            if (true == NativeLoad.nativeGlReadPixsFromQueue(this.f58849Q, i, this.f58876aQ)) {
                this.f58884aY.mo83289a(this.f58876aQ, this.f58849Q, this.f58850R, this.f58856X, TXCTimeUtil.generatePtsMS());
                return;
            } else {
                TXCLog.m82964d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
                this.f58884aY.mo83289a(bArr, this.f58849Q, this.f58850R, this.f58856X, TXCTimeUtil.generatePtsMS());
                return;
            }
        }
        NativeLoad.getInstance();
        if (NativeLoad.nativeGlReadPixsFromQueue(this.f58849Q, i, this.f58879aT)) {
            return;
        }
        TXCLog.m82964d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
    }

    /* JADX INFO: renamed from: c */
    public void m83239c(final int i) {
        this.f58863aD = i;
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.13
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    C14057a.m83066a().m83069b();
                }
                if (HandlerThreadC14099c.this.f58888ac == null || i < 0) {
                    return;
                }
                HandlerThreadC14099c.this.f58888ac.mo83092c(i);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private void m83204c() {
        C14063a c14063a = this.f58889ad;
        if (c14063a != null) {
            c14063a.mo82806d();
            this.f58889ad = null;
        }
        C14069a c14069a = this.f58890ae;
        if (c14069a != null) {
            c14069a.mo82806d();
            this.f58890ae = null;
        }
        C14071c c14071c = this.f58891af;
        if (c14071c != null) {
            c14071c.mo82806d();
            this.f58891af = null;
        }
        C14072a c14072a = this.f58892ag;
        if (c14072a != null) {
            c14072a.mo82806d();
            this.f58892ag = null;
        }
        this.f58888ac = null;
    }

    /* JADX INFO: renamed from: a */
    public void m83233a(byte[] bArr) {
        this.f58879aT = bArr;
    }

    /* JADX INFO: renamed from: a */
    public void m83222a() {
        if (!this.f58908aw) {
            a aVar = this.f58860aA;
            if (aVar != null) {
                aVar.obtainMessage(1).sendToTarget();
                try {
                    this.f58915d.m83089b();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            return;
        }
        m83198b();
    }

    /* JADX INFO: renamed from: a */
    private void m83192a(int[] iArr, int[] iArr2, int i, int i2) {
        GLES20.glGenFramebuffers(1, iArr, 0);
        iArr2[0] = C14017j.m82822a(i, i2, 6408, 6408, iArr2);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m83226a(Bitmap bitmap) {
        m83224a(1.0f, bitmap, this.f58861aB, (Bitmap) null, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m83224a(final float f, final Bitmap bitmap, final float f2, final Bitmap bitmap2, final float f3) {
        if (this.f58893ah == bitmap && this.f58894ai == bitmap2) {
            if (this.f58898am != null) {
                if (this.f58895aj == f && this.f58896ak == f2 && this.f58897al == f3) {
                    return;
                }
                this.f58895aj = f;
                this.f58896ak = f2;
                this.f58897al = f3;
                m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.8
                    @Override // java.lang.Runnable
                    public void run() {
                        HandlerThreadC14099c.this.f58898am.m83148a(f, f2, f3);
                    }
                });
                return;
            }
            return;
        }
        this.f58893ah = bitmap;
        this.f58894ai = bitmap2;
        this.f58895aj = f;
        this.f58896ak = f2;
        this.f58897al = f3;
        m83189a(new Runnable() { // from class: com.tencent.liteav.beauty.c.6
            @Override // java.lang.Runnable
            public void run() {
                if (HandlerThreadC14099c.this.f58898am != null) {
                    C14057a.m83066a().m83072e();
                }
                if (HandlerThreadC14099c.this.f58893ah == null && HandlerThreadC14099c.this.f58894ai == null) {
                    if (HandlerThreadC14099c.this.f58898am != null) {
                        HandlerThreadC14099c.this.f58898am.mo82806d();
                        HandlerThreadC14099c.this.f58898am = null;
                        return;
                    }
                    return;
                }
                C14085m c14085m = HandlerThreadC14099c.this.f58898am;
                HandlerThreadC14099c handlerThreadC14099c = HandlerThreadC14099c.this;
                if (c14085m == null) {
                    handlerThreadC14099c.m83182a(handlerThreadC14099c.f58846N, HandlerThreadC14099c.this.f58847O, HandlerThreadC14099c.this.f58895aj, HandlerThreadC14099c.this.f58893ah, HandlerThreadC14099c.this.f58896ak, HandlerThreadC14099c.this.f58894ai, HandlerThreadC14099c.this.f58897al);
                } else {
                    handlerThreadC14099c.f58898am.m83149a(f, bitmap, f2, bitmap2, f3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83183a(int i, int i2, int i3) {
        TXCLog.m82969i("TXCFilterDrawer", "create Beauty Filter!");
        if (i3 == 0) {
            if (this.f58889ad == null) {
                this.f58889ad = new C14063a();
            }
            this.f58888ac = this.f58889ad;
        } else if (1 == i3) {
            if (this.f58890ae == null) {
                this.f58890ae = new C14069a();
            }
            this.f58888ac = this.f58890ae;
        } else if (2 == i3) {
            if (this.f58892ag == null) {
                this.f58892ag = new C14072a();
            }
            this.f58888ac = this.f58892ag;
        } else if (3 == i3) {
            if (this.f58891af == null) {
                this.f58891af = new C14071c();
            }
            this.f58888ac = this.f58891af;
        }
        C14068b c14068b = this.f58888ac;
        if (c14068b == null) {
            TXCLog.m82966e("TXCFilterDrawer", "mBeautyFilter set error!");
            return;
        }
        c14068b.m82793a(true);
        if (true == this.f58888ac.mo83093c(i, i2)) {
            int i4 = this.f58863aD;
            if (i4 > 0) {
                this.f58888ac.mo83092c(i4);
            }
            int i5 = this.f58864aE;
            if (i5 > 0) {
                this.f58888ac.mo83094d(i5);
            }
            int i6 = this.f58866aG;
            if (i6 > 0) {
                this.f58888ac.mo83095e(i6);
            }
            int i7 = this.f58865aF;
            if (i7 > 0) {
                this.f58888ac.mo83096f(i7);
                return;
            }
            return;
        }
        TXCLog.m82966e("TXCFilterDrawer", "mBeautyFilter init failed!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83182a(int i, int i2, float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        if (this.f58898am == null) {
            TXCLog.m82969i("TXCFilterDrawer", "createComLooKupFilter");
            C14085m c14085m = new C14085m(f, bitmap, f2, bitmap2, f3);
            this.f58898am = c14085m;
            if (true == c14085m.mo82796a()) {
                this.f58898am.m82793a(true);
                this.f58898am.mo82786a(i, i2);
            } else {
                TXCLog.m82966e("TXCFilterDrawer", "mLookupFilterGroup init failed!");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83189a(Runnable runnable) {
        synchronized (this.f58907av) {
            this.f58907av.add(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83190a(Queue<Runnable> queue) {
        Runnable runnablePoll;
        while (true) {
            synchronized (queue) {
                try {
                    runnablePoll = !queue.isEmpty() ? queue.poll() : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (runnablePoll == null) {
                return;
            } else {
                runnablePoll.run();
            }
        }
    }
}
