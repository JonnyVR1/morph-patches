package p147v;

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
import p149l.bt0;
import p149l.d30;
import p149l.dqi0;
import p149l.e30;
import p149l.ig3;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class TickerView extends View {

    /* JADX INFO: renamed from: x */
    public static final int f208964x = t100.m186890d(14.0f);

    /* JADX INFO: renamed from: y */
    public static final Interpolator f208965y = new LinearInterpolator();

    /* JADX INFO: renamed from: a */
    public final Paint f208966a;

    /* JADX INFO: renamed from: b */
    public final Paint f208967b;

    /* JADX INFO: renamed from: c */
    public final Paint f208968c;

    /* JADX INFO: renamed from: d */
    public final Paint f208969d;

    /* JADX INFO: renamed from: e */
    public final ValueAnimator f208970e;

    /* JADX INFO: renamed from: f */
    public String f208971f;

    /* JADX INFO: renamed from: g */
    public int f208972g;

    /* JADX INFO: renamed from: h */
    public int f208973h;

    /* JADX INFO: renamed from: i */
    public int f208974i;

    /* JADX INFO: renamed from: j */
    public int f208975j;

    /* JADX INFO: renamed from: k */
    public int f208976k;

    /* JADX INFO: renamed from: l */
    public int f208977l;

    /* JADX INFO: renamed from: m */
    public int f208978m;

    /* JADX INFO: renamed from: n */
    public int f208979n;

    /* JADX INFO: renamed from: o */
    public float f208980o;

    /* JADX INFO: renamed from: p */
    public int f208981p;

    /* JADX INFO: renamed from: q */
    public float f208982q;

    /* JADX INFO: renamed from: r */
    public float f208983r;

    /* JADX INFO: renamed from: s */
    public float f208984s;

    /* JADX INFO: renamed from: t */
    public long f208985t;

    /* JADX INFO: renamed from: u */
    public long f208986u;

    /* JADX INFO: renamed from: v */
    public boolean f208987v;

    /* JADX INFO: renamed from: w */
    public ActionMode f208988w;

    public enum ActionMode {
        scroll,
        still,
        clear
    }

    /* JADX INFO: renamed from: v.TickerView$a */
    public static /* synthetic */ class C22533a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f208989a;

        static {
            int[] iArr = new int[ActionMode.values().length];
            f208989a = iArr;
            try {
                iArr[ActionMode.scroll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f208989a[ActionMode.still.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f208989a[ActionMode.clear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TickerView(Context context) {
        super(context);
        this.f208966a = new TextPaint(1);
        this.f208967b = new TextPaint(1);
        this.f208968c = new TextPaint(1);
        this.f208969d = new TextPaint(1);
        this.f208970e = ValueAnimator.ofFloat(1.0f);
        m222913g();
    }

    private String getAnimEndString() {
        if (!m222927u()) {
            return String.valueOf(this.f208973h);
        }
        return this.f208974i + Marker.ANY_NON_NULL_MARKER;
    }

    /* JADX INFO: renamed from: f */
    public void m222912f() {
        this.f208988w = ActionMode.clear;
        m222921o();
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public final void m222913g() {
        Paint paint = this.f208967b;
        int i = f208964x;
        paint.setTextSize(i);
        this.f208967b.setColor(-1);
        Paint paint2 = this.f208967b;
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        this.f208968c.setTextSize(i);
        this.f208968c.setColor(-1);
        this.f208968c.setTextAlign(align);
        this.f208966a.setTextSize(i);
        this.f208966a.setColor(-1);
        this.f208966a.setTextAlign(align);
        this.f208969d.setTextSize(i);
        this.f208969d.setColor(-1);
        this.f208969d.setTextAlign(align);
        this.f208970e.setInterpolator(f208965y);
        this.f208982q = this.f208967b.getTextSize();
        this.f208986u = 2600L;
        this.f208985t = 1000L;
        this.f208974i = 99;
        this.f208987v = true;
    }

    public long getDuration() {
        return this.f208970e.getDuration();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m222914h(int[] iArr) {
        m222922p();
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m222915i(d30 d30Var) {
        this.f208976k = this.f208975j + 1;
        invalidate();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m222916j(d30 d30Var) {
        this.f208976k = this.f208975j + 1;
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
    public final /* synthetic */ void m222917k(long j, float f, int i, int i2, int i3, float f2, float f3, ValueAnimator valueAnimator) {
        int i4;
        int i5;
        float f4;
        float f5;
        float textScaleX;
        Paint paint;
        if (this.f208976k <= this.f208975j) {
            long currentPlayTime = valueAnimator.getCurrentPlayTime();
            long duration = valueAnimator.getDuration();
            int i6 = this.f208976k;
            if (currentPlayTime >= duration) {
                this.f208976k = i6 + 1;
            } else {
                if (i6 < this.f208975j) {
                    long currentPlayTime2 = valueAnimator.getCurrentPlayTime();
                    int i7 = this.f208977l;
                    if (currentPlayTime2 >= ((long) i7) * j) {
                        this.f208976k++;
                        this.f208977l = i7 + 1;
                        this.f208981p = 0;
                        this.f208983r = 0.0f;
                        this.f208984s = this.f208982q;
                        this.f208967b.setAlpha(255);
                        this.f208968c.setAlpha(0);
                    } else if (m222925s()) {
                        textScaleX = this.f208969d.getTextScaleX() + f;
                        paint = this.f208969d;
                        if (textScaleX < 1.0f) {
                            paint.setTextScaleX(textScaleX);
                        } else {
                            paint.setTextScaleX(1.0f);
                            Paint paint2 = this.f208969d;
                            paint2.setAlpha(paint2.getAlpha() + i);
                        }
                    } else {
                        i4 = this.f208976k;
                        i5 = this.f208975j;
                        if (i4 != i5) {
                            i2 = i3;
                        }
                        if (i4 != i5) {
                            f2 = f3;
                        }
                        int alpha = this.f208967b.getAlpha() - i2;
                        int alpha2 = this.f208968c.getAlpha() + i2;
                        this.f208967b.setAlpha(alpha >= i2 ? alpha : 0);
                        this.f208968c.setAlpha(255 - alpha2 >= i2 ? alpha2 : 255);
                        int i8 = this.f208981p;
                        this.f208981p = i8 + 1;
                        f4 = i8 * f2;
                        this.f208983r = f4;
                        f5 = this.f208982q;
                        if (f5 - f4 <= f2) {
                            f4 = f5;
                        }
                        this.f208983r = f4;
                        this.f208984s = f5 - f4;
                    }
                } else if (m222925s()) {
                    textScaleX = this.f208969d.getTextScaleX() + f;
                    paint = this.f208969d;
                    if (textScaleX < 1.0f) {
                        paint.setTextScaleX(textScaleX);
                    } else {
                        paint.setTextScaleX(1.0f);
                        Paint paint3 = this.f208969d;
                        paint3.setAlpha(paint3.getAlpha() + i);
                    }
                } else {
                    i4 = this.f208976k;
                    i5 = this.f208975j;
                    if (i4 != i5) {
                        i2 = i3;
                    }
                    if (i4 != i5) {
                        f2 = f3;
                    }
                    int alpha3 = this.f208967b.getAlpha() - i2;
                    int alpha4 = this.f208968c.getAlpha() + i2;
                    this.f208967b.setAlpha(alpha3 >= i2 ? alpha3 : 0);
                    this.f208968c.setAlpha(255 - alpha4 >= i2 ? alpha4 : 255);
                    int i9 = this.f208981p;
                    this.f208981p = i9 + 1;
                    f4 = i9 * f2;
                    this.f208983r = f4;
                    f5 = this.f208982q;
                    if (f5 - f4 <= f2) {
                        f4 = f5;
                    }
                    this.f208983r = f4;
                    this.f208984s = f5 - f4;
                }
            }
            invalidate();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m222918l(final d30 d30Var, final d30 d30Var2, final long j, final float f, final int i, final int i2, final int i3, final float f2, final float f3, int[] iArr) {
        m222923q();
        bt0.m103734g(this.f208970e, new Runnable() { // from class: l.gqi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103953a.m222915i(d30Var);
            }
        }, new Runnable() { // from class: l.hqi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f109060a.m222916j(d30Var2);
            }
        });
        this.f208970e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.iqi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f114507a.m222917k(j, f, i, i2, i3, f2, f3, valueAnimator);
            }
        });
        this.f208970e.start();
    }

    /* JADX INFO: renamed from: m */
    public void m222919m(int i, int i2, final d30 d30Var, final d30 d30Var2) {
        this.f208988w = ActionMode.scroll;
        int i3 = this.f208974i;
        if (i3 > 0 && i > i3) {
            ig3.m135964a("start or division is wrong! start should be less than division.");
            return;
        }
        if (i > i2) {
            ig3.m135964a("start or end is wrong! start should be less than end.");
            return;
        }
        this.f208972g = i;
        this.f208973h = i2;
        int i4 = m222927u() ? this.f208974i + 1 : i2;
        this.f208975j = i4;
        if (this.f208987v) {
            int i5 = i4 - i;
            ValueAnimator valueAnimator = this.f208970e;
            if (i5 < 10) {
                long j = this.f208985t;
                long j2 = j * 2;
                long j3 = this.f208986u;
                if (j2 < j3) {
                    j3 = j * 2;
                }
                valueAnimator.setDuration(j3);
            } else {
                valueAnimator.setDuration(this.f208986u);
            }
        }
        long duration = this.f208970e.getDuration();
        long j4 = this.f208985t;
        final long j5 = (duration - j4) / ((long) (this.f208975j - i));
        int i6 = ((int) j5) / 16;
        int i7 = ((int) j4) / 16;
        int i8 = i7 / 2;
        if (i6 == 0) {
            dqi0.m113073a("animator duration is too small for a change from %d to %d !", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            return;
        }
        if (i7 == 0 || i8 == 0) {
            ig3.m135964a("last num duration is too small!");
            return;
        }
        final int i9 = 255 / i6;
        float f = this.f208982q;
        final float f2 = f / i6;
        final int i10 = 255 / i7;
        final float f3 = f / i7;
        final float f4 = 1.0f / i8;
        final int i11 = 255 / i8;
        xdl0.m208353Q0(this, new e30() { // from class: l.fqi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98809a.m222918l(d30Var, d30Var2, j5, f4, i11, i10, i9, f3, f2, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m222920n(@NonNull String str) {
        this.f208988w = ActionMode.still;
        this.f208971f = str;
        xdl0.m208353Q0(this, new e30() { // from class: l.eqi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92805a.m222914h((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m222921o() {
        this.f208970e.cancel();
        this.f208970e.removeAllUpdateListeners();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ActionMode actionMode = this.f208988w;
        if (actionMode != null) {
            int i = C22533a.f208989a[actionMode.ordinal()];
            if (i == 1) {
                m222924r(canvas);
            } else {
                if (i != 2) {
                    return;
                }
                m222926t(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m222922p() {
        m222921o();
        this.f208978m = getMeasuredWidth() / 2;
        this.f208979n = getMeasuredHeight() / 2;
        Paint.FontMetrics fontMetrics = this.f208966a.getFontMetrics();
        float f = this.f208979n;
        float f2 = fontMetrics.bottom;
        this.f208980o = (f + ((f2 - fontMetrics.top) / 2.0f)) - f2;
    }

    /* JADX INFO: renamed from: q */
    public final void m222923q() {
        m222922p();
        this.f208977l = 1;
        this.f208976k = this.f208972g;
        this.f208967b.setAlpha(255);
        this.f208968c.setAlpha(0);
        this.f208969d.setAlpha(0);
        this.f208969d.setTextScaleX(0.0f);
    }

    /* JADX INFO: renamed from: r */
    public final void m222924r(Canvas canvas) {
        int i = this.f208976k;
        int i2 = this.f208972g;
        if (i == i2) {
            canvas.drawText(String.valueOf(i2), this.f208978m, this.f208980o, this.f208966a);
            return;
        }
        if (m222925s()) {
            float fMeasureText = this.f208966a.measureText(String.valueOf(this.f208974i));
            canvas.drawText(String.valueOf(this.f208974i), this.f208978m - ((this.f208969d.measureText(Marker.ANY_NON_NULL_MARKER) * this.f208969d.getTextScaleX()) / 2.0f), this.f208980o, this.f208966a);
            canvas.drawText(Marker.ANY_NON_NULL_MARKER, this.f208978m + (fMeasureText / 2.0f), this.f208980o, this.f208969d);
            return;
        }
        int i3 = this.f208976k;
        if (i3 > this.f208975j) {
            canvas.drawText(getAnimEndString(), this.f208978m, this.f208980o, this.f208966a);
            return;
        }
        if (i3 < 10 || i3 % 10 == 0) {
            canvas.drawText(String.valueOf(i3 - 1), this.f208978m, this.f208980o - this.f208983r, this.f208967b);
            canvas.drawText(String.valueOf(this.f208976k), this.f208978m, this.f208980o + this.f208984s, this.f208968c);
            return;
        }
        String strValueOf = String.valueOf(i3 / 10);
        String strValueOf2 = String.valueOf((this.f208976k - 1) % 10);
        String strValueOf3 = String.valueOf(this.f208976k % 10);
        float fMeasureText2 = this.f208966a.measureText(String.valueOf(this.f208976k)) / 4.0f;
        canvas.drawText(strValueOf, this.f208978m - fMeasureText2, this.f208980o, this.f208966a);
        canvas.drawText(strValueOf2, this.f208978m + fMeasureText2, this.f208980o - this.f208983r, this.f208967b);
        canvas.drawText(strValueOf3, this.f208978m + fMeasureText2, this.f208980o + this.f208984s, this.f208968c);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m222925s() {
        return m222927u() && this.f208976k == this.f208975j;
    }

    public void setAllowSelfAdaptDuration(boolean z) {
        this.f208987v = z;
    }

    public void setDivision(int i) {
        this.f208974i = i;
    }

    public void setDuration(long j) {
        this.f208986u = j;
    }

    public void setLastNumDuration(long j) {
        this.f208985t = j;
    }

    public void setTextColor(@ColorInt int i) {
        this.f208966a.setColor(i);
        this.f208967b.setColor(i);
        this.f208968c.setColor(i);
        this.f208969d.setColor(i);
    }

    public void setTextSize(float f) {
        this.f208966a.setTextSize(f);
        this.f208967b.setTextSize(f);
        this.f208968c.setTextSize(f);
        this.f208969d.setTextSize(f);
    }

    /* JADX INFO: renamed from: t */
    public final void m222926t(Canvas canvas) {
        canvas.drawText(this.f208971f, this.f208978m, this.f208980o, this.f208966a);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m222927u() {
        int i = this.f208974i;
        return i > 0 && this.f208973h >= i;
    }

    public TickerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f208966a = new TextPaint(1);
        this.f208967b = new TextPaint(1);
        this.f208968c = new TextPaint(1);
        this.f208969d = new TextPaint(1);
        this.f208970e = ValueAnimator.ofFloat(1.0f);
        m222913g();
    }

    public TickerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f208966a = new TextPaint(1);
        this.f208967b = new TextPaint(1);
        this.f208968c = new TextPaint(1);
        this.f208969d = new TextPaint(1);
        this.f208970e = ValueAnimator.ofFloat(1.0f);
        m222913g();
    }
}
