package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lkj extends Drawable implements rkj.InterfaceC19726b, Animatable {

    /* JADX INFO: renamed from: a */
    private final C18247a f128538a;

    /* JADX INFO: renamed from: b */
    private boolean f128539b;

    /* JADX INFO: renamed from: c */
    private boolean f128540c;

    /* JADX INFO: renamed from: d */
    private boolean f128541d;

    /* JADX INFO: renamed from: e */
    private boolean f128542e;

    /* JADX INFO: renamed from: f */
    private int f128543f;

    /* JADX INFO: renamed from: g */
    private int f128544g;

    /* JADX INFO: renamed from: h */
    private boolean f128545h;

    /* JADX INFO: renamed from: i */
    private Paint f128546i;

    /* JADX INFO: renamed from: j */
    private Rect f128547j;

    /* JADX INFO: renamed from: k */
    private List<xp0> f128548k;

    public lkj(Context context, kkj kkjVar, p7j0<Bitmap> p7j0Var, int i, int i2, Bitmap bitmap) {
        this(new C18247a(new rkj(ComponentCallbacks2C1053a.m5309c(context), kkjVar, i, i2, p7j0Var, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private Drawable.Callback m150270b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* JADX INFO: renamed from: d */
    private Rect m150271d() {
        if (this.f128547j == null) {
            this.f128547j = new Rect();
        }
        return this.f128547j;
    }

    /* JADX INFO: renamed from: h */
    private Paint m150272h() {
        if (this.f128546i == null) {
            this.f128546i = new Paint(2);
        }
        return this.f128546i;
    }

    /* JADX INFO: renamed from: j */
    private static String m150273j(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: k */
    private void m150274k() {
        List<xp0> list = this.f128548k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f128548k.get(i).onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private void m150275m() {
        this.f128543f = 0;
    }

    /* JADX INFO: renamed from: o */
    private void m150276o() {
        qf80.m174273a(!this.f128541d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f128538a.f128549a.m179753f() == 1) {
            invalidateSelf();
        } else {
            if (this.f128539b) {
                return;
            }
            this.f128539b = true;
            this.f128538a.f128549a.m179759r(this);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: p */
    private void m150277p() {
        this.f128539b = false;
        this.f128538a.f128549a.m179760s(this);
    }

    @Override // p149l.rkj.InterfaceC19726b
    /* JADX INFO: renamed from: a */
    public void mo150278a() {
        if (m150270b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m150282g() == m150281f() - 1) {
            this.f128543f++;
        }
        int i = this.f128544g;
        if (i == -1 || this.f128543f < i) {
            return;
        }
        m150274k();
        stop();
    }

    /* JADX INFO: renamed from: c */
    public ByteBuffer m150279c() {
        return this.f128538a.f128549a.m179749b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f128541d) {
            return;
        }
        if (this.f128545h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m150271d());
            this.f128545h = false;
        }
        Bitmap bitmapM179750c = this.f128538a.f128549a.m179750c();
        if (bitmapM179750c != null) {
            canvas.drawBitmap(bitmapM179750c, (Rect) null, m150271d(), m150272h());
        }
    }

    /* JADX INFO: renamed from: e */
    public Bitmap m150280e() {
        return this.f128538a.f128549a.m179752e();
    }

    /* JADX INFO: renamed from: f */
    public int m150281f() {
        return this.f128538a.f128549a.m179753f();
    }

    /* JADX INFO: renamed from: g */
    public int m150282g() {
        return this.f128538a.f128549a.m179751d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f128538a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f128538a.f128549a.m179754h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f128538a.f128549a.m179756k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* JADX INFO: renamed from: i */
    public int m150283i() {
        return this.f128538a.f128549a.m179755j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f128539b;
    }

    /* JADX INFO: renamed from: l */
    public void m150284l() {
        this.f128541d = true;
        this.f128538a.f128549a.m179748a();
    }

    /* JADX INFO: renamed from: n */
    public void m150285n(p7j0<Bitmap> p7j0Var, Bitmap bitmap) {
        this.f128538a.f128549a.m179758o(p7j0Var, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f128545h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m150272h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m150272h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        qf80.m174273a(!this.f128541d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f128542e = z;
        if (!z) {
            m150277p();
        } else if (this.f128540c) {
            try {
                m150276o();
            } catch (Exception e) {
                if (ComponentCallbacks2C1053a.m5314o()) {
                    gnw.m127190a("momo-basic").m128649e("ImageLoader").m128650f("runningCrash").m128645a(onw.m165240j(m150273j(e))).m128647c();
                }
                e.printStackTrace();
            }
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f128540c = true;
        m150275m();
        if (this.f128542e) {
            m150276o();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f128540c = false;
        m150277p();
    }

    /* JADX INFO: renamed from: l.lkj$a */
    public static final class C18247a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        @VisibleForTesting
        final rkj f128549a;

        public C18247a(rkj rkjVar) {
            this.f128549a = rkjVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new lkj(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public lkj(C18247a c18247a) {
        this.f128542e = true;
        this.f128544g = -1;
        this.f128538a = (C18247a) qf80.m174276d(c18247a);
    }
}
