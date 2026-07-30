package p153l;

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
import com.bumptech.glide.ComponentCallbacks2C1057a;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bnj extends Drawable implements hnj.InterfaceC17520b, Animatable {

    /* JADX INFO: renamed from: a */
    private final C16058a f77484a;

    /* JADX INFO: renamed from: b */
    private boolean f77485b;

    /* JADX INFO: renamed from: c */
    private boolean f77486c;

    /* JADX INFO: renamed from: d */
    private boolean f77487d;

    /* JADX INFO: renamed from: e */
    private boolean f77488e;

    /* JADX INFO: renamed from: f */
    private int f77489f;

    /* JADX INFO: renamed from: g */
    private int f77490g;

    /* JADX INFO: renamed from: h */
    private boolean f77491h;

    /* JADX INFO: renamed from: i */
    private Paint f77492i;

    /* JADX INFO: renamed from: j */
    private Rect f77493j;

    /* JADX INFO: renamed from: k */
    private List<tp0> f77494k;

    public bnj(Context context, anj anjVar, tgj0<Bitmap> tgj0Var, int i, int i2, Bitmap bitmap) {
        this(new C16058a(new hnj(ComponentCallbacks2C1057a.m5319c(context), anjVar, i, i2, tgj0Var, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private Drawable.Callback m105398b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* JADX INFO: renamed from: d */
    private Rect m105399d() {
        if (this.f77493j == null) {
            this.f77493j = new Rect();
        }
        return this.f77493j;
    }

    /* JADX INFO: renamed from: h */
    private Paint m105400h() {
        if (this.f77492i == null) {
            this.f77492i = new Paint(2);
        }
        return this.f77492i;
    }

    /* JADX INFO: renamed from: j */
    private void m105401j() {
        List<tp0> list = this.f77494k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f77494k.get(i).onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m105402l() {
        this.f77489f = 0;
    }

    /* JADX INFO: renamed from: n */
    private void m105403n() {
        vn80.m201941a(!this.f77487d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f77484a.f77495a.m136137f() == 1) {
            invalidateSelf();
        } else {
            if (this.f77485b) {
                return;
            }
            this.f77485b = true;
            this.f77484a.f77495a.m136143r(this);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: o */
    private void m105404o() {
        this.f77485b = false;
        this.f77484a.f77495a.m136144s(this);
    }

    @Override // p153l.hnj.InterfaceC17520b
    /* JADX INFO: renamed from: a */
    public void mo105405a() {
        if (m105398b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m105409g() == m105408f() - 1) {
            this.f77489f++;
        }
        int i = this.f77490g;
        if (i == -1 || this.f77489f < i) {
            return;
        }
        m105401j();
        stop();
    }

    /* JADX INFO: renamed from: c */
    public ByteBuffer m105406c() {
        return this.f77484a.f77495a.m136133b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f77487d) {
            return;
        }
        if (this.f77491h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m105399d());
            this.f77491h = false;
        }
        canvas.drawBitmap(this.f77484a.f77495a.m136134c(), (Rect) null, m105399d(), m105400h());
    }

    /* JADX INFO: renamed from: e */
    public Bitmap m105407e() {
        return this.f77484a.f77495a.m136136e();
    }

    /* JADX INFO: renamed from: f */
    public int m105408f() {
        return this.f77484a.f77495a.m136137f();
    }

    /* JADX INFO: renamed from: g */
    public int m105409g() {
        return this.f77484a.f77495a.m136135d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f77484a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f77484a.f77495a.m136138h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f77484a.f77495a.m136140k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* JADX INFO: renamed from: i */
    public int m105410i() {
        return this.f77484a.f77495a.m136139j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f77485b;
    }

    /* JADX INFO: renamed from: k */
    public void m105411k() {
        this.f77487d = true;
        this.f77484a.f77495a.m136132a();
    }

    /* JADX INFO: renamed from: m */
    public void m105412m(tgj0<Bitmap> tgj0Var, Bitmap bitmap) {
        this.f77484a.f77495a.m136142o(tgj0Var, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f77491h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m105400h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m105400h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        vn80.m201941a(!this.f77487d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f77488e = z;
        if (!z) {
            m105404o();
        } else if (this.f77486c) {
            m105403n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f77486c = true;
        m105402l();
        if (this.f77488e) {
            m105403n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f77486c = false;
        m105404o();
    }

    /* JADX INFO: renamed from: l.bnj$a */
    public static final class C16058a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        @VisibleForTesting
        final hnj f77495a;

        public C16058a(hnj hnjVar) {
            this.f77495a = hnjVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new bnj(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public bnj(C16058a c16058a) {
        this.f77488e = true;
        this.f77490g = -1;
        this.f77484a = (C16058a) vn80.m201944d(c16058a);
    }
}
