package com.tencent.liteav.renderer;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.clevertap.android.sdk.Constants;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.renderer.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14184d {

    /* JADX INFO: renamed from: a */
    private TextureView f59765a;

    /* JADX INFO: renamed from: b */
    private Handler f59766b;

    /* JADX INFO: renamed from: c */
    private int f59767c;

    /* JADX INFO: renamed from: d */
    private int f59768d;

    /* JADX INFO: renamed from: e */
    private int f59769e = 640;

    /* JADX INFO: renamed from: f */
    private int f59770f = 480;

    /* JADX INFO: renamed from: g */
    private int f59771g = 0;

    /* JADX INFO: renamed from: h */
    private int f59772h = 0;

    /* JADX INFO: renamed from: i */
    private int f59773i = 1;

    /* JADX INFO: renamed from: j */
    private int f59774j = 0;

    /* JADX INFO: renamed from: k */
    private float f59775k = 1.0f;

    /* JADX INFO: renamed from: l */
    private int f59776l = 0;

    public C14184d(TextureView textureView) {
        this.f59767c = 0;
        this.f59768d = 0;
        this.f59765a = textureView;
        this.f59767c = textureView.getWidth();
        this.f59768d = textureView.getHeight();
        this.f59766b = new Handler(textureView.getContext().getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m83896c(int i, int i2) {
        int i3;
        int i4;
        if (this.f59765a == null || i == 0 || i2 == 0 || (i3 = this.f59767c) == 0 || (i4 = this.f59768d) == 0) {
            return;
        }
        double d = ((double) i2) / ((double) i);
        if (i4 > ((int) (((double) i3) * d))) {
            this.f59771g = i3;
            this.f59772h = (int) (((double) i3) * d);
        } else {
            this.f59771g = (int) (((double) i4) / d);
            this.f59772h = i4;
        }
        int i5 = this.f59771g;
        float f = (i3 - i5) / 2.0f;
        int i6 = this.f59772h;
        float f2 = (i4 - i6) / 2.0f;
        float f3 = i5 / i3;
        float f4 = i6 / i4;
        Matrix matrix = new Matrix();
        this.f59765a.getTransform(matrix);
        matrix.setScale(f3, f4);
        matrix.postTranslate(f, f2);
        this.f59765a.setTransform(matrix);
        this.f59765a.requestLayout();
    }

    /* JADX INFO: renamed from: a */
    public void m83899a(int i, int i2) {
        TXCLog.m82973w("TXCTextureViewWrapper", "vrender: set view size:" + i + Constants.SEPARATOR_COMMA + i2);
        this.f59767c = i;
        this.f59768d = i2;
        m83891a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[PHI: r8
      0x0033: PHI (r8v11 float) = (r8v7 float), (r8v17 float) binds: [B:34:0x0059, B:18:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035 A[PHI: r2
      0x0035: PHI (r2v7 float) = (r2v3 float), (r2v6 float), (r2v10 float) binds: [B:37:0x0068, B:34:0x0059, B:18:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public void m83900b(int i) {
        int i2;
        float f;
        float f2;
        int i3;
        this.f59773i = i;
        TextureView textureView = this.f59765a;
        if (textureView != null) {
            float f3 = 1.0f;
            if (i == 1) {
                int i4 = this.f59774j;
                if (i4 != 0 && i4 != 180 && (i4 == 270 || i4 == 90)) {
                    int i5 = this.f59771g;
                    if (i5 == 0 || (i3 = this.f59772h) == 0) {
                        return;
                    }
                    f = this.f59768d / i5;
                    f2 = this.f59767c / i3;
                    if (f > f2) {
                        f3 = f2;
                    } else {
                        f3 = f;
                    }
                }
            } else if (i == 0) {
                int i6 = this.f59771g;
                if (i6 == 0 || (i2 = this.f59772h) == 0) {
                    return;
                }
                int i7 = this.f59774j;
                if (i7 == 0 || i7 == 180) {
                    f = this.f59768d / i2;
                    float f4 = this.f59767c / i6;
                    if (f < f4) {
                        f3 = f4;
                    } else {
                        f3 = f;
                    }
                } else if (i7 == 270 || i7 == 90) {
                    f = this.f59768d / i6;
                    f2 = this.f59767c / i2;
                    if (f < f2) {
                        f3 = f2;
                    } else {
                        f3 = f;
                    }
                }
            }
            if (this.f59775k < 0.0f) {
                f3 = -f3;
            }
            textureView.setScaleX(f3);
            this.f59765a.setScaleY(Math.abs(f3));
            this.f59775k = f3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[PHI: r0
      0x0040: PHI (r0v6 float) = (r0v5 float), (r0v13 float), (r0v13 float) binds: [B:38:0x006d, B:26:0x0048, B:21:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX INFO: renamed from: d */
    public void m83903d(int i) {
        int i2;
        float f;
        int i3 = i % 360;
        this.f59774j = i3;
        TextureView textureView = this.f59765a;
        if (textureView != null) {
            float f2 = 1.0f;
            if (i3 == 0 || i3 == 180) {
                textureView.setRotation(360 - i3);
                int i4 = this.f59773i;
                if (i4 != 1 && i4 == 0) {
                    int i5 = this.f59771g;
                    if (i5 == 0 || (i2 = this.f59772h) == 0) {
                        return;
                    }
                    float f3 = this.f59768d / i2;
                    f = this.f59767c / i5;
                    if (f3 < f) {
                        f2 = f;
                    } else {
                        f2 = f3;
                    }
                }
            } else if (i3 == 270 || i3 == 90) {
                if (this.f59771g == 0 || this.f59772h == 0) {
                    return;
                }
                textureView.setRotation(360 - i3);
                float f4 = this.f59768d / this.f59771g;
                f = this.f59767c / this.f59772h;
                int i6 = this.f59773i;
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
            if (this.f59775k < 0.0f) {
                f2 = -f2;
            }
            this.f59765a.setScaleX(f2);
            this.f59765a.setScaleY(Math.abs(f2));
            this.f59775k = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83898a(final int i) {
        try {
            this.f59766b.post(new Runnable() { // from class: com.tencent.liteav.renderer.d.1
                @Override // java.lang.Runnable
                public void run() {
                    C14184d.this.m83900b(i);
                }
            });
        } catch (Exception e) {
            TXCLog.m82967e("TXCTextureViewWrapper", "set render mode failed", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83891a() {
        try {
            m83893a(new Runnable() { // from class: com.tencent.liteav.renderer.d.3
                @Override // java.lang.Runnable
                public void run() {
                    C14184d c14184d = C14184d.this;
                    c14184d.m83896c(c14184d.f59769e, C14184d.this.f59770f);
                    C14184d c14184d2 = C14184d.this;
                    c14184d2.m83900b(c14184d2.f59773i);
                    C14184d c14184d3 = C14184d.this;
                    c14184d3.m83903d(c14184d3.f59774j);
                }
            });
        } catch (Exception e) {
            TXCLog.m82967e("TXCTextureViewWrapper", "adjust video size failed.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83893a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f59766b.post(runnable);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m83902c(final int i) {
        try {
            this.f59766b.post(new Runnable() { // from class: com.tencent.liteav.renderer.d.2
                @Override // java.lang.Runnable
                public void run() {
                    C14184d.this.m83903d(i);
                }
            });
        } catch (Exception e) {
            TXCLog.m82967e("TXCTextureViewWrapper", "set render rotation failed.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83901b(int i, int i2) {
        TXCLog.m82973w("TXCTextureViewWrapper", "vrender: set video size:" + i + Constants.SEPARATOR_COMMA + i2);
        this.f59769e = i;
        this.f59770f = i2;
        m83891a();
    }
}
