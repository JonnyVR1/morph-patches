package p153l;

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

/* JADX INFO: loaded from: classes4.dex */
public class rqc0 extends kam {

    /* JADX INFO: renamed from: A */
    public long f164441A;

    /* JADX INFO: renamed from: B */
    public int f164442B;

    /* JADX INFO: renamed from: C */
    public long f164443C;

    /* JADX INFO: renamed from: D */
    public final int f164444D;

    /* JADX INFO: renamed from: E */
    public final int f164445E;

    /* JADX INFO: renamed from: F */
    public final int f164446F;

    /* JADX INFO: renamed from: j */
    public int f164447j;

    /* JADX INFO: renamed from: k */
    public int f164448k;

    /* JADX INFO: renamed from: l */
    public List<C19898a> f164449l;

    /* JADX INFO: renamed from: m */
    public int f164450m;

    /* JADX INFO: renamed from: n */
    public int f164451n;

    /* JADX INFO: renamed from: o */
    public int f164452o;

    /* JADX INFO: renamed from: p */
    public int f164453p;

    /* JADX INFO: renamed from: q */
    public float f164454q;

    /* JADX INFO: renamed from: r */
    public int f164455r;

    /* JADX INFO: renamed from: s */
    public int f164456s;

    /* JADX INFO: renamed from: t */
    public long f164457t;

    /* JADX INFO: renamed from: u */
    public Paint f164458u;

    /* JADX INFO: renamed from: v */
    public RectF f164459v;

    /* JADX INFO: renamed from: w */
    public RectF f164460w;

    /* JADX INFO: renamed from: x */
    public int f164461x;

    /* JADX INFO: renamed from: y */
    public int f164462y;

    /* JADX INFO: renamed from: z */
    public long f164463z;

    /* JADX INFO: renamed from: l.rqc0$a */
    public class C19898a {

        /* JADX INFO: renamed from: a */
        public float f164464a;

        /* JADX INFO: renamed from: b */
        public long f164465b;

        /* JADX INFO: renamed from: c */
        public long f164466c;

        /* JADX INFO: renamed from: d */
        public long f164467d;

        /* JADX INFO: renamed from: e */
        public long f164468e;

        public C19898a() {
            this.f164466c = 0L;
        }
    }

