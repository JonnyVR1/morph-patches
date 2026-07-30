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
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.C14171a;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.C14179i;
import com.tencent.liteav.basic.p093c.C14180j;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.p096a.p097a.C14221a;
import com.tencent.liteav.beauty.p096a.p097a.C14223c;
import com.tencent.liteav.beauty.p098b.C14225a;
import com.tencent.liteav.beauty.p098b.C14231b;
import com.tencent.liteav.beauty.p098b.C14234c;
import com.tencent.liteav.beauty.p098b.C14244i;
import com.tencent.liteav.beauty.p098b.C14245j;
import com.tencent.liteav.beauty.p098b.C14246k;
import com.tencent.liteav.beauty.p098b.C14247l;
import com.tencent.liteav.beauty.p098b.C14248m;
import com.tencent.liteav.beauty.p098b.C14251p;
import com.tencent.liteav.beauty.p098b.C14261z;
import com.tencent.liteav.beauty.p098b.InterfaceC14249n;
import com.tencent.liteav.beauty.p098b.p099a.C14226a;
import com.tencent.liteav.beauty.p098b.p100b.C14232a;
import com.tencent.liteav.beauty.p098b.p101c.C14235a;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.c */
/* JADX INFO: loaded from: classes2.dex */
class HandlerThreadC14262c extends HandlerThread {

    /* JADX INFO: renamed from: A */
    private int f59681A;

    /* JADX INFO: renamed from: B */
    private int f59682B;

    /* JADX INFO: renamed from: C */
    private int f59683C;

    /* JADX INFO: renamed from: D */
    private int f59684D;

    /* JADX INFO: renamed from: E */
    private Context f59685E;

    /* JADX INFO: renamed from: F */
    private boolean f59686F;

    /* JADX INFO: renamed from: G */
    private boolean f59687G;

    /* JADX INFO: renamed from: H */
    private C14263d.e f59688H;

    /* JADX INFO: renamed from: I */
    private C14263d.f f59689I;

    /* JADX INFO: renamed from: J */
    private int f59690J;

    /* JADX INFO: renamed from: K */
    private int f59691K;

    /* JADX INFO: renamed from: L */
    private int f59692L;

    /* JADX INFO: renamed from: M */
    private int f59693M;

    /* JADX INFO: renamed from: N */
    private int f59694N;

    /* JADX INFO: renamed from: O */
    private int f59695O;

    /* JADX INFO: renamed from: P */
    private float f59696P;

    /* JADX INFO: renamed from: Q */
    private int f59697Q;

    /* JADX INFO: renamed from: R */
    private int f59698R;

    /* JADX INFO: renamed from: S */
    private int f59699S;

    /* JADX INFO: renamed from: T */
    private boolean f59700T;

    /* JADX INFO: renamed from: U */
    private float[] f59701U;

    /* JADX INFO: renamed from: V */
    private boolean f59702V;

    /* JADX INFO: renamed from: W */
    private int f59703W;

    /* JADX INFO: renamed from: X */
    private int f59704X;

    /* JADX INFO: renamed from: Y */
    private C14171a f59705Y;

    /* JADX INFO: renamed from: Z */
    private Bitmap f59706Z;

    /* JADX INFO: renamed from: a */
    boolean f59707a;

    /* JADX INFO: renamed from: aA */
    private a f59708aA;

    /* JADX INFO: renamed from: aB */
    private float f59709aB;

    /* JADX INFO: renamed from: aC */
    private int f59710aC;

    /* JADX INFO: renamed from: aD */
    private int f59711aD;

    /* JADX INFO: renamed from: aE */
    private int f59712aE;

    /* JADX INFO: renamed from: aF */
    private int f59713aF;

    /* JADX INFO: renamed from: aG */
    private int f59714aG;

    /* JADX INFO: renamed from: aH */
    private boolean f59715aH;

    /* JADX INFO: renamed from: aI */
    private C14223c f59716aI;

    /* JADX INFO: renamed from: aJ */
    private C14221a f59717aJ;

    /* JADX INFO: renamed from: aK */
    private Bitmap f59718aK;

    /* JADX INFO: renamed from: aL */
    private List<C14263d.f> f59719aL;

    /* JADX INFO: renamed from: aM */
    private long f59720aM;

    /* JADX INFO: renamed from: aN */
    private int f59721aN;

    /* JADX INFO: renamed from: aO */
    private final int f59722aO;

    /* JADX INFO: renamed from: aP */
    private final float f59723aP;

    /* JADX INFO: renamed from: aQ */
    private byte[] f59724aQ;

    /* JADX INFO: renamed from: aR */
    private int[] f59725aR;

    /* JADX INFO: renamed from: aS */
    private boolean f59726aS;

    /* JADX INFO: renamed from: aT */
    private byte[] f59727aT;

    /* JADX INFO: renamed from: aU */
    private int f59728aU;

    /* JADX INFO: renamed from: aV */
    private int f59729aV;

    /* JADX INFO: renamed from: aW */
    private int f59730aW;

    /* JADX INFO: renamed from: aX */
    private int f59731aX;

    /* JADX INFO: renamed from: aY */
    private InterfaceC14264e f59732aY;

    /* JADX INFO: renamed from: aZ */
    private WeakReference<InterfaceC14170b> f59733aZ;

    /* JADX INFO: renamed from: aa */
    private C14246k f59734aa;

    /* JADX INFO: renamed from: ab */
    private C14251p f59735ab;

    /* JADX INFO: renamed from: ac */
    private C14231b f59736ac;

    /* JADX INFO: renamed from: ad */
    private C14226a f59737ad;

    /* JADX INFO: renamed from: ae */
    private C14232a f59738ae;

    /* JADX INFO: renamed from: af */
    private C14234c f59739af;

    /* JADX INFO: renamed from: ag */
    private C14235a f59740ag;

    /* JADX INFO: renamed from: ah */
    private Bitmap f59741ah;

