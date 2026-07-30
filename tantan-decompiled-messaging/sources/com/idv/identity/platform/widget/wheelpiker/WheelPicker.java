package com.idv.identity.platform.widget.wheelpiker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.google.android.gms.common.api.Api;
import com.tencent.ugc.TXRecordCommon;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p149l.c0c0;
import p149l.jfd0;
import p149l.lwm;
import p149l.o2c0;
import p149l.z8c0;

/* JADX INFO: loaded from: classes7.dex */
public class WheelPicker extends View implements Runnable {

    /* JADX INFO: renamed from: A */
    private int f12769A;

    /* JADX INFO: renamed from: B */
    private int f12770B;

    /* JADX INFO: renamed from: C */
    private int f12771C;

    /* JADX INFO: renamed from: D */
    private int f12772D;

    /* JADX INFO: renamed from: E */
    private int f12773E;

    /* JADX INFO: renamed from: F */
    private int f12774F;

    /* JADX INFO: renamed from: G */
    private int f12775G;

    /* JADX INFO: renamed from: H */
    private int f12776H;

    /* JADX INFO: renamed from: I */
    private int f12777I;

    /* JADX INFO: renamed from: J */
    private int f12778J;

    /* JADX INFO: renamed from: K */
    private int f12779K;

    /* JADX INFO: renamed from: L */
    private int f12780L;

    /* JADX INFO: renamed from: M */
    private int f12781M;

    /* JADX INFO: renamed from: N */
    private int f12782N;

    /* JADX INFO: renamed from: O */
    private int f12783O;

    /* JADX INFO: renamed from: P */
    private int f12784P;

    /* JADX INFO: renamed from: Q */
    private int f12785Q;

    /* JADX INFO: renamed from: R */
    private int f12786R;

    /* JADX INFO: renamed from: S */
    private int f12787S;

    /* JADX INFO: renamed from: T */
    private boolean f12788T;

    /* JADX INFO: renamed from: U */
    private boolean f12789U;

    /* JADX INFO: renamed from: V */
    private boolean f12790V;

    /* JADX INFO: renamed from: W */
    private boolean f12791W;

    /* JADX INFO: renamed from: a */
    private final Handler f12792a;

    /* JADX INFO: renamed from: b */
    private final Paint f12793b;

    /* JADX INFO: renamed from: c */
    private final Scroller f12794c;

    /* JADX INFO: renamed from: d */
    private VelocityTracker f12795d;

    /* JADX INFO: renamed from: e */
    private boolean f12796e;

    /* JADX INFO: renamed from: f */
    private InterfaceC3715a f12797f;

    /* JADX INFO: renamed from: g */
    private final Rect f12798g;

    /* JADX INFO: renamed from: h */
    private final Rect f12799h;

    /* JADX INFO: renamed from: i */
    private final Rect f12800i;

    /* JADX INFO: renamed from: j */
    private final Rect f12801j;

    /* JADX INFO: renamed from: k */
    private final Matrix f12802k;

    /* JADX INFO: renamed from: k0 */
    private boolean f12803k0;

    /* JADX INFO: renamed from: l */
    private final Matrix f12804l;

    /* JADX INFO: renamed from: m */
    private List f12805m;

    /* JADX INFO: renamed from: n */
    private String f12806n;

    /* JADX INFO: renamed from: o */
    private int f12807o;

    /* JADX INFO: renamed from: p */
    private int f12808p;

    /* JADX INFO: renamed from: p0 */
    private boolean f12809p0;

    /* JADX INFO: renamed from: q */
    private int f12810q;

    /* JADX INFO: renamed from: r */
    private int f12811r;

    /* JADX INFO: renamed from: s */
    private int f12812s;

    /* JADX INFO: renamed from: t */
    private int f12813t;

    /* JADX INFO: renamed from: u */
    private int f12814u;

    /* JADX INFO: renamed from: v */
    private int f12815v;

    /* JADX INFO: renamed from: w */
    private int f12816w;

    /* JADX INFO: renamed from: x */
    private int f12817x;

    /* JADX INFO: renamed from: y */
    private int f12818y;

    /* JADX INFO: renamed from: z */
    private int f12819z;

