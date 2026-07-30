package com.p046p1.mobile.android.p048ui.cropiwa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import java.lang.reflect.Array;
import java.util.Arrays;
import p149l.nub;
import p149l.rub;
import p149l.sub;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
class CropIwaDynamicOverlayView extends CropIwaOverlayView {

    /* JADX INFO: renamed from: t */
    public static final float f15755t = sub.m186008e(24);

    /* JADX INFO: renamed from: o */
    public float[][] f15756o;

    /* JADX INFO: renamed from: p */
    public C4353a[] f15757p;

    /* JADX INFO: renamed from: q */
    public SparseArray<C4353a> f15758q;

    /* JADX INFO: renamed from: r */
    public PointF f15759r;

    /* JADX INFO: renamed from: s */
    public RectF f15760s;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaDynamicOverlayView$a */
    public class C4353a {

        /* JADX INFO: renamed from: a */
        public RectF f15761a = new RectF();

        /* JADX INFO: renamed from: b */
        public PointF f15762b;

        /* JADX INFO: renamed from: c */
        public PointF f15763c;

        /* JADX INFO: renamed from: d */
        public PointF f15764d;

        public C4353a(PointF pointF, PointF pointF2, PointF pointF3) {
            this.f15762b = pointF;
            this.f15763c = pointF2;
            this.f15764d = pointF3;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a A[PHI: r3
          0x001a: PHI (r3v4 float) = (r3v2 float), (r3v5 float) binds: [B:13:0x0021, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: a */
        public final float m20933a(float f, float f2, float f3, int i) {
            float f4;
            float f5 = i;
            boolean z = false;
            boolean z2 = Math.abs(f2 - f3) > f5;
            if (f3 > f) {
                f4 = f3 - f5;
                if (f2 < f3) {
                    z = true;
                }
            } else {
                f4 = f3 + f5;
                if (f2 > f3) {
                    z = true;
                }
            }
            return z2 & z ? f2 : f4;
        }

        /* JADX INFO: renamed from: b */
        public boolean m20934b(float f, float f2) {
            RectF rectF = this.f15761a;
            PointF pointF = this.f15762b;
            float f3 = pointF.x;
            float f4 = pointF.y;
            rectF.set(f3, f4, f3, f4);
            sub.m186009f(CropIwaDynamicOverlayView.f15755t, this.f15761a);
            return this.f15761a.contains(f, f2);
        }

        /* JADX INFO: renamed from: c */
        public boolean m20935c() {
            PointF pointF = this.f15762b;
            float f = pointF.x;
            PointF pointF2 = this.f15764d;
            float f2 = pointF2.x;
            if (f == f2) {
                float f3 = pointF.y;
                if (f3 < pointF2.y) {
                    PointF pointF3 = this.f15763c;
                    if (f3 == pointF3.y && f < pointF3.x) {
                        return true;
                    }
                }
            }
            if (f != f2) {
                return false;
            }
            float f4 = pointF.y;
            if (f4 <= pointF2.y) {
                return false;
            }
            PointF pointF4 = this.f15763c;
            return f4 == pointF4.y && f > pointF4.x;
        }

        /* JADX INFO: renamed from: d */
        public boolean m20936d() {
            return Math.abs(this.f15762b.x - this.f15763c.x) >= ((float) CropIwaDynamicOverlayView.this.f15802g.m161470n());
        }

        /* JADX INFO: renamed from: e */
        public void m20937e(float f, float f2) {
            float fM20933a = m20933a(this.f15762b.x, f, this.f15763c.x, CropIwaDynamicOverlayView.this.f15802g.m161470n());
            PointF pointF = this.f15762b;
            pointF.x = fM20933a;
            PointF pointF2 = this.f15764d;
            pointF2.x = fM20933a;
            float fM20933a2 = m20933a(pointF.y, f2, pointF2.y, CropIwaDynamicOverlayView.this.f15802g.m161469m());
            this.f15762b.y = fM20933a2;
            this.f15763c.y = fM20933a2;
        }

        /* JADX INFO: renamed from: f */
        public float m20938f() {
            return this.f15762b.x;
        }

        /* JADX INFO: renamed from: g */
        public float m20939g() {
            return this.f15762b.y;
        }

        public String toString() {
            return this.f15762b.toString();
        }
    }

    public CropIwaDynamicOverlayView(Context context, nub nubVar) {
        super(context, nubVar);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m20915A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        return m20932z(motionEvent.getPointerId(actionIndex), motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
    }

    /* JADX INFO: renamed from: B */
    public final void m20916B() {
        C4353a c4353a = this.f15757p[0];
        RectF rectF = this.f15800e;
        c4353a.m20937e(rectF.left, rectF.top);
        C4353a c4353a2 = this.f15757p[3];
        RectF rectF2 = this.f15800e;
        c4353a2.m20937e(rectF2.right, rectF2.bottom);
    }

    /* JADX INFO: renamed from: C */
    public void m20917C() {
        this.f15800e.set(this.f15757p[0].m20938f(), this.f15757p[0].m20939g(), this.f15757p[3].m20938f(), this.f15757p[3].m20939g());
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, p149l.zu5
    /* JADX INFO: renamed from: a */
    public void mo20918a() {
        super.mo20918a();
        m20925s();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, p149l.de50
    /* JADX INFO: renamed from: b */
    public void mo20919b(RectF rectF) {
        super.mo20919b(rectF);
        m20925s();
        invalidate();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: d */
    public void mo20920d(nub nubVar) {
        super.mo20920d(nubVar);
        this.f15758q = new SparseArray<>();
        this.f15757p = new C4353a[4];
        this.f15756o = m20924r(Math.min(nubVar.m161470n(), nubVar.m161469m()) * 0.3f);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: e */
    public boolean mo20921e() {
        return this.f15759r != null;
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: g */
    public boolean mo20922g() {
        return this.f15758q.size() != 0;
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f15803h) {
            return;
        }
        super.onDraw(canvas);
        if (!m20923q()) {
            return;
        }
        rub rubVarM161466j = this.f15802g.m161466j();
        int i = 0;
        while (true) {
            C4353a[] c4353aArr = this.f15757p;
            if (i >= c4353aArr.length) {
                return;
            }
            float fM20938f = c4353aArr[i].m20938f();
            float fM20939g = this.f15757p[i].m20939g();
            float[] fArr = this.f15756o[i];
            rubVarM161466j.mo147266e(canvas, fM20938f, fM20939g, fArr[0], fArr[1]);
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0028  */
    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f15803h) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo20931y(motionEvent);
        } else if (actionMasked == 1) {
            mo20927u();
        } else if (actionMasked == 2) {
            mo20929w(motionEvent);
        } else if (actionMasked == 3) {
            mo20927u();
        } else if (actionMasked == 5) {
            m20928v(motionEvent);
        } else {
            if (actionMasked != 6) {
                return false;
            }
            m20930x(motionEvent);
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20923q() {
        C4353a c4353a = this.f15757p[0];
        return c4353a != null && c4353a.m20936d();
    }

    /* JADX INFO: renamed from: r */
    public final float[][] m20924r(float f) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
        fArr[0] = new float[]{f, f};
        float f2 = -f;
        fArr[2] = new float[]{f, f2};
        fArr[1] = new float[]{f2, f};
        fArr[3] = new float[]{f2, f2};
        return fArr;
    }

    /* JADX INFO: renamed from: s */
    public final void m20925s() {
        if (this.f15800e.width() <= 0.0f || this.f15800e.height() <= 0.0f) {
            return;
        }
        if (!sub.m186010g(Arrays.asList(this.f15757p))) {
            m20916B();
            return;
        }
        RectF rectF = this.f15800e;
        PointF pointF = new PointF(rectF.left, rectF.top);
        RectF rectF2 = this.f15800e;
        PointF pointF2 = new PointF(rectF2.left, rectF2.bottom);
        RectF rectF3 = this.f15800e;
        PointF pointF3 = new PointF(rectF3.right, rectF3.top);
        RectF rectF4 = this.f15800e;
        PointF pointF4 = new PointF(rectF4.right, rectF4.bottom);
        this.f15757p[0] = new C4353a(pointF, pointF3, pointF2);
        this.f15757p[2] = new C4353a(pointF2, pointF4, pointF);
        this.f15757p[1] = new C4353a(pointF3, pointF, pointF4);
        this.f15757p[3] = new C4353a(pointF4, pointF2, pointF3);
    }

    /* JADX INFO: renamed from: t */
    public boolean mo20926t() {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void mo20927u() {
        RectF rectF = this.f15760s;
        if (rectF != null && !rectF.equals(this.f15800e)) {
            m21016l();
        }
        if (this.f15758q.size() > 0) {
            m21016l();
        }
        this.f15758q.clear();
        this.f15759r = null;
        this.f15760s = null;
    }

    /* JADX INFO: renamed from: v */
    public final void m20928v(MotionEvent motionEvent) {
        if (mo20922g()) {
            m20915A(motionEvent);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo20929w(MotionEvent motionEvent) {
        if (!mo20922g()) {
            if (mo20921e()) {
                this.f15800e = sub.m186011h(this.f15760s, motionEvent.getX() - this.f15759r.x, motionEvent.getY() - this.f15759r.y, getWidth(), getHeight(), this.f15800e);
                m20916B();
                return;
            }
            return;
        }
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            C4353a c4353a = this.f15758q.get(motionEvent.getPointerId(i));
            if (c4353a != null) {
                c4353a.m20937e(sub.m186004a(motionEvent.getX(i), 0.0f, getWidth()), sub.m186004a(motionEvent.getY(i), 0.0f, getHeight()));
            }
        }
        m20917C();
    }

    /* JADX INFO: renamed from: x */
    public final void m20930x(MotionEvent motionEvent) {
        this.f15758q.remove(motionEvent.getPointerId(motionEvent.getActionIndex()));
    }

    /* JADX INFO: renamed from: y */
    public void mo20931y(MotionEvent motionEvent) {
        if (m20915A(motionEvent)) {
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (mo20926t() && this.f15800e.contains(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex))) {
            this.f15759r = new PointF(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
            this.f15760s = new RectF(this.f15800e);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m20932z(int i, float f, float f2) {
        for (C4353a c4353a : this.f15757p) {
            if (c4353a.m20934b(f, f2)) {
                this.f15758q.put(i, c4353a);
                return true;
            }
        }
        return false;
    }
}
