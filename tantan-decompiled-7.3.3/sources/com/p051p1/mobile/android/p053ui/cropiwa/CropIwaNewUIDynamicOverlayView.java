package com.p051p1.mobile.android.p053ui.cropiwa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import p153l.bwb;
import p153l.gwb;
import p153l.q11;
import p153l.qa00;
import p153l.yvb;
import p153l.z8c0;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
class CropIwaNewUIDynamicOverlayView extends CropIwaOverlayView {

    /* JADX INFO: renamed from: o */
    public C4509a[] f16506o;

    /* JADX INFO: renamed from: p */
    public SparseArray<C4509a> f16507p;

    /* JADX INFO: renamed from: q */
    public int f16508q;

    /* JADX INFO: renamed from: r */
    public int f16509r;

    /* JADX INFO: renamed from: s */
    public yvb f16510s;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaNewUIDynamicOverlayView$a */
    public class C4509a {

        /* JADX INFO: renamed from: a */
        public PointF f16511a;

        /* JADX INFO: renamed from: b */
        public PointF f16512b;

        /* JADX INFO: renamed from: c */
        public PointF f16513c;

        public C4509a(PointF pointF, PointF pointF2, PointF pointF3) {
            this.f16511a = pointF;
            this.f16512b = pointF2;
            this.f16513c = pointF3;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a A[PHI: r3
          0x001a: PHI (r3v4 float) = (r3v2 float), (r3v5 float) binds: [B:13:0x0021, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: b */
        public final float m22005b(float f, float f2, float f3, int i) {
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
        public void m22006c(float f, float f2) {
            float fM22005b = m22005b(this.f16511a.x, f, this.f16512b.x, CropIwaNewUIDynamicOverlayView.this.f16521g.m106678n());
            PointF pointF = this.f16511a;
            pointF.x = fM22005b;
            PointF pointF2 = this.f16513c;
            pointF2.x = fM22005b;
            float fM22005b2 = m22005b(pointF.y, f2, pointF2.y, CropIwaNewUIDynamicOverlayView.this.f16521g.m106677m());
            this.f16511a.y = fM22005b2;
            this.f16512b.y = fM22005b2;
        }

        /* JADX INFO: renamed from: d */
        public float m22007d() {
            return this.f16511a.x;
        }

        /* JADX INFO: renamed from: e */
        public float m22008e() {
            return this.f16511a.y;
        }

        public String toString() {
            return this.f16511a.toString();
        }
    }

    public CropIwaNewUIDynamicOverlayView(Context context, bwb bwbVar) {
        super(context, bwbVar);
        this.f16508q = qa00.m175859d(241.0f);
        this.f16509r = qa00.m175859d(556.0f);
        this.f16510s = (yvb) this.f16517c;
    }

    /* JADX INFO: renamed from: q */
    private void m21995q() {
        if (this.f16519e.width() <= 0.0f || this.f16519e.height() <= 0.0f) {
            return;
        }
        if (!gwb.m132654g(Arrays.asList(this.f16506o))) {
            m22000w();
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
        this.f16506o[0] = new C4509a(pointF, pointF3, pointF2);
        this.f16506o[2] = new C4509a(pointF2, pointF4, pointF);
        this.f16506o[1] = new C4509a(pointF3, pointF, pointF4);
        this.f16506o[3] = new C4509a(pointF4, pointF2, pointF3);
    }

    /* JADX INFO: renamed from: s */
    private void m21996s() {
        this.f16515a.setColor(this.f16521g.m106679o());
        if (NullChecker.m82486a(this.f16523i)) {
            this.f16523i.mo147160a(this.f16519e);
        }
        m22003r(this.f16519e);
        m22016m(true);
        this.f16507p.clear();
    }

    /* JADX INFO: renamed from: t */
    private void m21997t(MotionEvent motionEvent) {
        if (mo21921g()) {
            this.f16515a.setColor(getResources().getColor(z8c0.f203338E));
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                C4509a c4509a = this.f16507p.get(motionEvent.getPointerId(i));
                if (c4509a != null) {
                    c4509a.m22006c(c4509a.m22007d(), m22002p(c4509a, motionEvent.getY(i)));
                }
            }
            m22001x();
            if (this.f16507p.size() > 0) {
                m22016m(true);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m21998u(int i, float f, float f2) {
        int iM217485j = this.f16510s.m217485j(f, f2);
        if (iM217485j == -1) {
            return false;
        }
        if (iM217485j == 4) {
            this.f16507p.put(i, this.f16506o[0]);
            return true;
        }
        SparseArray<C4509a> sparseArray = this.f16507p;
        if (iM217485j == 5) {
            sparseArray.put(i, this.f16506o[3]);
            return true;
        }
        sparseArray.put(i, this.f16506o[iM217485j]);
        return true;
    }

    /* JADX INFO: renamed from: v */
    private boolean m21999v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        return m21998u(motionEvent.getPointerId(actionIndex), motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
    }

    /* JADX INFO: renamed from: w */
    private void m22000w() {
        C4509a c4509a = this.f16506o[0];
        RectF rectF = this.f16519e;
        c4509a.m22006c(rectF.left, rectF.top);
        C4509a c4509a2 = this.f16506o[3];
        RectF rectF2 = this.f16519e;
        c4509a2.m22006c(rectF2.right, rectF2.bottom);
    }

    /* JADX INFO: renamed from: x */
    private void m22001x() {
        this.f16519e.set(this.f16506o[0].m22007d(), this.f16506o[0].m22008e(), this.f16506o[3].m22007d(), this.f16506o[3].m22008e());
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, p153l.dw5
    /* JADX INFO: renamed from: a */
    public void mo21917a() {
        super.mo21917a();
        m21995q();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, p153l.km50
    /* JADX INFO: renamed from: b */
    public void mo21918b(RectF rectF) {
        super.mo21918b(rectF);
        m21995q();
        invalidate();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: d */
    public void mo21919d(bwb bwbVar) {
        super.mo21919d(bwbVar);
        this.f16507p = new SparseArray<>();
        this.f16506o = new C4509a[4];
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: g */
    public boolean mo21921g() {
        return this.f16507p.size() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a A[PHI: r5
      0x007a: PHI (r5v3 int) = (r5v0 int), (r5v1 int) binds: [B:24:0x0078, B:27:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo21912o() {
        q11 aspectRatio;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null || aspectRatio.m174804b() == 0.0f) {
            return;
        }
        if (this.f16519e.width() == 0.0f || this.f16519e.height() == 0.0f || Math.abs((this.f16519e.width() / this.f16519e.height()) - aspectRatio.m174804b()) >= 0.001d) {
            float fM106680p = this.f16521g.m106680p();
            int i = this.f16524j;
            float f = i > 0 ? (fM106680p / i) * this.f16525k : -1.0f;
            float f2 = measuredHeight * 0.5f;
            float f3 = measuredWidth * 0.5f;
            float f4 = fM106680p * 0.5f;
            int i2 = this.f16508q;
            if (f < i2) {
                f = i2;
            } else {
                i2 = this.f16509r;
                if (f > i2) {
                    f = i2;
                }
            }
            float f5 = f * 0.5f;
            this.f16519e.set(f3 - f4, f2 - f5, f3 + f4, f2 + f5);
        }
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f16522h) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m21999v(motionEvent);
        } else if (actionMasked == 1) {
            m21996s();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                return super.onTouchEvent(motionEvent);
            }
            m21996s();
        } else {
            m21997t(motionEvent);
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final float m22002p(C4509a c4509a, float f) {
        float fAbs = Math.abs(f - c4509a.f16513c.y);
        if (this.f16508q <= fAbs && fAbs <= this.f16509r) {
            return f;
        }
        if (f < c4509a.f16513c.y) {
            return f < c4509a.m22008e() ? c4509a.f16513c.y - this.f16509r : c4509a.f16513c.y - this.f16508q;
        }
        return f < c4509a.m22008e() ? c4509a.f16513c.y + this.f16508q : c4509a.f16513c.y + this.f16509r;
    }

    /* JADX INFO: renamed from: r */
    public void m22003r(RectF rectF) {
        float height = (getHeight() / 2.0f) - rectF.centerY();
        RectF rectF2 = this.f16519e;
        rectF2.set(rectF2.left, rectF2.top + height, rectF2.right, rectF2.bottom + height);
        m22000w();
        postInvalidate();
    }
}