    /* JADX INFO: renamed from: ai */
    private Bitmap f59742ai;

    /* JADX INFO: renamed from: aj */
    private float f59743aj;

    /* JADX INFO: renamed from: ak */
    private float f59744ak;

    /* JADX INFO: renamed from: al */
    private float f59745al;

    /* JADX INFO: renamed from: am */
    private C14248m f59746am;

    /* JADX INFO: renamed from: an */
    private InterfaceC14249n f59747an;

    /* JADX INFO: renamed from: ao */
    private C14261z f59748ao;

    /* JADX INFO: renamed from: ap */
    private C14245j f59749ap;

    /* JADX INFO: renamed from: aq */
    private C14244i f59750aq;

    /* JADX INFO: renamed from: ar */
    private C14178h f59751ar;

    /* JADX INFO: renamed from: as */
    private C14247l f59752as;

    /* JADX INFO: renamed from: at */
    private C14179i f59753at;

    /* JADX INFO: renamed from: au */
    private C14178h f59754au;

    /* JADX INFO: renamed from: av */
    private final Queue<Runnable> f59755av;

    /* JADX INFO: renamed from: aw */
    private boolean f59756aw;

    /* JADX INFO: renamed from: ax */
    private Object f59757ax;

    /* JADX INFO: renamed from: ay */
    private Object f59758ay;

    /* JADX INFO: renamed from: az */
    private Handler f59759az;

    /* JADX INFO: renamed from: b */
    protected int[] f59760b;

    /* JADX INFO: renamed from: ba */
    private C14180j.b f59761ba;

    /* JADX INFO: renamed from: c */
    protected int[] f59762c;

    /* JADX INFO: renamed from: d */
    C14225a f59763d;

    /* JADX INFO: renamed from: e */
    C14225a f59764e;

    /* JADX INFO: renamed from: f */
    C14225a f59765f;

    /* JADX INFO: renamed from: g */
    private int f59766g;

    /* JADX INFO: renamed from: h */
    private int f59767h;

    /* JADX INFO: renamed from: i */
    private int f59768i;

    /* JADX INFO: renamed from: j */
    private int f59769j;

    /* JADX INFO: renamed from: k */
    private int f59770k;

    /* JADX INFO: renamed from: l */
    private int f59771l;

    /* JADX INFO: renamed from: m */
    private int f59772m;

    /* JADX INFO: renamed from: n */
    private int f59773n;

    /* JADX INFO: renamed from: o */
    private int f59774o;

    /* JADX INFO: renamed from: p */
    private int f59775p;

    /* JADX INFO: renamed from: q */
    private int f59776q;

    /* JADX INFO: renamed from: r */
    private int f59777r;

    /* JADX INFO: renamed from: s */
    private int f59778s;

    /* JADX INFO: renamed from: t */
    private int f59779t;

    /* JADX INFO: renamed from: u */
    private int f59780u;

    /* JADX INFO: renamed from: v */
    private int f59781v;

    /* JADX INFO: renamed from: w */
    private int f59782w;

    /* JADX INFO: renamed from: x */
    private int f59783x;

    /* JADX INFO: renamed from: y */
    private int f59784y;

    /* JADX INFO: renamed from: z */
    private int f59785z;

