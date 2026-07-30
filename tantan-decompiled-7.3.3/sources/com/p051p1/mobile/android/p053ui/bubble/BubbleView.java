package com.p051p1.mobile.android.p053ui.bubble;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.bge;
import p153l.ezf0;
import p153l.tyf0;
import p153l.x20;
import p153l.y20;
import p153l.zsi;

/* JADX INFO: loaded from: classes8.dex */
class BubbleView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Paint f16381a;

    /* JADX INFO: renamed from: b */
    public C4496a f16382b;

    /* JADX INFO: renamed from: c */
    public Path f16383c;

    /* JADX INFO: renamed from: d */
    public int f16384d;

    /* JADX INFO: renamed from: e */
    public int f16385e;

    /* JADX INFO: renamed from: f */
    public int f16386f;

    /* JADX INFO: renamed from: g */
    public int f16387g;

    /* JADX INFO: renamed from: h */
    public int f16388h;

    /* JADX INFO: renamed from: i */
    public int f16389i;

    /* JADX INFO: renamed from: j */
    public int f16390j;

    /* JADX INFO: renamed from: k */
    public int f16391k;

    /* JADX INFO: renamed from: l */
    public int f16392l;

    /* JADX INFO: renamed from: m */
    public RunnableC4495a f16393m;

    /* JADX INFO: renamed from: n */
    public String f16394n;

    /* JADX INFO: renamed from: o */
    public int f16395o;

    /* JADX INFO: renamed from: p */
    public int f16396p;

    /* JADX INFO: renamed from: q */
    public boolean f16397q;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.BubbleView$a */
    public class RunnableC4495a implements Runnable {
        public RunnableC4495a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4499d.m21895l().m21899k(BubbleView.this.f16394n);
        }
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16384d = 0;
        this.f16385e = 0;
        m21838n();
        if (context instanceof Act) {
            ((Act) context).creates(new y20() { // from class: com.p1.mobile.android.ui.bubble.e
                @Override // p153l.y20
                public final void call(Object obj) {
                    BubbleView.m21826b((Bundle) obj);
                }
            }, new x20() { // from class: com.p1.mobile.android.ui.bubble.f
                @Override // p153l.x20
                public final void call() {
                    this.f16472a.m21839o();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m21825a(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21826b(Bundle bundle) {
    }

    /* JADX INFO: renamed from: f */
    public final void m21830f(Rect rect, int i, int i2, int i3, int i4) {
        this.f16395o = i3;
        this.f16396p = i4;
        m21831g(i, i2, i3, i4);
        int i5 = (rect.right + rect.left) / 2;
        int i6 = this.f16384d;
        this.f16391k = i5 - (i6 / 2);
        C4496a c4496a = this.f16382b;
        int i7 = c4496a.f16418b;
        int i8 = C4496a.f16399N;
        if ((i7 & i8) == i8) {
            this.f16392l = rect.bottom;
        } else {
            this.f16392l = rect.top - this.f16385e;
        }
        if (i5 > i / 2) {
            if ((i6 / 2) + i5 > i) {
                int i9 = c4496a.f16421e;
                int i10 = ((i5 - (i - i6)) - i9) - this.f16395o;
                this.f16390j = i10;
                this.f16390j = Math.min((i - i9) - c4496a.f16425i, i10);
                this.f16391k = i - this.f16384d;
            }
        } else if (i6 / 2 > i5) {
            int i11 = c4496a.f16421e;
            int i12 = (i5 - i11) - this.f16395o;
            this.f16390j = i12;
            this.f16390j = Math.max(i11 + c4496a.f16425i, i12);
            this.f16391k = 0;
        }
        this.f16397q = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m21831g(int i, int i2, int i3, int i4) {
        C4496a c4496a = this.f16382b;
        c4496a.f16439w.measure(View.MeasureSpec.makeMeasureSpec(((i - (c4496a.f16421e * 2)) - i3) - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        this.f16386f = this.f16382b.f16439w.getMeasuredWidth();
        int measuredHeight = this.f16382b.f16439w.getMeasuredHeight();
        this.f16387g = measuredHeight;
        m21842r(this.f16386f, measuredHeight);
        C4496a c4496a2 = this.f16382b;
        int i5 = c4496a2.f16421e;
        int i6 = this.f16387g;
        this.f16385e = (i5 * 2) + i6 + c4496a2.f16423g;
        int i7 = this.f16386f;
        this.f16384d = (i5 * 2) + i7 + i3 + i4;
        this.f16388h = i7;
        this.f16389i = i6;
        this.f16390j = i7 / 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX INFO: renamed from: h */
    public void m21832h(Rect rect, int i, int i2) {
        int i3;
        C4496a c4496a = this.f16382b;
        this.f16395o = c4496a.f16411H;
        this.f16396p = c4496a.f16412I;
        int i4 = (rect.right + rect.left) / 2;
        int i5 = c4496a.f16418b;
        double dTan = Math.tan(((((double) c4496a.f16424h) / 180.0d) * 3.141592653589793d) / 2.0d);
        C4496a c4496a2 = this.f16382b;
        int i6 = (int) (dTan * ((double) c4496a2.f16423g));
        int i7 = this.f16395o;
        int i8 = c4496a2.f16421e;
        int i9 = c4496a2.f16425i;
        if (i7 > ((i4 - i8) - i9) - i6) {
            this.f16395o = 0;
        }
        if (i4 + i6 + i8 + i9 > i) {
            this.f16396p = 0;
        }
        int i10 = C4496a.f16400O;
        if ((i5 & i10) == i10) {
            this.f16395o = 0;
            int i11 = c4496a2.f16438v + i9 + i8 + i6;
            int i12 = (rect.right + rect.left) / 2;
            if (i11 < i12) {
                i3 = i - (i12 - i11);
            } else {
                i3 = i;
            }
        } else {
            int i13 = C4496a.f16401P;
            if ((i5 & i13) == i13) {
                this.f16396p = 0;
                i3 = c4496a2.f16438v + i9 + i8 + i6 + ((rect.right + rect.left) / 2);
                if (i3 >= i) {
                    i3 = i;
                }
            } else {
                i3 = i;
            }
        }
        m21831g(i3, i2, this.f16395o, this.f16396p);
        int i14 = C4496a.f16400O;
        if ((i5 & i14) == i14) {
            C4496a c4496a3 = this.f16382b;
            int i15 = c4496a3.f16438v;
            int i16 = c4496a3.f16425i;
            int i17 = c4496a3.f16421e;
            int i18 = (((i4 - i6) - i15) - i16) - i17;
            this.f16391k = i18;
            int i19 = c4496a3.f16418b;
            int i20 = C4496a.f16399N;
            if ((i19 & i20) == i20) {
                this.f16392l = rect.bottom;
            } else {
                this.f16392l = rect.top - this.f16385e;
            }
            int i21 = i15 + i16 + i6;
            this.f16390j = i21;
            if (i18 + i17 + i21 != i4) {
                m21830f(rect, i, i2, 0, 0);
                return;
            }
            return;
        }
        int i22 = C4496a.f16401P;
        if ((i5 & i22) != i22) {
            m21830f(rect, i3, i2, this.f16395o, this.f16396p);
            return;
        }
        C4496a c4496a4 = this.f16382b;
        int i23 = c4496a4.f16438v;
        int i24 = c4496a4.f16425i;
        int i25 = c4496a4.f16421e;
        this.f16391k = ((((i4 - i6) - i23) - i24) - i25) - this.f16395o;
        int i26 = i23 + i24 + i25 + i6 + ((rect.right + rect.left) / 2);
        if (i26 > i3) {
            m21830f(rect, i3, i2, 0, 0);
            return;
        }
        int i27 = i26 - this.f16384d;
        this.f16391k = i27;
        int iMax = Math.max(0, i27);
        this.f16391k = iMax;
        C4496a c4496a5 = this.f16382b;
        int i28 = c4496a5.f16418b;
        int i29 = C4496a.f16399N;
        if ((i28 & i29) == i29) {
            this.f16392l = rect.bottom;
        } else {
            this.f16392l = rect.top - this.f16385e;
        }
        int i30 = ((this.f16388h - c4496a5.f16438v) - c4496a5.f16425i) - i6;
        this.f16390j = i30;
        if (iMax + c4496a5.f16421e + i30 + this.f16395o != i4) {
            m21830f(rect, i, i2, 0, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m21833i() {
        if (NullChecker.m82486a(this.f16393m)) {
            removeCallbacks(this.f16393m);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m21834j(int i) {
        return (int) (getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: k */
    public float[] m21835k() {
        float[] fArr = new float[2];
        C4496a c4496a = this.f16382b;
        if (c4496a == null) {
            if (this.f16397q) {
                fArr[0] = this.f16390j;
            } else {
                fArr[0] = getWidth() / 2;
            }
            fArr[1] = getHeight();
            return fArr;
        }
        float f = (float) (((((double) c4496a.f16424h) / 180.0d) * 3.141592653589793d) / 2.0d);
        int i = c4496a.f16418b;
        int i2 = C4496a.f16399N;
        if ((i & i2) == i2) {
            fArr[1] = 0.0f;
            int i3 = C4496a.f16400O;
            if ((i & i3) == i3) {
                fArr[0] = c4496a.f16421e + this.f16395o + c4496a.f16425i + f;
                return fArr;
            }
            int i4 = C4496a.f16401P;
            if ((i & i4) == i4) {
                float width = getWidth();
                C4496a c4496a2 = this.f16382b;
                fArr[0] = width - (((c4496a2.f16421e + this.f16396p) + c4496a2.f16425i) + f);
                return fArr;
            }
            if (this.f16397q) {
                fArr[0] = this.f16390j;
                return fArr;
            }
            fArr[0] = getWidth() / 2;
            return fArr;
        }
        int i5 = C4496a.f16402Q;
        if ((i & i5) == i5) {
            fArr[1] = getHeight();
            C4496a c4496a3 = this.f16382b;
            int i6 = c4496a3.f16418b;
            int i7 = C4496a.f16400O;
            if ((i6 & i7) == i7) {
                fArr[0] = c4496a3.f16421e + this.f16395o + c4496a3.f16425i + f;
                return fArr;
            }
            int i8 = C4496a.f16401P;
            if ((i6 & i8) == i8) {
                float width2 = getWidth();
                C4496a c4496a4 = this.f16382b;
                fArr[0] = width2 - (((c4496a4.f16421e + this.f16396p) + c4496a4.f16425i) + f);
                return fArr;
            }
            if (this.f16397q) {
                fArr[0] = this.f16390j;
                return fArr;
            }
            fArr[0] = getWidth() / 2;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: l */
    public int[] m21836l() {
        return new int[]{this.f16391k, this.f16392l};
    }

    /* JADX INFO: renamed from: m */
    public final Path m21837m() {
        LinearGradient linearGradient;
        Path path = new Path();
        this.f16381a.setStyle(Paint.Style.FILL);
        C4496a c4496a = this.f16382b;
        int i = c4496a.f16421e;
        int i2 = c4496a.f16423g + i;
        int i3 = c4496a.f16418b;
        int i4 = C4496a.f16402Q;
        if ((i3 & i4) == i4) {
            i2 = i;
        }
        int i5 = i + this.f16395o;
        float f = i2;
        path.moveTo(c4496a.f16425i + i5, f);
        C4496a c4496a2 = this.f16382b;
        double d = ((((double) c4496a2.f16424h) / 180.0d) * 3.141592653589793d) / 2.0d;
        int i6 = c4496a2.f16418b;
        int i7 = C4496a.f16399N;
        if ((i6 & i7) == i7) {
            int iTan = (int) (Math.tan(d) * ((double) this.f16382b.f16423g));
            path.lineTo((this.f16390j + i5) - iTan, f);
            int i8 = iTan / 3;
            int iTan2 = (int) (((double) i8) / Math.tan(d));
            path.lineTo((this.f16390j + i5) - i8, (i2 - this.f16382b.f16423g) + iTan2);
            int i9 = this.f16390j;
            int i10 = this.f16382b.f16423g;
            path.quadTo(i5 + i9, i2 - i10, i9 + i5 + i8, (i2 - i10) + iTan2);
            path.lineTo(this.f16390j + i5 + iTan, f);
            path.lineTo((this.f16388h + i5) - this.f16382b.f16425i, f);
        } else {
            path.lineTo((this.f16388h + i5) - c4496a2.f16425i, f);
        }
        RectF rectF = new RectF();
        int i11 = this.f16388h;
        int i12 = this.f16382b.f16425i;
        rectF.set((i5 + i11) - (i12 * 2), f, i11 + i5, (i12 * 2) + i2);
        path.addArc(rectF, -90.0f, 90.0f);
        path.lineTo(this.f16388h + i5, (this.f16389i + i2) - this.f16382b.f16425i);
        int i13 = this.f16388h;
        int i14 = this.f16382b.f16425i;
        int i15 = this.f16389i;
        rectF.set((i5 + i13) - (i14 * 2), (i2 + i15) - (i14 * 2), i13 + i5, i15 + i2);
        path.arcTo(rectF, 0.0f, 90.0f, false);
        C4496a c4496a3 = this.f16382b;
        int i16 = c4496a3.f16418b;
        int i17 = C4496a.f16402Q;
        if ((i16 & i17) == i17) {
            int iTan3 = (int) (Math.tan(d) * ((double) this.f16382b.f16423g));
            int i18 = iTan3 / 3;
            int iTan4 = (int) (((double) i18) / Math.tan(d));
            path.lineTo(this.f16390j + i5 + iTan3, this.f16389i + i2);
            path.lineTo(this.f16390j + i5 + i18, ((this.f16389i + i2) + this.f16382b.f16423g) - iTan4);
            int i19 = this.f16390j;
            int i20 = this.f16389i;
            int i21 = this.f16382b.f16423g;
            path.quadTo(i5 + i19, i2 + i20 + i21, (i19 + i5) - i18, ((i20 + i2) + i21) - iTan4);
            path.lineTo((this.f16390j + i5) - iTan3, this.f16389i + i2);
            path.lineTo(this.f16382b.f16425i + i5, this.f16389i + i2);
        } else {
            path.lineTo(c4496a3.f16425i + i5, this.f16389i + i2);
        }
        float f2 = i5;
        int i22 = this.f16389i;
        int i23 = this.f16382b.f16425i;
        rectF.set(f2, (i2 + i22) - (i23 * 2), (i23 * 2) + i5, i22 + i2);
        path.arcTo(rectF, 90.0f, 90.0f, false);
        path.lineTo(f2, this.f16382b.f16425i + i2);
        int i24 = this.f16382b.f16425i;
        rectF.set(f2, f, (i24 * 2) + i5, i2 + (i24 * 2));
        path.arcTo(rectF, 180.0f, 90.0f, false);
        path.lineTo(this.f16382b.f16425i + i5, f);
        path.close();
        C4496a c4496a4 = this.f16382b;
        int[] iArr = c4496a4.f16417a;
        if (iArr.length >= 2) {
            if (c4496a4.f16440x) {
                this.f16381a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f16388h, 0.0f, this.f16382b.f16417a, (float[]) null, Shader.TileMode.MIRROR));
            } else {
                int i25 = c4496a4.f16418b;
                int i26 = C4496a.f16402Q;
                if ((i25 & i26) == i26) {
                    C4496a c4496a5 = this.f16382b;
                    int i27 = c4496a5.f16421e;
                    linearGradient = new LinearGradient(f2, i27, f2, (this.f16385e - i27) - c4496a5.f16423g, c4496a5.f16417a, (float[]) null, Shader.TileMode.MIRROR);
                } else {
                    C4496a c4496a6 = this.f16382b;
                    int i28 = c4496a6.f16421e;
                    linearGradient = new LinearGradient(f2, c4496a6.f16423g + i28, f2, this.f16385e - i28, c4496a6.f16417a, (float[]) null, Shader.TileMode.MIRROR);
                }
                this.f16381a.setShader(linearGradient);
            }
        } else if (iArr.length == 1) {
            this.f16381a.setColor(iArr[0]);
        } else {
            this.f16381a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f16388h, 0.0f, new int[]{-551629, -539853}, (float[]) null, Shader.TileMode.MIRROR));
        }
        this.f16381a.setShadowLayer(this.f16382b.f16421e, 0.0f, m21834j(2), this.f16382b.f16422f > 0 ? getContext().getResources().getColor(this.f16382b.f16422f) : 419430400);
        return path;
    }

    /* JADX INFO: renamed from: n */
    public final void m21838n() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f16381a = paint;
        paint.setAntiAlias(true);
        this.f16381a.setColor(-16711936);
        setLayerType(0, this.f16381a);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m21839o() {
        m21833i();
        C4499d.m21895l().m21899k(this.f16394n);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C4499d.m21895l().m21897i(this.f16394n, this.f16382b.f16430n);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        super.onDraw(canvas);
        if (this.f16382b == null || (path = this.f16383c) == null) {
            return;
        }
        canvas.drawPath(path, this.f16381a);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float[] fArrM21835k = m21835k();
        setPivotX(fArrM21835k[0]);
        setPivotY(fArrM21835k[1]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f16384d, this.f16385e);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m21840p(bge bgeVar, float f, float f2) {
        float f3 = f / 1000.0f;
        setScaleX(f3);
        setScaleY(f3);
    }

    /* JADX INFO: renamed from: q */
    public final void m21841q() {
        if (this.f16393m == null) {
            RunnableC4495a runnableC4495a = new RunnableC4495a();
            this.f16393m = runnableC4495a;
            postDelayed(runnableC4495a, this.f16382b.f16426j);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m21842r(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f16382b.f16439w.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        C4496a c4496a = this.f16382b;
        int i3 = c4496a.f16418b;
        int i4 = C4496a.f16402Q;
        if ((i3 & i4) == i4) {
            int i5 = c4496a.f16421e;
            layoutParams.topMargin = i5;
            layoutParams.leftMargin = i5 + this.f16395o;
        } else {
            int i6 = c4496a.f16421e;
            layoutParams.topMargin = c4496a.f16423g + i6;
            layoutParams.leftMargin = i6 + this.f16395o;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        c4496a.f16439w.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: s */
    public void m21843s(C4496a c4496a, Rect rect, int i, int i2, String str) {
        this.f16382b = c4496a;
        if (NullChecker.m82486a(c4496a.f16439w)) {
            ViewParent parent = this.f16382b.f16439w.getParent();
            if (NullChecker.m82486a(parent) && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f16382b.f16439w);
                CrashHelper.m82480d(new Exception("bubble customView hasParent = " + str), 10);
            }
            addView(this.f16382b.f16439w);
        }
        C4496a c4496a2 = this.f16382b;
        if (c4496a2 == null || !c4496a2.f16408E) {
            setOnClickListener(this);
        } else {
            setOnTouchListener(new View.OnTouchListener() { // from class: com.p1.mobile.android.ui.bubble.h
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return BubbleView.m21825a(view, motionEvent);
                }
            });
        }
        m21832h(rect, i, i2);
    }

    /* JADX INFO: renamed from: t */
    public void m21844t(String str) {
        this.f16394n = str;
        this.f16383c = m21837m();
        requestLayout();
        zsi zsiVar = new zsi(0.0f);
        tyf0 tyf0VarM104127j = new tyf0(zsiVar).m193595r(new ezf0().m123347d(0.61f).m123349f(600.0f)).m104127j(0.0f);
        tyf0VarM104127j.m104120b(new bge.InterfaceC16001r() { // from class: com.p1.mobile.android.ui.bubble.g
            @Override // p153l.bge.InterfaceC16001r
            /* JADX INFO: renamed from: a */
            public final void mo21887a(bge bgeVar, float f, float f2) {
                this.f16473a.m21840p(bgeVar, f, f2);
            }
        });
        tyf0VarM104127j.m104127j(0.0f).m193592o(1000.0f);
        if (this.f16382b.f16426j > 0) {
            m21841q();
        }
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleView(Context context) {
        this(context, null);
    }
}
