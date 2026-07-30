package p003l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kic0 extends u7m {

    /* JADX INFO: renamed from: A */
    public long f4936A;

    /* JADX INFO: renamed from: B */
    public int f4937B;

    /* JADX INFO: renamed from: C */
    public long f4938C;

    /* JADX INFO: renamed from: D */
    public final int f4939D;

    /* JADX INFO: renamed from: E */
    public final int f4940E;

    /* JADX INFO: renamed from: F */
    public final int f4941F;

    /* JADX INFO: renamed from: j */
    public int f4942j;

    /* JADX INFO: renamed from: k */
    public int f4943k;

    /* JADX INFO: renamed from: l */
    public List<C0379a> f4944l;

    /* JADX INFO: renamed from: m */
    public int f4945m;

    /* JADX INFO: renamed from: n */
    public int f4946n;

    /* JADX INFO: renamed from: o */
    public int f4947o;

    /* JADX INFO: renamed from: p */
    public int f4948p;

    /* JADX INFO: renamed from: q */
    public float f4949q;

    /* JADX INFO: renamed from: r */
    public int f4950r;

    /* JADX INFO: renamed from: s */
    public int f4951s;

    /* JADX INFO: renamed from: t */
    public long f4952t;

    /* JADX INFO: renamed from: u */
    public Paint f4953u;

    /* JADX INFO: renamed from: v */
    public RectF f4954v;

    /* JADX INFO: renamed from: w */
    public RectF f4955w;

    /* JADX INFO: renamed from: x */
    public int f4956x;

    /* JADX INFO: renamed from: y */
    public int f4957y;

    /* JADX INFO: renamed from: z */
    public long f4958z;

    /* JADX INFO: renamed from: l.kic0$a */
    public class C0379a {

        /* JADX INFO: renamed from: a */
        public float f4959a;

        /* JADX INFO: renamed from: b */
        public long f4960b;

        /* JADX INFO: renamed from: c */
        public long f4961c;

        /* JADX INFO: renamed from: d */
        public long f4962d;

        /* JADX INFO: renamed from: e */
        public long f4963e;

        public C0379a() {
            this.f4961c = 0L;
        }
    }

    public kic0(Context context, int i) {
        super(context);
        this.f4958z = 1000000L;
        this.f4936A = 1000000000L;
        this.f4937B = 0;
        this.f4938C = -1L;
        this.f4939D = 0;
        this.f4940E = HttpStatus.INTERNAL_SERVER_ERROR_500;
        this.f4941F = 7;
        m5674u(i);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: f */
    public void mo3836f(int i, int i2) {
        super.mo3836f(i, i2);
        this.f4937B = 0;
        if (i == 0) {
            this.f4937B = (i2 * 255) / 100;
            RectF rectF = this.f4955w;
            RectF rectF2 = this.f7932i;
            rectF.set(0.0f, 0.0f, rectF2.right - this.f4956x, rectF2.bottom);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f4937B = 255 - ((i2 * 255) / 100);
            }
        } else {
            this.f4937B = 255;
            RectF rectF3 = this.f4955w;
            RectF rectF4 = this.f7932i;
            rectF3.set(0.0f, 0.0f, rectF4.right - this.f4956x, rectF4.bottom);
        }
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: g */
    public void mo3837g(Canvas canvas, int i, int i2) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f8225b, this.f8226c, this.f4953u, 31);
        this.f4953u.setAlpha(this.f4937B);
        RectF rectF = this.f7932i;
        canvas.clipRect(rectF.left + this.f4957y, rectF.top, rectF.right, rectF.bottom);
        if (this.f4942j > 0 && this.f4943k > 0) {
            long jNanoTime = System.nanoTime();
            long j = this.f4938C;
            if (j > 0) {
                jNanoTime = j;
            } else if (this.f8229f.getRecordStartTime() > 0 && SystemClock.uptimeMillis() - this.f8229f.getRecordStartTime() > 60000) {
                this.f4938C = System.nanoTime();
            }
            m5670q(jNanoTime);
            Iterator<C0379a> it = this.f4944l.iterator();
            while (it.hasNext()) {
                m5672s(it.next(), canvas, jNanoTime);
            }
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: h */
    public void mo3838h(int i, int i2) {
        super.mo3838h(i, i2);
        m5667n(i, i2);
        RectF rectF = this.f4955w;
        RectF rectF2 = this.f4954v;
        rectF.set(0.0f, 0.0f, rectF2.right - rectF2.left, rectF2.bottom - rectF2.top);
        RectF rectF3 = this.f8230g;
        int i3 = (int) (rectF3.right - rectF3.left);
        int i4 = (int) (rectF3.bottom - rectF3.top);
        this.f4942j = i3;
        this.f4943k = i4;
        m5668o();
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: i */
    public void mo4545i() {
        super.mo4545i();
        List<C0379a> list = this.f4944l;
        if (list != null) {
            list.clear();
        }
        this.f4938C = -1L;
    }

    /* JADX INFO: renamed from: n */
    public void m5667n(int i, int i2) {
        this.f8230g.set(m8299a(66), m8299a(42), i - m8299a(74), m8299a(98));
    }

    /* JADX INFO: renamed from: o */
    public void m5668o() {
        int i = this.f4943k;
        this.f4949q = i * 0.4f;
        this.f4951s = i / 2;
        this.f4948p = i / 20;
    }

    /* JADX INFO: renamed from: p */
    public final void m5669p(long j) {
        if (this.f4944l.size() == 0) {
            return;
        }
        List<C0379a> list = this.f4944l;
        C0379a c0379a = list.get(list.size() - 1);
        if (j - c0379a.f4962d >= this.f4952t * this.f4958z) {
            this.f4944l.add(m5673t(c0379a.f4962d + (this.f4952t * this.f4958z)));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m5670q(long j) {
        if (this.f4944l.size() == 0) {
            this.f4944l.add(m5673t(-1L));
        } else {
            m5671r(j);
            m5669p(j);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5671r(long j) {
        Iterator<C0379a> it = this.f4944l.iterator();
        while (it.hasNext()) {
            if (it.next().f4963e <= j) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5672s(C0379a c0379a, Canvas canvas, long j) {
        float f = ((((j - c0379a.f4962d) / this.f4958z) + c0379a.f4961c) % c0379a.f4960b) / c0379a.f4960b;
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = f >= 0.5f ? (1.0f - f) / 0.5f : f / 0.5f;
        float f3 = ((j - c0379a.f4962d) * ((long) this.f4947o)) / this.f4936A;
        RectF rectF = this.f4954v;
        float f4 = f3 - this.f4945m;
        int i = this.f4951s;
        float f5 = (i - this.f4948p) - ((i * c0379a.f4959a) * f2);
        int i2 = this.f4951s;
        rectF.set(f4, f5, f3, this.f4948p + i2 + (i2 * c0379a.f4959a * f2));
        RectF rectF2 = this.f4954v;
        int i3 = this.f4950r;
        canvas.drawRoundRect(rectF2, i3, i3, this.f4953u);
    }

    /* JADX INFO: renamed from: t */
    public final C0379a m5673t(long j) {
        C0379a c0379a = new C0379a();
        if (j == -1) {
            c0379a.f4962d = System.nanoTime();
        } else {
            c0379a.f4962d = j;
        }
        c0379a.f4960b = ((long) (Math.random() * 2000.0d)) + 800;
        new Random().nextDouble();
        int soundLevel = this.f8229f.getSoundLevel();
        c0379a.f4959a = Math.min(0.65f, Math.max(0.05f, (soundLevel < 0 ? 1 : (soundLevel + HttpStatus.INTERNAL_SERVER_ERROR_500) / HttpStatus.INTERNAL_SERVER_ERROR_500) / 7.0f));
        c0379a.f4961c = j % c0379a.f4960b;
        c0379a.f4963e = c0379a.f4962d + ((((long) ((this.f4942j + this.f4945m) + this.f4946n)) * this.f4936A) / ((long) this.f4947o));
        return c0379a;
    }

    /* JADX INFO: renamed from: u */
    public final void m5674u(int i) {
        this.f4944l = new ArrayList();
        this.f4945m = m8299a(3);
        this.f4946n = m8299a(3);
        this.f4950r = m8299a(3);
        this.f4947o = HttpStatus.MULTIPLE_CHOICES_300;
        this.f4952t = ((this.f4945m + this.f4946n) * 1000) / HttpStatus.MULTIPLE_CHOICES_300;
        this.f4954v = new RectF();
        this.f4956x = m8299a(58);
        this.f4955w = new RectF();
        Paint paint = new Paint();
        this.f4953u = paint;
        paint.setAntiAlias(true);
        this.f4953u.setColor(i);
        this.f4957y = m8299a(16);
    }

    public kic0(Context context) {
        this(context, -1);
    }
}
