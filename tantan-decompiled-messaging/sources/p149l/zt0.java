package p149l;

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

/* JADX INFO: loaded from: classes3.dex */
public class zt0 extends uj40 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: f */
    public static int f204655f = 0;

    /* JADX INFO: renamed from: g */
    public static int f204656g = 1;

    /* JADX INFO: renamed from: h */
    public static float f204657h = 1.08f;

    /* JADX INFO: renamed from: i */
    public static int f204658i = t100.m186890d(1.5f);

    /* JADX INFO: renamed from: a */
    public WeakReference<l4m> f204659a;

    /* JADX INFO: renamed from: b */
    public int f204660b;

    /* JADX INFO: renamed from: c */
    public boolean f204661c;

    /* JADX INFO: renamed from: d */
    public PaintFlagsDrawFilter f204662d;

    /* JADX INFO: renamed from: e */
    public vo0 f204663e;

    public zt0(@NonNull Context context, String str, int i, l4m l4mVar) {
        super(context, i);
        this.f204660b = f204655f;
        this.f204661c = false;
        m220085c(context, str, l4mVar);
        this.f204659a = new WeakReference<>(l4mVar);
        this.f204661c = true;
        this.f204662d = new PaintFlagsDrawFilter(0, 3);
    }

    /* JADX INFO: renamed from: a */
    public void m220083a() {
        vo0 vo0Var = this.f204663e;
        if (vo0Var == null || !vo0Var.m199091c()) {
            return;
        }
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallbackDelayed(this, this.f204663e.m199094f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final boolean m220084b() {
        WeakReference<l4m> weakReference = this.f204659a;
        if (weakReference != null && weakReference.get() != null) {
            l4m l4mVar = this.f204659a.get();
            if (NullChecker.m81303a(l4mVar)) {
                if (l4mVar instanceof View) {
                    Activity activityM208328E = xdl0.m208328E((View) l4mVar);
                    if (!NullChecker.m81303a(activityM208328E) || activityM208328E.isFinishing() || activityM208328E.isDestroyed()) {
                        return false;
                    }
                }
                this.f204663e.m199089a();
                l4mVar.mo148450f(0);
                this.f204663e.m199092d();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m220085c(Context context, String str, l4m l4mVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f204663e = new xt0().m210953d(context, str, new WeakReference<>(l4mVar));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m220086d() {
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    @SuppressLint({"LogUseError"})
    public void doFrame(long j) {
        if (m220084b()) {
            m220083a();
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.bottom - fontMetricsInt.top;
        int i7 = i6 / 2;
        int i8 = ((int) f) + i7 + f204658i;
        int iSave = canvas.save();
        canvas.translate(i8, i3 + ((i5 - i3) / 2));
        canvas.setDrawFilter(this.f204662d);
        if (this.f204661c) {
            vo0 vo0Var = this.f204663e;
            if (vo0Var != null && vo0Var.m199091c() && NullChecker.m81303a(this.f204663e.m199093e())) {
                uo0 uo0VarM199093e = this.f204663e.m199093e();
                float f2 = (-i6) / 2;
                float f3 = f204657h;
                float f4 = i7;
                canvas.drawBitmap(uo0VarM199093e.f177485a, uo0VarM199093e.f177486b, new RectF(f2 * f3, f2 * f3, f4 * f3, f4 * f3), (Paint) null);
                if (this.f204660b == f204655f) {
                    this.f204660b = f204656g;
                    m220083a();
                }
            } else {
                Drawable drawable = getDrawable();
                float f5 = (-i6) / 2;
                float f6 = f204657h;
                float f7 = i7;
                drawable.setBounds(new Rect((int) (f5 * f6), (int) (f5 * f6), (int) (f7 * f6), (int) (f7 * f6)));
                drawable.draw(canvas);
            }
        } else {
            Drawable drawable2 = getDrawable();
            float f8 = (-i6) / 2;
            float f9 = f204657h;
            float f10 = i7;
            drawable2.setBounds(new Rect((int) (f8 * f9), (int) (f8 * f9), (int) (f10 * f9), (int) (f10 * f9)));
            drawable2.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.leading = fontMetricsInt2.leading;
        }
        return (fontMetricsInt2.bottom - fontMetricsInt2.top) + (f204658i * 2);
    }

    public zt0(@NonNull Drawable drawable, int i) {
        super(drawable, i);
        this.f204660b = f204655f;
        this.f204661c = false;
    }
}
