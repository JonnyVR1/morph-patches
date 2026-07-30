package com.p000p1.mobile.putong.p004ui.guidetip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.p004ui.guidetip.GuideTipsView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import p009l.jtk;
import p009l.ptk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GuideTipsView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Paint f8115a;

    /* JADX INFO: renamed from: b */
    public TextPaint f8116b;

    /* JADX INFO: renamed from: c */
    public jtk f8117c;

    /* JADX INFO: renamed from: d */
    public Path f8118d;

    /* JADX INFO: renamed from: e */
    public int f8119e;

    /* JADX INFO: renamed from: f */
    public int f8120f;

    /* JADX INFO: renamed from: g */
    public int f8121g;

    /* JADX INFO: renamed from: h */
    public int f8122h;

    /* JADX INFO: renamed from: i */
    public int f8123i;

    /* JADX INFO: renamed from: j */
    public int f8124j;

    /* JADX INFO: renamed from: k */
    public int f8125k;

    /* JADX INFO: renamed from: l */
    public int f8126l;

    /* JADX INFO: renamed from: m */
    public int f8127m;

    /* JADX INFO: renamed from: n */
    public RunnableC0514a f8128n;

    /* JADX INFO: renamed from: o */
    public String f8129o;

    /* JADX INFO: renamed from: p */
    public int f8130p;

    /* JADX INFO: renamed from: q */
    public int f8131q;

    /* JADX INFO: renamed from: r */
    public StaticLayout f8132r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.guidetip.GuideTipsView$a */
    public class RunnableC0514a implements Runnable {
        public RunnableC0514a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ptk.m20688h().m20690g(GuideTipsView.this.f8129o);
        }
    }

    public GuideTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8119e = 0;
        this.f8120f = 0;
        m10007k();
        if (context instanceof Act) {
            ((Act) context).creates(new e30() { // from class: l.qtk
                public final void call(Object obj) {
                    GuideTipsView.m9997a((Bundle) obj);
                }
            }, new d30() { // from class: l.rtk
                public final void call() {
                    this.f19978a.m10008l();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9997a(Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    public final void m10000d(Rect rect, int i, int i2, int i3, int i4) {
        this.f8130p = i3;
        this.f8131q = i4;
        m10001e(i, i2, i3, i4);
        int i5 = (rect.right + rect.left) / 2;
        int i6 = this.f8119e;
        this.f8126l = i5 - (i6 / 2);
        jtk jtkVar = this.f8117c;
        int i7 = jtkVar.f15301d;
        int i8 = jtk.f15293A;
        if ((i7 & i8) == i8) {
            this.f8127m = rect.bottom;
        } else {
            this.f8127m = rect.top - this.f8120f;
        }
        if (i5 <= i / 2) {
            if (i6 / 2 > i5) {
                int i9 = jtkVar.f15308k;
                int i10 = (i5 - i9) - this.f8130p;
                this.f8125k = i10;
                this.f8125k = Math.max(i9 + jtkVar.f15311n, i10);
                this.f8126l = 0;
                return;
            }
            return;
        }
        if ((i6 / 2) + i5 > i) {
            int i11 = jtkVar.f15308k;
            int i12 = ((i5 - (i - i6)) - i11) - this.f8130p;
            this.f8125k = i12;
            this.f8125k = Math.min((i - i11) - jtkVar.f15311n, i12);
            this.f8126l = i - this.f8119e;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10001e(int i, int i2, int i3, int i4) {
        jtk jtkVar = this.f8117c;
        View view = jtkVar.f15319v;
        if (view == null) {
            jtk jtkVar2 = this.f8117c;
            StaticLayout staticLayout = new StaticLayout(jtkVar2.f15298a, this.f8116b, ((((i - jtkVar2.f15304g) - jtkVar2.f15306i) - (jtkVar2.f15308k * 2)) - i3) - i4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f8122h = staticLayout.getHeight();
            this.f8121g = Math.min(this.f8121g, staticLayout.getWidth());
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(((((i - (jtkVar.f15308k * 2)) - jtkVar.f15304g) - jtkVar.f15306i) - i3) - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            this.f8121g = this.f8117c.f15319v.getMeasuredWidth();
            int measuredHeight = this.f8117c.f15319v.getMeasuredHeight();
            this.f8122h = measuredHeight;
            m10010n(this.f8121g, measuredHeight);
        }
        jtk jtkVar3 = this.f8117c;
        int i5 = jtkVar3.f15308k;
        int i6 = jtkVar3.f15305h;
        int i7 = jtkVar3.f15307j;
        int i8 = this.f8122h;
        this.f8120f = (i5 * 2) + i6 + i7 + i8 + jtkVar3.f15309l;
        int i9 = this.f8121g;
        int i10 = jtkVar3.f15304g;
        int i11 = jtkVar3.f15306i;
        this.f8119e = i9 + i10 + i11 + (i5 * 2) + i3 + i4;
        int i12 = i9 + i10 + i11;
        this.f8123i = i12;
        this.f8124j = i6 + i7 + i8;
        this.f8125k = i12 / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    /* JADX INFO: renamed from: f */
    public void m10002f(Rect rect, int i, int i2) {
        int i3;
        TextPaint textPaint = new TextPaint();
        this.f8116b = textPaint;
        textPaint.setColor(this.f8117c.f15317t);
        this.f8116b.setAntiAlias(true);
        this.f8116b.setTextSize(m10004h(this.f8117c.f15300c));
        this.f8116b.setTypeface(this.f8117c.f15316s ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        this.f8121g = m10005i(this.f8117c.f15298a);
        jtk jtkVar = this.f8117c;
        this.f8130p = jtkVar.f15322y;
        this.f8131q = jtkVar.f15323z;
        int i4 = (rect.right + rect.left) / 2;
        int i5 = jtkVar.f15301d;
        double dTan = Math.tan(((((double) jtkVar.f15310m) / 180.0d) * 3.141592653589793d) / 2.0d);
        jtk jtkVar2 = this.f8117c;
        int i6 = (int) (dTan * ((double) jtkVar2.f15309l));
        int i7 = this.f8130p;
        int i8 = jtkVar2.f15308k;
        int i9 = jtkVar2.f15311n;
        if (i7 > ((i4 - i8) - i9) - i6) {
            this.f8130p = 0;
        }
        if (i4 + i6 + i8 + i9 > i) {
            this.f8131q = 0;
        }
        int i10 = jtk.f15294B;
        if ((i5 & i10) == i10) {
            this.f8130p = 0;
            int i11 = jtkVar2.f15318u + i9 + i8 + i6;
            int i12 = (rect.right + rect.left) / 2;
            if (i11 < i12) {
                i3 = i - (i12 - i11);
            } else {
                i3 = i;
            }
        } else {
            int i13 = jtk.f15295C;
            if ((i5 & i13) == i13) {
                this.f8131q = 0;
                i3 = jtkVar2.f15318u + i9 + i8 + i6 + ((rect.right + rect.left) / 2);
                if (i3 >= i) {
                    i3 = i;
                }
            } else {
                i3 = i;
            }
        }
        m10001e(i3, i2, this.f8130p, this.f8131q);
        int i14 = jtk.f15294B;
        if ((i5 & i14) == i14) {
            jtk jtkVar3 = this.f8117c;
            int i15 = jtkVar3.f15318u;
            int i16 = jtkVar3.f15311n;
            int i17 = jtkVar3.f15308k;
            int i18 = (((i4 - i6) - i15) - i16) - i17;
            this.f8126l = i18;
            int i19 = jtkVar3.f15301d;
            int i20 = jtk.f15293A;
            if ((i19 & i20) == i20) {
                this.f8127m = rect.bottom;
            } else {
                this.f8127m = rect.top - this.f8120f;
            }
            int i21 = i15 + i16 + i6;
            this.f8125k = i21;
            if (i18 + i17 + i21 != i4 || i21 > this.f8123i - (i16 * 2)) {
                m10000d(rect, i, i2, 0, 0);
                return;
            }
            return;
        }
        int i22 = jtk.f15295C;
        if ((i5 & i22) != i22) {
            m10000d(rect, i3, i2, this.f8130p, this.f8131q);
            return;
        }
        jtk jtkVar4 = this.f8117c;
        int i23 = jtkVar4.f15318u;
        int i24 = jtkVar4.f15311n;
        int i25 = jtkVar4.f15308k;
        this.f8126l = ((((i4 - i6) - i23) - i24) - i25) - this.f8130p;
        int i26 = i23 + i24 + i25 + i6 + ((rect.right + rect.left) / 2);
        if (i26 > i3) {
            m10000d(rect, i3, i2, 0, 0);
            return;
        }
        int i27 = i26 - this.f8119e;
        this.f8126l = i27;
        int iMax = Math.max(0, i27);
        this.f8126l = iMax;
        jtk jtkVar5 = this.f8117c;
        int i28 = jtkVar5.f15301d;
        int i29 = jtk.f15293A;
        if ((i28 & i29) == i29) {
            this.f8127m = rect.bottom;
        } else {
            this.f8127m = rect.top - this.f8120f;
        }
        int i30 = this.f8123i;
        int i31 = i30 - jtkVar5.f15318u;
        int i32 = jtkVar5.f15311n;
        int i33 = (i31 - i32) - i6;
        this.f8125k = i33;
        if (iMax + jtkVar5.f15308k + i33 + this.f8130p != i4 || i33 > i30 - (i32 * 2)) {
            m10000d(rect, i, i2, 0, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10003g() {
        if (NullChecker.a(this.f8128n)) {
            removeCallbacks(this.f8128n);
        }
    }

    public int[] getShowPoint() {
        return new int[]{this.f8126l, this.f8127m};
    }

    public int getViewHeight() {
        return this.f8120f;
    }

    public int getViewWidth() {
        return this.f8119e;
    }

    /* JADX INFO: renamed from: h */
    public final int m10004h(int i) {
        return (int) (getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: i */
    public final int m10005i(String str) {
        TextPaint textPaint = this.f8116b;
        String str2 = this.f8117c.f15298a;
        int iMeasureText = (int) textPaint.measureText(str2, 0, str2.length());
        if (str.contains("\n")) {
            String[] strArrSplit = str.split("\n");
            if (NullChecker.b(strArrSplit) && strArrSplit.length > 0) {
                int iMax = 0;
                for (String str3 : strArrSplit) {
                    iMax = Math.max(iMax, (int) this.f8116b.measureText(str3, 0, str3.length()));
                }
                return iMax;
            }
        }
        return iMeasureText;
    }

    /* JADX INFO: renamed from: j */
    public final Path m10006j() {
        LinearGradient linearGradient;
        Path path = new Path();
        this.f8115a.setStyle(Paint.Style.FILL);
        jtk jtkVar = this.f8117c;
        int i = jtkVar.f15308k;
        int i2 = jtkVar.f15309l + i;
        int i3 = jtkVar.f15301d;
        int i4 = jtk.f15296D;
        if ((i3 & i4) == i4) {
            i2 = i;
        }
        int i5 = i + this.f8130p;
        float f = i2;
        path.moveTo(jtkVar.f15311n + i5, f);
        jtk jtkVar2 = this.f8117c;
        double d = ((((double) jtkVar2.f15310m) / 180.0d) * 3.141592653589793d) / 2.0d;
        int i6 = jtkVar2.f15301d;
        int i7 = jtk.f15293A;
        if ((i6 & i7) == i7) {
            int iTan = (int) (Math.tan(d) * ((double) this.f8117c.f15309l));
            path.lineTo((this.f8125k + i5) - iTan, f);
            int i8 = iTan / 3;
            int iTan2 = (int) (((double) i8) / Math.tan(d));
            path.lineTo((this.f8125k + i5) - i8, (i2 - this.f8117c.f15309l) + iTan2);
            int i9 = this.f8125k;
            int i10 = this.f8117c.f15309l;
            path.quadTo(i5 + i9, i2 - i10, i9 + i5 + i8, (i2 - i10) + iTan2);
            path.lineTo(this.f8125k + i5 + iTan, f);
            path.lineTo((this.f8123i + i5) - this.f8117c.f15311n, f);
        } else {
            path.lineTo((this.f8123i + i5) - jtkVar2.f15311n, f);
        }
        RectF rectF = new RectF();
        int i11 = this.f8123i;
        int i12 = this.f8117c.f15311n;
        rectF.set((i5 + i11) - (i12 * 2), f, i11 + i5, (i12 * 2) + i2);
        path.addArc(rectF, -90.0f, 90.0f);
        path.lineTo(this.f8123i + i5, (this.f8124j + i2) - this.f8117c.f15311n);
        int i13 = this.f8123i;
        int i14 = this.f8117c.f15311n;
        int i15 = this.f8124j;
        rectF.set((i5 + i13) - (i14 * 2), (i2 + i15) - (i14 * 2), i13 + i5, i15 + i2);
        path.arcTo(rectF, 0.0f, 90.0f, false);
        jtk jtkVar3 = this.f8117c;
        int i16 = jtkVar3.f15301d;
        int i17 = jtk.f15296D;
        if ((i16 & i17) == i17) {
            int iTan3 = (int) (Math.tan(d) * ((double) this.f8117c.f15309l));
            int i18 = iTan3 / 3;
            int iTan4 = (int) (((double) i18) / Math.tan(d));
            path.lineTo(this.f8125k + i5 + iTan3, this.f8124j + i2);
            path.lineTo(this.f8125k + i5 + i18, ((this.f8124j + i2) + this.f8117c.f15309l) - iTan4);
            int i19 = this.f8125k;
            int i20 = this.f8124j;
            int i21 = this.f8117c.f15309l;
            path.quadTo(i5 + i19, i2 + i20 + i21, (i19 + i5) - i18, ((i20 + i2) + i21) - iTan4);
            path.lineTo((this.f8125k + i5) - iTan3, this.f8124j + i2);
            path.lineTo(this.f8117c.f15311n + i5, this.f8124j + i2);
        } else {
            path.lineTo(jtkVar3.f15311n + i5, this.f8124j + i2);
        }
        float f2 = i5;
        int i22 = this.f8124j;
        int i23 = this.f8117c.f15311n;
        rectF.set(f2, (i2 + i22) - (i23 * 2), (i23 * 2) + i5, i22 + i2);
        path.arcTo(rectF, 90.0f, 90.0f, false);
        path.lineTo(f2, this.f8117c.f15311n + i2);
        int i24 = this.f8117c.f15311n;
        rectF.set(f2, f, (i24 * 2) + i5, i2 + (i24 * 2));
        path.arcTo(rectF, 180.0f, 90.0f, false);
        path.lineTo(this.f8117c.f15311n + i5, f);
        path.close();
        jtk jtkVar4 = this.f8117c;
        int[] iArr = jtkVar4.f15299b;
        if (iArr.length >= 2) {
            if (jtkVar4.f15321x) {
                this.f8115a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f8123i, 0.0f, this.f8117c.f15299b, (float[]) null, Shader.TileMode.MIRROR));
            } else {
                int i25 = jtkVar4.f15301d;
                int i26 = jtk.f15296D;
                if ((i25 & i26) == i26) {
                    jtk jtkVar5 = this.f8117c;
                    int i27 = jtkVar5.f15308k;
                    linearGradient = new LinearGradient(f2, i27, f2, (this.f8120f - i27) - jtkVar5.f15309l, jtkVar5.f15299b, (float[]) null, Shader.TileMode.MIRROR);
                } else {
                    jtk jtkVar6 = this.f8117c;
                    int i28 = jtkVar6.f15308k;
                    linearGradient = new LinearGradient(f2, jtkVar6.f15309l + i28, f2, this.f8120f - i28, jtkVar6.f15299b, (float[]) null, Shader.TileMode.MIRROR);
                }
                this.f8115a.setShader(linearGradient);
            }
        } else if (iArr.length == 1) {
            this.f8115a.setColor(iArr[0]);
        } else {
            this.f8115a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f8123i, 0.0f, new int[]{-551629, -539853}, (float[]) null, Shader.TileMode.MIRROR));
        }
        this.f8115a.setShadowLayer(this.f8117c.f15308k, 0.0f, m10004h(2), 419430400);
        return path;
    }

    /* JADX INFO: renamed from: k */
    public final void m10007k() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f8115a = paint;
        paint.setAntiAlias(true);
        this.f8115a.setColor(-16711936);
        setLayerType(0, this.f8115a);
        setOnClickListener(this);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m10008l() {
        m10003g();
        ptk.m20688h().m20690g(this.f8129o);
    }

    /* JADX INFO: renamed from: m */
    public final void m10009m() {
        if (this.f8128n == null) {
            RunnableC0514a runnableC0514a = new RunnableC0514a();
            this.f8128n = runnableC0514a;
            postDelayed(runnableC0514a, this.f8117c.f15312o);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m10010n(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8117c.f15319v.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        jtk jtkVar = this.f8117c;
        int i3 = jtkVar.f15301d;
        int i4 = jtk.f15296D;
        if ((i3 & i4) == i4) {
            int i5 = jtkVar.f15308k;
            layoutParams.topMargin = jtkVar.f15305h + i5;
            layoutParams.leftMargin = i5 + jtkVar.f15304g + this.f8130p;
        } else {
            int i6 = jtkVar.f15308k;
            layoutParams.topMargin = jtkVar.f15309l + i6 + jtkVar.f15305h;
            layoutParams.leftMargin = i6 + jtkVar.f15304g + this.f8130p;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        jtkVar.f15319v.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: o */
    public void m10011o(jtk jtkVar, Rect rect, int i, int i2) {
        this.f8117c = jtkVar;
        if (NullChecker.a(jtkVar.f15319v)) {
            addView(this.f8117c.f15319v);
        }
        m10002f(rect, i, i2);
        if (this.f8117c.f15319v == null) {
            jtk jtkVar2 = this.f8117c;
            this.f8132r = new StaticLayout(jtkVar2.f15298a, this.f8116b, this.f8121g, jtkVar2.f15320w ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ptk.m20688h().m20689f(this.f8129o, this.f8117c.f15315r);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        super.onDraw(canvas);
        if (this.f8117c == null || (path = this.f8118d) == null) {
            return;
        }
        canvas.drawPath(path, this.f8115a);
        if (this.f8117c.f15319v == null && NullChecker.a(this.f8132r)) {
            jtk jtkVar = this.f8117c;
            int i = jtkVar.f15308k;
            int i2 = jtkVar.f15309l + i;
            int i3 = jtkVar.f15301d;
            int i4 = jtk.f15296D;
            if ((i3 & i4) == i4) {
                i2 = i;
            }
            int i5 = i + this.f8130p;
            canvas.save();
            jtk jtkVar2 = this.f8117c;
            canvas.translate(i5 + jtkVar2.f15306i, i2 + jtkVar2.f15307j);
            this.f8132r.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f8119e, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f8120f, Integer.MIN_VALUE));
    }

    /* JADX INFO: renamed from: p */
    public void m10012p(String str) {
        this.f8129o = str;
        this.f8118d = m10006j();
        requestLayout();
        invalidate();
        if (this.f8117c.f15312o > 0) {
            m10009m();
        }
    }

    public GuideTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuideTipsView(Context context) {
        this(context, null);
    }
}
