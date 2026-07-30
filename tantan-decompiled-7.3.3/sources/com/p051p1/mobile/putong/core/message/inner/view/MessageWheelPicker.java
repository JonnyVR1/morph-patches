package com.p051p1.mobile.putong.core.message.inner.view;

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
import p153l.eac0;
import p153l.jyb;
import p153l.mnd0;
import p153l.mym;
import p153l.ohc0;

/* JADX INFO: loaded from: classes10.dex */
public class MessageWheelPicker extends View implements Runnable {

    /* JADX INFO: renamed from: A */
    public int f21882A;

    /* JADX INFO: renamed from: B */
    public int f21883B;

    /* JADX INFO: renamed from: C */
    public int f21884C;

    /* JADX INFO: renamed from: D */
    public int f21885D;

    /* JADX INFO: renamed from: E */
    public int f21886E;

    /* JADX INFO: renamed from: E0 */
    public boolean f21887E0;

    /* JADX INFO: renamed from: F */
    public int f21888F;

    /* JADX INFO: renamed from: F0 */
    public boolean f21889F0;

    /* JADX INFO: renamed from: G */
    public int f21890G;

    /* JADX INFO: renamed from: G0 */
    public boolean f21891G0;

    /* JADX INFO: renamed from: H */
    public int f21892H;

    /* JADX INFO: renamed from: H0 */
    public boolean f21893H0;

    /* JADX INFO: renamed from: I */
    public int f21894I;

    /* JADX INFO: renamed from: I0 */
    public boolean f21895I0;

    /* JADX INFO: renamed from: J */
    public int f21896J;

    /* JADX INFO: renamed from: K */
    public int f21897K;

    /* JADX INFO: renamed from: L */
    public int f21898L;

    /* JADX INFO: renamed from: M */
    public int f21899M;

    /* JADX INFO: renamed from: N */
    public int f21900N;

    /* JADX INFO: renamed from: O */
    public int f21901O;

    /* JADX INFO: renamed from: P */
    public int f21902P;

    /* JADX INFO: renamed from: Q */
    public int f21903Q;

    /* JADX INFO: renamed from: R */
    public int f21904R;

    /* JADX INFO: renamed from: S */
    public int f21905S;

    /* JADX INFO: renamed from: T */
    public int f21906T;

    /* JADX INFO: renamed from: U */
    public int f21907U;

    /* JADX INFO: renamed from: V */
    public int f21908V;

    /* JADX INFO: renamed from: W */
    public boolean f21909W;

    /* JADX INFO: renamed from: a */
    public final Handler f21910a;

    /* JADX INFO: renamed from: b */
    public Paint f21911b;

    /* JADX INFO: renamed from: c */
    public Scroller f21912c;

    /* JADX INFO: renamed from: d */
    public VelocityTracker f21913d;

    /* JADX INFO: renamed from: e */
    public boolean f21914e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7977b f21915f;

    /* JADX INFO: renamed from: g */
    public Rect f21916g;

    /* JADX INFO: renamed from: h */
    public Rect f21917h;

    /* JADX INFO: renamed from: i */
    public Rect f21918i;

    /* JADX INFO: renamed from: j */
    public Rect f21919j;

    /* JADX INFO: renamed from: k */
    public Rect f21920k;

    /* JADX INFO: renamed from: k0 */
    public boolean f21921k0;

    /* JADX INFO: renamed from: l */
    public Camera f21922l;

    /* JADX INFO: renamed from: m */
    public Matrix f21923m;

    /* JADX INFO: renamed from: n */
    public Matrix f21924n;

    /* JADX INFO: renamed from: o */
    public List f21925o;

    /* JADX INFO: renamed from: p */
    public String f21926p;

    /* JADX INFO: renamed from: p0 */
    public boolean f21927p0;

    /* JADX INFO: renamed from: q */
    public int f21928q;

    /* JADX INFO: renamed from: r */
    public int f21929r;

    /* JADX INFO: renamed from: s */
    public int f21930s;

    /* JADX INFO: renamed from: t */
    public int f21931t;

