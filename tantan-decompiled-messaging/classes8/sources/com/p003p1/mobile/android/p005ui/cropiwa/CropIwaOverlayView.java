package com.p003p1.mobile.android.p005ui.cropiwa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import p007l.de50;
import p007l.j11;
import p007l.nub;
import p007l.pe50;
import p007l.qex;
import p007l.rub;
import p007l.se50;
import p007l.zu5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@SuppressLint({"ViewConstructor"})
public class CropIwaOverlayView extends View implements zu5, de50 {

    /* JADX INFO: renamed from: a */
    public Paint f1495a;

    /* JADX INFO: renamed from: b */
    public se50 f1496b;

    /* JADX INFO: renamed from: c */
    public rub f1497c;

    /* JADX INFO: renamed from: d */
    public RectF f1498d;

    /* JADX INFO: renamed from: e */
    public RectF f1499e;

    /* JADX INFO: renamed from: f */
    public RectF f1500f;

    /* JADX INFO: renamed from: g */
    public nub f1501g;

    /* JADX INFO: renamed from: h */
    public boolean f1502h;

    /* JADX INFO: renamed from: i */
    public pe50 f1503i;

    /* JADX INFO: renamed from: j */
    public int f1504j;

    /* JADX INFO: renamed from: k */
    public int f1505k;

    /* JADX INFO: renamed from: l */
    public d30 f1506l;

    /* JADX INFO: renamed from: m */
    public float f1507m;

    /* JADX INFO: renamed from: n */
    public float f1508n;

    public CropIwaOverlayView(Context context, nub nubVar) {
        super(context);
        mo1192d(nubVar);
    }

    /* JADX INFO: renamed from: a */
    public void mo1190a() {
        this.f1495a.setColor(this.f1501g.m10126o());
        rub rubVarM10121j = this.f1501g.m10121j();
        this.f1497c = rubVarM10121j;
        rubVarM10121j.mo1190a();
        mo1185o();
        m1288l();
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public void mo1191b(RectF rectF) {
        this.f1498d.set(rectF);
        mo1185o();
        m1288l();
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public void mo1192d(nub nubVar) {
        this.f1501g = nubVar;
        nubVar.m10114a(this);
        this.f1498d = new RectF();
        this.f1497c = nubVar.m10121j();
        this.f1499e = new RectF();
        this.f1500f = new RectF();
        Paint paint = new Paint();
        this.f1495a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1495a.setColor(nubVar.m10126o());
        setLayerType(1, null);
        if (getContext() instanceof Act) {
            ((Act) getContext()).duringCreated((c) qex.f3861b).subscribe(new e30() { // from class: l.oub
                public final void call(Object obj) {
                    this.f3580a.m1287k((Float) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1193e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m1283f() {
        return this.f1502h;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo1194g() {
        return false;
    }

    @Nullable
    public j11 getAspectRatio() {
        j11 j11VarM10116e = this.f1501g.m10116e();
        if (j11VarM10116e != j11.f2952c) {
            return j11VarM10116e;
        }
        if (this.f1498d.width() == 0.0f || this.f1498d.height() == 0.0f) {
            return null;
        }
        return new j11(Math.round(this.f1498d.width()), Math.round(this.f1498d.height()));
    }

    public RectF getCropRect() {
        return new RectF(this.f1499e);
    }

    public float getRemainScale() {
        return this.f1507m / Math.max(1.0f, this.f1508n);
    }

    /* JADX INFO: renamed from: h */
    public boolean m1284h() {
        return this.f1508n < this.f1507m;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1285i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1286j() {
        return this.f1499e.width() >= ((float) this.f1501g.m10125n()) && this.f1499e.height() >= ((float) this.f1501g.m10124m());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m1287k(Float f) {
        this.f1508n = f.floatValue();
    }

    /* JADX INFO: renamed from: l */
    public void m1288l() {
        m1289m(false);
    }

    /* JADX INFO: renamed from: m */
    public void m1289m(boolean z) {
        if (this.f1496b != null) {
            this.f1496b.mo1247b(new RectF(this.f1499e), z);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m1290n() {
        if (NullChecker.a(this.f1496b)) {
            this.f1496b.mo1248c(Math.min(Math.min(this.f1500f.height() / this.f1499e.height(), this.f1500f.width() / this.f1499e.width()), getRemainScale()), this.f1499e.centerX(), this.f1499e.centerY());
            if (NullChecker.a(this.f1506l)) {
                this.f1506l.call();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo1185o() {
        j11 aspectRatio;
        float fM9452b;
        float fM9452b2;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null) {
            return;
        }
        if (this.f1499e.width() == 0.0f || this.f1499e.height() == 0.0f || Math.abs((this.f1499e.width() / this.f1499e.height()) - aspectRatio.m9452b()) >= 0.001d) {
            float f = measuredWidth * 0.5f;
            float f2 = measuredHeight * 0.5f;
            if (aspectRatio.m9451a() < aspectRatio.m9453c() || (aspectRatio.m9454d() && measuredWidth < measuredHeight)) {
                fM9452b = measuredWidth * 0.9f * 0.5f;
                fM9452b2 = fM9452b / aspectRatio.m9452b();
            } else {
                fM9452b2 = measuredHeight * 0.9f * 0.5f;
                fM9452b = aspectRatio.m9452b() * fM9452b2;
            }
            this.f1499e.set(f - fM9452b, f2 - fM9452b2, f + fM9452b, f2 + fM9452b2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f1502h) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f1495a);
            if (m1286j()) {
                this.f1497c.m10604c(canvas, this.f1499e);
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
        this.f1502h = z;
        invalidate();
    }

    public void setImageHeight(int i) {
        this.f1505k = i;
    }

    public void setImageWidth(int i) {
        this.f1504j = i;
    }

    public void setMaxScale(float f) {
        this.f1507m = f;
    }

    public void setNewBoundsListener(se50 se50Var) {
        this.f1496b = se50Var;
    }

    public void setOnMovePartImageCenterListener(pe50 pe50Var) {
        this.f1503i = pe50Var;
    }

    public void setOnTouchActionListener(d30 d30Var) {
        this.f1506l = d30Var;
    }
}
