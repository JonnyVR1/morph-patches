package com.p051p1.mobile.putong.core.p058ui.profile.views;

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
import p153l.fac0;
import p153l.gta;
import p153l.jyb;
import p153l.mnd0;
import p153l.mym;
import p153l.rhc0;

/* JADX INFO: loaded from: classes4.dex */
public class WheelPicker extends View implements Runnable {

    /* JADX INFO: renamed from: A */
    public int f35113A;

    /* JADX INFO: renamed from: B */
    public int f35114B;

    /* JADX INFO: renamed from: C */
    public int f35115C;

    /* JADX INFO: renamed from: D */
    public int f35116D;

    /* JADX INFO: renamed from: E */
    public int f35117E;

    /* JADX INFO: renamed from: E0 */
    public boolean f35118E0;

    /* JADX INFO: renamed from: F */
    public int f35119F;

    /* JADX INFO: renamed from: F0 */
    public boolean f35120F0;

    /* JADX INFO: renamed from: G */
    public int f35121G;

    /* JADX INFO: renamed from: G0 */
    public boolean f35122G0;

    /* JADX INFO: renamed from: H */
    public int f35123H;

    /* JADX INFO: renamed from: H0 */
    public boolean f35124H0;

    /* JADX INFO: renamed from: I */
    public int f35125I;

    /* JADX INFO: renamed from: I0 */
    public boolean f35126I0;

    /* JADX INFO: renamed from: J */
    public int f35127J;

    /* JADX INFO: renamed from: K */
    public int f35128K;

    /* JADX INFO: renamed from: L */
    public int f35129L;

    /* JADX INFO: renamed from: M */
    public int f35130M;

    /* JADX INFO: renamed from: N */
    public int f35131N;

    /* JADX INFO: renamed from: O */
    public int f35132O;

    /* JADX INFO: renamed from: P */
    public int f35133P;

    /* JADX INFO: renamed from: Q */
    public int f35134Q;

    /* JADX INFO: renamed from: R */
    public int f35135R;

    /* JADX INFO: renamed from: S */
    public int f35136S;

    /* JADX INFO: renamed from: T */
    public int f35137T;

    /* JADX INFO: renamed from: U */
    public int f35138U;

    /* JADX INFO: renamed from: V */
    public int f35139V;

    /* JADX INFO: renamed from: W */
    public boolean f35140W;

    /* JADX INFO: renamed from: a */
    public final Handler f35141a;

    /* JADX INFO: renamed from: b */
    public Paint f35142b;

    /* JADX INFO: renamed from: c */
    public Scroller f35143c;

    /* JADX INFO: renamed from: d */
    public VelocityTracker f35144d;

    /* JADX INFO: renamed from: e */
    public boolean f35145e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8912a f35146f;

    /* JADX INFO: renamed from: g */
    public Rect f35147g;

    /* JADX INFO: renamed from: h */
    public Rect f35148h;

    /* JADX INFO: renamed from: i */
    public Rect f35149i;

    /* JADX INFO: renamed from: j */
    public Rect f35150j;

    /* JADX INFO: renamed from: k */
    public Rect f35151k;

    /* JADX INFO: renamed from: k0 */
    public boolean f35152k0;

    /* JADX INFO: renamed from: l */
    public Camera f35153l;

    /* JADX INFO: renamed from: m */
    public Matrix f35154m;

    /* JADX INFO: renamed from: n */
    public Matrix f35155n;

    /* JADX INFO: renamed from: o */
    public List f35156o;

    /* JADX INFO: renamed from: p */
    public String f35157p;

    /* JADX INFO: renamed from: p0 */
    public boolean f35158p0;

    /* JADX INFO: renamed from: q */
    public int f35159q;

    /* JADX INFO: renamed from: r */
    public int f35160r;

    /* JADX INFO: renamed from: s */
    public int f35161s;

    /* JADX INFO: renamed from: t */
    public int f35162t;

