package com.p046p1.mobile.putong.p065ui.guidetip;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.guidetip.GuideTipsView;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.e30;
import p149l.jtk;
import p149l.ptk;

/* JADX INFO: loaded from: classes11.dex */
public class GuideTipsView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Paint f54509a;

    /* JADX INFO: renamed from: b */
    public TextPaint f54510b;

    /* JADX INFO: renamed from: c */
    public jtk f54511c;

    /* JADX INFO: renamed from: d */
    public Path f54512d;

    /* JADX INFO: renamed from: e */
    public int f54513e;

    /* JADX INFO: renamed from: f */
    public int f54514f;

    /* JADX INFO: renamed from: g */
    public int f54515g;

    /* JADX INFO: renamed from: h */
    public int f54516h;

    /* JADX INFO: renamed from: i */
    public int f54517i;

    /* JADX INFO: renamed from: j */
    public int f54518j;

    /* JADX INFO: renamed from: k */
    public int f54519k;

    /* JADX INFO: renamed from: l */
    public int f54520l;

    /* JADX INFO: renamed from: m */
    public int f54521m;

    /* JADX INFO: renamed from: n */
    public RunnableC13112a f54522n;

    /* JADX INFO: renamed from: o */
    public String f54523o;

    /* JADX INFO: renamed from: p */
    public int f54524p;

    /* JADX INFO: renamed from: q */
    public int f54525q;

    /* JADX INFO: renamed from: r */
    public StaticLayout f54526r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.guidetip.GuideTipsView$a */
    public class RunnableC13112a implements Runnable {
        public RunnableC13112a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ptk.m171332h().m171334g(GuideTipsView.this.f54523o);
        }
    }

    public GuideTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54513e = 0;
        this.f54514f = 0;
        m79686k();
        if (context instanceof Act) {
            ((Act) context).creates(new e30() { // from class: l.qtk
                @Override // p149l.e30
                public final void call(Object obj) {
                    GuideTipsView.m79676a((Bundle) obj);
                }
            }, new d30() { // from class: l.rtk
                @Override // p149l.d30
                public final void call() {
                    this.f160970a.m79687l();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m79676a(Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    public final void m79679d(Rect rect, int i, int i2, int i3, int i4) {
        this.f54524p = i3;
        this.f54525q = i4;
        m79680e(i, i2, i3, i4);
        int i5 = (rect.right + rect.left) / 2;
        int i6 = this.f54513e;
        this.f54520l = i5 - (i6 / 2);
        jtk jtkVar = this.f54511c;
        int i7 = jtkVar.f119622d;
        int i8 = jtk.f119614A;
        if ((i7 & i8) == i8) {
            this.f54521m = rect.bottom;
        } else {
            this.f54521m = rect.top - this.f54514f;
        }
        if (i5 <= i / 2) {
            if (i6 / 2 > i5) {
                int i9 = jtkVar.f119629k;
                int i10 = (i5 - i9) - this.f54524p;
                this.f54519k = i10;
                this.f54519k = Math.max(i9 + jtkVar.f119632n, i10);
                this.f54520l = 0;
                return;
            }
            return;
        }
        if ((i6 / 2) + i5 > i) {
            int i11 = jtkVar.f119629k;
            int i12 = ((i5 - (i - i6)) - i11) - this.f54524p;
            this.f54519k = i12;
            this.f54519k = Math.min((i - i11) - jtkVar.f119632n, i12);
            this.f54520l = i - this.f54513e;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m79680e(int i, int i2, int i3, int i4) {
        jtk jtkVar = this.f54511c;
        View view = jtkVar.f119640v;
        if (view == null) {
            jtk jtkVar2 = this.f54511c;
            StaticLayout staticLayout = new StaticLayout(jtkVar2.f119619a, this.f54510b, ((((i - jtkVar2.f119625g) - jtkVar2.f119627i) - (jtkVar2.f119629k * 2)) - i3) - i4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f54516h = staticLayout.getHeight();
            this.f54515g = Math.min(this.f54515g, staticLayout.getWidth());
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(((((i - (jtkVar.f119629k * 2)) - jtkVar.f119625g) - jtkVar.f119627i) - i3) - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            this.f54515g = this.f54511c.f119640v.getMeasuredWidth();
            int measuredHeight = this.f54511c.f119640v.getMeasuredHeight();
            this.f54516h = measuredHeight;
            m79689n(this.f54515g, measuredHeight);
        }
        jtk jtkVar3 = this.f54511c;
        int i5 = jtkVar3.f119629k;
        int i6 = jtkVar3.f119626h;
        int i7 = jtkVar3.f119628j;
        int i8 = this.f54516h;
        this.f54514f = (i5 * 2) + i6 + i7 + i8 + jtkVar3.f119630l;
        int i9 = this.f54515g;
        int i10 = jtkVar3.f119625g;
        int i11 = jtkVar3.f119627i;
        this.f54513e = i9 + i10 + i11 + (i5 * 2) + i3 + i4;
        int i12 = i9 + i10 + i11;
        this.f54517i = i12;
        this.f54518j = i6 + i7 + i8;
        this.f54519k = i12 / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    /* JADX INFO: renamed from: f */
    public void m79681f(Rect rect, int i, int i2) {
        int i3;
        TextPaint textPaint = new TextPaint();
        this.f54510b = textPaint;
        textPaint.setColor(this.f54511c.f119638t);
        this.f54510b.setAntiAlias(true);
        this.f54510b.setTextSize(m79683h(this.f54511c.f119621c));
        this.f54510b.setTypeface(this.f54511c.f119637s ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        this.f54515g = m79684i(this.f54511c.f119619a);
        jtk jtkVar = this.f54511c;
        this.f54524p = jtkVar.f119643y;
        this.f54525q = jtkVar.f119644z;
        int i4 = (rect.right + rect.left) / 2;
        int i5 = jtkVar.f119622d;
        double dTan = Math.tan(((((double) jtkVar.f119631m) / 180.0d) * 3.141592653589793d) / 2.0d);
        jtk jtkVar2 = this.f54511c;
        int i6 = (int) (dTan * ((double) jtkVar2.f119630l));
        int i7 = this.f54524p;
        int i8 = jtkVar2.f119629k;
        int i9 = jtkVar2.f119632n;
        if (i7 > ((i4 - i8) - i9) - i6) {
            this.f54524p = 0;
        }
        if (i4 + i6 + i8 + i9 > i) {
            this.f54525q = 0;
        }
        int i10 = jtk.f119615B;
        if ((i5 & i10) == i10) {
            this.f54524p = 0;
            int i11 = jtkVar2.f119639u + i9 + i8 + i6;
            int i12 = (rect.right + rect.left) / 2;
            if (i11 < i12) {
                i3 = i - (i12 - i11);
            } else {
                i3 = i;
            }
        } else {
            int i13 = jtk.f119616C;
            if ((i5 & i13) == i13) {
                this.f54525q = 0;
                i3 = jtkVar2.f119639u + i9 + i8 + i6 + ((rect.right + rect.left) / 2);
                if (i3 >= i) {
                    i3 = i;
                }
            } else {
                i3 = i;
            }
        }
        m79680e(i3, i2, this.f54524p, this.f54525q);
        int i14 = jtk.f119615B;
        if ((i5 & i14) == i14) {
            jtk jtkVar3 = this.f54511c;
            int i15 = jtkVar3.f119639u;
            int i16 = jtkVar3.f119632n;
            int i17 = jtkVar3.f119629k;
            int i18 = (((i4 - i6) - i15) - i16) - i17;
            this.f54520l = i18;
            int i19 = jtkVar3.f119622d;
            int i20 = jtk.f119614A;
            if ((i19 & i20) == i20) {
                this.f54521m = rect.bottom;
            } else {
                this.f54521m = rect.top - this.f54514f;
            }
            int i21 = i15 + i16 + i6;
            this.f54519k = i21;
            if (i18 + i17 + i21 != i4 || i21 > this.f54517i - (i16 * 2)) {
                m79679d(rect, i, i2, 0, 0);
                return;
            }
            return;
        }
        int i22 = jtk.f119616C;
        if ((i5 & i22) != i22) {
            m79679d(rect, i3, i2, this.f54524p, this.f54525q);
            return;
        }
        jtk jtkVar4 = this.f54511c;
        int i23 = jtkVar4.f119639u;
        int i24 = jtkVar4.f119632n;
        int i25 = jtkVar4.f119629k;
        this.f54520l = ((((i4 - i6) - i23) - i24) - i25) - this.f54524p;
        int i26 = i23 + i24 + i25 + i6 + ((rect.right + rect.left) / 2);
        if (i26 > i3) {
            m79679d(rect, i3, i2, 0, 0);
            return;
        }
        int i27 = i26 - this.f54513e;
        this.f54520l = i27;
        int iMax = Math.max(0, i27);
        this.f54520l = iMax;
        jtk jtkVar5 = this.f54511c;
        int i28 = jtkVar5.f119622d;
        int i29 = jtk.f119614A;
        if ((i28 & i29) == i29) {
            this.f54521m = rect.bottom;
        } else {
            this.f54521m = rect.top - this.f54514f;
        }
        int i30 = this.f54517i;
        int i31 = i30 - jtkVar5.f119639u;
        int i32 = jtkVar5.f119632n;
        int i33 = (i31 - i32) - i6;
        this.f54519k = i33;
        if (iMax + jtkVar5.f119629k + i33 + this.f54524p != i4 || i33 > i30 - (i32 * 2)) {
            m79679d(rect, i, i2, 0, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m79682g() {
        if (NullChecker.m81303a(this.f54522n)) {
            removeCallbacks(this.f54522n);
        }
    }

    public int[] getShowPoint() {
        return new int[]{this.f54520l, this.f54521m};
    }

    public int getViewHeight() {
        return this.f54514f;
    }

    public int getViewWidth() {
        return this.f54513e;
    }

    /* JADX INFO: renamed from: h */
    public final int m79683h(int i) {
        return (int) (getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: i */
    public final int m79684i(String str) {
        TextPaint textPaint = this.f54510b;
        String str2 = this.f54511c.f119619a;
        int iMeasureText = (int) textPaint.measureText(str2, 0, str2.length());
        if (str.contains(SignParameters.NEW_LINE)) {
            String[] strArrSplit = str.split(SignParameters.NEW_LINE);
            if (NullChecker.m81304b(strArrSplit) && strArrSplit.length > 0) {
                int iMax = 0;
                for (String str3 : strArrSplit) {
                    iMax = Math.max(iMax, (int) this.f54510b.measureText(str3, 0, str3.length()));
                }
                return iMax;
            }
        }
        return iMeasureText;
    }

    /* JADX INFO: renamed from: j */
    public final Path m79685j() {
        LinearGradient linearGradient;
        Path path = new Path();
        this.f54509a.setStyle(Paint.Style.FILL);
        jtk jtkVar = this.f54511c;
        int i = jtkVar.f119629k;
        int i2 = jtkVar.f119630l + i;
        int i3 = jtkVar.f119622d;
        int i4 = jtk.f119617D;
        if ((i3 & i4) == i4) {
            i2 = i;
        }
        int i5 = i + this.f54524p;
        float f = i2;
        path.moveTo(jtkVar.f119632n + i5, f);
        jtk jtkVar2 = this.f54511c;
        double d = ((((double) jtkVar2.f119631m) / 180.0d) * 3.141592653589793d) / 2.0d;
        int i6 = jtkVar2.f119622d;
        int i7 = jtk.f119614A;
        if ((i6 & i7) == i7) {
            int iTan = (int) (Math.tan(d) * ((double) this.f54511c.f119630l));
            path.lineTo((this.f54519k + i5) - iTan, f);
            int i8 = iTan / 3;
            int iTan2 = (int) (((double) i8) / Math.tan(d));
            path.lineTo((this.f54519k + i5) - i8, (i2 - this.f54511c.f119630l) + iTan2);
            int i9 = this.f54519k;
            int i10 = this.f54511c.f119630l;
            path.quadTo(i5 + i9, i2 - i10, i9 + i5 + i8, (i2 - i10) + iTan2);
            path.lineTo(this.f54519k + i5 + iTan, f);
            path.lineTo((this.f54517i + i5) - this.f54511c.f119632n, f);
        } else {
            path.lineTo((this.f54517i + i5) - jtkVar2.f119632n, f);
        }
        RectF rectF = new RectF();
        int i11 = this.f54517i;
        int i12 = this.f54511c.f119632n;
        rectF.set((i5 + i11) - (i12 * 2), f, i11 + i5, (i12 * 2) + i2);
        path.addArc(rectF, -90.0f, 90.0f);
        path.lineTo(this.f54517i + i5, (this.f54518j + i2) - this.f54511c.f119632n);
        int i13 = this.f54517i;
        int i14 = this.f54511c.f119632n;
        int i15 = this.f54518j;
        rectF.set((i5 + i13) - (i14 * 2), (i2 + i15) - (i14 * 2), i13 + i5, i15 + i2);
        path.arcTo(rectF, 0.0f, 90.0f, false);
        jtk jtkVar3 = this.f54511c;
        int i16 = jtkVar3.f119622d;
        int i17 = jtk.f119617D;
        if ((i16 & i17) == i17) {
            int iTan3 = (int) (Math.tan(d) * ((double) this.f54511c.f119630l));
            int i18 = iTan3 / 3;
            int iTan4 = (int) (((double) i18) / Math.tan(d));
            path.lineTo(this.f54519k + i5 + iTan3, this.f54518j + i2);
            path.lineTo(this.f54519k + i5 + i18, ((this.f54518j + i2) + this.f54511c.f119630l) - iTan4);
            int i19 = this.f54519k;
            int i20 = this.f54518j;
            int i21 = this.f54511c.f119630l;
            path.quadTo(i5 + i19, i2 + i20 + i21, (i19 + i5) - i18, ((i20 + i2) + i21) - iTan4);
            path.lineTo((this.f54519k + i5) - iTan3, this.f54518j + i2);
            path.lineTo(this.f54511c.f119632n + i5, this.f54518j + i2);
        } else {
            path.lineTo(jtkVar3.f119632n + i5, this.f54518j + i2);
        }
        float f2 = i5;
        int i22 = this.f54518j;
        int i23 = this.f54511c.f119632n;
        rectF.set(f2, (i2 + i22) - (i23 * 2), (i23 * 2) + i5, i22 + i2);
        path.arcTo(rectF, 90.0f, 90.0f, false);
        path.lineTo(f2, this.f54511c.f119632n + i2);
        int i24 = this.f54511c.f119632n;
        rectF.set(f2, f, (i24 * 2) + i5, i2 + (i24 * 2));
        path.arcTo(rectF, 180.0f, 90.0f, false);
        path.lineTo(this.f54511c.f119632n + i5, f);
        path.close();
        jtk jtkVar4 = this.f54511c;
        int[] iArr = jtkVar4.f119620b;
        if (iArr.length >= 2) {
            if (jtkVar4.f119642x) {
                this.f54509a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f54517i, 0.0f, this.f54511c.f119620b, (float[]) null, Shader.TileMode.MIRROR));
            } else {
                int i25 = jtkVar4.f119622d;
                int i26 = jtk.f119617D;
                if ((i25 & i26) == i26) {
                    jtk jtkVar5 = this.f54511c;
                    int i27 = jtkVar5.f119629k;
                    linearGradient = new LinearGradient(f2, i27, f2, (this.f54514f - i27) - jtkVar5.f119630l, jtkVar5.f119620b, (float[]) null, Shader.TileMode.MIRROR);
                } else {
                    jtk jtkVar6 = this.f54511c;
                    int i28 = jtkVar6.f119629k;
                    linearGradient = new LinearGradient(f2, jtkVar6.f119630l + i28, f2, this.f54514f - i28, jtkVar6.f119620b, (float[]) null, Shader.TileMode.MIRROR);
                }
                this.f54509a.setShader(linearGradient);
            }
        } else if (iArr.length == 1) {
            this.f54509a.setColor(iArr[0]);
        } else {
            this.f54509a.setShader(new LinearGradient(f2, 0.0f, i5 + this.f54517i, 0.0f, new int[]{-551629, -539853}, (float[]) null, Shader.TileMode.MIRROR));
        }
        this.f54509a.setShadowLayer(this.f54511c.f119629k, 0.0f, m79683h(2), 419430400);
        return path;
    }

    /* JADX INFO: renamed from: k */
    public final void m79686k() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f54509a = paint;
        paint.setAntiAlias(true);
        this.f54509a.setColor(-16711936);
        setLayerType(0, this.f54509a);
        setOnClickListener(this);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m79687l() {
        m79682g();
        ptk.m171332h().m171334g(this.f54523o);
    }

    /* JADX INFO: renamed from: m */
    public final void m79688m() {
        if (this.f54522n == null) {
            RunnableC13112a runnableC13112a = new RunnableC13112a();
            this.f54522n = runnableC13112a;
            postDelayed(runnableC13112a, this.f54511c.f119633o);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m79689n(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54511c.f119640v.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        jtk jtkVar = this.f54511c;
        int i3 = jtkVar.f119622d;
        int i4 = jtk.f119617D;
        if ((i3 & i4) == i4) {
            int i5 = jtkVar.f119629k;
            layoutParams.topMargin = jtkVar.f119626h + i5;
            layoutParams.leftMargin = i5 + jtkVar.f119625g + this.f54524p;
        } else {
            int i6 = jtkVar.f119629k;
            layoutParams.topMargin = jtkVar.f119630l + i6 + jtkVar.f119626h;
            layoutParams.leftMargin = i6 + jtkVar.f119625g + this.f54524p;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        jtkVar.f119640v.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: o */
    public void m79690o(jtk jtkVar, Rect rect, int i, int i2) {
        this.f54511c = jtkVar;
        if (NullChecker.m81303a(jtkVar.f119640v)) {
            addView(this.f54511c.f119640v);
        }
        m79681f(rect, i, i2);
        if (this.f54511c.f119640v == null) {
            jtk jtkVar2 = this.f54511c;
            this.f54526r = new StaticLayout(jtkVar2.f119619a, this.f54510b, this.f54515g, jtkVar2.f119641w ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ptk.m171332h().m171333f(this.f54523o, this.f54511c.f119636r);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        super.onDraw(canvas);
        if (this.f54511c == null || (path = this.f54512d) == null) {
            return;
        }
        canvas.drawPath(path, this.f54509a);
        if (this.f54511c.f119640v == null && NullChecker.m81303a(this.f54526r)) {
            jtk jtkVar = this.f54511c;
            int i = jtkVar.f119629k;
            int i2 = jtkVar.f119630l + i;
            int i3 = jtkVar.f119622d;
            int i4 = jtk.f119617D;
            if ((i3 & i4) == i4) {
                i2 = i;
            }
            int i5 = i + this.f54524p;
            canvas.save();
            jtk jtkVar2 = this.f54511c;
            canvas.translate(i5 + jtkVar2.f119627i, i2 + jtkVar2.f119628j);
            this.f54526r.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f54513e, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f54514f, Integer.MIN_VALUE));
    }

    /* JADX INFO: renamed from: p */
    public void m79691p(String str) {
        this.f54523o = str;
        this.f54512d = m79685j();
        requestLayout();
        invalidate();
        if (this.f54511c.f119633o > 0) {
            m79688m();
        }
    }

    public GuideTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuideTipsView(Context context) {
        this(context, null);
    }
}
