package com.p046p1.mobile.putong.core.message.inner.view;

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
import p149l.i9c0;
import p149l.jfd0;
import p149l.lwm;
import p149l.vwb;
import p149l.x1c0;

/* JADX INFO: loaded from: classes10.dex */
public class MessageWheelPicker extends View implements Runnable {

    /* JADX INFO: renamed from: A */
    public int f21140A;

    /* JADX INFO: renamed from: B */
    public int f21141B;

    /* JADX INFO: renamed from: C */
    public int f21142C;

    /* JADX INFO: renamed from: D */
    public int f21143D;

    /* JADX INFO: renamed from: E */
    public int f21144E;

    /* JADX INFO: renamed from: E0 */
    public boolean f21145E0;

    /* JADX INFO: renamed from: F */
    public int f21146F;

    /* JADX INFO: renamed from: F0 */
    public boolean f21147F0;

    /* JADX INFO: renamed from: G */
    public int f21148G;

    /* JADX INFO: renamed from: G0 */
    public boolean f21149G0;

    /* JADX INFO: renamed from: H */
    public int f21150H;

    /* JADX INFO: renamed from: H0 */
    public boolean f21151H0;

    /* JADX INFO: renamed from: I */
    public int f21152I;

    /* JADX INFO: renamed from: I0 */
    public boolean f21153I0;

    /* JADX INFO: renamed from: J */
    public int f21154J;

    /* JADX INFO: renamed from: K */
    public int f21155K;

    /* JADX INFO: renamed from: L */
    public int f21156L;

    /* JADX INFO: renamed from: M */
    public int f21157M;

    /* JADX INFO: renamed from: N */
    public int f21158N;

    /* JADX INFO: renamed from: O */
    public int f21159O;

    /* JADX INFO: renamed from: P */
    public int f21160P;

    /* JADX INFO: renamed from: Q */
    public int f21161Q;

    /* JADX INFO: renamed from: R */
    public int f21162R;

    /* JADX INFO: renamed from: S */
    public int f21163S;

    /* JADX INFO: renamed from: T */
    public int f21164T;

    /* JADX INFO: renamed from: U */
    public int f21165U;

    /* JADX INFO: renamed from: V */
    public int f21166V;

    /* JADX INFO: renamed from: W */
    public boolean f21167W;

    /* JADX INFO: renamed from: a */
    public final Handler f21168a;

    /* JADX INFO: renamed from: b */
    public Paint f21169b;

    /* JADX INFO: renamed from: c */
    public Scroller f21170c;

    /* JADX INFO: renamed from: d */
    public VelocityTracker f21171d;

    /* JADX INFO: renamed from: e */
    public boolean f21172e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7826b f21173f;

    /* JADX INFO: renamed from: g */
    public Rect f21174g;

    /* JADX INFO: renamed from: h */
    public Rect f21175h;

    /* JADX INFO: renamed from: i */
    public Rect f21176i;

    /* JADX INFO: renamed from: j */
    public Rect f21177j;

    /* JADX INFO: renamed from: k */
    public Rect f21178k;

    /* JADX INFO: renamed from: k0 */
    public boolean f21179k0;

    /* JADX INFO: renamed from: l */
    public Camera f21180l;

    /* JADX INFO: renamed from: m */
    public Matrix f21181m;

    /* JADX INFO: renamed from: n */
    public Matrix f21182n;

    /* JADX INFO: renamed from: o */
    public List f21183o;

    /* JADX INFO: renamed from: p */
    public String f21184p;

    /* JADX INFO: renamed from: p0 */
    public boolean f21185p0;

    /* JADX INFO: renamed from: q */
    public int f21186q;

    /* JADX INFO: renamed from: r */
    public int f21187r;

    /* JADX INFO: renamed from: s */
    public int f21188s;

    /* JADX INFO: renamed from: t */
    public int f21189t;

    /* JADX INFO: renamed from: u */
    public int f21190u;

