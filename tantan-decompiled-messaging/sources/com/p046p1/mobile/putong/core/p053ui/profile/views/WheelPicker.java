package com.p046p1.mobile.putong.core.p053ui.profile.views;

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
import com.google.android.gms.common.api.Api;
import com.tencent.ugc.TXRecordCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.jfd0;
import p149l.k9c0;
import p149l.lwm;
import p149l.ura;
import p149l.vwb;
import p149l.y1c0;

/* JADX INFO: loaded from: classes4.dex */
public class WheelPicker extends View implements Runnable {

    /* JADX INFO: renamed from: A */
    public int f34265A;

    /* JADX INFO: renamed from: B */
    public int f34266B;

    /* JADX INFO: renamed from: C */
    public int f34267C;

    /* JADX INFO: renamed from: D */
    public int f34268D;

    /* JADX INFO: renamed from: E */
    public int f34269E;

    /* JADX INFO: renamed from: E0 */
    public boolean f34270E0;

    /* JADX INFO: renamed from: F */
    public int f34271F;

    /* JADX INFO: renamed from: F0 */
    public boolean f34272F0;

    /* JADX INFO: renamed from: G */
    public int f34273G;

    /* JADX INFO: renamed from: G0 */
    public boolean f34274G0;

    /* JADX INFO: renamed from: H */
    public int f34275H;

    /* JADX INFO: renamed from: H0 */
    public boolean f34276H0;

    /* JADX INFO: renamed from: I */
    public int f34277I;

    /* JADX INFO: renamed from: I0 */
    public boolean f34278I0;

    /* JADX INFO: renamed from: J */
    public int f34279J;

    /* JADX INFO: renamed from: K */
    public int f34280K;

    /* JADX INFO: renamed from: L */
    public int f34281L;

    /* JADX INFO: renamed from: M */
    public int f34282M;

    /* JADX INFO: renamed from: N */
    public int f34283N;

    /* JADX INFO: renamed from: O */
    public int f34284O;

    /* JADX INFO: renamed from: P */
    public int f34285P;

    /* JADX INFO: renamed from: Q */
    public int f34286Q;

    /* JADX INFO: renamed from: R */
    public int f34287R;

    /* JADX INFO: renamed from: S */
    public int f34288S;

    /* JADX INFO: renamed from: T */
    public int f34289T;

    /* JADX INFO: renamed from: U */
    public int f34290U;

    /* JADX INFO: renamed from: V */
    public int f34291V;

    /* JADX INFO: renamed from: W */
    public boolean f34292W;

    /* JADX INFO: renamed from: a */
    public final Handler f34293a;

    /* JADX INFO: renamed from: b */
    public Paint f34294b;

    /* JADX INFO: renamed from: c */
    public Scroller f34295c;

    /* JADX INFO: renamed from: d */
    public VelocityTracker f34296d;

    /* JADX INFO: renamed from: e */
    public boolean f34297e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8749a f34298f;

    /* JADX INFO: renamed from: g */
    public Rect f34299g;

    /* JADX INFO: renamed from: h */
    public Rect f34300h;

    /* JADX INFO: renamed from: i */
    public Rect f34301i;

    /* JADX INFO: renamed from: j */
    public Rect f34302j;

    /* JADX INFO: renamed from: k */
    public Rect f34303k;

    /* JADX INFO: renamed from: k0 */
    public boolean f34304k0;

    /* JADX INFO: renamed from: l */
    public Camera f34305l;

    /* JADX INFO: renamed from: m */
    public Matrix f34306m;

    /* JADX INFO: renamed from: n */
    public Matrix f34307n;

    /* JADX INFO: renamed from: o */
    public List f34308o;

    /* JADX INFO: renamed from: p */
    public String f34309p;

    /* JADX INFO: renamed from: p0 */
    public boolean f34310p0;

    /* JADX INFO: renamed from: q */
    public int f34311q;

    /* JADX INFO: renamed from: r */
    public int f34312r;

