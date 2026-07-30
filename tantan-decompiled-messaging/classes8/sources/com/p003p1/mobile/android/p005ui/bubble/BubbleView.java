package com.p003p1.mobile.android.p005ui.bubble;

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
import com.p003p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.dqi;
import l.e30;
import l.kqf0;
import l.vqf0;
import l.xee;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
class BubbleView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Paint f1361a;

    /* JADX INFO: renamed from: b */
    public C0257a f1362b;

    /* JADX INFO: renamed from: c */
    public Path f1363c;

    /* JADX INFO: renamed from: d */
    public int f1364d;

    /* JADX INFO: renamed from: e */
    public int f1365e;

    /* JADX INFO: renamed from: f */
    public int f1366f;

    /* JADX INFO: renamed from: g */
    public int f1367g;

    /* JADX INFO: renamed from: h */
    public int f1368h;

    /* JADX INFO: renamed from: i */
    public int f1369i;

    /* JADX INFO: renamed from: j */
    public int f1370j;

    /* JADX INFO: renamed from: k */
    public int f1371k;

    /* JADX INFO: renamed from: l */
    public int f1372l;

    /* JADX INFO: renamed from: m */
    public RunnableC0256a f1373m;

    /* JADX INFO: renamed from: n */
    public String f1374n;

    /* JADX INFO: renamed from: o */
    public int f1375o;

    /* JADX INFO: renamed from: p */
    public int f1376p;

    /* JADX INFO: renamed from: q */
    public boolean f1377q;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.BubbleView$a */
    public class RunnableC0256a implements Runnable {
        public RunnableC0256a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0260d.m1167l().m1171k(BubbleView.this.f1374n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1364d = 0;
        this.f1365e = 0;
        m1110n();
        if (context instanceof Act) {
            ((Act) context).creates(new e30() { // from class: com.p1.mobile.android.ui.bubble.e
                public final void call(Object obj) {
                    BubbleView.m1098b((Bundle) obj);
                }
            }, new d30() { // from class: com.p1.mobile.android.ui.bubble.f
                public final void call() {
                    this.f1452a.m1111o();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m1097a(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1098b(Bundle bundle) {
    }

    /* JADX INFO: renamed from: f */
    public final void m1102f(Rect rect, int i, int i2, int i3, int i4) {
        this.f1375o = i3;
        this.f1376p = i4;
        m1103g(i, i2, i3, i4);
        int i5 = (rect.right + rect.left) / 2;
        int i6 = this.f1364d;
        this.f1371k = i5 - (i6 / 2);
        C0257a c0257a = this.f1362b;
        int i7 = c0257a.f1398b;
        int i8 = C0257a.f1379N;
        if ((i7 & i8) == i8) {
            this.f1372l = rect.bottom;
        } else {
            this.f1372l = rect.top - this.f1365e;
        }
        if (i5 > i / 2) {
            if ((i6 / 2) + i5 > i) {
                int i9 = c0257a.f1401e;
                int i10 = ((i5 - (i - i6)) - i9) - this.f1375o;
                this.f1370j = i10;
                this.f1370j = Math.min((i - i9) - c0257a.f1405i, i10);
                this.f1371k = i - this.f1364d;
            }
        } else if (i6 / 2 > i5) {
            int i11 = c0257a.f1401e;
            int i12 = (i5 - i11) - this.f1375o;
            this.f1370j = i12;
            this.f1370j = Math.max(i11 + c0257a.f1405i, i12);
            this.f1371k = 0;
        }
        this.f1377q = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m1103g(int i, int i2, int i3, int i4) {
        C0257a c0257a = this.f1362b;
        c0257a.f1419w.measure(View.MeasureSpec.makeMeasureSpec(((i - (c0257a.f1401e * 2)) - i3) - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        this.f1366f = this.f1362b.f1419w.getMeasuredWidth();
        int measuredHeight = this.f1362b.f1419w.getMeasuredHeight();
        this.f1367g = measuredHeight;
        m1114r(this.f1366f, measuredHeight);
        C0257a c0257a2 = this.f1362b;
        int i5 = c0257a2.f1401e;
        int i6 = this.f1367g;
        this.f1365e = (i5 * 2) + i6 + c0257a2.f1403g;
        int i7 = this.f1366f;
        this.f1364d = (i5 * 2) + i7 + i3 + i4;
        this.f1368h = i7;
        this.f1369i = i6;
        this.f1370j = i7 / 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX INFO: renamed from: h */
    public void m1104h(Rect rect, int i, int i2) {
        int i3;
        C0257a c0257a = this.f1362b;
        this.f1375o = c0257a.f1391H;
        this.f1376p = c0257a.f1392I;
        int i4 = (rect.right + rect.left) / 2;
        int i5 = c0257a.f1398b;
        double dTan = Math.tan(((((double) c0257a.f1404h) / 180.0d) * 3.141592653589793d) / 2.0d);
        C0257a c0257a2 = this.f1362b;
        int i6 = (int) (dTan * ((double) c0257a2.f1403g));
        int i7 = this.f1375o;
        int i8 = c0257a2.f1401e;
        int i9 = c0257a2.f1405i;
        if (i7 > ((i4 - i8) - i9) - i6) {
            this.f1375o = 0;
        }
        if (i4 + i6 + i8 + i9 > i) {
            this.f1376p = 0;
        }
        int i10 = C0257a.f1380O;
        if ((i5 & i10) == i10) {
            this.f1375o = 0;
            int i11 = c0257a2.f1418v + i9 + i8 + i6;
            int i12 = (rect.right + rect.left) / 2;
            if (i11 < i12) {
                i3 = i - (i12 - i11);
            } else {
                i3 = i;
            }
        } else {
            int i13 = C0257a.f1381P;
            if ((i5 & i13) == i13) {
                this.f1376p = 0;
                i3 = c0257a2.f1418v + i9 + i8 + i6 + ((rect.right + rect.left) / 2);
                if (i3 >= i) {
                    i3 = i;
                }
            } else {
                i3 = i;
            }
        }
        m1103g(i3, i2, this.f1375o, this.f1376p);
        int i14 = C0257a.f1380O;
        if ((i5 & i14) == i14) {
            C0257a c0257a3 = this.f1362b;
            int i15 = c0257a3.f1418v;
            int i16 = c0257a3.f1405i;
            int i17 = c0257a3.f1401e;
            int i18 = (((i4 - i6) - i15) - i16) - i17;
            this.f1371k = i18;
            int i19 = c0257a3.f1398b;
            int i20 = C0257a.f1379N;
            if ((i19 & i20) == i20) {
                this.f1372l = rect.bottom;
            } else {
                this.f1372l = rect.top - this.f1365e;
            }
            int i21 = i15 + i16 + i6;
            this.f1370j = i21;
            if (i18 + i17 + i21 != i4) {
                m1102f(rect, i, i2, 0, 0);
                return;
            }
            return;
        }
        int i22 = C0257a.f1381P;
        if ((i5 & i22) != i22) {
            m1102f(rect, i3, i2, this.f1375o, this.f1376p);
            return;
        }
        C0257a c0257a4 = this.f1362b;
        int i23 = c0257a4.f1418v;
        int i24 = c0257a4.f1405i;
        int i25 = c0257a4.f1401e;
        this.f1371k = ((((i4 - i6) - i23) - i24) - i25) - this.f1375o;
        int i26 = i23 + i24 + i25 + i6 + ((rect.right + rect.left) / 2);
        if (i26 > i3) {
            m1102f(rect, i3, i2, 0, 0);
            return;
        }
        int i27 = i26 - this.f1364d;
        this.f1371k = i27;
        int iMax = Math.max(0, i27);
        this.f1371k = iMax;
        C0257a c0257a5 = this.f1362b;
        int i28 = c0257a5.f1398b;
        int i29 = C0257a.f1379N;
        if ((i28 & i29) == i29) {
            this.f1372l = rect.bottom;
        } else {
            this.f1372l = rect.top - this.f1365e;
        }
        int i30 = ((this.f1368h - c0257a5.f1418v) - c0257a5.f1405i) - i6;
        this.f1370j = i30;
        if (iMax + c0257a5.f1401e + i30 + this.f1375o != i4) {
            m1102f(rect, i, i2, 0, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m1105i() {
        if (NullChecker.a(this.f1373m)) {
            removeCallbacks(this.f1373m);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m1106j(int i) {
        return (int) (getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: k */
    public float[] m1107k() {
        float[] fArr = new float[2];
        C0257a c0257a = this.f1362b;
        if (c0257a == null) {
            if (this.f1377q) {
                fArr[0] = this.f1370j;
            } else {
                fArr[0] = getWidth() / 2;
            }
            fArr[1] = getHeight();
            return fArr;
        }
        float f = (float) (((((double) c0257a.f1404h) / 180.0d) * 3.141592653589793d) / 2.0d);
        int i = c0257a.f1398b;
        int i2 = C0257a.f1379N;
        if ((i & i2) == i2) {
            fArr[1] = 0.0f;
            int i3 = C0257a.f1380O;
            if ((i & i3) == i3) {
                fArr[0] = c0257a.f1401e + this.f1375o + c0257a.f1405i + f;
                return fArr;
            }
            int i4 = C0257a.f1381P;
            if ((i & i4) == i4) {
                float width = getWidth();
                C0257a c0257a2 = this.f1362b;
                fArr[0] = width - (((c0257a2.f1401e + this.f1376p) + c0257a2.f1405i) + f);
                return fArr;
            }
            if (this.f1377q) {
                fArr[0] = this.f1370j;
                return fArr;
            }
            fArr[0] = getWidth() / 2;
            return fArr;
        }
        int i5 = C0257a.f1382Q;
        if ((i & i5) == i5) {
            fArr[1] = getHeight();
            C0257a c0257a3 = this.f1362b;
            int i6 = c0257a3.f1398b;
            int i7 = C0257a.f1380O;
            if ((i6 & i7) == i7) {
                fArr[0] = c0257a3.f1401e + this.f1375o + c0257a3.f1405i + f;
                return fArr;
            }
            int i8 = C0257a.f1381P;
            if ((i6 & i8) == i8) {
                float width2 = getWidth();
                C0257a c0257a4 = this.f1362b;
                fArr[0] = width2 - (((c0257a4.f1401e + this.f1376p) + c0257a4.f1405i) + f);
                return fArr;
            }
            if (this.f1377q) {
                fArr[0] = this.f1370j;
                return fArr;
            }
            fArr[0] = getWidth() / 2;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: l */
    public int[] m1108l() {
        return new int[]{this.f1371k, this.f1372l};
    }

    /* JADX INFO: renamed from: m */
    public final Path m1109m() {
        LinearGradient linearGradient;
        Path path = new Path();
        this.f1361a.setStyle(Paint.Style.FILL);
        C0257a c0257a = this.f1362b;
        int i = c0257a.f1401e;
        int i2 = c0257a.f1403g + i;
        int i3 = c0257a.f1398b;
        int i4 = C0257a.f1382Q;
        if ((i3 & i4) == i4) {
            i2 = i;
        }
        int i5 = i + this.f1375o;
        float f = i2;
        path.moveTo(c0257a.f1405i + i5, f);
        C0257a c0257a2 = this.f1362b;
        double d = ((((double) c0257a2.f1404h) / 180.0d) * 3.141592653589793d) / 2.0d;
        int i6 = c0257a2.f1398b;
        int i7 = C0257a.f1379N;
        if ((i6 & i7) == i7) {
            int iTan = (int) (Math.tan(d) * ((double) this.f1362b.f1403g));
            path.lineTo((this.f1370j + i5) - iTan, f);
            int i8 = iTan / 3;
            int iTan2 = (int) (((double) i8) / Math.tan(d));
            path.lineTo((this.f1370j + i5) - i8, (i2 - this.f1362b.f1403g) + iTan2);
            int i9 = this.f1370j;
            int i10 = this.f1362b.f1403g;
            path.quadTo(i5 + i9, i2 - i10, i9 + i5 + i8, (i2 - i10) + iTan2);
            path.lineTo(this.f1370j + i5 + iTan, f);
            path.lineTo((this.f1368h + i5) - this.f1362b.f1405i, f);
        } else {
            path.lineTo((this.f1368h + i5) - c0257a2.f1405i, f);
        }
        RectF rectF = new RectF();
        int i11 = this.f1368h;
        int i12 = this.f1362b.f1405i;
        rectF.set((i5 + i11) - (i12 * 2), f, i11 + i5, (i12 * 2) + i2);
        path.addArc(rectF, -90.0f, 90.0f);
        path.lineTo(this.f1368h + i5, (this.f1369i + i2) - this.f1362b.f1405i);
        int i13 = this.f1368h;
        int i14 = this.f1362b.f1405i;
        int i15 = this.f1369i;
        rectF.set((i5 + i13) - (i14 * 2), (i2 + i15) - (i14 * 2), i13 + i5, i15 + i2);
        path.arcTo(rectF, 0.0f, 90.0f, false);
        C0257a c0257a3 = this.f1362b;
        int i16 = c0257a3.f1398b;
        int i17 = C0257a.f1382Q;
        if ((i16 & i17) == i17) {
            int iTan3 = (int) (Math.tan(d) * ((double) this.f1362b.f1403g));
            int i18 = iTan3 / 3;
            int iTan4 = (int) (((double) i18) / Math.tan(d));
            path.lineTo(this.f1370j + i5 + iTan3, this.f1369i + i2);
            path.lineTo(this.f1370j + i5 + i18, ((this.f1369i + i2) + this.f1362b.f1403g) - iTan4);
            int i19 = this.f1370j;
            int i20 = this.f1369i;
            int i21 = this.f1362b.f1403g;
            path.quadTo(i5 + i19, i2 + i20 + i21, (i19 + i5) - i18, ((i20 + i2) + i21) - iTan4);
            path.lineTo((this.f1370j + i5) - iTan3, this.f1369i + i2);
            path.lineTo(this.f1362b.f1405i + i5, this.f1369i + i2);
        } else {
            path.lineTo(c0257a3.f1405i + i5, this.f1369i + i2);
        }
        float f2 = i5;
        int i22 = this.f1369i;
        int i23 = this.f1362b.f1405i;
        rectF.set(f2, (i2 + i22) - (i23 * 2), (i23 * 2) + i5, i22 + i2);
        path.arcTo(rectF, 90.0f, 90.0f, false);
        path.lineTo(f2, this.f1362b.f1405i + i2);
        int i24 = this.f1362b.f1405i;
        rectF.set(f2, f, (i24 * 2) + i5, i2 + (i24 * 2));
        path.arcTo(rectF, 180.0f, 90.0f, false);
        path.lineTo(this.f1362b.f1405i + i5, f);
        path.close();
        C0257a c0257a4 = this.f1362b;
        int[] iArr = c0257a4.f1397a;
        if (iArr.length >= 2) {
            if (c0257a4.f1420x) {
                this.f1361a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f1368h, 0.0f, this.f1362b.f1397a, (float[]) null, Shader.TileMode.MIRROR));
            } else {
                int i25 = c0257a4.f1398b;
                int i26 = C0257a.f1382Q;
                if ((i25 & i26) == i26) {
                    C0257a c0257a5 = this.f1362b;
                    int i27 = c0257a5.f1401e;
                    linearGradient = new LinearGradient(f2, i27, f2, (this.f1365e - i27) - c0257a5.f1403g, c0257a5.f1397a, (float[]) null, Shader.TileMode.MIRROR);
                } else {
                    C0257a c0257a6 = this.f1362b;
                    int i28 = c0257a6.f1401e;
                    linearGradient = new LinearGradient(f2, c0257a6.f1403g + i28, f2, this.f1365e - i28, c0257a6.f1397a, (float[]) null, Shader.TileMode.MIRROR);
                }
                this.f1361a.setShader(linearGradient);
            }
        } else if (iArr.length == 1) {
            this.f1361a.setColor(iArr[0]);
        } else {
            this.f1361a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f1368h, 0.0f, new int[]{-551629, -539853}, (float[]) null, Shader.TileMode.MIRROR));
        }
        this.f1361a.setShadowLayer(this.f1362b.f1401e, 0.0f, m1106j(2), this.f1362b.f1402f > 0 ? getContext().getResources().getColor(this.f1362b.f1402f) : 419430400);
        return path;
    }

    /* JADX INFO: renamed from: n */
    public final void m1110n() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f1361a = paint;
        paint.setAntiAlias(true);
        this.f1361a.setColor(-16711936);
        setLayerType(0, this.f1361a);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m1111o() {
        m1105i();
        C0260d.m1167l().m1171k(this.f1374n);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0260d.m1167l().m1169i(this.f1374n, this.f1362b.f1410n);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        super.onDraw(canvas);
        if (this.f1362b == null || (path = this.f1363c) == null) {
            return;
        }
        canvas.drawPath(path, this.f1361a);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float[] fArrM1107k = m1107k();
        setPivotX(fArrM1107k[0]);
        setPivotY(fArrM1107k[1]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f1364d, this.f1365e);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m1112p(xee xeeVar, float f, float f2) {
        float f3 = f / 1000.0f;
        setScaleX(f3);
        setScaleY(f3);
    }

    /* JADX INFO: renamed from: q */
    public final void m1113q() {
        if (this.f1373m == null) {
            RunnableC0256a runnableC0256a = new RunnableC0256a();
            this.f1373m = runnableC0256a;
            postDelayed(runnableC0256a, this.f1362b.f1406j);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1114r(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f1362b.f1419w.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        C0257a c0257a = this.f1362b;
        int i3 = c0257a.f1398b;
        int i4 = C0257a.f1382Q;
        if ((i3 & i4) == i4) {
            int i5 = c0257a.f1401e;
            layoutParams.topMargin = i5;
            layoutParams.leftMargin = i5 + this.f1375o;
        } else {
            int i6 = c0257a.f1401e;
            layoutParams.topMargin = c0257a.f1403g + i6;
            layoutParams.leftMargin = i6 + this.f1375o;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        c0257a.f1419w.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: s */
    public void m1115s(C0257a c0257a, Rect rect, int i, int i2, String str) {
        this.f1362b = c0257a;
        if (NullChecker.a(c0257a.f1419w)) {
            ViewParent parent = this.f1362b.f1419w.getParent();
            if (NullChecker.a(parent) && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f1362b.f1419w);
                CrashHelper.d(new Exception("bubble customView hasParent = " + str), 10);
            }
            addView(this.f1362b.f1419w);
        }
        C0257a c0257a2 = this.f1362b;
        if (c0257a2 == null || !c0257a2.f1388E) {
            setOnClickListener(this);
        } else {
            setOnTouchListener(new View.OnTouchListener() { // from class: com.p1.mobile.android.ui.bubble.h
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return BubbleView.m1097a(view, motionEvent);
                }
            });
        }
        m1104h(rect, i, i2);
    }

    /* JADX INFO: renamed from: t */
    public void m1116t(String str) {
        this.f1374n = str;
        this.f1363c = m1109m();
        requestLayout();
        dqi dqiVar = new dqi(0.0f);
        kqf0 kqf0VarJ = new kqf0(dqiVar).r(new vqf0().d(0.61f).f(600.0f)).j(0.0f);
        kqf0VarJ.b(new xee.r() { // from class: com.p1.mobile.android.ui.bubble.g
            /* JADX INFO: renamed from: a */
            public final void m1184a(xee xeeVar, float f, float f2) {
                this.f1453a.m1112p(xeeVar, f, f2);
            }
        });
        kqf0VarJ.j(0.0f).o(1000.0f);
        if (this.f1362b.f1406j > 0) {
            m1113q();
        }
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleView(Context context) {
        this(context, null);
    }
}
