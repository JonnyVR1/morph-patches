package com.p003p1.mobile.android.p005ui.cropiwa;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import com.p003p1.mobile.android.p005ui.cropiwa.config.InitialPosition;
import p007l.de50;
import p007l.iub;
import p007l.jhi0;
import p007l.nex;
import p007l.qex;
import p007l.se50;
import p007l.sub;
import p007l.zu5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@SuppressLint({"ViewConstructor", "AppCompatCustomView"})
class CropIwaImageView extends ImageView implements se50, zu5 {

    /* JADX INFO: renamed from: a */
    public Matrix f1466a;

    /* JADX INFO: renamed from: b */
    public qex f1467b;

    /* JADX INFO: renamed from: c */
    public C0267b f1468c;

    /* JADX INFO: renamed from: d */
    public RectF f1469d;

    /* JADX INFO: renamed from: e */
    public RectF f1470e;

    /* JADX INFO: renamed from: f */
    public RectF f1471f;

    /* JADX INFO: renamed from: g */
    public de50 f1472g;

    /* JADX INFO: renamed from: h */
    public iub f1473h;

    /* JADX INFO: renamed from: i */
    public boolean f1474i;

    /* JADX INFO: renamed from: j */
    public nex f1475j;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$a */
    public static /* synthetic */ class C0266a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1476a;

