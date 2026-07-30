package p147v.bottombar;

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
import p149l.f16;
import p149l.t0c0;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBarRippleView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public C22593c f209547c;

    /* JADX INFO: renamed from: d */
    public C22591a f209548d;

    /* JADX INFO: renamed from: e */
    public InterfaceC22592b f209549e;

    /* JADX INFO: renamed from: f */
    public float f209550f;

    /* JADX INFO: renamed from: g */
    public float f209551g;

    /* JADX INFO: renamed from: h */
    public boolean f209552h;

    /* JADX INFO: renamed from: i */
    public int f209553i;

    /* JADX INFO: renamed from: j */
    public int f209554j;

    /* JADX INFO: renamed from: v.bottombar.VBottomBarRippleView$a */
    public static class C22591a {

        /* JADX INFO: renamed from: e */
        public static final Paint f209555e = new Paint(3);

        /* JADX INFO: renamed from: f */
        public static final Xfermode f209556f = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);

        /* JADX INFO: renamed from: a */
        @ColorInt
        public int f209557a;

        /* JADX INFO: renamed from: b */
        @ColorInt
        public int[] f209558b;

        /* JADX INFO: renamed from: c */
        public float[] f209559c;

        /* JADX INFO: renamed from: d */
        public RectF f209560d;

        public C22591a() {
            this.f209557a = f16.m119092a().getResources().getColor(t0c0.f167154f);
            this.f209558b = new int[]{f16.m119092a().getResources().getColor(t0c0.f167155g), f16.m119092a().getResources().getColor(t0c0.f167156h), f16.m119092a().getResources().getColor(t0c0.f167157i), f16.m119092a().getResources().getColor(t0c0.f167158j)};
            this.f209559c = new float[]{0.0f, 0.28f, 0.62f, 1.0f};
            this.f209560d = new RectF();
        }

        /* JADX INFO: renamed from: d */
        public final void m223385d(Canvas canvas, float f) {
            Paint paint = f209555e;
            paint.setXfermode(f209556f);
            if (Math.min(this.f209560d.width(), this.f209560d.height()) > 0.0f) {
                if (f < 0.8f) {
                    float fWidth = this.f209560d.width() / 2.0f;
                    float fHeight = (this.f209560d.height() * 4.0f) / 5.0f;
                    float fMin = Math.min(this.f209560d.width(), this.f209560d.height()) * (0.01f + f) * 2.0f;
                    int i = this.f209557a;
                    paint.setShader(new RadialGradient(fWidth, fHeight, fMin, new int[]{i, i, 0}, new float[]{0.0f, f / 2.0f, 1.0f}, Shader.TileMode.CLAMP));
                } else {
                    paint.setShader(new LinearGradient(0.0f, this.f209560d.height(), this.f209560d.width(), 0.0f, this.f209558b, this.f209559c, Shader.TileMode.CLAMP));
                }
                canvas.drawCircle(this.f209560d.centerX(), this.f209560d.centerY(), Math.min(this.f209560d.width(), this.f209560d.height()), paint);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m223386e(@ColorInt int i, @ColorInt int[] iArr, @NonNull float[] fArr) {
            this.f209557a = i;
            this.f209558b = iArr;
            this.f209559c = fArr;
        }
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBarRippleView$b */
    public interface InterfaceC22592b {
        /* JADX INFO: renamed from: a */
        void mo111494a(float f, float f2);
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBarRippleView$c */
    public static class C22593c {

        /* JADX INFO: renamed from: d */
        public static final Interpolator f209561d = new DecelerateInterpolator();

        /* JADX INFO: renamed from: a */
        public long f209562a;

        /* JADX INFO: renamed from: b */
        public int f209563b;

        /* JADX INFO: renamed from: c */
        public float f209564c;

        public C22593c() {
            this.f209562a = -2L;
            this.f209563b = 1000;
            this.f209564c = 0.0f;
        }

        /* JADX INFO: renamed from: e */
        public final void m223391e(View view) {
            this.f209562a = -2L;
            this.f209564c = 1.0f;
            view.postInvalidate();
        }

        /* JADX INFO: renamed from: f */
        public final float m223392f(View view) {
            long j = this.f209562a;
            if (j == -2) {
                return this.f209564c;
            }
            if (j == -1) {
                this.f209562a = SystemClock.elapsedRealtime();
                this.f209564c = 0.0f;
                view.postInvalidate();
            } else {
                float fElapsedRealtime = ((SystemClock.elapsedRealtime() - this.f209562a) * 1.0f) / this.f209563b;
                if (fElapsedRealtime > 1.0f) {
                    if (this.f209564c != 1.0f) {
                        view.postInvalidate();
                    }
                    this.f209564c = 1.0f;
                } else if (fElapsedRealtime < 0.0f) {
                    if (this.f209564c != 0.0f) {
                        view.postInvalidate();
                    }
                    this.f209564c = 0.0f;
                } else {
                    this.f209564c = f209561d.getInterpolation(fElapsedRealtime);
                    view.postInvalidate();
                }
            }
            return this.f209564c;
        }

        /* JADX INFO: renamed from: g */
        public final void m223393g(View view) {
            this.f209562a = -2L;
            this.f209564c = 0.0f;
            view.postInvalidate();
        }

        /* JADX INFO: renamed from: h */
        public final void m223394h(View view) {
            this.f209562a = -1L;
            view.postInvalidate();
        }
    }

    public VBottomBarRippleView(Context context) {
        super(context);
        this.f209547c = new C22593c();
        this.f209548d = new C22591a();
        this.f209550f = 1.0f;
        this.f209551g = 1.0f;
    }

    /* JADX INFO: renamed from: d */
    public void m223377d() {
        this.f209547c.m223391e(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        float fM223392f = this.f209547c.m223392f(this);
        int iSaveLayer = canvas.saveLayer(this.f209548d.f209560d, C22591a.f209555e, 31);
        super.draw(canvas);
        this.f209548d.m223385d(canvas, fM223392f);
        canvas.restoreToCount(iSaveLayer);
        float fPow = (((float) (Math.pow(1.0f - fM223392f, 2.0d) * ((double) ((float) Math.sin(((double) fM223392f) * 9.42477796076938d))))) * 0.4f) + 1.0f;
        super.setScaleX(this.f209550f * fPow);
        super.setScaleY(this.f209551g * fPow);
        InterfaceC22592b interfaceC22592b = this.f209549e;
        if (interfaceC22592b != null) {
            interfaceC22592b.mo111494a(fM223392f, fPow);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m223378f() {
        this.f209547c.m223393g(this);
    }

    /* JADX INFO: renamed from: g */
    public void m223379g(int i, int i2) {
        this.f209554j = i;
        this.f209553i = i2;
        setDarkMode(this.f209552h);
    }

    /* JADX INFO: renamed from: h */
    public void m223380h(@ColorInt int i, @ColorInt int[] iArr, @NonNull float[] fArr) {
        this.f209548d.m223386e(i, iArr, fArr);
    }

    /* JADX INFO: renamed from: i */
    public void m223381i() {
        this.f209547c.m223394h(this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f209548d.f209560d.set(0.0f, 0.0f, i, i2);
        postInvalidate();
    }

    public void setDarkMode(boolean z) {
        this.f209552h = z;
        if (z) {
            setImageResource(this.f209553i);
        } else {
            setImageResource(this.f209554j);
        }
    }

    public void setRippleListener(InterfaceC22592b interfaceC22592b) {
        this.f209549e = interfaceC22592b;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f209550f = f;
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f209551g = f;
        super.setScaleY(f);
    }

    public VBottomBarRippleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209547c = new C22593c();
        this.f209548d = new C22591a();
        this.f209550f = 1.0f;
        this.f209551g = 1.0f;
    }

    public VBottomBarRippleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209547c = new C22593c();
        this.f209548d = new C22591a();
        this.f209550f = 1.0f;
        this.f209551g = 1.0f;
    }
}
