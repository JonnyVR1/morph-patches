package com.p051p1.mobile.android.p053ui.cropiwa;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p153l.bwb;
import p153l.gwb;
import p153l.q11;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaDynamicRatioOverlayView extends CropIwaDynamicOverlayView {

    /* JADX INFO: renamed from: u */
    public PointF f16485u;

    public CropIwaDynamicRatioOverlayView(Context context, bwb bwbVar) {
        super(context, bwbVar);
    }

    /* JADX INFO: renamed from: E */
    public final float m21940E(float f, float f2) {
        return f > 0.0f ? Math.min(f, f2) : Math.max(f, -f2);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m21941F() {
        mo21918b(this.f16519e);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaDynamicOverlayView, com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, p153l.dw5
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo21917a() {
        super.mo21917a();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaDynamicOverlayView, com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, p153l.km50
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo21918b(RectF rectF) {
        super.mo21918b(rectF);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaDynamicOverlayView, com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo21920e() {
        return super.mo21920e();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaDynamicOverlayView, com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo21921g() {
        return super.mo21921g();
    }

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
            float f = measuredHeight * 0.5f;
            float f2 = measuredWidth * 0.5f;
            float fM106680p = this.f16521g.m106680p() * 0.5f;
            float fM174804b = fM106680p / aspectRatio.m174804b();
            this.f16519e.set(f2 - fM106680p, f - fM174804b, f2 + fM106680p, f + fM174804b);
            if (NullChecker.m82486a(this.f16520f) && this.f16520f.isEmpty()) {
                this.f16520f.set(this.f16519e);
            }
        }
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaDynamicOverlayView, com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: t */
    public boolean mo21925t() {
        return false;
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: u */
    public void mo21926u() {
        if (!this.f16519e.equals(this.f16520f)) {
            m22017n();
            this.f16519e.set(this.f16520f);
            postDelayed(new Runnable() { // from class: l.uvb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181134a.m21941F();
                }
            }, 50L);
        }
        super.mo21926u();
        this.f16485u = null;
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: w */
    public void mo21928w(MotionEvent motionEvent) {
        float f;
        float fM21940E;
        if (m22011h() && mo21921g()) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                CropIwaDynamicOverlayView.C4504a c4504a = this.f16477q.get(motionEvent.getPointerId(i));
                if (c4504a != null && this.f16485u != null) {
                    float x = motionEvent.getX(i) - this.f16485u.x;
                    float y = motionEvent.getY(i) - this.f16485u.y;
                    float fM174804b = getAspectRatio() != null ? getAspectRatio().m174804b() : 1.0f;
                    float remainScale = getRemainScale();
                    float fWidth = this.f16520f.width() - (this.f16520f.width() / remainScale);
                    float fHeight = this.f16520f.height() - (this.f16520f.height() / remainScale);
                    if (Math.abs(y) > Math.abs(x)) {
                        fM21940E = m21940E(y, fHeight);
                        f = c4504a.m21934c() ? fM174804b * fM21940E : fM174804b * (-fM21940E);
                    } else {
                        float fM21940E2 = m21940E(x, fWidth);
                        float f2 = c4504a.m21934c() ? fM21940E2 / fM174804b : (-fM21940E2) / fM174804b;
                        f = fM21940E2;
                        fM21940E = f2;
                    }
                    float f3 = this.f16485u.x + f;
                    RectF rectF = this.f16520f;
                    float fM132648a = gwb.m132648a(f3, rectF.left, rectF.right);
                    float f4 = this.f16485u.y + fM21940E;
                    RectF rectF2 = this.f16520f;
                    c4504a.m21936e(fM132648a, gwb.m132648a(f4, rectF2.top, rectF2.bottom));
                }
            }
            m21916C();
        }
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaDynamicOverlayView
    /* JADX INFO: renamed from: y */
    public void mo21930y(MotionEvent motionEvent) {
        super.mo21930y(motionEvent);
        this.f16485u = new PointF(motionEvent.getX(), motionEvent.getY());
    }
}
