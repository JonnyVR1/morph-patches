package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import p149l.bq0;
import p149l.fa5;
import p149l.sq0;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedImageCompositor {

    /* JADX INFO: renamed from: a */
    public final bq0 f6438a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1615b f6439b;

    /* JADX INFO: renamed from: c */
    public final Paint f6440c;

    /* JADX INFO: renamed from: d */
    public final boolean f6441d;

    public enum FrameNeededResult {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$a */
    public static /* synthetic */ class C1614a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6442a;

        static {
            int[] iArr = new int[FrameNeededResult.values().length];
            f6442a = iArr;
            try {
                iArr[FrameNeededResult.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6442a[FrameNeededResult.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6442a[FrameNeededResult.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6442a[FrameNeededResult.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b */
    public interface InterfaceC1615b {
        /* JADX INFO: renamed from: a */
        void mo8403a(int i, Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        fa5<Bitmap> mo8404b(int i);
    }

    public AnimatedImageCompositor(bq0 bq0Var, boolean z, InterfaceC1615b interfaceC1615b) {
        this.f6438a = bq0Var;
        this.f6439b = interfaceC1615b;
        this.f6441d = z;
        Paint paint = new Paint();
        this.f6440c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    /* JADX INFO: renamed from: a */
    public final void m8395a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        int i = animatedDrawableFrameInfo.f6432b;
        int i2 = animatedDrawableFrameInfo.f6433c;
        canvas.drawRect(i, i2, i + animatedDrawableFrameInfo.f6434d, i2 + animatedDrawableFrameInfo.f6435e, this.f6440c);
    }

    /* JADX INFO: renamed from: b */
    public final FrameNeededResult m8396b(int i) {
        AnimatedDrawableFrameInfo frameInfo = this.f6438a.getFrameInfo(i);
        AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = frameInfo.f6437g;
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT) {
            return FrameNeededResult.REQUIRED;
        }
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
            return m8397c(frameInfo) ? FrameNeededResult.NOT_REQUIRED : FrameNeededResult.REQUIRED;
        }
        return disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS ? FrameNeededResult.SKIP : FrameNeededResult.ABORT;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8397c(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        return animatedDrawableFrameInfo.f6432b == 0 && animatedDrawableFrameInfo.f6433c == 0 && animatedDrawableFrameInfo.f6434d == this.f6438a.mo103305b() && animatedDrawableFrameInfo.f6435e == this.f6438a.mo103310g();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8398d(int i) {
        if (i == 0) {
            return true;
        }
        AnimatedDrawableFrameInfo frameInfo = this.f6438a.getFrameInfo(i);
        AnimatedDrawableFrameInfo frameInfo2 = this.f6438a.getFrameInfo(i - 1);
        if (frameInfo.f6436f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND && m8397c(frameInfo)) {
            return true;
        }
        return frameInfo2.f6437g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND && m8397c(frameInfo2);
    }

    /* JADX INFO: renamed from: e */
    public final void m8399e(Bitmap bitmap) {
        sq0 sq0VarMo103306c = this.f6438a.mo103306c();
        if (sq0VarMo103306c == null) {
            return;
        }
        sq0VarMo103306c.m185428c();
    }

    /* JADX INFO: renamed from: f */
    public final int m8400f(int i, Canvas canvas) {
        while (i >= 0) {
            int i2 = C1614a.f6442a[m8396b(i).ordinal()];
            if (i2 == 1) {
                AnimatedDrawableFrameInfo frameInfo = this.f6438a.getFrameInfo(i);
                fa5<Bitmap> fa5VarMo8404b = this.f6439b.mo8404b(i);
                if (fa5VarMo8404b != null) {
                    try {
                        canvas.drawBitmap(fa5VarMo8404b.m120155B(), 0.0f, 0.0f, (Paint) null);
                        if (frameInfo.f6437g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                            m8395a(canvas, frameInfo);
                        }
                        return i + 1;
                    } finally {
                        if (!this.f6441d) {
                            fa5VarMo8404b.close();
                        }
                    }
                }
                if (m8398d(i)) {
                    return i;
                }
                i--;
            } else {
                if (i2 == 2) {
                    return i + 1;
                }
                if (i2 == 3) {
                    return i;
                }
                i--;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void m8401g(int i, Bitmap bitmap) {
        this.f6438a.mo103311h(i, new Canvas(bitmap));
    }

    /* JADX INFO: renamed from: h */
    public void m8402h(int i, Bitmap bitmap) {
        bq0 bq0Var;
        if (this.f6441d) {
            m8401g(i, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        int iM8400f = !m8398d(i) ? m8400f(i - 1, canvas) : i;
        while (true) {
            bq0Var = this.f6438a;
            if (iM8400f >= i) {
                break;
            }
            AnimatedDrawableFrameInfo frameInfo = bq0Var.getFrameInfo(iM8400f);
            AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = frameInfo.f6437g;
            if (disposalMethod != AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS) {
                if (frameInfo.f6436f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
                    m8395a(canvas, frameInfo);
                }
                this.f6438a.mo103308e(iM8400f, canvas);
                this.f6439b.mo8403a(iM8400f, bitmap);
                if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                    m8395a(canvas, frameInfo);
                }
            }
            iM8400f++;
        }
        AnimatedDrawableFrameInfo frameInfo2 = bq0Var.getFrameInfo(i);
        if (frameInfo2.f6436f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            m8395a(canvas, frameInfo2);
        }
        this.f6438a.mo103308e(i, canvas);
        m8399e(bitmap);
    }
}