    /* JADX INFO: renamed from: s */
    public int f34313s;

    /* JADX INFO: renamed from: t */
    public int f34314t;

    /* JADX INFO: renamed from: u */
    public int f34315u;

    /* JADX INFO: renamed from: v */
    public int f34316v;

    /* JADX INFO: renamed from: w */
    public int f34317w;

    /* JADX INFO: renamed from: x */
    public int f34318x;

    /* JADX INFO: renamed from: y */
    public int f34319y;

    /* JADX INFO: renamed from: z */
    public int f34320z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.WheelPicker$a */
    public interface InterfaceC8749a {
        /* JADX INFO: renamed from: a */
        void mo53063a(WheelPicker wheelPicker, Object obj, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.WheelPicker$b */
    public interface InterfaceC8750b {
    }

    public WheelPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34293a = new Handler();
        this.f34308o = new ArrayList();
        this.f34311q = 7;
        this.f34318x = 0;
        this.f34319y = 0;
        this.f34281L = 50;
        this.f34282M = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f34291V = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.f121949Q);
        this.f34311q = typedArrayObtainStyledAttributes.getInt(k9c0.f121976i0, 7);
        this.f34275H = typedArrayObtainStyledAttributes.getInt(k9c0.f121972g0, 0);
        this.f34292W = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121970f0, false);
        this.f34288S = typedArrayObtainStyledAttributes.getInt(k9c0.f121968e0, -1);
        this.f34309p = typedArrayObtainStyledAttributes.getString(k9c0.f121966d0);
        this.f34266B = typedArrayObtainStyledAttributes.getDimensionPixelSize(k9c0.f121960a0, getContext().getResources().getDimensionPixelSize(y1c0.f195401a));
        this.f34267C = typedArrayObtainStyledAttributes.getDimensionPixelSize(k9c0.f121954V, getContext().getResources().getDimensionPixelSize(y1c0.f195401a));
        this.f34318x = typedArrayObtainStyledAttributes.getDimensionPixelSize(k9c0.f121964c0, getContext().getResources().getDimensionPixelSize(y1c0.f195402b));
        this.f34317w = typedArrayObtainStyledAttributes.getColor(k9c0.f121974h0, -14606047);
        this.f34316v = typedArrayObtainStyledAttributes.getColor(k9c0.f121962b0, -7829368);
        this.f34272F0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121956X, false);
        this.f34304k0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121957Y, false);
        this.f34320z = typedArrayObtainStyledAttributes.getColor(k9c0.f121958Z, -1166541);
        this.f34310p0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121952T, false);
        this.f34265A = typedArrayObtainStyledAttributes.getColor(k9c0.f121953U, -1996488705);
        this.f34270E0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121951S, false);
        this.f34274G0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121955W, false);
        this.f34268D = typedArrayObtainStyledAttributes.getInt(k9c0.f121950R, 0);
        typedArrayObtainStyledAttributes.recycle();
        m53057j();
    }

    /* JADX INFO: renamed from: a */
    public final void m53048a() {
        if (this.f34310p0 || this.f34317w != -1) {
            Rect rect = this.f34302j;
            Rect rect2 = this.f34299g;
            int i = rect2.left;
            int i2 = this.f34284O;
            int i3 = this.f34271F;
            rect.set(i, i2 - i3, rect2.right, i2 + i3);
            Rect rect3 = this.f34303k;
            Rect rect4 = this.f34299g;
            int i4 = rect4.left;
            int i5 = this.f34284O;
            int i6 = this.f34267C;
            rect3.set(i4, i5 - (i6 / 2), rect4.right, i5 + (i6 / 2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m53049b(int i) {
        return (int) (((double) this.f34273G) - (Math.cos(Math.toRadians(i)) * ((double) this.f34273G)));
    }

    /* JADX INFO: renamed from: c */
    public final int m53050c(int i) {
        if (Math.abs(i) <= this.f34271F) {
            return -i;
        }
        int i2 = this.f34287R;
        int i3 = this.f34269E;
        return i2 < 0 ? (-i3) - i : i3 - i;
    }

    /* JADX INFO: renamed from: d */
    public final void m53051d() {
        int i = this.f34268D;
        if (i == 1) {
            this.f34285P = this.f34299g.left;
        } else if (i != 2) {
            this.f34285P = this.f34283N;
        } else {
            this.f34285P = this.f34299g.right;
        }
        this.f34286Q = (int) (this.f34284O - ((this.f34294b.ascent() + this.f34294b.descent()) / 2.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m53052e() {
        int i = this.f34275H;
        int i2 = this.f34269E;
        int i3 = i * i2;
        this.f34279J = this.f34272F0 ? Integer.MIN_VALUE : ((-i2) * (this.f34308o.size() - 1)) + i3;
        if (this.f34272F0) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f34280K = i3;
    }

    /* JADX INFO: renamed from: f */
    public final void m53053f() {
        if (this.f34304k0) {
            int i = this.f34319y / 2;
            int i2 = this.f34284O;
            int i3 = this.f34271F;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f34300h;
            Rect rect2 = this.f34299g;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f34301i;
            Rect rect4 = this.f34299g;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m53054g(int i) {
        return (int) (Math.sin(Math.toRadians(i)) * ((double) this.f34273G));
    }

    public int getCurrentItemPosition() {
        return this.f34277I;
    }

    public int getCurtainColor() {
        return this.f34265A;
    }

    public List getData() {
        return this.f34308o;
    }

    public int getIndicatorColor() {
        return this.f34320z;
    }

    public int getIndicatorSize() {
        return this.f34319y;
    }

    public int getItemAlign() {
        return this.f34268D;
    }

    public int getItemSpace() {
        return this.f34266B;
    }

    public int getItemTextColor() {
        return this.f34316v;
    }

    public int getItemTextSize() {
        return this.f34318x;
    }

    public String getMaximumWidthText() {
        return this.f34309p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f34288S;
    }

    public Object getSelectItem() {
        return this.f34308o.get(this.f34277I);
    }

    public int getSelectedItemPosition() {
        return this.f34275H;
    }

    public int getSelectedItemTextColor() {
        return this.f34317w;
    }

    public Typeface getTypeface() {
        Paint paint = this.f34294b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f34311q;
    }

    /* JADX INFO: renamed from: h */
    public void m53055h() {
        this.f34315u = 0;
        this.f34314t = 0;
        if (vwb.m200296J(this.f34308o)) {
            return;
        }
        if (this.f34292W) {
            this.f34314t = (int) this.f34294b.measureText(String.valueOf(this.f34308o.get(0)));
        } else if (m53058k(this.f34288S)) {
            this.f34314t = (int) this.f34294b.measureText(String.valueOf(this.f34308o.get(this.f34288S)));
        } else if (TextUtils.isEmpty(this.f34309p)) {
            Iterator it = this.f34308o.iterator();
            while (it.hasNext()) {
                this.f34314t = Math.max(this.f34314t, (int) this.f34294b.measureText(String.valueOf(it.next())));
            }
        } else {
            this.f34314t = (int) this.f34294b.measureText(this.f34309p);
        }
        Paint.FontMetrics fontMetrics = this.f34294b.getFontMetrics();
        this.f34315u = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: i */
    public final String m53056i(String str) {
        return ((float) getWidth()) < this.f34294b.measureText(str) ? TextUtils.ellipsize(str, new TextPaint(this.f34294b), getWidth(), TextUtils.TruncateAt.END).toString() : str;
    }

    /* JADX INFO: renamed from: j */
    public final void m53057j() {
        m53062o();
        Paint paint = new Paint(69);
        this.f34294b = paint;
        paint.setTextSize(this.f34318x);
        m53061n();
        m53055h();
        this.f34295c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f34281L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f34282M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f34291V = viewConfiguration.getScaledTouchSlop();
        this.f34299g = new Rect();
        this.f34300h = new Rect();
        this.f34301i = new Rect();
        this.f34302j = new Rect();
        this.f34303k = new Rect();
        this.f34305l = new Camera();
        this.f34306m = new Matrix();
        this.f34307n = new Matrix();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m53058k(int i) {
        return i >= 0 && i < this.f34308o.size();
    }

    /* JADX INFO: renamed from: l */
    public final int m53059l(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* JADX INFO: renamed from: m */
    public void m53060m(int i, boolean z) {
        this.f34297e = false;
        if (!z || !this.f34295c.isFinished()) {
            if (!this.f34295c.isFinished()) {
                this.f34295c.abortAnimation();
            }
            int iMax = Math.max(Math.min(i, this.f34308o.size() - 1), 0);
            this.f34275H = iMax;
            this.f34277I = iMax;
            this.f34287R = 0;
            m53052e();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f34277I;
        if (i2 == 0) {
            return;
        }
        if (this.f34272F0 && Math.abs(i2) > size / 2) {
            if (i2 > 0) {
                size = -size;
            }
            i2 += size;
        }
        Scroller scroller = this.f34295c;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f34269E);
        this.f34293a.post(this);
    }

    /* JADX INFO: renamed from: n */
    public void m53061n() {
        int i = this.f34268D;
        if (i == 1) {
            this.f34294b.setTextAlign(Paint.Align.LEFT);
            return;
        }
        Paint paint = this.f34294b;
        if (i != 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m53062o() {
        int i = this.f34311q;
        if (i < 2) {
            lwm.m151979a("Wheel's visible item count can not be less than 2!");
            return;
        }
        if (i % 2 == 0) {
            this.f34311q = i + 1;
        }
        int i2 = this.f34311q + 2;
        this.f34312r = i2;
        this.f34313s = i2 / 2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String strValueOf;
        int iM53054g;
        int i;
        if (this.f34308o.size() == 0) {
            return;
        }
        if (this.f34310p0) {
            this.f34294b.setColor(this.f34265A);
            this.f34294b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f34303k, this.f34294b);
        }
        int i2 = (-this.f34287R) / this.f34269E;
        int i3 = this.f34313s;
        int i4 = i2 - i3;
        int i5 = this.f34275H + i4;
        int i6 = -i3;
        while (i5 < this.f34275H + i4 + this.f34312r) {
            if (this.f34272F0) {
                int size = i5 % this.f34308o.size();
                if (size < 0) {
                    size += this.f34308o.size();
                }
                strValueOf = String.valueOf(this.f34308o.get(size));
            } else {
                strValueOf = m53058k(i5) ? String.valueOf(this.f34308o.get(i5)) : "";
            }
            if (ura.m195053e().m195057d().mo33940w()) {
                this.f34294b.setFakeBoldText(true);
            }
            this.f34294b.setColor(this.f34316v);
            this.f34294b.setStyle(Paint.Style.FILL);
            int i7 = this.f34286Q;
            int i8 = this.f34269E;
            int i9 = (i6 * i8) + i7 + (this.f34287R % i8);
            if (this.f34274G0) {
                int iAbs = i7 - Math.abs(i7 - i9);
                int i10 = this.f34299g.top;
                int i11 = this.f34286Q;
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
                iM53054g = m53054g(i12);
                int i13 = this.f34283N;
                int i14 = this.f34268D;
                if (i14 == 1) {
                    i13 = this.f34299g.left;
                } else if (i14 == 2) {
                    i13 = this.f34299g.right;
                }
                int i15 = this.f34284O - iM53054g;
                this.f34305l.save();
                this.f34305l.rotateX(f3);
                this.f34305l.getMatrix(this.f34306m);
                this.f34305l.restore();
                float f4 = -i13;
                float f5 = -i15;
                this.f34306m.preTranslate(f4, f5);
                float f6 = i13;
                float f7 = i15;
                this.f34306m.postTranslate(f6, f7);
                this.f34305l.save();
                this.f34305l.translate(0.0f, 0.0f, m53049b(i12));
                this.f34305l.getMatrix(this.f34307n);
                this.f34305l.restore();
                this.f34307n.preTranslate(f4, f5);
                this.f34307n.postTranslate(f6, f7);
                this.f34306m.postConcat(this.f34307n);
            } else {
                iM53054g = 0;
            }
            if (this.f34270E0) {
                int i16 = this.f34286Q;
                int iAbs2 = (int) ((((i16 - Math.abs(i16 - i9)) * 1.0f) / this.f34286Q) * 255.0f);
                this.f34294b.setAlpha(iAbs2 < 0 ? 0 : iAbs2);
            }
            if (this.f34274G0) {
                i9 = this.f34286Q - iM53054g;
            }
            if (this.f34317w != -1) {
                canvas.save();
                if (this.f34274G0) {
                    canvas.concat(this.f34306m);
                }
                canvas.clipRect(this.f34302j, Region.Op.DIFFERENCE);
                float f8 = i9;
                canvas.drawText(m53056i(strValueOf), this.f34285P, f8, this.f34294b);
                canvas.restore();
                this.f34294b.setColor(this.f34317w);
                canvas.save();
                if (this.f34274G0) {
                    canvas.concat(this.f34306m);
                }
                canvas.clipRect(this.f34302j);
                canvas.drawText(m53056i(strValueOf), this.f34285P, f8, this.f34294b);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.f34299g);
                if (this.f34274G0) {
                    canvas.concat(this.f34306m);
                }
                canvas.drawText(m53056i(strValueOf), this.f34285P, i9, this.f34294b);
                canvas.restore();
            }
            i5++;
            i6++;
        }
        if (this.f34304k0) {
            this.f34294b.setColor(this.f34320z);
            this.f34294b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f34300h, this.f34294b);
            canvas.drawRect(this.f34301i, this.f34294b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f34314t;
        int i4 = this.f34315u;
        int i5 = this.f34311q;
        int i6 = (i4 * i5) + (this.f34266B * (i5 - 1));
        if (this.f34274G0) {
            i6 = (int) (((double) (i6 * 2)) / 3.141592653589793d);
        }
        setMeasuredDimension(m53059l(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m53059l(mode2, size2, i6 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f34299g.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f34283N = this.f34299g.centerX();
        this.f34284O = this.f34299g.centerY();
        m53051d();
        this.f34273G = this.f34299g.height() / 2;
        int iHeight = this.f34299g.height() / this.f34311q;
        this.f34269E = iHeight;
        this.f34271F = iHeight / 2;
        m53052e();
        m53053f();
        m53048a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f34297e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f34296d;
            if (velocityTracker == null) {
                this.f34296d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f34296d.addMovement(motionEvent);
            if (!this.f34295c.isFinished()) {
                this.f34295c.abortAnimation();
                this.f34278I0 = true;
            }
            int y = (int) motionEvent.getY();
            this.f34289T = y;
            this.f34290U = y;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f34276H0 || this.f34278I0) {
                this.f34296d.addMovement(motionEvent);
                this.f34296d.computeCurrentVelocity(1000, this.f34282M);
                this.f34278I0 = false;
                int yVelocity = (int) this.f34296d.getYVelocity();
                int iAbs = Math.abs(yVelocity);
                int i = this.f34281L;
                Scroller scroller = this.f34295c;
                if (iAbs > i) {
                    scroller.fling(0, this.f34287R, 0, yVelocity, 0, 0, this.f34279J, this.f34280K);
                    Scroller scroller2 = this.f34295c;
                    scroller2.setFinalY(scroller2.getFinalY() + m53050c(this.f34295c.getFinalY() % this.f34269E));
                } else {
                    int i2 = this.f34287R;
                    scroller.startScroll(0, i2, 0, m53050c(i2 % this.f34269E));
                }
                if (!this.f34272F0) {
                    int finalY = this.f34295c.getFinalY();
                    int i3 = this.f34280K;
                    Scroller scroller3 = this.f34295c;
                    if (finalY > i3) {
                        scroller3.setFinalY(i3);
                    } else {
                        int finalY2 = scroller3.getFinalY();
                        int i4 = this.f34279J;
                        if (finalY2 < i4) {
                            this.f34295c.setFinalY(i4);
                        }
                    }
                }
                this.f34293a.post(this);
                VelocityTracker velocityTracker2 = this.f34296d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f34296d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f34296d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f34296d = null;
                }
            }
        } else if (Math.abs(this.f34290U - motionEvent.getY()) < this.f34291V) {
            this.f34276H0 = true;
        } else {
            this.f34276H0 = false;
            this.f34296d.addMovement(motionEvent);
            float y2 = motionEvent.getY() - this.f34289T;
            if (Math.abs(y2) >= 1.0f) {
                this.f34287R = (int) (this.f34287R + y2);
                this.f34289T = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f34308o;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f34295c.isFinished() && !this.f34278I0) {
            int i = this.f34269E;
            if (i == 0) {
                return;
            }
            int size = (((-this.f34287R) / i) + this.f34275H) % this.f34308o.size();
            if (size < 0) {
                size += this.f34308o.size();
            }
            this.f34277I = size;
            InterfaceC8749a interfaceC8749a = this.f34298f;
            if (interfaceC8749a != null && this.f34297e) {
                interfaceC8749a.mo53063a(this, this.f34308o.get(size), size);
            }
        }
        if (this.f34295c.computeScrollOffset()) {
            this.f34287R = this.f34295c.getCurrY();
            postInvalidate();
            this.f34293a.postDelayed(this, 16L);
        }
    }

    public void setAtmospheric(boolean z) {
        this.f34270E0 = z;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f34310p0 = z;
        m53048a();
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f34265A = i;
        invalidate();
    }

    public void setCurtainHeight(int i) {
        this.f34267C = i;
    }

    public void setCurved(boolean z) {
        this.f34274G0 = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f34272F0 = z;
        m53052e();
        invalidate();
    }

    public void setData(List list) {
        if (vwb.m200296J(list)) {
            jfd0.m141176a("WheelPicker's data can not be null!");
            return;
        }
        this.f34308o = list;
        this.f34277I = 0;
        this.f34275H = 0;
        this.f34287R = 0;
        m53055h();
        m53052e();
        requestLayout();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f34304k0 = z;
        m53053f();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f34320z = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f34319y = i;
        m53053f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f34268D = i;
        m53061n();
        m53051d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f34266B = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f34316v = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f34318x = i;
        this.f34294b.setTextSize(i);
        m53055h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str == null) {
            jfd0.m141176a("Maximum width text can not be null!");
            return;
        }
        this.f34309p = str;
        m53055h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m53058k(i)) {
            this.f34288S = i;
            m53055h();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f34308o.size() + "), but current is " + i);
    }

    public void setOnItemSelectedListener(InterfaceC8749a interfaceC8749a) {
        this.f34298f = interfaceC8749a;
    }

    public void setOnWheelChangeListener(InterfaceC8750b interfaceC8750b) {
    }

    public void setSameWidth(boolean z) {
        this.f34292W = z;
        m53055h();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        m53060m(i, false);
    }

    public void setSelectedItemTextColor(int i) {
        this.f34317w = i;
        m53048a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f34294b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m53055h();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f34311q = i;
        m53062o();
        requestLayout();
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WheelPicker(Context context) {
        super(context);
        this.f34293a = new Handler();
        this.f34308o = new ArrayList();
        this.f34311q = 7;
        this.f34318x = 0;
        this.f34319y = 0;
        this.f34281L = 50;
        this.f34282M = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f34291V = 8;
        m53057j();
    }
}