    /* JADX INFO: renamed from: com.idv.identity.platform.widget.wheelpiker.WheelPicker$a */
    public interface InterfaceC3715a {
        /* JADX INFO: renamed from: a */
        void mo18139a(WheelPicker wheelPicker, Object obj, int i);
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12792a = new Handler();
        this.f12777I = 50;
        this.f12778J = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f12787S = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z8c0.f202125a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(z8c0.f202128d, 0);
        this.f12805m = Arrays.asList(getResources().getStringArray(resourceId == 0 ? c0c0.f78126a : resourceId));
        this.f12815v = typedArrayObtainStyledAttributes.getDimensionPixelSize(z8c0.f202136l, getResources().getDimensionPixelSize(o2c0.f141521c));
        if (Build.MODEL.equals("MI 5s Plus")) {
            this.f12816w = typedArrayObtainStyledAttributes.getDimensionPixelSize(z8c0.f202136l, getResources().getDimensionPixelSize(o2c0.f141521c));
        } else {
            this.f12816w = typedArrayObtainStyledAttributes.getDimensionPixelSize(z8c0.f202142r, getResources().getDimensionPixelSize(o2c0.f141522d));
        }
        this.f12807o = typedArrayObtainStyledAttributes.getInt(z8c0.f202143s, 7);
        this.f12773E = typedArrayObtainStyledAttributes.getInt(z8c0.f202140p, 0);
        this.f12788T = typedArrayObtainStyledAttributes.getBoolean(z8c0.f202139o, false);
        this.f12784P = typedArrayObtainStyledAttributes.getInt(z8c0.f202138n, -1);
        this.f12806n = typedArrayObtainStyledAttributes.getString(z8c0.f202137m);
        this.f12814u = typedArrayObtainStyledAttributes.getColor(z8c0.f202141q, -1);
        this.f12813t = typedArrayObtainStyledAttributes.getColor(z8c0.f202135k, -7829368);
        this.f12819z = typedArrayObtainStyledAttributes.getDimensionPixelSize(z8c0.f202134j, getResources().getDimensionPixelSize(o2c0.f141520b));
        this.f12790V = typedArrayObtainStyledAttributes.getBoolean(z8c0.f202127c, false);
        this.f12789U = typedArrayObtainStyledAttributes.getBoolean(z8c0.f202130f, false);
        this.f12818y = typedArrayObtainStyledAttributes.getColor(z8c0.f202131g, -1166541);
        this.f12817x = typedArrayObtainStyledAttributes.getDimensionPixelSize(z8c0.f202132h, getResources().getDimensionPixelSize(o2c0.f141519a));
        this.f12791W = typedArrayObtainStyledAttributes.getBoolean(z8c0.f202126b, false);
        this.f12769A = typedArrayObtainStyledAttributes.getInt(z8c0.f202133i, 0);
        String string = typedArrayObtainStyledAttributes.getString(z8c0.f202129e);
        typedArrayObtainStyledAttributes.recycle();
        m18158l();
        Paint paint = new Paint(69);
        this.f12793b = paint;
        paint.setTextSize(this.f12815v);
        if (string != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), string));
        }
        m18157k();
        m18154g();
        this.f12794c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f12777I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12778J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f12787S = viewConfiguration.getScaledTouchSlop();
        this.f12798g = new Rect();
        this.f12799h = new Rect();
        this.f12800i = new Rect();
        this.f12801j = new Rect();
        this.f12802k = new Matrix();
        this.f12804l = new Matrix();
    }

    /* JADX INFO: renamed from: a */
    private void m18148a() {
        if (this.f12814u == -1) {
            return;
        }
        Rect rect = this.f12801j;
        Rect rect2 = this.f12798g;
        int i = rect2.left;
        int i2 = this.f12780L;
        int i3 = this.f12771C;
        rect.set(i, i2 - i3, rect2.right, i2 + i3);
    }

    /* JADX INFO: renamed from: b */
    private int m18149b(int i) {
        if (Math.abs(i) <= this.f12771C) {
            return -i;
        }
        int i2 = this.f12783O;
        int i3 = this.f12770B;
        return i2 < 0 ? (-i3) - i : i3 - i;
    }

    /* JADX INFO: renamed from: c */
    private void m18150c() {
        int i = this.f12769A;
        if (i == 1) {
            this.f12781M = this.f12798g.left;
        } else if (i != 2) {
            this.f12781M = this.f12779K;
        } else {
            this.f12781M = this.f12798g.right;
        }
        this.f12782N = (int) (this.f12780L - ((this.f12793b.ascent() + this.f12793b.descent()) / 2.0f));
    }

    /* JADX INFO: renamed from: d */
    private void m18151d() {
        int i = this.f12773E;
        int i2 = this.f12770B;
        int i3 = i * i2;
        this.f12775G = this.f12790V ? Integer.MIN_VALUE : ((-i2) * (this.f12805m.size() - 1)) + i3;
        if (this.f12790V) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f12776H = i3;
    }

    /* JADX INFO: renamed from: e */
    private void m18152e() {
        if (this.f12789U) {
            int i = this.f12817x / 2;
            int i2 = this.f12780L;
            int i3 = this.f12771C;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f12799h;
            Rect rect2 = this.f12798g;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f12800i;
            Rect rect4 = this.f12798g;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* JADX INFO: renamed from: f */
    private int m18153f(int i) {
        return (int) (Math.sin(Math.toRadians(i)) * ((double) this.f12772D));
    }

    /* JADX INFO: renamed from: g */
    private void m18154g() {
        this.f12812s = 0;
        this.f12811r = 0;
        if (this.f12788T) {
            this.f12811r = (int) this.f12793b.measureText(String.valueOf(this.f12805m.get(0)));
        } else if (m18155h(this.f12784P)) {
            this.f12811r = (int) this.f12793b.measureText(String.valueOf(this.f12805m.get(this.f12784P)));
        } else if (TextUtils.isEmpty(this.f12806n)) {
            Iterator it = this.f12805m.iterator();
            while (it.hasNext()) {
                this.f12811r = Math.max(this.f12811r, (int) this.f12793b.measureText(String.valueOf(it.next())));
            }
        } else {
            this.f12811r = (int) this.f12793b.measureText(this.f12806n);
        }
        Paint.FontMetrics fontMetrics = this.f12793b.getFontMetrics();
        this.f12812s = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: h */
    private boolean m18155h(int i) {
        return i >= 0 && i < this.f12805m.size();
    }

    /* JADX INFO: renamed from: i */
    private int m18156i(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* JADX INFO: renamed from: k */
    private void m18157k() {
        int i = this.f12769A;
        if (i == 1) {
            this.f12793b.setTextAlign(Paint.Align.LEFT);
            return;
        }
        Paint paint = this.f12793b;
        if (i != 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m18158l() {
        int i = this.f12807o;
        if (i < 2) {
            lwm.m151979a("Wheel's visible item count can not be less than 2!");
            return;
        }
        if (i % 2 == 0) {
            this.f12807o = i + 1;
        }
        int i2 = this.f12807o + 2;
        this.f12808p = i2;
        this.f12810q = i2 / 2;
    }

    public int getCurrentItemPosition() {
        return this.f12774F;
    }

    public List getData() {
        return this.f12805m;
    }

    public int getIndicatorSize() {
        return this.f12817x;
    }

    public int getItemSpace() {
        return this.f12819z;
    }

    public int getItemTextColor() {
        return this.f12813t;
    }

    public int getItemTextSize() {
        return this.f12815v;
    }

    public int getSelectedItemTextColor() {
        return this.f12814u;
    }

    public Typeface getTypeface() {
        Paint paint = this.f12793b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f12807o;
    }

    /* JADX INFO: renamed from: j */
    public void m18159j(int i, boolean z) {
        this.f12796e = false;
        if (!z || !this.f12794c.isFinished()) {
            if (!this.f12794c.isFinished()) {
                this.f12794c.abortAnimation();
            }
            int iMax = Math.max(Math.min(i, this.f12805m.size() - 1), 0);
            this.f12773E = iMax;
            this.f12774F = iMax;
            this.f12783O = 0;
            m18151d();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f12774F;
        if (i2 == 0) {
            return;
        }
        if (this.f12790V && Math.abs(i2) > size / 2) {
            if (i2 > 0) {
                size = -size;
            }
            i2 += size;
        }
        Scroller scroller = this.f12794c;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f12770B);
        this.f12792a.post(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String strValueOf;
        if (this.f12805m.size() == 0) {
            return;
        }
        int i = (-this.f12783O) / this.f12770B;
        int i2 = this.f12810q;
        int i3 = i - i2;
        int i4 = this.f12773E + i3;
        int i5 = -i2;
        while (i4 < this.f12773E + i3 + this.f12808p) {
            if (this.f12790V) {
                int size = i4 % this.f12805m.size();
                if (size < 0) {
                    size += this.f12805m.size();
                }
                strValueOf = String.valueOf(this.f12805m.get(size));
            } else {
                strValueOf = m18155h(i4) ? String.valueOf(this.f12805m.get(i4)) : "";
            }
            this.f12793b.setColor(this.f12813t);
            this.f12793b.setTextSize(this.f12815v);
            this.f12793b.setStyle(Paint.Style.FILL);
            int i6 = this.f12782N;
            int i7 = this.f12770B;
            int i8 = (i5 * i7) + i6 + (this.f12783O % i7);
            int iM18153f = 0;
            if (this.f12791W) {
                int iAbs = i6 - Math.abs(i6 - i8);
                int i9 = this.f12798g.top;
                int i10 = this.f12782N;
                float f = ((iAbs - i9) * 1.0f) / (i10 - i9);
                if (i8 > i10) {
                    iM18153f = 1;
                } else if (i8 < i10) {
                    iM18153f = -1;
                }
                float f2 = (-(1.0f - f)) * 90.0f * iM18153f;
                if (f2 < -90.0f) {
                    f2 = -90.0f;
                }
                iM18153f = m18153f((int) (f2 <= 90.0f ? f2 : 90.0f));
                int i11 = this.f12779K;
                int i12 = this.f12769A;
                if (i12 == 1) {
                    i11 = this.f12798g.left;
                } else if (i12 == 2) {
                    i11 = this.f12798g.right;
                }
                int i13 = this.f12780L - iM18153f;
                float f3 = -i11;
                float f4 = -i13;
                this.f12802k.preTranslate(f3, f4);
                float f5 = i11;
                float f6 = i13;
                this.f12802k.postTranslate(f5, f6);
                this.f12804l.preTranslate(f3, f4);
                this.f12804l.postTranslate(f5, f6);
                this.f12802k.postConcat(this.f12804l);
            }
            if (this.f12791W) {
                i8 = this.f12782N - iM18153f;
            }
            if (this.f12814u != -1) {
                canvas.save();
                if (this.f12791W) {
                    canvas.concat(this.f12802k);
                }
                canvas.clipRect(this.f12801j, Region.Op.DIFFERENCE);
                float f7 = i8;
                canvas.drawText(strValueOf, this.f12781M, f7, this.f12793b);
                canvas.restore();
                this.f12793b.setColor(this.f12814u);
                this.f12793b.setTextSize(this.f12816w);
                canvas.save();
                if (this.f12791W) {
                    canvas.concat(this.f12802k);
                }
                canvas.clipRect(this.f12801j);
                canvas.drawText(strValueOf, this.f12781M, f7, this.f12793b);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.f12798g);
                if (this.f12791W) {
                    canvas.concat(this.f12802k);
                }
                canvas.drawText(strValueOf, this.f12781M, i8, this.f12793b);
                canvas.restore();
            }
            i4++;
            i5++;
        }
        if (this.f12789U) {
            this.f12793b.setColor(this.f12818y);
            this.f12793b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f12799h, this.f12793b);
            canvas.drawRect(this.f12800i, this.f12793b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f12811r;
        int i4 = this.f12812s;
        int i5 = this.f12807o;
        int i6 = (i4 * i5) + (this.f12819z * (i5 - 1));
        if (this.f12791W) {
            i6 = (int) (((double) (i6 * 2)) / 3.141592653589793d);
        }
        setMeasuredDimension(m18156i(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m18156i(mode2, size2, i6 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f12798g.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f12779K = this.f12798g.centerX();
        this.f12780L = this.f12798g.centerY();
        m18150c();
        this.f12772D = this.f12798g.height() / 2;
        int iHeight = this.f12798g.height() / this.f12807o;
        this.f12770B = iHeight;
        this.f12771C = iHeight / 2;
        m18151d();
        m18152e();
        m18148a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f12796e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f12795d;
            if (velocityTracker == null) {
                this.f12795d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f12795d.addMovement(motionEvent);
            if (!this.f12794c.isFinished()) {
                this.f12794c.abortAnimation();
                this.f12809p0 = true;
            }
            int y = (int) motionEvent.getY();
            this.f12785Q = y;
            this.f12786R = y;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f12803k0 || this.f12809p0) {
                this.f12795d.addMovement(motionEvent);
                this.f12795d.computeCurrentVelocity(1000, this.f12778J);
                this.f12809p0 = false;
                int yVelocity = (int) this.f12795d.getYVelocity();
                int iAbs = Math.abs(yVelocity);
                int i = this.f12777I;
                Scroller scroller = this.f12794c;
                if (iAbs > i) {
                    scroller.fling(0, this.f12783O, 0, yVelocity, 0, 0, this.f12775G, this.f12776H);
                    Scroller scroller2 = this.f12794c;
                    scroller2.setFinalY(scroller2.getFinalY() + m18149b(this.f12794c.getFinalY() % this.f12770B));
                } else {
                    int i2 = this.f12783O;
                    scroller.startScroll(0, i2, 0, m18149b(i2 % this.f12770B));
                }
                if (!this.f12790V) {
                    int finalY = this.f12794c.getFinalY();
                    int i3 = this.f12776H;
                    Scroller scroller3 = this.f12794c;
                    if (finalY > i3) {
                        scroller3.setFinalY(i3);
                    } else {
                        int finalY2 = scroller3.getFinalY();
                        int i4 = this.f12775G;
                        if (finalY2 < i4) {
                            this.f12794c.setFinalY(i4);
                        }
                    }
                }
                this.f12792a.post(this);
                VelocityTracker velocityTracker2 = this.f12795d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f12795d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f12795d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f12795d = null;
                }
            }
        } else if (Math.abs(this.f12786R - motionEvent.getY()) < this.f12787S) {
            this.f12803k0 = true;
        } else {
            this.f12803k0 = false;
            this.f12795d.addMovement(motionEvent);
            float y2 = motionEvent.getY() - this.f12785Q;
            if (Math.abs(y2) >= 1.0f) {
                this.f12783O = (int) (this.f12783O + y2);
                this.f12785Q = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f12805m;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f12794c.isFinished() && !this.f12809p0) {
            int i = this.f12770B;
            if (i == 0) {
                return;
            }
            int size = (((-this.f12783O) / i) + this.f12773E) % this.f12805m.size();
            if (size < 0) {
                size += this.f12805m.size();
            }
            this.f12774F = size;
            InterfaceC3715a interfaceC3715a = this.f12797f;
            if (interfaceC3715a != null && this.f12796e) {
                interfaceC3715a.mo18139a(this, this.f12805m.get(size), size);
            }
        }
        if (this.f12794c.computeScrollOffset()) {
            this.f12783O = this.f12794c.getCurrY();
            postInvalidate();
            this.f12792a.postDelayed(this, 16L);
        }
    }

    public void setCurved(boolean z) {
        this.f12791W = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f12790V = z;
        m18151d();
        invalidate();
    }

    public void setData(List list) {
        if (list == null) {
            jfd0.m141176a("WheelPicker's data can not be null!");
            return;
        }
        this.f12805m = list;
        if (this.f12773E > list.size() - 1 || this.f12774F > list.size() - 1) {
            int size = list.size() - 1;
            this.f12774F = size;
            this.f12773E = size;
        } else {
            this.f12773E = this.f12774F;
        }
        this.f12783O = 0;
        m18154g();
        m18151d();
        requestLayout();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f12789U = z;
        m18152e();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f12818y = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f12817x = i;
        m18152e();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f12769A = i;
        m18157k();
        m18150c();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f12819z = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f12813t = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f12815v = i;
        this.f12793b.setTextSize(i);
        m18154g();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str == null) {
            jfd0.m141176a("Maximum width text can not be null!");
            return;
        }
        this.f12806n = str;
        m18154g();
        requestLayout();
        invalidate();
    }

    public void setOnItemSelectedListener(InterfaceC3715a interfaceC3715a) {
        this.f12797f = interfaceC3715a;
    }

    public void setSameWidth(boolean z) {
        this.f12788T = z;
        m18154g();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        m18159j(i, false);
    }

    public void setSelectedItemTextColor(int i) {
        this.f12814u = i;
        m18148a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f12793b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m18154g();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f12807o = i;
        m18158l();
        requestLayout();
    }

    public WheelPicker(Context context) {
        this(context, null);
    }
}
