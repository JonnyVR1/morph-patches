package p151v.bottombar;

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
import p153l.k26;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBarRippleView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public C22708c f210469c;

    /* JADX INFO: renamed from: d */
    public C22706a f210470d;

    /* JADX INFO: renamed from: e */
    public InterfaceC22707b f210471e;

    /* JADX INFO: renamed from: f */
    public float f210472f;

    /* JADX INFO: renamed from: g */
    public float f210473g;

    /* JADX INFO: renamed from: h */
    public boolean f210474h;

    /* JADX INFO: renamed from: i */
    public int f210475i;

    /* JADX INFO: renamed from: j */
    public int f210476j;

    /* JADX INFO: renamed from: v.bottombar.VBottomBarRippleView$a */
    public static class C22706a {

        /* JADX INFO: renamed from: e */
        public static final Paint f210477e = new Paint(3);

        /* JADX INFO: renamed from: f */
        public static final Xfermode f210478f = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);

        /* JADX INFO: renamed from: a */
        @ColorInt
        public int f210479a;

        /* JADX INFO: renamed from: b */
        @ColorInt
        public int[] f210480b;

        /* JADX INFO: renamed from: c */
        public float[] f210481c;

        /* JADX INFO: renamed from: d */
        public RectF f210482d;

        public C22706a() {
            this.f210479a = k26.m147943a().getResources().getColor(z8c0.f203345f);
            this.f210480b = new int[]{k26.m147943a().getResources().getColor(z8c0.f203346g), k26.m147943a().getResources().getColor(z8c0.f203347h), k26.m147943a().getResources().getColor(z8c0.f203348i), k26.m147943a().getResources().getColor(z8c0.f203349j)};
            this.f210481c = new float[]{0.0f, 0.28f, 0.62f, 1.0f};
            this.f210482d = new RectF();
        }

        /* JADX INFO: renamed from: d */
        public final void m224631d(Canvas canvas, float f) {
            Paint paint = f210477e;
            paint.setXfermode(f210478f);
            if (Math.min(this.f210482d.width(), this.f210482d.height()) > 0.0f) {
                if (f < 0.8f) {
                    float fWidth = this.f210482d.width() / 2.0f;
                    float fHeight = (this.f210482d.height() * 4.0f) / 5.0f;
                    float fMin = Math.min(this.f210482d.width(), this.f210482d.height()) * (0.01f + f) * 2.0f;
                    int i = this.f210479a;
                    paint.setShader(new RadialGradient(fWidth, fHeight, fMin, new int[]{i, i, 0}, new float[]{0.0f, f / 2.0f, 1.0f}, Shader.TileMode.CLAMP));
                } else {
                    paint.setShader(new LinearGradient(0.0f, this.f210482d.height(), this.f210482d.width(), 0.0f, this.f210480b, this.f210481c, Shader.TileMode.CLAMP));
                }
                canvas.drawCircle(this.f210482d.centerX(), this.f210482d.centerY(), Math.min(this.f210482d.width(), this.f210482d.height()), paint);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m224632e(@ColorInt int i, @ColorInt int[] iArr, @NonNull float[] fArr) {
            this.f210479a = i;
            this.f210480b = iArr;
            this.f210481c = fArr;
        }
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBarRippleView$b */
    public interface InterfaceC22707b {
        /* JADX INFO: renamed from: a */
        void mo146469a(float f, float f2);
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBarRippleView$c */
    public static class C22708c {

        /* JADX INFO: renamed from: d */
        public static final Interpolator f210483d = new DecelerateInterpolator();

        /* JADX INFO: renamed from: a */
        public long f210484a;

        /* JADX INFO: renamed from: b */
        public int f210485b;

        /* JADX INFO: renamed from: c */
        public float f210486c;

        public C22708c() {
            this.f210484a = -2L;
            this.f210485b = 1000;
            this.f210486c = 0.0f;
        }

        /* JADX INFO: renamed from: e */
        public final void m224637e(View view) {
            this.f210484a = -2L;
            this.f210486c = 1.0f;
            view.postInvalidate();
        }

        /* JADX INFO: renamed from: f */
        public final float m224638f(View view) {
            long j = this.f210484a;
            if (j == -2) {
                return this.f210486c;
            }
            if (j == -1) {
                this.f210484a = SystemClock.elapsedRealtime();
                this.f210486c = 0.0f;
                view.postInvalidate();
            } else {
                float fElapsedRealtime = ((SystemClock.elapsedRealtime() - this.f210484a) * 1.0f) / this.f210485b;
                if (fElapsedRealtime > 1.0f) {
                    if (this.f210486c != 1.0f) {
                        view.postInvalidate();
                    }
                    this.f210486c = 1.0f;
                } else if (fElapsedRealtime < 0.0f) {
                    if (this.f210486c != 0.0f) {
                        view.postInvalidate();
                    }
                    this.f210486c = 0.0f;
                } else {
                    this.f210486c = f210483d.getInterpolation(fElapsedRealtime);
                    view.postInvalidate();
                }
            }
            return this.f210486c;
        }

        /* JADX INFO: renamed from: g */
        public final void m224639g(View view) {
            this.f210484a = -2L;
            this.f210486c = 0.0f;
            view.postInvalidate();
        }

        /* JADX INFO: renamed from: h */
        public final void m224640h(View view) {
            this.f210484a = -1L;
            view.postInvalidate();
        }
    }

    public VBottomBarRippleView(Context context) {
        super(context);
        this.f210469c = new C22708c();
        this.f210470d = new C22706a();
        this.f210472f = 1.0f;
        this.f210473g = 1.0f;
    }

    /* JADX INFO: renamed from: d */
    public void m224623d() {
        this.f210469c.m224637e(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        float fM224638f = this.f210469c.m224638f(this);
        int iSaveLayer = canvas.saveLayer(this.f210470d.f210482d, C22706a.f210477e, 31);
        super.draw(canvas);
        this.f210470d.m224631d(canvas, fM224638f);
        canvas.restoreToCount(iSaveLayer);
        float fPow = (((float) (Math.pow(1.0f - fM224638f, 2.0d) * ((double) ((float) Math.sin(((double) fM224638f) * 9.42477796076938d))))) * 0.4f) + 1.0f;
        super.setScaleX(this.f210472f * fPow);
        super.setScaleY(this.f210473g * fPow);
        InterfaceC22707b interfaceC22707b = this.f210471e;
        if (interfaceC22707b != null) {
            interfaceC22707b.mo146469a(fM224638f, fPow);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m224624f() {
        this.f210469c.m224639g(this);
    }

    /* JADX INFO: renamed from: g */
    public void m224625g(int i, int i2) {
        this.f210476j = i;
        this.f210475i = i2;
        setDarkMode(this.f210474h);
    }

    /* JADX INFO: renamed from: h */
    public void m224626h(@ColorInt int i, @ColorInt int[] iArr, @NonNull float[] fArr) {
        this.f210470d.m224632e(i, iArr, fArr);
    }

    /* JADX INFO: renamed from: i */
    public void m224627i() {
        this.f210469c.m224640h(this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f210470d.f210482d.set(0.0f, 0.0f, i, i2);
        postInvalidate();
    }

    public void setDarkMode(boolean z) {
        this.f210474h = z;
        if (z) {
            setImageResource(this.f210475i);
        } else {
            setImageResource(this.f210476j);
        }
    }

    public void setRippleListener(InterfaceC22707b interfaceC22707b) {
        this.f210471e = interfaceC22707b;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f210472f = f;
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f210473g = f;
        super.setScaleY(f);
    }

    public VBottomBarRippleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210469c = new C22708c();
        this.f210470d = new C22706a();
        this.f210472f = 1.0f;
        this.f210473g = 1.0f;
    }

    public VBottomBarRippleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210469c = new C22708c();
        this.f210470d = new C22706a();
        this.f210472f = 1.0f;
        this.f210473g = 1.0f;
    }
}
