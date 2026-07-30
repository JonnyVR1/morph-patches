package p151v;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.slf4j.Marker;
import p153l.bnl0;
import p153l.gt0;
import p153l.gzi0;
import p153l.qa00;
import p153l.wg3;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class TickerView extends View {

    /* JADX INFO: renamed from: x */
    public static final int f209886x = qa00.m175859d(14.0f);

    /* JADX INFO: renamed from: y */
    public static final Interpolator f209887y = new LinearInterpolator();

    /* JADX INFO: renamed from: a */
    public final Paint f209888a;

    /* JADX INFO: renamed from: b */
    public final Paint f209889b;

    /* JADX INFO: renamed from: c */
    public final Paint f209890c;

    /* JADX INFO: renamed from: d */
    public final Paint f209891d;

    /* JADX INFO: renamed from: e */
    public final ValueAnimator f209892e;

    /* JADX INFO: renamed from: f */
    public String f209893f;

    /* JADX INFO: renamed from: g */
    public int f209894g;

    /* JADX INFO: renamed from: h */
    public int f209895h;

    /* JADX INFO: renamed from: i */
    public int f209896i;

    /* JADX INFO: renamed from: j */
    public int f209897j;

    /* JADX INFO: renamed from: k */
    public int f209898k;

    /* JADX INFO: renamed from: l */
    public int f209899l;

    /* JADX INFO: renamed from: m */
    public int f209900m;

    /* JADX INFO: renamed from: n */
    public int f209901n;

    /* JADX INFO: renamed from: o */
    public float f209902o;

    /* JADX INFO: renamed from: p */
    public int f209903p;

    /* JADX INFO: renamed from: q */
    public float f209904q;

    /* JADX INFO: renamed from: r */
    public float f209905r;

    /* JADX INFO: renamed from: s */
    public float f209906s;

    /* JADX INFO: renamed from: t */
    public long f209907t;

    /* JADX INFO: renamed from: u */
    public long f209908u;

    /* JADX INFO: renamed from: v */
    public boolean f209909v;

    /* JADX INFO: renamed from: w */
    public ActionMode f209910w;

    public enum ActionMode {
        scroll,
        still,
        clear
    }

    /* JADX INFO: renamed from: v.TickerView$a */
    public static /* synthetic */ class C22648a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f209911a;

        static {
            int[] iArr = new int[ActionMode.values().length];
            f209911a = iArr;
            try {
                iArr[ActionMode.scroll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f209911a[ActionMode.still.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f209911a[ActionMode.clear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TickerView(Context context) {
        super(context);
        this.f209888a = new TextPaint(1);
        this.f209889b = new TextPaint(1);
        this.f209890c = new TextPaint(1);
        this.f209891d = new TextPaint(1);
        this.f209892e = ValueAnimator.ofFloat(1.0f);
        m224159g();
    }

    private String getAnimEndString() {
        if (!m224173u()) {
            return String.valueOf(this.f209895h);
        }
        return this.f209896i + Marker.ANY_NON_NULL_MARKER;
    }

    /* JADX INFO: renamed from: f */
    public void m224158f() {
        this.f209910w = ActionMode.clear;
        m224167o();
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public final void m224159g() {
        Paint paint = this.f209889b;
        int i = f209886x;
        paint.setTextSize(i);
        this.f209889b.setColor(-1);
        Paint paint2 = this.f209889b;
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        this.f209890c.setTextSize(i);
        this.f209890c.setColor(-1);
        this.f209890c.setTextAlign(align);
        this.f209888a.setTextSize(i);
        this.f209888a.setColor(-1);
        this.f209888a.setTextAlign(align);
        this.f209891d.setTextSize(i);
        this.f209891d.setColor(-1);
        this.f209891d.setTextAlign(align);
        this.f209892e.setInterpolator(f209887y);
        this.f209904q = this.f209889b.getTextSize();
        this.f209908u = 2600L;
        this.f209907t = 1000L;
        this.f209896i = 99;
        this.f209909v = true;
    }

    public long getDuration() {
        return this.f209892e.getDuration();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m224160h(int[] iArr) {
        m224168p();
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m224161i(x20 x20Var) {
        this.f209898k = this.f209897j + 1;
        invalidate();
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m224162j(x20 x20Var) {
        this.f209898k = this.f209897j + 1;
        invalidate();
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m224163k(long j, float f, int i, int i2, int i3, float f2, float f3, ValueAnimator valueAnimator) {
        int i4;
        int i5;
        float f4;
        float f5;
        float textScaleX;
        Paint paint;
        if (this.f209898k <= this.f209897j) {
            long currentPlayTime = valueAnimator.getCurrentPlayTime();
            long duration = valueAnimator.getDuration();
            int i6 = this.f209898k;
            if (currentPlayTime >= duration) {
                this.f209898k = i6 + 1;
            } else {
                if (i6 < this.f209897j) {
                    long currentPlayTime2 = valueAnimator.getCurrentPlayTime();
                    int i7 = this.f209899l;
                    if (currentPlayTime2 >= ((long) i7) * j) {
                        this.f209898k++;
                        this.f209899l = i7 + 1;
                        this.f209903p = 0;
                        this.f209905r = 0.0f;
                        this.f209906s = this.f209904q;
                        this.f209889b.setAlpha(255);
                        this.f209890c.setAlpha(0);
                    } else if (m224171s()) {
                        textScaleX = this.f209891d.getTextScaleX() + f;
                        paint = this.f209891d;
                        if (textScaleX < 1.0f) {
                            paint.setTextScaleX(textScaleX);
                        } else {
                            paint.setTextScaleX(1.0f);
                            Paint paint2 = this.f209891d;
                            paint2.setAlpha(paint2.getAlpha() + i);
                        }
                    } else {
                        i4 = this.f209898k;
                        i5 = this.f209897j;
                        if (i4 != i5) {
                            i2 = i3;
                        }
                        if (i4 != i5) {
                            f2 = f3;
                        }
                        int alpha = this.f209889b.getAlpha() - i2;
                        int alpha2 = this.f209890c.getAlpha() + i2;
                        this.f209889b.setAlpha(alpha >= i2 ? alpha : 0);
                        this.f209890c.setAlpha(255 - alpha2 >= i2 ? alpha2 : 255);
                        int i8 = this.f209903p;
                        this.f209903p = i8 + 1;
                        f4 = i8 * f2;
                        this.f209905r = f4;
                        f5 = this.f209904q;
                        if (f5 - f4 <= f2) {
                            f4 = f5;
                        }
                        this.f209905r = f4;
                        this.f209906s = f5 - f4;
                    }
                } else if (m224171s()) {
                    textScaleX = this.f209891d.getTextScaleX() + f;
                    paint = this.f209891d;
                    if (textScaleX < 1.0f) {
                        paint.setTextScaleX(textScaleX);
                    } else {
                        paint.setTextScaleX(1.0f);
                        Paint paint3 = this.f209891d;
                        paint3.setAlpha(paint3.getAlpha() + i);
                    }
                } else {
                    i4 = this.f209898k;
                    i5 = this.f209897j;
                    if (i4 != i5) {
                        i2 = i3;
                    }
                    if (i4 != i5) {
                        f2 = f3;
                    }
                    int alpha3 = this.f209889b.getAlpha() - i2;
                    int alpha4 = this.f209890c.getAlpha() + i2;
                    this.f209889b.setAlpha(alpha3 >= i2 ? alpha3 : 0);
                    this.f209890c.setAlpha(255 - alpha4 >= i2 ? alpha4 : 255);
                    int i9 = this.f209903p;
                    this.f209903p = i9 + 1;
                    f4 = i9 * f2;
                    this.f209905r = f4;
                    f5 = this.f209904q;
                    if (f5 - f4 <= f2) {
                        f4 = f5;
                    }
                    this.f209905r = f4;
                    this.f209906s = f5 - f4;
                }
            }
            invalidate();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m224164l(final x20 x20Var, final x20 x20Var2, final long j, final float f, final int i, final int i2, final int i3, final float f2, final float f3, int[] iArr) {
        m224169q();
        gt0.m132161g(this.f209892e, new Runnable() { // from class: l.jzi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f123263a.m224161i(x20Var);
            }
        }, new Runnable() { // from class: l.kzi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129428a.m224162j(x20Var2);
            }
        });
        this.f209892e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lzi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f134221a.m224163k(j, f, i, i2, i3, f2, f3, valueAnimator);
            }
        });
        this.f209892e.start();
    }

    /* JADX INFO: renamed from: m */
    public void m224165m(int i, int i2, final x20 x20Var, final x20 x20Var2) {
        this.f209910w = ActionMode.scroll;
        int i3 = this.f209896i;
        if (i3 > 0 && i > i3) {
            wg3.m206174a("start or division is wrong! start should be less than division.");
            return;
        }
        if (i > i2) {
            wg3.m206174a("start or end is wrong! start should be less than end.");
            return;
        }
        this.f209894g = i;
        this.f209895h = i2;
        int i4 = m224173u() ? this.f209896i + 1 : i2;
        this.f209897j = i4;
        if (this.f209909v) {
            int i5 = i4 - i;
            ValueAnimator valueAnimator = this.f209892e;
            if (i5 < 10) {
                long j = this.f209907t;
                long j2 = j * 2;
                long j3 = this.f209908u;
                if (j2 < j3) {
                    j3 = j * 2;
                }
                valueAnimator.setDuration(j3);
            } else {
                valueAnimator.setDuration(this.f209908u);
            }
        }
        long duration = this.f209892e.getDuration();
        long j4 = this.f209907t;
        final long j5 = (duration - j4) / ((long) (this.f209897j - i));
        int i6 = ((int) j5) / 16;
        int i7 = ((int) j4) / 16;
        int i8 = i7 / 2;
        if (i6 == 0) {
            gzi0.m133102a("animator duration is too small for a change from %d to %d !", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            return;
        }
        if (i7 == 0 || i8 == 0) {
            wg3.m206174a("last num duration is too small!");
            return;
        }
        final int i9 = 255 / i6;
        float f = this.f209904q;
        final float f2 = f / i6;
        final int i10 = 255 / i7;
        final float f3 = f / i7;
        final float f4 = 1.0f / i8;
        final int i11 = 255 / i8;
        bnl0.m105533Q0(this, new y20() { // from class: l.izi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117707a.m224164l(x20Var, x20Var2, j5, f4, i11, i10, i9, f3, f2, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m224166n(@NonNull String str) {
        this.f209910w = ActionMode.still;
        this.f209893f = str;
        bnl0.m105533Q0(this, new y20() { // from class: l.hzi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112247a.m224160h((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m224167o() {
        this.f209892e.cancel();
        this.f209892e.removeAllUpdateListeners();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ActionMode actionMode = this.f209910w;
        if (actionMode != null) {
            int i = C22648a.f209911a[actionMode.ordinal()];
            if (i == 1) {
                m224170r(canvas);
            } else {
                if (i != 2) {
                    return;
                }
                m224172t(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m224168p() {
        m224167o();
        this.f209900m = getMeasuredWidth() / 2;
        this.f209901n = getMeasuredHeight() / 2;
        Paint.FontMetrics fontMetrics = this.f209888a.getFontMetrics();
        float f = this.f209901n;
        float f2 = fontMetrics.bottom;
        this.f209902o = (f + ((f2 - fontMetrics.top) / 2.0f)) - f2;
    }

    /* JADX INFO: renamed from: q */
    public final void m224169q() {
        m224168p();
        this.f209899l = 1;
        this.f209898k = this.f209894g;
        this.f209889b.setAlpha(255);
        this.f209890c.setAlpha(0);
        this.f209891d.setAlpha(0);
        this.f209891d.setTextScaleX(0.0f);
    }

    /* JADX INFO: renamed from: r */
    public final void m224170r(Canvas canvas) {
        int i = this.f209898k;
        int i2 = this.f209894g;
        if (i == i2) {
            canvas.drawText(String.valueOf(i2), this.f209900m, this.f209902o, this.f209888a);
            return;
        }
        if (m224171s()) {
            float fMeasureText = this.f209888a.measureText(String.valueOf(this.f209896i));
            canvas.drawText(String.valueOf(this.f209896i), this.f209900m - ((this.f209891d.measureText(Marker.ANY_NON_NULL_MARKER) * this.f209891d.getTextScaleX()) / 2.0f), this.f209902o, this.f209888a);
            canvas.drawText(Marker.ANY_NON_NULL_MARKER, this.f209900m + (fMeasureText / 2.0f), this.f209902o, this.f209891d);
            return;
        }
        int i3 = this.f209898k;
        if (i3 > this.f209897j) {
            canvas.drawText(getAnimEndString(), this.f209900m, this.f209902o, this.f209888a);
            return;
        }
        if (i3 < 10 || i3 % 10 == 0) {
            canvas.drawText(String.valueOf(i3 - 1), this.f209900m, this.f209902o - this.f209905r, this.f209889b);
            canvas.drawText(String.valueOf(this.f209898k), this.f209900m, this.f209902o + this.f209906s, this.f209890c);
            return;
        }
        String strValueOf = String.valueOf(i3 / 10);
        String strValueOf2 = String.valueOf((this.f209898k - 1) % 10);
        String strValueOf3 = String.valueOf(this.f209898k % 10);
        float fMeasureText2 = this.f209888a.measureText(String.valueOf(this.f209898k)) / 4.0f;
        canvas.drawText(strValueOf, this.f209900m - fMeasureText2, this.f209902o, this.f209888a);
        canvas.drawText(strValueOf2, this.f209900m + fMeasureText2, this.f209902o - this.f209905r, this.f209889b);
        canvas.drawText(strValueOf3, this.f209900m + fMeasureText2, this.f209902o + this.f209906s, this.f209890c);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m224171s() {
        return m224173u() && this.f209898k == this.f209897j;
    }

    public void setAllowSelfAdaptDuration(boolean z) {
        this.f209909v = z;
    }

    public void setDivision(int i) {
        this.f209896i = i;
    }

    public void setDuration(long j) {
        this.f209908u = j;
    }

    public void setLastNumDuration(long j) {
        this.f209907t = j;
    }

    public void setTextColor(@ColorInt int i) {
        this.f209888a.setColor(i);
        this.f209889b.setColor(i);
        this.f209890c.setColor(i);
        this.f209891d.setColor(i);
    }

    public void setTextSize(float f) {
        this.f209888a.setTextSize(f);
        this.f209889b.setTextSize(f);
        this.f209890c.setTextSize(f);
        this.f209891d.setTextSize(f);
    }

    /* JADX INFO: renamed from: t */
    public final void m224172t(Canvas canvas) {
        canvas.drawText(this.f209893f, this.f209900m, this.f209902o, this.f209888a);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m224173u() {
        int i = this.f209896i;
        return i > 0 && this.f209895h >= i;
    }

    public TickerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209888a = new TextPaint(1);
        this.f209889b = new TextPaint(1);
        this.f209890c = new TextPaint(1);
        this.f209891d = new TextPaint(1);
        this.f209892e = ValueAnimator.ofFloat(1.0f);
        m224159g();
    }

    public TickerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209888a = new TextPaint(1);
        this.f209889b = new TextPaint(1);
        this.f209890c = new TextPaint(1);
        this.f209891d = new TextPaint(1);
        this.f209892e = ValueAnimator.ofFloat(1.0f);
        m224159g();
    }
}
