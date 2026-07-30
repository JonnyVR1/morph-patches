package com.p051p1.mobile.android.p053ui.cropiwa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import java.lang.reflect.Array;
import java.util.Arrays;
import p153l.bwb;
import p153l.fwb;
import p153l.gwb;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
class CropIwaDynamicOverlayView extends CropIwaOverlayView {

    /* JADX INFO: renamed from: t */
    public static final float f16474t = gwb.m132652e(24);

    /* JADX INFO: renamed from: o */
    public float[][] f16475o;

    /* JADX INFO: renamed from: p */
    public C4504a[] f16476p;

    /* JADX INFO: renamed from: q */
    public SparseArray<C4504a> f16477q;

    /* JADX INFO: renamed from: r */
    public PointF f16478r;

    /* JADX INFO: renamed from: s */
    public RectF f16479s;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaDynamicOverlayView$a */
    public class C4504a {

        /* JADX INFO: renamed from: a */
        public RectF f16480a = new RectF();

        /* JADX INFO: renamed from: b */
        public PointF f16481b;

        /* JADX INFO: renamed from: c */
        public PointF f16482c;

        /* JADX INFO: renamed from: d */
        public PointF f16483d;

        public C4504a(PointF pointF, PointF pointF2, PointF pointF3) {
            this.f16481b = pointF;
            this.f16482c = pointF2;
            this.f16483d = pointF3;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a A[PHI: r3
          0x001a: PHI (r3v4 float) = (r3v2 float), (r3v5 float) binds: [B:13:0x0021, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: a */
        public final float m21932a(float f, float f2, float f3, int i) {
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
        public boolean m21933b(float f, float f2) {
            RectF rectF = this.f16480a;
            PointF pointF = this.f16481b;
            float f3 = pointF.x;
            float f4 = pointF.y;
            rectF.set(f3, f4, f3, f4);
            gwb.m132653f(CropIwaDynamicOverlayView.f16474t, this.f16480a);
            return this.f16480a.contains(f, f2);
        }

        /* JADX INFO: renamed from: c */
        public boolean m21934c() {
            PointF pointF = this.f16481b;
            float f = pointF.x;
            PointF pointF2 = this.f16483d;
            float f2 = pointF2.x;
            if (f == f2) {
                float f3 = pointF.y;
                if (f3 < pointF2.y) {
                    PointF pointF3 = this.f16482c;
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
            PointF pointF4 = this.f16482c;
            return f4 == pointF4.y && f > pointF4.x;
        }

        /* JADX INFO: renamed from: d */
        public boolean m21935d() {
            return Math.abs(this.f16481b.x - this.f16482c.x) >= ((float) CropIwaDynamicOverlayView.this.f16521g.m106678n());
        }

        /* JADX INFO: renamed from: e */
        public void m21936e(float f, float f2) {
            float fM21932a = m21932a(this.f16481b.x, f, this.f16482c.x, CropIwaDynamicOverlayView.this.f16521g.m106678n());
            PointF pointF = this.f16481b;
            pointF.x = fM21932a;
            PointF pointF2 = this.f16483d;
            pointF2.x = fM21932a;
            float fM21932a2 = m21932a(pointF.y, f2, pointF2.y, CropIwaDynamicOverlayView.this.f16521g.m106677m());
            this.f16481b.y = fM21932a2;
            this.f16482c.y = fM21932a2;
        }

        /* JADX INFO: renamed from: f */
        public float m21937f() {
            return this.f16481b.x;
        }

        /* JADX INFO: renamed from: g */
        public float m21938g() {
            return this.f16481b.y;
        }

        public String toString() {
            return this.f16481b.toString();
        }
    }

    public CropIwaDynamicOverlayView(Context context, bwb bwbVar) {
        super(context, bwbVar);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m21914A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        return m21931z(motionEvent.getPointerId(actionIndex), motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
    }

    /* JADX INFO: renamed from: B */
    public final void m21915B() {
        C4504a c4504a = this.f16476p[0];
        RectF rectF = this.f16519e;
        c4504a.m21936e(rectF.left, rectF.top);
        C4504a c4504a2 = this.f16476p[3];
        RectF rectF2 = this.f16519e;
        c4504a2.m21936e(rectF2.right, rectF2.bottom);
    }

    /* JADX INFO: renamed from: C */
    public void m21916C() {
        this.f16519e.set(this.f16476p[0].m21937f(), this.f16476p[0].m21938g(), this.f16476p[3].m21937f(), this.f16476p[3].m21938g());
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, p153l.dw5
    /* JADX INFO: renamed from: a */
    public void mo21917a() {
        super.mo21917a();
        m21924s();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, p153l.km50
    /* JADX INFO: renamed from: b */
    public void mo21918b(RectF rectF) {
        super.mo21918b(rectF);
        m21924s();
        invalidate();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: d */
    public void mo21919d(bwb bwbVar) {
        super.mo21919d(bwbVar);
        this.f16477q = new SparseArray<>();
        this.f16476p = new C4504a[4];
        this.f16475o = m21923r(Math.min(bwbVar.m106678n(), bwbVar.m106677m()) * 0.3f);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: e */
    public boolean mo21920e() {
        return this.f16478r != null;
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: g */
    public boolean mo21921g() {
        return this.f16477q.size() != 0;
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f16522h) {
            return;
        }
        super.onDraw(canvas);
        if (!m21922q()) {
            return;
        }
        fwb fwbVarM106674j = this.f16521g.m106674j();
        int i = 0;
        while (true) {
            C4504a[] c4504aArr = this.f16476p;
            if (i >= c4504aArr.length) {
                return;
            }
            float fM21937f = c4504aArr[i].m21937f();
            float fM21938g = this.f16476p[i].m21938g();
            float[] fArr = this.f16475o[i];
            fwbVarM106674j.mo127754e(canvas, fM21937f, fM21938g, fArr[0], fArr[1]);
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0028  */
    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f16522h) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo21930y(motionEvent);
        } else if (actionMasked == 1) {
            mo21926u();
        } else if (actionMasked == 2) {
            mo21928w(motionEvent);
        } else if (actionMasked == 3) {
            mo21926u();
        } else if (actionMasked == 5) {
            m21927v(motionEvent);
        } else {
            if (actionMasked != 6) {
                return false;
            }
            m21929x(motionEvent);
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m21922q() {
        C4504a c4504a = this.f16476p[0];
        return c4504a != null && c4504a.m21935d();
    }

    /* JADX INFO: renamed from: r */
    public final float[][] m21923r(float f) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
        fArr[0] = new float[]{f, f};
        float f2 = -f;
        fArr[2] = new float[]{f, f2};
        fArr[1] = new float[]{f2, f};
        fArr[3] = new float[]{f2, f2};
        return fArr;
    }

    /* JADX INFO: renamed from: s */
    public final void m21924s() {
        if (this.f16519e.width() <= 0.0f || this.f16519e.height() <= 0.0f) {
            return;
        }
        if (!gwb.m132654g(Arrays.asList(this.f16476p))) {
            m21915B();
            return;
        }
        RectF rectF = this.f16519e;
        PointF pointF = new PointF(rectF.left, rectF.top);
        RectF rectF2 = this.f16519e;
        PointF pointF2 = new PointF(rectF2.left, rectF2.bottom);
        RectF rectF3 = this.f16519e;
        PointF pointF3 = new PointF(rectF3.right, rectF3.top);
        RectF rectF4 = this.f16519e;
        PointF pointF4 = new PointF(rectF4.right, rectF4.bottom);
        this.f16476p[0] = new C4504a(pointF, pointF3, pointF2);
        this.f16476p[2] = new C4504a(pointF2, pointF4, pointF);
        this.f16476p[1] = new C4504a(pointF3, pointF, pointF4);
        this.f16476p[3] = new C4504a(pointF4, pointF2, pointF3);
    }

    /* JADX INFO: renamed from: t */
    public boolean mo21925t() {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void mo21926u() {
        RectF rectF = this.f16479s;
        if (rectF != null && !rectF.equals(this.f16519e)) {
            m22015l();
        }
        if (this.f16477q.size() > 0) {
            m22015l();
        }
        this.f16477q.clear();
        this.f16478r = null;
        this.f16479s = null;
    }

    /* JADX INFO: renamed from: v */
    public final void m21927v(MotionEvent motionEvent) {
        if (mo21921g()) {
            m21914A(motionEvent);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo21928w(MotionEvent motionEvent) {
        if (!mo21921g()) {
            if (mo21920e()) {
                this.f16519e = gwb.m132655h(this.f16479s, motionEvent.getX() - this.f16478r.x, motionEvent.getY() - this.f16478r.y, getWidth(), getHeight(), this.f16519e);
                m21915B();
                return;
            }
            return;
        }
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            C4504a c4504a = this.f16477q.get(motionEvent.getPointerId(i));
            if (c4504a != null) {
                c4504a.m21936e(gwb.m132648a(motionEvent.getX(i), 0.0f, getWidth()), gwb.m132648a(motionEvent.getY(i), 0.0f, getHeight()));
            }
        }
        m21916C();
    }

    /* JADX INFO: renamed from: x */
    public final void m21929x(MotionEvent motionEvent) {
        this.f16477q.remove(motionEvent.getPointerId(motionEvent.getActionIndex()));
    }

    /* JADX INFO: renamed from: y */
    public void mo21930y(MotionEvent motionEvent) {
        if (m21914A(motionEvent)) {
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (mo21925t() && this.f16519e.contains(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex))) {
            this.f16478r = new PointF(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
            this.f16479s = new RectF(this.f16519e);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m21931z(int i, float f, float f2) {
        for (C4504a c4504a : this.f16476p) {
            if (c4504a.m21933b(f, f2)) {
                this.f16477q.put(i, c4504a);
                return true;
            }
        }
        return false;
    }
}
