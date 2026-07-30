package com.p046p1.mobile.putong.core.p053ui.messages.view;

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
import com.p046p1.mobile.putong.core.p053ui.messages.view.BlurCoverLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.d43;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class BlurCoverLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Bitmap f32303a;

    /* JADX INFO: renamed from: b */
    public Bitmap f32304b;

    /* JADX INFO: renamed from: c */
    public int f32305c;

    /* JADX INFO: renamed from: d */
    public int f32306d;

    /* JADX INFO: renamed from: e */
    public float f32307e;

    /* JADX INFO: renamed from: f */
    public Matrix f32308f;

    /* JADX INFO: renamed from: g */
    public Paint f32309g;

    /* JADX INFO: renamed from: h */
    public Canvas f32310h;

    /* JADX INFO: renamed from: i */
    public boolean f32311i;

    /* JADX INFO: renamed from: j */
    public Rect f32312j;

    /* JADX INFO: renamed from: k */
    public RectF f32313k;

    /* JADX INFO: renamed from: l */
    public c4g0 f32314l;

    /* JADX INFO: renamed from: m */
    public int f32315m;

    /* JADX INFO: renamed from: n */
    public String f32316n;

    public BlurCoverLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32307e = 0.1f;
        this.f32311i = false;
        this.f32315m = 0;
        this.f32316n = "";
        Matrix matrix = new Matrix();
        this.f32308f = matrix;
        float f = this.f32307e;
        matrix.setScale(f, f);
        Paint paint = new Paint();
        this.f32309g = paint;
        paint.setAntiAlias(true);
        this.f32309g.setFilterBitmap(true);
        this.f32312j = new Rect(0, 0, 0, 0);
        this.f32313k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ j760 m49785c(j760 j760Var) {
        d43.m109969a((Bitmap) j760Var.f116564a, 5, false);
        return j760Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m49786d(final String str) {
        this.f32314l = C22306c.fromCallable(new Callable() { // from class: l.e43
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f89245a.m49788f(str);
            }
        }).map(new w9j() { // from class: l.f43
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return BlurCoverLayout.m49785c((j760) obj);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.g43
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100538a.m49789g((j760) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!NullChecker.m81303a(this.f32303a) || !this.f32311i) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f32315m != 2) {
            this.f32310h.drawColor(-1);
            super.dispatchDraw(this.f32310h);
            mkd0.m154992z(this.f32314l);
            m49786d(this.f32316n);
        }
        if (this.f32315m == 2) {
            this.f32315m = 0;
        }
        canvas.drawBitmap(this.f32304b, this.f32312j, this.f32313k, this.f32309g);
        this.f32315m = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m49787e(int i, int i2) {
        this.f32305c = i;
        this.f32306d = i2;
        float f = i;
        float f2 = this.f32307e;
        int i3 = (int) (f * f2);
        float f3 = i2;
        int i4 = (int) (f2 * f3);
        int i5 = i3 - (i3 % 4);
        int i6 = i4 - (i4 % 4);
        if (i5 <= 0 || i6 <= 0) {
            CrashHelper.m81296c(new IllegalArgumentException("BlurCoverLayout w = " + i + "  h = " + i2 + "  scale = " + this.f32307e));
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f32303a = Bitmap.createBitmap(i5, i6, config);
        this.f32304b = Bitmap.createBitmap(i5, i6, config);
        Canvas canvas = new Canvas(this.f32303a);
        this.f32310h = canvas;
        canvas.setMatrix(this.f32308f);
        this.f32312j.set(0, 0, i5, i6);
        this.f32313k.set(0.0f, 0.0f, f, f3);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ j760 m49788f(String str) throws Exception {
        return new j760(this.f32303a.copy(Bitmap.Config.ARGB_8888, true), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49789g(j760 j760Var) {
        if (!TextUtils.equals((CharSequence) j760Var.f116565b, this.f32316n)) {
            this.f32315m = 0;
            postInvalidate();
        } else {
            this.f32315m = 2;
            this.f32304b = ((Bitmap) j760Var.f116564a).copy(Bitmap.Config.ARGB_8888, true);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m49790h(boolean z, String str) {
        if (z && NullChecker.m81303a(this.f32304b) && this.f32305c > 0 && this.f32306d > 0 && !TextUtils.equals(this.f32316n, str)) {
            float f = this.f32305c;
            float f2 = this.f32307e;
            int i = (int) (f * f2);
            int i2 = (int) (this.f32306d * f2);
            this.f32304b = Bitmap.createBitmap(i - (i % 4), i2 - (i2 % 4), Bitmap.Config.ARGB_8888);
        }
        this.f32316n = str;
        this.f32315m = 0;
        if (z != this.f32311i) {
            this.f32311i = z;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f32311i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0) {
            return;
        }
        if (size == this.f32305c && size2 == this.f32306d) {
            return;
        }
        m49787e(size, size2);
    }

    public BlurCoverLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlurCoverLayout(Context context) {
        this(context, null);
    }
}
