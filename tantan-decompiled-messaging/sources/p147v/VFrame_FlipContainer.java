package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p149l.b9c0;
import p149l.d30;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_FlipContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C22540b f209095a;

    /* JADX INFO: renamed from: b */
    public final C22539a f209096b;

    /* JADX INFO: renamed from: c */
    public d30 f209097c;

    /* JADX INFO: renamed from: d */
    public int f209098d;

    /* JADX INFO: renamed from: e */
    public int f209099e;

    /* JADX INFO: renamed from: f */
    public float f209100f;

    /* JADX INFO: renamed from: g */
    public float f209101g;

    /* JADX INFO: renamed from: h */
    public int f209102h;

    /* JADX INFO: renamed from: i */
    public float f209103i;

    /* JADX INFO: renamed from: j */
    public float f209104j;

    /* JADX INFO: renamed from: k */
    public float f209105k;

    /* JADX INFO: renamed from: v.VFrame_FlipContainer$a */
    public static class C22539a {

        /* JADX INFO: renamed from: a */
        public final RectF f209106a;

        /* JADX INFO: renamed from: b */
        public final RectF f209107b;

        /* JADX INFO: renamed from: c */
        public final RectF f209108c;

        /* JADX INFO: renamed from: d */
        public final Matrix f209109d;

        /* JADX INFO: renamed from: e */
        public final Camera f209110e;

        /* JADX INFO: renamed from: f */
        public final Paint f209111f;

        public C22539a() {
            this.f209106a = new RectF();
            this.f209107b = new RectF();
            this.f209108c = new RectF();
            this.f209109d = new Matrix();
            this.f209110e = new Camera();
            this.f209111f = new Paint();
        }

        /* JADX INFO: renamed from: g */
        public final C22539a m223042g() {
            this.f209111f.setAntiAlias(true);
            this.f209111f.setStyle(Paint.Style.FILL);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final void m223043h(Canvas canvas, float f, float f2, float f3) {
            this.f209109d.reset();
            this.f209110e.save();
            this.f209110e.translate(f2, 0.0f, 0.0f);
            this.f209110e.rotateY(f);
            this.f209110e.getMatrix(this.f209109d);
            this.f209110e.restore();
            float fWidth = this.f209106a.width() / 2.0f;
            float fHeight = this.f209106a.height() / 2.0f;
            this.f209109d.preTranslate(-fWidth, -fHeight);
            this.f209109d.postScale(f3, f3);
            this.f209109d.postTranslate(fWidth, fHeight);
            canvas.concat(this.f209109d);
        }
    }

    /* JADX INFO: renamed from: v.VFrame_FlipContainer$b */
    public static class C22540b {

        /* JADX INFO: renamed from: a */
        public long f209112a;

        /* JADX INFO: renamed from: b */
        public int f209113b;

        /* JADX INFO: renamed from: c */
        public float f209114c;

        public C22540b() {
            this.f209112a = -2L;
            this.f209113b = 3000;
            this.f209114c = 0.0f;
        }

        /* JADX INFO: renamed from: c */
        public final float m223046c(View view) {
            long j = this.f209112a;
            if (j == -2) {
                return this.f209114c;
            }
            if (j == -1) {
                this.f209112a = SystemClock.elapsedRealtime();
                this.f209114c = 0.0f;
                view.postInvalidate();
            } else {
                float fElapsedRealtime = ((SystemClock.elapsedRealtime() - this.f209112a) * 1.0f) / this.f209113b;
                if (fElapsedRealtime > 1.0f) {
                    if (this.f209114c != 1.0f) {
                        view.postInvalidate();
                    }
                    this.f209114c = 1.0f;
                } else if (fElapsedRealtime < 0.0f) {
                    if (this.f209114c != 0.0f) {
                        view.postInvalidate();
                    }
                    this.f209114c = 0.0f;
                } else {
                    this.f209114c = fElapsedRealtime;
                    view.postInvalidate();
                }
            }
            return this.f209114c;
        }

        /* JADX INFO: renamed from: d */
        public void m223047d(int i) {
            this.f209113b = i;
        }

        /* JADX INFO: renamed from: e */
        public final void m223048e(View view) {
            this.f209112a = -1L;
            view.postInvalidate();
        }
    }

    public VFrame_FlipContainer(@NonNull Context context) {
        super(context);
        this.f209095a = new C22540b();
        this.f209096b = new C22539a().m223042g();
        this.f209100f = 0.1f;
        this.f209101g = 0.9f;
        this.f209103i = -1.0f;
        this.f209104j = 1.0f;
        this.f209105k = 1.0f;
        m223030b(context, null, 0);
    }

    private View getMainChild() {
        return getChildAt(this.f209098d);
    }

    private View getOtherChild() {
        return getChildAt(this.f209099e);
    }

    /* JADX INFO: renamed from: a */
    public final RectF m223029a(RectF rectF) {
        if (this.f209104j == 1.0f && this.f209105k == 1.0f) {
            return rectF;
        }
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fWidth = (rectF.width() * this.f209104j) / 2.0f;
        float fHeight = (rectF.height() * this.f209105k) / 2.0f;
        this.f209096b.f209108c.set(fCenterX - fWidth, fCenterY - fHeight, fCenterX + fWidth, fCenterY + fHeight);
        return this.f209096b.f209108c;
    }

    /* JADX INFO: renamed from: b */
    public final void m223030b(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this.f209098d = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74379Z, i, 0);
            this.f209098d = typedArrayObtainStyledAttributes.getInt(b9c0.f74386a0, 0);
            this.f209099e = typedArrayObtainStyledAttributes.getInt(b9c0.f74393b0, 1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m223031c() {
        float fM223046c = this.f209095a.m223046c(this);
        return (fM223046c == 0.0f || fM223046c == 1.0f) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m223032d() {
        return this.f209103i <= 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float fM223046c = this.f209095a.m223046c(this);
        if (fM223046c == 0.0f || fM223046c == 1.0f) {
            getOtherChild().setVisibility(4);
            getMainChild().setVisibility(0);
            if (fM223046c == 1.0f && NullChecker.m81303a(this.f209097c)) {
                this.f209097c.call();
            }
            super.dispatchDraw(canvas);
            return;
        }
        float f3 = this.f209100f;
        if (fM223046c <= f3) {
            this.f209096b.f209111f.setARGB((int) ((fM223046c / f3) * 255.0f), 255, 255, 255);
            float fAbs = 1.0f - (Math.abs(fM223046c - (this.f209100f / 2.0f)) / (this.f209100f / 2.0f));
            float fWidth = (this.f209096b.f209106a.width() / 6.0f) * fAbs;
            this.f209096b.f209107b.set(fWidth, this.f209096b.f209106a.top, this.f209096b.f209106a.width() - fWidth, this.f209096b.f209106a.bottom);
            RectF rectFM223029a = m223029a(this.f209096b.f209107b);
            if (m223032d()) {
                canvas.drawOval(rectFM223029a, this.f209096b.f209111f);
            } else {
                float f4 = this.f209103i;
                canvas.drawRoundRect(rectFM223029a, f4, f4, this.f209096b.f209111f);
            }
            float f5 = this.f209100f;
            if (fM223046c == f5 / 2.0f) {
                getOtherChild().setVisibility(4);
                getMainChild().setVisibility(4);
                super.dispatchDraw(canvas);
                return;
            }
            if (fM223046c < f5 / 2.0f) {
                getOtherChild().setVisibility(4);
                getMainChild().setVisibility(0);
                f2 = 70.0f * fAbs;
            } else {
                getOtherChild().setVisibility(0);
                getMainChild().setVisibility(4);
                f2 = fAbs * (-70.0f);
                fWidth = -fWidth;
            }
            canvas.save();
            this.f209096b.m223043h(canvas, f2, fWidth * 2.8f, 1.0f - (fAbs * 0.4f));
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        float f6 = this.f209101g;
        C22539a c22539a = this.f209096b;
        if (fM223046c <= f6) {
            c22539a.f209111f.setARGB(255, 255, 255, 255);
            RectF rectFM223029a2 = m223029a(this.f209096b.f209106a);
            if (m223032d()) {
                canvas.drawOval(rectFM223029a2, this.f209096b.f209111f);
            } else {
                float f7 = this.f209103i;
                canvas.drawRoundRect(rectFM223029a2, f7, f7, this.f209096b.f209111f);
            }
            getOtherChild().setVisibility(0);
            getMainChild().setVisibility(4);
            super.dispatchDraw(canvas);
            return;
        }
        c22539a.f209111f.setARGB((int) ((1.0f - ((fM223046c - f6) / (1.0f - f6))) * 255.0f), 255, 255, 255);
        float fAbs2 = 1.0f - (Math.abs(fM223046c - (1.0f - ((1.0f - this.f209101g) / 2.0f))) / ((1.0f - this.f209101g) / 2.0f));
        float fWidth2 = (this.f209096b.f209106a.width() / 6.0f) * fAbs2;
        this.f209096b.f209107b.set(fWidth2, this.f209096b.f209106a.top, this.f209096b.f209106a.width() - fWidth2, this.f209096b.f209106a.bottom);
        RectF rectFM223029a3 = m223029a(this.f209096b.f209107b);
        if (m223032d()) {
            canvas.drawOval(rectFM223029a3, this.f209096b.f209111f);
        } else {
            float f8 = this.f209103i;
            canvas.drawRoundRect(rectFM223029a3, f8, f8, this.f209096b.f209111f);
        }
        float f9 = this.f209101g;
        if (fM223046c == 1.0f - ((1.0f - f9) / 2.0f)) {
            getChildAt(0).setVisibility(4);
            getChildAt(1).setVisibility(4);
            super.dispatchDraw(canvas);
            return;
        }
        if (fM223046c < 1.0f - ((1.0f - f9) / 2.0f)) {
            getOtherChild().setVisibility(0);
            getMainChild().setVisibility(4);
            f = 70.0f * fAbs2;
        } else {
            getOtherChild().setVisibility(4);
            getMainChild().setVisibility(0);
            f = fAbs2 * (-70.0f);
            fWidth2 = -fWidth2;
        }
        canvas.save();
        this.f209096b.m223043h(canvas, f, fWidth2 * 2.8f, 1.0f - (fAbs2 * 0.4f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m223033e(float f, float f2) {
        if (f <= 0.0f) {
            f = 1.0f;
        }
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        this.f209104j = f;
        this.f209105k = f2;
        postInvalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m223034f() {
        int i = this.f209102h;
        if (i > 0) {
            this.f209095a.m223047d(i);
        }
        this.f209095a.m223048e(this);
    }

    /* JADX INFO: renamed from: g */
    public void m223035g(d30 d30Var) {
        this.f209097c = d30Var;
        this.f209095a.m223048e(this);
    }

    public int getAnimDuration() {
        return this.f209102h;
    }

    public float getRotateBg() {
        return this.f209100f;
    }

    public float getRotateFg() {
        return this.f209101g;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f209096b.f209106a.set(0.0f, 0.0f, i, i2);
        postInvalidate();
    }

    public void setAnimDuration(int i) {
        this.f209102h = i;
    }

    public void setNum(String str) {
        ((TextView) getOtherChild()).setText(str);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOvalScale(float f) {
        m223033e(f, f);
    }

    public void setRotateBg(float f) {
        this.f209100f = f;
    }

    public void setRotateFg(float f) {
        this.f209101g = f;
    }

    public void setRoundRadius(float f) {
        this.f209103i = f;
    }

    public VFrame_FlipContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209095a = new C22540b();
        this.f209096b = new C22539a().m223042g();
        this.f209100f = 0.1f;
        this.f209101g = 0.9f;
        this.f209103i = -1.0f;
        this.f209104j = 1.0f;
        this.f209105k = 1.0f;
        m223030b(context, attributeSet, 0);
    }

    public VFrame_FlipContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209095a = new C22540b();
        this.f209096b = new C22539a().m223042g();
        this.f209100f = 0.1f;
        this.f209101g = 0.9f;
        this.f209103i = -1.0f;
        this.f209104j = 1.0f;
        this.f209105k = 1.0f;
        m223030b(context, attributeSet, i);
    }
}
