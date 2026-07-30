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
import p153l.aac0;
import p153l.ghc0;
import p153l.h8c0;
import p153l.mnd0;
import p153l.mym;

/* JADX INFO: loaded from: classes7.dex */
public class WheelPicker extends View implements Runnable {

    /* JADX INFO: renamed from: A */
    private int f13510A;

    /* JADX INFO: renamed from: B */
    private int f13511B;

    /* JADX INFO: renamed from: C */
    private int f13512C;

    /* JADX INFO: renamed from: D */
    private int f13513D;

    /* JADX INFO: renamed from: E */
    private int f13514E;

    /* JADX INFO: renamed from: F */
    private int f13515F;

    /* JADX INFO: renamed from: G */
    private int f13516G;

    /* JADX INFO: renamed from: H */
    private int f13517H;

    /* JADX INFO: renamed from: I */
    private int f13518I;

    /* JADX INFO: renamed from: J */
    private int f13519J;

    /* JADX INFO: renamed from: K */
    private int f13520K;

    /* JADX INFO: renamed from: L */
    private int f13521L;

    /* JADX INFO: renamed from: M */
    private int f13522M;

    /* JADX INFO: renamed from: N */
    private int f13523N;

    /* JADX INFO: renamed from: O */
    private int f13524O;

    /* JADX INFO: renamed from: P */
    private int f13525P;

    /* JADX INFO: renamed from: Q */
    private int f13526Q;

    /* JADX INFO: renamed from: R */
    private int f13527R;

    /* JADX INFO: renamed from: S */
    private int f13528S;

    /* JADX INFO: renamed from: T */
    private boolean f13529T;

    /* JADX INFO: renamed from: U */
    private boolean f13530U;

    /* JADX INFO: renamed from: V */
    private boolean f13531V;

    /* JADX INFO: renamed from: W */
    private boolean f13532W;

    /* JADX INFO: renamed from: a */
    private final Handler f13533a;

    /* JADX INFO: renamed from: b */
    private final Paint f13534b;

    /* JADX INFO: renamed from: c */
    private final Scroller f13535c;

    /* JADX INFO: renamed from: d */
    private VelocityTracker f13536d;

    /* JADX INFO: renamed from: e */
    private boolean f13537e;

    /* JADX INFO: renamed from: f */
    private InterfaceC3874a f13538f;

    /* JADX INFO: renamed from: g */
    private final Rect f13539g;

    /* JADX INFO: renamed from: h */
    private final Rect f13540h;

    /* JADX INFO: renamed from: i */
    private final Rect f13541i;

    /* JADX INFO: renamed from: j */
    private final Rect f13542j;

    /* JADX INFO: renamed from: k */
    private final Matrix f13543k;

    /* JADX INFO: renamed from: k0 */
    private boolean f13544k0;

    /* JADX INFO: renamed from: l */
    private final Matrix f13545l;

    /* JADX INFO: renamed from: m */
    private List f13546m;

    /* JADX INFO: renamed from: n */
    private String f13547n;

    /* JADX INFO: renamed from: o */
    private int f13548o;

    /* JADX INFO: renamed from: p */
    private int f13549p;

    /* JADX INFO: renamed from: p0 */
    private boolean f13550p0;

    /* JADX INFO: renamed from: q */
    private int f13551q;

    /* JADX INFO: renamed from: r */
    private int f13552r;

    /* JADX INFO: renamed from: s */
    private int f13553s;

    /* JADX INFO: renamed from: t */
    private int f13554t;

    /* JADX INFO: renamed from: u */
    private int f13555u;

    /* JADX INFO: renamed from: v */
    private int f13556v;

    /* JADX INFO: renamed from: w */
    private int f13557w;

    /* JADX INFO: renamed from: x */
    private int f13558x;

    /* JADX INFO: renamed from: y */
    private int f13559y;

    /* JADX INFO: renamed from: z */
    private int f13560z;