        static {
            int[] iArr = new int[InitialPosition.values().length];
            f1476a = iArr;
            try {
                iArr[InitialPosition.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1476a[InitialPosition.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$b */
    public class C0267b {

        /* JADX INFO: renamed from: a */
        public ScaleGestureDetector f1477a;

        /* JADX INFO: renamed from: b */
        public C0269d f1478b;

        public C0267b() {
            this.f1477a = new ScaleGestureDetector(CropIwaImageView.this.getContext(), new C0268c());
            this.f1478b = new C0269d();
        }

        /* JADX INFO: renamed from: a */
        public void m1259a(MotionEvent motionEvent) {
            this.f1478b.m1263b(motionEvent);
        }

        /* JADX INFO: renamed from: b */
        public void m1260b(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    CropIwaImageView.this.m1249q();
                    return;
                }
                if (CropIwaImageView.this.f1473h.m9438m()) {
                    this.f1477a.onTouchEvent(motionEvent);
                }
                if (CropIwaImageView.this.f1473h.m9439n()) {
                    this.f1478b.m1265d(motionEvent, !this.f1477a.isInProgress());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$c */
    public class C0268c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C0268c() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m1261a(float f) {
            return f >= CropIwaImageView.this.f1473h.m9435j() && f <= CropIwaImageView.this.f1473h.m9435j() + CropIwaImageView.this.f1473h.m9434i();
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            boolean z = CropIwaImageView.this.f1474i;
            CropIwaImageView cropIwaImageView = CropIwaImageView.this;
            if (!m1261a((z ? Math.max(Math.abs(cropIwaImageView.f1467b.m10351c(CropIwaImageView.this.f1466a)), Math.abs(CropIwaImageView.this.f1467b.m10350b(CropIwaImageView.this.f1466a))) : cropIwaImageView.f1467b.m10351c(CropIwaImageView.this.f1466a)) * scaleFactor)) {
                return true;
            }
            CropIwaImageView.this.m1240M(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            CropIwaImageView.this.f1473h.m9447v(CropIwaImageView.this.m1251s()).m9429b();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$d */
    public class C0269d {

        /* JADX INFO: renamed from: a */
        public float f1481a;

        /* JADX INFO: renamed from: b */
        public float f1482b;

        /* JADX INFO: renamed from: c */
        public int f1483c;

        /* JADX INFO: renamed from: d */
        public jhi0 f1484d;

        public C0269d() {
            this.f1484d = new jhi0();
        }

        /* JADX INFO: renamed from: a */
        public final void m1262a(float f, float f2, int i) {
            CropIwaImageView.this.m1246S();
            this.f1484d.m9537d(f, f2, CropIwaImageView.this.f1470e, CropIwaImageView.this.f1469d);
            m1267f(f, f2, i);
        }

        /* JADX INFO: renamed from: b */
        public void m1263b(MotionEvent motionEvent) {
            m1262a(motionEvent.getX(), motionEvent.getY(), motionEvent.getPointerId(0));
        }

        /* JADX INFO: renamed from: c */
        public final void m1264c(MotionEvent motionEvent) {
            if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f1483c) {
                int i = 0;
                while (i < motionEvent.getPointerCount() && i == motionEvent.getActionIndex()) {
                    i++;
                }
                m1262a(motionEvent.getX(i), motionEvent.getY(i), motionEvent.getPointerId(i));
            }
        }

        /* JADX INFO: renamed from: d */
        public void m1265d(MotionEvent motionEvent, boolean z) {
            float x;
            float y;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 2) {
                if (actionMasked != 6) {
                    return;
                }
                m1264c(motionEvent);
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f1483c);
            CropIwaImageView.this.m1246S();
            try {
                x = this.f1484d.m9535b(motionEvent.getX(iFindPointerIndex));
                y = this.f1484d.m9536c(motionEvent.getY(iFindPointerIndex));
            } catch (Exception unused) {
                x = motionEvent.getX();
                y = motionEvent.getY();
            }
            if (z) {
                CropIwaImageView.this.m1245R(x - this.f1481a, y - this.f1482b);
            }
            m1266e(x, y);
        }

        /* JADX INFO: renamed from: e */
        public final void m1266e(float f, float f2) {
            m1267f(f, f2, this.f1483c);
        }

        /* JADX INFO: renamed from: f */
        public final void m1267f(float f, float f2, int i) {
            this.f1481a = f;
            this.f1482b = f2;
            this.f1483c = i;
        }
    }

    public CropIwaImageView(Context context, iub iubVar) {
        super(context);
        this.f1475j = new nex();
        m1228A(iubVar);
    }

    /* JADX INFO: renamed from: A */
    public final void m1228A(iub iubVar) {
        this.f1473h = iubVar;
        iubVar.m9428a(this);
        this.f1470e = new RectF();
        this.f1469d = new RectF();
        this.f1471f = new RectF();
        this.f1467b = new qex();
        this.f1466a = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f1468c = new C0267b();
    }

    /* JADX INFO: renamed from: B */
    public boolean m1229B() {
        new RectF().set(this.f1471f);
        Matrix matrix = new Matrix();
        matrix.set(this.f1466a);
        RectF rectF = new RectF(this.f1471f);
        matrix.mapRect(rectF);
        float f = rectF.left;
        RectF rectF2 = this.f1469d;
        return f - rectF2.left > 0.1f || rectF.top - rectF2.top > 0.1f || rectF.right - rectF2.right < -0.1f || rectF.bottom - rectF2.bottom < -0.1f;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m1230C(ValueAnimator valueAnimator) {
        this.f1466a.set((Matrix) valueAnimator.getAnimatedValue());
        setImageMatrix(this.f1466a);
        m1246S();
        invalidate();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m1231D() {
        m1250r(this.f1473h.m9437l() && !this.f1474i);
    }

    /* JADX INFO: renamed from: E */
    public void m1232E() {
        m1246S();
        m1245R((getWidth() / 2.0f) - this.f1470e.centerX(), (getHeight() / 2.0f) - this.f1470e.centerY());
    }

    /* JADX INFO: renamed from: F */
    public void m1233F(RectF rectF) {
        m1246S();
        m1245R((getWidth() / 2.0f) - rectF.centerX(), (getHeight() / 2.0f) - rectF.centerY());
    }

    /* JADX INFO: renamed from: G */
    public void m1234G() {
        if (this.f1472g != null) {
            RectF rectF = new RectF(this.f1470e);
            sub.m10726c(0, 0, getWidth(), getHeight(), rectF);
            this.f1472g.mo1191b(rectF);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m1235H() {
        m1246S();
        m1232E();
        if (this.f1473h.m9436k() == -1.0f) {
            int i = C0266a.f1476a[this.f1473h.m9433h().ordinal()];
            if (i == 1) {
                m1237J();
            } else if (i == 2) {
                m1236I();
            }
            this.f1473h.m9447v(m1251s()).m9429b();
        } else {
            m1244Q(this.f1473h.m9436k());
        }
        m1234G();
    }

    /* JADX INFO: renamed from: I */
    public final void m1236I() {
        float width;
        int iM1255w;
        if (m1255w() < m1252t()) {
            width = getHeight();
            iM1255w = m1252t();
        } else {
            width = getWidth();
            iM1255w = m1255w();
        }
        m1239L(width / iM1255w);
    }

    /* JADX INFO: renamed from: J */
    public final void m1237J() {
        float width;
        int iM1255w;
        if (getWidth() < getHeight()) {
            width = getHeight();
            iM1255w = m1252t();
        } else {
            width = getWidth();
            iM1255w = m1255w();
        }
        m1239L(width / iM1255w);
    }

    /* JADX INFO: renamed from: K */
    public void m1238K(float f) {
        this.f1466a.postRotate(f, this.f1470e.centerX(), this.f1470e.centerY());
        setImageMatrix(this.f1466a);
        m1246S();
        m1250r(false);
    }

    /* JADX INFO: renamed from: L */
    public final void m1239L(float f) {
        m1246S();
        m1240M(f, this.f1470e.centerX(), this.f1470e.centerY());
    }

    /* JADX INFO: renamed from: M */
    public final void m1240M(float f, float f2, float f3) {
        this.f1466a.postScale(f, f, f2, f3);
        setImageMatrix(this.f1466a);
        m1246S();
        qex.f3861b.onNext(Float.valueOf(Math.max(Math.abs(this.f1467b.m10351c(this.f1466a)), Math.abs(this.f1467b.m10350b(this.f1466a)))));
    }

    /* JADX INFO: renamed from: N */
    public void m1241N(de50 de50Var) {
        this.f1472g = de50Var;
        if (m1258z()) {
            m1246S();
            m1234G();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m1242O(Matrix matrix) {
        this.f1475j.m9981c();
        this.f1466a = matrix;
        getImageMatrix().set(matrix);
        setImageMatrix(matrix);
    }

    /* JADX INFO: renamed from: P */
    public void m1243P(boolean z) {
        this.f1474i = z;
    }

    /* JADX INFO: renamed from: Q */
    public final void m1244Q(@FloatRange(from = 0.009999999776482582d, to = 1.0d) float f) {
        m1239L((this.f1473h.m9435j() + (this.f1473h.m9434i() * Math.min(Math.max(0.01f, f), 1.0f))) / this.f1467b.m10351c(this.f1466a));
        invalidate();
    }

    /* JADX INFO: renamed from: R */
    public final void m1245R(float f, float f2) {
        this.f1466a.postTranslate(f, f2);
        setImageMatrix(this.f1466a);
        if (f > 0.01f || f2 > 0.01f) {
            m1246S();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m1246S() {
        this.f1471f.set(0.0f, 0.0f, m1257y(), m1256x());
        this.f1470e.set(this.f1471f);
        this.f1466a.mapRect(this.f1470e);
    }

    @Override // p007l.zu5
    /* JADX INFO: renamed from: a */
    public void mo1190a() {
        if (Math.abs(m1251s() - this.f1473h.m9436k()) > 0.001f) {
            m1244Q(this.f1473h.m9436k());
            m1250r(false);
        }
        setBackgroundColor(this.f1473h.m9430e());
    }

    @Override // p007l.se50
    /* JADX INFO: renamed from: b */
    public void mo1247b(RectF rectF, boolean z) {
        m1246S();
        this.f1469d.set(rectF);
        if (m1258z()) {
            if (z) {
                m1250r(false);
            } else {
                post(new Runnable() { // from class: com.p1.mobile.android.ui.cropiwa.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1529a.m1231D();
                    }
                });
            }
            m1246S();
            invalidate();
        }
    }

    @Override // p007l.se50
    /* JADX INFO: renamed from: c */
    public void mo1248c(float f, float f2, float f3) {
        m1240M(f, f2, f3);
        this.f1473h.m9447v(m1251s()).m9429b();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f1466a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1473h.m9448w() && m1258z()) {
            m1235H();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1249q() {
        m1250r(!this.f1474i);
    }

    /* JADX INFO: renamed from: r */
    public final void m1250r(boolean z) {
        m1246S();
        Matrix matrixM10346a = qex.m10346a(this.f1471f, this.f1466a, this.f1469d);
        nex nexVar = this.f1475j;
        if (z) {
            nexVar.m9980b(this.f1466a, matrixM10346a, new ValueAnimator.AnimatorUpdateListener() { // from class: com.p1.mobile.android.ui.cropiwa.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f1530a.m1230C(valueAnimator);
                }
            });
        } else {
            nexVar.m9981c();
            this.f1466a.set(matrixM10346a);
            setImageMatrix(this.f1466a);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final float m1251s() {
        return sub.m10724a(((this.f1467b.m10351c(this.f1466a) - this.f1473h.m9435j()) / this.f1473h.m9434i()) + 0.01f, 0.01f, 1.0f);
    }

    /* JADX INFO: renamed from: t */
    public int m1252t() {
        return (int) this.f1470e.height();
    }

    /* JADX INFO: renamed from: u */
    public RectF m1253u() {
        m1246S();
        return new RectF(this.f1470e);
    }

    /* JADX INFO: renamed from: v */
    public C0267b m1254v() {
        return this.f1468c;
    }

    /* JADX INFO: renamed from: w */
    public int m1255w() {
        return (int) this.f1470e.width();
    }

    /* JADX INFO: renamed from: x */
    public int m1256x() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public int m1257y() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public boolean m1258z() {
        return (m1257y() == -1 || m1256x() == -1) ? false : true;
    }
}
