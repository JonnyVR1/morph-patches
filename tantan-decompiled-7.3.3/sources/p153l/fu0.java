package p153l;

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
public class fu0 extends is40 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: f */
    public static int f100823f = 0;

    /* JADX INFO: renamed from: g */
    public static int f100824g = 1;

    /* JADX INFO: renamed from: h */
    public static float f100825h = 1.08f;

    /* JADX INFO: renamed from: i */
    public static int f100826i = qa00.m175859d(1.5f);

    /* JADX INFO: renamed from: a */
    public WeakReference<c7m> f100827a;

    /* JADX INFO: renamed from: b */
    public int f100828b;

    /* JADX INFO: renamed from: c */
    public boolean f100829c;

    /* JADX INFO: renamed from: d */
    public PaintFlagsDrawFilter f100830d;

    /* JADX INFO: renamed from: e */
    public ro0 f100831e;

    public fu0(@NonNull Context context, String str, int i, c7m c7mVar) {
        super(context, i);
        this.f100828b = f100823f;
        this.f100829c = false;
        m127409c(context, str, c7mVar);
        this.f100827a = new WeakReference<>(c7mVar);
        this.f100829c = true;
        this.f100830d = new PaintFlagsDrawFilter(0, 3);
    }

    /* JADX INFO: renamed from: a */
    public void m127407a() {
        ro0 ro0Var = this.f100831e;
        if (ro0Var == null || !ro0Var.m182354c()) {
            return;
        }
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallbackDelayed(this, this.f100831e.m182357f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final boolean m127408b() {
        WeakReference<c7m> weakReference = this.f100827a;
        if (weakReference != null && weakReference.get() != null) {
            c7m c7mVar = this.f100827a.get();
            if (NullChecker.m82486a(c7mVar)) {
                if (c7mVar instanceof View) {
                    Activity activityM105508E = bnl0.m105508E((View) c7mVar);
                    if (!NullChecker.m82486a(activityM105508E) || activityM105508E.isFinishing() || activityM105508E.isDestroyed()) {
                        return false;
                    }
                }
                this.f100831e.m182352a();
                c7mVar.mo108308f(0);
                this.f100831e.m182355d();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m127409c(Context context, String str, c7m c7mVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f100831e = new du0().m117946d(context, str, new WeakReference<>(c7mVar));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m127410d() {
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    @SuppressLint({"LogUseError"})
    public void doFrame(long j) {
        if (m127408b()) {
            m127407a();
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.bottom - fontMetricsInt.top;
        int i7 = i6 / 2;
        int i8 = ((int) f) + i7 + f100826i;
        int iSave = canvas.save();
        canvas.translate(i8, i3 + ((i5 - i3) / 2));
        canvas.setDrawFilter(this.f100830d);
        if (this.f100829c) {
            ro0 ro0Var = this.f100831e;
            if (ro0Var != null && ro0Var.m182354c() && NullChecker.m82486a(this.f100831e.m182356e())) {
                qo0 qo0VarM182356e = this.f100831e.m182356e();
                float f2 = (-i6) / 2;
                float f3 = f100825h;
                float f4 = i7;
                canvas.drawBitmap(qo0VarM182356e.f158677a, qo0VarM182356e.f158678b, new RectF(f2 * f3, f2 * f3, f4 * f3, f4 * f3), (Paint) null);
                if (this.f100828b == f100823f) {
                    this.f100828b = f100824g;
                    m127407a();
                }
            } else {
                Drawable drawable = getDrawable();
                float f5 = (-i6) / 2;
                float f6 = f100825h;
                float f7 = i7;
                drawable.setBounds(new Rect((int) (f5 * f6), (int) (f5 * f6), (int) (f7 * f6), (int) (f7 * f6)));
                drawable.draw(canvas);
            }
        } else {
            Drawable drawable2 = getDrawable();
            float f8 = (-i6) / 2;
            float f9 = f100825h;
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
        return (fontMetricsInt2.bottom - fontMetricsInt2.top) + (f100826i * 2);
    }

    public fu0(@NonNull Drawable drawable, int i) {
        super(drawable, i);
        this.f100828b = f100823f;
        this.f100829c = false;
    }
}