    public HandlerThreadC14262c(Context context, boolean z) {
        super("TXCFilterDrawer");
        this.f59766g = 0;
        this.f59767h = 0;
        this.f59768i = 0;
        this.f59769j = 0;
        this.f59770k = 0;
        this.f59771l = 0;
        this.f59772m = 0;
        this.f59773n = 0;
        this.f59774o = 0;
        this.f59775p = 0;
        this.f59776q = 0;
        this.f59777r = 0;
        this.f59778s = 0;
        this.f59779t = 0;
        this.f59780u = 0;
        this.f59781v = 0;
        this.f59782w = 0;
        this.f59783x = 0;
        this.f59784y = 0;
        this.f59785z = 0;
        this.f59681A = 0;
        this.f59682B = 0;
        this.f59683C = 0;
        this.f59684D = 0;
        this.f59685E = null;
        this.f59686F = true;
        this.f59687G = false;
        this.f59688H = new C14263d.e();
        this.f59689I = null;
        this.f59690J = -1;
        this.f59691K = -1;
        this.f59692L = -1;
        this.f59693M = -1;
        this.f59694N = -1;
        this.f59695O = -1;
        this.f59696P = 1.0f;
        this.f59697Q = -1;
        this.f59698R = -1;
        this.f59699S = 1;
        this.f59700T = false;
        this.f59701U = null;
        this.f59702V = false;
        this.f59703W = 0;
        this.f59704X = 0;
        this.f59705Y = null;
        this.f59706Z = null;
        this.f59734aa = null;
        this.f59735ab = null;
        this.f59736ac = null;
        this.f59737ad = null;
        this.f59738ae = null;
        this.f59739af = null;
        this.f59740ag = null;
        this.f59747an = null;
        this.f59748ao = null;
        this.f59749ap = null;
        this.f59750aq = null;
        this.f59751ar = null;
        this.f59752as = null;
        this.f59753at = null;
        this.f59754au = null;
        this.f59755av = new LinkedList();
        this.f59707a = false;
        this.f59757ax = new Object();
        this.f59758ay = new Object();
        this.f59709aB = 0.5f;
        this.f59710aC = 0;
        this.f59711aD = 0;
        this.f59712aE = 0;
        this.f59713aF = 0;
        this.f59714aG = 0;
        this.f59715aH = false;
        this.f59716aI = null;
        this.f59717aJ = null;
        this.f59718aK = null;
        this.f59719aL = null;
        this.f59720aM = 0L;
        this.f59721aN = 0;
        this.f59722aO = 100;
        this.f59723aP = 1000.0f;
        this.f59724aQ = null;
        this.f59725aR = null;
        this.f59726aS = false;
        this.f59727aT = null;
        this.f59760b = null;
        this.f59762c = null;
        this.f59728aU = -1;
        this.f59729aV = 0;
        this.f59730aW = 1;
        this.f59731aX = -1;
        this.f59732aY = null;
        this.f59733aZ = new WeakReference<>(null);
        this.f59763d = new C14225a();
        this.f59764e = new C14225a();
        this.f59765f = new C14225a();
        this.f59761ba = new C14180j.b() { // from class: com.tencent.liteav.beauty.c.12
        };
        this.f59685E = context;
        this.f59759az = new Handler(this.f59685E.getMainLooper());
        this.f59756aw = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public int m84355A(int i) {
        GLES20.glViewport(0, 0, this.f59690J, this.f59691K);
        return m84403a(this.f59734aa.m84321q(), i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m84381b() {
        TXCLog.m84152i("TXCFilterDrawer", "come into releaseInternal");
        this.f59726aS = false;
        C14246k c14246k = this.f59734aa;
        if (c14246k != null) {
            c14246k.mo83989d();
            this.f59734aa = null;
        }
        C14251p c14251p = this.f59735ab;
        if (c14251p != null) {
            c14251p.mo83989d();
            this.f59735ab = null;
        }
        m84387c();
        C14248m c14248m = this.f59746am;
        if (c14248m != null) {
            c14248m.mo83989d();
            this.f59746am = null;
        }
        InterfaceC14249n interfaceC14249n = this.f59747an;
        if (interfaceC14249n != null) {
            interfaceC14249n.m84333a();
            this.f59747an = null;
        }
        C14179i c14179i = this.f59753at;
        if (c14179i != null) {
            c14179i.mo83989d();
            this.f59753at = null;
        }
        C14247l c14247l = this.f59752as;
        if (c14247l != null) {
            c14247l.mo83989d();
            this.f59752as = null;
        }
        C14178h c14178h = this.f59751ar;
        if (c14178h != null) {
            c14178h.mo83989d();
            this.f59751ar = null;
        }
        C14261z c14261z = this.f59748ao;
        if (c14261z != null) {
            c14261z.mo83989d();
            this.f59748ao = null;
        }
        C14245j c14245j = this.f59749ap;
        if (c14245j != null) {
            c14245j.m84316a();
            this.f59749ap = null;
        }
        C14244i c14244i = this.f59750aq;
        if (c14244i != null) {
            c14244i.mo83989d();
            this.f59750aq = null;
        }
        C14178h c14178h2 = this.f59754au;
        if (c14178h2 != null) {
            c14178h2.mo83989d();
            this.f59754au = null;
        }
        int[] iArr = this.f59760b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f59760b = null;
        }
        int[] iArr2 = this.f59762c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f59762c = null;
        }
        int[] iArr3 = this.f59725aR;
        if (iArr3 != null && iArr3[0] > 0) {
            GLES20.glDeleteBuffers(1, iArr3, 0);
            this.f59725aR = null;
        }
        TXCLog.m84152i("TXCFilterDrawer", "come out releaseInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m84388c(C14263d.b bVar) {
        TXCLog.m84152i("TXCFilterDrawer", "come into initInternal");
        m84381b();
        this.f59756aw = bVar.f59850j;
        this.f59690J = bVar.f59844d;
        this.f59691K = bVar.f59845e;
        this.f59705Y = bVar.f59853m;
        int i = bVar.f59847g;
        int i2 = bVar.f59846f;
        int i3 = bVar.f59848h;
        this.f59700T = bVar.f59849i;
        int i4 = bVar.f59842b;
        this.f59697Q = i4;
        int i5 = bVar.f59843c;
        this.f59698R = i5;
        int i6 = bVar.f59841a;
        this.f59692L = i;
        this.f59693M = i2;
        if (i3 == 90 || i3 == 270) {
            this.f59692L = i2;
            this.f59693M = i;
        }
        this.f59704X = bVar.f59852l;
        this.f59703W = bVar.f59851k;
        this.f59724aQ = new byte[i4 * i5 * 4];
        TXCLog.m84153i("TXCFilterDrawer", "processWidth mPituScaleRatio is %f, process size: %d x %d", Float.valueOf(this.f59696P), Integer.valueOf(this.f59692L), Integer.valueOf(this.f59693M));
        if (this.f59696P != 1.0f) {
            int i7 = this.f59692L;
            int i8 = this.f59693M;
            if (i7 >= i8) {
                i7 = i8;
            }
            if (i7 > 368) {
                this.f59696P = 432.0f / i7;
            }
            if (this.f59696P > 1.0f) {
                this.f59696P = 1.0f;
            }
        }
        float f = this.f59692L;
        float f2 = this.f59696P;
        int i9 = (int) (f * f2);
        this.f59694N = i9;
        int i10 = (int) (this.f59693M * f2);
        this.f59695O = i10;
        m84366a(i9, i10, this.f59710aC);
        C14263d.f fVar = this.f59689I;
        if (fVar != null && fVar.f59870a != null && this.f59748ao == null) {
            TXCLog.m84152i("TXCFilterDrawer", "reset water mark!");
            C14263d.f fVar2 = this.f59689I;
            m84410a(fVar2.f59870a, fVar2.f59871b, fVar2.f59872c, fVar2.f59873d);
        }
        Bitmap bitmap = this.f59741ah;
        if ((bitmap != null || this.f59742ai != null) && this.f59746am == null) {
            m84365a(this.f59694N, this.f59695O, this.f59743aj, bitmap, this.f59744ak, this.f59742ai, this.f59745al);
        }
        m84368a(this.f59705Y, i, i2, this.f59694N, this.f59695O, this.f59700T, i3, this.f59703W);
        m84367a(this.f59692L, this.f59693M, this.f59697Q, this.f59698R, i6);
        int[] iArr = this.f59760b;
        if (iArr == null) {
            this.f59760b = new int[1];
        } else {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
        }
        int[] iArr2 = this.f59762c;
        if (iArr2 == null) {
            this.f59762c = new int[1];
        } else {
            GLES20.glDeleteTextures(1, iArr2, 0);
        }
        m84375a(this.f59760b, this.f59762c, this.f59697Q, this.f59698R);
        if (3 == C14180j.m84002a()) {
            if (this.f59725aR == null) {
                this.f59725aR = new int[1];
            } else {
                TXCLog.m84152i("TXCFilterDrawer", "m_pbo0 is not null, delete Buffers, and recreate");
                GLES20.glDeleteBuffers(1, this.f59725aR, 0);
            }
            TXCLog.m84152i("TXCFilterDrawer", "opengl es 3.0, use PBO");
            C14180j.m84006a(i, i2, this.f59725aR);
        }
        TXCLog.m84152i("TXCFilterDrawer", "come out initInternal");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public boolean m84390d(C14263d.b bVar) {
        int i = bVar.f59851k;
        if ((1 == i || 3 == i || 2 == i) && this.f59734aa == null) {
            C14246k c14246k = new C14246k(bVar.f59851k);
            this.f59734aa = c14246k;
            c14246k.m83976a(true);
            if (!this.f59734aa.mo83979a()) {
                TXCLog.m84149e("TXCFilterDrawer", "mI4202RGBAFilter init failed!!, break init");
                return false;
            }
            this.f59734aa.mo83969a(bVar.f59844d, bVar.f59845e);
        }
        int i2 = bVar.f59852l;
        if ((1 == i2 || 3 == i2 || 2 == i2) && this.f59735ab == null) {
            C14251p c14251p = new C14251p(bVar.f59852l);
            this.f59735ab = c14251p;
            if (!c14251p.mo83979a()) {
                TXCLog.m84149e("TXCFilterDrawer", "mRGBA2I420Filter init failed!!, break init");
                return false;
            }
            this.f59735ab.mo83969a(bVar.f59842b, bVar.f59843c);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m84403a(int i, int i2, long j) {
        int iMo84454a;
        m84373a(this.f59755av);
        boolean z = this.f59696P != 1.0f;
        GLES20.glViewport(0, 0, this.f59694N, this.f59695O);
        C14247l c14247l = this.f59752as;
        if (c14247l != null) {
            if (4 == i2 || true == this.f59702V) {
                c14247l.mo83977a(this.f59701U);
                this.f59752as.m84322c(this.f59702V);
            }
            i = this.f59752as.mo83981b(i);
        }
        if (this.f59736ac != null) {
            int i3 = Math.min(this.f59697Q, this.f59698R) < 540 ? 0 : this.f59713aF;
            this.f59736ac.mo84279f(i3);
            if (this.f59711aD > 0 || this.f59712aE > 0 || this.f59714aG > 0 || i3 > 0) {
                i = this.f59736ac.mo83981b(i);
            }
        }
        C14248m c14248m = this.f59746am;
        if (c14248m != null) {
            i = c14248m.mo83981b(i);
        }
        GLES20.glViewport(0, 0, this.f59692L, this.f59693M);
        C14245j c14245j = this.f59749ap;
        if (c14245j != null) {
            i = c14245j.m84315a(i);
            z = false;
        }
        C14244i c14244i = this.f59750aq;
        if (c14244i != null) {
            i = c14244i.mo83981b(i);
            z = false;
        }
        if (z) {
            m84382b(this.f59692L, this.f59693M);
            if (this.f59754au != null) {
                GLES20.glViewport(0, 0, this.f59692L, this.f59693M);
                i = this.f59754au.mo83981b(i);
            }
        }
        InterfaceC14264e interfaceC14264e = this.f59732aY;
        if (interfaceC14264e != null && (iMo84454a = interfaceC14264e.mo84454a(i, this.f59692L, this.f59693M)) > 0) {
            i = iMo84454a;
        }
        GLES20.glViewport(0, 0, this.f59692L, this.f59693M);
        C14261z c14261z = this.f59748ao;
        if (c14261z != null) {
            i = c14261z.mo83981b(i);
        }
        if (this.f59751ar != null) {
            GLES20.glViewport(0, 0, this.f59697Q, this.f59698R);
            i = this.f59751ar.mo83981b(i);
        }
        m84358a(i, j);
        return i;
    }

    /* JADX INFO: renamed from: e */
    public void m84424e(final int i) {
        this.f59712aE = i;
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.3
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    C14220a.m84249a().m84253c();
                }
                if (HandlerThreadC14262c.this.f59736ac == null || i < 0) {
                    return;
                }
                HandlerThreadC14262c.this.f59736ac.mo84277d(i);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m84425f(final int i) {
        this.f59713aF = i;
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.4
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    C14220a.m84249a().m84256f();
                }
                if (HandlerThreadC14262c.this.f59736ac == null || i < 0) {
                    return;
                }
                HandlerThreadC14262c.this.f59736ac.mo84279f(i);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m84426g(final int i) {
        this.f59714aG = i;
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.5
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    C14220a.m84249a().m84254d();
                }
                if (HandlerThreadC14262c.this.f59736ac == null || i < 0) {
                    return;
                }
                HandlerThreadC14262c.this.f59736ac.mo84278e(i);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m84436q(int i) {
    }

    /* JADX INFO: renamed from: r */
    public void m84437r(int i) {
    }

    /* JADX INFO: renamed from: s */
    public void m84438s(int i) {
    }

    /* JADX INFO: renamed from: t */
    public void m84439t(int i) {
    }

    /* JADX INFO: renamed from: u */
    public void m84440u(int i) {
    }

    /* JADX INFO: renamed from: v */
    public void m84441v(int i) {
    }

    /* JADX INFO: renamed from: w */
    public void m84442w(int i) {
    }

    /* JADX INFO: renamed from: x */
    public void m84443x(int i) {
    }

    /* JADX INFO: renamed from: y */
    public void m84444y(int i) {
    }

    /* JADX INFO: renamed from: z */
    public void m84445z(int i) {
    }

    /* JADX INFO: renamed from: h */
    public void m84427h(int i) {
    }

    /* JADX INFO: renamed from: i */
    public void m84428i(int i) {
    }

    /* JADX INFO: renamed from: j */
    public void m84429j(int i) {
    }

    /* JADX INFO: renamed from: k */
    public void m84430k(int i) {
    }

    /* JADX INFO: renamed from: l */
    public void m84431l(int i) {
    }

    /* JADX INFO: renamed from: m */
    public void m84432m(int i) {
    }

    /* JADX INFO: renamed from: n */
    public void m84433n(int i) {
    }

    /* JADX INFO: renamed from: p */
    public void m84435p(int i) {
    }

    /* JADX INFO: renamed from: o */
    public void m84434o(int i) {
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.c$a */
    public class a extends Handler {

        /* JADX INFO: renamed from: b */
        private String f59821b;

        public a(Looper looper, Context context) {
            super(looper);
            this.f59821b = "EGLDrawThreadHandler";
        }

        /* JADX INFO: renamed from: a */
        public void m84447a() {
            TXCLog.m84152i(this.f59821b, "come into releaseEGL");
            HandlerThreadC14262c.this.m84381b();
            if (HandlerThreadC14262c.this.f59716aI != null) {
                HandlerThreadC14262c.this.f59716aI.m84267c();
                HandlerThreadC14262c.this.f59716aI = null;
            }
            if (HandlerThreadC14262c.this.f59717aJ != null) {
                HandlerThreadC14262c.this.f59717aJ.m84261a();
                HandlerThreadC14262c.this.f59717aJ = null;
            }
            HandlerThreadC14262c.this.f59715aH = false;
            NativeLoad.getInstance();
            NativeLoad.nativeDeleteYuv2Yuv();
            TXCLog.m84152i(this.f59821b, "come out releaseEGL");
        }

        /* JADX INFO: renamed from: b */
        public void m84448b() {
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
                    m84447a();
                    HandlerThreadC14262c.this.f59763d.m84271a();
                } else if (i == 2) {
                    HandlerThreadC14262c.this.m84383b((byte[]) message.obj);
                } else if (i == 3) {
                    HandlerThreadC14262c.this.m84355A(message.arg1);
                } else if (i == 4) {
                    HandlerThreadC14262c.this.f59709aB = (float) (((double) message.arg1) / 100.0d);
                    if (HandlerThreadC14262c.this.f59746am != null) {
                        HandlerThreadC14262c.this.f59746am.m84330a(HandlerThreadC14262c.this.f59709aB);
                    }
                } else if (i == 5) {
                    HandlerThreadC14262c.this.m84390d((C14263d.b) message.obj);
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
            m84446a(message.obj);
            HandlerThreadC14262c.this.f59715aH = true;
            z = true;
            synchronized (this) {
                if (true == z) {
                    notify();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m84446a(Object obj) {
            TXCLog.m84152i(this.f59821b, "come into InitEGL");
            C14263d.b bVar = (C14263d.b) obj;
            m84447a();
            HandlerThreadC14262c.this.f59717aJ = new C14221a();
            HandlerThreadC14262c handlerThreadC14262c = HandlerThreadC14262c.this;
            handlerThreadC14262c.f59716aI = new C14223c(handlerThreadC14262c.f59717aJ, bVar.f59847g, bVar.f59846f, false);
            HandlerThreadC14262c.this.f59716aI.m84266b();
            boolean zM84388c = HandlerThreadC14262c.this.m84388c(bVar);
            String str = this.f59821b;
            if (!zM84388c) {
                TXCLog.m84149e(str, "initInternal failed!");
            } else {
                TXCLog.m84152i(str, "come out InitEGL");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m84423d(final int i) {
        if (this.f59710aC == i || i > 3 || i < 0) {
            return;
        }
        this.f59710aC = i;
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.2
            @Override // java.lang.Runnable
            public void run() {
                HandlerThreadC14262c handlerThreadC14262c = HandlerThreadC14262c.this;
                handlerThreadC14262c.m84366a(handlerThreadC14262c.f59694N, HandlerThreadC14262c.this.f59695O, i);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m84419b(final int i) {
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.11
            @Override // java.lang.Runnable
            public void run() {
                HandlerThreadC14262c.this.f59704X = i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m84383b(byte[] bArr) {
        C14246k c14246k = this.f59734aa;
        if (c14246k == null) {
            TXCLog.m84149e("TXCFilterDrawer", "mI4202RGBAFilter is null!");
        } else {
            c14246k.m84320a(bArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m84420b(boolean z) {
    }

    /* JADX INFO: renamed from: b */
    public boolean m84421b(C14263d.b bVar) {
        if (!this.f59756aw) {
            a aVar = this.f59708aA;
            if (aVar == null) {
                TXCLog.m84149e("TXCFilterDrawer", "mThreadHandler is null!");
                return false;
            }
            aVar.obtainMessage(5, 0, 0, bVar).sendToTarget();
            return true;
        }
        m84390d(bVar);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m84382b(int i, int i2) {
        if (this.f59754au == null) {
            TXCLog.m84152i("TXCFilterDrawer", "createRecoverScaleFilter");
            C14178h c14178h = new C14178h();
            this.f59754au = c14178h;
            if (true == c14178h.mo83979a()) {
                this.f59754au.m83976a(true);
            } else {
                TXCLog.m84149e("TXCFilterDrawer", "mRecoverScaleFilter init failed!");
            }
        }
        C14178h c14178h2 = this.f59754au;
        if (c14178h2 != null) {
            c14178h2.mo83969a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84413a(String str) {
    }

    /* JADX INFO: renamed from: a */
    public void m84414a(String str, boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m84418a(C14263d.b bVar) {
        boolean zM84388c;
        try {
            if (!bVar.f59850j) {
                if (this.f59708aA == null) {
                    start();
                    this.f59708aA = new a(getLooper(), this.f59685E);
                }
                this.f59708aA.obtainMessage(0, bVar).sendToTarget();
                this.f59708aA.m84448b();
                zM84388c = true;
            } else {
                zM84388c = m84388c(bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zM84388c;
    }

    /* JADX INFO: renamed from: a */
    public void m84408a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public int m84404a(byte[] bArr, int i) {
        m84416a(bArr);
        if (!this.f59756aw) {
            byte[] bArr2 = (byte[]) bArr.clone();
            this.f59708aA.obtainMessage(2, bArr2).sendToTarget();
            if (!this.f59726aS) {
                TXCLog.m84152i("TXCFilterDrawer", "First Frame, clear queue");
                NativeLoad.getInstance();
                NativeLoad.nativeClearQueue();
            }
            this.f59708aA.obtainMessage(3, i, 0).sendToTarget();
            m84374a(bArr2, this.f59726aS);
            this.f59726aS = true;
            return -1;
        }
        m84383b(bArr);
        return m84355A(i);
    }

    /* JADX INFO: renamed from: a */
    public void m84406a(final float f) {
        this.f59709aB = f;
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (HandlerThreadC14262c.this.f59746am != null) {
                    HandlerThreadC14262c.this.f59746am.m84330a(f);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m84417a(final float[] fArr) {
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.7
            @Override // java.lang.Runnable
            public void run() {
                HandlerThreadC14262c.this.f59701U = fArr;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m84415a(final boolean z) {
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.9
            @Override // java.lang.Runnable
            public void run() {
                HandlerThreadC14262c.this.f59702V = z;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m84368a(C14171a c14171a, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (this.f59752as == null) {
            TXCLog.m84152i("TXCFilterDrawer", "Create CropFilter");
            if (4 == i6) {
                this.f59752as = new C14247l("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", true);
            } else {
                this.f59752as = new C14247l();
            }
            if (true == this.f59752as.mo83979a()) {
                this.f59752as.m83976a(true);
            } else {
                TXCLog.m84149e("TXCFilterDrawer", "mInputCropFilter init failed!");
            }
        }
        this.f59752as.mo83969a(i3, i4);
        float[] fArrM83980a = this.f59752as.m83980a(this.f59690J, this.f59691K, null, c14171a, i6);
        int i7 = (720 - i5) % 360;
        int i8 = (i7 == 90 || i7 == 270) ? i4 : i3;
        if (i7 != 90 && i7 != 270) {
            i3 = i4;
        }
        this.f59752as.m83970a(i, i2, i7, fArrM83980a, i8 / i3, z, false);
    }

    /* JADX INFO: renamed from: a */
    private void m84367a(int i, int i2, int i3, int i4, int i5) {
        synchronized (this.f59758ay) {
            try {
                int i6 = (i5 + 360) % 360;
                TXCLog.m84152i("TXCFilterDrawer", "real outputAngle " + i6);
                if (this.f59751ar == null) {
                    if (i == i3 && i2 == i4 && i6 == 0) {
                        TXCLog.m84152i("TXCFilterDrawer", "Don't need change output Image, don't create out filter!");
                        return;
                    }
                    C14178h c14178h = new C14178h();
                    this.f59751ar = c14178h;
                    if (true == c14178h.mo83979a()) {
                        this.f59751ar.m83976a(true);
                    } else {
                        TXCLog.m84149e("TXCFilterDrawer", "mOutputZoomFilter init failed!");
                    }
                }
                this.f59751ar.mo83969a(i3, i4);
                this.f59751ar.m83971a((720 - i6) % 360, (FloatBuffer) null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84410a(final Bitmap bitmap, final float f, final float f2, final float f3) {
        if (this.f59689I == null) {
            this.f59689I = new C14263d.f();
        }
        if (TXCCommonUtil.equals(this.f59689I.f59870a, bitmap)) {
            C14263d.f fVar = this.f59689I;
            if (f == fVar.f59871b && f2 == fVar.f59872c && f3 == fVar.f59873d && this.f59748ao != null) {
                return;
            }
        }
        C14263d.f fVar2 = this.f59689I;
        fVar2.f59870a = bitmap;
        fVar2.f59871b = f;
        fVar2.f59872c = f2;
        fVar2.f59873d = f3;
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.10
            @Override // java.lang.Runnable
            public void run() {
                if (bitmap != null) {
                    C14220a.m84249a().m84257g();
                }
                Bitmap bitmap2 = bitmap;
                HandlerThreadC14262c handlerThreadC14262c = HandlerThreadC14262c.this;
                if (bitmap2 == null) {
                    if (handlerThreadC14262c.f59748ao != null) {
                        HandlerThreadC14262c.this.f59748ao.mo83989d();
                        HandlerThreadC14262c.this.f59748ao = null;
                        return;
                    }
                    return;
                }
                if (handlerThreadC14262c.f59748ao == null) {
                    if (HandlerThreadC14262c.this.f59692L <= 0 || HandlerThreadC14262c.this.f59693M <= 0) {
                        TXCLog.m84149e("TXCFilterDrawer", "output Width and Height is error!");
                        return;
                    }
                    HandlerThreadC14262c.this.f59748ao = new C14261z();
                    HandlerThreadC14262c.this.f59748ao.m83976a(true);
                    if (!HandlerThreadC14262c.this.f59748ao.mo83979a()) {
                        TXCLog.m84149e("TXCFilterDrawer", "mWatermarkFilter.init failed!");
                        HandlerThreadC14262c.this.f59748ao.mo83989d();
                        HandlerThreadC14262c.this.f59748ao = null;
                        return;
                    }
                    HandlerThreadC14262c.this.f59748ao.mo83969a(HandlerThreadC14262c.this.f59692L, HandlerThreadC14262c.this.f59693M);
                }
                HandlerThreadC14262c.this.f59748ao.m84354d(true);
                HandlerThreadC14262c.this.f59748ao.m84352a(bitmap, f, f2, f3);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m84412a(InterfaceC14264e interfaceC14264e) {
        TXCLog.m84152i("TXCFilterDrawer", "set listener");
        this.f59732aY = interfaceC14264e;
    }

    /* JADX INFO: renamed from: a */
    public void m84411a(InterfaceC14170b interfaceC14170b) {
        TXCLog.m84152i("TXCFilterDrawer", "set notify");
        WeakReference<InterfaceC14170b> weakReference = new WeakReference<>(interfaceC14170b);
        this.f59733aZ = weakReference;
        C14245j c14245j = this.f59749ap;
        if (c14245j != null) {
            c14245j.m84317a(weakReference.get());
        }
    }

    /* JADX INFO: renamed from: a */
    private int m84358a(int i, long j) {
        int i2 = this.f59704X;
        if (i2 == 0) {
            if (this.f59732aY == null) {
                return i;
            }
            if (j == 0) {
                j = TXCTimeUtil.generatePtsMS();
            }
            this.f59732aY.mo84462a(i, this.f59697Q, this.f59698R, j);
            return i;
        }
        if (1 != i2 && 3 != i2 && 2 != i2) {
            TXCLog.m84149e("TXCFilterDrawer", "Don't support format!");
            return -1;
        }
        GLES20.glViewport(0, 0, this.f59697Q, this.f59698R);
        if (this.f59735ab == null) {
            TXCLog.m84149e("TXCFilterDrawer", "mRGBA2I420Filter is null!");
            return i;
        }
        GLES20.glBindFramebuffer(36160, this.f59760b[0]);
        this.f59735ab.m83966a(i);
        int i3 = this.f59704X;
        int i4 = this.f59697Q;
        if (2 == i3) {
            m84357a(i4, this.f59698R);
        } else {
            m84357a(i4, (this.f59698R * 3) / 8);
        }
        GLES20.glBindFramebuffer(36160, 0);
        return i;
    }

    /* JADX INFO: renamed from: a */
    private int m84357a(int i, int i2) {
        if (true == this.f59756aw) {
            if (this.f59732aY != null) {
                NativeLoad.getInstance();
                NativeLoad.nativeGlReadPixs(i, i2, this.f59724aQ);
                this.f59732aY.mo84472a(this.f59724aQ, this.f59697Q, this.f59698R, this.f59704X, TXCTimeUtil.generatePtsMS());
            } else if (this.f59727aT != null) {
                NativeLoad.getInstance();
                NativeLoad.nativeGlReadPixs(i, i2, this.f59727aT);
            }
        } else if (3 == C14180j.m84002a()) {
            if (0 == this.f59720aM) {
                this.f59720aM = TXCTimeUtil.getTimeTick();
            }
            int i3 = this.f59721aN + 1;
            this.f59721aN = i3;
            if (i3 >= 100) {
                TXCLog.m84152i("TXCFilterDrawer", "Real fps " + (100.0f / ((TXCTimeUtil.getTimeTick() - this.f59720aM) / 1000.0f)));
                this.f59721aN = 0;
                this.f59720aM = TXCTimeUtil.getTimeTick();
            }
            GLES20.glPixelStorei(3333, 1);
            GLES30.glReadBuffer(TXLiteAVCode.EVT_LOCAL_RECORD_RESULT);
            GLES20.glBindBuffer(35051, this.f59725aR[0]);
            NativeLoad.getInstance();
            NativeLoad.nativeGlReadPixs(i, i2, null);
            ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, i * i2 * 4, 1);
            if (byteBuffer == null) {
                TXCLog.m84149e("TXCFilterDrawer", "glMapBufferRange is null");
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
    private void m84374a(byte[] bArr, boolean z) {
        if (!z) {
            InterfaceC14264e interfaceC14264e = this.f59732aY;
            if (interfaceC14264e == null) {
                TXCLog.m84152i("TXCFilterDrawer", "First Frame, don't process!");
                return;
            } else {
                interfaceC14264e.mo84472a(bArr, this.f59697Q, this.f59698R, this.f59704X, TXCTimeUtil.generatePtsMS());
                return;
            }
        }
        int i = this.f59698R;
        int i2 = (i * 3) / 8;
        if (2 != this.f59704X) {
            i = i2;
        }
        if (this.f59732aY != null) {
            NativeLoad.getInstance();
            if (true == NativeLoad.nativeGlReadPixsFromQueue(this.f59697Q, i, this.f59724aQ)) {
                this.f59732aY.mo84472a(this.f59724aQ, this.f59697Q, this.f59698R, this.f59704X, TXCTimeUtil.generatePtsMS());
                return;
            } else {
                TXCLog.m84147d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
                this.f59732aY.mo84472a(bArr, this.f59697Q, this.f59698R, this.f59704X, TXCTimeUtil.generatePtsMS());
                return;
            }
        }
        NativeLoad.getInstance();
        if (NativeLoad.nativeGlReadPixsFromQueue(this.f59697Q, i, this.f59727aT)) {
            return;
        }
        TXCLog.m84147d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
    }

    /* JADX INFO: renamed from: c */
    public void m84422c(final int i) {
        this.f59711aD = i;
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.13
            @Override // java.lang.Runnable
            public void run() {
                if (i > 0) {
                    C14220a.m84249a().m84252b();
                }
                if (HandlerThreadC14262c.this.f59736ac == null || i < 0) {
                    return;
                }
                HandlerThreadC14262c.this.f59736ac.mo84275c(i);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private void m84387c() {
        C14226a c14226a = this.f59737ad;
        if (c14226a != null) {
            c14226a.mo83989d();
            this.f59737ad = null;
        }
        C14232a c14232a = this.f59738ae;
        if (c14232a != null) {
            c14232a.mo83989d();
            this.f59738ae = null;
        }
        C14234c c14234c = this.f59739af;
        if (c14234c != null) {
            c14234c.mo83989d();
            this.f59739af = null;
        }
        C14235a c14235a = this.f59740ag;
        if (c14235a != null) {
            c14235a.mo83989d();
            this.f59740ag = null;
        }
        this.f59736ac = null;
    }

    /* JADX INFO: renamed from: a */
    public void m84416a(byte[] bArr) {
        this.f59727aT = bArr;
    }

    /* JADX INFO: renamed from: a */
    public void m84405a() {
        if (!this.f59756aw) {
            a aVar = this.f59708aA;
            if (aVar != null) {
                aVar.obtainMessage(1).sendToTarget();
                try {
                    this.f59763d.m84272b();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            return;
        }
        m84381b();
    }

    /* JADX INFO: renamed from: a */
    private void m84375a(int[] iArr, int[] iArr2, int i, int i2) {
        GLES20.glGenFramebuffers(1, iArr, 0);
        iArr2[0] = C14180j.m84005a(i, i2, 6408, 6408, iArr2);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m84409a(Bitmap bitmap) {
        m84407a(1.0f, bitmap, this.f59709aB, (Bitmap) null, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m84407a(final float f, final Bitmap bitmap, final float f2, final Bitmap bitmap2, final float f3) {
        if (this.f59741ah == bitmap && this.f59742ai == bitmap2) {
            if (this.f59746am != null) {
                if (this.f59743aj == f && this.f59744ak == f2 && this.f59745al == f3) {
                    return;
                }
                this.f59743aj = f;
                this.f59744ak = f2;
                this.f59745al = f3;
                m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.8
                    @Override // java.lang.Runnable
                    public void run() {
                        HandlerThreadC14262c.this.f59746am.m84331a(f, f2, f3);
                    }
                });
                return;
            }
            return;
        }
        this.f59741ah = bitmap;
        this.f59742ai = bitmap2;
        this.f59743aj = f;
        this.f59744ak = f2;
        this.f59745al = f3;
        m84372a(new Runnable() { // from class: com.tencent.liteav.beauty.c.6
            @Override // java.lang.Runnable
            public void run() {
                if (HandlerThreadC14262c.this.f59746am != null) {
                    C14220a.m84249a().m84255e();
                }
                if (HandlerThreadC14262c.this.f59741ah == null && HandlerThreadC14262c.this.f59742ai == null) {
                    if (HandlerThreadC14262c.this.f59746am != null) {
                        HandlerThreadC14262c.this.f59746am.mo83989d();
                        HandlerThreadC14262c.this.f59746am = null;
                        return;
                    }
                    return;
                }
                C14248m c14248m = HandlerThreadC14262c.this.f59746am;
                HandlerThreadC14262c handlerThreadC14262c = HandlerThreadC14262c.this;
                if (c14248m == null) {
                    handlerThreadC14262c.m84365a(handlerThreadC14262c.f59694N, HandlerThreadC14262c.this.f59695O, HandlerThreadC14262c.this.f59743aj, HandlerThreadC14262c.this.f59741ah, HandlerThreadC14262c.this.f59744ak, HandlerThreadC14262c.this.f59742ai, HandlerThreadC14262c.this.f59745al);
                } else {
                    handlerThreadC14262c.f59746am.m84332a(f, bitmap, f2, bitmap2, f3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84366a(int i, int i2, int i3) {
        TXCLog.m84152i("TXCFilterDrawer", "create Beauty Filter!");
        if (i3 == 0) {
            if (this.f59737ad == null) {
                this.f59737ad = new C14226a();
            }
            this.f59736ac = this.f59737ad;
        } else if (1 == i3) {
            if (this.f59738ae == null) {
                this.f59738ae = new C14232a();
            }
            this.f59736ac = this.f59738ae;
        } else if (2 == i3) {
            if (this.f59740ag == null) {
                this.f59740ag = new C14235a();
            }
            this.f59736ac = this.f59740ag;
        } else if (3 == i3) {
            if (this.f59739af == null) {
                this.f59739af = new C14234c();
            }
            this.f59736ac = this.f59739af;
        }
        C14231b c14231b = this.f59736ac;
        if (c14231b == null) {
            TXCLog.m84149e("TXCFilterDrawer", "mBeautyFilter set error!");
            return;
        }
        c14231b.m83976a(true);
        if (true == this.f59736ac.mo84276c(i, i2)) {
            int i4 = this.f59711aD;
            if (i4 > 0) {
                this.f59736ac.mo84275c(i4);
            }
            int i5 = this.f59712aE;
            if (i5 > 0) {
                this.f59736ac.mo84277d(i5);
            }
            int i6 = this.f59714aG;
            if (i6 > 0) {
                this.f59736ac.mo84278e(i6);
            }
            int i7 = this.f59713aF;
            if (i7 > 0) {
                this.f59736ac.mo84279f(i7);
                return;
            }
            return;
        }
        TXCLog.m84149e("TXCFilterDrawer", "mBeautyFilter init failed!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84365a(int i, int i2, float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        if (this.f59746am == null) {
            TXCLog.m84152i("TXCFilterDrawer", "createComLooKupFilter");
            C14248m c14248m = new C14248m(f, bitmap, f2, bitmap2, f3);
            this.f59746am = c14248m;
            if (true == c14248m.mo83979a()) {
                this.f59746am.m83976a(true);
                this.f59746am.mo83969a(i, i2);
            } else {
                TXCLog.m84149e("TXCFilterDrawer", "mLookupFilterGroup init failed!");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84372a(Runnable runnable) {
        synchronized (this.f59755av) {
            this.f59755av.add(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84373a(Queue<Runnable> queue) {
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
