package p028v;

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
import l.b9c0;
import p003l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFrame_FlipContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C1333b f12720a;

    /* JADX INFO: renamed from: b */
    public final C1332a f12721b;

    /* JADX INFO: renamed from: c */
    public d30 f12722c;

    /* JADX INFO: renamed from: d */
    public int f12723d;

    /* JADX INFO: renamed from: e */
    public int f12724e;

    /* JADX INFO: renamed from: f */
    public float f12725f;

    /* JADX INFO: renamed from: g */
    public float f12726g;

    /* JADX INFO: renamed from: h */
    public int f12727h;

    /* JADX INFO: renamed from: i */
    public float f12728i;

    /* JADX INFO: renamed from: j */
    public float f12729j;

    /* JADX INFO: renamed from: k */
    public float f12730k;

    /* JADX INFO: renamed from: v.VFrame_FlipContainer$a */
    public static class C1332a {

        /* JADX INFO: renamed from: a */
        public final RectF f12731a;

        /* JADX INFO: renamed from: b */
        public final RectF f12732b;

        /* JADX INFO: renamed from: c */
        public final RectF f12733c;

        /* JADX INFO: renamed from: d */
        public final Matrix f12734d;

        /* JADX INFO: renamed from: e */
        public final Camera f12735e;

        /* JADX INFO: renamed from: f */
        public final Paint f12736f;

        public C1332a() {
            this.f12731a = new RectF();
            this.f12732b = new RectF();
            this.f12733c = new RectF();
            this.f12734d = new Matrix();
            this.f12735e = new Camera();
            this.f12736f = new Paint();
        }

        /* JADX INFO: renamed from: g */
        public final C1332a m11519g() {
            this.f12736f.setAntiAlias(true);
            this.f12736f.setStyle(Paint.Style.FILL);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final void m11520h(Canvas canvas, float f, float f2, float f3) {
            this.f12734d.reset();
            this.f12735e.save();
            this.f12735e.translate(f2, 0.0f, 0.0f);
            this.f12735e.rotateY(f);
            this.f12735e.getMatrix(this.f12734d);
            this.f12735e.restore();
            float fWidth = this.f12731a.width() / 2.0f;
            float fHeight = this.f12731a.height() / 2.0f;
            this.f12734d.preTranslate(-fWidth, -fHeight);
            this.f12734d.postScale(f3, f3);
            this.f12734d.postTranslate(fWidth, fHeight);
            canvas.concat(this.f12734d);
        }
    }

    /* JADX INFO: renamed from: v.VFrame_FlipContainer$b */
    public static class C1333b {

        /* JADX INFO: renamed from: a */
        public long f12737a;

        /* JADX INFO: renamed from: b */
        public int f12738b;

        /* JADX INFO: renamed from: c */
        public float f12739c;

        public C1333b() {
            this.f12737a = -2L;
            this.f12738b = 3000;
            this.f12739c = 0.0f;
        }

        /* JADX INFO: renamed from: c */
        public final float m11523c(View view) {
            long j = this.f12737a;
            if (j == -2) {
                return this.f12739c;
            }
            if (j == -1) {
                this.f12737a = SystemClock.elapsedRealtime();
                this.f12739c = 0.0f;
                view.postInvalidate();
            } else {
                float fElapsedRealtime = ((SystemClock.elapsedRealtime() - this.f12737a) * 1.0f) / this.f12738b;
                if (fElapsedRealtime > 1.0f) {
                    if (this.f12739c != 1.0f) {
                        view.postInvalidate();
                    }
                    this.f12739c = 1.0f;
                } else if (fElapsedRealtime < 0.0f) {
                    if (this.f12739c != 0.0f) {
                        view.postInvalidate();
                    }
                    this.f12739c = 0.0f;
                } else {
                    this.f12739c = fElapsedRealtime;
                    view.postInvalidate();
                }
            }
            return this.f12739c;
        }

        /* JADX INFO: renamed from: d */
        public void m11524d(int i) {
            this.f12738b = i;
        }

        /* JADX INFO: renamed from: e */
        public final void m11525e(View view) {
            this.f12737a = -1L;
            view.postInvalidate();
        }
    }

    public VFrame_FlipContainer(@NonNull Context context) {
        super(context);
        this.f12720a = new C1333b();
        this.f12721b = new C1332a().m11519g();
        this.f12725f = 0.1f;
        this.f12726g = 0.9f;
        this.f12728i = -1.0f;
        this.f12729j = 1.0f;
        this.f12730k = 1.0f;
        m11507b(context, null, 0);
    }

    private View getMainChild() {
        return getChildAt(this.f12723d);
    }

    private View getOtherChild() {
        return getChildAt(this.f12724e);
    }

    /* JADX INFO: renamed from: a */
    public final RectF m11506a(RectF rectF) {
        if (this.f12729j == 1.0f && this.f12730k == 1.0f) {
            return rectF;
        }
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fWidth = (rectF.width() * this.f12729j) / 2.0f;
        float fHeight = (rectF.height() * this.f12730k) / 2.0f;
        this.f12721b.f12733c.set(fCenterX - fWidth, fCenterY - fHeight, fCenterX + fWidth, fCenterY + fHeight);
        return this.f12721b.f12733c;
    }

    /* JADX INFO: renamed from: b */
    public final void m11507b(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this.f12723d = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.Z, i, 0);
            this.f12723d = typedArrayObtainStyledAttributes.getInt(b9c0.a0, 0);
            this.f12724e = typedArrayObtainStyledAttributes.getInt(b9c0.b0, 1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m11508c() {
        float fM11523c = this.f12720a.m11523c(this);
        return (fM11523c == 0.0f || fM11523c == 1.0f) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11509d() {
        return this.f12728i <= 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float fM11523c = this.f12720a.m11523c(this);
        if (fM11523c == 0.0f || fM11523c == 1.0f) {
            getOtherChild().setVisibility(4);
            getMainChild().setVisibility(0);
            if (fM11523c == 1.0f && NullChecker.a(this.f12722c)) {
                this.f12722c.call();
            }
            super.dispatchDraw(canvas);
            return;
        }
        float f3 = this.f12725f;
        if (fM11523c <= f3) {
            this.f12721b.f12736f.setARGB((int) ((fM11523c / f3) * 255.0f), 255, 255, 255);
            float fAbs = 1.0f - (Math.abs(fM11523c - (this.f12725f / 2.0f)) / (this.f12725f / 2.0f));
            float fWidth = (this.f12721b.f12731a.width() / 6.0f) * fAbs;
            this.f12721b.f12732b.set(fWidth, this.f12721b.f12731a.top, this.f12721b.f12731a.width() - fWidth, this.f12721b.f12731a.bottom);
            RectF rectFM11506a = m11506a(this.f12721b.f12732b);
            if (m11509d()) {
                canvas.drawOval(rectFM11506a, this.f12721b.f12736f);
            } else {
                float f4 = this.f12728i;
                canvas.drawRoundRect(rectFM11506a, f4, f4, this.f12721b.f12736f);
            }
            float f5 = this.f12725f;
            if (fM11523c == f5 / 2.0f) {
                getOtherChild().setVisibility(4);
                getMainChild().setVisibility(4);
                super.dispatchDraw(canvas);
                return;
            }
            if (fM11523c < f5 / 2.0f) {
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
            this.f12721b.m11520h(canvas, f2, fWidth * 2.8f, 1.0f - (fAbs * 0.4f));
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        float f6 = this.f12726g;
        C1332a c1332a = this.f12721b;
        if (fM11523c <= f6) {
            c1332a.f12736f.setARGB(255, 255, 255, 255);
            RectF rectFM11506a2 = m11506a(this.f12721b.f12731a);
            if (m11509d()) {
                canvas.drawOval(rectFM11506a2, this.f12721b.f12736f);
            } else {
                float f7 = this.f12728i;
                canvas.drawRoundRect(rectFM11506a2, f7, f7, this.f12721b.f12736f);
            }
            getOtherChild().setVisibility(0);
            getMainChild().setVisibility(4);
            super.dispatchDraw(canvas);
            return;
        }
        c1332a.f12736f.setARGB((int) ((1.0f - ((fM11523c - f6) / (1.0f - f6))) * 255.0f), 255, 255, 255);
        float fAbs2 = 1.0f - (Math.abs(fM11523c - (1.0f - ((1.0f - this.f12726g) / 2.0f))) / ((1.0f - this.f12726g) / 2.0f));
        float fWidth2 = (this.f12721b.f12731a.width() / 6.0f) * fAbs2;
        this.f12721b.f12732b.set(fWidth2, this.f12721b.f12731a.top, this.f12721b.f12731a.width() - fWidth2, this.f12721b.f12731a.bottom);
        RectF rectFM11506a3 = m11506a(this.f12721b.f12732b);
        if (m11509d()) {
            canvas.drawOval(rectFM11506a3, this.f12721b.f12736f);
        } else {
            float f8 = this.f12728i;
            canvas.drawRoundRect(rectFM11506a3, f8, f8, this.f12721b.f12736f);
        }
        float f9 = this.f12726g;
        if (fM11523c == 1.0f - ((1.0f - f9) / 2.0f)) {
            getChildAt(0).setVisibility(4);
            getChildAt(1).setVisibility(4);
            super.dispatchDraw(canvas);
            return;
        }
        if (fM11523c < 1.0f - ((1.0f - f9) / 2.0f)) {
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
        this.f12721b.m11520h(canvas, f, fWidth2 * 2.8f, 1.0f - (fAbs2 * 0.4f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m11510e(float f, float f2) {
        if (f <= 0.0f) {
            f = 1.0f;
        }
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        this.f12729j = f;
        this.f12730k = f2;
        postInvalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m11511f() {
        int i = this.f12727h;
        if (i > 0) {
            this.f12720a.m11524d(i);
        }
        this.f12720a.m11525e(this);
    }

    /* JADX INFO: renamed from: g */
    public void m11512g(d30 d30Var) {
        this.f12722c = d30Var;
        this.f12720a.m11525e(this);
    }

    public int getAnimDuration() {
        return this.f12727h;
    }

    public float getRotateBg() {
        return this.f12725f;
    }

    public float getRotateFg() {
        return this.f12726g;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12721b.f12731a.set(0.0f, 0.0f, i, i2);
        postInvalidate();
    }

    public void setAnimDuration(int i) {
        this.f12727h = i;
    }

    public void setNum(String str) {
        ((TextView) getOtherChild()).setText(str);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOvalScale(float f) {
        m11510e(f, f);
    }

    public void setRotateBg(float f) {
        this.f12725f = f;
    }

    public void setRotateFg(float f) {
        this.f12726g = f;
    }

    public void setRoundRadius(float f) {
        this.f12728i = f;
    }

    public VFrame_FlipContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12720a = new C1333b();
        this.f12721b = new C1332a().m11519g();
        this.f12725f = 0.1f;
        this.f12726g = 0.9f;
        this.f12728i = -1.0f;
        this.f12729j = 1.0f;
        this.f12730k = 1.0f;
        m11507b(context, attributeSet, 0);
    }

    public VFrame_FlipContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12720a = new C1333b();
        this.f12721b = new C1332a().m11519g();
        this.f12725f = 0.1f;
        this.f12726g = 0.9f;
        this.f12728i = -1.0f;
        this.f12729j = 1.0f;
        this.f12730k = 1.0f;
        m11507b(context, attributeSet, i);
    }
}
