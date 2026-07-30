package com.p003p1.mobile.android.p005ui.cropiwa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import java.lang.reflect.Array;
import java.util.Arrays;
import p007l.nub;
import p007l.rub;
import p007l.sub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@SuppressLint({"ViewConstructor"})
class CropIwaDynamicOverlayView extends CropIwaOverlayView {

    /* JADX INFO: renamed from: t */
    public static final float f1454t = sub.m10728e(24);

    /* JADX INFO: renamed from: o */
    public float[][] f1455o;

    /* JADX INFO: renamed from: p */
    public C0265a[] f1456p;

    /* JADX INFO: renamed from: q */
    public SparseArray<C0265a> f1457q;

    /* JADX INFO: renamed from: r */
    public PointF f1458r;

    /* JADX INFO: renamed from: s */
    public RectF f1459s;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaDynamicOverlayView$a */
    public class C0265a {

        /* JADX INFO: renamed from: a */
        public RectF f1460a = new RectF();

        /* JADX INFO: renamed from: b */
        public PointF f1461b;

        /* JADX INFO: renamed from: c */
        public PointF f1462c;

        /* JADX INFO: renamed from: d */
        public PointF f1463d;

        public C0265a(PointF pointF, PointF pointF2, PointF pointF3) {
            this.f1461b = pointF;
            this.f1462c = pointF2;
            this.f1463d = pointF3;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a A[PHI: r3
          0x001a: PHI (r3v4 float) = (r3v2 float), (r3v5 float) binds: [B:13:0x0021, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: a */
        public final float m1205a(float f, float f2, float f3, int i) {
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
        public boolean m1206b(float f, float f2) {
            RectF rectF = this.f1460a;
            PointF pointF = this.f1461b;
            float f3 = pointF.x;
            float f4 = pointF.y;
            rectF.set(f3, f4, f3, f4);
            sub.m10729f(CropIwaDynamicOverlayView.f1454t, this.f1460a);
            return this.f1460a.contains(f, f2);
        }

        /* JADX INFO: renamed from: c */
        public boolean m1207c() {
            PointF pointF = this.f1461b;
            float f = pointF.x;
            PointF pointF2 = this.f1463d;
            float f2 = pointF2.x;
            if (f == f2) {
                float f3 = pointF.y;
                if (f3 < pointF2.y) {
                    PointF pointF3 = this.f1462c;
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
            PointF pointF4 = this.f1462c;
            return f4 == pointF4.y && f > pointF4.x;
        }

        /* JADX INFO: renamed from: d */
        public boolean m1208d() {
            return Math.abs(this.f1461b.x - this.f1462c.x) >= ((float) CropIwaDynamicOverlayView.this.f1501g.m10125n());
        }

        /* JADX INFO: renamed from: e */
        public void m1209e(float f, float f2) {
            float fM1205a = m1205a(this.f1461b.x, f, this.f1462c.x, CropIwaDynamicOverlayView.this.f1501g.m10125n());
            PointF pointF = this.f1461b;
            pointF.x = fM1205a;
            PointF pointF2 = this.f1463d;
            pointF2.x = fM1205a;
            float fM1205a2 = m1205a(pointF.y, f2, pointF2.y, CropIwaDynamicOverlayView.this.f1501g.m10124m());
            this.f1461b.y = fM1205a2;
            this.f1462c.y = fM1205a2;
        }

        /* JADX INFO: renamed from: f */
        public float m1210f() {
            return this.f1461b.x;
        }

        /* JADX INFO: renamed from: g */
        public float m1211g() {
            return this.f1461b.y;
        }

        public String toString() {
            return this.f1461b.toString();
        }
    }

    public CropIwaDynamicOverlayView(Context context, nub nubVar) {
        super(context, nubVar);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m1187A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        return m1204z(motionEvent.getPointerId(actionIndex), motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
    }

    /* JADX INFO: renamed from: B */
    public final void m1188B() {
        C0265a c0265a = this.f1456p[0];
        RectF rectF = this.f1499e;
        c0265a.m1209e(rectF.left, rectF.top);
        C0265a c0265a2 = this.f1456p[3];
        RectF rectF2 = this.f1499e;
        c0265a2.m1209e(rectF2.right, rectF2.bottom);
    }

    /* JADX INFO: renamed from: C */
    public void m1189C() {
        this.f1499e.set(this.f1456p[0].m1210f(), this.f1456p[0].m1211g(), this.f1456p[3].m1210f(), this.f1456p[3].m1211g());
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, p007l.zu5
    /* JADX INFO: renamed from: a */
    public void mo1190a() {
        super.mo1190a();
        m1197s();
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, p007l.de50
    /* JADX INFO: renamed from: b */
    public void mo1191b(RectF rectF) {
        super.mo1191b(rectF);
        m1197s();
        invalidate();
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: d */
    public void mo1192d(nub nubVar) {
        super.mo1192d(nubVar);
        this.f1457q = new SparseArray<>();
        this.f1456p = new C0265a[4];
        this.f1455o = m1196r(Math.min(nubVar.m10125n(), nubVar.m10124m()) * 0.3f);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: e */
    public boolean mo1193e() {
        return this.f1458r != null;
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: g */
    public boolean mo1194g() {
        return this.f1457q.size() != 0;
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f1502h) {
            return;
        }
        super.onDraw(canvas);
        if (!m1195q()) {
            return;
        }
        rub rubVarM10121j = this.f1501g.m10121j();
        int i = 0;
        while (true) {
            C0265a[] c0265aArr = this.f1456p;
            if (i >= c0265aArr.length) {
                return;
            }
            float fM1210f = c0265aArr[i].m1210f();
            float fM1211g = this.f1456p[i].m1211g();
            float[] fArr = this.f1455o[i];
            rubVarM10121j.mo9612e(canvas, fM1210f, fM1211g, fArr[0], fArr[1]);
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0028  */
    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1502h) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo1203y(motionEvent);
        } else if (actionMasked == 1) {
            mo1199u();
        } else if (actionMasked == 2) {
            mo1201w(motionEvent);
        } else if (actionMasked == 3) {
            mo1199u();
        } else if (actionMasked == 5) {
            m1200v(motionEvent);
        } else {
            if (actionMasked != 6) {
                return false;
            }
            m1202x(motionEvent);
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1195q() {
        C0265a c0265a = this.f1456p[0];
        return c0265a != null && c0265a.m1208d();
    }

    /* JADX INFO: renamed from: r */
    public final float[][] m1196r(float f) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
        fArr[0] = new float[]{f, f};
        float f2 = -f;
        fArr[2] = new float[]{f, f2};
        fArr[1] = new float[]{f2, f};
        fArr[3] = new float[]{f2, f2};
        return fArr;
    }

    /* JADX INFO: renamed from: s */
    public final void m1197s() {
        if (this.f1499e.width() <= 0.0f || this.f1499e.height() <= 0.0f) {
            return;
        }
        if (!sub.m10730g(Arrays.asList(this.f1456p))) {
            m1188B();
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
        this.f1456p[0] = new C0265a(pointF, pointF3, pointF2);
        this.f1456p[2] = new C0265a(pointF2, pointF4, pointF);
        this.f1456p[1] = new C0265a(pointF3, pointF, pointF4);
        this.f1456p[3] = new C0265a(pointF4, pointF2, pointF3);
    }

    /* JADX INFO: renamed from: t */
    public boolean mo1198t() {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void mo1199u() {
        RectF rectF = this.f1459s;
        if (rectF != null && !rectF.equals(this.f1499e)) {
            m1288l();
        }
        if (this.f1457q.size() > 0) {
            m1288l();
        }
        this.f1457q.clear();
        this.f1458r = null;
        this.f1459s = null;
    }

    /* JADX INFO: renamed from: v */
    public final void m1200v(MotionEvent motionEvent) {
        if (mo1194g()) {
            m1187A(motionEvent);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo1201w(MotionEvent motionEvent) {
        if (!mo1194g()) {
            if (mo1193e()) {
                this.f1499e = sub.m10731h(this.f1459s, motionEvent.getX() - this.f1458r.x, motionEvent.getY() - this.f1458r.y, getWidth(), getHeight(), this.f1499e);
                m1188B();
                return;
            }
            return;
        }
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            C0265a c0265a = this.f1457q.get(motionEvent.getPointerId(i));
            if (c0265a != null) {
                c0265a.m1209e(sub.m10724a(motionEvent.getX(i), 0.0f, getWidth()), sub.m10724a(motionEvent.getY(i), 0.0f, getHeight()));
            }
        }
        m1189C();
    }

    /* JADX INFO: renamed from: x */
    public final void m1202x(MotionEvent motionEvent) {
        this.f1457q.remove(motionEvent.getPointerId(motionEvent.getActionIndex()));
    }

    /* JADX INFO: renamed from: y */
    public void mo1203y(MotionEvent motionEvent) {
        if (m1187A(motionEvent)) {
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (mo1198t() && this.f1499e.contains(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex))) {
            this.f1458r = new PointF(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
            this.f1459s = new RectF(this.f1499e);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1204z(int i, float f, float f2) {
        for (C0265a c0265a : this.f1456p) {
            if (c0265a.m1206b(f, f2)) {
                this.f1457q.put(i, c0265a);
                return true;
            }
        }
        return false;
    }
}
