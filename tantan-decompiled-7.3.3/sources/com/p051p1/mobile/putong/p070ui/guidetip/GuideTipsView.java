package com.p051p1.mobile.putong.p070ui.guidetip;

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
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.guidetip.GuideTipsView;
import com.tantanapp.common.utils.NullChecker;
import p153l.fwk;
import p153l.x20;
import p153l.y20;
import p153l.zvk;

/* JADX INFO: loaded from: classes10.dex */
public class GuideTipsView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Paint f55357a;

    /* JADX INFO: renamed from: b */
    public TextPaint f55358b;

    /* JADX INFO: renamed from: c */
    public zvk f55359c;

    /* JADX INFO: renamed from: d */
    public Path f55360d;

    /* JADX INFO: renamed from: e */
    public int f55361e;

    /* JADX INFO: renamed from: f */
    public int f55362f;

    /* JADX INFO: renamed from: g */
    public int f55363g;

    /* JADX INFO: renamed from: h */
    public int f55364h;

    /* JADX INFO: renamed from: i */
    public int f55365i;

    /* JADX INFO: renamed from: j */
    public int f55366j;

    /* JADX INFO: renamed from: k */
    public int f55367k;

    /* JADX INFO: renamed from: l */
    public int f55368l;

    /* JADX INFO: renamed from: m */
    public int f55369m;

    /* JADX INFO: renamed from: n */
    public RunnableC13275a f55370n;

    /* JADX INFO: renamed from: o */
    public String f55371o;

    /* JADX INFO: renamed from: p */
    public int f55372p;

    /* JADX INFO: renamed from: q */
    public int f55373q;

    /* JADX INFO: renamed from: r */
    public StaticLayout f55374r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.guidetip.GuideTipsView$a */
    public class RunnableC13275a implements Runnable {
        public RunnableC13275a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fwk.m127777h().m127779g(GuideTipsView.this.f55371o);
        }
    }

    public GuideTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55361e = 0;
        this.f55362f = 0;
        m80869k();
        if (context instanceof Act) {
            ((Act) context).creates(new y20() { // from class: l.gwk
                @Override // p153l.y20
                public final void call(Object obj) {
                    GuideTipsView.m80859a((Bundle) obj);
                }
            }, new x20() { // from class: l.hwk
                @Override // p153l.x20
                public final void call() {
                    this.f111897a.m80870l();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80859a(Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    public final void m80862d(Rect rect, int i, int i2, int i3, int i4) {
        this.f55372p = i3;
        this.f55373q = i4;
        m80863e(i, i2, i3, i4);
        int i5 = (rect.right + rect.left) / 2;
        int i6 = this.f55361e;
        this.f55368l = i5 - (i6 / 2);
        zvk zvkVar = this.f55359c;
        int i7 = zvkVar.f206232d;
        int i8 = zvk.f206224A;
        if ((i7 & i8) == i8) {
            this.f55369m = rect.bottom;
        } else {
            this.f55369m = rect.top - this.f55362f;
        }
        if (i5 <= i / 2) {
            if (i6 / 2 > i5) {
                int i9 = zvkVar.f206239k;
                int i10 = (i5 - i9) - this.f55372p;
                this.f55367k = i10;
                this.f55367k = Math.max(i9 + zvkVar.f206242n, i10);
                this.f55368l = 0;
                return;
            }
            return;
        }
        if ((i6 / 2) + i5 > i) {
            int i11 = zvkVar.f206239k;
            int i12 = ((i5 - (i - i6)) - i11) - this.f55372p;
            this.f55367k = i12;
            this.f55367k = Math.min((i - i11) - zvkVar.f206242n, i12);
            this.f55368l = i - this.f55361e;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m80863e(int i, int i2, int i3, int i4) {
        zvk zvkVar = this.f55359c;
        View view = zvkVar.f206250v;
        if (view == null) {
            zvk zvkVar2 = this.f55359c;
            StaticLayout staticLayout = new StaticLayout(zvkVar2.f206229a, this.f55358b, ((((i - zvkVar2.f206235g) - zvkVar2.f206237i) - (zvkVar2.f206239k * 2)) - i3) - i4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f55364h = staticLayout.getHeight();
            this.f55363g = Math.min(this.f55363g, staticLayout.getWidth());
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(((((i - (zvkVar.f206239k * 2)) - zvkVar.f206235g) - zvkVar.f206237i) - i3) - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            this.f55363g = this.f55359c.f206250v.getMeasuredWidth();
            int measuredHeight = this.f55359c.f206250v.getMeasuredHeight();
            this.f55364h = measuredHeight;
            m80872n(this.f55363g, measuredHeight);
        }
        zvk zvkVar3 = this.f55359c;
        int i5 = zvkVar3.f206239k;
        int i6 = zvkVar3.f206236h;
        int i7 = zvkVar3.f206238j;
        int i8 = this.f55364h;
        this.f55362f = (i5 * 2) + i6 + i7 + i8 + zvkVar3.f206240l;
        int i9 = this.f55363g;
        int i10 = zvkVar3.f206235g;
        int i11 = zvkVar3.f206237i;
        this.f55361e = i9 + i10 + i11 + (i5 * 2) + i3 + i4;
        int i12 = i9 + i10 + i11;
        this.f55365i = i12;
        this.f55366j = i6 + i7 + i8;
        this.f55367k = i12 / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    /* JADX INFO: renamed from: f */
    public void m80864f(Rect rect, int i, int i2) {
        int i3;
        TextPaint textPaint = new TextPaint();
        this.f55358b = textPaint;
        textPaint.setColor(this.f55359c.f206248t);
        this.f55358b.setAntiAlias(true);
        this.f55358b.setTextSize(m80866h(this.f55359c.f206231c));
        this.f55358b.setTypeface(this.f55359c.f206247s ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        this.f55363g = m80867i(this.f55359c.f206229a);
        zvk zvkVar = this.f55359c;
        this.f55372p = zvkVar.f206253y;
        this.f55373q = zvkVar.f206254z;
        int i4 = (rect.right + rect.left) / 2;
        int i5 = zvkVar.f206232d;
        double dTan = Math.tan(((((double) zvkVar.f206241m) / 180.0d) * 3.141592653589793d) / 2.0d);
        zvk zvkVar2 = this.f55359c;
        int i6 = (int) (dTan * ((double) zvkVar2.f206240l));
        int i7 = this.f55372p;
        int i8 = zvkVar2.f206239k;
        int i9 = zvkVar2.f206242n;
        if (i7 > ((i4 - i8) - i9) - i6) {
            this.f55372p = 0;
        }
        if (i4 + i6 + i8 + i9 > i) {
            this.f55373q = 0;
        }
        int i10 = zvk.f206225B;
        if ((i5 & i10) == i10) {
            this.f55372p = 0;
            int i11 = zvkVar2.f206249u + i9 + i8 + i6;
            int i12 = (rect.right + rect.left) / 2;
            if (i11 < i12) {
                i3 = i - (i12 - i11);
            } else {
                i3 = i;
            }
        } else {
            int i13 = zvk.f206226C;
            if ((i5 & i13) == i13) {
                this.f55373q = 0;
                i3 = zvkVar2.f206249u + i9 + i8 + i6 + ((rect.right + rect.left) / 2);
                if (i3 >= i) {
                    i3 = i;
                }
            } else {
                i3 = i;
            }
        }
        m80863e(i3, i2, this.f55372p, this.f55373q);
        int i14 = zvk.f206225B;
        if ((i5 & i14) == i14) {
            zvk zvkVar3 = this.f55359c;
            int i15 = zvkVar3.f206249u;
            int i16 = zvkVar3.f206242n;
            int i17 = zvkVar3.f206239k;
            int i18 = (((i4 - i6) - i15) - i16) - i17;
            this.f55368l = i18;
            int i19 = zvkVar3.f206232d;
            int i20 = zvk.f206224A;
            if ((i19 & i20) == i20) {
                this.f55369m = rect.bottom;
            } else {
                this.f55369m = rect.top - this.f55362f;
            }
            int i21 = i15 + i16 + i6;
            this.f55367k = i21;
            if (i18 + i17 + i21 != i4 || i21 > this.f55365i - (i16 * 2)) {
                m80862d(rect, i, i2, 0, 0);
                return;
            }
            return;
        }
        int i22 = zvk.f206226C;
        if ((i5 & i22) != i22) {
            m80862d(rect, i3, i2, this.f55372p, this.f55373q);
            return;
        }
        zvk zvkVar4 = this.f55359c;
        int i23 = zvkVar4.f206249u;
        int i24 = zvkVar4.f206242n;
        int i25 = zvkVar4.f206239k;
        this.f55368l = ((((i4 - i6) - i23) - i24) - i25) - this.f55372p;
        int i26 = i23 + i24 + i25 + i6 + ((rect.right + rect.left) / 2);
        if (i26 > i3) {
            m80862d(rect, i3, i2, 0, 0);
            return;
        }
        int i27 = i26 - this.f55361e;
        this.f55368l = i27;
        int iMax = Math.max(0, i27);
        this.f55368l = iMax;
        zvk zvkVar5 = this.f55359c;
        int i28 = zvkVar5.f206232d;
        int i29 = zvk.f206224A;
        if ((i28 & i29) == i29) {
            this.f55369m = rect.bottom;
        } else {
            this.f55369m = rect.top - this.f55362f;
        }
        int i30 = this.f55365i;
        int i31 = i30 - zvkVar5.f206249u;
        int i32 = zvkVar5.f206242n;
        int i33 = (i31 - i32) - i6;
        this.f55367k = i33;
        if (iMax + zvkVar5.f206239k + i33 + this.f55372p != i4 || i33 > i30 - (i32 * 2)) {
            m80862d(rect, i, i2, 0, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m80865g() {
        if (NullChecker.m82486a(this.f55370n)) {
            removeCallbacks(this.f55370n);
        }
    }

    public int[] getShowPoint() {
        return new int[]{this.f55368l, this.f55369m};
    }

    public int getViewHeight() {
        return this.f55362f;
    }

    public int getViewWidth() {
        return this.f55361e;
    }

    /* JADX INFO: renamed from: h */
    public final int m80866h(int i) {
        return (int) (getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: i */
    public final int m80867i(String str) {
        TextPaint textPaint = this.f55358b;
        String str2 = this.f55359c.f206229a;
        int iMeasureText = (int) textPaint.measureText(str2, 0, str2.length());
        if (str.contains(SignParameters.NEW_LINE)) {
            String[] strArrSplit = str.split(SignParameters.NEW_LINE);
            if (NullChecker.m82487b(strArrSplit) && strArrSplit.length > 0) {
                int iMax = 0;
                for (String str3 : strArrSplit) {
                    iMax = Math.max(iMax, (int) this.f55358b.measureText(str3, 0, str3.length()));
                }
                return iMax;
            }
        }
        return iMeasureText;
    }

    /* JADX INFO: renamed from: j */
    public final Path m80868j() {
        LinearGradient linearGradient;
        Path path = new Path();
        this.f55357a.setStyle(Paint.Style.FILL);
        zvk zvkVar = this.f55359c;
        int i = zvkVar.f206239k;
        int i2 = zvkVar.f206240l + i;
        int i3 = zvkVar.f206232d;
        int i4 = zvk.f206227D;
        if ((i3 & i4) == i4) {
            i2 = i;
        }
        int i5 = i + this.f55372p;
        float f = i2;
        path.moveTo(zvkVar.f206242n + i5, f);
        zvk zvkVar2 = this.f55359c;
        double d = ((((double) zvkVar2.f206241m) / 180.0d) * 3.141592653589793d) / 2.0d;
        int i6 = zvkVar2.f206232d;
        int i7 = zvk.f206224A;
        if ((i6 & i7) == i7) {
            int iTan = (int) (Math.tan(d) * ((double) this.f55359c.f206240l));
            path.lineTo((this.f55367k + i5) - iTan, f);
            int i8 = iTan / 3;
            int iTan2 = (int) (((double) i8) / Math.tan(d));
            path.lineTo((this.f55367k + i5) - i8, (i2 - this.f55359c.f206240l) + iTan2);
            int i9 = this.f55367k;
            int i10 = this.f55359c.f206240l;
            path.quadTo(i5 + i9, i2 - i10, i9 + i5 + i8, (i2 - i10) + iTan2);
            path.lineTo(this.f55367k + i5 + iTan, f);
            path.lineTo((this.f55365i + i5) - this.f55359c.f206242n, f);
        } else {
            path.lineTo((this.f55365i + i5) - zvkVar2.f206242n, f);
        }
        RectF rectF = new RectF();
        int i11 = this.f55365i;
        int i12 = this.f55359c.f206242n;
        rectF.set((i5 + i11) - (i12 * 2), f, i11 + i5, (i12 * 2) + i2);
        path.addArc(rectF, -90.0f, 90.0f);
        path.lineTo(this.f55365i + i5, (this.f55366j + i2) - this.f55359c.f206242n);
        int i13 = this.f55365i;
        int i14 = this.f55359c.f206242n;
        int i15 = this.f55366j;
        rectF.set((i5 + i13) - (i14 * 2), (i2 + i15) - (i14 * 2), i13 + i5, i15 + i2);
        path.arcTo(rectF, 0.0f, 90.0f, false);
        zvk zvkVar3 = this.f55359c;
        int i16 = zvkVar3.f206232d;
        int i17 = zvk.f206227D;
        if ((i16 & i17) == i17) {
            int iTan3 = (int) (Math.tan(d) * ((double) this.f55359c.f206240l));
            int i18 = iTan3 / 3;
            int iTan4 = (int) (((double) i18) / Math.tan(d));
            path.lineTo(this.f55367k + i5 + iTan3, this.f55366j + i2);
            path.lineTo(this.f55367k + i5 + i18, ((this.f55366j + i2) + this.f55359c.f206240l) - iTan4);
            int i19 = this.f55367k;
            int i20 = this.f55366j;
            int i21 = this.f55359c.f206240l;
            path.quadTo(i5 + i19, i2 + i20 + i21, (i19 + i5) - i18, ((i20 + i2) + i21) - iTan4);
            path.lineTo((this.f55367k + i5) - iTan3, this.f55366j + i2);
            path.lineTo(this.f55359c.f206242n + i5, this.f55366j + i2);
        } else {
            path.lineTo(zvkVar3.f206242n + i5, this.f55366j + i2);
        }
        float f2 = i5;
        int i22 = this.f55366j;
        int i23 = this.f55359c.f206242n;
        rectF.set(f2, (i2 + i22) - (i23 * 2), (i23 * 2) + i5, i22 + i2);
        path.arcTo(rectF, 90.0f, 90.0f, false);
        path.lineTo(f2, this.f55359c.f206242n + i2);
        int i24 = this.f55359c.f206242n;
        rectF.set(f2, f, (i24 * 2) + i5, i2 + (i24 * 2));
        path.arcTo(rectF, 180.0f, 90.0f, false);
        path.lineTo(this.f55359c.f206242n + i5, f);
        path.close();
        zvk zvkVar4 = this.f55359c;
        int[] iArr = zvkVar4.f206230b;
        if (iArr.length >= 2) {
            if (zvkVar4.f206252x) {
                this.f55357a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f55365i, 0.0f, this.f55359c.f206230b, (float[]) null, Shader.TileMode.MIRROR));
            } else {
                int i25 = zvkVar4.f206232d;
                int i26 = zvk.f206227D;
                if ((i25 & i26) == i26) {
                    zvk zvkVar5 = this.f55359c;
                    int i27 = zvkVar5.f206239k;
                    linearGradient = new LinearGradient(f2, i27, f2, (this.f55362f - i27) - zvkVar5.f206240l, zvkVar5.f206230b, (float[]) null, Shader.TileMode.MIRROR);
                } else {
                    zvk zvkVar6 = this.f55359c;
                    int i28 = zvkVar6.f206239k;
                    linearGradient = new LinearGradient(f2, zvkVar6.f206240l + i28, f2, this.f55362f - i28, zvkVar6.f206230b, (float[]) null, Shader.TileMode.MIRROR);
                }
                this.f55357a.setShader(linearGradient);
            }
        } else if (iArr.length == 1) {
            this.f55357a.setColor(iArr[0]);
        } else {
            this.f55357a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f55365i, 0.0f, new int[]{-551629, -539853}, (float[]) null, Shader.TileMode.MIRROR));
        }
        this.f55357a.setShadowLayer(this.f55359c.f206239k, 0.0f, m80866h(2), 419430400);
        return path;
    }

    /* JADX INFO: renamed from: k */
    public final void m80869k() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f55357a = paint;
        paint.setAntiAlias(true);
        this.f55357a.setColor(-16711936);
        setLayerType(0, this.f55357a);
        setOnClickListener(this);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m80870l() {
        m80865g();
        fwk.m127777h().m127779g(this.f55371o);
    }

    /* JADX INFO: renamed from: m */
    public final void m80871m() {
        if (this.f55370n == null) {
            RunnableC13275a runnableC13275a = new RunnableC13275a();
            this.f55370n = runnableC13275a;
            postDelayed(runnableC13275a, this.f55359c.f206243o);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m80872n(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f55359c.f206250v.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        zvk zvkVar = this.f55359c;
        int i3 = zvkVar.f206232d;
        int i4 = zvk.f206227D;
        if ((i3 & i4) == i4) {
            int i5 = zvkVar.f206239k;
            layoutParams.topMargin = zvkVar.f206236h + i5;
            layoutParams.leftMargin = i5 + zvkVar.f206235g + this.f55372p;
        } else {
            int i6 = zvkVar.f206239k;
            layoutParams.topMargin = zvkVar.f206240l + i6 + zvkVar.f206236h;
            layoutParams.leftMargin = i6 + zvkVar.f206235g + this.f55372p;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        zvkVar.f206250v.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: o */
    public void m80873o(zvk zvkVar, Rect rect, int i, int i2) {
        this.f55359c = zvkVar;
        if (NullChecker.m82486a(zvkVar.f206250v)) {
            addView(this.f55359c.f206250v);
        }
        m80864f(rect, i, i2);
        if (this.f55359c.f206250v == null) {
            zvk zvkVar2 = this.f55359c;
            this.f55374r = new StaticLayout(zvkVar2.f206229a, this.f55358b, this.f55363g, zvkVar2.f206251w ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        fwk.m127777h().m127778f(this.f55371o, this.f55359c.f206246r);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        super.onDraw(canvas);
        if (this.f55359c == null || (path = this.f55360d) == null) {
            return;
        }
        canvas.drawPath(path, this.f55357a);
        if (this.f55359c.f206250v == null && NullChecker.m82486a(this.f55374r)) {
            zvk zvkVar = this.f55359c;
            int i = zvkVar.f206239k;
            int i2 = zvkVar.f206240l + i;
            int i3 = zvkVar.f206232d;
            int i4 = zvk.f206227D;
            if ((i3 & i4) == i4) {
                i2 = i;
            }
            int i5 = i + this.f55372p;
            canvas.save();
            zvk zvkVar2 = this.f55359c;
            canvas.translate(i5 + zvkVar2.f206237i, i2 + zvkVar2.f206238j);
            this.f55374r.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f55361e, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f55362f, Integer.MIN_VALUE));
    }

    /* JADX INFO: renamed from: p */
    public void m80874p(String str) {
        this.f55371o = str;
        this.f55360d = m80868j();
        requestLayout();
        invalidate();
        if (this.f55359c.f206243o > 0) {
            m80871m();
        }
    }

    public GuideTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuideTipsView(Context context) {
        this(context, null);
    }
}
