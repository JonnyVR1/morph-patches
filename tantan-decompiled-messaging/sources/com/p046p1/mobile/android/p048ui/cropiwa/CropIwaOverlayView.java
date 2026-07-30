package com.p046p1.mobile.android.p048ui.cropiwa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.de50;
import p149l.e30;
import p149l.j11;
import p149l.nub;
import p149l.pe50;
import p149l.qex;
import p149l.rub;
import p149l.se50;
import p149l.zu5;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
public class CropIwaOverlayView extends View implements zu5, de50 {

    /* JADX INFO: renamed from: a */
    public Paint f15796a;

    /* JADX INFO: renamed from: b */
    public se50 f15797b;

    /* JADX INFO: renamed from: c */
    public rub f15798c;

    /* JADX INFO: renamed from: d */
    public RectF f15799d;

    /* JADX INFO: renamed from: e */
    public RectF f15800e;

    /* JADX INFO: renamed from: f */
    public RectF f15801f;

    /* JADX INFO: renamed from: g */
    public nub f15802g;

    /* JADX INFO: renamed from: h */
    public boolean f15803h;

    /* JADX INFO: renamed from: i */
    public pe50 f15804i;

    /* JADX INFO: renamed from: j */
    public int f15805j;

    /* JADX INFO: renamed from: k */
    public int f15806k;

    /* JADX INFO: renamed from: l */
    public d30 f15807l;

    /* JADX INFO: renamed from: m */
    public float f15808m;

    /* JADX INFO: renamed from: n */
    public float f15809n;

    public CropIwaOverlayView(Context context, nub nubVar) {
        super(context);
        mo20920d(nubVar);
    }

    /* JADX INFO: renamed from: a */
    public void mo20918a() {
        this.f15796a.setColor(this.f15802g.m161471o());
        rub rubVarM161466j = this.f15802g.m161466j();
        this.f15798c = rubVarM161466j;
        rubVarM161466j.mo20918a();
        mo20913o();
        m21016l();
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public void mo20919b(RectF rectF) {
        this.f15799d.set(rectF);
        mo20913o();
        m21016l();
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public void mo20920d(nub nubVar) {
        this.f15802g = nubVar;
        nubVar.m161459a(this);
        this.f15799d = new RectF();
        this.f15798c = nubVar.m161466j();
        this.f15800e = new RectF();
        this.f15801f = new RectF();
        Paint paint = new Paint();
        this.f15796a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f15796a.setColor(nubVar.m161471o());
        setLayerType(1, null);
        if (getContext() instanceof Act) {
            ((Act) getContext()).duringCreated(qex.f154068b).subscribe(new e30() { // from class: l.oub
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145680a.m21015k((Float) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo20921e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21011f() {
        return this.f15803h;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo20922g() {
        return false;
    }

    @Nullable
    public j11 getAspectRatio() {
        j11 j11VarM161461e = this.f15802g.m161461e();
        if (j11VarM161461e != j11.f115729c) {
            return j11VarM161461e;
        }
        if (this.f15799d.width() == 0.0f || this.f15799d.height() == 0.0f) {
            return null;
        }
        return new j11(Math.round(this.f15799d.width()), Math.round(this.f15799d.height()));
    }

    public RectF getCropRect() {
        return new RectF(this.f15800e);
    }

    public float getRemainScale() {
        return this.f15808m / Math.max(1.0f, this.f15809n);
    }

    /* JADX INFO: renamed from: h */
    public boolean m21012h() {
        return this.f15809n < this.f15808m;
    }

    /* JADX INFO: renamed from: i */
    public boolean m21013i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m21014j() {
        return this.f15800e.width() >= ((float) this.f15802g.m161470n()) && this.f15800e.height() >= ((float) this.f15802g.m161469m());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m21015k(Float f) {
        this.f15809n = f.floatValue();
    }

    /* JADX INFO: renamed from: l */
    public void m21016l() {
        m21017m(false);
    }

    /* JADX INFO: renamed from: m */
    public void m21017m(boolean z) {
        if (this.f15797b != null) {
            this.f15797b.mo20975b(new RectF(this.f15800e), z);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m21018n() {
        if (NullChecker.m81303a(this.f15797b)) {
            this.f15797b.mo20976c(Math.min(Math.min(this.f15801f.height() / this.f15800e.height(), this.f15801f.width() / this.f15800e.width()), getRemainScale()), this.f15800e.centerX(), this.f15800e.centerY());
            if (NullChecker.m81303a(this.f15807l)) {
                this.f15807l.call();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo20913o() {
        j11 aspectRatio;
        float fM139217b;
        float fM139217b2;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null) {
            return;
        }
        if (this.f15800e.width() == 0.0f || this.f15800e.height() == 0.0f || Math.abs((this.f15800e.width() / this.f15800e.height()) - aspectRatio.m139217b()) >= 0.001d) {
            float f = measuredWidth * 0.5f;
            float f2 = measuredHeight * 0.5f;
            if (aspectRatio.m139216a() < aspectRatio.m139218c() || (aspectRatio.m139219d() && measuredWidth < measuredHeight)) {
                fM139217b = measuredWidth * 0.9f * 0.5f;
                fM139217b2 = fM139217b / aspectRatio.m139217b();
            } else {
                fM139217b2 = measuredHeight * 0.9f * 0.5f;
                fM139217b = aspectRatio.m139217b() * fM139217b2;
            }
            this.f15800e.set(f - fM139217b, f2 - fM139217b2, f + fM139217b, f2 + fM139217b2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f15803h) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f15796a);
            if (m21014j()) {
                this.f15798c.m180864c(canvas, this.f15800e);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setDrawOverlay(boolean z) {
        this.f15803h = z;
        invalidate();
    }

    public void setImageHeight(int i) {
        this.f15806k = i;
    }

    public void setImageWidth(int i) {
        this.f15805j = i;
    }

    public void setMaxScale(float f) {
        this.f15808m = f;
    }

    public void setNewBoundsListener(se50 se50Var) {
        this.f15797b = se50Var;
    }

    public void setOnMovePartImageCenterListener(pe50 pe50Var) {
        this.f15804i = pe50Var;
    }

    public void setOnTouchActionListener(d30 d30Var) {
        this.f15807l = d30Var;
    }
}
