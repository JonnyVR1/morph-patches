package com.p046p1.mobile.android.p048ui.cropiwa;

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
import com.p046p1.mobile.android.p048ui.cropiwa.config.InitialPosition;
import p149l.de50;
import p149l.iub;
import p149l.jhi0;
import p149l.nex;
import p149l.qex;
import p149l.se50;
import p149l.sub;
import p149l.zu5;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor", "AppCompatCustomView"})
class CropIwaImageView extends ImageView implements se50, zu5 {

    /* JADX INFO: renamed from: a */
    public Matrix f15767a;

    /* JADX INFO: renamed from: b */
    public qex f15768b;

    /* JADX INFO: renamed from: c */
    public C4355b f15769c;

    /* JADX INFO: renamed from: d */
    public RectF f15770d;

    /* JADX INFO: renamed from: e */
    public RectF f15771e;

    /* JADX INFO: renamed from: f */
    public RectF f15772f;

    /* JADX INFO: renamed from: g */
    public de50 f15773g;

    /* JADX INFO: renamed from: h */
    public iub f15774h;

    /* JADX INFO: renamed from: i */
    public boolean f15775i;

    /* JADX INFO: renamed from: j */
    public nex f15776j;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$a */
    public static /* synthetic */ class C4354a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15777a;

        static {
            int[] iArr = new int[InitialPosition.values().length];
            f15777a = iArr;
            try {
                iArr[InitialPosition.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15777a[InitialPosition.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$b */
    public class C4355b {

        /* JADX INFO: renamed from: a */
        public ScaleGestureDetector f15778a;

        /* JADX INFO: renamed from: b */
        public C4357d f15779b;

        public C4355b() {
            this.f15778a = new ScaleGestureDetector(CropIwaImageView.this.getContext(), new C4356c());
            this.f15779b = new C4357d();
        }

        /* JADX INFO: renamed from: a */
        public void m20987a(MotionEvent motionEvent) {
            this.f15779b.m20991b(motionEvent);
        }

        /* JADX INFO: renamed from: b */
        public void m20988b(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    CropIwaImageView.this.m20977q();
                    return;
                }
                if (CropIwaImageView.this.f15774h.m138377m()) {
                    this.f15778a.onTouchEvent(motionEvent);
                }
                if (CropIwaImageView.this.f15774h.m138378n()) {
                    this.f15779b.m20993d(motionEvent, !this.f15778a.isInProgress());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$c */
    public class C4356c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C4356c() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m20989a(float f) {
            return f >= CropIwaImageView.this.f15774h.m138374j() && f <= CropIwaImageView.this.f15774h.m138374j() + CropIwaImageView.this.f15774h.m138373i();
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            boolean z = CropIwaImageView.this.f15775i;
            CropIwaImageView cropIwaImageView = CropIwaImageView.this;
            if (!m20989a((z ? Math.max(Math.abs(cropIwaImageView.f15768b.m174268c(CropIwaImageView.this.f15767a)), Math.abs(CropIwaImageView.this.f15768b.m174267b(CropIwaImageView.this.f15767a))) : cropIwaImageView.f15768b.m174268c(CropIwaImageView.this.f15767a)) * scaleFactor)) {
                return true;
            }
            CropIwaImageView.this.m20968M(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            CropIwaImageView.this.f15774h.m138386v(CropIwaImageView.this.m20979s()).m138368b();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$d */
    public class C4357d {

        /* JADX INFO: renamed from: a */
        public float f15782a;

        /* JADX INFO: renamed from: b */
        public float f15783b;

        /* JADX INFO: renamed from: c */
        public int f15784c;

        /* JADX INFO: renamed from: d */
        public jhi0 f15785d;

        public C4357d() {
            this.f15785d = new jhi0();
        }

        /* JADX INFO: renamed from: a */
        public final void m20990a(float f, float f2, int i) {
            CropIwaImageView.this.m20974S();
            this.f15785d.m141528d(f, f2, CropIwaImageView.this.f15771e, CropIwaImageView.this.f15770d);
            m20995f(f, f2, i);
        }

        /* JADX INFO: renamed from: b */
        public void m20991b(MotionEvent motionEvent) {
            m20990a(motionEvent.getX(), motionEvent.getY(), motionEvent.getPointerId(0));
        }

        /* JADX INFO: renamed from: c */
        public final void m20992c(MotionEvent motionEvent) {
            if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f15784c) {
                int i = 0;
                while (i < motionEvent.getPointerCount() && i == motionEvent.getActionIndex()) {
                    i++;
                }
                m20990a(motionEvent.getX(i), motionEvent.getY(i), motionEvent.getPointerId(i));
            }
        }

        /* JADX INFO: renamed from: d */
        public void m20993d(MotionEvent motionEvent, boolean z) {
            float x;
            float y;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 2) {
                if (actionMasked != 6) {
                    return;
                }
                m20992c(motionEvent);
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f15784c);
            CropIwaImageView.this.m20974S();
            try {
                x = this.f15785d.m141526b(motionEvent.getX(iFindPointerIndex));
                y = this.f15785d.m141527c(motionEvent.getY(iFindPointerIndex));
            } catch (Exception unused) {
                x = motionEvent.getX();
                y = motionEvent.getY();
            }
            if (z) {
                CropIwaImageView.this.m20973R(x - this.f15782a, y - this.f15783b);
            }
            m20994e(x, y);
        }

        /* JADX INFO: renamed from: e */
        public final void m20994e(float f, float f2) {
            m20995f(f, f2, this.f15784c);
        }

        /* JADX INFO: renamed from: f */
        public final void m20995f(float f, float f2, int i) {
            this.f15782a = f;
            this.f15783b = f2;
            this.f15784c = i;
        }
    }

    public CropIwaImageView(Context context, iub iubVar) {
        super(context);
        this.f15776j = new nex();
        m20956A(iubVar);
    }

    /* JADX INFO: renamed from: A */
    public final void m20956A(iub iubVar) {
        this.f15774h = iubVar;
        iubVar.m138367a(this);
        this.f15771e = new RectF();
        this.f15770d = new RectF();
        this.f15772f = new RectF();
        this.f15768b = new qex();
        this.f15767a = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f15769c = new C4355b();
    }

    /* JADX INFO: renamed from: B */
    public boolean m20957B() {
        new RectF().set(this.f15772f);
        Matrix matrix = new Matrix();
        matrix.set(this.f15767a);
        RectF rectF = new RectF(this.f15772f);
        matrix.mapRect(rectF);
        float f = rectF.left;
        RectF rectF2 = this.f15770d;
        return f - rectF2.left > 0.1f || rectF.top - rectF2.top > 0.1f || rectF.right - rectF2.right < -0.1f || rectF.bottom - rectF2.bottom < -0.1f;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m20958C(ValueAnimator valueAnimator) {
        this.f15767a.set((Matrix) valueAnimator.getAnimatedValue());
        setImageMatrix(this.f15767a);
        m20974S();
        invalidate();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m20959D() {
        m20978r(this.f15774h.m138376l() && !this.f15775i);
    }

    /* JADX INFO: renamed from: E */
    public void m20960E() {
        m20974S();
        m20973R((getWidth() / 2.0f) - this.f15771e.centerX(), (getHeight() / 2.0f) - this.f15771e.centerY());
    }

    /* JADX INFO: renamed from: F */
    public void m20961F(RectF rectF) {
        m20974S();
        m20973R((getWidth() / 2.0f) - rectF.centerX(), (getHeight() / 2.0f) - rectF.centerY());
    }

    /* JADX INFO: renamed from: G */
    public void m20962G() {
        if (this.f15773g != null) {
            RectF rectF = new RectF(this.f15771e);
            sub.m186006c(0, 0, getWidth(), getHeight(), rectF);
            this.f15773g.mo20919b(rectF);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m20963H() {
        m20974S();
        m20960E();
        if (this.f15774h.m138375k() == -1.0f) {
            int i = C4354a.f15777a[this.f15774h.m138372h().ordinal()];
            if (i == 1) {
                m20965J();
            } else if (i == 2) {
                m20964I();
            }
            this.f15774h.m138386v(m20979s()).m138368b();
        } else {
            m20972Q(this.f15774h.m138375k());
        }
        m20962G();
    }

    /* JADX INFO: renamed from: I */
    public final void m20964I() {
        float width;
        int iM20983w;
        if (m20983w() < m20980t()) {
            width = getHeight();
            iM20983w = m20980t();
        } else {
            width = getWidth();
            iM20983w = m20983w();
        }
        m20967L(width / iM20983w);
    }

    /* JADX INFO: renamed from: J */
    public final void m20965J() {
        float width;
        int iM20983w;
        if (getWidth() < getHeight()) {
            width = getHeight();
            iM20983w = m20980t();
        } else {
            width = getWidth();
            iM20983w = m20983w();
        }
        m20967L(width / iM20983w);
    }

    /* JADX INFO: renamed from: K */
    public void m20966K(float f) {
        this.f15767a.postRotate(f, this.f15771e.centerX(), this.f15771e.centerY());
        setImageMatrix(this.f15767a);
        m20974S();
        m20978r(false);
    }

    /* JADX INFO: renamed from: L */
    public final void m20967L(float f) {
        m20974S();
        m20968M(f, this.f15771e.centerX(), this.f15771e.centerY());
    }

    /* JADX INFO: renamed from: M */
    public final void m20968M(float f, float f2, float f3) {
        this.f15767a.postScale(f, f, f2, f3);
        setImageMatrix(this.f15767a);
        m20974S();
        qex.f154068b.onNext(Float.valueOf(Math.max(Math.abs(this.f15768b.m174268c(this.f15767a)), Math.abs(this.f15768b.m174267b(this.f15767a)))));
    }

    /* JADX INFO: renamed from: N */
    public void m20969N(de50 de50Var) {
        this.f15773g = de50Var;
        if (m20986z()) {
            m20974S();
            m20962G();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m20970O(Matrix matrix) {
        this.f15776j.m159127c();
        this.f15767a = matrix;
        getImageMatrix().set(matrix);
        setImageMatrix(matrix);
    }

    /* JADX INFO: renamed from: P */
    public void m20971P(boolean z) {
        this.f15775i = z;
    }

    /* JADX INFO: renamed from: Q */
    public final void m20972Q(@FloatRange(from = 0.009999999776482582d, to = 1.0d) float f) {
        m20967L((this.f15774h.m138374j() + (this.f15774h.m138373i() * Math.min(Math.max(0.01f, f), 1.0f))) / this.f15768b.m174268c(this.f15767a));
        invalidate();
    }

    /* JADX INFO: renamed from: R */
    public final void m20973R(float f, float f2) {
        this.f15767a.postTranslate(f, f2);
        setImageMatrix(this.f15767a);
        if (f > 0.01f || f2 > 0.01f) {
            m20974S();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m20974S() {
        this.f15772f.set(0.0f, 0.0f, m20985y(), m20984x());
        this.f15771e.set(this.f15772f);
        this.f15767a.mapRect(this.f15771e);
    }

    @Override // p149l.zu5
    /* JADX INFO: renamed from: a */
    public void mo20918a() {
        if (Math.abs(m20979s() - this.f15774h.m138375k()) > 0.001f) {
            m20972Q(this.f15774h.m138375k());
            m20978r(false);
        }
        setBackgroundColor(this.f15774h.m138369e());
    }

    @Override // p149l.se50
    /* JADX INFO: renamed from: b */
    public void mo20975b(RectF rectF, boolean z) {
        m20974S();
        this.f15770d.set(rectF);
        if (m20986z()) {
            if (z) {
                m20978r(false);
            } else {
                post(new Runnable() { // from class: com.p1.mobile.android.ui.cropiwa.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15830a.m20959D();
                    }
                });
            }
            m20974S();
            invalidate();
        }
    }

    @Override // p149l.se50
    /* JADX INFO: renamed from: c */
    public void mo20976c(float f, float f2, float f3) {
        m20968M(f, f2, f3);
        this.f15774h.m138386v(m20979s()).m138368b();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f15767a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f15774h.m138387w() && m20986z()) {
            m20963H();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m20977q() {
        m20978r(!this.f15775i);
    }

    /* JADX INFO: renamed from: r */
    public final void m20978r(boolean z) {
        m20974S();
        Matrix matrixM174263a = qex.m174263a(this.f15772f, this.f15767a, this.f15770d);
        nex nexVar = this.f15776j;
        if (z) {
            nexVar.m159126b(this.f15767a, matrixM174263a, new ValueAnimator.AnimatorUpdateListener() { // from class: com.p1.mobile.android.ui.cropiwa.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f15831a.m20958C(valueAnimator);
                }
            });
        } else {
            nexVar.m159127c();
            this.f15767a.set(matrixM174263a);
            setImageMatrix(this.f15767a);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final float m20979s() {
        return sub.m186004a(((this.f15768b.m174268c(this.f15767a) - this.f15774h.m138374j()) / this.f15774h.m138373i()) + 0.01f, 0.01f, 1.0f);
    }

    /* JADX INFO: renamed from: t */
    public int m20980t() {
        return (int) this.f15771e.height();
    }

    /* JADX INFO: renamed from: u */
    public RectF m20981u() {
        m20974S();
        return new RectF(this.f15771e);
    }

    /* JADX INFO: renamed from: v */
    public C4355b m20982v() {
        return this.f15769c;
    }

    /* JADX INFO: renamed from: w */
    public int m20983w() {
        return (int) this.f15771e.width();
    }

    /* JADX INFO: renamed from: x */
    public int m20984x() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public int m20985y() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public boolean m20986z() {
        return (m20985y() == -1 || m20984x() == -1) ? false : true;
    }
}