    /* JADX INFO: renamed from: com.idv.identity.platform.widget.wheelpiker.WheelPicker$a */
    public interface InterfaceC3874a {
        /* JADX INFO: renamed from: a */
        void mo19216a(WheelPicker wheelPicker, Object obj, int i);
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13533a = new Handler();
        this.f13518I = 50;
        this.f13519J = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f13528S = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ghc0.f104092a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ghc0.f104095d, 0);
        this.f13546m = Arrays.asList(getResources().getStringArray(resourceId == 0 ? h8c0.f108232a : resourceId));
        this.f13556v = typedArrayObtainStyledAttributes.getDimensionPixelSize(ghc0.f104103l, getResources().getDimensionPixelSize(aac0.f69120c));
        if (Build.MODEL.equals("MI 5s Plus")) {
            this.f13557w = typedArrayObtainStyledAttributes.getDimensionPixelSize(ghc0.f104103l, getResources().getDimensionPixelSize(aac0.f69120c));
        } else {
            this.f13557w = typedArrayObtainStyledAttributes.getDimensionPixelSize(ghc0.f104109r, getResources().getDimensionPixelSize(aac0.f69121d));
        }
        this.f13548o = typedArrayObtainStyledAttributes.getInt(ghc0.f104110s, 7);
        this.f13514E = typedArrayObtainStyledAttributes.getInt(ghc0.f104107p, 0);
        this.f13529T = typedArrayObtainStyledAttributes.getBoolean(ghc0.f104106o, false);
        this.f13525P = typedArrayObtainStyledAttributes.getInt(ghc0.f104105n, -1);
        this.f13547n = typedArrayObtainStyledAttributes.getString(ghc0.f104104m);
        this.f13555u = typedArrayObtainStyledAttributes.getColor(ghc0.f104108q, -1);
        this.f13554t = typedArrayObtainStyledAttributes.getColor(ghc0.f104102k, -7829368);
        this.f13560z = typedArrayObtainStyledAttributes.getDimensionPixelSize(ghc0.f104101j, getResources().getDimensionPixelSize(aac0.f69119b));
        this.f13531V = typedArrayObtainStyledAttributes.getBoolean(ghc0.f104094c, false);
        this.f13530U = typedArrayObtainStyledAttributes.getBoolean(ghc0.f104097f, false);
        this.f13559y = typedArrayObtainStyledAttributes.getColor(ghc0.f104098g, -1166541);
        this.f13558x = typedArrayObtainStyledAttributes.getDimensionPixelSize(ghc0.f104099h, getResources().getDimensionPixelSize(aac0.f69118a));
        this.f13532W = typedArrayObtainStyledAttributes.getBoolean(ghc0.f104093b, false);
        this.f13510A = typedArrayObtainStyledAttributes.getInt(ghc0.f104100i, 0);
        String string = typedArrayObtainStyledAttributes.getString(ghc0.f104096e);
        typedArrayObtainStyledAttributes.recycle();
        m19235l();
        Paint paint = new Paint(69);
        this.f13534b = paint;
        paint.setTextSize(this.f13556v);
        if (string != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), string));
        }
        m19234k();
        m19231g();
        this.f13535c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f13518I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f13519J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f13528S = viewConfiguration.getScaledTouchSlop();
        this.f13539g = new Rect();
        this.f13540h = new Rect();
        this.f13541i = new Rect();
        this.f13542j = new Rect();
        this.f13543k = new Matrix();
        this.f13545l = new Matrix();
    }

    /* JADX INFO: renamed from: a */
    private void m19225a() {
        if (this.f13555u == -1) {
            return;
        }
        Rect rect = this.f13542j;
        Rect rect2 = this.f13539g;
        int i = rect2.left;
        int i2 = this.f13521L;
        int i3 = this.f13512C;
        rect.set(i, i2 - i3, rect2.right, i2 + i3);
    }

    /* JADX INFO: renamed from: b */
    private int m19226b(int i) {
        if (Math.abs(i) <= this.f13512C) {
            return -i;
        }
        int i2 = this.f13524O;
        int i3 = this.f13511B;
        return i2 < 0 ? (-i3) - i : i3 - i;
    }

    /* JADX INFO: renamed from: c */
    private void m19227c() {
        int i = this.f13510A;
        if (i == 1) {
            this.f13522M = this.f13539g.left;
        } else if (i != 2) {
            this.f13522M = this.f13520K;
        } else {
            this.f13522M = this.f13539g.right;
        }
        this.f13523N = (int) (this.f13521L - ((this.f13534b.ascent() + this.f13534b.descent()) / 2.0f));
    }

    /* JADX INFO: renamed from: d */
    private void m19228d() {
        int i = this.f13514E;
        int i2 = this.f13511B;
        int i3 = i * i2;
        this.f13516G = this.f13531V ? Integer.MIN_VALUE : ((-i2) * (this.f13546m.size() - 1)) + i3;
        if (this.f13531V) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f13517H = i3;
    }

    /* JADX INFO: renamed from: e */
    private void m19229e() {
        if (this.f13530U) {
            int i = this.f13558x / 2;
            int i2 = this.f13521L;
            int i3 = this.f13512C;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f13540h;
            Rect rect2 = this.f13539g;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f13541i;
            Rect rect4 = this.f13539g;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* JADX INFO: renamed from: f */
    private int m19230f(int i) {
        return (int) (Math.sin(Math.toRadians(i)) * ((double) this.f13513D));
    }

    /* JADX INFO: renamed from: g */
    private void m19231g() {
        this.f13553s = 0;
        this.f13552r = 0;
        if (this.f13529T) {
            this.f13552r = (int) this.f13534b.measureText(String.valueOf(this.f13546m.get(0)));
        } else if (m19232h(this.f13525P)) {
            this.f13552r = (int) this.f13534b.measureText(String.valueOf(this.f13546m.get(this.f13525P)));
        } else if (TextUtils.isEmpty(this.f13547n)) {
            Iterator it = this.f13546m.iterator();
            while (it.hasNext()) {
                this.f13552r = Math.max(this.f13552r, (int) this.f13534b.measureText(String.valueOf(it.next())));
            }
        } else {
            this.f13552r = (int) this.f13534b.measureText(this.f13547n);
        }
        Paint.FontMetrics fontMetrics = this.f13534b.getFontMetrics();
        this.f13553s = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: h */
    private boolean m19232h(int i) {
        return i >= 0 && i < this.f13546m.size();
    }

    /* JADX INFO: renamed from: i */
    private int m19233i(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* JADX INFO: renamed from: k */
    private void m19234k() {
        int i = this.f13510A;
        if (i == 1) {
            this.f13534b.setTextAlign(Paint.Align.LEFT);
            return;
        }
        Paint paint = this.f13534b;
        if (i != 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m19235l() {
        int i = this.f13548o;
        if (i < 2) {
            mym.m160801a("Wheel's visible item count can not be less than 2!");
            return;
        }
        if (i % 2 == 0) {
            this.f13548o = i + 1;
        }
        int i2 = this.f13548o + 2;
        this.f13549p = i2;
        this.f13551q = i2 / 2;
    }

    public int getCurrentItemPosition() {
        return this.f13515F;
    }

    public List getData() {
        return this.f13546m;
    }

    public int getIndicatorSize() {
        return this.f13558x;
    }

    public int getItemSpace() {
        return this.f13560z;
    }

    public int getItemTextColor() {
        return this.f13554t;
    }

    public int getItemTextSize() {
        return this.f13556v;
    }

    public int getSelectedItemTextColor() {
        return this.f13555u;
    }

    public Typeface getTypeface() {
        Paint paint = this.f13534b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f13548o;
    }

    /* JADX INFO: renamed from: j */
    public void m19236j(int i, boolean z) {
        this.f13537e = false;
        if (!z || !this.f13535c.isFinished()) {
            if (!this.f13535c.isFinished()) {
                this.f13535c.abortAnimation();
            }
            int iMax = Math.max(Math.min(i, this.f13546m.size() - 1), 0);
            this.f13514E = iMax;
            this.f13515F = iMax;
            this.f13524O = 0;
            m19228d();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f13515F;
        if (i2 == 0) {
            return;
        }
        if (this.f13531V && Math.abs(i2) > size / 2) {
            if (i2 > 0) {
                size = -size;
            }
            i2 += size;
        }
        Scroller scroller = this.f13535c;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f13511B);
        this.f13533a.post(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String strValueOf;
        if (this.f13546m.size() == 0) {
            return;
        }
        int i = (-this.f13524O) / this.f13511B;
        int i2 = this.f13551q;
        int i3 = i - i2;
        int i4 = this.f13514E + i3;
        int i5 = -i2;
        while (i4 < this.f13514E + i3 + this.f13549p) {
            if (this.f13531V) {
                int size = i4 % this.f13546m.size();
                if (size < 0) {
                    size += this.f13546m.size();
                }
                strValueOf = String.valueOf(this.f13546m.get(size));
            } else {
                strValueOf = m19232h(i4) ? String.valueOf(this.f13546m.get(i4)) : "";
            }
            this.f13534b.setColor(this.f13554t);
            this.f13534b.setTextSize(this.f13556v);
            this.f13534b.setStyle(Paint.Style.FILL);
            int i6 = this.f13523N;
            int i7 = this.f13511B;
            int i8 = (i5 * i7) + i6 + (this.f13524O % i7);
            int iM19230f = 0;
            if (this.f13532W) {
                int iAbs = i6 - Math.abs(i6 - i8);
                int i9 = this.f13539g.top;
                int i10 = this.f13523N;
                float f = ((iAbs - i9) * 1.0f) / (i10 - i9);
                if (i8 > i10) {
                    iM19230f = 1;
                } else if (i8 < i10) {
                    iM19230f = -1;
                }
                float f2 = (-(1.0f - f)) * 90.0f * iM19230f;
                if (f2 < -90.0f) {
                    f2 = -90.0f;
                }
                iM19230f = m19230f((int) (f2 <= 90.0f ? f2 : 90.0f));
                int i11 = this.f13520K;
                int i12 = this.f13510A;
                if (i12 == 1) {
                    i11 = this.f13539g.left;
                } else if (i12 == 2) {
                    i11 = this.f13539g.right;
                }
                int i13 = this.f13521L - iM19230f;
                float f3 = -i11;
                float f4 = -i13;
                this.f13543k.preTranslate(f3, f4);
                float f5 = i11;
                float f6 = i13;
                this.f13543k.postTranslate(f5, f6);
                this.f13545l.preTranslate(f3, f4);
                this.f13545l.postTranslate(f5, f6);
                this.f13543k.postConcat(this.f13545l);
            }
            if (this.f13532W) {
                i8 = this.f13523N - iM19230f;
            }
            if (this.f13555u != -1) {
                canvas.save();
                if (this.f13532W) {
                    canvas.concat(this.f13543k);
                }
                canvas.clipRect(this.f13542j, Region.Op.DIFFERENCE);
                float f7 = i8;
                canvas.drawText(strValueOf, this.f13522M, f7, this.f13534b);
                canvas.restore();
                this.f13534b.setColor(this.f13555u);
                this.f13534b.setTextSize(this.f13557w);
                canvas.save();
                if (this.f13532W) {
                    canvas.concat(this.f13543k);
                }
                canvas.clipRect(this.f13542j);
                canvas.drawText(strValueOf, this.f13522M, f7, this.f13534b);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.f13539g);
                if (this.f13532W) {
                    canvas.concat(this.f13543k);
                }
                canvas.drawText(strValueOf, this.f13522M, i8, this.f13534b);
                canvas.restore();
            }
            i4++;
            i5++;
        }
        if (this.f13530U) {
            this.f13534b.setColor(this.f13559y);
            this.f13534b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f13540h, this.f13534b);
            canvas.drawRect(this.f13541i, this.f13534b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f13552r;
        int i4 = this.f13553s;
        int i5 = this.f13548o;
        int i6 = (i4 * i5) + (this.f13560z * (i5 - 1));
        if (this.f13532W) {
            i6 = (int) (((double) (i6 * 2)) / 3.141592653589793d);
        }
        setMeasuredDimension(m19233i(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m19233i(mode2, size2, i6 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f13539g.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f13520K = this.f13539g.centerX();
        this.f13521L = this.f13539g.centerY();
        m19227c();
        this.f13513D = this.f13539g.height() / 2;
        int iHeight = this.f13539g.height() / this.f13548o;
        this.f13511B = iHeight;
        this.f13512C = iHeight / 2;
        m19228d();
        m19229e();
        m19225a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13537e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f13536d;
            if (velocityTracker == null) {
                this.f13536d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f13536d.addMovement(motionEvent);
            if (!this.f13535c.isFinished()) {
                this.f13535c.abortAnimation();
                this.f13550p0 = true;
            }
            int y = (int) motionEvent.getY();
            this.f13526Q = y;
            this.f13527R = y;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f13544k0 || this.f13550p0) {
                this.f13536d.addMovement(motionEvent);
                this.f13536d.computeCurrentVelocity(1000, this.f13519J);
                this.f13550p0 = false;
                int yVelocity = (int) this.f13536d.getYVelocity();
                int iAbs = Math.abs(yVelocity);
                int i = this.f13518I;
                Scroller scroller = this.f13535c;
                if (iAbs > i) {
                    scroller.fling(0, this.f13524O, 0, yVelocity, 0, 0, this.f13516G, this.f13517H);
                    Scroller scroller2 = this.f13535c;
                    scroller2.setFinalY(scroller2.getFinalY() + m19226b(this.f13535c.getFinalY() % this.f13511B));
                } else {
                    int i2 = this.f13524O;
                    scroller.startScroll(0, i2, 0, m19226b(i2 % this.f13511B));
                }
                if (!this.f13531V) {
                    int finalY = this.f13535c.getFinalY();
                    int i3 = this.f13517H;
                    Scroller scroller3 = this.f13535c;
                    if (finalY > i3) {
                        scroller3.setFinalY(i3);
                    } else {
                        int finalY2 = scroller3.getFinalY();
                        int i4 = this.f13516G;
                        if (finalY2 < i4) {
                            this.f13535c.setFinalY(i4);
                        }
                    }
                }
                this.f13533a.post(this);
                VelocityTracker velocityTracker2 = this.f13536d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f13536d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f13536d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f13536d = null;
                }
            }
        } else if (Math.abs(this.f13527R - motionEvent.getY()) < this.f13528S) {
            this.f13544k0 = true;
        } else {
            this.f13544k0 = false;
            this.f13536d.addMovement(motionEvent);
            float y2 = motionEvent.getY() - this.f13526Q;
            if (Math.abs(y2) >= 1.0f) {
                this.f13524O = (int) (this.f13524O + y2);
                this.f13526Q = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f13546m;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f13535c.isFinished() && !this.f13550p0) {
            int i = this.f13511B;
            if (i == 0) {
                return;
            }
            int size = (((-this.f13524O) / i) + this.f13514E) % this.f13546m.size();
            if (size < 0) {
                size += this.f13546m.size();
            }
            this.f13515F = size;
            InterfaceC3874a interfaceC3874a = this.f13538f;
            if (interfaceC3874a != null && this.f13537e) {
                interfaceC3874a.mo19216a(this, this.f13546m.get(size), size);
            }
        }
        if (this.f13535c.computeScrollOffset()) {
            this.f13524O = this.f13535c.getCurrY();
            postInvalidate();
            this.f13533a.postDelayed(this, 16L);
        }
    }

    public void setCurved(boolean z) {
        this.f13532W = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f13531V = z;
        m19228d();
        invalidate();
    }

    public void setData(List list) {
        if (list == null) {
            mnd0.m159157a("WheelPicker's data can not be null!");
            return;
        }
        this.f13546m = list;
        if (this.f13514E > list.size() - 1 || this.f13515F > list.size() - 1) {
            int size = list.size() - 1;
            this.f13515F = size;
            this.f13514E = size;
        } else {
            this.f13514E = this.f13515F;
        }
        this.f13524O = 0;
        m19231g();
        m19228d();
        requestLayout();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f13530U = z;
        m19229e();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f13559y = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f13558x = i;
        m19229e();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f13510A = i;
        m19234k();
        m19227c();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f13560z = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f13554t = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f13556v = i;
        this.f13534b.setTextSize(i);
        m19231g();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str == null) {
            mnd0.m159157a("Maximum width text can not be null!");
            return;
        }
        this.f13547n = str;
        m19231g();
        requestLayout();
        invalidate();
    }

    public void setOnItemSelectedListener(InterfaceC3874a interfaceC3874a) {
        this.f13538f = interfaceC3874a;
    }

    public void setSameWidth(boolean z) {
        this.f13529T = z;
        m19231g();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        m19236j(i, false);
    }

    public void setSelectedItemTextColor(int i) {
        this.f13555u = i;
        m19225a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f13534b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m19231g();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f13548o = i;
        m19235l();
        requestLayout();
    }

    public WheelPicker(Context context) {
        this(context, null);
    }
}