    public rqc0(Context context, int i) {
        super(context);
        this.f164463z = 1000000L;
        this.f164441A = 1000000000L;
        this.f164442B = 0;
        this.f164443C = -1L;
        this.f164444D = 0;
        this.f164445E = 500;
        this.f164446F = 7;
        m182609u(i);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: f */
    public void mo153511f(int i, int i2) {
        super.mo153511f(i, i2);
        this.f164442B = 0;
        if (i == 0) {
            this.f164442B = (i2 * 255) / 100;
            RectF rectF = this.f164460w;
            RectF rectF2 = this.f124700i;
            rectF.set(0.0f, 0.0f, rectF2.right - this.f164461x, rectF2.bottom);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f164442B = 255 - ((i2 * 255) / 100);
            }
        } else {
            this.f164442B = 255;
            RectF rectF3 = this.f164460w;
            RectF rectF4 = this.f124700i;
            rectF3.set(0.0f, 0.0f, rectF4.right - this.f164461x, rectF4.bottom);
        }
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: g */
    public void mo153512g(Canvas canvas, int i, int i2) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f130711b, this.f130712c, this.f164458u, 31);
        this.f164458u.setAlpha(this.f164442B);
        RectF rectF = this.f124700i;
        canvas.clipRect(rectF.left + this.f164462y, rectF.top, rectF.right, rectF.bottom);
        if (this.f164447j > 0 && this.f164448k > 0) {
            long jNanoTime = System.nanoTime();
            long j = this.f164443C;
            if (j > 0) {
                jNanoTime = j;
            } else if (this.f130715f.getRecordStartTime() > 0 && SystemClock.uptimeMillis() - this.f130715f.getRecordStartTime() > Constants.ONE_MIN_IN_MILLIS) {
                this.f164443C = System.nanoTime();
            }
            m182605q(jNanoTime);
            Iterator<C19898a> it = this.f164449l.iterator();
            while (it.hasNext()) {
                m182607s(it.next(), canvas, jNanoTime);
            }
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: h */
    public void mo153513h(int i, int i2) {
        super.mo153513h(i, i2);
        m182602n(i, i2);
        RectF rectF = this.f164460w;
        RectF rectF2 = this.f164459v;
        rectF.set(0.0f, 0.0f, rectF2.right - rectF2.left, rectF2.bottom - rectF2.top);
        RectF rectF3 = this.f130716g;
        int i3 = (int) (rectF3.right - rectF3.left);
        int i4 = (int) (rectF3.bottom - rectF3.top);
        this.f164447j = i3;
        this.f164448k = i4;
        m182603o();
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: i */
    public void mo153514i() {
        super.mo153514i();
        List<C19898a> list = this.f164449l;
        if (list != null) {
            list.clear();
        }
        this.f164443C = -1L;
    }

    /* JADX INFO: renamed from: n */
    public void m182602n(int i, int i2) {
        this.f130716g.set(m153506a(66), m153506a(42), i - m153506a(74), m153506a(98));
    }

    /* JADX INFO: renamed from: o */
    public void m182603o() {
        int i = this.f164448k;
        this.f164454q = i * 0.4f;
        this.f164456s = i / 2;
        this.f164453p = i / 20;
    }

    /* JADX INFO: renamed from: p */
    public final void m182604p(long j) {
        if (this.f164449l.size() == 0) {
            return;
        }
        List<C19898a> list = this.f164449l;
        C19898a c19898a = list.get(list.size() - 1);
        if (j - c19898a.f164467d >= this.f164457t * this.f164463z) {
            this.f164449l.add(m182608t(c19898a.f164467d + (this.f164457t * this.f164463z)));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m182605q(long j) {
        if (this.f164449l.size() == 0) {
            this.f164449l.add(m182608t(-1L));
        } else {
            m182606r(j);
            m182604p(j);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m182606r(long j) {
        Iterator<C19898a> it = this.f164449l.iterator();
        while (it.hasNext()) {
            if (it.next().f164468e <= j) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m182607s(C19898a c19898a, Canvas canvas, long j) {
        float f = ((((j - c19898a.f164467d) / this.f164463z) + c19898a.f164466c) % c19898a.f164465b) / c19898a.f164465b;
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = f >= 0.5f ? (1.0f - f) / 0.5f : f / 0.5f;
        float f3 = ((j - c19898a.f164467d) * ((long) this.f164452o)) / this.f164441A;
        RectF rectF = this.f164459v;
        float f4 = f3 - this.f164450m;
        int i = this.f164456s;
        float f5 = (i - this.f164453p) - ((i * c19898a.f164464a) * f2);
        int i2 = this.f164456s;
        rectF.set(f4, f5, f3, this.f164453p + i2 + (i2 * c19898a.f164464a * f2));
        RectF rectF2 = this.f164459v;
        int i3 = this.f164455r;
        canvas.drawRoundRect(rectF2, i3, i3, this.f164458u);
    }

    /* JADX INFO: renamed from: t */
    public final C19898a m182608t(long j) {
        C19898a c19898a = new C19898a();
        if (j == -1) {
            c19898a.f164467d = System.nanoTime();
        } else {
            c19898a.f164467d = j;
        }
        c19898a.f164465b = ((long) (Math.random() * 2000.0d)) + 800;
        new Random().nextDouble();
        int soundLevel = this.f130715f.getSoundLevel();
        c19898a.f164464a = Math.min(0.65f, Math.max(0.05f, (soundLevel < 0 ? 1 : (soundLevel + 500) / 500) / 7.0f));
        c19898a.f164466c = j % c19898a.f164465b;
        c19898a.f164468e = c19898a.f164467d + ((((long) ((this.f164447j + this.f164450m) + this.f164451n)) * this.f164441A) / ((long) this.f164452o));
        return c19898a;
    }

    /* JADX INFO: renamed from: u */
    public final void m182609u(int i) {
        this.f164449l = new ArrayList();
        this.f164450m = m153506a(3);
        this.f164451n = m153506a(3);
        this.f164455r = m153506a(3);
        this.f164452o = 300;
        this.f164457t = ((this.f164450m + this.f164451n) * 1000) / 300;
        this.f164459v = new RectF();
        this.f164461x = m153506a(58);
        this.f164460w = new RectF();
        Paint paint = new Paint();
        this.f164458u = paint;
        paint.setAntiAlias(true);
        this.f164458u.setColor(i);
        this.f164462y = m153506a(16);
    }

    public rqc0(Context context) {
        this(context, -1);
    }
}
