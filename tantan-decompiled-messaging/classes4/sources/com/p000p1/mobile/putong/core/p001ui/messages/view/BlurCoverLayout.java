package com.p000p1.mobile.putong.core.p001ui.messages.view;

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
import com.p000p1.mobile.putong.core.p001ui.messages.view.BlurCoverLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import l.c4g0;
import l.d43;
import l.e30;
import l.j760;
import l.mkd0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BlurCoverLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Bitmap f125a;

    /* JADX INFO: renamed from: b */
    public Bitmap f126b;

    /* JADX INFO: renamed from: c */
    public int f127c;

    /* JADX INFO: renamed from: d */
    public int f128d;

    /* JADX INFO: renamed from: e */
    public float f129e;

    /* JADX INFO: renamed from: f */
    public Matrix f130f;

    /* JADX INFO: renamed from: g */
    public Paint f131g;

    /* JADX INFO: renamed from: h */
    public Canvas f132h;

    /* JADX INFO: renamed from: i */
    public boolean f133i;

    /* JADX INFO: renamed from: j */
    public Rect f134j;

    /* JADX INFO: renamed from: k */
    public RectF f135k;

    /* JADX INFO: renamed from: l */
    public c4g0 f136l;

    /* JADX INFO: renamed from: m */
    public int f137m;

    /* JADX INFO: renamed from: n */
    public String f138n;

    public BlurCoverLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f129e = 0.1f;
        this.f133i = false;
        this.f137m = 0;
        this.f138n = "";
        Matrix matrix = new Matrix();
        this.f130f = matrix;
        float f = this.f129e;
        matrix.setScale(f, f);
        Paint paint = new Paint();
        this.f131g = paint;
        paint.setAntiAlias(true);
        this.f131g.setFilterBitmap(true);
        this.f134j = new Rect(0, 0, 0, 0);
        this.f135k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ j760 m203c(j760 j760Var) {
        d43.a((Bitmap) j760Var.a, 5, false);
        return j760Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m204d(final String str) {
        this.f136l = c.fromCallable(new Callable() { // from class: l.e43
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9565a.m206f(str);
            }
        }).map(new w9j() { // from class: l.f43
            public final Object call(Object obj) {
                return BlurCoverLayout.m203c((j760) obj);
            }
        }).compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.g43
            public final void call(Object obj) {
                this.f10765a.m207g((j760) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!NullChecker.a(this.f125a) || !this.f133i) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f137m != 2) {
            this.f132h.drawColor(-1);
            super.dispatchDraw(this.f132h);
            mkd0.z(this.f136l);
            m204d(this.f138n);
        }
        if (this.f137m == 2) {
            this.f137m = 0;
        }
        canvas.drawBitmap(this.f126b, this.f134j, this.f135k, this.f131g);
        this.f137m = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m205e(int i, int i2) {
        this.f127c = i;
        this.f128d = i2;
        float f = i;
        float f2 = this.f129e;
        int i3 = (int) (f * f2);
        float f3 = i2;
        int i4 = (int) (f2 * f3);
        int i5 = i3 - (i3 % 4);
        int i6 = i4 - (i4 % 4);
        if (i5 <= 0 || i6 <= 0) {
            CrashHelper.c(new IllegalArgumentException("BlurCoverLayout w = " + i + "  h = " + i2 + "  scale = " + this.f129e));
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f125a = Bitmap.createBitmap(i5, i6, config);
        this.f126b = Bitmap.createBitmap(i5, i6, config);
        Canvas canvas = new Canvas(this.f125a);
        this.f132h = canvas;
        canvas.setMatrix(this.f130f);
        this.f134j.set(0, 0, i5, i6);
        this.f135k.set(0.0f, 0.0f, f, f3);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ j760 m206f(String str) throws Exception {
        return new j760(this.f125a.copy(Bitmap.Config.ARGB_8888, true), str);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m207g(j760 j760Var) {
        if (!TextUtils.equals((CharSequence) j760Var.b, this.f138n)) {
            this.f137m = 0;
            postInvalidate();
        } else {
            this.f137m = 2;
            this.f126b = ((Bitmap) j760Var.a).copy(Bitmap.Config.ARGB_8888, true);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m208h(boolean z, String str) {
        if (z && NullChecker.a(this.f126b) && this.f127c > 0 && this.f128d > 0 && !TextUtils.equals(this.f138n, str)) {
            float f = this.f127c;
            float f2 = this.f129e;
            int i = (int) (f * f2);
            int i2 = (int) (this.f128d * f2);
            this.f126b = Bitmap.createBitmap(i - (i % 4), i2 - (i2 % 4), Bitmap.Config.ARGB_8888);
        }
        this.f138n = str;
        this.f137m = 0;
        if (z != this.f133i) {
            this.f133i = z;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f133i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0) {
            return;
        }
        if (size == this.f127c && size2 == this.f128d) {
            return;
        }
        m205e(size, size2);
    }

    public BlurCoverLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlurCoverLayout(Context context) {
        this(context, null);
    }
}
