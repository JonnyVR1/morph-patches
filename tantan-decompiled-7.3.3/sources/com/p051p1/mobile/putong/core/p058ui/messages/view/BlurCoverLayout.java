package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.BlurCoverLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p153l.kcg0;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.t43;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class BlurCoverLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Bitmap f33151a;

    /* JADX INFO: renamed from: b */
    public Bitmap f33152b;

    /* JADX INFO: renamed from: c */
    public int f33153c;

    /* JADX INFO: renamed from: d */
    public int f33154d;

    /* JADX INFO: renamed from: e */
    public float f33155e;

    /* JADX INFO: renamed from: f */
    public Matrix f33156f;

    /* JADX INFO: renamed from: g */
    public Paint f33157g;

    /* JADX INFO: renamed from: h */
    public Canvas f33158h;

    /* JADX INFO: renamed from: i */
    public boolean f33159i;

    /* JADX INFO: renamed from: j */
    public Rect f33160j;

    /* JADX INFO: renamed from: k */
    public RectF f33161k;

    /* JADX INFO: renamed from: l */
    public kcg0 f33162l;

    /* JADX INFO: renamed from: m */
    public int f33163m;

    /* JADX INFO: renamed from: n */
    public String f33164n;

    public BlurCoverLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33155e = 0.1f;
        this.f33159i = false;
        this.f33163m = 0;
        this.f33164n = "";
        Matrix matrix = new Matrix();
        this.f33156f = matrix;
        float f = this.f33155e;
        matrix.setScale(f, f);
        Paint paint = new Paint();
        this.f33157g = paint;
        paint.setAntiAlias(true);
        this.f33157g.setFilterBitmap(true);
        this.f33160j = new Rect(0, 0, 0, 0);
        this.f33161k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ pf60 m50968c(pf60 pf60Var) {
        t43.m189143a((Bitmap) pf60Var.f152156a, 5, false);
        return pf60Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m50969d(final String str) {
        this.f33162l = C22421c.fromCallable(new Callable() { // from class: l.u43
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f177427a.m50971f(str);
            }
        }).map(new qcj() { // from class: l.v43
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return BlurCoverLayout.m50968c((pf60) obj);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.w43
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187223a.m50972g((pf60) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!NullChecker.m82486a(this.f33151a) || !this.f33159i) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f33163m != 2) {
            this.f33158h.drawColor(-1);
            super.dispatchDraw(this.f33158h);
            psd0.m173633z(this.f33162l);
            m50969d(this.f33164n);
        }
        if (this.f33163m == 2) {
            this.f33163m = 0;
        }
        canvas.drawBitmap(this.f33152b, this.f33160j, this.f33161k, this.f33157g);
        this.f33163m = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m50970e(int i, int i2) {
        this.f33153c = i;
        this.f33154d = i2;
        float f = i;
        float f2 = this.f33155e;
        int i3 = (int) (f * f2);
        float f3 = i2;
        int i4 = (int) (f2 * f3);
        int i5 = i3 - (i3 % 4);
        int i6 = i4 - (i4 % 4);
        if (i5 <= 0 || i6 <= 0) {
            CrashHelper.m82479c(new IllegalArgumentException("BlurCoverLayout w = " + i + "  h = " + i2 + "  scale = " + this.f33155e));
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f33151a = Bitmap.createBitmap(i5, i6, config);
        this.f33152b = Bitmap.createBitmap(i5, i6, config);
        Canvas canvas = new Canvas(this.f33151a);
        this.f33158h = canvas;
        canvas.setMatrix(this.f33156f);
        this.f33160j.set(0, 0, i5, i6);
        this.f33161k.set(0.0f, 0.0f, f, f3);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ pf60 m50971f(String str) throws Exception {
        return new pf60(this.f33151a.copy(Bitmap.Config.ARGB_8888, true), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m50972g(pf60 pf60Var) {
        if (!TextUtils.equals((CharSequence) pf60Var.f152157b, this.f33164n)) {
            this.f33163m = 0;
            postInvalidate();
        } else {
            this.f33163m = 2;
            this.f33152b = ((Bitmap) pf60Var.f152156a).copy(Bitmap.Config.ARGB_8888, true);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m50973h(boolean z, String str) {
        if (z && NullChecker.m82486a(this.f33152b) && this.f33153c > 0 && this.f33154d > 0 && !TextUtils.equals(this.f33164n, str)) {
            float f = this.f33153c;
            float f2 = this.f33155e;
            int i = (int) (f * f2);
            int i2 = (int) (this.f33154d * f2);
            this.f33152b = Bitmap.createBitmap(i - (i % 4), i2 - (i2 % 4), Bitmap.Config.ARGB_8888);
        }
        this.f33164n = str;
        this.f33163m = 0;
        if (z != this.f33159i) {
            this.f33159i = z;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f33159i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0) {
            return;
        }
        if (size == this.f33153c && size2 == this.f33154d) {
            return;
        }
        m50970e(size, size2);
    }

    public BlurCoverLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlurCoverLayout(Context context) {
        this(context, null);
    }
}
