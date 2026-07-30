package com.tencent.liteav.renderer;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.clevertap.android.sdk.Constants;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.renderer.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14347d {

    /* JADX INFO: renamed from: a */
    private TextureView f60613a;

    /* JADX INFO: renamed from: b */
    private Handler f60614b;

    /* JADX INFO: renamed from: c */
    private int f60615c;

    /* JADX INFO: renamed from: d */
    private int f60616d;

    /* JADX INFO: renamed from: e */
    private int f60617e = 640;

    /* JADX INFO: renamed from: f */
    private int f60618f = 480;

    /* JADX INFO: renamed from: g */
    private int f60619g = 0;

    /* JADX INFO: renamed from: h */
    private int f60620h = 0;

    /* JADX INFO: renamed from: i */
    private int f60621i = 1;

    /* JADX INFO: renamed from: j */
    private int f60622j = 0;

    /* JADX INFO: renamed from: k */
    private float f60623k = 1.0f;

    /* JADX INFO: renamed from: l */
    private int f60624l = 0;

    public C14347d(TextureView textureView) {
        this.f60615c = 0;
        this.f60616d = 0;
        this.f60613a = textureView;
        this.f60615c = textureView.getWidth();
        this.f60616d = textureView.getHeight();
        this.f60614b = new Handler(textureView.getContext().getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m85079c(int i, int i2) {
        int i3;
        int i4;
        if (this.f60613a == null || i == 0 || i2 == 0 || (i3 = this.f60615c) == 0 || (i4 = this.f60616d) == 0) {
            return;
        }
        double d = ((double) i2) / ((double) i);
        if (i4 > ((int) (((double) i3) * d))) {
            this.f60619g = i3;
            this.f60620h = (int) (((double) i3) * d);
        } else {
            this.f60619g = (int) (((double) i4) / d);
            this.f60620h = i4;
        }
        int i5 = this.f60619g;
        float f = (i3 - i5) / 2.0f;
        int i6 = this.f60620h;
        float f2 = (i4 - i6) / 2.0f;
        float f3 = i5 / i3;
        float f4 = i6 / i4;
        Matrix matrix = new Matrix();
        this.f60613a.getTransform(matrix);
        matrix.setScale(f3, f4);
        matrix.postTranslate(f, f2);
        this.f60613a.setTransform(matrix);
        this.f60613a.requestLayout();
    }

    /* JADX INFO: renamed from: a */
    public void m85082a(int i, int i2) {
        TXCLog.m84156w("TXCTextureViewWrapper", "vrender: set view size:" + i + Constants.SEPARATOR_COMMA + i2);
        this.f60615c = i;
        this.f60616d = i2;
        m85074a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[PHI: r8
      0x0033: PHI (r8v11 float) = (r8v7 float), (r8v17 float) binds: [B:34:0x0059, B:18:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035 A[PHI: r2
      0x0035: PHI (r2v7 float) = (r2v3 float), (r2v6 float), (r2v10 float) binds: [B:37:0x0068, B:34:0x0059, B:18:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public void m85083b(int i) {
        int i2;
        float f;
        float f2;
        int i3;
        this.f60621i = i;
        TextureView textureView = this.f60613a;
        if (textureView != null) {
            float f3 = 1.0f;
            if (i == 1) {
                int i4 = this.f60622j;
                if (i4 != 0 && i4 != 180 && (i4 == 270 || i4 == 90)) {
                    int i5 = this.f60619g;
                    if (i5 == 0 || (i3 = this.f60620h) == 0) {
                        return;
                    }
                    f = this.f60616d / i5;
                    f2 = this.f60615c / i3;
                    if (f > f2) {
                        f3 = f2;
                    } else {
                        f3 = f;
                    }
                }
            } else if (i == 0) {
                int i6 = this.f60619g;
                if (i6 == 0 || (i2 = this.f60620h) == 0) {
                    return;
                }
                int i7 = this.f60622j;
                if (i7 == 0 || i7 == 180) {
                    f = this.f60616d / i2;
                    float f4 = this.f60615c / i6;
                    if (f < f4) {
                        f3 = f4;
                    } else {
                        f3 = f;
                    }
                } else if (i7 == 270 || i7 == 90) {
                    f = this.f60616d / i6;
                    f2 = this.f60615c / i2;
                    if (f < f2) {
                        f3 = f2;
                    } else {
                        f3 = f;
                    }
                }
            }
            if (this.f60623k < 0.0f) {
                f3 = -f3;
            }
            textureView.setScaleX(f3);
            this.f60613a.setScaleY(Math.abs(f3));
            this.f60623k = f3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[PHI: r0
      0x0040: PHI (r0v6 float) = (r0v5 float), (r0v13 float), (r0v13 float) binds: [B:38:0x006d, B:26:0x0048, B:21:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX INFO: renamed from: d */
    public void m85086d(int i) {
        int i2;
        float f;
        int i3 = i % 360;
        this.f60622j = i3;
        TextureView textureView = this.f60613a;
        if (textureView != null) {
            float f2 = 1.0f;
            if (i3 == 0 || i3 == 180) {
                textureView.setRotation(360 - i3);
                int i4 = this.f60621i;
                if (i4 != 1 && i4 == 0) {
                    int i5 = this.f60619g;
                    if (i5 == 0 || (i2 = this.f60620h) == 0) {
                        return;
                    }
                    float f3 = this.f60616d / i2;
                    f = this.f60615c / i5;
                    if (f3 < f) {
                        f2 = f;
                    } else {
                        f2 = f3;
                    }
                }
            } else if (i3 == 270 || i3 == 90) {
                if (this.f60619g == 0 || this.f60620h == 0) {
                    return;
                }
                textureView.setRotation(360 - i3);
                float f4 = this.f60616d / this.f60619g;
                f = this.f60615c / this.f60620h;
                int i6 = this.f60621i;
                if (i6 == 1) {
                    if (f4 > f) {
                        f2 = f;
                    } else {
                        f2 = f4;
                    }
                } else if (i6 == 0) {
                    if (f4 < f) {
                        f2 = f;
                    } else {
                        f2 = f4;
                    }
                }
            }
            if (this.f60623k < 0.0f) {
                f2 = -f2;
            }
            this.f60613a.setScaleX(f2);
            this.f60613a.setScaleY(Math.abs(f2));
            this.f60623k = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85081a(final int i) {
        try {
            this.f60614b.post(new Runnable() { // from class: com.tencent.liteav.renderer.d.1
                @Override // java.lang.Runnable
                public void run() {
                    C14347d.this.m85083b(i);
                }
            });
        } catch (Exception e) {
            TXCLog.m84150e("TXCTextureViewWrapper", "set render mode failed", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85074a() {
        try {
            m85076a(new Runnable() { // from class: com.tencent.liteav.renderer.d.3
                @Override // java.lang.Runnable
                public void run() {
                    C14347d c14347d = C14347d.this;
                    c14347d.m85079c(c14347d.f60617e, C14347d.this.f60618f);
                    C14347d c14347d2 = C14347d.this;
                    c14347d2.m85083b(c14347d2.f60621i);
                    C14347d c14347d3 = C14347d.this;
                    c14347d3.m85086d(c14347d3.f60622j);
                }
            });
        } catch (Exception e) {
            TXCLog.m84150e("TXCTextureViewWrapper", "adjust video size failed.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85076a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f60614b.post(runnable);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m85085c(final int i) {
        try {
            this.f60614b.post(new Runnable() { // from class: com.tencent.liteav.renderer.d.2
                @Override // java.lang.Runnable
                public void run() {
                    C14347d.this.m85086d(i);
                }
            });
        } catch (Exception e) {
            TXCLog.m84150e("TXCTextureViewWrapper", "set render rotation failed.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m85084b(int i, int i2) {
        TXCLog.m84156w("TXCTextureViewWrapper", "vrender: set video size:" + i + Constants.SEPARATOR_COMMA + i2);
        this.f60617e = i;
        this.f60618f = i2;
        m85074a();
    }
}
