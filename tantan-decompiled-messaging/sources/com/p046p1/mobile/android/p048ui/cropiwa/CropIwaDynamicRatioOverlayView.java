package com.p046p1.mobile.android.p048ui.cropiwa;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p149l.j11;
import p149l.nub;
import p149l.sub;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaDynamicRatioOverlayView extends CropIwaDynamicOverlayView {

    /* JADX INFO: renamed from: u */
    public PointF f15766u;

    public CropIwaDynamicRatioOverlayView(Context context, nub nubVar) {
        super(context, nubVar);
    }

    /* JADX INFO: renamed from: E */
    public final float m20941E(float f, float f2) {
        return f > 0.0f ? Math.min(f, f2) : Math.max(f, -f2);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m20942F() {
        mo20919b(this.f15800e);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaDynamicOverlayView, com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, p149l.zu5
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo20918a() {
        super.mo20918a();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaDynamicOverlayView, com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, p149l.de50
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo20919b(RectF rectF) {
        super.mo20919b(rectF);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaDynamicOverlayView, com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo20921e() {
        return super.mo20921e();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaDynamicOverlayView, com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo20922g() {
        return super.mo20922g();
    }

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
            float f = measuredHeight * 0.5f;
            float f2 = measuredWidth * 0.5f;
            float fM161472p = this.f15802g.m161472p() * 0.5f;
            float fM139217b = fM161472p / aspectRatio.m139217b();
            this.f15800e.set(f2 - fM161472p, f - fM139217b, f2 + fM161472p, f + fM139217b);
            if (NullChecker.m81303a(this.f15801f) && this.f15801f.isEmpty()) {
                this.f15801f.set(this.f15800e);
            }
        }
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaDynamicOverlayView, com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: t */
    public boolean mo20926t() {
        return false;
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: u */
    public void mo20927u() {
        if (!this.f15800e.equals(this.f15801f)) {
            m21018n();
            this.f15800e.set(this.f15801f);
            postDelayed(new Runnable() { // from class: l.gub
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104386a.m20942F();
                }
            }, 50L);
        }
        super.mo20927u();
        this.f15766u = null;
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: w */
    public void mo20929w(MotionEvent motionEvent) {
        float f;
        float fM20941E;
        if (m21012h() && mo20922g()) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                CropIwaDynamicOverlayView.C4353a c4353a = this.f15758q.get(motionEvent.getPointerId(i));
                if (c4353a != null && this.f15766u != null) {
                    float x = motionEvent.getX(i) - this.f15766u.x;
                    float y = motionEvent.getY(i) - this.f15766u.y;
                    float fM139217b = getAspectRatio() != null ? getAspectRatio().m139217b() : 1.0f;
                    float remainScale = getRemainScale();
                    float fWidth = this.f15801f.width() - (this.f15801f.width() / remainScale);
                    float fHeight = this.f15801f.height() - (this.f15801f.height() / remainScale);
                    if (Math.abs(y) > Math.abs(x)) {
                        fM20941E = m20941E(y, fHeight);
                        f = c4353a.m20935c() ? fM139217b * fM20941E : fM139217b * (-fM20941E);
                    } else {
                        float fM20941E2 = m20941E(x, fWidth);
                        float f2 = c4353a.m20935c() ? fM20941E2 / fM139217b : (-fM20941E2) / fM139217b;
                        f = fM20941E2;
                        fM20941E = f2;
                    }
                    float f3 = this.f15766u.x + f;
                    RectF rectF = this.f15801f;
                    float fM186004a = sub.m186004a(f3, rectF.left, rectF.right);
                    float f4 = this.f15766u.y + fM20941E;
                    RectF rectF2 = this.f15801f;
                    c4353a.m20937e(fM186004a, sub.m186004a(f4, rectF2.top, rectF2.bottom));
                }
            }
            m20917C();
        }
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: y */
    public void mo20931y(MotionEvent motionEvent) {
        super.mo20931y(motionEvent);
        this.f15766u = new PointF(motionEvent.getX(), motionEvent.getY());
    }
}