    /* JADX INFO: renamed from: u */
    public int f35163u;

    /* JADX INFO: renamed from: v */
    public int f35164v;

    /* JADX INFO: renamed from: w */
    public int f35165w;

    /* JADX INFO: renamed from: x */
    public int f35166x;

    /* JADX INFO: renamed from: y */
    public int f35167y;

    /* JADX INFO: renamed from: z */
    public int f35168z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.WheelPicker$a */
    public interface InterfaceC8912a {
        /* JADX INFO: renamed from: a */
        void mo54246a(WheelPicker wheelPicker, Object obj, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.WheelPicker$b */
    public interface InterfaceC8913b {
    }

    public WheelPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35141a = new Handler();
        this.f35156o = new ArrayList();
        this.f35159q = 7;
        this.f35166x = 0;
        this.f35167y = 0;
        this.f35129L = 50;
        this.f35130M = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f35139V = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rhc0.f163110Q);
        this.f35159q = typedArrayObtainStyledAttributes.getInt(rhc0.f163137i0, 7);
        this.f35123H = typedArrayObtainStyledAttributes.getInt(rhc0.f163133g0, 0);
        this.f35140W = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163131f0, false);
        this.f35136S = typedArrayObtainStyledAttributes.getInt(rhc0.f163129e0, -1);
        this.f35157p = typedArrayObtainStyledAttributes.getString(rhc0.f163127d0);
        this.f35114B = typedArrayObtainStyledAttributes.getDimensionPixelSize(rhc0.f163121a0, getContext().getResources().getDimensionPixelSize(fac0.f97974a));
        this.f35115C = typedArrayObtainStyledAttributes.getDimensionPixelSize(rhc0.f163115V, getContext().getResources().getDimensionPixelSize(fac0.f97974a));
        this.f35166x = typedArrayObtainStyledAttributes.getDimensionPixelSize(rhc0.f163125c0, getContext().getResources().getDimensionPixelSize(fac0.f97975b));
        this.f35165w = typedArrayObtainStyledAttributes.getColor(rhc0.f163135h0, -14606047);
        this.f35164v = typedArrayObtainStyledAttributes.getColor(rhc0.f163123b0, -7829368);
        this.f35120F0 = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163117X, false);
        this.f35152k0 = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163118Y, false);
        this.f35168z = typedArrayObtainStyledAttributes.getColor(rhc0.f163119Z, -1166541);
        this.f35158p0 = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163113T, false);
        this.f35113A = typedArrayObtainStyledAttributes.getColor(rhc0.f163114U, -1996488705);
        this.f35118E0 = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163112S, false);
        this.f35122G0 = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163116W, false);
        this.f35116D = typedArrayObtainStyledAttributes.getInt(rhc0.f163111R, 0);
        typedArrayObtainStyledAttributes.recycle();
        m54240j();
    }

    /* JADX INFO: renamed from: a */
    public final void m54231a() {
        if (this.f35158p0 || this.f35165w != -1) {
            Rect rect = this.f35150j;
            Rect rect2 = this.f35147g;
            int i = rect2.left;
            int i2 = this.f35132O;
            int i3 = this.f35119F;
            rect.set(i, i2 - i3, rect2.right, i2 + i3);
            Rect rect3 = this.f35151k;
            Rect rect4 = this.f35147g;
            int i4 = rect4.left;
            int i5 = this.f35132O;
            int i6 = this.f35115C;
            rect3.set(i4, i5 - (i6 / 2), rect4.right, i5 + (i6 / 2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m54232b(int i) {
        return (int) (((double) this.f35121G) - (Math.cos(Math.toRadians(i)) * ((double) this.f35121G)));
    }

    /* JADX INFO: renamed from: c */
    public final int m54233c(int i) {
        if (Math.abs(i) <= this.f35119F) {
            return -i;
        }
        int i2 = this.f35135R;
        int i3 = this.f35117E;
        return i2 < 0 ? (-i3) - i : i3 - i;
    }

    /* JADX INFO: renamed from: d */
    public final void m54234d() {
        int i = this.f35116D;
        if (i == 1) {
            this.f35133P = this.f35147g.left;
        } else if (i != 2) {
            this.f35133P = this.f35131N;
        } else {
            this.f35133P = this.f35147g.right;
        }
        this.f35134Q = (int) (this.f35132O - ((this.f35142b.ascent() + this.f35142b.descent()) / 2.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m54235e() {
        int i = this.f35123H;
        int i2 = this.f35117E;
        int i3 = i * i2;
        this.f35127J = this.f35120F0 ? Integer.MIN_VALUE : ((-i2) * (this.f35156o.size() - 1)) + i3;
        if (this.f35120F0) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f35128K = i3;
    }

    /* JADX INFO: renamed from: f */
    public final void m54236f() {
        if (this.f35152k0) {
            int i = this.f35167y / 2;
            int i2 = this.f35132O;
            int i3 = this.f35119F;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f35148h;
            Rect rect2 = this.f35147g;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f35149i;
            Rect rect4 = this.f35147g;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m54237g(int i) {
        return (int) (Math.sin(Math.toRadians(i)) * ((double) this.f35121G));
    }

    public int getCurrentItemPosition() {
        return this.f35125I;
    }

    public int getCurtainColor() {
        return this.f35113A;
    }

    public List getData() {
        return this.f35156o;
    }

    public int getIndicatorColor() {
        return this.f35168z;
    }

    public int getIndicatorSize() {
        return this.f35167y;
    }

    public int getItemAlign() {
        return this.f35116D;
    }

    public int getItemSpace() {
        return this.f35114B;
    }

    public int getItemTextColor() {
        return this.f35164v;
    }

    public int getItemTextSize() {
        return this.f35166x;
    }

    public String getMaximumWidthText() {
        return this.f35157p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f35136S;
    }

    public Object getSelectItem() {
        return this.f35156o.get(this.f35125I);
    }

    public int getSelectedItemPosition() {
        return this.f35123H;
    }

    public int getSelectedItemTextColor() {
        return this.f35165w;
    }

    public Typeface getTypeface() {
        Paint paint = this.f35142b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f35159q;
    }

    /* JADX INFO: renamed from: h */
    public void m54238h() {
        this.f35163u = 0;
        this.f35162t = 0;
        if (jyb.m147479J(this.f35156o)) {
            return;
        }
        if (this.f35140W) {
            this.f35162t = (int) this.f35142b.measureText(String.valueOf(this.f35156o.get(0)));
        } else if (m54241k(this.f35136S)) {
            this.f35162t = (int) this.f35142b.measureText(String.valueOf(this.f35156o.get(this.f35136S)));
        } else if (TextUtils.isEmpty(this.f35157p)) {
            Iterator it = this.f35156o.iterator();
            while (it.hasNext()) {
                this.f35162t = Math.max(this.f35162t, (int) this.f35142b.measureText(String.valueOf(it.next())));
            }
        } else {
            this.f35162t = (int) this.f35142b.measureText(this.f35157p);
        }
        Paint.FontMetrics fontMetrics = this.f35142b.getFontMetrics();
        this.f35163u = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: i */
    public final String m54239i(String str) {
        return ((float) getWidth()) < this.f35142b.measureText(str) ? TextUtils.ellipsize(str, new TextPaint(this.f35142b), getWidth(), TextUtils.TruncateAt.END).toString() : str;
    }

    /* JADX INFO: renamed from: j */
    public final void m54240j() {
        m54245o();
        Paint paint = new Paint(69);
        this.f35142b = paint;
        paint.setTextSize(this.f35166x);
        m54244n();
        m54238h();
        this.f35143c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f35129L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f35130M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f35139V = viewConfiguration.getScaledTouchSlop();
        this.f35147g = new Rect();
        this.f35148h = new Rect();
        this.f35149i = new Rect();
        this.f35150j = new Rect();
        this.f35151k = new Rect();
        this.f35153l = new Camera();
        this.f35154m = new Matrix();
        this.f35155n = new Matrix();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m54241k(int i) {
        return i >= 0 && i < this.f35156o.size();
    }

    /* JADX INFO: renamed from: l */
    public final int m54242l(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* JADX INFO: renamed from: m */
    public void m54243m(int i, boolean z) {
        this.f35145e = false;
        if (!z || !this.f35143c.isFinished()) {
            if (!this.f35143c.isFinished()) {
                this.f35143c.abortAnimation();
            }
            int iMax = Math.max(Math.min(i, this.f35156o.size() - 1), 0);
            this.f35123H = iMax;
            this.f35125I = iMax;
            this.f35135R = 0;
            m54235e();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f35125I;
        if (i2 == 0) {
            return;
        }
        if (this.f35120F0 && Math.abs(i2) > size / 2) {
            if (i2 > 0) {
                size = -size;
            }
            i2 += size;
        }
        Scroller scroller = this.f35143c;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f35117E);
        this.f35141a.post(this);
    }

    /* JADX INFO: renamed from: n */
    public void m54244n() {
        int i = this.f35116D;
        if (i == 1) {
            this.f35142b.setTextAlign(Paint.Align.LEFT);
            return;
        }
        Paint paint = this.f35142b;
        if (i != 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m54245o() {
        int i = this.f35159q;
        if (i < 2) {
            mym.m160801a("Wheel's visible item count can not be less than 2!");
            return;
        }
        if (i % 2 == 0) {
            this.f35159q = i + 1;
        }
        int i2 = this.f35159q + 2;
        this.f35160r = i2;
        this.f35161s = i2 / 2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String strValueOf;
        int iM54237g;
        int i;
        if (this.f35156o.size() == 0) {
            return;
        }
        if (this.f35158p0) {
            this.f35142b.setColor(this.f35113A);
            this.f35142b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f35151k, this.f35142b);
        }
        int i2 = (-this.f35135R) / this.f35117E;
        int i3 = this.f35161s;
        int i4 = i2 - i3;
        int i5 = this.f35123H + i4;
        int i6 = -i3;
        while (i5 < this.f35123H + i4 + this.f35160r) {
            if (this.f35120F0) {
                int size = i5 % this.f35156o.size();
                if (size < 0) {
                    size += this.f35156o.size();
                }
                strValueOf = String.valueOf(this.f35156o.get(size));
            } else {
                strValueOf = m54241k(i5) ? String.valueOf(this.f35156o.get(i5)) : "";
            }
            if (gta.m132210e().m132214d().mo34943w()) {
                this.f35142b.setFakeBoldText(true);
            }
            this.f35142b.setColor(this.f35164v);
            this.f35142b.setStyle(Paint.Style.FILL);
            int i7 = this.f35134Q;
            int i8 = this.f35117E;
            int i9 = (i6 * i8) + i7 + (this.f35135R % i8);
            if (this.f35122G0) {
                int iAbs = i7 - Math.abs(i7 - i9);
                int i10 = this.f35147g.top;
                int i11 = this.f35134Q;
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
                iM54237g = m54237g(i12);
                int i13 = this.f35131N;
                int i14 = this.f35116D;
                if (i14 == 1) {
                    i13 = this.f35147g.left;
                } else if (i14 == 2) {
                    i13 = this.f35147g.right;
                }
                int i15 = this.f35132O - iM54237g;
                this.f35153l.save();
                this.f35153l.rotateX(f3);
                this.f35153l.getMatrix(this.f35154m);
                this.f35153l.restore();
                float f4 = -i13;
                float f5 = -i15;
                this.f35154m.preTranslate(f4, f5);
                float f6 = i13;
                float f7 = i15;
                this.f35154m.postTranslate(f6, f7);
                this.f35153l.save();
                this.f35153l.translate(0.0f, 0.0f, m54232b(i12));
                this.f35153l.getMatrix(this.f35155n);
                this.f35153l.restore();
                this.f35155n.preTranslate(f4, f5);
                this.f35155n.postTranslate(f6, f7);
                this.f35154m.postConcat(this.f35155n);
            } else {
                iM54237g = 0;
            }
            if (this.f35118E0) {
                int i16 = this.f35134Q;
                int iAbs2 = (int) ((((i16 - Math.abs(i16 - i9)) * 1.0f) / this.f35134Q) * 255.0f);
                this.f35142b.setAlpha(iAbs2 < 0 ? 0 : iAbs2);
            }
            if (this.f35122G0) {
                i9 = this.f35134Q - iM54237g;
            }
            if (this.f35165w != -1) {
                canvas.save();
                if (this.f35122G0) {
                    canvas.concat(this.f35154m);
                }
                canvas.clipRect(this.f35150j, Region.Op.DIFFERENCE);
                float f8 = i9;
                canvas.drawText(m54239i(strValueOf), this.f35133P, f8, this.f35142b);
                canvas.restore();
                this.f35142b.setColor(this.f35165w);
                canvas.save();
                if (this.f35122G0) {
                    canvas.concat(this.f35154m);
                }
                canvas.clipRect(this.f35150j);
                canvas.drawText(m54239i(strValueOf), this.f35133P, f8, this.f35142b);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.f35147g);
                if (this.f35122G0) {
                    canvas.concat(this.f35154m);
                }
                canvas.drawText(m54239i(strValueOf), this.f35133P, i9, this.f35142b);
                canvas.restore();
            }
            i5++;
            i6++;
        }
        if (this.f35152k0) {
            this.f35142b.setColor(this.f35168z);
            this.f35142b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f35148h, this.f35142b);
            canvas.drawRect(this.f35149i, this.f35142b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f35162t;
        int i4 = this.f35163u;
        int i5 = this.f35159q;
        int i6 = (i4 * i5) + (this.f35114B * (i5 - 1));
        if (this.f35122G0) {
            i6 = (int) (((double) (i6 * 2)) / 3.141592653589793d);
        }
        setMeasuredDimension(m54242l(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m54242l(mode2, size2, i6 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f35147g.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f35131N = this.f35147g.centerX();
        this.f35132O = this.f35147g.centerY();
        m54234d();
        this.f35121G = this.f35147g.height() / 2;
        int iHeight = this.f35147g.height() / this.f35159q;
        this.f35117E = iHeight;
        this.f35119F = iHeight / 2;
        m54235e();
        m54236f();
        m54231a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f35145e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f35144d;
            if (velocityTracker == null) {
                this.f35144d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f35144d.addMovement(motionEvent);
            if (!this.f35143c.isFinished()) {
                this.f35143c.abortAnimation();
                this.f35126I0 = true;
            }
            int y = (int) motionEvent.getY();
            this.f35137T = y;
            this.f35138U = y;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f35124H0 || this.f35126I0) {
                this.f35144d.addMovement(motionEvent);
                this.f35144d.computeCurrentVelocity(1000, this.f35130M);
                this.f35126I0 = false;
                int yVelocity = (int) this.f35144d.getYVelocity();
                int iAbs = Math.abs(yVelocity);
                int i = this.f35129L;
                Scroller scroller = this.f35143c;
                if (iAbs > i) {
                    scroller.fling(0, this.f35135R, 0, yVelocity, 0, 0, this.f35127J, this.f35128K);
                    Scroller scroller2 = this.f35143c;
                    scroller2.setFinalY(scroller2.getFinalY() + m54233c(this.f35143c.getFinalY() % this.f35117E));
                } else {
                    int i2 = this.f35135R;
                    scroller.startScroll(0, i2, 0, m54233c(i2 % this.f35117E));
                }
                if (!this.f35120F0) {
                    int finalY = this.f35143c.getFinalY();
                    int i3 = this.f35128K;
                    Scroller scroller3 = this.f35143c;
                    if (finalY > i3) {
                        scroller3.setFinalY(i3);
                    } else {
                        int finalY2 = scroller3.getFinalY();
                        int i4 = this.f35127J;
                        if (finalY2 < i4) {
                            this.f35143c.setFinalY(i4);
                        }
                    }
                }
                this.f35141a.post(this);
                VelocityTracker velocityTracker2 = this.f35144d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f35144d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f35144d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f35144d = null;
                }
            }
        } else if (Math.abs(this.f35138U - motionEvent.getY()) < this.f35139V) {
            this.f35124H0 = true;
        } else {
            this.f35124H0 = false;
            this.f35144d.addMovement(motionEvent);
            float y2 = motionEvent.getY() - this.f35137T;
            if (Math.abs(y2) >= 1.0f) {
                this.f35135R = (int) (this.f35135R + y2);
                this.f35137T = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f35156o;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f35143c.isFinished() && !this.f35126I0) {
            int i = this.f35117E;
            if (i == 0) {
                return;
            }
            int size = (((-this.f35135R) / i) + this.f35123H) % this.f35156o.size();
            if (size < 0) {
                size += this.f35156o.size();
            }
            this.f35125I = size;
            InterfaceC8912a interfaceC8912a = this.f35146f;
            if (interfaceC8912a != null && this.f35145e) {
                interfaceC8912a.mo54246a(this, this.f35156o.get(size), size);
            }
        }
        if (this.f35143c.computeScrollOffset()) {
            this.f35135R = this.f35143c.getCurrY();
            postInvalidate();
            this.f35141a.postDelayed(this, 16L);
        }
    }

    public void setAtmospheric(boolean z) {
        this.f35118E0 = z;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f35158p0 = z;
        m54231a();
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f35113A = i;
        invalidate();
    }

    public void setCurtainHeight(int i) {
        this.f35115C = i;
    }

    public void setCurved(boolean z) {
        this.f35122G0 = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f35120F0 = z;
        m54235e();
        invalidate();
    }

    public void setData(List list) {
        if (jyb.m147479J(list)) {
            mnd0.m159157a("WheelPicker's data can not be null!");
            return;
        }
        this.f35156o = list;
        this.f35125I = 0;
        this.f35123H = 0;
        this.f35135R = 0;
        m54238h();
        m54235e();
        requestLayout();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f35152k0 = z;
        m54236f();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f35168z = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f35167y = i;
        m54236f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f35116D = i;
        m54244n();
        m54234d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f35114B = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f35164v = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f35166x = i;
        this.f35142b.setTextSize(i);
        m54238h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str == null) {
            mnd0.m159157a("Maximum width text can not be null!");
            return;
        }
        this.f35157p = str;
        m54238h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m54241k(i)) {
            this.f35136S = i;
            m54238h();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f35156o.size() + "), but current is " + i);
    }

    public void setOnItemSelectedListener(InterfaceC8912a interfaceC8912a) {
        this.f35146f = interfaceC8912a;
    }

    public void setOnWheelChangeListener(InterfaceC8913b interfaceC8913b) {
    }

    public void setSameWidth(boolean z) {
        this.f35140W = z;
        m54238h();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        m54243m(i, false);
    }

    public void setSelectedItemTextColor(int i) {
        this.f35165w = i;
        m54231a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f35142b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m54238h();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f35159q = i;
        m54245o();
        requestLayout();
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WheelPicker(Context context) {
        super(context);
        this.f35141a = new Handler();
        this.f35156o = new ArrayList();
        this.f35159q = 7;
        this.f35166x = 0;
        this.f35167y = 0;
        this.f35129L = 50;
        this.f35130M = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f35139V = 8;
        m54240j();
    }
}
