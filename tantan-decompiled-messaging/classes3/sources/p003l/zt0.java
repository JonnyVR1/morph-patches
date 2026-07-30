package p003l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.t100;
import l.uj40;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zt0 extends uj40 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: f */
    public static int f9414f = 0;

    /* JADX INFO: renamed from: g */
    public static int f9415g = 1;

    /* JADX INFO: renamed from: h */
    public static float f9416h = 1.08f;

    /* JADX INFO: renamed from: i */
    public static int f9417i = t100.d(1.5f);

    /* JADX INFO: renamed from: a */
    public WeakReference<l4m> f9418a;

    /* JADX INFO: renamed from: b */
    public int f9419b;

    /* JADX INFO: renamed from: c */
    public boolean f9420c;

    /* JADX INFO: renamed from: d */
    public PaintFlagsDrawFilter f9421d;

    /* JADX INFO: renamed from: e */
    public vo0 f9422e;

    public zt0(@NonNull Context context, String str, int i, l4m l4mVar) {
        super(context, i);
        this.f9419b = f9414f;
        this.f9420c = false;
        m9463c(context, str, l4mVar);
        this.f9418a = new WeakReference<>(l4mVar);
        this.f9420c = true;
        this.f9421d = new PaintFlagsDrawFilter(0, 3);
    }

    /* JADX INFO: renamed from: a */
    public void m9461a() {
        vo0 vo0Var = this.f9422e;
        if (vo0Var == null || !vo0Var.m8387c()) {
            return;
        }
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallbackDelayed(this, this.f9422e.m8390f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final boolean m9462b() {
        WeakReference<l4m> weakReference = this.f9418a;
        if (weakReference != null && weakReference.get() != null) {
            l4m l4mVar = this.f9418a.get();
            if (NullChecker.a(l4mVar)) {
                if (l4mVar instanceof View) {
                    Activity activityE = xdl0.E((View) l4mVar);
                    if (!NullChecker.a(activityE) || activityE.isFinishing() || activityE.isDestroyed()) {
                        return false;
                    }
                }
                this.f9422e.m8385a();
                l4mVar.mo5972f(0);
                this.f9422e.m8388d();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m9463c(Context context, String str, l4m l4mVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9422e = new xt0().m8861d(context, str, new WeakReference<>(l4mVar));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m9464d() {
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    @SuppressLint({"LogUseError"})
    public void doFrame(long j) {
        if (m9462b()) {
            m9461a();
        }
    }

    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.bottom - fontMetricsInt.top;
        int i7 = i6 / 2;
        int i8 = ((int) f) + i7 + f9417i;
        int iSave = canvas.save();
        canvas.translate(i8, i3 + ((i5 - i3) / 2));
        canvas.setDrawFilter(this.f9421d);
        if (this.f9420c) {
            vo0 vo0Var = this.f9422e;
            if (vo0Var != null && vo0Var.m8387c() && NullChecker.a(this.f9422e.m8389e())) {
                uo0 uo0VarM8389e = this.f9422e.m8389e();
                float f2 = (-i6) / 2;
                float f3 = f9416h;
                float f4 = i7;
                canvas.drawBitmap(uo0VarM8389e.f8040a, uo0VarM8389e.f8041b, new RectF(f2 * f3, f2 * f3, f4 * f3, f4 * f3), (Paint) null);
                if (this.f9419b == f9414f) {
                    this.f9419b = f9415g;
                    m9461a();
                }
            } else {
                Drawable drawable = getDrawable();
                float f5 = (-i6) / 2;
                float f6 = f9416h;
                float f7 = i7;
                drawable.setBounds(new Rect((int) (f5 * f6), (int) (f5 * f6), (int) (f7 * f6), (int) (f7 * f6)));
                drawable.draw(canvas);
            }
        } else {
            Drawable drawable2 = getDrawable();
            float f8 = (-i6) / 2;
            float f9 = f9416h;
            float f10 = i7;
            drawable2.setBounds(new Rect((int) (f8 * f9), (int) (f8 * f9), (int) (f10 * f9), (int) (f10 * f9)));
            drawable2.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.leading = fontMetricsInt2.leading;
        }
        return (fontMetricsInt2.bottom - fontMetricsInt2.top) + (f9417i * 2);
    }

    public zt0(@NonNull Drawable drawable, int i) {
        super(drawable, i);
        this.f9419b = f9414f;
        this.f9420c = false;
    }
}
