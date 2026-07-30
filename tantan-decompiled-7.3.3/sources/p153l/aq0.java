package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;

/* JADX INFO: loaded from: classes.dex */
public class aq0 implements xp0 {

    /* JADX INFO: renamed from: a */
    public final cq0 f72767a;

    /* JADX INFO: renamed from: b */
    public final oq0 f72768b;

    /* JADX INFO: renamed from: c */
    public final jq0 f72769c;

    /* JADX INFO: renamed from: d */
    public final Rect f72770d;

    /* JADX INFO: renamed from: e */
    public final int[] f72771e;

    /* JADX INFO: renamed from: f */
    public final int[] f72772f;

    /* JADX INFO: renamed from: g */
    public final int f72773g;

    /* JADX INFO: renamed from: h */
    public final AnimatedDrawableFrameInfo[] f72774h;

    /* JADX INFO: renamed from: i */
    public final Rect f72775i = new Rect();

    /* JADX INFO: renamed from: j */
    public final Rect f72776j = new Rect();

    /* JADX INFO: renamed from: k */
    public final boolean f72777k;

    /* JADX INFO: renamed from: l */
    public final Paint f72778l;

    /* JADX INFO: renamed from: m */
    public Bitmap f72779m;

    public aq0(cq0 cq0Var, oq0 oq0Var, Rect rect, boolean z) {
        this.f72767a = cq0Var;
        this.f72768b = oq0Var;
        jq0 jq0VarM168782d = oq0Var.m168782d();
        this.f72769c = jq0VarM168782d;
        int[] frameDurations = jq0VarM168782d.getFrameDurations();
        this.f72771e = frameDurations;
        cq0Var.m111854a(frameDurations);
        this.f72773g = cq0Var.m111856c(frameDurations);
        this.f72772f = cq0Var.m111855b(frameDurations);
        this.f72770d = m99389j(jq0VarM168782d, rect);
        this.f72777k = z;
        this.f72774h = new AnimatedDrawableFrameInfo[jq0VarM168782d.getFrameCount()];
        for (int i = 0; i < this.f72769c.getFrameCount(); i++) {
            this.f72774h[i] = this.f72769c.getFrameInfo(i);
        }
        Paint paint = new Paint();
        this.f72778l = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* JADX INFO: renamed from: j */
    public static Rect m99389j(jq0 jq0Var, Rect rect) {
        return rect == null ? new Rect(0, 0, jq0Var.getWidth(), jq0Var.getHeight()) : new Rect(0, 0, Math.min(rect.width(), jq0Var.getWidth()), Math.min(rect.height(), jq0Var.getHeight()));
    }

    @Override // p153l.xp0
    /* JADX INFO: renamed from: a */
    public int mo99390a(int i) {
        return this.f72771e[i];
    }

    @Override // p153l.xp0
    /* JADX INFO: renamed from: b */
    public int mo99391b() {
        return this.f72770d.width();
    }

    @Override // p153l.xp0
    /* JADX INFO: renamed from: c */
    public oq0 mo99392c() {
        return this.f72768b;
    }

    @Override // p153l.xp0
    /* JADX INFO: renamed from: d */
    public int mo99393d() {
        return this.f72773g;
    }

    @Override // p153l.xp0
    /* JADX INFO: renamed from: e */
    public void mo99394e(int i, Canvas canvas) {
        nq0 frame = this.f72769c.getFrame(i);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (this.f72769c.doesRenderSupportScaling()) {
                    m99402n(canvas, frame);
                } else {
                    m99401m(canvas, frame);
                }
            }
        } finally {
            frame.dispose();
        }
    }

    @Override // p153l.xp0
    /* JADX INFO: renamed from: f */
    public xp0 mo99395f(Rect rect) {
        return m99389j(this.f72769c, rect).equals(this.f72770d) ? this : new aq0(this.f72767a, this.f72768b, rect, this.f72777k);
    }

    @Override // p153l.xp0
    /* JADX INFO: renamed from: g */
    public int mo99396g() {
        return this.f72770d.height();
    }

    @Override // p153l.xp0
    public int getFrameCount() {
        return this.f72769c.getFrameCount();
    }

    @Override // p153l.xp0
    public AnimatedDrawableFrameInfo getFrameInfo(int i) {
        return this.f72774h[i];
    }

    @Override // p153l.xp0
    public int getHeight() {
        return this.f72769c.getHeight();
    }

    @Override // p153l.xp0
    public int getLoopCount() {
        return this.f72769c.getLoopCount();
    }

    @Override // p153l.xp0
    public int getWidth() {
        return this.f72769c.getWidth();
    }

    @Override // p153l.xp0
    /* JADX INFO: renamed from: h */
    public void mo99397h(int i, Canvas canvas) {
        nq0 frame = this.f72769c.getFrame(i);
        AnimatedDrawableFrameInfo frameInfo = this.f72769c.getFrameInfo(i);
        AnimatedDrawableFrameInfo frameInfo2 = i == 0 ? null : this.f72769c.getFrameInfo(i - 1);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (this.f72769c.doesRenderSupportScaling()) {
                    m99404p(canvas, frame, frameInfo, frameInfo2);
                } else {
                    m99403o(canvas, frame, frameInfo, frameInfo2);
                }
            }
        } finally {
            frame.dispose();
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m99398i() {
        Bitmap bitmap = this.f72779m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f72779m = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m99399k(Canvas canvas, float f, float f2, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        if (animatedDrawableFrameInfo.f6474g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
            int iCeil = (int) Math.ceil(animatedDrawableFrameInfo.f6471d * f);
            int iCeil2 = (int) Math.ceil(animatedDrawableFrameInfo.f6472e * f2);
            int iCeil3 = (int) Math.ceil(animatedDrawableFrameInfo.f6469b * f);
            int iCeil4 = (int) Math.ceil(animatedDrawableFrameInfo.f6470c * f2);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.f72778l);
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized Bitmap m99400l(int i, int i2) {
        try {
            Bitmap bitmap = this.f72779m;
            if (bitmap != null && (bitmap.getWidth() < i || this.f72779m.getHeight() < i2)) {
                m99398i();
            }
            if (this.f72779m == null) {
                this.f72779m = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            this.f72779m.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.f72779m;
    }

    /* JADX INFO: renamed from: m */
    public final void m99401m(Canvas canvas, nq0 nq0Var) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        if (this.f72777k) {
            float fMax = Math.max(nq0Var.getWidth() / Math.min(nq0Var.getWidth(), canvas.getWidth()), nq0Var.getHeight() / Math.min(nq0Var.getHeight(), canvas.getHeight()));
            width = (int) (nq0Var.getWidth() / fMax);
            height = (int) (nq0Var.getHeight() / fMax);
            xOffset = (int) (nq0Var.getXOffset() / fMax);
            yOffset = (int) (nq0Var.getYOffset() / fMax);
        } else {
            width = nq0Var.getWidth();
            height = nq0Var.getHeight();
            xOffset = nq0Var.getXOffset();
            yOffset = nq0Var.getYOffset();
        }
        synchronized (this) {
            Bitmap bitmapM99400l = m99400l(width, height);
            this.f72779m = bitmapM99400l;
            nq0Var.renderFrame(width, height, bitmapM99400l);
            canvas.save();
            canvas.translate(xOffset, yOffset);
            canvas.drawBitmap(this.f72779m, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m99402n(Canvas canvas, nq0 nq0Var) {
        double dWidth = ((double) this.f72770d.width()) / ((double) this.f72769c.getWidth());
        double dHeight = ((double) this.f72770d.height()) / ((double) this.f72769c.getHeight());
        int iRound = (int) Math.round(((double) nq0Var.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) nq0Var.getHeight()) * dHeight);
        int xOffset = (int) (((double) nq0Var.getXOffset()) * dWidth);
        int yOffset = (int) (((double) nq0Var.getYOffset()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f72770d.width();
                int iHeight = this.f72770d.height();
                m99400l(iWidth, iHeight);
                Bitmap bitmap = this.f72779m;
                if (bitmap != null) {
                    nq0Var.renderFrame(iRound, iRound2, bitmap);
                }
                this.f72775i.set(0, 0, iWidth, iHeight);
                this.f72776j.set(xOffset, yOffset, iWidth + xOffset, iHeight + yOffset);
                Bitmap bitmap2 = this.f72779m;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f72775i, this.f72776j, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m99403o(Canvas canvas, nq0 nq0Var, AnimatedDrawableFrameInfo animatedDrawableFrameInfo, AnimatedDrawableFrameInfo animatedDrawableFrameInfo2) {
        Rect rect = this.f72770d;
        if (rect == null || rect.width() <= 0 || this.f72770d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f72770d.width();
        if (animatedDrawableFrameInfo2 != null) {
            m99399k(canvas, width, width, animatedDrawableFrameInfo2);
        }
        int width2 = nq0Var.getWidth();
        int height = nq0Var.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i = (int) (width2 * width);
        int i2 = (int) (height * width);
        int xOffset = (int) (nq0Var.getXOffset() * width);
        int yOffset = (int) (nq0Var.getYOffset() * width);
        Rect rect3 = new Rect(xOffset, yOffset, i + xOffset, i2 + yOffset);
        if (animatedDrawableFrameInfo.f6473f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            canvas.drawRect(rect3, this.f72778l);
        }
        synchronized (this) {
            Bitmap bitmapM99400l = m99400l(width2, height);
            nq0Var.renderFrame(width2, height, bitmapM99400l);
            canvas.drawBitmap(bitmapM99400l, rect2, rect3, (Paint) null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m99404p(Canvas canvas, nq0 nq0Var, AnimatedDrawableFrameInfo animatedDrawableFrameInfo, AnimatedDrawableFrameInfo animatedDrawableFrameInfo2) {
        float f;
        float f2;
        float f3;
        float f4;
        int width = this.f72769c.getWidth();
        int height = this.f72769c.getHeight();
        float f5 = width;
        float f6 = height;
        int width2 = nq0Var.getWidth();
        int height2 = nq0Var.getHeight();
        int xOffset = nq0Var.getXOffset();
        int yOffset = nq0Var.getYOffset();
        if (f5 > canvas.getWidth() || f6 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f7 = f5 / f6;
            if (iMin > iMin2) {
                f2 = iMin;
                f = f2 / f7;
            } else {
                f = iMin2;
                f2 = f * f7;
            }
            f3 = f2 / f5;
            f4 = f / f6;
            width2 = (int) Math.ceil(nq0Var.getWidth() * f3);
            height2 = (int) Math.ceil(nq0Var.getHeight() * f4);
            xOffset = (int) Math.ceil(nq0Var.getXOffset() * f3);
            yOffset = (int) Math.ceil(nq0Var.getYOffset() * f4);
        } else {
            f3 = 1.0f;
            f4 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(xOffset, yOffset, xOffset + width2, yOffset + height2);
        if (animatedDrawableFrameInfo2 != null) {
            m99399k(canvas, f3, f4, animatedDrawableFrameInfo2);
        }
        if (animatedDrawableFrameInfo.f6473f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            canvas.drawRect(rect2, this.f72778l);
        }
        synchronized (this) {
            Bitmap bitmapM99400l = m99400l(width2, height2);
            nq0Var.renderFrame(width2, height2, bitmapM99400l);
            canvas.drawBitmap(bitmapM99400l, rect, rect2, (Paint) null);
        }
    }
}
