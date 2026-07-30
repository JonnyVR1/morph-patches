package p151v;

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
import p153l.hhc0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_FlipContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C22655b f210017a;

    /* JADX INFO: renamed from: b */
    public final C22654a f210018b;

    /* JADX INFO: renamed from: c */
    public x20 f210019c;

    /* JADX INFO: renamed from: d */
    public int f210020d;

    /* JADX INFO: renamed from: e */
    public int f210021e;

    /* JADX INFO: renamed from: f */
    public float f210022f;

    /* JADX INFO: renamed from: g */
    public float f210023g;

    /* JADX INFO: renamed from: h */
    public int f210024h;

    /* JADX INFO: renamed from: i */
    public float f210025i;

    /* JADX INFO: renamed from: j */
    public float f210026j;

    /* JADX INFO: renamed from: k */
    public float f210027k;

    /* JADX INFO: renamed from: v.VFrame_FlipContainer$a */
    public static class C22654a {

        /* JADX INFO: renamed from: a */
        public final RectF f210028a;

        /* JADX INFO: renamed from: b */
        public final RectF f210029b;

        /* JADX INFO: renamed from: c */
        public final RectF f210030c;

        /* JADX INFO: renamed from: d */
        public final Matrix f210031d;

        /* JADX INFO: renamed from: e */
        public final Camera f210032e;

        /* JADX INFO: renamed from: f */
        public final Paint f210033f;

        public C22654a() {
            this.f210028a = new RectF();
            this.f210029b = new RectF();
            this.f210030c = new RectF();
            this.f210031d = new Matrix();
            this.f210032e = new Camera();
            this.f210033f = new Paint();
        }

        /* JADX INFO: renamed from: g */
        public final C22654a m224288g() {
            this.f210033f.setAntiAlias(true);
            this.f210033f.setStyle(Paint.Style.FILL);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final void m224289h(Canvas canvas, float f, float f2, float f3) {
            this.f210031d.reset();
            this.f210032e.save();
            this.f210032e.translate(f2, 0.0f, 0.0f);
            this.f210032e.rotateY(f);
            this.f210032e.getMatrix(this.f210031d);
            this.f210032e.restore();
            float fWidth = this.f210028a.width() / 2.0f;
            float fHeight = this.f210028a.height() / 2.0f;
            this.f210031d.preTranslate(-fWidth, -fHeight);
            this.f210031d.postScale(f3, f3);
            this.f210031d.postTranslate(fWidth, fHeight);
            canvas.concat(this.f210031d);
        }
    }

    /* JADX INFO: renamed from: v.VFrame_FlipContainer$b */
    public static class C22655b {

        /* JADX INFO: renamed from: a */
        public long f210034a;

        /* JADX INFO: renamed from: b */
        public int f210035b;

        /* JADX INFO: renamed from: c */
        public float f210036c;

        public C22655b() {
            this.f210034a = -2L;
            this.f210035b = 3000;
            this.f210036c = 0.0f;
        }

        /* JADX INFO: renamed from: c */
        public final float m224292c(View view) {
            long j = this.f210034a;
            if (j == -2) {
                return this.f210036c;
            }
            if (j == -1) {
                this.f210034a = SystemClock.elapsedRealtime();
                this.f210036c = 0.0f;
                view.postInvalidate();
            } else {
                float fElapsedRealtime = ((SystemClock.elapsedRealtime() - this.f210034a) * 1.0f) / this.f210035b;
                if (fElapsedRealtime > 1.0f) {
                    if (this.f210036c != 1.0f) {
                        view.postInvalidate();
                    }
                    this.f210036c = 1.0f;
                } else if (fElapsedRealtime < 0.0f) {
                    if (this.f210036c != 0.0f) {
                        view.postInvalidate();
                    }
                    this.f210036c = 0.0f;
                } else {
                    this.f210036c = fElapsedRealtime;
                    view.postInvalidate();
                }
            }
            return this.f210036c;
        }

        /* JADX INFO: renamed from: d */
        public void m224293d(int i) {
            this.f210035b = i;
        }

        /* JADX INFO: renamed from: e */
        public final void m224294e(View view) {
            this.f210034a = -1L;
            view.postInvalidate();
        }
    }

    public VFrame_FlipContainer(@NonNull Context context) {
        super(context);
        this.f210017a = new C22655b();
        this.f210018b = new C22654a().m224288g();
        this.f210022f = 0.1f;
        this.f210023g = 0.9f;
        this.f210025i = -1.0f;
        this.f210026j = 1.0f;
        this.f210027k = 1.0f;
        m224276b(context, null, 0);
    }

    private View getMainChild() {
        return getChildAt(this.f210020d);
    }

    private View getOtherChild() {
        return getChildAt(this.f210021e);
    }

    /* JADX INFO: renamed from: a */
    public final RectF m224275a(RectF rectF) {
        if (this.f210026j == 1.0f && this.f210027k == 1.0f) {
            return rectF;
        }
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fWidth = (rectF.width() * this.f210026j) / 2.0f;
        float fHeight = (rectF.height() * this.f210027k) / 2.0f;
        this.f210018b.f210030c.set(fCenterX - fWidth, fCenterY - fHeight, fCenterX + fWidth, fCenterY + fHeight);
        return this.f210018b.f210030c;
    }

    /* JADX INFO: renamed from: b */
    public final void m224276b(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this.f210020d = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109688Z, i, 0);
            this.f210020d = typedArrayObtainStyledAttributes.getInt(hhc0.f109695a0, 0);
            this.f210021e = typedArrayObtainStyledAttributes.getInt(hhc0.f109702b0, 1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m224277c() {
        float fM224292c = this.f210017a.m224292c(this);
        return (fM224292c == 0.0f || fM224292c == 1.0f) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m224278d() {
        return this.f210025i <= 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float fM224292c = this.f210017a.m224292c(this);
        if (fM224292c == 0.0f || fM224292c == 1.0f) {
            getOtherChild().setVisibility(4);
            getMainChild().setVisibility(0);
            if (fM224292c == 1.0f && NullChecker.m82486a(this.f210019c)) {
                this.f210019c.call();
            }
            super.dispatchDraw(canvas);
            return;
        }
        float f3 = this.f210022f;
        if (fM224292c <= f3) {
            this.f210018b.f210033f.setARGB((int) ((fM224292c / f3) * 255.0f), 255, 255, 255);
            float fAbs = 1.0f - (Math.abs(fM224292c - (this.f210022f / 2.0f)) / (this.f210022f / 2.0f));
            float fWidth = (this.f210018b.f210028a.width() / 6.0f) * fAbs;
            this.f210018b.f210029b.set(fWidth, this.f210018b.f210028a.top, this.f210018b.f210028a.width() - fWidth, this.f210018b.f210028a.bottom);
            RectF rectFM224275a = m224275a(this.f210018b.f210029b);
            if (m224278d()) {
                canvas.drawOval(rectFM224275a, this.f210018b.f210033f);
            } else {
                float f4 = this.f210025i;
                canvas.drawRoundRect(rectFM224275a, f4, f4, this.f210018b.f210033f);
            }
            float f5 = this.f210022f;
            if (fM224292c == f5 / 2.0f) {
                getOtherChild().setVisibility(4);
                getMainChild().setVisibility(4);
                super.dispatchDraw(canvas);
                return;
            }
            if (fM224292c < f5 / 2.0f) {
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
            this.f210018b.m224289h(canvas, f2, fWidth * 2.8f, 1.0f - (fAbs * 0.4f));
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        float f6 = this.f210023g;
        C22654a c22654a = this.f210018b;
        if (fM224292c <= f6) {
            c22654a.f210033f.setARGB(255, 255, 255, 255);
            RectF rectFM224275a2 = m224275a(this.f210018b.f210028a);
            if (m224278d()) {
                canvas.drawOval(rectFM224275a2, this.f210018b.f210033f);
            } else {
                float f7 = this.f210025i;
                canvas.drawRoundRect(rectFM224275a2, f7, f7, this.f210018b.f210033f);
            }
            getOtherChild().setVisibility(0);
            getMainChild().setVisibility(4);
            super.dispatchDraw(canvas);
            return;
        }
        c22654a.f210033f.setARGB((int) ((1.0f - ((fM224292c - f6) / (1.0f - f6))) * 255.0f), 255, 255, 255);
        float fAbs2 = 1.0f - (Math.abs(fM224292c - (1.0f - ((1.0f - this.f210023g) / 2.0f))) / ((1.0f - this.f210023g) / 2.0f));
        float fWidth2 = (this.f210018b.f210028a.width() / 6.0f) * fAbs2;
        this.f210018b.f210029b.set(fWidth2, this.f210018b.f210028a.top, this.f210018b.f210028a.width() - fWidth2, this.f210018b.f210028a.bottom);
        RectF rectFM224275a3 = m224275a(this.f210018b.f210029b);
        if (m224278d()) {
            canvas.drawOval(rectFM224275a3, this.f210018b.f210033f);
        } else {
            float f8 = this.f210025i;
            canvas.drawRoundRect(rectFM224275a3, f8, f8, this.f210018b.f210033f);
        }
        float f9 = this.f210023g;
        if (fM224292c == 1.0f - ((1.0f - f9) / 2.0f)) {
            getChildAt(0).setVisibility(4);
            getChildAt(1).setVisibility(4);
            super.dispatchDraw(canvas);
            return;
        }
        if (fM224292c < 1.0f - ((1.0f - f9) / 2.0f)) {
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
        this.f210018b.m224289h(canvas, f, fWidth2 * 2.8f, 1.0f - (fAbs2 * 0.4f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m224279e(float f, float f2) {
        if (f <= 0.0f) {
            f = 1.0f;
        }
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        this.f210026j = f;
        this.f210027k = f2;
        postInvalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m224280f() {
        int i = this.f210024h;
        if (i > 0) {
            this.f210017a.m224293d(i);
        }
        this.f210017a.m224294e(this);
    }

    /* JADX INFO: renamed from: g */
    public void m224281g(x20 x20Var) {
        this.f210019c = x20Var;
        this.f210017a.m224294e(this);
    }

    public int getAnimDuration() {
        return this.f210024h;
    }

    public float getRotateBg() {
        return this.f210022f;
    }

    public float getRotateFg() {
        return this.f210023g;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f210018b.f210028a.set(0.0f, 0.0f, i, i2);
        postInvalidate();
    }

    public void setAnimDuration(int i) {
        this.f210024h = i;
    }

    public void setNum(String str) {
        ((TextView) getOtherChild()).setText(str);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOvalScale(float f) {
        m224279e(f, f);
    }

    public void setRotateBg(float f) {
        this.f210022f = f;
    }

    public void setRotateFg(float f) {
        this.f210023g = f;
    }

    public void setRoundRadius(float f) {
        this.f210025i = f;
    }

    public VFrame_FlipContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210017a = new C22655b();
        this.f210018b = new C22654a().m224288g();
        this.f210022f = 0.1f;
        this.f210023g = 0.9f;
        this.f210025i = -1.0f;
        this.f210026j = 1.0f;
        this.f210027k = 1.0f;
        m224276b(context, attributeSet, 0);
    }

    public VFrame_FlipContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210017a = new C22655b();
        this.f210018b = new C22654a().m224288g();
        this.f210022f = 0.1f;
        this.f210023g = 0.9f;
        this.f210025i = -1.0f;
        this.f210026j = 1.0f;
        this.f210027k = 1.0f;
        m224276b(context, attributeSet, i);
    }
}
