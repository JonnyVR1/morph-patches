package com.p000p1.mobile.putong.core.message.inner.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.jfd0;
import l.lwm;
import l.vwb;
import p003l.i9c0;
import p003l.x1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageWheelPicker extends View implements Runnable {

    /* JADX INFO: renamed from: A */
    public int f802A;

    /* JADX INFO: renamed from: B */
    public int f803B;

    /* JADX INFO: renamed from: C */
    public int f804C;

    /* JADX INFO: renamed from: D */
    public int f805D;

    /* JADX INFO: renamed from: E */
    public int f806E;

    /* JADX INFO: renamed from: E0 */
    public boolean f807E0;

    /* JADX INFO: renamed from: F */
    public int f808F;

    /* JADX INFO: renamed from: F0 */
    public boolean f809F0;

    /* JADX INFO: renamed from: G */
    public int f810G;

    /* JADX INFO: renamed from: G0 */
    public boolean f811G0;

    /* JADX INFO: renamed from: H */
    public int f812H;

    /* JADX INFO: renamed from: H0 */
    public boolean f813H0;

    /* JADX INFO: renamed from: I */
    public int f814I;

    /* JADX INFO: renamed from: I0 */
    public boolean f815I0;

    /* JADX INFO: renamed from: J */
    public int f816J;

    /* JADX INFO: renamed from: K */
    public int f817K;

    /* JADX INFO: renamed from: L */
    public int f818L;

    /* JADX INFO: renamed from: M */
    public int f819M;

    /* JADX INFO: renamed from: N */
    public int f820N;

    /* JADX INFO: renamed from: O */
    public int f821O;

    /* JADX INFO: renamed from: P */
    public int f822P;

    /* JADX INFO: renamed from: Q */
    public int f823Q;

    /* JADX INFO: renamed from: R */
    public int f824R;

    /* JADX INFO: renamed from: S */
    public int f825S;

    /* JADX INFO: renamed from: T */
    public int f826T;

    /* JADX INFO: renamed from: U */
    public int f827U;

    /* JADX INFO: renamed from: V */
    public int f828V;

    /* JADX INFO: renamed from: W */
    public boolean f829W;

    /* JADX INFO: renamed from: a */
    public final Handler f830a;

    /* JADX INFO: renamed from: b */
    public Paint f831b;

    /* JADX INFO: renamed from: c */
    public Scroller f832c;

    /* JADX INFO: renamed from: d */
    public VelocityTracker f833d;

    /* JADX INFO: renamed from: e */
    public boolean f834e;

    /* JADX INFO: renamed from: f */
    public InterfaceC3058b f835f;

    /* JADX INFO: renamed from: g */
    public Rect f836g;

    /* JADX INFO: renamed from: h */
    public Rect f837h;

    /* JADX INFO: renamed from: i */
    public Rect f838i;

    /* JADX INFO: renamed from: j */
    public Rect f839j;

    /* JADX INFO: renamed from: k */
    public Rect f840k;

    /* JADX INFO: renamed from: k0 */
    public boolean f841k0;

    /* JADX INFO: renamed from: l */
    public Camera f842l;

    /* JADX INFO: renamed from: m */
    public Matrix f843m;

    /* JADX INFO: renamed from: n */
    public Matrix f844n;

    /* JADX INFO: renamed from: o */
    public List f845o;

    /* JADX INFO: renamed from: p */
    public String f846p;

    /* JADX INFO: renamed from: p0 */
    public boolean f847p0;

    /* JADX INFO: renamed from: q */
    public int f848q;

    /* JADX INFO: renamed from: r */
    public int f849r;

    /* JADX INFO: renamed from: s */
    public int f850s;

    /* JADX INFO: renamed from: t */
    public int f851t;

    /* JADX INFO: renamed from: u */
    public int f852u;

    /* JADX INFO: renamed from: v */
    public int f853v;

    /* JADX INFO: renamed from: w */
    public int f854w;

    /* JADX INFO: renamed from: x */
    public int f855x;

    /* JADX INFO: renamed from: y */
    public int f856y;

    /* JADX INFO: renamed from: z */
    public int f857z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.message.inner.view.MessageWheelPicker$a */
    public interface InterfaceC3057a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.message.inner.view.MessageWheelPicker$b */
    public interface InterfaceC3058b {
        /* JADX INFO: renamed from: a */
        void m878a(int i);

        /* JADX INFO: renamed from: b */
        void m879b(int i);

        /* JADX INFO: renamed from: c */
        void m880c(int i);
    }

    public MessageWheelPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f830a = new Handler();
        this.f845o = new ArrayList();
        this.f848q = 7;
        this.f855x = 0;
        this.f856y = 0;
        this.f818L = 50;
        this.f819M = 8000;
        this.f828V = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f5097x);
        this.f848q = typedArrayObtainStyledAttributes.getInt(i9c0.f5040P, 7);
        this.f812H = typedArrayObtainStyledAttributes.getInt(i9c0.f5038N, 0);
        this.f829W = typedArrayObtainStyledAttributes.getBoolean(i9c0.f5037M, false);
        this.f825S = typedArrayObtainStyledAttributes.getInt(i9c0.f5036L, -1);
        this.f846p = typedArrayObtainStyledAttributes.getString(i9c0.f5035K);
        this.f803B = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.f5032H, getContext().getResources().getDimensionPixelSize(x1c0.f8285g));
        this.f804C = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.f5027C, getContext().getResources().getDimensionPixelSize(x1c0.f8285g));
        this.f855x = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.f5034J, getContext().getResources().getDimensionPixelSize(x1c0.f8286h));
        this.f854w = typedArrayObtainStyledAttributes.getColor(i9c0.f5039O, -14606047);
        this.f853v = typedArrayObtainStyledAttributes.getColor(i9c0.f5033I, -7829368);
        this.f809F0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f5029E, false);
        this.f841k0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f5030F, false);
        this.f857z = typedArrayObtainStyledAttributes.getColor(i9c0.f5031G, -1166541);
        this.f847p0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f5025A, false);
        this.f802A = typedArrayObtainStyledAttributes.getColor(i9c0.f5026B, -1996488705);
        this.f807E0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f5100z, false);
        this.f811G0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f5028D, false);
        this.f805D = typedArrayObtainStyledAttributes.getInt(i9c0.f5099y, 0);
        typedArrayObtainStyledAttributes.recycle();
        m872j();
    }

    /* JADX INFO: renamed from: a */
    public final void m863a() {
        if (this.f847p0 || this.f854w != -1) {
            Rect rect = this.f839j;
            Rect rect2 = this.f836g;
            int i = rect2.left;
            int i2 = this.f821O;
            int i3 = this.f808F;
            rect.set(i, i2 - i3, rect2.right, i2 + i3);
            Rect rect3 = this.f840k;
            Rect rect4 = this.f836g;
            int i4 = rect4.left;
            int i5 = this.f821O;
            int i6 = this.f804C;
            rect3.set(i4, i5 - (i6 / 2), rect4.right, i5 + (i6 / 2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m864b(int i) {
        return (int) (((double) this.f810G) - (Math.cos(Math.toRadians(i)) * ((double) this.f810G)));
    }

    /* JADX INFO: renamed from: c */
    public final int m865c(int i) {
        if (Math.abs(i) <= this.f808F) {
            return -i;
        }
        int i2 = this.f824R;
        int i3 = this.f806E;
        return i2 < 0 ? (-i3) - i : i3 - i;
    }

    /* JADX INFO: renamed from: d */
    public final void m866d() {
        int i = this.f805D;
        if (i == 1) {
            this.f822P = this.f836g.left;
        } else if (i != 2) {
            this.f822P = this.f820N;
        } else {
            this.f822P = this.f836g.right;
        }
        this.f823Q = (int) (this.f821O - ((this.f831b.ascent() + this.f831b.descent()) / 2.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m867e() {
        int i = this.f812H;
        int i2 = this.f806E;
        int i3 = i * i2;
        this.f816J = this.f809F0 ? Integer.MIN_VALUE : ((-i2) * (this.f845o.size() - 1)) + i3;
        if (this.f809F0) {
            i3 = Integer.MAX_VALUE;
        }
        this.f817K = i3;
    }

    /* JADX INFO: renamed from: f */
    public final void m868f() {
        if (this.f841k0) {
            int i = this.f856y / 2;
            int i2 = this.f821O;
            int i3 = this.f808F;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f837h;
            Rect rect2 = this.f836g;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f838i;
            Rect rect4 = this.f836g;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m869g(int i) {
        return (int) (Math.sin(Math.toRadians(i)) * ((double) this.f810G));
    }

    public int getCurrentItemPosition() {
        return this.f814I;
    }

    public int getCurtainColor() {
        return this.f802A;
    }

    public List getData() {
        return this.f845o;
    }

    public int getIndicatorColor() {
        return this.f857z;
    }

    public int getIndicatorSize() {
        return this.f856y;
    }

    public int getItemAlign() {
        return this.f805D;
    }

    public int getItemSpace() {
        return this.f803B;
    }

    public int getItemTextColor() {
        return this.f853v;
    }

    public int getItemTextSize() {
        return this.f855x;
    }

    public String getMaximumWidthText() {
        return this.f846p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f825S;
    }

    public Object getSelectItem() {
        return this.f845o.get(this.f814I);
    }

    public int getSelectedItemPosition() {
        return this.f812H;
    }

    public int getSelectedItemTextColor() {
        return this.f854w;
    }

    public Typeface getTypeface() {
        Paint paint = this.f831b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f848q;
    }

    /* JADX INFO: renamed from: h */
    public void m870h() {
        this.f852u = 0;
        this.f851t = 0;
        if (vwb.J(this.f845o)) {
            return;
        }
        if (this.f829W) {
            this.f851t = (int) this.f831b.measureText(String.valueOf(this.f845o.get(0)));
        } else if (m873k(this.f825S)) {
            this.f851t = (int) this.f831b.measureText(String.valueOf(this.f845o.get(this.f825S)));
        } else if (TextUtils.isEmpty(this.f846p)) {
            Iterator it = this.f845o.iterator();
            while (it.hasNext()) {
                this.f851t = Math.max(this.f851t, (int) this.f831b.measureText(String.valueOf(it.next())));
            }
        } else {
            this.f851t = (int) this.f831b.measureText(this.f846p);
        }
        Paint.FontMetrics fontMetrics = this.f831b.getFontMetrics();
        this.f852u = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: i */
    public final String m871i(String str) {
        return ((float) getWidth()) < this.f831b.measureText(str) ? TextUtils.ellipsize(str, new TextPaint(this.f831b), getWidth(), TextUtils.TruncateAt.END).toString() : str;
    }

    /* JADX INFO: renamed from: j */
    public final void m872j() {
        m877o();
        Paint paint = new Paint(69);
        this.f831b = paint;
        paint.setTextSize(this.f855x);
        m876n();
        m870h();
        this.f832c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f818L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f819M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f828V = viewConfiguration.getScaledTouchSlop();
        this.f836g = new Rect();
        this.f837h = new Rect();
        this.f838i = new Rect();
        this.f839j = new Rect();
        this.f840k = new Rect();
        this.f842l = new Camera();
        this.f843m = new Matrix();
        this.f844n = new Matrix();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m873k(int i) {
        return i >= 0 && i < this.f845o.size();
    }

    /* JADX INFO: renamed from: l */
    public final int m874l(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* JADX INFO: renamed from: m */
    public void m875m(int i, boolean z) {
        this.f834e = false;
        if (!z || !this.f832c.isFinished()) {
            if (!this.f832c.isFinished()) {
                this.f832c.abortAnimation();
            }
            int iMax = Math.max(Math.min(i, this.f845o.size() - 1), 0);
            this.f812H = iMax;
            this.f814I = iMax;
            this.f824R = 0;
            m867e();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f814I;
        if (i2 == 0) {
            return;
        }
        if (this.f809F0 && Math.abs(i2) > size / 2) {
            if (i2 > 0) {
                size = -size;
            }
            i2 += size;
        }
        Scroller scroller = this.f832c;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f806E);
        this.f830a.post(this);
    }

    /* JADX INFO: renamed from: n */
    public void m876n() {
        int i = this.f805D;
        if (i == 1) {
            this.f831b.setTextAlign(Paint.Align.LEFT);
            return;
        }
        Paint paint = this.f831b;
        if (i != 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m877o() {
        int i = this.f848q;
        if (i < 2) {
            lwm.a("Wheel's visible item count can not be less than 2!");
            return;
        }
        if (i % 2 == 0) {
            this.f848q = i + 1;
        }
        int i2 = this.f848q + 2;
        this.f849r = i2;
        this.f850s = i2 / 2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String strValueOf;
        int iM869g;
        int i;
        InterfaceC3058b interfaceC3058b = this.f835f;
        if (interfaceC3058b != null) {
            interfaceC3058b.m879b(this.f824R);
        }
        if (this.f845o.size() == 0) {
            return;
        }
        if (this.f847p0) {
            this.f831b.setColor(this.f802A);
            this.f831b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f840k, this.f831b);
        }
        int i2 = (-this.f824R) / this.f806E;
        int i3 = this.f850s;
        int i4 = i2 - i3;
        int i5 = this.f812H + i4;
        int i6 = -i3;
        while (i5 < this.f812H + i4 + this.f849r) {
            if (this.f809F0) {
                int size = i5 % this.f845o.size();
                if (size < 0) {
                    size += this.f845o.size();
                }
                strValueOf = String.valueOf(this.f845o.get(size));
            } else {
                strValueOf = m873k(i5) ? String.valueOf(this.f845o.get(i5)) : "";
            }
            this.f831b.setColor(this.f853v);
            this.f831b.setStyle(Paint.Style.FILL);
            int i7 = this.f823Q;
            int i8 = this.f806E;
            int i9 = (i6 * i8) + i7 + (this.f824R % i8);
            if (this.f811G0) {
                int iAbs = i7 - Math.abs(i7 - i9);
                int i10 = this.f836g.top;
                int i11 = this.f823Q;
                float f = ((iAbs - i10) * 1.0f) / (i11 - i10);
                if (i9 > i11) {
                    i = 1;
                } else {
                    i = i9 < i11 ? -1 : 0;
                }
                float f2 = (-(1.0f - f)) * 90.0f * i;
                if (f2 < -90.0f) {
                    f2 = -90.0f;
                }
                float f3 = f2 <= 90.0f ? f2 : 90.0f;
                int i12 = (int) f3;
                iM869g = m869g(i12);
                int i13 = this.f820N;
                int i14 = this.f805D;
                if (i14 == 1) {
                    i13 = this.f836g.left;
                } else if (i14 == 2) {
                    i13 = this.f836g.right;
                }
                int i15 = this.f821O - iM869g;
                this.f842l.save();
                this.f842l.rotateX(f3);
                this.f842l.getMatrix(this.f843m);
                this.f842l.restore();
                float f4 = -i13;
                float f5 = -i15;
                this.f843m.preTranslate(f4, f5);
                float f6 = i13;
                float f7 = i15;
                this.f843m.postTranslate(f6, f7);
                this.f842l.save();
                this.f842l.translate(0.0f, 0.0f, m864b(i12));
                this.f842l.getMatrix(this.f844n);
                this.f842l.restore();
                this.f844n.preTranslate(f4, f5);
                this.f844n.postTranslate(f6, f7);
                this.f843m.postConcat(this.f844n);
            } else {
                iM869g = 0;
            }
            if (this.f807E0) {
                int i16 = this.f823Q;
                int iAbs2 = (int) ((((i16 - Math.abs(i16 - i9)) * 1.0f) / this.f823Q) * 255.0f);
                this.f831b.setAlpha(iAbs2 < 0 ? 0 : iAbs2);
            }
            if (this.f811G0) {
                i9 = this.f823Q - iM869g;
            }
            if (this.f854w != -1) {
                canvas.save();
                if (this.f811G0) {
                    canvas.concat(this.f843m);
                }
                canvas.clipRect(this.f839j, Region.Op.DIFFERENCE);
                float f8 = i9;
                canvas.drawText(m871i(strValueOf), this.f822P, f8, this.f831b);
                canvas.restore();
                this.f831b.setColor(this.f854w);
                canvas.save();
                if (this.f811G0) {
                    canvas.concat(this.f843m);
                }
                canvas.clipRect(this.f839j);
                canvas.drawText(m871i(strValueOf), this.f822P, f8, this.f831b);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.f836g);
                if (this.f811G0) {
                    canvas.concat(this.f843m);
                }
                canvas.drawText(m871i(strValueOf), this.f822P, i9, this.f831b);
                canvas.restore();
            }
            i5++;
            i6++;
        }
        if (this.f841k0) {
            this.f831b.setColor(this.f857z);
            this.f831b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f837h, this.f831b);
            canvas.drawRect(this.f838i, this.f831b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f851t;
        int i4 = this.f852u;
        int i5 = this.f848q;
        int i6 = (i4 * i5) + (this.f803B * (i5 - 1));
        if (this.f811G0) {
            i6 = (int) (((double) (i6 * 2)) / 3.141592653589793d);
        }
        setMeasuredDimension(m874l(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m874l(mode2, size2, i6 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f836g.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f820N = this.f836g.centerX();
        this.f821O = this.f836g.centerY();
        m866d();
        this.f810G = this.f836g.height() / 2;
        int iHeight = this.f836g.height() / this.f848q;
        this.f806E = iHeight;
        this.f808F = iHeight / 2;
        m867e();
        m868f();
        m863a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f834e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f833d;
            if (velocityTracker == null) {
                this.f833d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f833d.addMovement(motionEvent);
            if (!this.f832c.isFinished()) {
                this.f832c.abortAnimation();
                this.f815I0 = true;
            }
            int y = (int) motionEvent.getY();
            this.f826T = y;
            this.f827U = y;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f813H0 || this.f815I0) {
                this.f833d.addMovement(motionEvent);
                this.f833d.computeCurrentVelocity(1000, this.f819M);
                this.f815I0 = false;
                int yVelocity = (int) this.f833d.getYVelocity();
                int iAbs = Math.abs(yVelocity);
                int i = this.f818L;
                Scroller scroller = this.f832c;
                if (iAbs > i) {
                    scroller.fling(0, this.f824R, 0, yVelocity, 0, 0, this.f816J, this.f817K);
                    Scroller scroller2 = this.f832c;
                    scroller2.setFinalY(scroller2.getFinalY() + m865c(this.f832c.getFinalY() % this.f806E));
                } else {
                    int i2 = this.f824R;
                    scroller.startScroll(0, i2, 0, m865c(i2 % this.f806E));
                }
                if (!this.f809F0) {
                    int finalY = this.f832c.getFinalY();
                    int i3 = this.f817K;
                    Scroller scroller3 = this.f832c;
                    if (finalY > i3) {
                        scroller3.setFinalY(i3);
                    } else {
                        int finalY2 = scroller3.getFinalY();
                        int i4 = this.f816J;
                        if (finalY2 < i4) {
                            this.f832c.setFinalY(i4);
                        }
                    }
                }
                this.f830a.post(this);
                VelocityTracker velocityTracker2 = this.f833d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f833d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f833d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f833d = null;
                }
            }
        } else if (Math.abs(this.f827U - motionEvent.getY()) < this.f828V) {
            this.f813H0 = true;
        } else {
            this.f813H0 = false;
            this.f833d.addMovement(motionEvent);
            InterfaceC3058b interfaceC3058b = this.f835f;
            if (interfaceC3058b != null) {
                interfaceC3058b.m880c(1);
            }
            float y2 = motionEvent.getY() - this.f826T;
            if (Math.abs(y2) >= 1.0f) {
                this.f824R = (int) (this.f824R + y2);
                this.f826T = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f845o;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f832c.isFinished() && !this.f815I0) {
            int i = this.f806E;
            if (i == 0) {
                return;
            }
            int size = (((-this.f824R) / i) + this.f812H) % this.f845o.size();
            if (size < 0) {
                size += this.f845o.size();
            }
            this.f814I = size;
            InterfaceC3058b interfaceC3058b = this.f835f;
            if (interfaceC3058b != null && this.f834e) {
                interfaceC3058b.m878a(size);
                this.f835f.m880c(0);
            }
        }
        if (this.f832c.computeScrollOffset()) {
            InterfaceC3058b interfaceC3058b2 = this.f835f;
            if (interfaceC3058b2 != null) {
                interfaceC3058b2.m880c(2);
            }
            this.f824R = this.f832c.getCurrY();
            postInvalidate();
            this.f830a.postDelayed(this, 16L);
        }
    }

    public void setAtmospheric(boolean z) {
        this.f807E0 = z;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f847p0 = z;
        m863a();
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f802A = i;
        invalidate();
    }

    public void setCurtainHeight(int i) {
        this.f804C = i;
    }

    public void setCurved(boolean z) {
        this.f811G0 = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f809F0 = z;
        m867e();
        invalidate();
    }

    public void setData(List list) {
        if (vwb.J(list)) {
            jfd0.a("WheelPicker's data can not be null!");
            return;
        }
        this.f845o = list;
        this.f814I = 0;
        this.f812H = 0;
        this.f824R = 0;
        m870h();
        m867e();
        requestLayout();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f841k0 = z;
        m868f();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f857z = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f856y = i;
        m868f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f805D = i;
        m876n();
        m866d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f803B = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f853v = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f855x = i;
        this.f831b.setTextSize(i);
        m870h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str == null) {
            jfd0.a("Maximum width text can not be null!");
            return;
        }
        this.f846p = str;
        m870h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m873k(i)) {
            this.f825S = i;
            m870h();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f845o.size() + "), but current is " + i);
    }

    public void setOnItemSelectedListener(InterfaceC3057a interfaceC3057a) {
    }

    public void setOnWheelChangeListener(InterfaceC3058b interfaceC3058b) {
        this.f835f = interfaceC3058b;
    }

    public void setSameWidth(boolean z) {
        this.f829W = z;
        m870h();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        m875m(i, false);
    }

    public void setSelectedItemTextColor(int i) {
        this.f854w = i;
        m863a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f831b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m870h();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f848q = i;
        m877o();
        requestLayout();
    }

    public MessageWheelPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageWheelPicker(Context context) {
        super(context);
        this.f830a = new Handler();
        this.f845o = new ArrayList();
        this.f848q = 7;
        this.f855x = 0;
        this.f856y = 0;
        this.f818L = 50;
        this.f819M = 8000;
        this.f828V = 8;
        m872j();
    }
}
