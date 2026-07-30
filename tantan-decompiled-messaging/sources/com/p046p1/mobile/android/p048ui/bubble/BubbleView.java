package com.p046p1.mobile.android.p048ui.bubble;

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
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.dqi;
import p149l.e30;
import p149l.kqf0;
import p149l.vqf0;
import p149l.xee;

/* JADX INFO: loaded from: classes8.dex */
class BubbleView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Paint f15662a;

    /* JADX INFO: renamed from: b */
    public C4345a f15663b;

    /* JADX INFO: renamed from: c */
    public Path f15664c;

    /* JADX INFO: renamed from: d */
    public int f15665d;

    /* JADX INFO: renamed from: e */
    public int f15666e;

    /* JADX INFO: renamed from: f */
    public int f15667f;

    /* JADX INFO: renamed from: g */
    public int f15668g;

    /* JADX INFO: renamed from: h */
    public int f15669h;

    /* JADX INFO: renamed from: i */
    public int f15670i;

    /* JADX INFO: renamed from: j */
    public int f15671j;

    /* JADX INFO: renamed from: k */
    public int f15672k;

    /* JADX INFO: renamed from: l */
    public int f15673l;

    /* JADX INFO: renamed from: m */
    public RunnableC4344a f15674m;

    /* JADX INFO: renamed from: n */
    public String f15675n;

    /* JADX INFO: renamed from: o */
    public int f15676o;

    /* JADX INFO: renamed from: p */
    public int f15677p;

    /* JADX INFO: renamed from: q */
    public boolean f15678q;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.BubbleView$a */
    public class RunnableC4344a implements Runnable {
        public RunnableC4344a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4348d.m20896l().m20900k(BubbleView.this.f15675n);
        }
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15665d = 0;
        this.f15666e = 0;
        m20839n();
        if (context instanceof Act) {
            ((Act) context).creates(new e30() { // from class: com.p1.mobile.android.ui.bubble.e
                @Override // p149l.e30
                public final void call(Object obj) {
                    BubbleView.m20827b((Bundle) obj);
                }
            }, new d30() { // from class: com.p1.mobile.android.ui.bubble.f
                @Override // p149l.d30
                public final void call() {
                    this.f15753a.m20840o();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m20826a(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20827b(Bundle bundle) {
    }

    /* JADX INFO: renamed from: f */
    public final void m20831f(Rect rect, int i, int i2, int i3, int i4) {
        this.f15676o = i3;
        this.f15677p = i4;
        m20832g(i, i2, i3, i4);
        int i5 = (rect.right + rect.left) / 2;
        int i6 = this.f15665d;
        this.f15672k = i5 - (i6 / 2);
        C4345a c4345a = this.f15663b;
        int i7 = c4345a.f15699b;
        int i8 = C4345a.f15680N;
        if ((i7 & i8) == i8) {
            this.f15673l = rect.bottom;
        } else {
            this.f15673l = rect.top - this.f15666e;
        }
        if (i5 > i / 2) {
            if ((i6 / 2) + i5 > i) {
                int i9 = c4345a.f15702e;
                int i10 = ((i5 - (i - i6)) - i9) - this.f15676o;
                this.f15671j = i10;
                this.f15671j = Math.min((i - i9) - c4345a.f15706i, i10);
                this.f15672k = i - this.f15665d;
            }
        } else if (i6 / 2 > i5) {
            int i11 = c4345a.f15702e;
            int i12 = (i5 - i11) - this.f15676o;
            this.f15671j = i12;
            this.f15671j = Math.max(i11 + c4345a.f15706i, i12);
            this.f15672k = 0;
        }
        this.f15678q = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m20832g(int i, int i2, int i3, int i4) {
        C4345a c4345a = this.f15663b;
        c4345a.f15720w.measure(View.MeasureSpec.makeMeasureSpec(((i - (c4345a.f15702e * 2)) - i3) - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        this.f15667f = this.f15663b.f15720w.getMeasuredWidth();
        int measuredHeight = this.f15663b.f15720w.getMeasuredHeight();
        this.f15668g = measuredHeight;
        m20843r(this.f15667f, measuredHeight);
        C4345a c4345a2 = this.f15663b;
        int i5 = c4345a2.f15702e;
        int i6 = this.f15668g;
        this.f15666e = (i5 * 2) + i6 + c4345a2.f15704g;
        int i7 = this.f15667f;
        this.f15665d = (i5 * 2) + i7 + i3 + i4;
        this.f15669h = i7;
        this.f15670i = i6;
        this.f15671j = i7 / 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX INFO: renamed from: h */
    public void m20833h(Rect rect, int i, int i2) {
        int i3;
        C4345a c4345a = this.f15663b;
        this.f15676o = c4345a.f15692H;
        this.f15677p = c4345a.f15693I;
        int i4 = (rect.right + rect.left) / 2;
        int i5 = c4345a.f15699b;
        double dTan = Math.tan(((((double) c4345a.f15705h) / 180.0d) * 3.141592653589793d) / 2.0d);
        C4345a c4345a2 = this.f15663b;
        int i6 = (int) (dTan * ((double) c4345a2.f15704g));
        int i7 = this.f15676o;
        int i8 = c4345a2.f15702e;
        int i9 = c4345a2.f15706i;
        if (i7 > ((i4 - i8) - i9) - i6) {
            this.f15676o = 0;
        }
        if (i4 + i6 + i8 + i9 > i) {
            this.f15677p = 0;
        }
        int i10 = C4345a.f15681O;
        if ((i5 & i10) == i10) {
            this.f15676o = 0;
            int i11 = c4345a2.f15719v + i9 + i8 + i6;
            int i12 = (rect.right + rect.left) / 2;
            if (i11 < i12) {
                i3 = i - (i12 - i11);
            } else {
                i3 = i;
            }
        } else {
            int i13 = C4345a.f15682P;
            if ((i5 & i13) == i13) {
                this.f15677p = 0;
                i3 = c4345a2.f15719v + i9 + i8 + i6 + ((rect.right + rect.left) / 2);
                if (i3 >= i) {
                    i3 = i;
                }
            } else {
                i3 = i;
            }
        }
        m20832g(i3, i2, this.f15676o, this.f15677p);
        int i14 = C4345a.f15681O;
        if ((i5 & i14) == i14) {
            C4345a c4345a3 = this.f15663b;
            int i15 = c4345a3.f15719v;
            int i16 = c4345a3.f15706i;
            int i17 = c4345a3.f15702e;
            int i18 = (((i4 - i6) - i15) - i16) - i17;
            this.f15672k = i18;
            int i19 = c4345a3.f15699b;
            int i20 = C4345a.f15680N;
            if ((i19 & i20) == i20) {
                this.f15673l = rect.bottom;
            } else {
                this.f15673l = rect.top - this.f15666e;
            }
            int i21 = i15 + i16 + i6;
            this.f15671j = i21;
            if (i18 + i17 + i21 != i4) {
                m20831f(rect, i, i2, 0, 0);
                return;
            }
            return;
        }
        int i22 = C4345a.f15682P;
        if ((i5 & i22) != i22) {
            m20831f(rect, i3, i2, this.f15676o, this.f15677p);
            return;
        }
        C4345a c4345a4 = this.f15663b;
        int i23 = c4345a4.f15719v;
        int i24 = c4345a4.f15706i;
        int i25 = c4345a4.f15702e;
        this.f15672k = ((((i4 - i6) - i23) - i24) - i25) - this.f15676o;
        int i26 = i23 + i24 + i25 + i6 + ((rect.right + rect.left) / 2);
        if (i26 > i3) {
            m20831f(rect, i3, i2, 0, 0);
            return;
        }
        int i27 = i26 - this.f15665d;
        this.f15672k = i27;
        int iMax = Math.max(0, i27);
        this.f15672k = iMax;
        C4345a c4345a5 = this.f15663b;
        int i28 = c4345a5.f15699b;
        int i29 = C4345a.f15680N;
        if ((i28 & i29) == i29) {
            this.f15673l = rect.bottom;
        } else {
            this.f15673l = rect.top - this.f15666e;
        }
        int i30 = ((this.f15669h - c4345a5.f15719v) - c4345a5.f15706i) - i6;
        this.f15671j = i30;
        if (iMax + c4345a5.f15702e + i30 + this.f15676o != i4) {
            m20831f(rect, i, i2, 0, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m20834i() {
        if (NullChecker.m81303a(this.f15674m)) {
            removeCallbacks(this.f15674m);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m20835j(int i) {
        return (int) (getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: k */
    public float[] m20836k() {
        float[] fArr = new float[2];
        C4345a c4345a = this.f15663b;
        if (c4345a == null) {
            if (this.f15678q) {
                fArr[0] = this.f15671j;
            } else {
                fArr[0] = getWidth() / 2;
            }
            fArr[1] = getHeight();
            return fArr;
        }
        float f = (float) (((((double) c4345a.f15705h) / 180.0d) * 3.141592653589793d) / 2.0d);
        int i = c4345a.f15699b;
        int i2 = C4345a.f15680N;
        if ((i & i2) == i2) {
            fArr[1] = 0.0f;
            int i3 = C4345a.f15681O;
            if ((i & i3) == i3) {
                fArr[0] = c4345a.f15702e + this.f15676o + c4345a.f15706i + f;
                return fArr;
            }
            int i4 = C4345a.f15682P;
            if ((i & i4) == i4) {
                float width = getWidth();
                C4345a c4345a2 = this.f15663b;
                fArr[0] = width - (((c4345a2.f15702e + this.f15677p) + c4345a2.f15706i) + f);
                return fArr;
            }
            if (this.f15678q) {
                fArr[0] = this.f15671j;
                return fArr;
            }
            fArr[0] = getWidth() / 2;
            return fArr;
        }
        int i5 = C4345a.f15683Q;
        if ((i & i5) == i5) {
            fArr[1] = getHeight();
            C4345a c4345a3 = this.f15663b;
            int i6 = c4345a3.f15699b;
            int i7 = C4345a.f15681O;
            if ((i6 & i7) == i7) {
                fArr[0] = c4345a3.f15702e + this.f15676o + c4345a3.f15706i + f;
                return fArr;
            }
            int i8 = C4345a.f15682P;
            if ((i6 & i8) == i8) {
                float width2 = getWidth();
                C4345a c4345a4 = this.f15663b;
                fArr[0] = width2 - (((c4345a4.f15702e + this.f15677p) + c4345a4.f15706i) + f);
                return fArr;
            }
            if (this.f15678q) {
                fArr[0] = this.f15671j;
                return fArr;
            }
            fArr[0] = getWidth() / 2;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: l */
    public int[] m20837l() {
        return new int[]{this.f15672k, this.f15673l};
    }

    /* JADX INFO: renamed from: m */
    public final Path m20838m() {
        LinearGradient linearGradient;
        Path path = new Path();
        this.f15662a.setStyle(Paint.Style.FILL);
        C4345a c4345a = this.f15663b;
        int i = c4345a.f15702e;
        int i2 = c4345a.f15704g + i;
        int i3 = c4345a.f15699b;
        int i4 = C4345a.f15683Q;
        if ((i3 & i4) == i4) {
            i2 = i;
        }
        int i5 = i + this.f15676o;
        float f = i2;
        path.moveTo(c4345a.f15706i + i5, f);
        C4345a c4345a2 = this.f15663b;
        double d = ((((double) c4345a2.f15705h) / 180.0d) * 3.141592653589793d) / 2.0d;
        int i6 = c4345a2.f15699b;
        int i7 = C4345a.f15680N;
        if ((i6 & i7) == i7) {
            int iTan = (int) (Math.tan(d) * ((double) this.f15663b.f15704g));
            path.lineTo((this.f15671j + i5) - iTan, f);
            int i8 = iTan / 3;
            int iTan2 = (int) (((double) i8) / Math.tan(d));
            path.lineTo((this.f15671j + i5) - i8, (i2 - this.f15663b.f15704g) + iTan2);
            int i9 = this.f15671j;
            int i10 = this.f15663b.f15704g;
            path.quadTo(i5 + i9, i2 - i10, i9 + i5 + i8, (i2 - i10) + iTan2);
            path.lineTo(this.f15671j + i5 + iTan, f);
            path.lineTo((this.f15669h + i5) - this.f15663b.f15706i, f);
        } else {
            path.lineTo((this.f15669h + i5) - c4345a2.f15706i, f);
        }
        RectF rectF = new RectF();
        int i11 = this.f15669h;
        int i12 = this.f15663b.f15706i;
        rectF.set((i5 + i11) - (i12 * 2), f, i11 + i5, (i12 * 2) + i2);
        path.addArc(rectF, -90.0f, 90.0f);
        path.lineTo(this.f15669h + i5, (this.f15670i + i2) - this.f15663b.f15706i);
        int i13 = this.f15669h;
        int i14 = this.f15663b.f15706i;
        int i15 = this.f15670i;
        rectF.set((i5 + i13) - (i14 * 2), (i2 + i15) - (i14 * 2), i13 + i5, i15 + i2);
        path.arcTo(rectF, 0.0f, 90.0f, false);
        C4345a c4345a3 = this.f15663b;
        int i16 = c4345a3.f15699b;
        int i17 = C4345a.f15683Q;
        if ((i16 & i17) == i17) {
            int iTan3 = (int) (Math.tan(d) * ((double) this.f15663b.f15704g));
            int i18 = iTan3 / 3;
            int iTan4 = (int) (((double) i18) / Math.tan(d));
            path.lineTo(this.f15671j + i5 + iTan3, this.f15670i + i2);
            path.lineTo(this.f15671j + i5 + i18, ((this.f15670i + i2) + this.f15663b.f15704g) - iTan4);
            int i19 = this.f15671j;
            int i20 = this.f15670i;
            int i21 = this.f15663b.f15704g;
            path.quadTo(i5 + i19, i2 + i20 + i21, (i19 + i5) - i18, ((i20 + i2) + i21) - iTan4);
            path.lineTo((this.f15671j + i5) - iTan3, this.f15670i + i2);
            path.lineTo(this.f15663b.f15706i + i5, this.f15670i + i2);
        } else {
            path.lineTo(c4345a3.f15706i + i5, this.f15670i + i2);
        }
        float f2 = i5;
        int i22 = this.f15670i;
        int i23 = this.f15663b.f15706i;
        rectF.set(f2, (i2 + i22) - (i23 * 2), (i23 * 2) + i5, i22 + i2);
        path.arcTo(rectF, 90.0f, 90.0f, false);
        path.lineTo(f2, this.f15663b.f15706i + i2);
        int i24 = this.f15663b.f15706i;
        rectF.set(f2, f, (i24 * 2) + i5, i2 + (i24 * 2));
        path.arcTo(rectF, 180.0f, 90.0f, false);
        path.lineTo(this.f15663b.f15706i + i5, f);
        path.close();
        C4345a c4345a4 = this.f15663b;
        int[] iArr = c4345a4.f15698a;
        if (iArr.length >= 2) {
            if (c4345a4.f15721x) {
                this.f15662a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f15669h, 0.0f, this.f15663b.f15698a, (float[]) null, Shader.TileMode.MIRROR));
            } else {
                int i25 = c4345a4.f15699b;
                int i26 = C4345a.f15683Q;
                if ((i25 & i26) == i26) {
                    C4345a c4345a5 = this.f15663b;
                    int i27 = c4345a5.f15702e;
                    linearGradient = new LinearGradient(f2, i27, f2, (this.f15666e - i27) - c4345a5.f15704g, c4345a5.f15698a, (float[]) null, Shader.TileMode.MIRROR);
                } else {
                    C4345a c4345a6 = this.f15663b;
                    int i28 = c4345a6.f15702e;
                    linearGradient = new LinearGradient(f2, c4345a6.f15704g + i28, f2, this.f15666e - i28, c4345a6.f15698a, (float[]) null, Shader.TileMode.MIRROR);
                }
                this.f15662a.setShader(linearGradient);
            }
        } else if (iArr.length == 1) {
            this.f15662a.setColor(iArr[0]);
        } else {
            this.f15662a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f15669h, 0.0f, new int[]{-551629, -539853}, (float[]) null, Shader.TileMode.MIRROR));
        }
        this.f15662a.setShadowLayer(this.f15663b.f15702e, 0.0f, m20835j(2), this.f15663b.f15703f > 0 ? getContext().getResources().getColor(this.f15663b.f15703f) : 419430400);
        return path;
    }

    /* JADX INFO: renamed from: n */
    public final void m20839n() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f15662a = paint;
        paint.setAntiAlias(true);
        this.f15662a.setColor(-16711936);
        setLayerType(0, this.f15662a);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m20840o() {
        m20834i();
        C4348d.m20896l().m20900k(this.f15675n);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C4348d.m20896l().m20898i(this.f15675n, this.f15663b.f15711n);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        super.onDraw(canvas);
        if (this.f15663b == null || (path = this.f15664c) == null) {
            return;
        }
        canvas.drawPath(path, this.f15662a);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float[] fArrM20836k = m20836k();
        setPivotX(fArrM20836k[0]);
        setPivotY(fArrM20836k[1]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f15665d, this.f15666e);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m20841p(xee xeeVar, float f, float f2) {
        float f3 = f / 1000.0f;
        setScaleX(f3);
        setScaleY(f3);
    }

    /* JADX INFO: renamed from: q */
    public final void m20842q() {
        if (this.f15674m == null) {
            RunnableC4344a runnableC4344a = new RunnableC4344a();
            this.f15674m = runnableC4344a;
            postDelayed(runnableC4344a, this.f15663b.f15707j);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m20843r(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f15663b.f15720w.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        C4345a c4345a = this.f15663b;
        int i3 = c4345a.f15699b;
        int i4 = C4345a.f15683Q;
        if ((i3 & i4) == i4) {
            int i5 = c4345a.f15702e;
            layoutParams.topMargin = i5;
            layoutParams.leftMargin = i5 + this.f15676o;
        } else {
            int i6 = c4345a.f15702e;
            layoutParams.topMargin = c4345a.f15704g + i6;
            layoutParams.leftMargin = i6 + this.f15676o;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        c4345a.f15720w.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: s */
    public void m20844s(C4345a c4345a, Rect rect, int i, int i2, String str) {
        this.f15663b = c4345a;
        if (NullChecker.m81303a(c4345a.f15720w)) {
            ViewParent parent = this.f15663b.f15720w.getParent();
            if (NullChecker.m81303a(parent) && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f15663b.f15720w);
                CrashHelper.m81297d(new Exception("bubble customView hasParent = " + str), 10);
            }
            addView(this.f15663b.f15720w);
        }
        C4345a c4345a2 = this.f15663b;
        if (c4345a2 == null || !c4345a2.f15689E) {
            setOnClickListener(this);
        } else {
            setOnTouchListener(new View.OnTouchListener() { // from class: com.p1.mobile.android.ui.bubble.h
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return BubbleView.m20826a(view, motionEvent);
                }
            });
        }
        m20833h(rect, i, i2);
    }

    /* JADX INFO: renamed from: t */
    public void m20845t(String str) {
        this.f15675n = str;
        this.f15664c = m20838m();
        requestLayout();
        dqi dqiVar = new dqi(0.0f);
        kqf0 kqf0VarM208547j = new kqf0(dqiVar).m146943r(new vqf0().m199490d(0.61f).m199492f(600.0f)).m208547j(0.0f);
        kqf0VarM208547j.m208540b(new xee.InterfaceC21139r() { // from class: com.p1.mobile.android.ui.bubble.g
            @Override // p149l.xee.InterfaceC21139r
            /* JADX INFO: renamed from: a */
            public final void mo20888a(xee xeeVar, float f, float f2) {
                this.f15754a.m20841p(xeeVar, f, f2);
            }
        });
        kqf0VarM208547j.m208547j(0.0f).m146940o(1000.0f);
        if (this.f15663b.f15707j > 0) {
            m20842q();
        }
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleView(Context context) {
        this(context, null);
    }
}
