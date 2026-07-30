package com.google.android.exoplayer2.p031ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.p031ui.DefaultTimeBar;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p153l.bmk0;
import p153l.w11;
import p153l.ygc0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class DefaultTimeBar extends View implements InterfaceC2061b {

    /* JADX INFO: renamed from: A */
    public int f9181A;

    /* JADX INFO: renamed from: B */
    public long f9182B;

    /* JADX INFO: renamed from: C */
    public int f9183C;

    /* JADX INFO: renamed from: D */
    public Rect f9184D;

    /* JADX INFO: renamed from: E */
    public ValueAnimator f9185E;

    /* JADX INFO: renamed from: F */
    public float f9186F;

    /* JADX INFO: renamed from: G */
    public boolean f9187G;

    /* JADX INFO: renamed from: H */
    public boolean f9188H;

    /* JADX INFO: renamed from: I */
    public long f9189I;

    /* JADX INFO: renamed from: J */
    public long f9190J;

    /* JADX INFO: renamed from: K */
    public long f9191K;

    /* JADX INFO: renamed from: L */
    public long f9192L;

    /* JADX INFO: renamed from: M */
    public int f9193M;

    /* JADX INFO: renamed from: N */
    @Nullable
    public long[] f9194N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public boolean[] f9195O;

    /* JADX INFO: renamed from: a */
    public final Rect f9196a;

    /* JADX INFO: renamed from: b */
    public final Rect f9197b;

    /* JADX INFO: renamed from: c */
    public final Rect f9198c;

    /* JADX INFO: renamed from: d */
    public final Rect f9199d;

    /* JADX INFO: renamed from: e */
    public final Paint f9200e;

    /* JADX INFO: renamed from: f */
    public final Paint f9201f;

    /* JADX INFO: renamed from: g */
    public final Paint f9202g;

    /* JADX INFO: renamed from: h */
    public final Paint f9203h;

    /* JADX INFO: renamed from: i */
    public final Paint f9204i;

    /* JADX INFO: renamed from: j */
    public final Paint f9205j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Drawable f9206k;

    /* JADX INFO: renamed from: l */
    public final int f9207l;

    /* JADX INFO: renamed from: m */
    public final int f9208m;

    /* JADX INFO: renamed from: n */
    public final int f9209n;

    /* JADX INFO: renamed from: o */
    public final int f9210o;

    /* JADX INFO: renamed from: p */
    public final int f9211p;

    /* JADX INFO: renamed from: q */
    public final int f9212q;

    /* JADX INFO: renamed from: r */
    public final int f9213r;

    /* JADX INFO: renamed from: s */
    public final int f9214s;

    /* JADX INFO: renamed from: t */
    public final int f9215t;

    /* JADX INFO: renamed from: u */
    public final StringBuilder f9216u;

    /* JADX INFO: renamed from: v */
    public final Formatter f9217v;

    /* JADX INFO: renamed from: w */
    public final Runnable f9218w;

    /* JADX INFO: renamed from: x */
    public final CopyOnWriteArraySet<InterfaceC2061b.a> f9219x;

    /* JADX INFO: renamed from: y */
    public final Point f9220y;

    /* JADX INFO: renamed from: z */
    public final float f9221z;

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f9196a = new Rect();
        this.f9197b = new Rect();
        this.f9198c = new Rect();
        this.f9199d = new Rect();
        Paint paint = new Paint();
        this.f9200e = paint;
        Paint paint2 = new Paint();
        this.f9201f = paint2;
        Paint paint3 = new Paint();
        this.f9202g = paint3;
        Paint paint4 = new Paint();
        this.f9203h = paint4;
        Paint paint5 = new Paint();
        this.f9204i = paint5;
        Paint paint6 = new Paint();
        this.f9205j = paint6;
        paint6.setAntiAlias(true);
        this.f9219x = new CopyOnWriteArraySet<>();
        this.f9220y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f9221z = f;
        this.f9215t = m11864e(f, -50);
        int iM11864e = m11864e(f, 4);
        int iM11864e2 = m11864e(f, 26);
        int iM11864e3 = m11864e(f, 4);
        int iM11864e4 = m11864e(f, 12);
        int iM11864e5 = m11864e(f, 0);
        int iM11864e6 = m11864e(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, ygc0.f199780c, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(ygc0.f199802n);
                this.f9206k = drawable;
                if (drawable != null) {
                    m11877o(drawable);
                    iM11864e2 = Math.max(drawable.getMinimumHeight(), iM11864e2);
                }
                this.f9207l = typedArrayObtainStyledAttributes.getDimensionPixelSize(ygc0.f199788g, iM11864e);
                this.f9208m = typedArrayObtainStyledAttributes.getDimensionPixelSize(ygc0.f199806p, iM11864e2);
                this.f9209n = typedArrayObtainStyledAttributes.getInt(ygc0.f199786f, 0);
                this.f9210o = typedArrayObtainStyledAttributes.getDimensionPixelSize(ygc0.f199784e, iM11864e3);
                this.f9211p = typedArrayObtainStyledAttributes.getDimensionPixelSize(ygc0.f199804o, iM11864e4);
                this.f9212q = typedArrayObtainStyledAttributes.getDimensionPixelSize(ygc0.f199798l, iM11864e5);
                this.f9213r = typedArrayObtainStyledAttributes.getDimensionPixelSize(ygc0.f199800m, iM11864e6);
                int i3 = typedArrayObtainStyledAttributes.getInt(ygc0.f199794j, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(ygc0.f199796k, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(ygc0.f199790h, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(ygc0.f199808q, 872415231);
                int i7 = typedArrayObtainStyledAttributes.getInt(ygc0.f199782d, -1291845888);
                int i8 = typedArrayObtainStyledAttributes.getInt(ygc0.f199792i, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f9207l = iM11864e;
            this.f9208m = iM11864e2;
            this.f9209n = 0;
            this.f9210o = iM11864e3;
            this.f9211p = iM11864e4;
            this.f9212q = iM11864e5;
            this.f9213r = iM11864e6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f9206k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f9216u = sb;
        this.f9217v = new Formatter(sb, Locale.getDefault());
        this.f9218w = new Runnable() { // from class: l.osd
            @Override // java.lang.Runnable
            public final void run() {
                this.f148810a.m11882u(false);
            }
        };
        Drawable drawable2 = this.f9206k;
        if (drawable2 != null) {
            this.f9214s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f9214s = (Math.max(this.f9212q, Math.max(this.f9211p, this.f9213r)) + 1) / 2;
        }
        this.f9186F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f9185E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.psd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.m11862c(this.f153881a, valueAnimator2);
            }
        });
        this.f9190J = -9223372036854775807L;
        this.f9182B = -9223372036854775807L;
        this.f9181A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11862c(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.getClass();
        defaultTimeBar.f9186F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f9196a);
    }

    /* JADX INFO: renamed from: e */
    public static int m11864e(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f9182B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f9190J;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f9181A);
    }

    private String getProgressText() {
        return bmk0.m105148k0(this.f9216u, this.f9217v, this.f9191K);
    }

    private long getScrubberPosition() {
        if (this.f9197b.width() <= 0 || this.f9190J == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f9199d.width()) * this.f9190J) / ((long) this.f9197b.width());
    }

    /* JADX INFO: renamed from: l */
    public static int m11865l(float f, int i) {
        return (int) (i / f);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m11866p(Drawable drawable, int i) {
        return bmk0.f77313a >= 23 && drawable.setLayoutDirection(i);
    }

    @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b
    /* JADX INFO: renamed from: a */
    public void mo11867a(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
        w11.m204365a(i == 0 || !(jArr == null || zArr == null));
        this.f9193M = i;
        this.f9194N = jArr;
        this.f9195O = zArr;
        m11883v();
    }

    @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b
    /* JADX INFO: renamed from: b */
    public void mo11868b(InterfaceC2061b.a aVar) {
        w11.m204369e(aVar);
        this.f9219x.add(aVar);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m11884w();
    }

    /* JADX INFO: renamed from: f */
    public final void m11869f(Canvas canvas) {
        int i;
        if (this.f9190J <= 0) {
            return;
        }
        Rect rect = this.f9199d;
        int iM105162q = bmk0.m105162q(rect.right, rect.left, this.f9197b.right);
        int iCenterY = this.f9199d.centerY();
        Drawable drawable = this.f9206k;
        if (drawable == null) {
            if (this.f9188H || isFocused()) {
                i = this.f9213r;
            } else {
                i = isEnabled() ? this.f9211p : this.f9212q;
            }
            canvas.drawCircle(iM105162q, iCenterY, (int) ((i * this.f9186F) / 2.0f), this.f9205j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f9186F)) / 2;
        int intrinsicHeight = ((int) (this.f9206k.getIntrinsicHeight() * this.f9186F)) / 2;
        this.f9206k.setBounds(iM105162q - intrinsicWidth, iCenterY - intrinsicHeight, iM105162q + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f9206k.draw(canvas);
    }

    /* JADX INFO: renamed from: g */
    public final void m11870g(Canvas canvas) {
        int iHeight = this.f9197b.height();
        int iCenterY = this.f9197b.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.f9190J <= 0) {
            Rect rect = this.f9197b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i, this.f9202g);
            return;
        }
        Rect rect2 = this.f9198c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int iMax = Math.max(Math.max(this.f9197b.left, i3), this.f9199d.right);
        int i4 = this.f9197b.right;
        if (iMax < i4) {
            canvas.drawRect(iMax, iCenterY, i4, i, this.f9202g);
        }
        int iMax2 = Math.max(i2, this.f9199d.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.f9201f);
        }
        if (this.f9199d.width() > 0) {
            Rect rect3 = this.f9199d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i, this.f9200e);
        }
        if (this.f9193M == 0) {
            return;
        }
        long[] jArr = (long[]) w11.m204369e(this.f9194N);
        boolean[] zArr = (boolean[]) w11.m204369e(this.f9195O);
        int i5 = this.f9210o / 2;
        for (int i6 = 0; i6 < this.f9193M; i6++) {
            int iWidth = ((int) ((((long) this.f9197b.width()) * bmk0.m105164r(jArr[i6], 0L, this.f9190J)) / this.f9190J)) - i5;
            Rect rect4 = this.f9197b;
            int iMin = rect4.left + Math.min(rect4.width() - this.f9210o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f9210o, i, zArr[i6] ? this.f9204i : this.f9203h);
        }
    }

    @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b
    public long getPreferredUpdateDelay() {
        int iM11865l = m11865l(this.f9221z, this.f9197b.width());
        if (iM11865l == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f9190J;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iM11865l);
    }

    /* JADX INFO: renamed from: h */
    public void m11871h(long j) {
        if (this.f9185E.isStarted()) {
            this.f9185E.cancel();
        }
        this.f9185E.setFloatValues(this.f9186F, 0.0f);
        this.f9185E.setDuration(j);
        this.f9185E.start();
    }

    /* JADX INFO: renamed from: i */
    public void m11872i(boolean z) {
        if (this.f9185E.isStarted()) {
            this.f9185E.cancel();
        }
        this.f9187G = z;
        this.f9186F = 0.0f;
        invalidate(this.f9196a);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11873j(float f, float f2) {
        return this.f9196a.contains((int) f, (int) f2);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9206k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11874k(float f) {
        Rect rect = this.f9199d;
        Rect rect2 = this.f9197b;
        rect.right = bmk0.m105162q((int) f, rect2.left, rect2.right);
    }

    /* JADX INFO: renamed from: m */
    public final Point m11875m(MotionEvent motionEvent) {
        this.f9220y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f9220y;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m11876n(long j) {
        long j2 = this.f9190J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f9188H ? this.f9189I : this.f9191K;
        long jM105164r = bmk0.m105164r(j3 + j, 0L, j2);
        if (jM105164r == j3) {
            return false;
        }
        if (this.f9188H) {
            m11885x(jM105164r);
        } else {
            m11881t(jM105164r);
        }
        m11883v();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11877o(Drawable drawable) {
        return bmk0.f77313a >= 23 && m11866p(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m11870g(canvas);
        m11869f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f9188H || z) {
            return;
        }
        m11882u(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f9190J <= 0) {
            return;
        }
        if (bmk0.f77313a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (m11876n(positionIncrement)) {
                            removeCallbacks(this.f9218w);
                            postDelayed(this.f9218w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m11876n(positionIncrement)) {
                            removeCallbacks(this.f9218w);
                            postDelayed(this.f9218w, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f9188H) {
                            m11882u(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f9188H) {
                m11882u(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int iMax;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f9187G ? 0 : this.f9214s;
        if (this.f9209n == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - this.f9208m;
            int paddingBottom2 = i6 - getPaddingBottom();
            int i8 = this.f9207l;
            iMax = (paddingBottom2 - i8) - Math.max(i7 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - this.f9208m) / 2;
            iMax = (i6 - this.f9207l) / 2;
        }
        this.f9196a.set(paddingLeft, paddingBottom, paddingRight, this.f9208m + paddingBottom);
        Rect rect = this.f9197b;
        Rect rect2 = this.f9196a;
        rect.set(rect2.left + i7, iMax, rect2.right - i7, this.f9207l + iMax);
        if (bmk0.f77313a >= 29) {
            m11878q(i5, i6);
        }
        m11883v();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f9208m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f9208m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m11884w();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f9206k;
        if (drawable == null || !m11866p(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f9190J > 0) {
            Point pointM11875m = m11875m(motionEvent);
            int i = pointM11875m.x;
            int i2 = pointM11875m.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f = i;
                if (m11873j(f, i2)) {
                    m11874k(f);
                    m11881t(getScrubberPosition());
                    m11883v();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f9188H) {
                    m11882u(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f9188H) {
                        m11882u(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f9188H) {
                if (i2 < this.f9215t) {
                    int i3 = this.f9183C;
                    m11874k(i3 + ((i - i3) / 3));
                } else {
                    this.f9183C = i;
                    m11874k(i);
                }
                m11885x(getScrubberPosition());
                m11883v();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f9190J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m11876n(-getPositionIncrement())) {
                m11882u(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m11876n(getPositionIncrement())) {
                m11882u(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: q */
    public final void m11878q(int i, int i2) {
        Rect rect = this.f9184D;
        if (rect != null && rect.width() == i && this.f9184D.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.f9184D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    /* JADX INFO: renamed from: r */
    public void m11879r() {
        if (this.f9185E.isStarted()) {
            this.f9185E.cancel();
        }
        this.f9187G = false;
        this.f9186F = 1.0f;
        invalidate(this.f9196a);
    }

    /* JADX INFO: renamed from: s */
    public void m11880s(long j) {
        if (this.f9185E.isStarted()) {
            this.f9185E.cancel();
        }
        this.f9187G = false;
        this.f9185E.setFloatValues(this.f9186F, 1.0f);
        this.f9185E.setDuration(j);
        this.f9185E.start();
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.f9203h.setColor(i);
        invalidate(this.f9196a);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f9201f.setColor(i);
        invalidate(this.f9196a);
    }

    @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b
    public void setBufferedPosition(long j) {
        if (this.f9192L == j) {
            return;
        }
        this.f9192L = j;
        m11883v();
    }

    @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b
    public void setDuration(long j) {
        if (this.f9190J == j) {
            return;
        }
        this.f9190J = j;
        if (this.f9188H && j == -9223372036854775807L) {
            m11882u(true);
        }
        m11883v();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p031ui.InterfaceC2061b
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f9188H || z) {
            return;
        }
        m11882u(true);
    }

    public void setKeyCountIncrement(int i) {
        w11.m204365a(i > 0);
        this.f9181A = i;
        this.f9182B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        w11.m204365a(j > 0);
        this.f9181A = -1;
        this.f9182B = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.f9204i.setColor(i);
        invalidate(this.f9196a);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.f9200e.setColor(i);
        invalidate(this.f9196a);
    }

    @Override // com.google.android.exoplayer2.p031ui.InterfaceC2061b
    public void setPosition(long j) {
        if (this.f9191K == j) {
            return;
        }
        this.f9191K = j;
        setContentDescription(getProgressText());
        m11883v();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.f9205j.setColor(i);
        invalidate(this.f9196a);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f9202g.setColor(i);
        invalidate(this.f9196a);
    }

    /* JADX INFO: renamed from: t */
    public final void m11881t(long j) {
        this.f9189I = j;
        this.f9188H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<InterfaceC2061b.a> it = this.f9219x.iterator();
        while (it.hasNext()) {
            it.next().mo11932N(this, j);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11882u(boolean z) {
        removeCallbacks(this.f9218w);
        this.f9188H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<InterfaceC2061b.a> it = this.f9219x.iterator();
        while (it.hasNext()) {
            it.next().mo11933u(this, this.f9189I, z);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m11883v() {
        this.f9198c.set(this.f9197b);
        this.f9199d.set(this.f9197b);
        long j = this.f9188H ? this.f9189I : this.f9191K;
        if (this.f9190J > 0) {
            int iWidth = (int) ((((long) this.f9197b.width()) * this.f9192L) / this.f9190J);
            Rect rect = this.f9198c;
            Rect rect2 = this.f9197b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f9197b.width()) * j) / this.f9190J);
            Rect rect3 = this.f9199d;
            Rect rect4 = this.f9197b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f9198c;
            int i = this.f9197b.left;
            rect5.right = i;
            this.f9199d.right = i;
        }
        invalidate(this.f9196a);
    }

    /* JADX INFO: renamed from: w */
    public final void m11884w() {
        Drawable drawable = this.f9206k;
        if (drawable != null && drawable.isStateful() && this.f9206k.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11885x(long j) {
        if (this.f9189I == j) {
            return;
        }
        this.f9189I = j;
        Iterator<InterfaceC2061b.a> it = this.f9219x.iterator();
        while (it.hasNext()) {
            it.next().mo11931L(this, j);
        }
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context) {
        this(context, null);
    }
}
