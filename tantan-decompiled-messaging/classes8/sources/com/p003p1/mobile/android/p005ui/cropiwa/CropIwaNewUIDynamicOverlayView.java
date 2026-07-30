package com.p003p1.mobile.android.p005ui.cropiwa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import l.t100;
import p007l.j11;
import p007l.kub;
import p007l.nub;
import p007l.sub;
import p007l.t0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@SuppressLint({"ViewConstructor"})
class CropIwaNewUIDynamicOverlayView extends CropIwaOverlayView {

    /* JADX INFO: renamed from: o */
    public C0270a[] f1486o;

    /* JADX INFO: renamed from: p */
    public SparseArray<C0270a> f1487p;

    /* JADX INFO: renamed from: q */
    public int f1488q;

    /* JADX INFO: renamed from: r */
    public int f1489r;

    /* JADX INFO: renamed from: s */
    public kub f1490s;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaNewUIDynamicOverlayView$a */
    public class C0270a {

        /* JADX INFO: renamed from: a */
        public PointF f1491a;

        /* JADX INFO: renamed from: b */
        public PointF f1492b;

        /* JADX INFO: renamed from: c */
        public PointF f1493c;

        public C0270a(PointF pointF, PointF pointF2, PointF pointF3) {
            this.f1491a = pointF;
            this.f1492b = pointF2;
            this.f1493c = pointF3;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a A[PHI: r3
          0x001a: PHI (r3v4 float) = (r3v2 float), (r3v5 float) binds: [B:13:0x0021, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: b */
        public final float m1278b(float f, float f2, float f3, int i) {
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
        public void m1279c(float f, float f2) {
            float fM1278b = m1278b(this.f1491a.x, f, this.f1492b.x, CropIwaNewUIDynamicOverlayView.this.f1501g.m10125n());
            PointF pointF = this.f1491a;
            pointF.x = fM1278b;
            PointF pointF2 = this.f1493c;
            pointF2.x = fM1278b;
            float fM1278b2 = m1278b(pointF.y, f2, pointF2.y, CropIwaNewUIDynamicOverlayView.this.f1501g.m10124m());
            this.f1491a.y = fM1278b2;
            this.f1492b.y = fM1278b2;
        }

        /* JADX INFO: renamed from: d */
        public float m1280d() {
            return this.f1491a.x;
        }

        /* JADX INFO: renamed from: e */
        public float m1281e() {
            return this.f1491a.y;
        }

        public String toString() {
            return this.f1491a.toString();
        }
    }

    public CropIwaNewUIDynamicOverlayView(Context context, nub nubVar) {
        super(context, nubVar);
        this.f1488q = t100.d(241.0f);
        this.f1489r = t100.d(556.0f);
        this.f1490s = (kub) this.f1497c;
    }

    /* JADX INFO: renamed from: q */
    private void m1268q() {
        if (this.f1499e.width() <= 0.0f || this.f1499e.height() <= 0.0f) {
            return;
        }
        if (!sub.m10730g(Arrays.asList(this.f1486o))) {
            m1273w();
            return;
        }
        RectF rectF = this.f1499e;
        PointF pointF = new PointF(rectF.left, rectF.top);
        RectF rectF2 = this.f1499e;
        PointF pointF2 = new PointF(rectF2.left, rectF2.bottom);
        RectF rectF3 = this.f1499e;
        PointF pointF3 = new PointF(rectF3.right, rectF3.top);
        RectF rectF4 = this.f1499e;
        PointF pointF4 = new PointF(rectF4.right, rectF4.bottom);
        this.f1486o[0] = new C0270a(pointF, pointF3, pointF2);
        this.f1486o[2] = new C0270a(pointF2, pointF4, pointF);
        this.f1486o[1] = new C0270a(pointF3, pointF, pointF4);
        this.f1486o[3] = new C0270a(pointF4, pointF2, pointF3);
    }

    /* JADX INFO: renamed from: s */
    private void m1269s() {
        this.f1495a.setColor(this.f1501g.m10126o());
        if (NullChecker.a(this.f1503i)) {
            this.f1503i.mo10252a(this.f1499e);
        }
        m1276r(this.f1499e);
        m1289m(true);
        this.f1487p.clear();
    }

    /* JADX INFO: renamed from: t */
    private void m1270t(MotionEvent motionEvent) {
        if (mo1194g()) {
            this.f1495a.setColor(getResources().getColor(t0c0.f4215E));
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                C0270a c0270a = this.f1487p.get(motionEvent.getPointerId(i));
                if (c0270a != null) {
                    c0270a.m1279c(c0270a.m1280d(), m1275p(c0270a, motionEvent.getY(i)));
                }
            }
            m1274x();
            if (this.f1487p.size() > 0) {
                m1289m(true);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m1271u(int i, float f, float f2) {
        int iM9613j = this.f1490s.m9613j(f, f2);
        if (iM9613j == -1) {
            return false;
        }
        if (iM9613j == 4) {
            this.f1487p.put(i, this.f1486o[0]);
            return true;
        }
        SparseArray<C0270a> sparseArray = this.f1487p;
        if (iM9613j == 5) {
            sparseArray.put(i, this.f1486o[3]);
            return true;
        }
        sparseArray.put(i, this.f1486o[iM9613j]);
        return true;
    }

    /* JADX INFO: renamed from: v */
    private boolean m1272v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        return m1271u(motionEvent.getPointerId(actionIndex), motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
    }

    /* JADX INFO: renamed from: w */
    private void m1273w() {
        C0270a c0270a = this.f1486o[0];
        RectF rectF = this.f1499e;
        c0270a.m1279c(rectF.left, rectF.top);
        C0270a c0270a2 = this.f1486o[3];
        RectF rectF2 = this.f1499e;
        c0270a2.m1279c(rectF2.right, rectF2.bottom);
    }

    /* JADX INFO: renamed from: x */
    private void m1274x() {
        this.f1499e.set(this.f1486o[0].m1280d(), this.f1486o[0].m1281e(), this.f1486o[3].m1280d(), this.f1486o[3].m1281e());
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, p007l.zu5
    /* JADX INFO: renamed from: a */
    public void mo1190a() {
        super.mo1190a();
        m1268q();
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, p007l.de50
    /* JADX INFO: renamed from: b */
    public void mo1191b(RectF rectF) {
        super.mo1191b(rectF);
        m1268q();
        invalidate();
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: d */
    public void mo1192d(nub nubVar) {
        super.mo1192d(nubVar);
        this.f1487p = new SparseArray<>();
        this.f1486o = new C0270a[4];
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: g */
    public boolean mo1194g() {
        return this.f1487p.size() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a A[PHI: r5
      0x007a: PHI (r5v3 int) = (r5v0 int), (r5v1 int) binds: [B:24:0x0078, B:27:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo1185o() {
        j11 aspectRatio;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null || aspectRatio.m9452b() == 0.0f) {
            return;
        }
        if (this.f1499e.width() == 0.0f || this.f1499e.height() == 0.0f || Math.abs((this.f1499e.width() / this.f1499e.height()) - aspectRatio.m9452b()) >= 0.001d) {
            float fM10127p = this.f1501g.m10127p();
            int i = this.f1504j;
            float f = i > 0 ? (fM10127p / i) * this.f1505k : -1.0f;
            float f2 = measuredHeight * 0.5f;
            float f3 = measuredWidth * 0.5f;
            float f4 = fM10127p * 0.5f;
            int i2 = this.f1488q;
            if (f < i2) {
                f = i2;
            } else {
                i2 = this.f1489r;
                if (f > i2) {
                    f = i2;
                }
            }
            float f5 = f * 0.5f;
            this.f1499e.set(f3 - f4, f2 - f5, f3 + f4, f2 + f5);
        }
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1502h) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1272v(motionEvent);
        } else if (actionMasked == 1) {
            m1269s();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                return super.onTouchEvent(motionEvent);
            }
            m1269s();
        } else {
            m1270t(motionEvent);
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final float m1275p(C0270a c0270a, float f) {
        float fAbs = Math.abs(f - c0270a.f1493c.y);
        if (this.f1488q <= fAbs && fAbs <= this.f1489r) {
            return f;
        }
        if (f < c0270a.f1493c.y) {
            return f < c0270a.m1281e() ? c0270a.f1493c.y - this.f1489r : c0270a.f1493c.y - this.f1488q;
        }
        return f < c0270a.m1281e() ? c0270a.f1493c.y + this.f1488q : c0270a.f1493c.y + this.f1489r;
    }

    /* JADX INFO: renamed from: r */
    public void m1276r(RectF rectF) {
        float height = (getHeight() / 2.0f) - rectF.centerY();
        RectF rectF2 = this.f1499e;
        rectF2.set(rectF2.left, rectF2.top + height, rectF2.right, rectF2.bottom + height);
        m1273w();
        postInvalidate();
    }
}
