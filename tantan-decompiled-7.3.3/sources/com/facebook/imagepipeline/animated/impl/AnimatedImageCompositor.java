package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import p153l.fb5;
import p153l.oq0;
import p153l.xp0;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedImageCompositor {

    /* JADX INFO: renamed from: a */
    public final xp0 f6475a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1638b f6476b;

    /* JADX INFO: renamed from: c */
    public final Paint f6477c;

    /* JADX INFO: renamed from: d */
    public final boolean f6478d;

    public enum FrameNeededResult {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$a */
    public static /* synthetic */ class C1637a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6479a;

        static {
            int[] iArr = new int[FrameNeededResult.values().length];
            f6479a = iArr;
            try {
                iArr[FrameNeededResult.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6479a[FrameNeededResult.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6479a[FrameNeededResult.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6479a[FrameNeededResult.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b */
    public interface InterfaceC1638b {
        /* JADX INFO: renamed from: a */
        void mo8457a(int i, Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        fb5<Bitmap> mo8458b(int i);
    }

    public AnimatedImageCompositor(xp0 xp0Var, boolean z, InterfaceC1638b interfaceC1638b) {
        this.f6475a = xp0Var;
        this.f6476b = interfaceC1638b;
        this.f6478d = z;
        Paint paint = new Paint();
        this.f6477c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    /* JADX INFO: renamed from: a */
    public final void m8449a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        int i = animatedDrawableFrameInfo.f6469b;
        int i2 = animatedDrawableFrameInfo.f6470c;
        canvas.drawRect(i, i2, i + animatedDrawableFrameInfo.f6471d, i2 + animatedDrawableFrameInfo.f6472e, this.f6477c);
    }

    /* JADX INFO: renamed from: b */
    public final FrameNeededResult m8450b(int i) {
        AnimatedDrawableFrameInfo frameInfo = this.f6475a.getFrameInfo(i);
        AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = frameInfo.f6474g;
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT) {
            return FrameNeededResult.REQUIRED;
        }
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
            return m8451c(frameInfo) ? FrameNeededResult.NOT_REQUIRED : FrameNeededResult.REQUIRED;
        }
        return disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS ? FrameNeededResult.SKIP : FrameNeededResult.ABORT;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8451c(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        return animatedDrawableFrameInfo.f6469b == 0 && animatedDrawableFrameInfo.f6470c == 0 && animatedDrawableFrameInfo.f6471d == this.f6475a.mo99391b() && animatedDrawableFrameInfo.f6472e == this.f6475a.mo99396g();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8452d(int i) {
        if (i == 0) {
            return true;
        }
        AnimatedDrawableFrameInfo frameInfo = this.f6475a.getFrameInfo(i);
        AnimatedDrawableFrameInfo frameInfo2 = this.f6475a.getFrameInfo(i - 1);
        if (frameInfo.f6473f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND && m8451c(frameInfo)) {
            return true;
        }
        return frameInfo2.f6474g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND && m8451c(frameInfo2);
    }

    /* JADX INFO: renamed from: e */
    public final void m8453e(Bitmap bitmap) {
        oq0 oq0VarMo99392c = this.f6475a.mo99392c();
        if (oq0VarMo99392c == null) {
            return;
        }
        oq0VarMo99392c.m168781c();
    }

    /* JADX INFO: renamed from: f */
    public final int m8454f(int i, Canvas canvas) {
        while (i >= 0) {
            int i2 = C1637a.f6479a[m8450b(i).ordinal()];
            if (i2 == 1) {
                AnimatedDrawableFrameInfo frameInfo = this.f6475a.getFrameInfo(i);
                fb5<Bitmap> fb5VarMo8458b = this.f6476b.mo8458b(i);
                if (fb5VarMo8458b != null) {
                    try {
                        canvas.drawBitmap(fb5VarMo8458b.m124875B(), 0.0f, 0.0f, (Paint) null);
                        if (frameInfo.f6474g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                            m8449a(canvas, frameInfo);
                        }
                        return i + 1;
                    } finally {
                        if (!this.f6478d) {
                            fb5VarMo8458b.close();
                        }
                    }
                }
                if (m8452d(i)) {
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
    public void m8455g(int i, Bitmap bitmap) {
        this.f6475a.mo99397h(i, new Canvas(bitmap));
    }

    /* JADX INFO: renamed from: h */
    public void m8456h(int i, Bitmap bitmap) {
        xp0 xp0Var;
        if (this.f6478d) {
            m8455g(i, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        int iM8454f = !m8452d(i) ? m8454f(i - 1, canvas) : i;
        while (true) {
            xp0Var = this.f6475a;
            if (iM8454f >= i) {
                break;
            }
            AnimatedDrawableFrameInfo frameInfo = xp0Var.getFrameInfo(iM8454f);
            AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = frameInfo.f6474g;
            if (disposalMethod != AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS) {
                if (frameInfo.f6473f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
                    m8449a(canvas, frameInfo);
                }
                this.f6475a.mo99394e(iM8454f, canvas);
                this.f6476b.mo8457a(iM8454f, bitmap);
                if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                    m8449a(canvas, frameInfo);
                }
            }
            iM8454f++;
        }
        AnimatedDrawableFrameInfo frameInfo2 = xp0Var.getFrameInfo(i);
        if (frameInfo2.f6473f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            m8449a(canvas, frameInfo2);
        }
        this.f6475a.mo99394e(i, canvas);
        m8453e(bitmap);
    }
}
