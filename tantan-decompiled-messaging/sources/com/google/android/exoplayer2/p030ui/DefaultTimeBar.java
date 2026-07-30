package com.google.android.exoplayer2.p030ui;

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
import com.google.android.exoplayer2.p030ui.DefaultTimeBar;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p149l.p11;
import p149l.t8c0;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class DefaultTimeBar extends View implements InterfaceC2038b {

    /* JADX INFO: renamed from: A */
    public int f9144A;

    /* JADX INFO: renamed from: B */
    public long f9145B;

    /* JADX INFO: renamed from: C */
    public int f9146C;

    /* JADX INFO: renamed from: D */
    public Rect f9147D;

    /* JADX INFO: renamed from: E */
    public ValueAnimator f9148E;

    /* JADX INFO: renamed from: F */
    public float f9149F;

    /* JADX INFO: renamed from: G */
    public boolean f9150G;

    /* JADX INFO: renamed from: H */
    public boolean f9151H;

    /* JADX INFO: renamed from: I */
    public long f9152I;

    /* JADX INFO: renamed from: J */
    public long f9153J;

    /* JADX INFO: renamed from: K */
    public long f9154K;

    /* JADX INFO: renamed from: L */
    public long f9155L;

    /* JADX INFO: renamed from: M */
    public int f9156M;

    /* JADX INFO: renamed from: N */
    @Nullable
    public long[] f9157N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public boolean[] f9158O;

    /* JADX INFO: renamed from: a */
    public final Rect f9159a;

    /* JADX INFO: renamed from: b */
    public final Rect f9160b;

    /* JADX INFO: renamed from: c */
    public final Rect f9161c;

    /* JADX INFO: renamed from: d */
    public final Rect f9162d;

    /* JADX INFO: renamed from: e */
    public final Paint f9163e;

    /* JADX INFO: renamed from: f */
    public final Paint f9164f;

    /* JADX INFO: renamed from: g */
    public final Paint f9165g;

    /* JADX INFO: renamed from: h */
    public final Paint f9166h;

    /* JADX INFO: renamed from: i */
    public final Paint f9167i;

    /* JADX INFO: renamed from: j */
    public final Paint f9168j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Drawable f9169k;

    /* JADX INFO: renamed from: l */
    public final int f9170l;

    /* JADX INFO: renamed from: m */
    public final int f9171m;

    /* JADX INFO: renamed from: n */
    public final int f9172n;

    /* JADX INFO: renamed from: o */
    public final int f9173o;

    /* JADX INFO: renamed from: p */
    public final int f9174p;

    /* JADX INFO: renamed from: q */
    public final int f9175q;

    /* JADX INFO: renamed from: r */
    public final int f9176r;

    /* JADX INFO: renamed from: s */
    public final int f9177s;

    /* JADX INFO: renamed from: t */
    public final int f9178t;

    /* JADX INFO: renamed from: u */
    public final StringBuilder f9179u;

    /* JADX INFO: renamed from: v */
    public final Formatter f9180v;

    /* JADX INFO: renamed from: w */
    public final Runnable f9181w;

    /* JADX INFO: renamed from: x */
    public final CopyOnWriteArraySet<InterfaceC2038b.a> f9182x;

    /* JADX INFO: renamed from: y */
    public final Point f9183y;

    /* JADX INFO: renamed from: z */
    public final float f9184z;

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f9159a = new Rect();
        this.f9160b = new Rect();
        this.f9161c = new Rect();
        this.f9162d = new Rect();
        Paint paint = new Paint();
        this.f9163e = paint;
        Paint paint2 = new Paint();
        this.f9164f = paint2;
        Paint paint3 = new Paint();
        this.f9165g = paint3;
        Paint paint4 = new Paint();
        this.f9166h = paint4;
        Paint paint5 = new Paint();
        this.f9167i = paint5;
        Paint paint6 = new Paint();
        this.f9168j = paint6;
        paint6.setAntiAlias(true);
        this.f9182x = new CopyOnWriteArraySet<>();
        this.f9183y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f9184z = f;
        this.f9178t = m11810e(f, -50);
        int iM11810e = m11810e(f, 4);
        int iM11810e2 = m11810e(f, 26);
        int iM11810e3 = m11810e(f, 4);
        int iM11810e4 = m11810e(f, 12);
        int iM11810e5 = m11810e(f, 0);
        int iM11810e6 = m11810e(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, t8c0.f168849c, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(t8c0.f168871n);
                this.f9169k = drawable;
                if (drawable != null) {
                    m11823o(drawable);
                    iM11810e2 = Math.max(drawable.getMinimumHeight(), iM11810e2);
                }
                this.f9170l = typedArrayObtainStyledAttributes.getDimensionPixelSize(t8c0.f168857g, iM11810e);
                this.f9171m = typedArrayObtainStyledAttributes.getDimensionPixelSize(t8c0.f168875p, iM11810e2);
                this.f9172n = typedArrayObtainStyledAttributes.getInt(t8c0.f168855f, 0);
                this.f9173o = typedArrayObtainStyledAttributes.getDimensionPixelSize(t8c0.f168853e, iM11810e3);
                this.f9174p = typedArrayObtainStyledAttributes.getDimensionPixelSize(t8c0.f168873o, iM11810e4);
                this.f9175q = typedArrayObtainStyledAttributes.getDimensionPixelSize(t8c0.f168867l, iM11810e5);
                this.f9176r = typedArrayObtainStyledAttributes.getDimensionPixelSize(t8c0.f168869m, iM11810e6);
                int i3 = typedArrayObtainStyledAttributes.getInt(t8c0.f168863j, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(t8c0.f168865k, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(t8c0.f168859h, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(t8c0.f168877q, 872415231);
                int i7 = typedArrayObtainStyledAttributes.getInt(t8c0.f168851d, -1291845888);
                int i8 = typedArrayObtainStyledAttributes.getInt(t8c0.f168861i, 872414976);
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
            this.f9170l = iM11810e;
            this.f9171m = iM11810e2;
            this.f9172n = 0;
            this.f9173o = iM11810e3;
            this.f9174p = iM11810e4;
            this.f9175q = iM11810e5;
            this.f9176r = iM11810e6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f9169k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f9179u = sb;
        this.f9180v = new Formatter(sb, Locale.getDefault());
        this.f9181w = new Runnable() { // from class: l.zqd
            @Override // java.lang.Runnable
            public final void run() {
                this.f204375a.m11828u(false);
            }
        };
        Drawable drawable2 = this.f9169k;
        if (drawable2 != null) {
            this.f9177s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f9177s = (Math.max(this.f9175q, Math.max(this.f9174p, this.f9176r)) + 1) / 2;
        }
        this.f9149F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f9148E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ard
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.m11808c(this.f71261a, valueAnimator2);
            }
        });
        this.f9153J = -9223372036854775807L;
        this.f9145B = -9223372036854775807L;
        this.f9144A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11808c(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.getClass();
        defaultTimeBar.f9149F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f9159a);
    }

    /* JADX INFO: renamed from: e */
    public static int m11810e(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f9145B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f9153J;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f9144A);
    }

    private String getProgressText() {
        return vck0.m197870k0(this.f9179u, this.f9180v, this.f9154K);
    }

    private long getScrubberPosition() {
        if (this.f9160b.width() <= 0 || this.f9153J == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f9162d.width()) * this.f9153J) / ((long) this.f9160b.width());
    }

    /* JADX INFO: renamed from: l */
    public static int m11811l(float f, int i) {
        return (int) (i / f);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m11812p(Drawable drawable, int i) {
        return vck0.f180948a >= 23 && drawable.setLayoutDirection(i);
    }

    @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b
    /* JADX INFO: renamed from: a */
    public void mo11813a(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
        p11.m167007a(i == 0 || !(jArr == null || zArr == null));
        this.f9156M = i;
        this.f9157N = jArr;
        this.f9158O = zArr;
        m11829v();
    }

    @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b
    /* JADX INFO: renamed from: b */
    public void mo11814b(InterfaceC2038b.a aVar) {
        p11.m167011e(aVar);
        this.f9182x.add(aVar);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m11830w();
    }

    /* JADX INFO: renamed from: f */
    public final void m11815f(Canvas canvas) {
        int i;
        if (this.f9153J <= 0) {
            return;
        }
        Rect rect = this.f9162d;
        int iM197884q = vck0.m197884q(rect.right, rect.left, this.f9160b.right);
        int iCenterY = this.f9162d.centerY();
        Drawable drawable = this.f9169k;
        if (drawable == null) {
            if (this.f9151H || isFocused()) {
                i = this.f9176r;
            } else {
                i = isEnabled() ? this.f9174p : this.f9175q;
            }
            canvas.drawCircle(iM197884q, iCenterY, (int) ((i * this.f9149F) / 2.0f), this.f9168j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f9149F)) / 2;
        int intrinsicHeight = ((int) (this.f9169k.getIntrinsicHeight() * this.f9149F)) / 2;
        this.f9169k.setBounds(iM197884q - intrinsicWidth, iCenterY - intrinsicHeight, iM197884q + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f9169k.draw(canvas);
    }

    /* JADX INFO: renamed from: g */
    public final void m11816g(Canvas canvas) {
        int iHeight = this.f9160b.height();
        int iCenterY = this.f9160b.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.f9153J <= 0) {
            Rect rect = this.f9160b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i, this.f9165g);
            return;
        }
        Rect rect2 = this.f9161c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int iMax = Math.max(Math.max(this.f9160b.left, i3), this.f9162d.right);
        int i4 = this.f9160b.right;
        if (iMax < i4) {
            canvas.drawRect(iMax, iCenterY, i4, i, this.f9165g);
        }
        int iMax2 = Math.max(i2, this.f9162d.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.f9164f);
        }
        if (this.f9162d.width() > 0) {
            Rect rect3 = this.f9162d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i, this.f9163e);
        }
        if (this.f9156M == 0) {
            return;
        }
        long[] jArr = (long[]) p11.m167011e(this.f9157N);
        boolean[] zArr = (boolean[]) p11.m167011e(this.f9158O);
        int i5 = this.f9173o / 2;
        for (int i6 = 0; i6 < this.f9156M; i6++) {
            int iWidth = ((int) ((((long) this.f9160b.width()) * vck0.m197886r(jArr[i6], 0L, this.f9153J)) / this.f9153J)) - i5;
            Rect rect4 = this.f9160b;
            int iMin = rect4.left + Math.min(rect4.width() - this.f9173o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f9173o, i, zArr[i6] ? this.f9167i : this.f9166h);
        }
    }

    @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b
    public long getPreferredUpdateDelay() {
        int iM11811l = m11811l(this.f9184z, this.f9160b.width());
        if (iM11811l == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f9153J;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iM11811l);
    }

    /* JADX INFO: renamed from: h */
    public void m11817h(long j) {
        if (this.f9148E.isStarted()) {
            this.f9148E.cancel();
        }
        this.f9148E.setFloatValues(this.f9149F, 0.0f);
        this.f9148E.setDuration(j);
        this.f9148E.start();
    }

    /* JADX INFO: renamed from: i */
    public void m11818i(boolean z) {
        if (this.f9148E.isStarted()) {
            this.f9148E.cancel();
        }
        this.f9150G = z;
        this.f9149F = 0.0f;
        invalidate(this.f9159a);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11819j(float f, float f2) {
        return this.f9159a.contains((int) f, (int) f2);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9169k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11820k(float f) {
        Rect rect = this.f9162d;
        Rect rect2 = this.f9160b;
        rect.right = vck0.m197884q((int) f, rect2.left, rect2.right);
    }

    /* JADX INFO: renamed from: m */
    public final Point m11821m(MotionEvent motionEvent) {
        this.f9183y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f9183y;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m11822n(long j) {
        long j2 = this.f9153J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f9151H ? this.f9152I : this.f9154K;
        long jM197886r = vck0.m197886r(j3 + j, 0L, j2);
        if (jM197886r == j3) {
            return false;
        }
        if (this.f9151H) {
            m11831x(jM197886r);
        } else {
            m11827t(jM197886r);
        }
        m11829v();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11823o(Drawable drawable) {
        return vck0.f180948a >= 23 && m11812p(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m11816g(canvas);
        m11815f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f9151H || z) {
            return;
        }
        m11828u(false);
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
        if (this.f9153J <= 0) {
            return;
        }
        if (vck0.f180948a >= 21) {
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
                        if (m11822n(positionIncrement)) {
                            removeCallbacks(this.f9181w);
                            postDelayed(this.f9181w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m11822n(positionIncrement)) {
                            removeCallbacks(this.f9181w);
                            postDelayed(this.f9181w, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f9151H) {
                            m11828u(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f9151H) {
                m11828u(false);
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
        int i7 = this.f9150G ? 0 : this.f9177s;
        if (this.f9172n == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - this.f9171m;
            int paddingBottom2 = i6 - getPaddingBottom();
            int i8 = this.f9170l;
            iMax = (paddingBottom2 - i8) - Math.max(i7 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - this.f9171m) / 2;
            iMax = (i6 - this.f9170l) / 2;
        }
        this.f9159a.set(paddingLeft, paddingBottom, paddingRight, this.f9171m + paddingBottom);
        Rect rect = this.f9160b;
        Rect rect2 = this.f9159a;
        rect.set(rect2.left + i7, iMax, rect2.right - i7, this.f9170l + iMax);
        if (vck0.f180948a >= 29) {
            m11824q(i5, i6);
        }
        m11829v();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f9171m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f9171m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m11830w();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f9169k;
        if (drawable == null || !m11812p(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f9153J > 0) {
            Point pointM11821m = m11821m(motionEvent);
            int i = pointM11821m.x;
            int i2 = pointM11821m.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f = i;
                if (m11819j(f, i2)) {
                    m11820k(f);
                    m11827t(getScrubberPosition());
                    m11829v();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f9151H) {
                    m11828u(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f9151H) {
                        m11828u(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f9151H) {
                if (i2 < this.f9178t) {
                    int i3 = this.f9146C;
                    m11820k(i3 + ((i - i3) / 3));
                } else {
                    this.f9146C = i;
                    m11820k(i);
                }
                m11831x(getScrubberPosition());
                m11829v();
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
        if (this.f9153J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m11822n(-getPositionIncrement())) {
                m11828u(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m11822n(getPositionIncrement())) {
                m11828u(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: q */
    public final void m11824q(int i, int i2) {
        Rect rect = this.f9147D;
        if (rect != null && rect.width() == i && this.f9147D.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.f9147D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    /* JADX INFO: renamed from: r */
    public void m11825r() {
        if (this.f9148E.isStarted()) {
            this.f9148E.cancel();
        }
        this.f9150G = false;
        this.f9149F = 1.0f;
        invalidate(this.f9159a);
    }

    /* JADX INFO: renamed from: s */
    public void m11826s(long j) {
        if (this.f9148E.isStarted()) {
            this.f9148E.cancel();
        }
        this.f9150G = false;
        this.f9148E.setFloatValues(this.f9149F, 1.0f);
        this.f9148E.setDuration(j);
        this.f9148E.start();
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.f9166h.setColor(i);
        invalidate(this.f9159a);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f9164f.setColor(i);
        invalidate(this.f9159a);
    }

    @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b
    public void setBufferedPosition(long j) {
        if (this.f9155L == j) {
            return;
        }
        this.f9155L = j;
        m11829v();
    }

    @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b
    public void setDuration(long j) {
        if (this.f9153J == j) {
            return;
        }
        this.f9153J = j;
        if (this.f9151H && j == -9223372036854775807L) {
            m11828u(true);
        }
        m11829v();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p030ui.InterfaceC2038b
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f9151H || z) {
            return;
        }
        m11828u(true);
    }

    public void setKeyCountIncrement(int i) {
        p11.m167007a(i > 0);
        this.f9144A = i;
        this.f9145B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        p11.m167007a(j > 0);
        this.f9144A = -1;
        this.f9145B = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.f9167i.setColor(i);
        invalidate(this.f9159a);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.f9163e.setColor(i);
        invalidate(this.f9159a);
    }

    @Override // com.google.android.exoplayer2.p030ui.InterfaceC2038b
    public void setPosition(long j) {
        if (this.f9154K == j) {
            return;
        }
        this.f9154K = j;
        setContentDescription(getProgressText());
        m11829v();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.f9168j.setColor(i);
        invalidate(this.f9159a);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f9165g.setColor(i);
        invalidate(this.f9159a);
    }

    /* JADX INFO: renamed from: t */
    public final void m11827t(long j) {
        this.f9152I = j;
        this.f9151H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<InterfaceC2038b.a> it = this.f9182x.iterator();
        while (it.hasNext()) {
            it.next().mo11878N(this, j);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11828u(boolean z) {
        removeCallbacks(this.f9181w);
        this.f9151H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<InterfaceC2038b.a> it = this.f9182x.iterator();
        while (it.hasNext()) {
            it.next().mo11879u(this, this.f9152I, z);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m11829v() {
        this.f9161c.set(this.f9160b);
        this.f9162d.set(this.f9160b);
        long j = this.f9151H ? this.f9152I : this.f9154K;
        if (this.f9153J > 0) {
            int iWidth = (int) ((((long) this.f9160b.width()) * this.f9155L) / this.f9153J);
            Rect rect = this.f9161c;
            Rect rect2 = this.f9160b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f9160b.width()) * j) / this.f9153J);
            Rect rect3 = this.f9162d;
            Rect rect4 = this.f9160b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f9161c;
            int i = this.f9160b.left;
            rect5.right = i;
            this.f9162d.right = i;
        }
        invalidate(this.f9159a);
    }

    /* JADX INFO: renamed from: w */
    public final void m11830w() {
        Drawable drawable = this.f9169k;
        if (drawable != null && drawable.isStateful() && this.f9169k.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11831x(long j) {
        if (this.f9152I == j) {
            return;
        }
        this.f9152I = j;
        Iterator<InterfaceC2038b.a> it = this.f9182x.iterator();
        while (it.hasNext()) {
            it.next().mo11877L(this, j);
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
