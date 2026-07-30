package com.p046p1.mobile.android.p048ui.cropiwa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import p149l.j11;
import p149l.kub;
import p149l.nub;
import p149l.sub;
import p149l.t0c0;
import p149l.t100;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
class CropIwaNewUIDynamicOverlayView extends CropIwaOverlayView {

    /* JADX INFO: renamed from: o */
    public C4358a[] f15787o;

    /* JADX INFO: renamed from: p */
    public SparseArray<C4358a> f15788p;

    /* JADX INFO: renamed from: q */
    public int f15789q;

    /* JADX INFO: renamed from: r */
    public int f15790r;

    /* JADX INFO: renamed from: s */
    public kub f15791s;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaNewUIDynamicOverlayView$a */
    public class C4358a {

        /* JADX INFO: renamed from: a */
        public PointF f15792a;

        /* JADX INFO: renamed from: b */
        public PointF f15793b;

        /* JADX INFO: renamed from: c */
        public PointF f15794c;

        public C4358a(PointF pointF, PointF pointF2, PointF pointF3) {
            this.f15792a = pointF;
            this.f15793b = pointF2;
            this.f15794c = pointF3;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a A[PHI: r3
          0x001a: PHI (r3v4 float) = (r3v2 float), (r3v5 float) binds: [B:13:0x0021, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: b */
        public final float m21006b(float f, float f2, float f3, int i) {
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

        /* JADX INFO: renamed from: c */
        public void m21007c(float f, float f2) {
            float fM21006b = m21006b(this.f15792a.x, f, this.f15793b.x, CropIwaNewUIDynamicOverlayView.this.f15802g.m161470n());
            PointF pointF = this.f15792a;
            pointF.x = fM21006b;
            PointF pointF2 = this.f15794c;
            pointF2.x = fM21006b;
            float fM21006b2 = m21006b(pointF.y, f2, pointF2.y, CropIwaNewUIDynamicOverlayView.this.f15802g.m161469m());
            this.f15792a.y = fM21006b2;
            this.f15793b.y = fM21006b2;
        }

        /* JADX INFO: renamed from: d */
        public float m21008d() {
            return this.f15792a.x;
        }

        /* JADX INFO: renamed from: e */
        public float m21009e() {
            return this.f15792a.y;
        }

        public String toString() {
            return this.f15792a.toString();
        }
    }

    public CropIwaNewUIDynamicOverlayView(Context context, nub nubVar) {
        super(context, nubVar);
        this.f15789q = t100.m186890d(241.0f);
        this.f15790r = t100.m186890d(556.0f);
        this.f15791s = (kub) this.f15798c;
    }

    /* JADX INFO: renamed from: q */
    private void m20996q() {
        if (this.f15800e.width() <= 0.0f || this.f15800e.height() <= 0.0f) {
            return;
        }
        if (!sub.m186010g(Arrays.asList(this.f15787o))) {
            m21001w();
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
        this.f15787o[0] = new C4358a(pointF, pointF3, pointF2);
        this.f15787o[2] = new C4358a(pointF2, pointF4, pointF);
        this.f15787o[1] = new C4358a(pointF3, pointF, pointF4);
        this.f15787o[3] = new C4358a(pointF4, pointF2, pointF3);
    }

    /* JADX INFO: renamed from: s */
    private void m20997s() {
        this.f15796a.setColor(this.f15802g.m161471o());
        if (NullChecker.m81303a(this.f15804i)) {
            this.f15804i.mo168503a(this.f15800e);
        }
        m21004r(this.f15800e);
        m21017m(true);
        this.f15788p.clear();
    }

    /* JADX INFO: renamed from: t */
    private void m20998t(MotionEvent motionEvent) {
        if (mo20922g()) {
            this.f15796a.setColor(getResources().getColor(t0c0.f167147E));
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                C4358a c4358a = this.f15788p.get(motionEvent.getPointerId(i));
                if (c4358a != null) {
                    c4358a.m21007c(c4358a.m21008d(), m21003p(c4358a, motionEvent.getY(i)));
                }
            }
            m21002x();
            if (this.f15788p.size() > 0) {
                m21017m(true);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m20999u(int i, float f, float f2) {
        int iM147267j = this.f15791s.m147267j(f, f2);
        if (iM147267j == -1) {
            return false;
        }
        if (iM147267j == 4) {
            this.f15788p.put(i, this.f15787o[0]);
            return true;
        }
        SparseArray<C4358a> sparseArray = this.f15788p;
        if (iM147267j == 5) {
            sparseArray.put(i, this.f15787o[3]);
            return true;
        }
        sparseArray.put(i, this.f15787o[iM147267j]);
        return true;
    }

    /* JADX INFO: renamed from: v */
    private boolean m21000v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        return m20999u(motionEvent.getPointerId(actionIndex), motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
    }

    /* JADX INFO: renamed from: w */
    private void m21001w() {
        C4358a c4358a = this.f15787o[0];
        RectF rectF = this.f15800e;
        c4358a.m21007c(rectF.left, rectF.top);
        C4358a c4358a2 = this.f15787o[3];
        RectF rectF2 = this.f15800e;
        c4358a2.m21007c(rectF2.right, rectF2.bottom);
    }

    /* JADX INFO: renamed from: x */
    private void m21002x() {
        this.f15800e.set(this.f15787o[0].m21008d(), this.f15787o[0].m21009e(), this.f15787o[3].m21008d(), this.f15787o[3].m21009e());
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, p149l.zu5
    /* JADX INFO: renamed from: a */
    public void mo20918a() {
        super.mo20918a();
        m20996q();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, p149l.de50
    /* JADX INFO: renamed from: b */
    public void mo20919b(RectF rectF) {
        super.mo20919b(rectF);
        m20996q();
        invalidate();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: d */
    public void mo20920d(nub nubVar) {
        super.mo20920d(nubVar);
        this.f15788p = new SparseArray<>();
        this.f15787o = new C4358a[4];
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: g */
    public boolean mo20922g() {
        return this.f15788p.size() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a A[PHI: r5
      0x007a: PHI (r5v3 int) = (r5v0 int), (r5v1 int) binds: [B:24:0x0078, B:27:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo20913o() {
        j11 aspectRatio;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null || aspectRatio.m139217b() == 0.0f) {
            return;
        }
        if (this.f15800e.width() == 0.0f || this.f15800e.height() == 0.0f || Math.abs((this.f15800e.width() / this.f15800e.height()) - aspectRatio.m139217b()) >= 0.001d) {
            float fM161472p = this.f15802g.m161472p();
            int i = this.f15805j;
            float f = i > 0 ? (fM161472p / i) * this.f15806k : -1.0f;
            float f2 = measuredHeight * 0.5f;
            float f3 = measuredWidth * 0.5f;
            float f4 = fM161472p * 0.5f;
            int i2 = this.f15789q;
            if (f < i2) {
                f = i2;
            } else {
                i2 = this.f15790r;
                if (f > i2) {
                    f = i2;
                }
            }
            float f5 = f * 0.5f;
            this.f15800e.set(f3 - f4, f2 - f5, f3 + f4, f2 + f5);
        }
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f15803h) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m21000v(motionEvent);
        } else if (actionMasked == 1) {
            m20997s();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                return super.onTouchEvent(motionEvent);
            }
            m20997s();
        } else {
            m20998t(motionEvent);
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final float m21003p(C4358a c4358a, float f) {
        float fAbs = Math.abs(f - c4358a.f15794c.y);
        if (this.f15789q <= fAbs && fAbs <= this.f15790r) {
            return f;
        }
        if (f < c4358a.f15794c.y) {
            return f < c4358a.m21009e() ? c4358a.f15794c.y - this.f15790r : c4358a.f15794c.y - this.f15789q;
        }
        return f < c4358a.m21009e() ? c4358a.f15794c.y + this.f15789q : c4358a.f15794c.y + this.f15790r;
    }

    /* JADX INFO: renamed from: r */
    public void m21004r(RectF rectF) {
        float height = (getHeight() / 2.0f) - rectF.centerY();
        RectF rectF2 = this.f15800e;
        rectF2.set(rectF2.left, rectF2.top + height, rectF2.right, rectF2.bottom + height);
        m21001w();
        postInvalidate();
    }
}