    /* JADX INFO: renamed from: v */
    public int f21191v;

    /* JADX INFO: renamed from: w */
    public int f21192w;

    /* JADX INFO: renamed from: x */
    public int f21193x;

    /* JADX INFO: renamed from: y */
    public int f21194y;

    /* JADX INFO: renamed from: z */
    public int f21195z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.message.inner.view.MessageWheelPicker$a */
    public interface InterfaceC7825a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.message.inner.view.MessageWheelPicker$b */
    public interface InterfaceC7826b {
        /* JADX INFO: renamed from: a */
        void mo36018a(int i);

        /* JADX INFO: renamed from: b */
        void mo36019b(int i);

        /* JADX INFO: renamed from: c */
        void mo36020c(int i);
    }

    public MessageWheelPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21168a = new Handler();
        this.f21183o = new ArrayList();
        this.f21186q = 7;
        this.f21193x = 0;
        this.f21194y = 0;
        this.f21156L = 50;
        this.f21157M = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f21166V = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f112204x);
        this.f21186q = typedArrayObtainStyledAttributes.getInt(i9c0.f112147P, 7);
        this.f21150H = typedArrayObtainStyledAttributes.getInt(i9c0.f112145N, 0);
        this.f21167W = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112144M, false);
        this.f21163S = typedArrayObtainStyledAttributes.getInt(i9c0.f112143L, -1);
        this.f21184p = typedArrayObtainStyledAttributes.getString(i9c0.f112142K);
        this.f21141B = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.f112139H, getContext().getResources().getDimensionPixelSize(x1c0.f189052g));
        this.f21142C = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.f112134C, getContext().getResources().getDimensionPixelSize(x1c0.f189052g));
        this.f21193x = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.f112141J, getContext().getResources().getDimensionPixelSize(x1c0.f189053h));
        this.f21192w = typedArrayObtainStyledAttributes.getColor(i9c0.f112146O, -14606047);
        this.f21191v = typedArrayObtainStyledAttributes.getColor(i9c0.f112140I, -7829368);
        this.f21147F0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112136E, false);
        this.f21179k0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112137F, false);
        this.f21195z = typedArrayObtainStyledAttributes.getColor(i9c0.f112138G, -1166541);
        this.f21185p0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112132A, false);
        this.f21140A = typedArrayObtainStyledAttributes.getColor(i9c0.f112133B, -1996488705);
        this.f21145E0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112207z, false);
        this.f21149G0 = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112135D, false);
        this.f21143D = typedArrayObtainStyledAttributes.getInt(i9c0.f112206y, 0);
        typedArrayObtainStyledAttributes.recycle();
        m36012j();
    }

    /* JADX INFO: renamed from: a */
    public final void m36003a() {
        if (this.f21185p0 || this.f21192w != -1) {
            Rect rect = this.f21177j;
            Rect rect2 = this.f21174g;
            int i = rect2.left;
            int i2 = this.f21159O;
            int i3 = this.f21146F;
            rect.set(i, i2 - i3, rect2.right, i2 + i3);
            Rect rect3 = this.f21178k;
            Rect rect4 = this.f21174g;
            int i4 = rect4.left;
            int i5 = this.f21159O;
            int i6 = this.f21142C;
            rect3.set(i4, i5 - (i6 / 2), rect4.right, i5 + (i6 / 2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m36004b(int i) {
        return (int) (((double) this.f21148G) - (Math.cos(Math.toRadians(i)) * ((double) this.f21148G)));
    }

    /* JADX INFO: renamed from: c */
    public final int m36005c(int i) {
        if (Math.abs(i) <= this.f21146F) {
            return -i;
        }
        int i2 = this.f21162R;
        int i3 = this.f21144E;
        return i2 < 0 ? (-i3) - i : i3 - i;
    }

    /* JADX INFO: renamed from: d */
    public final void m36006d() {
        int i = this.f21143D;
        if (i == 1) {
            this.f21160P = this.f21174g.left;
        } else if (i != 2) {
            this.f21160P = this.f21158N;
        } else {
            this.f21160P = this.f21174g.right;
        }
        this.f21161Q = (int) (this.f21159O - ((this.f21169b.ascent() + this.f21169b.descent()) / 2.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m36007e() {
        int i = this.f21150H;
        int i2 = this.f21144E;
        int i3 = i * i2;
        this.f21154J = this.f21147F0 ? Integer.MIN_VALUE : ((-i2) * (this.f21183o.size() - 1)) + i3;
        if (this.f21147F0) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f21155K = i3;
    }

    /* JADX INFO: renamed from: f */
    public final void m36008f() {
        if (this.f21179k0) {
            int i = this.f21194y / 2;
            int i2 = this.f21159O;
            int i3 = this.f21146F;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f21175h;
            Rect rect2 = this.f21174g;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f21176i;
            Rect rect4 = this.f21174g;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m36009g(int i) {
        return (int) (Math.sin(Math.toRadians(i)) * ((double) this.f21148G));
    }

    public int getCurrentItemPosition() {
        return this.f21152I;
    }

    public int getCurtainColor() {
        return this.f21140A;
    }

    public List getData() {
        return this.f21183o;
    }

    public int getIndicatorColor() {
        return this.f21195z;
    }

    public int getIndicatorSize() {
        return this.f21194y;
    }

    public int getItemAlign() {
        return this.f21143D;
    }

    public int getItemSpace() {
        return this.f21141B;
    }

    public int getItemTextColor() {
        return this.f21191v;
    }

    public int getItemTextSize() {
        return this.f21193x;
    }

    public String getMaximumWidthText() {
        return this.f21184p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f21163S;
    }

    public Object getSelectItem() {
        return this.f21183o.get(this.f21152I);
    }

    public int getSelectedItemPosition() {
        return this.f21150H;
    }

    public int getSelectedItemTextColor() {
        return this.f21192w;
    }

    public Typeface getTypeface() {
        Paint paint = this.f21169b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f21186q;
    }

    /* JADX INFO: renamed from: h */
    public void m36010h() {
        this.f21190u = 0;
        this.f21189t = 0;
        if (vwb.m200296J(this.f21183o)) {
            return;
        }
        if (this.f21167W) {
            this.f21189t = (int) this.f21169b.measureText(String.valueOf(this.f21183o.get(0)));
        } else if (m36013k(this.f21163S)) {
            this.f21189t = (int) this.f21169b.measureText(String.valueOf(this.f21183o.get(this.f21163S)));
        } else if (TextUtils.isEmpty(this.f21184p)) {
            Iterator it = this.f21183o.iterator();
            while (it.hasNext()) {
                this.f21189t = Math.max(this.f21189t, (int) this.f21169b.measureText(String.valueOf(it.next())));
            }
        } else {
            this.f21189t = (int) this.f21169b.measureText(this.f21184p);
        }
        Paint.FontMetrics fontMetrics = this.f21169b.getFontMetrics();
        this.f21190u = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: i */
    public final String m36011i(String str) {
        return ((float) getWidth()) < this.f21169b.measureText(str) ? TextUtils.ellipsize(str, new TextPaint(this.f21169b), getWidth(), TextUtils.TruncateAt.END).toString() : str;
    }

    /* JADX INFO: renamed from: j */
    public final void m36012j() {
        m36017o();
        Paint paint = new Paint(69);
        this.f21169b = paint;
        paint.setTextSize(this.f21193x);
        m36016n();
        m36010h();
        this.f21170c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f21156L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21157M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f21166V = viewConfiguration.getScaledTouchSlop();
        this.f21174g = new Rect();
        this.f21175h = new Rect();
        this.f21176i = new Rect();
        this.f21177j = new Rect();
        this.f21178k = new Rect();
        this.f21180l = new Camera();
        this.f21181m = new Matrix();
        this.f21182n = new Matrix();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m36013k(int i) {
        return i >= 0 && i < this.f21183o.size();
    }

    /* JADX INFO: renamed from: l */
    public final int m36014l(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* JADX INFO: renamed from: m */
    public void m36015m(int i, boolean z) {
        this.f21172e = false;
        if (!z || !this.f21170c.isFinished()) {
            if (!this.f21170c.isFinished()) {
                this.f21170c.abortAnimation();
            }
            int iMax = Math.max(Math.min(i, this.f21183o.size() - 1), 0);
            this.f21150H = iMax;
            this.f21152I = iMax;
            this.f21162R = 0;
            m36007e();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f21152I;
        if (i2 == 0) {
            return;
        }
        if (this.f21147F0 && Math.abs(i2) > size / 2) {
            if (i2 > 0) {
                size = -size;
            }
            i2 += size;
        }
        Scroller scroller = this.f21170c;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f21144E);
        this.f21168a.post(this);
    }

    /* JADX INFO: renamed from: n */
    public void m36016n() {
        int i = this.f21143D;
        if (i == 1) {
            this.f21169b.setTextAlign(Paint.Align.LEFT);
            return;
        }
        Paint paint = this.f21169b;
        if (i != 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m36017o() {
        int i = this.f21186q;
        if (i < 2) {
            lwm.m151979a("Wheel's visible item count can not be less than 2!");
            return;
        }
        if (i % 2 == 0) {
            this.f21186q = i + 1;
        }
        int i2 = this.f21186q + 2;
        this.f21187r = i2;
        this.f21188s = i2 / 2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String strValueOf;
        int iM36009g;
        int i;
        InterfaceC7826b interfaceC7826b = this.f21173f;
        if (interfaceC7826b != null) {
            interfaceC7826b.mo36019b(this.f21162R);
        }
        if (this.f21183o.size() == 0) {
            return;
        }
        if (this.f21185p0) {
            this.f21169b.setColor(this.f21140A);
            this.f21169b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f21178k, this.f21169b);
        }
        int i2 = (-this.f21162R) / this.f21144E;
        int i3 = this.f21188s;
        int i4 = i2 - i3;
        int i5 = this.f21150H + i4;
        int i6 = -i3;
        while (i5 < this.f21150H + i4 + this.f21187r) {
            if (this.f21147F0) {
                int size = i5 % this.f21183o.size();
                if (size < 0) {
                    size += this.f21183o.size();
                }
                strValueOf = String.valueOf(this.f21183o.get(size));
            } else {
                strValueOf = m36013k(i5) ? String.valueOf(this.f21183o.get(i5)) : "";
            }
            this.f21169b.setColor(this.f21191v);
            this.f21169b.setStyle(Paint.Style.FILL);
            int i7 = this.f21161Q;
            int i8 = this.f21144E;
            int i9 = (i6 * i8) + i7 + (this.f21162R % i8);
            if (this.f21149G0) {
                int iAbs = i7 - Math.abs(i7 - i9);
                int i10 = this.f21174g.top;
                int i11 = this.f21161Q;
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
                iM36009g = m36009g(i12);
                int i13 = this.f21158N;
                int i14 = this.f21143D;
                if (i14 == 1) {
                    i13 = this.f21174g.left;
                } else if (i14 == 2) {
                    i13 = this.f21174g.right;
                }
                int i15 = this.f21159O - iM36009g;
                this.f21180l.save();
                this.f21180l.rotateX(f3);
                this.f21180l.getMatrix(this.f21181m);
                this.f21180l.restore();
                float f4 = -i13;
                float f5 = -i15;
                this.f21181m.preTranslate(f4, f5);
                float f6 = i13;
                float f7 = i15;
                this.f21181m.postTranslate(f6, f7);
                this.f21180l.save();
                this.f21180l.translate(0.0f, 0.0f, m36004b(i12));
                this.f21180l.getMatrix(this.f21182n);
                this.f21180l.restore();
                this.f21182n.preTranslate(f4, f5);
                this.f21182n.postTranslate(f6, f7);
                this.f21181m.postConcat(this.f21182n);
            } else {
                iM36009g = 0;
            }
            if (this.f21145E0) {
                int i16 = this.f21161Q;
                int iAbs2 = (int) ((((i16 - Math.abs(i16 - i9)) * 1.0f) / this.f21161Q) * 255.0f);
                this.f21169b.setAlpha(iAbs2 < 0 ? 0 : iAbs2);
            }
            if (this.f21149G0) {
                i9 = this.f21161Q - iM36009g;
            }
            if (this.f21192w != -1) {
                canvas.save();
                if (this.f21149G0) {
                    canvas.concat(this.f21181m);
                }
                canvas.clipRect(this.f21177j, Region.Op.DIFFERENCE);
                float f8 = i9;
                canvas.drawText(m36011i(strValueOf), this.f21160P, f8, this.f21169b);
                canvas.restore();
                this.f21169b.setColor(this.f21192w);
                canvas.save();
                if (this.f21149G0) {
                    canvas.concat(this.f21181m);
                }
                canvas.clipRect(this.f21177j);
                canvas.drawText(m36011i(strValueOf), this.f21160P, f8, this.f21169b);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.f21174g);
                if (this.f21149G0) {
                    canvas.concat(this.f21181m);
                }
                canvas.drawText(m36011i(strValueOf), this.f21160P, i9, this.f21169b);
                canvas.restore();
            }
            i5++;
            i6++;
        }
        if (this.f21179k0) {
            this.f21169b.setColor(this.f21195z);
            this.f21169b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f21175h, this.f21169b);
            canvas.drawRect(this.f21176i, this.f21169b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f21189t;
        int i4 = this.f21190u;
        int i5 = this.f21186q;
        int i6 = (i4 * i5) + (this.f21141B * (i5 - 1));
        if (this.f21149G0) {
            i6 = (int) (((double) (i6 * 2)) / 3.141592653589793d);
        }
        setMeasuredDimension(m36014l(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m36014l(mode2, size2, i6 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f21174g.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f21158N = this.f21174g.centerX();
        this.f21159O = this.f21174g.centerY();
        m36006d();
        this.f21148G = this.f21174g.height() / 2;
        int iHeight = this.f21174g.height() / this.f21186q;
        this.f21144E = iHeight;
        this.f21146F = iHeight / 2;
        m36007e();
        m36008f();
        m36003a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21172e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f21171d;
            if (velocityTracker == null) {
                this.f21171d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f21171d.addMovement(motionEvent);
            if (!this.f21170c.isFinished()) {
                this.f21170c.abortAnimation();
                this.f21153I0 = true;
            }
            int y = (int) motionEvent.getY();
            this.f21164T = y;
            this.f21165U = y;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f21151H0 || this.f21153I0) {
                this.f21171d.addMovement(motionEvent);
                this.f21171d.computeCurrentVelocity(1000, this.f21157M);
                this.f21153I0 = false;
                int yVelocity = (int) this.f21171d.getYVelocity();
                int iAbs = Math.abs(yVelocity);
                int i = this.f21156L;
                Scroller scroller = this.f21170c;
                if (iAbs > i) {
                    scroller.fling(0, this.f21162R, 0, yVelocity, 0, 0, this.f21154J, this.f21155K);
                    Scroller scroller2 = this.f21170c;
                    scroller2.setFinalY(scroller2.getFinalY() + m36005c(this.f21170c.getFinalY() % this.f21144E));
                } else {
                    int i2 = this.f21162R;
                    scroller.startScroll(0, i2, 0, m36005c(i2 % this.f21144E));
                }
                if (!this.f21147F0) {
                    int finalY = this.f21170c.getFinalY();
                    int i3 = this.f21155K;
                    Scroller scroller3 = this.f21170c;
                    if (finalY > i3) {
                        scroller3.setFinalY(i3);
                    } else {
                        int finalY2 = scroller3.getFinalY();
                        int i4 = this.f21154J;
                        if (finalY2 < i4) {
                            this.f21170c.setFinalY(i4);
                        }
                    }
                }
                this.f21168a.post(this);
                VelocityTracker velocityTracker2 = this.f21171d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f21171d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f21171d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f21171d = null;
                }
            }
        } else if (Math.abs(this.f21165U - motionEvent.getY()) < this.f21166V) {
            this.f21151H0 = true;
        } else {
            this.f21151H0 = false;
            this.f21171d.addMovement(motionEvent);
            InterfaceC7826b interfaceC7826b = this.f21173f;
            if (interfaceC7826b != null) {
                interfaceC7826b.mo36020c(1);
            }
            float y2 = motionEvent.getY() - this.f21164T;
            if (Math.abs(y2) >= 1.0f) {
                this.f21162R = (int) (this.f21162R + y2);
                this.f21164T = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f21183o;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f21170c.isFinished() && !this.f21153I0) {
            int i = this.f21144E;
            if (i == 0) {
                return;
            }
            int size = (((-this.f21162R) / i) + this.f21150H) % this.f21183o.size();
            if (size < 0) {
                size += this.f21183o.size();
            }
            this.f21152I = size;
            InterfaceC7826b interfaceC7826b = this.f21173f;
            if (interfaceC7826b != null && this.f21172e) {
                interfaceC7826b.mo36018a(size);
                this.f21173f.mo36020c(0);
            }
        }
        if (this.f21170c.computeScrollOffset()) {
            InterfaceC7826b interfaceC7826b2 = this.f21173f;
            if (interfaceC7826b2 != null) {
                interfaceC7826b2.mo36020c(2);
            }
            this.f21162R = this.f21170c.getCurrY();
            postInvalidate();
            this.f21168a.postDelayed(this, 16L);
        }
    }

    public void setAtmospheric(boolean z) {
        this.f21145E0 = z;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f21185p0 = z;
        m36003a();
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f21140A = i;
        invalidate();
    }

    public void setCurtainHeight(int i) {
        this.f21142C = i;
    }

    public void setCurved(boolean z) {
        this.f21149G0 = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f21147F0 = z;
        m36007e();
        invalidate();
    }

    public void setData(List list) {
        if (vwb.m200296J(list)) {
            jfd0.m141176a("WheelPicker's data can not be null!");
            return;
        }
        this.f21183o = list;
        this.f21152I = 0;
        this.f21150H = 0;
        this.f21162R = 0;
        m36010h();
        m36007e();
        requestLayout();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f21179k0 = z;
        m36008f();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f21195z = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f21194y = i;
        m36008f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f21143D = i;
        m36016n();
        m36006d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f21141B = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f21191v = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f21193x = i;
        this.f21169b.setTextSize(i);
        m36010h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str == null) {
            jfd0.m141176a("Maximum width text can not be null!");
            return;
        }
        this.f21184p = str;
        m36010h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m36013k(i)) {
            this.f21163S = i;
            m36010h();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f21183o.size() + "), but current is " + i);
    }

    public void setOnItemSelectedListener(InterfaceC7825a interfaceC7825a) {
    }

    public void setOnWheelChangeListener(InterfaceC7826b interfaceC7826b) {
        this.f21173f = interfaceC7826b;
    }

    public void setSameWidth(boolean z) {
        this.f21167W = z;
        m36010h();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        m36015m(i, false);
    }

    public void setSelectedItemTextColor(int i) {
        this.f21192w = i;
        m36003a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f21169b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m36010h();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f21186q = i;
        m36017o();
        requestLayout();
    }

    public MessageWheelPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageWheelPicker(Context context) {
        super(context);
        this.f21168a = new Handler();
        this.f21183o = new ArrayList();
        this.f21186q = 7;
        this.f21193x = 0;
        this.f21194y = 0;
        this.f21156L = 50;
        this.f21157M = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f21166V = 8;
        m36012j();
    }
}
