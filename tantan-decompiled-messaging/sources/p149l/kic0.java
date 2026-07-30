package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class kic0 extends u7m {

    /* JADX INFO: renamed from: A */
    public long f123287A;

    /* JADX INFO: renamed from: B */
    public int f123288B;

    /* JADX INFO: renamed from: C */
    public long f123289C;

    /* JADX INFO: renamed from: D */
    public final int f123290D;

    /* JADX INFO: renamed from: E */
    public final int f123291E;

    /* JADX INFO: renamed from: F */
    public final int f123292F;

    /* JADX INFO: renamed from: j */
    public int f123293j;

    /* JADX INFO: renamed from: k */
    public int f123294k;

    /* JADX INFO: renamed from: l */
    public List<C18022a> f123295l;

    /* JADX INFO: renamed from: m */
    public int f123296m;

    /* JADX INFO: renamed from: n */
    public int f123297n;

    /* JADX INFO: renamed from: o */
    public int f123298o;

    /* JADX INFO: renamed from: p */
    public int f123299p;

    /* JADX INFO: renamed from: q */
    public float f123300q;

    /* JADX INFO: renamed from: r */
    public int f123301r;

    /* JADX INFO: renamed from: s */
    public int f123302s;

    /* JADX INFO: renamed from: t */
    public long f123303t;

    /* JADX INFO: renamed from: u */
    public Paint f123304u;

    /* JADX INFO: renamed from: v */
    public RectF f123305v;

    /* JADX INFO: renamed from: w */
    public RectF f123306w;

    /* JADX INFO: renamed from: x */
    public int f123307x;

    /* JADX INFO: renamed from: y */
    public int f123308y;

    /* JADX INFO: renamed from: z */
    public long f123309z;

    /* JADX INFO: renamed from: l.kic0$a */
    public class C18022a {

        /* JADX INFO: renamed from: a */
        public float f123310a;

        /* JADX INFO: renamed from: b */
        public long f123311b;

        /* JADX INFO: renamed from: c */
        public long f123312c;

        /* JADX INFO: renamed from: d */
        public long f123313d;

        /* JADX INFO: renamed from: e */
        public long f123314e;

        public C18022a() {
            this.f123312c = 0L;
        }
    }

    public kic0(Context context, int i) {
        super(context);
        this.f123309z = 1000000L;
        this.f123287A = 1000000000L;
        this.f123288B = 0;
        this.f123289C = -1L;
        this.f123290D = 0;
        this.f123291E = 500;
        this.f123292F = 7;
        m146064u(i);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: f */
    public void mo116668f(int i, int i2) {
        super.mo116668f(i, i2);
        this.f123288B = 0;
        if (i == 0) {
            this.f123288B = (i2 * 255) / 100;
            RectF rectF = this.f123306w;
            RectF rectF2 = this.f175024i;
            rectF.set(0.0f, 0.0f, rectF2.right - this.f123307x, rectF2.bottom);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f123288B = 255 - ((i2 * 255) / 100);
            }
        } else {
            this.f123288B = 255;
            RectF rectF3 = this.f123306w;
            RectF rectF4 = this.f175024i;
            rectF3.set(0.0f, 0.0f, rectF4.right - this.f123307x, rectF4.bottom);
        }
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: g */
    public void mo116669g(Canvas canvas, int i, int i2) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f180398b, this.f180399c, this.f123304u, 31);
        this.f123304u.setAlpha(this.f123288B);
        RectF rectF = this.f175024i;
        canvas.clipRect(rectF.left + this.f123308y, rectF.top, rectF.right, rectF.bottom);
        if (this.f123293j > 0 && this.f123294k > 0) {
            long jNanoTime = System.nanoTime();
            long j = this.f123289C;
            if (j > 0) {
                jNanoTime = j;
            } else if (this.f180402f.getRecordStartTime() > 0 && SystemClock.uptimeMillis() - this.f180402f.getRecordStartTime() > Constants.ONE_MIN_IN_MILLIS) {
                this.f123289C = System.nanoTime();
            }
            m146060q(jNanoTime);
            Iterator<C18022a> it = this.f123295l.iterator();
            while (it.hasNext()) {
                m146062s(it.next(), canvas, jNanoTime);
            }
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: h */
    public void mo116670h(int i, int i2) {
        super.mo116670h(i, i2);
        m146057n(i, i2);
        RectF rectF = this.f123306w;
        RectF rectF2 = this.f123305v;
        rectF.set(0.0f, 0.0f, rectF2.right - rectF2.left, rectF2.bottom - rectF2.top);
        RectF rectF3 = this.f180403g;
        int i3 = (int) (rectF3.right - rectF3.left);
        int i4 = (int) (rectF3.bottom - rectF3.top);
        this.f123293j = i3;
        this.f123294k = i4;
        m146058o();
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: i */
    public void mo126277i() {
        super.mo126277i();
        List<C18022a> list = this.f123295l;
        if (list != null) {
            list.clear();
        }
        this.f123289C = -1L;
    }

    /* JADX INFO: renamed from: n */
    public void m146057n(int i, int i2) {
        this.f180403g.set(m197377a(66), m197377a(42), i - m197377a(74), m197377a(98));
    }

    /* JADX INFO: renamed from: o */
    public void m146058o() {
        int i = this.f123294k;
        this.f123300q = i * 0.4f;
        this.f123302s = i / 2;
        this.f123299p = i / 20;
    }

    /* JADX INFO: renamed from: p */
    public final void m146059p(long j) {
        if (this.f123295l.size() == 0) {
            return;
        }
        List<C18022a> list = this.f123295l;
        C18022a c18022a = list.get(list.size() - 1);
        if (j - c18022a.f123313d >= this.f123303t * this.f123309z) {
            this.f123295l.add(m146063t(c18022a.f123313d + (this.f123303t * this.f123309z)));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m146060q(long j) {
        if (this.f123295l.size() == 0) {
            this.f123295l.add(m146063t(-1L));
        } else {
            m146061r(j);
            m146059p(j);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m146061r(long j) {
        Iterator<C18022a> it = this.f123295l.iterator();
        while (it.hasNext()) {
            if (it.next().f123314e <= j) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m146062s(C18022a c18022a, Canvas canvas, long j) {
        float f = ((((j - c18022a.f123313d) / this.f123309z) + c18022a.f123312c) % c18022a.f123311b) / c18022a.f123311b;
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = f >= 0.5f ? (1.0f - f) / 0.5f : f / 0.5f;
        float f3 = ((j - c18022a.f123313d) * ((long) this.f123298o)) / this.f123287A;
        RectF rectF = this.f123305v;
        float f4 = f3 - this.f123296m;
        int i = this.f123302s;
        float f5 = (i - this.f123299p) - ((i * c18022a.f123310a) * f2);
        int i2 = this.f123302s;
        rectF.set(f4, f5, f3, this.f123299p + i2 + (i2 * c18022a.f123310a * f2));
        RectF rectF2 = this.f123305v;
        int i3 = this.f123301r;
        canvas.drawRoundRect(rectF2, i3, i3, this.f123304u);
    }

    /* JADX INFO: renamed from: t */
    public final C18022a m146063t(long j) {
        C18022a c18022a = new C18022a();
        if (j == -1) {
            c18022a.f123313d = System.nanoTime();
        } else {
            c18022a.f123313d = j;
        }
        c18022a.f123311b = ((long) (Math.random() * 2000.0d)) + 800;
        new Random().nextDouble();
        int soundLevel = this.f180402f.getSoundLevel();
        c18022a.f123310a = Math.min(0.65f, Math.max(0.05f, (soundLevel < 0 ? 1 : (soundLevel + 500) / 500) / 7.0f));
        c18022a.f123312c = j % c18022a.f123311b;
        c18022a.f123314e = c18022a.f123313d + ((((long) ((this.f123293j + this.f123296m) + this.f123297n)) * this.f123287A) / ((long) this.f123298o));
        return c18022a;
    }

    /* JADX INFO: renamed from: u */
    public final void m146064u(int i) {
        this.f123295l = new ArrayList();
        this.f123296m = m197377a(3);
        this.f123297n = m197377a(3);
        this.f123301r = m197377a(3);
        this.f123298o = 300;
        this.f123303t = ((this.f123296m + this.f123297n) * 1000) / 300;
        this.f123305v = new RectF();
        this.f123307x = m197377a(58);
        this.f123306w = new RectF();
        Paint paint = new Paint();
        this.f123304u = paint;
        paint.setAntiAlias(true);
        this.f123304u.setColor(i);
        this.f123308y = m197377a(16);
    }

    public kic0(Context context) {
        this(context, -1);
    }
}