    /* JADX INFO: renamed from: u */
    public int f21932u;

    /* JADX INFO: renamed from: v */
    public int f21933v;

    /* JADX INFO: renamed from: w */
    public int f21934w;

    /* JADX INFO: renamed from: x */
    public int f21935x;

    /* JADX INFO: renamed from: y */
    public int f21936y;

    /* JADX INFO: renamed from: z */
    public int f21937z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.message.inner.view.MessageWheelPicker$a */
    public interface InterfaceC7976a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.message.inner.view.MessageWheelPicker$b */
    public interface InterfaceC7977b {
        /* JADX INFO: renamed from: a */
        void mo37021a(int i);

        /* JADX INFO: renamed from: b */
        void mo37022b(int i);

        /* JADX INFO: renamed from: c */
        void mo37023c(int i);
    }

    public MessageWheelPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21910a = new Handler();
        this.f21925o = new ArrayList();
        this.f21928q = 7;
        this.f21935x = 0;
        this.f21936y = 0;
        this.f21898L = 50;
        this.f21899M = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f21908V = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohc0.f147429x);
        this.f21928q = typedArrayObtainStyledAttributes.getInt(ohc0.f147372P, 7);
        this.f21892H = typedArrayObtainStyledAttributes.getInt(ohc0.f147370N, 0);
        this.f21909W = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147369M, false);
        this.f21905S = typedArrayObtainStyledAttributes.getInt(ohc0.f147368L, -1);
        this.f21926p = typedArrayObtainStyledAttributes.getString(ohc0.f147367K);
        this.f21883B = typedArrayObtainStyledAttributes.getDimensionPixelSize(ohc0.f147364H, getContext().getResources().getDimensionPixelSize(eac0.f92759g));
        this.f21884C = typedArrayObtainStyledAttributes.getDimensionPixelSize(ohc0.f147359C, getContext().getResources().getDimensionPixelSize(eac0.f92759g));
        this.f21935x = typedArrayObtainStyledAttributes.getDimensionPixelSize(ohc0.f147366J, getContext().getResources().getDimensionPixelSize(eac0.f92760h));
        this.f21934w = typedArrayObtainStyledAttributes.getColor(ohc0.f147371O, -14606047);
        this.f21933v = typedArrayObtainStyledAttributes.getColor(ohc0.f147365I, -7829368);
        this.f21889F0 = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147361E, false);
        this.f21921k0 = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147362F, false);
        this.f21937z = typedArrayObtainStyledAttributes.getColor(ohc0.f147363G, -1166541);
        this.f21927p0 = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147357A, false);
        this.f21882A = typedArrayObtainStyledAttributes.getColor(ohc0.f147358B, -1996488705);
        this.f21887E0 = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147432z, false);
        this.f21891G0 = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147360D, false);
        this.f21885D = typedArrayObtainStyledAttributes.getInt(ohc0.f147431y, 0);
        typedArrayObtainStyledAttributes.recycle();
        m37015j();
    }

    /* JADX INFO: renamed from: a */
    public final void m37006a() {
        if (this.f21927p0 || this.f21934w != -1) {
            Rect rect = this.f21919j;
            Rect rect2 = this.f21916g;
            int i = rect2.left;
            int i2 = this.f21901O;
            int i3 = this.f21888F;
            rect.set(i, i2 - i3, rect2.right, i2 + i3);
            Rect rect3 = this.f21920k;
            Rect rect4 = this.f21916g;
            int i4 = rect4.left;
            int i5 = this.f21901O;
            int i6 = this.f21884C;
            rect3.set(i4, i5 - (i6 / 2), rect4.right, i5 + (i6 / 2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m37007b(int i) {
        return (int) (((double) this.f21890G) - (Math.cos(Math.toRadians(i)) * ((double) this.f21890G)));
    }

    /* JADX INFO: renamed from: c */
    public final int m37008c(int i) {
        if (Math.abs(i) <= this.f21888F) {
            return -i;
        }
        int i2 = this.f21904R;
        int i3 = this.f21886E;
        return i2 < 0 ? (-i3) - i : i3 - i;
    }

    /* JADX INFO: renamed from: d */
    public final void m37009d() {
        int i = this.f21885D;
        if (i == 1) {
            this.f21902P = this.f21916g.left;
        } else if (i != 2) {
            this.f21902P = this.f21900N;
        } else {
            this.f21902P = this.f21916g.right;
        }
        this.f21903Q = (int) (this.f21901O - ((this.f21911b.ascent() + this.f21911b.descent()) / 2.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m37010e() {
        int i = this.f21892H;
        int i2 = this.f21886E;
        int i3 = i * i2;
        this.f21896J = this.f21889F0 ? Integer.MIN_VALUE : ((-i2) * (this.f21925o.size() - 1)) + i3;
        if (this.f21889F0) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f21897K = i3;
    }

    /* JADX INFO: renamed from: f */
    public final void m37011f() {
        if (this.f21921k0) {
            int i = this.f21936y / 2;
            int i2 = this.f21901O;
            int i3 = this.f21888F;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f21917h;
            Rect rect2 = this.f21916g;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f21918i;
            Rect rect4 = this.f21916g;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m37012g(int i) {
        return (int) (Math.sin(Math.toRadians(i)) * ((double) this.f21890G));
    }

    public int getCurrentItemPosition() {
        return this.f21894I;
    }

    public int getCurtainColor() {
        return this.f21882A;
    }

    public List getData() {
        return this.f21925o;
    }

    public int getIndicatorColor() {
        return this.f21937z;
    }

    public int getIndicatorSize() {
        return this.f21936y;
    }

    public int getItemAlign() {
        return this.f21885D;
    }

    public int getItemSpace() {
        return this.f21883B;
    }

    public int getItemTextColor() {
        return this.f21933v;
    }

    public int getItemTextSize() {
        return this.f21935x;
    }

    public String getMaximumWidthText() {
        return this.f21926p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f21905S;
    }

    public Object getSelectItem() {
        return this.f21925o.get(this.f21894I);
    }

    public int getSelectedItemPosition() {
        return this.f21892H;
    }

    public int getSelectedItemTextColor() {
        return this.f21934w;
    }

    public Typeface getTypeface() {
        Paint paint = this.f21911b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f21928q;
    }

    /* JADX INFO: renamed from: h */
    public void m37013h() {
        this.f21932u = 0;
        this.f21931t = 0;
        if (jyb.m147479J(this.f21925o)) {
            return;
        }
        if (this.f21909W) {
            this.f21931t = (int) this.f21911b.measureText(String.valueOf(this.f21925o.get(0)));
        } else if (m37016k(this.f21905S)) {
            this.f21931t = (int) this.f21911b.measureText(String.valueOf(this.f21925o.get(this.f21905S)));
        } else if (TextUtils.isEmpty(this.f21926p)) {
            Iterator it = this.f21925o.iterator();
            while (it.hasNext()) {
                this.f21931t = Math.max(this.f21931t, (int) this.f21911b.measureText(String.valueOf(it.next())));
            }
        } else {
            this.f21931t = (int) this.f21911b.measureText(this.f21926p);
        }
        Paint.FontMetrics fontMetrics = this.f21911b.getFontMetrics();
        this.f21932u = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: i */
    public final String m37014i(String str) {
        return ((float) getWidth()) < this.f21911b.measureText(str) ? TextUtils.ellipsize(str, new TextPaint(this.f21911b), getWidth(), TextUtils.TruncateAt.END).toString() : str;
    }

    /* JADX INFO: renamed from: j */
    public final void m37015j() {
        m37020o();
        Paint paint = new Paint(69);
        this.f21911b = paint;
        paint.setTextSize(this.f21935x);
        m37019n();
        m37013h();
        this.f21912c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f21898L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21899M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f21908V = viewConfiguration.getScaledTouchSlop();
        this.f21916g = new Rect();
        this.f21917h = new Rect();
        this.f21918i = new Rect();
        this.f21919j = new Rect();
        this.f21920k = new Rect();
        this.f21922l = new Camera();
        this.f21923m = new Matrix();
        this.f21924n = new Matrix();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m37016k(int i) {
        return i >= 0 && i < this.f21925o.size();
    }

    /* JADX INFO: renamed from: l */
    public final int m37017l(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* JADX INFO: renamed from: m */
    public void m37018m(int i, boolean z) {
        this.f21914e = false;
        if (!z || !this.f21912c.isFinished()) {
            if (!this.f21912c.isFinished()) {
                this.f21912c.abortAnimation();
            }
            int iMax = Math.max(Math.min(i, this.f21925o.size() - 1), 0);
            this.f21892H = iMax;
            this.f21894I = iMax;
            this.f21904R = 0;
            m37010e();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f21894I;
        if (i2 == 0) {
            return;
        }
        if (this.f21889F0 && Math.abs(i2) > size / 2) {
            if (i2 > 0) {
                size = -size;
            }
            i2 += size;
        }
        Scroller scroller = this.f21912c;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f21886E);
        this.f21910a.post(this);
    }

    /* JADX INFO: renamed from: n */
    public void m37019n() {
        int i = this.f21885D;
        if (i == 1) {
            this.f21911b.setTextAlign(Paint.Align.LEFT);
            return;
        }
        Paint paint = this.f21911b;
        if (i != 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m37020o() {
        int i = this.f21928q;
        if (i < 2) {
            mym.m160801a("Wheel's visible item count can not be less than 2!");
            return;
        }
        if (i % 2 == 0) {
            this.f21928q = i + 1;
        }
        int i2 = this.f21928q + 2;
        this.f21929r = i2;
        this.f21930s = i2 / 2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String strValueOf;
        int iM37012g;
        int i;
        InterfaceC7977b interfaceC7977b = this.f21915f;
        if (interfaceC7977b != null) {
            interfaceC7977b.mo37022b(this.f21904R);
        }
        if (this.f21925o.size() == 0) {
            return;
        }
        if (this.f21927p0) {
            this.f21911b.setColor(this.f21882A);
            this.f21911b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f21920k, this.f21911b);
        }
        int i2 = (-this.f21904R) / this.f21886E;
        int i3 = this.f21930s;
        int i4 = i2 - i3;
        int i5 = this.f21892H + i4;
        int i6 = -i3;
        while (i5 < this.f21892H + i4 + this.f21929r) {
            if (this.f21889F0) {
                int size = i5 % this.f21925o.size();
                if (size < 0) {
                    size += this.f21925o.size();
                }
                strValueOf = String.valueOf(this.f21925o.get(size));
            } else {
                strValueOf = m37016k(i5) ? String.valueOf(this.f21925o.get(i5)) : "";
            }
            this.f21911b.setColor(this.f21933v);
            this.f21911b.setStyle(Paint.Style.FILL);
            int i7 = this.f21903Q;
            int i8 = this.f21886E;
            int i9 = (i6 * i8) + i7 + (this.f21904R % i8);
            if (this.f21891G0) {
                int iAbs = i7 - Math.abs(i7 - i9);
                int i10 = this.f21916g.top;
                int i11 = this.f21903Q;
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
                iM37012g = m37012g(i12);
                int i13 = this.f21900N;
                int i14 = this.f21885D;
                if (i14 == 1) {
                    i13 = this.f21916g.left;
                } else if (i14 == 2) {
                    i13 = this.f21916g.right;
                }
                int i15 = this.f21901O - iM37012g;
                this.f21922l.save();
                this.f21922l.rotateX(f3);
                this.f21922l.getMatrix(this.f21923m);
                this.f21922l.restore();
                float f4 = -i13;
                float f5 = -i15;
                this.f21923m.preTranslate(f4, f5);
                float f6 = i13;
                float f7 = i15;
                this.f21923m.postTranslate(f6, f7);
                this.f21922l.save();
                this.f21922l.translate(0.0f, 0.0f, m37007b(i12));
                this.f21922l.getMatrix(this.f21924n);
                this.f21922l.restore();
                this.f21924n.preTranslate(f4, f5);
                this.f21924n.postTranslate(f6, f7);
                this.f21923m.postConcat(this.f21924n);
            } else {
                iM37012g = 0;
            }
            if (this.f21887E0) {
                int i16 = this.f21903Q;
                int iAbs2 = (int) ((((i16 - Math.abs(i16 - i9)) * 1.0f) / this.f21903Q) * 255.0f);
                this.f21911b.setAlpha(iAbs2 < 0 ? 0 : iAbs2);
            }
            if (this.f21891G0) {
                i9 = this.f21903Q - iM37012g;
            }
            if (this.f21934w != -1) {
                canvas.save();
                if (this.f21891G0) {
                    canvas.concat(this.f21923m);
                }
                canvas.clipRect(this.f21919j, Region.Op.DIFFERENCE);
                float f8 = i9;
                canvas.drawText(m37014i(strValueOf), this.f21902P, f8, this.f21911b);
                canvas.restore();
                this.f21911b.setColor(this.f21934w);
                canvas.save();
                if (this.f21891G0) {
                    canvas.concat(this.f21923m);
                }
                canvas.clipRect(this.f21919j);
                canvas.drawText(m37014i(strValueOf), this.f21902P, f8, this.f21911b);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.f21916g);
                if (this.f21891G0) {
                    canvas.concat(this.f21923m);
                }
                canvas.drawText(m37014i(strValueOf), this.f21902P, i9, this.f21911b);
                canvas.restore();
            }
            i5++;
            i6++;
        }
        if (this.f21921k0) {
            this.f21911b.setColor(this.f21937z);
            this.f21911b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f21917h, this.f21911b);
            canvas.drawRect(this.f21918i, this.f21911b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f21931t;
        int i4 = this.f21932u;
        int i5 = this.f21928q;
        int i6 = (i4 * i5) + (this.f21883B * (i5 - 1));
        if (this.f21891G0) {
            i6 = (int) (((double) (i6 * 2)) / 3.141592653589793d);
        }
        setMeasuredDimension(m37017l(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m37017l(mode2, size2, i6 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f21916g.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f21900N = this.f21916g.centerX();
        this.f21901O = this.f21916g.centerY();
        m37009d();
        this.f21890G = this.f21916g.height() / 2;
        int iHeight = this.f21916g.height() / this.f21928q;
        this.f21886E = iHeight;
        this.f21888F = iHeight / 2;
        m37010e();
        m37011f();
        m37006a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21914e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f21913d;
            if (velocityTracker == null) {
                this.f21913d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f21913d.addMovement(motionEvent);
            if (!this.f21912c.isFinished()) {
                this.f21912c.abortAnimation();
                this.f21895I0 = true;
            }
            int y = (int) motionEvent.getY();
            this.f21906T = y;
            this.f21907U = y;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f21893H0 || this.f21895I0) {
                this.f21913d.addMovement(motionEvent);
                this.f21913d.computeCurrentVelocity(1000, this.f21899M);
                this.f21895I0 = false;
                int yVelocity = (int) this.f21913d.getYVelocity();
                int iAbs = Math.abs(yVelocity);
                int i = this.f21898L;
                Scroller scroller = this.f21912c;
                if (iAbs > i) {
                    scroller.fling(0, this.f21904R, 0, yVelocity, 0, 0, this.f21896J, this.f21897K);
                    Scroller scroller2 = this.f21912c;
                    scroller2.setFinalY(scroller2.getFinalY() + m37008c(this.f21912c.getFinalY() % this.f21886E));
                } else {
                    int i2 = this.f21904R;
                    scroller.startScroll(0, i2, 0, m37008c(i2 % this.f21886E));
                }
                if (!this.f21889F0) {
                    int finalY = this.f21912c.getFinalY();
                    int i3 = this.f21897K;
                    Scroller scroller3 = this.f21912c;
                    if (finalY > i3) {
                        scroller3.setFinalY(i3);
                    } else {
                        int finalY2 = scroller3.getFinalY();
                        int i4 = this.f21896J;
                        if (finalY2 < i4) {
                            this.f21912c.setFinalY(i4);
                        }
                    }
                }
                this.f21910a.post(this);
                VelocityTracker velocityTracker2 = this.f21913d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f21913d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f21913d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f21913d = null;
                }
            }
        } else if (Math.abs(this.f21907U - motionEvent.getY()) < this.f21908V) {
            this.f21893H0 = true;
        } else {
            this.f21893H0 = false;
            this.f21913d.addMovement(motionEvent);
            InterfaceC7977b interfaceC7977b = this.f21915f;
            if (interfaceC7977b != null) {
                interfaceC7977b.mo37023c(1);
            }
            float y2 = motionEvent.getY() - this.f21906T;
            if (Math.abs(y2) >= 1.0f) {
                this.f21904R = (int) (this.f21904R + y2);
                this.f21906T = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f21925o;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f21912c.isFinished() && !this.f21895I0) {
            int i = this.f21886E;
            if (i == 0) {
                return;
            }
            int size = (((-this.f21904R) / i) + this.f21892H) % this.f21925o.size();
            if (size < 0) {
                size += this.f21925o.size();
            }
            this.f21894I = size;
            InterfaceC7977b interfaceC7977b = this.f21915f;
            if (interfaceC7977b != null && this.f21914e) {
                interfaceC7977b.mo37021a(size);
                this.f21915f.mo37023c(0);
            }
        }
        if (this.f21912c.computeScrollOffset()) {
            InterfaceC7977b interfaceC7977b2 = this.f21915f;
            if (interfaceC7977b2 != null) {
                interfaceC7977b2.mo37023c(2);
            }
            this.f21904R = this.f21912c.getCurrY();
            postInvalidate();
            this.f21910a.postDelayed(this, 16L);
        }
    }

    public void setAtmospheric(boolean z) {
        this.f21887E0 = z;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f21927p0 = z;
        m37006a();
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f21882A = i;
        invalidate();
    }

    public void setCurtainHeight(int i) {
        this.f21884C = i;
    }

    public void setCurved(boolean z) {
        this.f21891G0 = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f21889F0 = z;
        m37010e();
        invalidate();
    }

    public void setData(List list) {
        if (jyb.m147479J(list)) {
            mnd0.m159157a("WheelPicker's data can not be null!");
            return;
        }
        this.f21925o = list;
        this.f21894I = 0;
        this.f21892H = 0;
        this.f21904R = 0;
        m37013h();
        m37010e();
        requestLayout();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f21921k0 = z;
        m37011f();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f21937z = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f21936y = i;
        m37011f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f21885D = i;
        m37019n();
        m37009d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f21883B = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f21933v = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f21935x = i;
        this.f21911b.setTextSize(i);
        m37013h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str == null) {
            mnd0.m159157a("Maximum width text can not be null!");
            return;
        }
        this.f21926p = str;
        m37013h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m37016k(i)) {
            this.f21905S = i;
            m37013h();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f21925o.size() + "), but current is " + i);
    }

    public void setOnItemSelectedListener(InterfaceC7976a interfaceC7976a) {
    }

    public void setOnWheelChangeListener(InterfaceC7977b interfaceC7977b) {
        this.f21915f = interfaceC7977b;
    }

    public void setSameWidth(boolean z) {
        this.f21909W = z;
        m37013h();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        m37018m(i, false);
    }

    public void setSelectedItemTextColor(int i) {
        this.f21934w = i;
        m37006a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f21911b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m37013h();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f21928q = i;
        m37020o();
        requestLayout();
    }

    public MessageWheelPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageWheelPicker(Context context) {
        super(context);
        this.f21910a = new Handler();
        this.f21925o = new ArrayList();
        this.f21928q = 7;
        this.f21935x = 0;
        this.f21936y = 0;
        this.f21898L = 50;
        this.f21899M = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f21908V = 8;
        m37015j();
    }
}
