package p028v.bottombar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import l.f16;
import l.t0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VBottomBarRippleView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public C1386c f13172c;

    /* JADX INFO: renamed from: d */
    public C1384a f13173d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1385b f13174e;

    /* JADX INFO: renamed from: f */
    public float f13175f;

    /* JADX INFO: renamed from: g */
    public float f13176g;

    /* JADX INFO: renamed from: h */
    public boolean f13177h;

    /* JADX INFO: renamed from: i */
    public int f13178i;

    /* JADX INFO: renamed from: j */
    public int f13179j;

    /* JADX INFO: renamed from: v.bottombar.VBottomBarRippleView$a */
    public static class C1384a {

        /* JADX INFO: renamed from: e */
        public static final Paint f13180e = new Paint(3);

        /* JADX INFO: renamed from: f */
        public static final Xfermode f13181f = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);

        /* JADX INFO: renamed from: a */
        @ColorInt
        public int f13182a;

        /* JADX INFO: renamed from: b */
        @ColorInt
        public int[] f13183b;

        /* JADX INFO: renamed from: c */
        public float[] f13184c;

        /* JADX INFO: renamed from: d */
        public RectF f13185d;

        public C1384a() {
            this.f13182a = f16.a().getResources().getColor(t0c0.f);
            this.f13183b = new int[]{f16.a().getResources().getColor(t0c0.g), f16.a().getResources().getColor(t0c0.h), f16.a().getResources().getColor(t0c0.i), f16.a().getResources().getColor(t0c0.j)};
            this.f13184c = new float[]{0.0f, 0.28f, 0.62f, 1.0f};
            this.f13185d = new RectF();
        }

        /* JADX INFO: renamed from: d */
        public final void m11886d(Canvas canvas, float f) {
            Paint paint = f13180e;
            paint.setXfermode(f13181f);
            if (Math.min(this.f13185d.width(), this.f13185d.height()) > 0.0f) {
                if (f < 0.8f) {
                    float fWidth = this.f13185d.width() / 2.0f;
                    float fHeight = (this.f13185d.height() * 4.0f) / 5.0f;
                    float fMin = Math.min(this.f13185d.width(), this.f13185d.height()) * (0.01f + f) * 2.0f;
                    int i = this.f13182a;
                    paint.setShader(new RadialGradient(fWidth, fHeight, fMin, new int[]{i, i, 0}, new float[]{0.0f, f / 2.0f, 1.0f}, Shader.TileMode.CLAMP));
                } else {
                    paint.setShader(new LinearGradient(0.0f, this.f13185d.height(), this.f13185d.width(), 0.0f, this.f13183b, this.f13184c, Shader.TileMode.CLAMP));
                }
                canvas.drawCircle(this.f13185d.centerX(), this.f13185d.centerY(), Math.min(this.f13185d.width(), this.f13185d.height()), paint);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m11887e(@ColorInt int i, @ColorInt int[] iArr, @NonNull float[] fArr) {
            this.f13182a = i;
            this.f13183b = iArr;
            this.f13184c = fArr;
        }
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBarRippleView$b */
    public interface InterfaceC1385b {
        /* JADX INFO: renamed from: a */
        void mo3555a(float f, float f2);
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBarRippleView$c */
    public static class C1386c {

        /* JADX INFO: renamed from: d */
        public static final Interpolator f13186d = new DecelerateInterpolator();

        /* JADX INFO: renamed from: a */
        public long f13187a;

        /* JADX INFO: renamed from: b */
        public int f13188b;

        /* JADX INFO: renamed from: c */
        public float f13189c;

        public C1386c() {
            this.f13187a = -2L;
            this.f13188b = 1000;
            this.f13189c = 0.0f;
        }

        /* JADX INFO: renamed from: e */
        public final void m11892e(View view) {
            this.f13187a = -2L;
            this.f13189c = 1.0f;
            view.postInvalidate();
        }

        /* JADX INFO: renamed from: f */
        public final float m11893f(View view) {
            long j = this.f13187a;
            if (j == -2) {
                return this.f13189c;
            }
            if (j == -1) {
                this.f13187a = SystemClock.elapsedRealtime();
                this.f13189c = 0.0f;
                view.postInvalidate();
            } else {
                float fElapsedRealtime = ((SystemClock.elapsedRealtime() - this.f13187a) * 1.0f) / this.f13188b;
                if (fElapsedRealtime > 1.0f) {
                    if (this.f13189c != 1.0f) {
                        view.postInvalidate();
                    }
                    this.f13189c = 1.0f;
                } else if (fElapsedRealtime < 0.0f) {
                    if (this.f13189c != 0.0f) {
                        view.postInvalidate();
                    }
                    this.f13189c = 0.0f;
                } else {
                    this.f13189c = f13186d.getInterpolation(fElapsedRealtime);
                    view.postInvalidate();
                }
            }
            return this.f13189c;
        }

        /* JADX INFO: renamed from: g */
        public final void m11894g(View view) {
            this.f13187a = -2L;
            this.f13189c = 0.0f;
            view.postInvalidate();
        }

        /* JADX INFO: renamed from: h */
        public final void m11895h(View view) {
            this.f13187a = -1L;
            view.postInvalidate();
        }
    }

    public VBottomBarRippleView(Context context) {
        super(context);
        this.f13172c = new C1386c();
        this.f13173d = new C1384a();
        this.f13175f = 1.0f;
        this.f13176g = 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public void m11878d() {
        this.f13172c.m11892e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        float fM11893f = this.f13172c.m11893f(this);
        int iSaveLayer = canvas.saveLayer(this.f13173d.f13185d, C1384a.f13180e, 31);
        super/*android.view.View*/.draw(canvas);
        this.f13173d.m11886d(canvas, fM11893f);
        canvas.restoreToCount(iSaveLayer);
        float fPow = (((float) (Math.pow(1.0f - fM11893f, 2.0d) * ((double) ((float) Math.sin(((double) fM11893f) * 9.42477796076938d))))) * 0.4f) + 1.0f;
        super/*android.view.View*/.setScaleX(this.f13175f * fPow);
        super/*android.view.View*/.setScaleY(this.f13176g * fPow);
        InterfaceC1385b interfaceC1385b = this.f13174e;
        if (interfaceC1385b != null) {
            interfaceC1385b.mo3555a(fM11893f, fPow);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m11879f() {
        this.f13172c.m11894g(this);
    }

    /* JADX INFO: renamed from: g */
    public void m11880g(int i, int i2) {
        this.f13179j = i;
        this.f13178i = i2;
        setDarkMode(this.f13177h);
    }

    /* JADX INFO: renamed from: h */
    public void m11881h(@ColorInt int i, @ColorInt int[] iArr, @NonNull float[] fArr) {
        this.f13173d.m11887e(i, iArr, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public void m11882i() {
        this.f13172c.m11895h(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        this.f13173d.f13185d.set(0.0f, 0.0f, i, i2);
        postInvalidate();
    }

    public void setDarkMode(boolean z) {
        this.f13177h = z;
        if (z) {
            setImageResource(this.f13178i);
        } else {
            setImageResource(this.f13179j);
        }
    }

    public void setRippleListener(InterfaceC1385b interfaceC1385b) {
        this.f13174e = interfaceC1385b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScaleX(float f) {
        this.f13175f = f;
        super/*android.view.View*/.setScaleX(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScaleY(float f) {
        this.f13176g = f;
        super/*android.view.View*/.setScaleY(f);
    }

    public VBottomBarRippleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13172c = new C1386c();
        this.f13173d = new C1384a();
        this.f13175f = 1.0f;
        this.f13176g = 1.0f;
    }

    public VBottomBarRippleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13172c = new C1386c();
        this.f13173d = new C1384a();
        this.f13175f = 1.0f;
        this.f13176g = 1.0f;
    }
}
