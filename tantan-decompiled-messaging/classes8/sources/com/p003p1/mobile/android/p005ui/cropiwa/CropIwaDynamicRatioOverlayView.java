package com.p003p1.mobile.android.p005ui.cropiwa;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p007l.j11;
import p007l.nub;
import p007l.sub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CropIwaDynamicRatioOverlayView extends CropIwaDynamicOverlayView {

    /* JADX INFO: renamed from: u */
    public PointF f1465u;

    public CropIwaDynamicRatioOverlayView(Context context, nub nubVar) {
        super(context, nubVar);
    }

    /* JADX INFO: renamed from: E */
    public final float m1213E(float f, float f2) {
        return f > 0.0f ? Math.min(f, f2) : Math.max(f, -f2);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m1214F() {
        mo1191b(this.f1499e);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaDynamicOverlayView, com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, p007l.zu5
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo1190a() {
        super.mo1190a();
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaDynamicOverlayView, com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, p007l.de50
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo1191b(RectF rectF) {
        super.mo1191b(rectF);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaDynamicOverlayView, com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo1193e() {
        return super.mo1193e();
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaDynamicOverlayView, com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo1194g() {
        return super.mo1194g();
    }

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
            float f = measuredHeight * 0.5f;
            float f2 = measuredWidth * 0.5f;
            float fM10127p = this.f1501g.m10127p() * 0.5f;
            float fM9452b = fM10127p / aspectRatio.m9452b();
            this.f1499e.set(f2 - fM10127p, f - fM9452b, f2 + fM10127p, f + fM9452b);
            if (NullChecker.a(this.f1500f) && this.f1500f.isEmpty()) {
                this.f1500f.set(this.f1499e);
            }
        }
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaDynamicOverlayView, com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: t */
    public boolean mo1198t() {
        return false;
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: u */
    public void mo1199u() {
        if (!this.f1499e.equals(this.f1500f)) {
            m1290n();
            this.f1499e.set(this.f1500f);
            postDelayed(new Runnable() { // from class: l.gub
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2797a.m1214F();
                }
            }, 50L);
        }
        super.mo1199u();
        this.f1465u = null;
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: w */
    public void mo1201w(MotionEvent motionEvent) {
        float f;
        float fM1213E;
        if (m1284h() && mo1194g()) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                CropIwaDynamicOverlayView.C0265a c0265a = this.f1457q.get(motionEvent.getPointerId(i));
                if (c0265a != null && this.f1465u != null) {
                    float x = motionEvent.getX(i) - this.f1465u.x;
                    float y = motionEvent.getY(i) - this.f1465u.y;
                    float fM9452b = getAspectRatio() != null ? getAspectRatio().m9452b() : 1.0f;
                    float remainScale = getRemainScale();
                    float fWidth = this.f1500f.width() - (this.f1500f.width() / remainScale);
                    float fHeight = this.f1500f.height() - (this.f1500f.height() / remainScale);
                    if (Math.abs(y) > Math.abs(x)) {
                        fM1213E = m1213E(y, fHeight);
                        f = c0265a.m1207c() ? fM9452b * fM1213E : fM9452b * (-fM1213E);
                    } else {
                        float fM1213E2 = m1213E(x, fWidth);
                        float f2 = c0265a.m1207c() ? fM1213E2 / fM9452b : (-fM1213E2) / fM9452b;
                        f = fM1213E2;
                        fM1213E = f2;
                    }
                    float f3 = this.f1465u.x + f;
                    RectF rectF = this.f1500f;
                    float fM10724a = sub.m10724a(f3, rectF.left, rectF.right);
                    float f4 = this.f1465u.y + fM1213E;
                    RectF rectF2 = this.f1500f;
                    c0265a.m1209e(fM10724a, sub.m10724a(f4, rectF2.top, rectF2.bottom));
                }
            }
            m1189C();
        }
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: y */
    public void mo1203y(MotionEvent motionEvent) {
        super.mo1203y(motionEvent);
        this.f1465u = new PointF(motionEvent.getX(), motionEvent.getY());
    }
}
