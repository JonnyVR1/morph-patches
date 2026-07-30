package p028v;

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
import l.bt0;
import l.ig3;
import l.t100;
import l.xdl0;
import org.slf4j.Marker;
import p003l.d30;
import p003l.dqi0;
import p003l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TickerView extends View {

    /* JADX INFO: renamed from: x */
    public static final int f12589x = t100.d(14.0f);

    /* JADX INFO: renamed from: y */
    public static final Interpolator f12590y = new LinearInterpolator();

    /* JADX INFO: renamed from: a */
    public final Paint f12591a;

    /* JADX INFO: renamed from: b */
    public final Paint f12592b;

    /* JADX INFO: renamed from: c */
    public final Paint f12593c;

    /* JADX INFO: renamed from: d */
    public final Paint f12594d;

    /* JADX INFO: renamed from: e */
    public final ValueAnimator f12595e;

    /* JADX INFO: renamed from: f */
    public String f12596f;

    /* JADX INFO: renamed from: g */
    public int f12597g;

    /* JADX INFO: renamed from: h */
    public int f12598h;

    /* JADX INFO: renamed from: i */
    public int f12599i;

    /* JADX INFO: renamed from: j */
    public int f12600j;

    /* JADX INFO: renamed from: k */
    public int f12601k;

    /* JADX INFO: renamed from: l */
    public int f12602l;

    /* JADX INFO: renamed from: m */
    public int f12603m;

    /* JADX INFO: renamed from: n */
    public int f12604n;

    /* JADX INFO: renamed from: o */
    public float f12605o;

    /* JADX INFO: renamed from: p */
    public int f12606p;

    /* JADX INFO: renamed from: q */
    public float f12607q;

    /* JADX INFO: renamed from: r */
    public float f12608r;

    /* JADX INFO: renamed from: s */
    public float f12609s;

    /* JADX INFO: renamed from: t */
    public long f12610t;

    /* JADX INFO: renamed from: u */
    public long f12611u;

    /* JADX INFO: renamed from: v */
    public boolean f12612v;

    /* JADX INFO: renamed from: w */
    public ActionMode f12613w;

    public enum ActionMode {
        scroll,
        still,
        clear
    }

    /* JADX INFO: renamed from: v.TickerView$a */
    public static /* synthetic */ class C1326a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12614a;

        static {
            int[] iArr = new int[ActionMode.values().length];
            f12614a = iArr;
            try {
                iArr[ActionMode.scroll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12614a[ActionMode.still.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12614a[ActionMode.clear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TickerView(Context context) {
        super(context);
        this.f12591a = new TextPaint(1);
        this.f12592b = new TextPaint(1);
        this.f12593c = new TextPaint(1);
        this.f12594d = new TextPaint(1);
        this.f12595e = ValueAnimator.ofFloat(1.0f);
        m11386g();
    }

    private String getAnimEndString() {
        if (!m11400u()) {
            return String.valueOf(this.f12598h);
        }
        return this.f12599i + Marker.ANY_NON_NULL_MARKER;
    }

    /* JADX INFO: renamed from: f */
    public void m11385f() {
        this.f12613w = ActionMode.clear;
        m11394o();
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public final void m11386g() {
        Paint paint = this.f12592b;
        int i = f12589x;
        paint.setTextSize(i);
        this.f12592b.setColor(-1);
        Paint paint2 = this.f12592b;
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        this.f12593c.setTextSize(i);
        this.f12593c.setColor(-1);
        this.f12593c.setTextAlign(align);
        this.f12591a.setTextSize(i);
        this.f12591a.setColor(-1);
        this.f12591a.setTextAlign(align);
        this.f12594d.setTextSize(i);
        this.f12594d.setColor(-1);
        this.f12594d.setTextAlign(align);
        this.f12595e.setInterpolator(f12590y);
        this.f12607q = this.f12592b.getTextSize();
        this.f12611u = 2600L;
        this.f12610t = 1000L;
        this.f12599i = 99;
        this.f12612v = true;
    }

    public long getDuration() {
        return this.f12595e.getDuration();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m11387h(int[] iArr) {
        m11395p();
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m11388i(d30 d30Var) {
        this.f12601k = this.f12600j + 1;
        invalidate();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m11389j(d30 d30Var) {
        this.f12601k = this.f12600j + 1;
        invalidate();
        if (d30Var != null) {
            d30Var.call();
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
    public final /* synthetic */ void m11390k(long j, float f, int i, int i2, int i3, float f2, float f3, ValueAnimator valueAnimator) {
        int i4;
        int i5;
        float f4;
        float f5;
        float textScaleX;
        Paint paint;
        if (this.f12601k <= this.f12600j) {
            long currentPlayTime = valueAnimator.getCurrentPlayTime();
            long duration = valueAnimator.getDuration();
            int i6 = this.f12601k;
            if (currentPlayTime >= duration) {
                this.f12601k = i6 + 1;
            } else {
                if (i6 < this.f12600j) {
                    long currentPlayTime2 = valueAnimator.getCurrentPlayTime();
                    int i7 = this.f12602l;
                    if (currentPlayTime2 >= ((long) i7) * j) {
                        this.f12601k++;
                        this.f12602l = i7 + 1;
                        this.f12606p = 0;
                        this.f12608r = 0.0f;
                        this.f12609s = this.f12607q;
                        this.f12592b.setAlpha(255);
                        this.f12593c.setAlpha(0);
                    } else if (m11398s()) {
                        textScaleX = this.f12594d.getTextScaleX() + f;
                        paint = this.f12594d;
                        if (textScaleX < 1.0f) {
                            paint.setTextScaleX(textScaleX);
                        } else {
                            paint.setTextScaleX(1.0f);
                            Paint paint2 = this.f12594d;
                            paint2.setAlpha(paint2.getAlpha() + i);
                        }
                    } else {
                        i4 = this.f12601k;
                        i5 = this.f12600j;
                        if (i4 != i5) {
                            i2 = i3;
                        }
                        if (i4 != i5) {
                            f2 = f3;
                        }
                        int alpha = this.f12592b.getAlpha() - i2;
                        int alpha2 = this.f12593c.getAlpha() + i2;
                        this.f12592b.setAlpha(alpha >= i2 ? alpha : 0);
                        this.f12593c.setAlpha(255 - alpha2 >= i2 ? alpha2 : 255);
                        int i8 = this.f12606p;
                        this.f12606p = i8 + 1;
                        f4 = i8 * f2;
                        this.f12608r = f4;
                        f5 = this.f12607q;
                        if (f5 - f4 <= f2) {
                            f4 = f5;
                        }
                        this.f12608r = f4;
                        this.f12609s = f5 - f4;
                    }
                } else if (m11398s()) {
                    textScaleX = this.f12594d.getTextScaleX() + f;
                    paint = this.f12594d;
                    if (textScaleX < 1.0f) {
                        paint.setTextScaleX(textScaleX);
                    } else {
                        paint.setTextScaleX(1.0f);
                        Paint paint3 = this.f12594d;
                        paint3.setAlpha(paint3.getAlpha() + i);
                    }
                } else {
                    i4 = this.f12601k;
                    i5 = this.f12600j;
                    if (i4 != i5) {
                        i2 = i3;
                    }
                    if (i4 != i5) {
                        f2 = f3;
                    }
                    int alpha3 = this.f12592b.getAlpha() - i2;
                    int alpha4 = this.f12593c.getAlpha() + i2;
                    this.f12592b.setAlpha(alpha3 >= i2 ? alpha3 : 0);
                    this.f12593c.setAlpha(255 - alpha4 >= i2 ? alpha4 : 255);
                    int i9 = this.f12606p;
                    this.f12606p = i9 + 1;
                    f4 = i9 * f2;
                    this.f12608r = f4;
                    f5 = this.f12607q;
                    if (f5 - f4 <= f2) {
                        f4 = f5;
                    }
                    this.f12608r = f4;
                    this.f12609s = f5 - f4;
                }
            }
            invalidate();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11391l(final d30 d30Var, final d30 d30Var2, final long j, final float f, final int i, final int i2, final int i3, final float f2, final float f3, int[] iArr) {
        m11396q();
        bt0.g(this.f12595e, new Runnable() { // from class: l.gqi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3984a.m11388i(d30Var);
            }
        }, new Runnable() { // from class: l.hqi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4257a.m11389j(d30Var2);
            }
        });
        this.f12595e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.iqi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4463a.m11390k(j, f, i, i2, i3, f2, f3, valueAnimator);
            }
        });
        this.f12595e.start();
    }

    /* JADX INFO: renamed from: m */
    public void m11392m(int i, int i2, final d30 d30Var, final d30 d30Var2) {
        this.f12613w = ActionMode.scroll;
        int i3 = this.f12599i;
        if (i3 > 0 && i > i3) {
            ig3.a("start or division is wrong! start should be less than division.");
            return;
        }
        if (i > i2) {
            ig3.a("start or end is wrong! start should be less than end.");
            return;
        }
        this.f12597g = i;
        this.f12598h = i2;
        int i4 = m11400u() ? this.f12599i + 1 : i2;
        this.f12600j = i4;
        if (this.f12612v) {
            int i5 = i4 - i;
            ValueAnimator valueAnimator = this.f12595e;
            if (i5 < 10) {
                long j = this.f12610t;
                long j2 = j * 2;
                long j3 = this.f12611u;
                if (j2 < j3) {
                    j3 = j * 2;
                }
                valueAnimator.setDuration(j3);
            } else {
                valueAnimator.setDuration(this.f12611u);
            }
        }
        long duration = this.f12595e.getDuration();
        long j4 = this.f12610t;
        final long j5 = (duration - j4) / ((long) (this.f12600j - i));
        int i6 = ((int) j5) / 16;
        int i7 = ((int) j4) / 16;
        int i8 = i7 / 2;
        if (i6 == 0) {
            dqi0.m3632a("animator duration is too small for a change from %d to %d !", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            return;
        }
        if (i7 == 0 || i8 == 0) {
            ig3.a("last num duration is too small!");
            return;
        }
        final int i9 = 255 / i6;
        float f = this.f12607q;
        final float f2 = f / i6;
        final int i10 = 255 / i7;
        final float f3 = f / i7;
        final float f4 = 1.0f / i8;
        final int i11 = 255 / i8;
        xdl0.Q0(this, new e30() { // from class: l.fqi0
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3674a.m11391l(d30Var, d30Var2, j5, f4, i11, i10, i9, f3, f2, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m11393n(@NonNull String str) {
        this.f12613w = ActionMode.still;
        this.f12596f = str;
        xdl0.Q0(this, new e30() { // from class: l.eqi0
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3364a.m11387h((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m11394o() {
        this.f12595e.cancel();
        this.f12595e.removeAllUpdateListeners();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ActionMode actionMode = this.f12613w;
        if (actionMode != null) {
            int i = C1326a.f12614a[actionMode.ordinal()];
            if (i == 1) {
                m11397r(canvas);
            } else {
                if (i != 2) {
                    return;
                }
                m11399t(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m11395p() {
        m11394o();
        this.f12603m = getMeasuredWidth() / 2;
        this.f12604n = getMeasuredHeight() / 2;
        Paint.FontMetrics fontMetrics = this.f12591a.getFontMetrics();
        float f = this.f12604n;
        float f2 = fontMetrics.bottom;
        this.f12605o = (f + ((f2 - fontMetrics.top) / 2.0f)) - f2;
    }

    /* JADX INFO: renamed from: q */
    public final void m11396q() {
        m11395p();
        this.f12602l = 1;
        this.f12601k = this.f12597g;
        this.f12592b.setAlpha(255);
        this.f12593c.setAlpha(0);
        this.f12594d.setAlpha(0);
        this.f12594d.setTextScaleX(0.0f);
    }

    /* JADX INFO: renamed from: r */
    public final void m11397r(Canvas canvas) {
        int i = this.f12601k;
        int i2 = this.f12597g;
        if (i == i2) {
            canvas.drawText(String.valueOf(i2), this.f12603m, this.f12605o, this.f12591a);
            return;
        }
        if (m11398s()) {
            float fMeasureText = this.f12591a.measureText(String.valueOf(this.f12599i));
            canvas.drawText(String.valueOf(this.f12599i), this.f12603m - ((this.f12594d.measureText(Marker.ANY_NON_NULL_MARKER) * this.f12594d.getTextScaleX()) / 2.0f), this.f12605o, this.f12591a);
            canvas.drawText(Marker.ANY_NON_NULL_MARKER, this.f12603m + (fMeasureText / 2.0f), this.f12605o, this.f12594d);
            return;
        }
        int i3 = this.f12601k;
        if (i3 > this.f12600j) {
            canvas.drawText(getAnimEndString(), this.f12603m, this.f12605o, this.f12591a);
            return;
        }
        if (i3 < 10 || i3 % 10 == 0) {
            canvas.drawText(String.valueOf(i3 - 1), this.f12603m, this.f12605o - this.f12608r, this.f12592b);
            canvas.drawText(String.valueOf(this.f12601k), this.f12603m, this.f12605o + this.f12609s, this.f12593c);
            return;
        }
        String strValueOf = String.valueOf(i3 / 10);
        String strValueOf2 = String.valueOf((this.f12601k - 1) % 10);
        String strValueOf3 = String.valueOf(this.f12601k % 10);
        float fMeasureText2 = this.f12591a.measureText(String.valueOf(this.f12601k)) / 4.0f;
        canvas.drawText(strValueOf, this.f12603m - fMeasureText2, this.f12605o, this.f12591a);
        canvas.drawText(strValueOf2, this.f12603m + fMeasureText2, this.f12605o - this.f12608r, this.f12592b);
        canvas.drawText(strValueOf3, this.f12603m + fMeasureText2, this.f12605o + this.f12609s, this.f12593c);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11398s() {
        return m11400u() && this.f12601k == this.f12600j;
    }

    public void setAllowSelfAdaptDuration(boolean z) {
        this.f12612v = z;
    }

    public void setDivision(int i) {
        this.f12599i = i;
    }

    public void setDuration(long j) {
        this.f12611u = j;
    }

    public void setLastNumDuration(long j) {
        this.f12610t = j;
    }

    public void setTextColor(@ColorInt int i) {
        this.f12591a.setColor(i);
        this.f12592b.setColor(i);
        this.f12593c.setColor(i);
        this.f12594d.setColor(i);
    }

    public void setTextSize(float f) {
        this.f12591a.setTextSize(f);
        this.f12592b.setTextSize(f);
        this.f12593c.setTextSize(f);
        this.f12594d.setTextSize(f);
    }

    /* JADX INFO: renamed from: t */
    public final void m11399t(Canvas canvas) {
        canvas.drawText(this.f12596f, this.f12603m, this.f12605o, this.f12591a);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m11400u() {
        int i = this.f12599i;
        return i > 0 && this.f12598h >= i;
    }

    public TickerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12591a = new TextPaint(1);
        this.f12592b = new TextPaint(1);
        this.f12593c = new TextPaint(1);
        this.f12594d = new TextPaint(1);
        this.f12595e = ValueAnimator.ofFloat(1.0f);
        m11386g();
    }

    public TickerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12591a = new TextPaint(1);
        this.f12592b = new TextPaint(1);
        this.f12593c = new TextPaint(1);
        this.f12594d = new TextPaint(1);
        this.f12595e = ValueAnimator.ofFloat(1.0f);
        m11386g();
    }
}
